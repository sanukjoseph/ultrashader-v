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
HRP_26_1_Upgrade\
├── PRIME_SERVICES_XSD
│   ├── connector-cobpolicy
│   │   └── cobPolicy.xsd
│   ├── connector-codeentrylookup
│   │   └── codeentrylookup.xsd
│   ├── connector-common-schema
│   │   ├── base-types.xsd
│   │   ├── iso3166-country-code.xsd
│   │   ├── match-input.xsd
│   │   ├── phone-number.xsd
│   │   └── us-state-code.xsd
│   ├── connector-enrollment
│   │   ├── enrollment-lookup.xsd
│   │   ├── enrollment.xsd
│   │   ├── membership.xsd
│   │   └── subscription.xsd
│   ├── connector-enrollmentsparse
│   │   ├── enrollment-sparse-lookup.xsd
│   │   ├── enrollment-sparse-response.xsd
│   │   ├── enrollment-sparse.xsd
│   │   ├── enrollment-types.xsd
│   │   ├── membership-sparse.xsd
│   │   └── subscription-sparse.xsd
│   ├── connector-medicarehicn
│   │   └── MedicareHICNInfo.xsd
│   ├── connector-membercomplianceprogram
│   │   └── memberComplianceProgram.xsd
│   ├── connector-memberfactors
│   │   └── memberFactors.xsd
│   ├── connector-payeebankaccounts
│   │   └── payeeBankAccounts.xsd
│   ├── connector-providerlookup
│   │   └── providerlookup.xsd
│   ├── connector-subsidy
│   │   └── subsidies.xsd
│   ├── connector-supplierlocationlookup
│   │   └── supplierlocationlookup.xsd
│   └── membercarereserve.xsd
├── WRAPPER_XSD
│   ├── enrollment-sparse-wrapper.xsd
│   ├── header.xsd
│   ├── inbound_enrollment_request_batch - Copy.xsd
│   ├── inbound_enrollment_request_batch.xsd
│   ├── inbound_enrollment_response_batch.xsd
│   └── membership-sparse-wrapper.xsd
└── wsdl
    ├── CodeEntryLookupCore.wsdl
    ├── EnrollmentSparseCore.wsdl
    ├── EnrollmentSparseLookup.wsdl
    ├── PractitionerLookupCore.wsdl
    ├── SupplierLocationLookup.wsdl
    └── SupplierLookupCore.wsdl

<file path="PRIME_SERVICES_XSD/connector-cobpolicy/cobPolicy.xsd">
<?xml version="1.0" encoding="utf-8"?>
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns="http://www.healthedge.com/connector/schema/cobpolicy"
xmlns:tns="http://www.healthedge.com/connector/schema/cobpolicy"
xmlns:base="http://www.healthedge.com/connector/schema/basetypes"
targetNamespace="http://www.healthedge.com/connector/schema/cobpolicy"
elementFormDefault="unqualified" version="4.1">
<xs:import namespace="http://www.healthedge.com/connector/schema/basetypes" schemaLocation="../connector-common-schema/base-types.xsd"/>
<xs:element name="cobPolicyList" type="COBPolicyListType"/>
<xs:element name="cobPolicy" type="COBPolicyType"/>
<xs:element name="cobPolicyResponse" type="COBPolicyResponseType"/>
<xs:complexType name="COBPolicyResponseType">
<xs:complexContent>
<xs:extension base="base:HealthRulesResourceType">
<xs:sequence>
<xs:element name="memberHccID" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="status" type="base:ServiceStatusType" minOccurs="1" maxOccurs="1"/>
<xs:element name="cobPolicy" minOccurs="0" maxOccurs="unbounded">
<xs:complexType>
<xs:sequence>
<xs:element name="cobPolicyId" type="base:String300Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="groupNumber" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="transactionType" type="base:TransactionType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="errors" type="base:ErrorsType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:complexType name="COBPolicyListType">
<xs:sequence>
<xs:element name="memberHccID" type="xs:string" minOccurs="1" maxOccurs="1"/>
<xs:element name="cobPolicy" type="COBPolicyType" minOccurs="1" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="COBPolicyType">
<xs:complexContent>
<xs:extension base="base:HealthRulesResourceType">
<xs:group ref="COBPolicyGroup"/>
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:group name="COBPolicyGroup">
<xs:sequence>
<xs:element name="cobPolicyIdentifier" type="xs:int" minOccurs="0" maxOccurs="1"/>
<xs:element name="cobPolicyId" type="base:String300Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="leadSourceForOtherInsuranceCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
<xs:element name="relationshipToSubscriberDefinitionReference" type="base:ReferenceType" minOccurs="0" maxOccurs="1"/>
<xs:element name="otherInsuranceCompanyName" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="policyType" type="base:OIPolicyTypeDomainType" minOccurs="0" maxOccurs="1"/>
<xs:element name="courtOrderedCoverage" type="xs:boolean" minOccurs="0" maxOccurs="1"/>
<xs:element name="policyHolderName" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="benefitPlanName" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="groupNumber" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="memberId" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="benefitPlanTypeCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
<xs:element name="dateRanges" type="COBPolicyDateRangeType" minOccurs="1" maxOccurs="unbounded" />
<xs:element name="subscriberIdList" type="base:IdentificationNumberType" minOccurs="0" maxOccurs="unbounded" />
<xs:element name="subscriberName" type="base:PersonNameType" minOccurs="0" maxOccurs="1"/>
<xs:element name="subscriberDOB" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="subscriberGender" type="base:GenderCodeType" minOccurs="0" maxOccurs="1"/>
<xs:element name="rxInfo" type="RxInfoType" minOccurs="0" maxOccurs="1"/>
<xs:element name="correspondenceInfo" type="CorrespondenceInformationType" minOccurs="0" maxOccurs="1"/>
<xs:element name="carrierIds" type="base:IdentificationNumberType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="serviceCategoryList" type="ServiceCategoryList" minOccurs="0"/>
</xs:sequence>
</xs:group>
<xs:complexType name="COBPolicyDateRangeType">
<xs:sequence>
<xs:element name="startDate" type="xs:date" minOccurs="1" maxOccurs="1"/>
<xs:element name="endDate" type="xs:date" minOccurs="1" maxOccurs="1"/>
<xs:element name="responsibilitySequenceCode" type="base:ResponsibilitySequenceType" minOccurs="0" maxOccurs="1"/>
<xs:element name="OBDReasonCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="RxInfoType">
<xs:sequence>
<xs:element name="rxBin" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="pcn" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="rxGroup" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="rxId" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="rxPhoneNumber" type="xs:string" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="CorrespondenceInformationType">
<xs:group ref="CorrespondenceInformationGroup"/>
</xs:complexType>
<xs:group name="CorrespondenceInformationGroup">
<xs:sequence>
<xs:element name="emailAddress" type="base:EmailAddressValueType" minOccurs="0" maxOccurs="1"/>
<xs:element name="addressInfo" type="AddressInfoType" minOccurs="0" maxOccurs="1" />
<!-- Only one should be set.  If more than one is populated, the first one encountered, in this,
order, will be used.   -->
<xs:element name="supplierCorrespondenceUsageCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
<xs:element name="supplierLocationCorrespondenceUsageCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
<xs:element name="accountCorrespondenceUsageCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:complexType name="AddressInfoType">
<xs:sequence>
<xs:element name="postalAddress" type="base:PostalAddressType" minOccurs="0" maxOccurs="1"/>
<xs:element name="addressPhoneList" type="base:TelephoneNumberType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
<!-- COB Policy Lookup Types START -->
<xs:element name="cobPolicyLookupCriteria" type="COBPolicyLookupInputType"/>
<xs:complexType name="COBPolicyLookupInputType">
<xs:complexContent>
<xs:extension base="base:HealthRulesResourceType">
<xs:sequence>
<xs:element name="memberHccId" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="asOfDate" type="xs:string" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:element name="cobPolicyLookupListResponse" type="COBPolicyReferenceType">
<xs:annotation>
<xs:documentation>Member ID is used for matching during a search.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:complexType name="COBPolicyReferenceType">
<xs:complexContent>
<xs:extension base="base:HealthRulesResourceType">
<xs:sequence>
<xs:element name="memberHccId" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:sequence>
<xs:element name="cobPolicyId" type="xs:string" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
<xs:element name="asOfDate" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:group ref="base:ErrorStatusGroup"/>
</xs:sequence>
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:complexType name="ServiceCategoryType">
<xs:sequence>
<xs:element name="serviceCategoryName" type="xs:string" minOccurs="1" maxOccurs="1"/>
<xs:element name="serviceCategoryType" type="xs:string" minOccurs="1" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="ServiceCategoryList">
<xs:sequence>
<xs:element name="listMode" type="base:ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="serviceCategory" type="ServiceCategoryType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
<!-- COB Policy Lookup Types END -->
</xs:schema>
</file>
<file path="PRIME_SERVICES_XSD/connector-codeentrylookup/codeentrylookup.xsd">
<?xml version="1.0" encoding="UTF-8"?>
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:base="http://www.healthedge.com/connector/schema/basetypes"
xmlns="http://www.healthedge.com/connector/schema/codeentrylookup"
targetNamespace="http://www.healthedge.com/connector/schema/codeentrylookup" elementFormDefault="unqualified"
version="4.0">
<xs:annotation>
<xs:documentation>
DISCLAIMER
This pre-release software provided by HealthEdge Inc. is a work-in-progress.
HealthEdge provides pre-release information to early adopters for the purpose of design and planning.
It has no warranty either explicit or implied and is subject to change.
</xs:documentation>
</xs:annotation>
<xs:import namespace="http://www.healthedge.com/connector/schema/basetypes" schemaLocation="../connector-common-schema/base-types.xsd"/>
<xs:element name="codeEntryLookupListResponse" type="CodeEntryListResponseType"/>
<xs:element name="codeEntryLookupCriteria" type="CodeEntryInputType"/>
<xs:element name="codeEntryLookupResponse" type="CodeEntryResponseType"/>
<xs:complexType name="CodeEntryListResponseType">
<xs:sequence>
<xs:group ref="CodeEntryListResponseGroup"/>
</xs:sequence>
</xs:complexType>
<xs:group name="CodeEntryListResponseGroup">
<xs:sequence>
<xs:element name="codeSetName" type="base:String50Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="codeEntrylist" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="codeEntry" type="base:CodeEntryType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:group ref="base:ErrorStatusGroup"/>
</xs:sequence>
</xs:group>
<xs:complexType name="CodeEntryInputType">
<xs:complexContent>
<xs:extension base="base:HealthRulesResourceType">
<xs:group ref="base:CodeEntryInputGroup"/>
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:complexType name="CodeEntryResponseType">
<xs:sequence>
<xs:element name="codeEntry" type="base:CodeEntryType" minOccurs="0" maxOccurs="1"/>
<xs:group ref="base:ErrorStatusGroup"/>
</xs:sequence>
</xs:complexType>
</xs:schema>
</file>
<file path="PRIME_SERVICES_XSD/connector-common-schema/base-types.xsd">
<?xml version="1.0"?>
<!-- edited with XMLSpy v2014 sp1 (x64) (http://www.altova.com) by Rebecca Stevenson (HEALTHEDGE SOFTWARE INC) -->
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:stl="http://www.codesynthesis.com/xmlns/xsstl" xmlns="http://www.healthedge.com/connector/schema/basetypes" xmlns:tns="http://www.healthedge.com/connector/schema/basetypes" targetNamespace="http://www.healthedge.com/connector/schema/basetypes" elementFormDefault="unqualified" version="4.1">
<xs:annotation>
<xs:documentation>
Enumerations include possible redundant values to allow for multisourced inbound documents.
Group structures used to support multi-schema support: sparse, full, relaxed,flat
</xs:documentation>
<xs:documentation>
DISCLAIMER
This  pre-release software provided by HealthEdge Inc. is a work-in-progress.
HealthEdge provides pre-release information to early adopters for the purpose of design and planning.
It has no warranty either explicit or implied and is subject to change.
</xs:documentation>
</xs:annotation>
<xs:import namespace="http://www.codesynthesis.com/xmlns/xsstl" schemaLocation="iso3166-country-code.xsd"/>
<xs:import namespace="http://www.codesynthesis.com/xmlns/xsstl" schemaLocation="us-state-code.xsd"/>
<xs:import namespace="http://www.codesynthesis.com/xmlns/xsstl" schemaLocation="phone-number.xsd"/>
<xs:simpleType name="StringIdentifierType">
<xs:annotation>
<xs:documentation>String based ID restriction</xs:documentation>
</xs:annotation>
<xs:restriction base="String255Type"/>
</xs:simpleType>
<xs:complexType name="URIReference">
<xs:annotation>
<xs:documentation>General URI reference for streams and referential object graphs</xs:documentation>
</xs:annotation>
<xs:attribute name="uri" type="xs:anyURI" use="required"/>
<xs:attribute name="type" type="xs:string" use="optional"/>
</xs:complexType>
<xs:complexType name="HealthRulesBatchType">
<xs:annotation>
<xs:documentation>Batch envelope </xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="resource" type="HealthRulesResourceType" minOccurs="1" maxOccurs="unbounded"/>
</xs:sequence>
<xs:attribute name="size" type="xs:int"/>
<xs:attribute name="batchId" type="xs:string" use="required"/>
<xs:attribute name="batchTimestamp" type="xs:dateTime" use="required"/>
</xs:complexType>
<xs:complexType name="HealthRulesResourceType">
<xs:annotation>
<xs:documentation>Base entity resource with optional URI for reconciliation and BAM tracking</xs:documentation>
<xs:documentation>Base Entity resource, with version enumeration for schema validation</xs:documentation>
</xs:annotation>
<xs:attribute name="resourceURI" type="xs:anyURI" use="optional"/>
<xs:attribute name="version">
<xs:simpleType>
<xs:restriction base="xs:string">
<xs:enumeration value="1.0"/>
<xs:enumeration value="1.1"/>
<xs:enumeration value="1.2"/>
<xs:enumeration value="2.0"/>
<xs:enumeration value="2.1"/>
<xs:enumeration value="3.0"/>
<xs:enumeration value="3.1"/>
<xs:enumeration value="4.0"/>
<xs:enumeration value="4.1"/>
<xs:enumeration value="5.0"/>
<xs:enumeration value="5.1"/>
<xs:enumeration value="6.0"/>
<xs:enumeration value="6.1"/>
<xs:enumeration value="7.0"/>
<xs:enumeration value="7.1"/>
<xs:enumeration value="8.0"/>
<xs:enumeration value="8.1"/>
</xs:restriction>
</xs:simpleType>
</xs:attribute>
</xs:complexType>
<xs:simpleType name="GenderCodeType">
<xs:annotation>
<xs:documentation/>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:enumeration value="Male"/>
<xs:enumeration value="Female"/>
<xs:enumeration value="Unknown"/>
<xs:enumeration value="Unspecified"/>
<xs:enumeration value="M"/>
<xs:enumeration value="F"/>
<xs:enumeration value="U"/>
<xs:enumeration value="X"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="MaritalStatusCodeType">
<xs:annotation>
<xs:documentation/>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:enumeration value="Single"/>
<xs:enumeration value="Married"/>
<xs:enumeration value="Divorced"/>
<xs:enumeration value="Legally Separated"/>
<xs:enumeration value="Separated"/>
<xs:enumeration value="Widowed"/>
<xs:enumeration value="Unmarried"/>
<xs:enumeration value="Registered Domestic Partner"/>
<xs:enumeration value="Unreported"/>
</xs:restriction>
</xs:simpleType>
<xs:complexType name="PersonNameType">
<xs:annotation>
<xs:documentation>Common person name type</xs:documentation>
</xs:annotation>
<xs:group ref="PersonNameGroup"/>
</xs:complexType>
<xs:simpleType name="EthnicityCodeType">
<xs:annotation>
<xs:documentation>CMS/EDI valuesets</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:enumeration value="Not Provided"/>
<xs:enumeration value="Not Applicable"/>
<xs:enumeration value="Asian or Pacific Islander"/>
<xs:enumeration value="Black"/>
<xs:enumeration value="Caucasian"/>
<xs:enumeration value="Subcontinent Asian American"/>
<xs:enumeration value="Other Race or Ethnicity"/>
<xs:enumeration value="Asian Pacific American"/>
<xs:enumeration value="Native American"/>
<xs:enumeration value="Hispanic"/>
<xs:enumeration value="American Indian or Alaskan Native"/>
<xs:enumeration value="Native Hawaiian"/>
<xs:enumeration value="Black (Non-Hispanic)"/>
<xs:enumeration value="White (Non-Hispanic)"/>
<xs:enumeration value="Pacific Islander"/>
<xs:enumeration value="Mutually Defined"/>
</xs:restriction>
</xs:simpleType>
<xs:complexType name="USPhoneNumberSimpleType">
<xs:annotation>
<xs:documentation>Simple US phone number with primary boolean attribute</xs:documentation>
</xs:annotation>
<xs:simpleContent>
<xs:extension base="xs:string">
<xs:attribute name="primary" type="xs:boolean" default="false"/>
</xs:extension>
<!--  <xs:extension base="stl:PhoneNumber">-->
</xs:simpleContent>
</xs:complexType>
<xs:simpleType name="EmailAddressValueType">
<xs:annotation>
<xs:documentation>Basic email address with regex validation check</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<!-- Space check -->
<xs:pattern value="(\s)"/>
<!-- Email format check -->
<xs:pattern value="([a-zA-Z0-9_]+)([-+.']([a-zA-Z0-9_]+))*@([a-zA-Z0-9_]+)([-.]([a-zA-Z0-9_]+))*\.([a-zA-Z0-9_]+)([-.]([a-zA-Z0-9_]+))*"/>
<!--            <xs:pattern value="^([a-zA-Z0-9_\-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([a-zA-Z0-9\-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\]?)$"/>-->
</xs:restriction>
</xs:simpleType>
<xs:complexType name="EmailAddressSimpleType">
<xs:annotation>
<xs:documentation>Extension of Value type with primary boolean attribute</xs:documentation>
</xs:annotation>
<xs:simpleContent>
<xs:extension base="EmailAddressValueType">
<xs:attribute name="primary" type="xs:boolean" default="false"/>
</xs:extension>
</xs:simpleContent>
</xs:complexType>
<xs:group name="PersonNameGroup">
<xs:annotation>
<xs:documentation>Common Person name group used for type composition</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="lastName" type="String60Type" nillable="true" maxOccurs="1"/>
<xs:element name="firstName" type="ProperNameType" nillable="true" minOccurs="0" maxOccurs="1"/>
<xs:element name="middleName" type="ProperNameType" nillable="true" minOccurs="0" maxOccurs="1"/>
<xs:element name="namePrefix" type="ProperNameType" nillable="true" minOccurs="0" maxOccurs="1"/>
<xs:element name="nameSuffix" type="xs:string" nillable="true" minOccurs="0" maxOccurs="1"/>
<xs:element name="nameSuffixList" type="NameSuffixList"  minOccurs="0" maxOccurs="1"/>
<xs:element name="credentialSuffixList" type="CredentialSuffixList" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:complexType name="NameSuffixList">
<xs:sequence>
<xs:element name="listMode" type="ListActionType" nillable="true" minOccurs="0" maxOccurs="1"/>
<xs:element name="suffix" type="ProperNameType" nillable="true" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="CredentialSuffixList">
<xs:sequence>
<xs:element name="listMode" type="ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="CredentialSuffix" type="CodeEntryInputType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
<xs:group name="ContactInformationGroup">
<xs:annotation>
<xs:documentation>Basic Contact Information group, includes attribute primary in repeated values, finer grained validation required to restrict to single primary flag (if required)</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="phoneNumber" type="USPhoneNumberSimpleType" nillable="true" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="email" type="EmailAddressSimpleType" nillable="true" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:group>
<xs:group name="AddressGroup">
<xs:annotation>
<xs:documentation>Basic Address information (US based)</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="streetAddress" type="xs:string" minOccurs="0" nillable="true" maxOccurs="2"/>
<xs:element name="cityName" nillable="true" minOccurs="0" maxOccurs="1">
<xs:simpleType>
<xs:restriction base="xs:string">
<xs:minLength value="2"/>
<xs:maxLength value="30"/>
</xs:restriction>
</xs:simpleType>
</xs:element>
<xs:element name="stateCode" nillable="true" minOccurs="0" maxOccurs="1">
<xs:simpleType>
<xs:restriction base="xs:string">
<xs:minLength value="2"/>
<xs:maxLength value="2"/>
</xs:restriction>
</xs:simpleType>
</xs:element>
<xs:element name="postalCode" nillable="true" minOccurs="0" maxOccurs="1">
<xs:simpleType>
<xs:restriction base="xs:string">
<xs:minLength value="3"/>
<xs:maxLength value="15"/>
</xs:restriction>
</xs:simpleType>
</xs:element>
<xs:element name="countryCode" type="stl:ISO3166CountryCode" nillable="true" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:group name="AddressInformationGroup">
<xs:annotation>
<xs:documentation>Basic Address information (US based)</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="streetAddress" type="xs:string" maxOccurs="2"/>
<xs:element name="cityName" nillable="true" maxOccurs="1">
<xs:simpleType>
<xs:restriction base="xs:string">
<xs:minLength value="2"/>
<xs:maxLength value="30"/>
</xs:restriction>
</xs:simpleType>
</xs:element>
<xs:element name="stateCode" nillable="true" maxOccurs="1">
<xs:simpleType>
<xs:restriction base="xs:string">
<xs:minLength value="2"/>
<xs:maxLength value="2"/>
</xs:restriction>
</xs:simpleType>
</xs:element>
<xs:element name="postalCode" nillable="true" maxOccurs="1">
<xs:simpleType>
<xs:restriction base="xs:string">
<xs:minLength value="3"/>
<xs:maxLength value="15"/>
</xs:restriction>
</xs:simpleType>
</xs:element>
<xs:element name="countryCode" type="stl:ISO3166CountryCode" nillable="true" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:group name="CorrespondenceAddressInformationGroup">
<xs:sequence>
<xs:element name="postalAddress" type="PostalAddressType" minOccurs="0" maxOccurs="1"/>
<xs:element name="addressPhoneList" type="TelephoneNumberListType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:complexType name="CorrespondenceAddressInformationType">
<xs:group ref="CorrespondenceAddressInformationGroup"/>
</xs:complexType>
<xs:complexType name="CorrespondenceInfoType">
<xs:sequence>
<xs:element name="emailAddress" type="EmailAddressValueType" minOccurs="0" maxOccurs="1"/>
<xs:element name="addressInformation" type="CorrespondenceAddressInformationType" minOccurs="0" maxOccurs="1"/>
<xs:element name="contacts" type="ContactListType" minOccurs="0" maxOccurs="1"/>
<xs:element name="correspondenceUsageTypeCode" type="CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="ContactListType">
<xs:sequence>
<xs:element name="listMode" type="ListUpdateModeType" minOccurs="0" maxOccurs="1"/>
<xs:element name="contact" type="ContactType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="ContactType">
<xs:sequence>
<xs:element name="title" type="String60Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="emailAddress" type="EmailAddressValueType" minOccurs="0" maxOccurs="1"/>
<xs:element name="personName" type="PersonNameType" minOccurs="0" maxOccurs="1"/>
<xs:element name="telephoneList" type="TelephoneNumberListType" minOccurs="0" maxOccurs="1"/>
<xs:element name="usageTypeCode" type="CodeEntryInputType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Reference to ContactType Payor Code Set.
</xs:documentation>
</xs:annotation>
</xs:element>
</xs:sequence>
</xs:complexType>
<xs:group name="BaseDemographicGroup">
<xs:annotation>
<xs:documentation>Base Demographic group</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="genderCode" type="GenderCodeType" nillable="true" minOccurs="0" maxOccurs="1"/>
<xs:element name="ethnicityCode" type="EthnicityCodeType" nillable="true" minOccurs="0" maxOccurs="1"/>
<xs:element name="primaryLanguage" type="xs:language" nillable="true" minOccurs="0" maxOccurs="1"/>
<xs:element name="dateOfBirth" type="xs:date" nillable="true" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:simpleType name="EmploymentStatusCodeType">
<xs:annotation>
<xs:documentation>Employment Status: ASC X12N/005010X220</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:enumeration value="Leave of Absence with Pay"/>
<xs:enumeration value="Leave of Absence without Pay"/>
<xs:enumeration value="Active"/>
<xs:enumeration value="Apprenticeship Full-time"/>
<xs:enumeration value="Active Reserve"/>
<xs:enumeration value="Flexible Work Plan"/>
<xs:enumeration value="Employee/Employer defined work hours"/>
<xs:enumeration value="Alerted"/>
<xs:enumeration value="Assigned"/>
<xs:enumeration value="Affiliated with Outside Organization"/>
<xs:enumeration value="Adjunct"/>
<xs:enumeration value="Active Military - Overseas"/>
<xs:enumeration value="Apprenticeship Part-time"/>
<xs:enumeration value="Apprenticeship"/>
<xs:enumeration value="Academy Student"/>
<xs:enumeration value="Presidential Appointee"/>
<xs:enumeration value="Active Military - USA"/>
<xs:enumeration value="Non-applicable Employment Status Category"/>
<xs:enumeration value="Contractor"/>
<xs:enumeration value="Consolidated Omnibus Budget Reconciliation Act (COBRA)"/>
<xs:enumeration value="Continued"/>
<xs:enumeration value="Discharged or Terminated for Cause"/>
<xs:enumeration value="Dishonorably Discharged"/>
<xs:enumeration value="Deceased"/>
<xs:enumeration value="Disqualified: Medical or Physical Condition"/>
<xs:enumeration value="Disqualified: Other"/>
<xs:enumeration value="Disabled"/>
<xs:enumeration value="Employed by Outside Organization"/>
<xs:enumeration value="Furloughed: Job Abolished, Force Reduction"/>
<xs:enumeration value="Furloughed: Bumped or Displaced"/>
<xs:enumeration value="Furloughed: Facility Closed"/>
<xs:enumeration value="Furloughed: Other"/>
<xs:enumeration value="Full-time"/>
<xs:enumeration value="Honorably Discharged"/>
<xs:enumeration value="Inactive"/>
<xs:enumeration value="Inactive Reserves"/>
<xs:enumeration value="Leave of Absence"/>
<xs:enumeration value="Administrative Leave of Absence"/>
<xs:enumeration value="Annual Leave of Absence"/>
<xs:enumeration value="Leave of Absence due to Bereavement"/>
<xs:enumeration value="Jury Duty"/>
<xs:enumeration value="Suspension"/>
<xs:enumeration value="Sabbatical Leave of Absence"/>
<xs:enumeration value="Leave of Absence: Personal"/>
<xs:enumeration value="Leave of Absence: Education"/>
<xs:enumeration value="Leave of Absence: Family Medical Leave Act (FMLA)"/>
<xs:enumeration value="Leave of Absence: Maternity"/>
<xs:enumeration value="Leave of Absence for Non-Military Government Request Other Than Jury Duty"/>
<xs:enumeration value="Leave of Absence: Sickness"/>
<xs:enumeration value="Leave of Absence: Union"/>
<xs:enumeration value="Leave of Absence: Without Permission, Unauthorized"/>
<xs:enumeration value="Leave of Absence: Military"/>
<xs:enumeration value="Not Employed"/>
<xs:enumeration value="On Strike"/>
<xs:enumeration value="Other"/>
<xs:enumeration value="Promoted"/>
<xs:enumeration value="Part-time Contractual"/>
<xs:enumeration value="Plan to Enlist"/>
<xs:enumeration value="Permanent"/>
<xs:enumeration value="Part-time Noncontractual"/>
<xs:enumeration value="Probationary"/>
<xs:enumeration value="Part-time"/>
<xs:enumeration value="Previous"/>
<xs:enumeration value="Piece Worker"/>
<xs:enumeration value="Resigned: Retired"/>
<xs:enumeration value="Relocated"/>
<xs:enumeration value="Reassigned"/>
<xs:enumeration value="Resigned: Moved"/>
<xs:enumeration value="Recommissioned"/>
<xs:enumeration value="Resigned: Injury"/>
<xs:enumeration value="Retired Military - Overseas"/>
<xs:enumeration value="Resigned: Personal Reasons"/>
<xs:enumeration value="Retired Without Recall"/>
<xs:enumeration value="Retired"/>
<xs:enumeration value="Retired Military - USA"/>
<xs:enumeration value="Dual Retired Status Retiree is working"/>
<xs:enumeration value="Resigned: Accepted Separation Allowance"/>
<xs:enumeration value="Separated"/>
<xs:enumeration value="Self-Employed"/>
<xs:enumeration value="Seasonal"/>
<xs:enumeration value="Suspended"/>
<xs:enumeration value="Terminated"/>
<xs:enumeration value="Temporary Full-Time"/>
<xs:enumeration value="Temporary"/>
<xs:enumeration value="Tenured"/>
<xs:enumeration value="Temporary Part-Time"/>
<xs:enumeration value="Transferred"/>
<xs:enumeration value="Unknown"/>
<xs:enumeration value="Volunteer"/>
<xs:enumeration value="Extra Duties Not Requiring Certification"/>
</xs:restriction>
</xs:simpleType>
<xs:group name="HealthInformationGroup">
<xs:annotation>
<xs:documentation>Basic health information</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="height" type="xs:decimal"/>
<xs:element name="weight" type="xs:decimal"/>
</xs:sequence>
</xs:group>
<xs:complexType name="ContactInformationType">
<xs:annotation>
<xs:documentation>Concrete type for contact information</xs:documentation>
</xs:annotation>
<xs:complexContent>
<xs:extension base="HealthRulesResourceType">
<xs:sequence>
<xs:group ref="ContactInformationGroup"/>
</xs:sequence>
<xs:attribute name="primary" type="xs:boolean" default="false"/>
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:complexType name="ContactInformationListType">
<xs:annotation>
<xs:documentation>List of contact information</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="contact" type="ContactInformationType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="RemarksType">
<xs:annotation>
<xs:documentation>Concrete type for remarks</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="remark" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="remarkCode" type="xs:string" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:group name="PractitionerInformationGroup">
<xs:annotation>
<xs:documentation>Aggregate group of common practitioner information</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="practitionerIdentifier" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="nationalProviderId" type="xs:string" nillable="true" minOccurs="0" maxOccurs="1"/>
<xs:element name="pcp" type="xs:boolean" nillable="true" minOccurs="0" maxOccurs="1"/>
<xs:element name="isAutoAssignedAsPCP" type="xs:boolean" nillable="true" minOccurs="0" maxOccurs="1"/>
<xs:element name="excludeFromProviderDir" type="xs:boolean" nillable="true" minOccurs="0" maxOccurs="1"/>
<xs:element name="effectiveStartDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="endorsementEffectiveDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="endorsementExpirationDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:group ref="PersonNameGroup"/>
<xs:group ref="BaseDemographicGroup"/>
</xs:sequence>
</xs:group>
<xs:group name="SupplierInformationGroup">
<xs:annotation>
<xs:documentation>Aggregate group of common supplier information</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="primaryName" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="hccIdentifier" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="nationalProviderId" type="xs:string" nillable="true" minOccurs="0" maxOccurs="1"/>
<xs:element name="taxID" type="TaxIdType" minOccurs="0" maxOccurs="1"/>
<xs:element name="pcp" type="xs:boolean" nillable="true" minOccurs="0" maxOccurs="1"/>
<xs:element name="isAutoAssignedAsPCP" type="xs:boolean" nillable="true" minOccurs="0" maxOccurs="1"/>
<xs:element name="excludeFromProviderDir" type="xs:boolean" nillable="true" minOccurs="0" maxOccurs="1"/>
<xs:element name="effectiveStartDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:group name="ForeignMedicalCertificationGroup">
<xs:annotation>
<xs:documentation>Foreign Medical Certification group</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="ecfmgCertified" type="xs:boolean" nillable="true" minOccurs="0" maxOccurs="1"/>
<xs:element name="ecfmgNumber" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="ecfmgCertificateIssueDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:group name="CredentialingDateGroup">
<xs:annotation>
<xs:documentation>Credentialing date information group</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="dateSentToCredentialEntity" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="originalEffectiveStartDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="effectiveStartDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="effectiveEndDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="recredentialDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:group name="CredentialSourceInfoGroup">
<xs:annotation>
<xs:documentation>Credentialing Source information</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="credentialSourceName" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="credentialSourceCode" type="xs:string" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:group name="LicenseNumberGroup">
<xs:annotation>
<xs:documentation>Licensing Information (provider)</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="licenseNumber" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="licenseStateCode" type="USStateTerritoryCode" minOccurs="0" maxOccurs="1"/>
<xs:element name="effectiveStartDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="effectiveEndDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="typeOfLicense" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="licenseTerminateReason" type="xs:string" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:group name="AdmissionGroup">
<xs:annotation>
<xs:documentation>Information</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="admissionDate" type="String50Type" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Date of admission to the facility.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="admissionTimeCount" type="String50Type" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Time of admission to the facility.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="admissionTypeCode" type="String50Type" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Code identifying how member was admitted.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="admissionSourceCode" type="String50Type" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Source of admission to facility, such as Physician Referral.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="esrdOnsetDate" type="String50Type" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Date of ESRD onset.</xs:documentation>
</xs:annotation>
</xs:element>
</xs:sequence>
</xs:group>
<xs:group name="DischargeGroup">
<xs:annotation>
<xs:documentation>Discharge Group</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="dischargeTimeCount" type="String50Type" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Time at which member was discharged from the facility.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="dischargeStatusCode" type="String50Type" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Member's discharge status as of the billing period.</xs:documentation>
</xs:annotation>
</xs:element>
</xs:sequence>
</xs:group>
<xs:group name="ConditionCodeGroup">
<xs:annotation>
<xs:documentation>Condition Code Group</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="conditionCode" type="String50Type" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:group name="EpsdtReferralCodeGroup">
<xs:annotation>
<xs:documentation>EPSDT Referral Code Group</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="epsdtReferralCode" type="String2Type" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:group name="EventGroup">
<xs:annotation>
<xs:documentation>Event Group</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="occurrenceCode" type="String50Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="occurrenceDate" type="String50Type" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:group name="SpanGroup">
<xs:annotation>
<xs:documentation>Span</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="spanCode" type="String50Type" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Defines specific event relating to the billing period. For example, 70 = qualifying stay dates.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="startDate" type="String50Type" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Beginning date of the event.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="endDate" type="String50Type" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Through date of the event.</xs:documentation>
</xs:annotation>
</xs:element>
</xs:sequence>
</xs:group>
<xs:group name="PrincipleProcedureGroup">
<xs:annotation>
<xs:documentation>Information</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="principleProcedureCode" type="String50Type" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>ICD-9=CM code for the principal procedure performed during the period covered by the bill.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="procedureDate" type="String50Type" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Date on which the principal procedure was performed.</xs:documentation>
</xs:annotation>
</xs:element>
</xs:sequence>
</xs:group>
<xs:group name="OtherProcedureGroup">
<xs:annotation>
<xs:documentation>Information</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="procedureCode" type="String50Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="procedureDate" type="String50Type" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:complexType name="UDTValueType">
<xs:annotation>
<xs:documentation>User Defined Types(UDT) for the Subscription</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:group ref="UDTValueGroup"/>
</xs:sequence>
</xs:complexType>
<xs:group name="UDTValueGroup">
<xs:annotation>
<xs:documentation>Information</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="attributeRoleName" type="LongStringType" minOccurs="0" maxOccurs="1"/>
<xs:element name="attrValueAsString" type="ExtraLongFormattedTextType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:complexType name="UDTListType">
<xs:sequence>
<xs:element name="udtListValueSet" type="UDTValueType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="userDefinedTermReference" type="ReferenceType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<!-- for updating UDTs via merge and replace-->
<xs:complexType name="UDTsInputType">
<xs:sequence>
<xs:element name="updateMode" type="ListUpdateModeType"  minOccurs="0" maxOccurs="1"/>
<xs:element name="udt" type="UDTInputType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="UDTInputType">
<xs:sequence>
<xs:element name="udtValueSets" type="UDTValueSetsType" minOccurs="1" maxOccurs="1"/>
<xs:element name="userDefinedTermName" type="xs:string" minOccurs="1" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="UDTValueSetsType">
<xs:sequence>
<xs:element name="updateMode" type="ListUpdateModeType"  minOccurs="0" maxOccurs="1"/>
<xs:element name="udtValueSet" type="UDTValueSetType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="UDTValueSetType">
<xs:annotation>
<xs:documentation>User Defined Types(UDT) for the Subscription</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:group ref="UDTValueGroup"/>
</xs:sequence>
</xs:complexType>
<xs:simpleType name="MessageActionType">
<xs:restriction base="xs:string">
<xs:enumeration value="Informational"/>
<xs:enumeration value="Denial"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="MessageResponsibilityType">
<xs:restriction base="xs:string">
<xs:enumeration value="Member Responsibility"/>
<xs:enumeration value="Supplier Responsibility"/>
</xs:restriction>
</xs:simpleType>
<xs:group name="MessageCodeGroup">
<xs:sequence>
<xs:element name="messageCode" type="String50Type" minOccurs="1" maxOccurs="1"/>
<xs:element name="codeDomainName" type="String50Type" minOccurs="1" maxOccurs="1"/>
<xs:element name="messageDescription" type="FormattedTextType" minOccurs="1" maxOccurs="1"/>
<xs:element name="policyName" type="LongStringType" minOccurs="0" maxOccurs="1"/>
<xs:element name="messageAction" type="MessageActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="messageResponsibility" type="MessageResponsibilityType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:complexType name="MessageCodeType">
<xs:group ref="MessageCodeGroup"/>
</xs:complexType>
<xs:group name="ReviewTriggerGroup">
<xs:sequence>
<xs:element name="creationDate" type="xs:dateTime" minOccurs="0" maxOccurs="1"/>
<xs:element name="isApproved" type="xs:boolean" minOccurs="0" maxOccurs="1"/>
<xs:element name="doNotPreserveReviewDecision" type="xs:boolean" minOccurs="0" maxOccurs="1"/>
<xs:element name="reviewMessageCode" type="MessageCodeType" minOccurs="1" maxOccurs="1"/>
<xs:group ref="ElementPathGroup" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:group>
<xs:complexType name="ReviewTriggerType">
<xs:group ref="ReviewTriggerGroup"/>
</xs:complexType>
<xs:group name="ActivityExceptionGroup">
<xs:sequence>
<xs:element name="creationDate" type="xs:dateTime" minOccurs="0" maxOccurs="1"/>
<xs:element name="exceptionType" type="ExceptionType" minOccurs="1" maxOccurs="1"/>
<xs:element name="exceptionMessageCode" type="MessageCodeType" minOccurs="1" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:complexType name="ActivityExceptionType">
<xs:group ref="ActivityExceptionGroup"/>
</xs:complexType>
<xs:group name="ElementPathGroup">
<xs:sequence>
<xs:element name="elementLocatorText" type="String900Type" minOccurs="1" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:complexType name="IndividualInformationType">
<xs:annotation>
<xs:documentation>Individual Information type</xs:documentation>
</xs:annotation>
<xs:group ref="IndividualInformationGroup"/>
</xs:complexType>
<xs:group name="IndividualInformationGroup">
<xs:sequence>
<xs:element name="taxIdentificationNumber" type="SSNType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Social Security Number. Dashes are required. Changes are almost always made as of 1/1/1800.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="genderCode" type="GenderCodeType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Gender (male, female, unknown). Changes are made as of 1/1/1800.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="maritalStatusCode" type="MaritalStatusCodeType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Marital status (married, single, divorced, etc.).</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="birthDate" type="xs:date" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Birth date. Changes are made as of 1/1/1800.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="birthPlaceStateCode" type="LongStringType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Two-letter state code indicating where the individual was born.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="birthPlaceCountyCode" type="CountyCodeType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>US postal code indicating the county in which the individual was born.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="birthPlaceCountryCode" type="CountryCodeDomainType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Two digit code identifying the country in which the indidvidual was born. </xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="dateOfDeath" type="xs:date" nillable="true" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Date of death. Changes are made as of 1/1/1800.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="primaryName" type="PersonNameType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>The individual's primary name.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="otherNames" type="OtherNamesType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Other names associated with the individual (maiden name, nickname, alias, etc.).</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="languages" type="LanguagesType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>A list of languages spoken. Unless otherwise specified, English is assumed to be the primary language.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="immigrationStatusCode" type="CodeEntryInputType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Reference to ImmigrationStatus codeset; indicates US citizen or immigration status.</xs:documentation>
</xs:annotation>
</xs:element>
</xs:sequence>
</xs:group>
<xs:complexType name="LanguagesType">
<xs:sequence>
<xs:element name="listMode" type="ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="language" type="LanguageSpokenType" minOccurs="1" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="OtherNamesType">
<xs:sequence>
<xs:element name="listMode" type="ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="otherName" type="OtherNameUsedType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="OtherNameUsedType">
<xs:sequence>
<xs:element name="otherNameInfo" type="PersonNameType" minOccurs="1" maxOccurs="1"/>
<xs:element name="otherNameTypeCode" type="CodeEntryInputType" minOccurs="1" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="LanguageSpokenType">
<xs:sequence>
<xs:element name="primaryLanguage" type="xs:boolean" minOccurs="0" maxOccurs="1"/>
<xs:element name="nativeLanguage" type="xs:boolean" minOccurs="0" maxOccurs="1"/>
<xs:element name="languageDomainCode" type="CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:group name="MemberPhysicalAddressGroup">
<xs:sequence>
<xs:element name="emailAddress" type="EmailAddressValueType" minOccurs="0" maxOccurs="1"/>
<xs:element name="addressInfo" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="postalAddress" type="PostalAddressType" minOccurs="0" maxOccurs="1"/>
<xs:element name="addressPhoneList" type="TelephoneNumberListType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="addressTypeCode" type="CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:complexType name="MemberPhysicalAddressType">
<xs:group ref="MemberPhysicalAddressGroup"/>
</xs:complexType>
<xs:group name="MemberCorrespondenceAddressGroup">
<xs:sequence>
<xs:element name="emailAddress" type="EmailAddressValueType" minOccurs="0" maxOccurs="1"/>
<xs:element name="postalAddress" type="PostalAddressType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:complexType name="PostalAddressType">
<xs:complexContent>
<xs:extension base="BasicAddressType">
<xs:sequence>
<xs:element name="longitude" type="xs:decimal" minOccurs="0" maxOccurs="1"/>
<xs:element name="latitude" type="xs:decimal" minOccurs="0" maxOccurs="1"/>
<xs:element name="ignoreAddressCheck" type="xs:boolean" minOccurs="0" maxOccurs="1"/>
<xs:element name="undeliverableAddress" type="xs:boolean" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:complexType name="BasicAddressType">
<xs:sequence>
<xs:element name="addressId" type="xs:long" minOccurs="0" maxOccurs="1"/>
<xs:element name="address" type="LongStringType" minOccurs="0" maxOccurs="1"/>
<xs:element name="address2" type="LongStringType" minOccurs="0" maxOccurs="1"/>
<xs:element name="address3" type="LongStringType" minOccurs="0" maxOccurs="1"/>
<xs:element name="stateCode" type="LongStringType" minOccurs="0" maxOccurs="1"/>
<xs:element name="zipCode" type="ZipCodeType" minOccurs="0" maxOccurs="1"/>
<xs:element name="zipExtensionCode" type="ZipCodeExtensionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="cityName" type="ProperNameType" minOccurs="0" maxOccurs="1"/>
<xs:element name="countyCode" type="CountyCodeType" minOccurs="0" maxOccurs="1"/>
<xs:element name="countryCode" type="CountryCodeDomainType" minOccurs="0" maxOccurs="1"/>
<xs:element name="addressType" type="String50Type" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="IndividualCommunicationPreferencesType">
<xs:sequence>
<xs:group ref="IndividualCommunicationPreferencesGroup"/>
<xs:element name="emailFormatCode" type="CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:group name="IndividualCommunicationPreferencesGroup">
<xs:sequence>
<xs:element name="contactMethod" type="CommunicationContactMethodType" minOccurs="0" maxOccurs="1"/>
<xs:element name="documentDeliveryMethodCode" type="CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:complexType name="IndividualSpecificCommunicationPreferencesType">
<xs:sequence>
<xs:group ref="IndividualCommunicationPreferencesGroup"/>
<xs:element name="optOut" type="xs:boolean" minOccurs="0" maxOccurs="1"/>
<xs:element name="correspondenceName" type="String255Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="recipient" type="CorrespondenceRecipientType" minOccurs="0" maxOccurs="1"/>
<!-- <xs:element name="correspondenceDefinition " type="CorrespondenceDefinitionType" minOccurs="0" maxOccurs="1"/> -->
</xs:sequence>
</xs:complexType>
<xs:complexType name="CorrespondenceDefinitionType">
<xs:sequence>
<xs:element name="correspondenceName" type="String255Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="recipient" type="CorrespondenceRecipientType" minOccurs="0" maxOccurs="1"/>
<xs:element name="subject" type="CorrespondenceSubjectInputType" minOccurs="0" maxOccurs="1"/>
<xs:element name="autoGeneratedOnly" type="xs:boolean" minOccurs="0" maxOccurs="1"/>
<xs:element name="showInPortal" type="xs:boolean" minOccurs="0" maxOccurs="1"/>
<xs:element name="allowOptOut" type="xs:boolean" minOccurs="0" maxOccurs="1"/>
<xs:element name="defaultContactMethod" type="CommunicationContactMethodType" minOccurs="0" maxOccurs="1"/>
<xs:element name="manuallyEnteredFields" type="CorrespondenceFieldType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="contactMethods" type="CommunicationContactMethodType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="deliveryMethods" type="CodeEntryInputType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="defaultDeliveryMethod" type="CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="CorrespondenceFieldType">
<xs:sequence>
<xs:element name="fieldName" type="String255Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="isRequired" type="xs:boolean" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:simpleType name="CorrespondenceRecipientType">
<xs:annotation>
<xs:documentation>
1 "Member"
2 "Practitioner"
3 "Supplier"
4 "Account"
5 "Broker"
6 "UserAccount"
7 "Other"
8. "EMPTY_VALUE_INDICATED" syntax for clearing out previously set values
</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:enumeration value="Member"/>
<xs:enumeration value="Practitioner"/>
<xs:enumeration value="Supplier"/>
<xs:enumeration value="Account"/>
<xs:enumeration value="Broker"/>
<xs:enumeration value="UserAccount"/>
<xs:enumeration value="Other"/>
<xs:enumeration value="EMPTY_VALUE_INDICATED"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="CorrespondenceSubjectInputType">
<xs:annotation>
<xs:documentation>
1 "Bill"
2 "Claim"
3 "Payment"
4 "Member"
5 "Authorization"
6 "BenefitPlan"
7 "Not Applicable"
8 "COB Policy"
9 "Funding Request"
10. "EMPTY_VALUE_INDICATED" syntax for clearing out previously set values
</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:enumeration value="Bill"/>
<xs:enumeration value="Claim"/>
<xs:enumeration value="Payment"/>
<xs:enumeration value="Member"/>
<xs:enumeration value="Authorization"/>
<xs:enumeration value="BenefitPlan"/>
<xs:enumeration value="Not Applicable"/>
<xs:enumeration value="COB Policy"/>
<xs:enumeration value="Funding Request"/>
<xs:enumeration value="EMPTY_VALUE_INDICATED"/>
</xs:restriction>
</xs:simpleType>
<xs:group name="IdentificationNumberGroup">
<xs:sequence>
<xs:element name="identificationNumber" type="String50Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="issuingState" type="LongStringType" minOccurs="0" maxOccurs="1"/>
<xs:element name="issuingCountry" type="CountryCodeDomainType" minOccurs="0" maxOccurs="1"/>
<xs:element name="effectiveStartDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="effectiveEndDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="identificationTypeCode" type="CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:complexType name="IdentificationNumberType">
<xs:group ref="IdentificationNumberGroup"/>
</xs:complexType>
<xs:group name="DisabilityInfoForEligibilityGroup">
<xs:sequence>
<xs:element name="disabilityTypeCode" type="DisabilityTypeDomainType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Approval status (temporarily approved, denied, awaiting verification, etc.). </xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="disabilityReportedDate" type="xs:date" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Date on which the HCC was informed of the member disability.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="verificationReceiptDate" type="xs:date" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Date on which the disability was verified by the HCC.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="disabilityDenialReasonCode" type="CodeEntryInputType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Reference to the DisabilityDenialReason codeset, identifies the reason for denial.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="diagnosisReference" type="ReferenceType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Describes why the member is disabled.</xs:documentation>
</xs:annotation>
</xs:element>
</xs:sequence>
</xs:group>
<xs:group name="DependentVerificationGroup">
<xs:sequence>
<xs:element name="verificationType" type="VerificationType" minOccurs="1" maxOccurs="1">
<xs:annotation>
<xs:documentation>Specifies the verification type, which determines what data must be collected.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="certLastInfoRequestDate" type="xs:date" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Date on which certification of student status was last requested.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="certLastInfoReceiptDate" type="xs:date" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Date on which certification of student status was last received.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="certInformationDueDate" type="xs:date" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Date on which certification informatoin is due.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="lastVerificationDate" type="xs:date" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Date on which verification was last received.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="studentSchoolInfo" type="StudentSchoolInfoType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:complexType name="StudentSchoolInfoType">
<xs:sequence>
<xs:element name="studentStatusCode" type="StudentStatusDomainType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Member's student status (full-time, part-time, non-student).</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="graduationDate" type="xs:date" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Member's graduation date.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="schoolInformation" type="SchoolInfoType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Name and location of the school attended.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="schoolTypeCode" type="CodeEntryInputType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Type of school (two-year, four-year, etc.).</xs:documentation>
</xs:annotation>
</xs:element>
</xs:sequence>
</xs:complexType>
<xs:complexType name="SchoolInfoType">
<xs:sequence>
<xs:element name="institutionName" type="String50Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="contactInfo" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="contactDescription" type="FormattedTextType" minOccurs="0" maxOccurs="1"/>
<xs:element name="contactEmailAddress" type="EmailAddressValueType" minOccurs="0" maxOccurs="1"/>
<xs:element name="contactName" type="PersonNameType" minOccurs="0" maxOccurs="1"/>
<xs:element name="locationAddress" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="postalAddress" type="PostalAddressType" minOccurs="0" maxOccurs="1"/>
<xs:element name="addressPhoneList" type="TelephoneNumberListType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="contactTypeCode" type="CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
</xs:element>
</xs:sequence>
</xs:complexType>
<xs:complexType name="DependentVerificationType">
<xs:group ref="DependentVerificationGroup"/>
</xs:complexType>
<xs:group name="PhysicalCharacteristicGroup">
<xs:sequence>
<xs:element name="heightInchesCount" type="xs:int" minOccurs="0" maxOccurs="1"/>
<xs:element name="weightPoundsCount" type="xs:int" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:group name="EmploymentInfoGroup">
<xs:sequence>
<xs:element name="hireDate" type="xs:date" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Member's date of hire.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="salaryInterval" type="SalaryIntervalDomainType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Frequency of salary payments.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="salaryPerInterval" type="xs:decimal" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Salary paid per interval.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="unionStatus" type="xs:boolean" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>If true, member belongs to a union.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="positionOrTitle" type="String50Type" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Member's employee title or position.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="numberOfHoursWorked" type="xs:decimal" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Number of hours worked by the member.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="retirementDate" type="xs:date" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Member date of retirement.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="employmentStatusCodeCode" type="CodeEntryInputType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Reference to the EmploymentStatusCode codeset (full-time, part-time, military, etc.).</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="salaryGradeCodeCode" type="CodeEntryInputType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Reference to the SalaryGradeCode codeset.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="unitsDomainCode" type="CodeEntryInputType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Reference to the UnitsDomain codeset. Units in which hours are worked (per day, per week, etc.).</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="employeeTypeDomainCode" type="CodeEntryInputType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Reference to the EmployeeTypeDomain codeset. </xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="department" type="String150Type" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Employee department.</xs:documentation>
</xs:annotation>
</xs:element>
</xs:sequence>
</xs:group>
<xs:complexType name="MemberDentalInfoType">
<xs:group ref="MemberDentalInfoGroup"/>
</xs:complexType>
<xs:group name="MemberDentalInfoGroup">
<xs:sequence>
<xs:element name="remarks" type="LongStringType" minOccurs="0" maxOccurs="1"/>
<xs:element name="missingTeeth" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="listMode" type="ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="toothName" type="ToothNameDomainType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
</xs:sequence>
</xs:group>
<xs:group name="PriorCoverageInfoGroup">
<xs:sequence>
<xs:element name="priorCoverageMonthCount" type="xs:int" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Credit for the number of months of prior coverage with an outside HCC. This is a HIPAA regulation used to limit a compnay's ability to impose pre-existing condition limitations on members who had a requisite number of prior months coverage with another company. Typically relevant only for indemnity plans. </xs:documentation>
</xs:annotation>
</xs:element>
</xs:sequence>
</xs:group>
<xs:group name="PreExistingConditionGroup">
<xs:sequence>
<xs:element name="onsetOfConditionDate" type="xs:date" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Date on which the pre-existing condition was recognized.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="preexistingPeriodEndDate" type="xs:date" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Date on which the pre-existing period ends. If blank, date is determined by HCC policy.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="preexDescription" type="String50Type" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Name or description of the pre-existing condition.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="preExDiagnosisCodeRangeConditions" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Reference to one or more code ranges that have been identified for a pre-existing condition for a given member.</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="preExDiagnosisCodeRangeCondition" type="PreExDiagnosisCodeRangeConditionType" minOccurs="1" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="preExProcedureCodeRangeConditions" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>An optional list of service code ranges that contributed to the decision that this was a pre-existing condition for the member. Used for tracking/historical purposes only.</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="preExProcedureCodeRangeCondition" type="PreExProcedureCodeRangeConditionType" minOccurs="1" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="preexistingConditions" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Reference to one or more diagnoses that have been identified for a pre-existing condition for the member.</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="diagnosisReference" type="ReferenceType" minOccurs="1" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="preexistingConditionProcedures" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>An optional list of service codes that contributed to the decision that this was a pre-existing condition for the member. Used for tracking/historical purposes only.</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="serviceReference" type="ReferenceType" minOccurs="1" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
</xs:sequence>
</xs:group>
<xs:complexType name="PreExDiagnosisCodeRangeConditionType">
<xs:sequence>
<xs:element name="rangeStartDiagnosisCode">
<xs:complexType>
<xs:sequence>
<xs:element name="diagnosisReference" type="ReferenceType" minOccurs="1" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="rangeEndDiagnosisCode">
<xs:complexType>
<xs:sequence>
<xs:element name="diagnosisReference" type="ReferenceType" minOccurs="1" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
</xs:element>
</xs:sequence>
</xs:complexType>
<xs:complexType name="PreExProcedureCodeRangeConditionType">
<xs:sequence>
<xs:element name="rangeStartProcedureCode">
<xs:complexType>
<xs:sequence>
<xs:element name="serviceReference" type="ReferenceType" minOccurs="1" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="rangeEndProcedureCode">
<xs:complexType>
<xs:sequence>
<xs:element name="serviceReference" type="ReferenceType" minOccurs="1" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
</xs:element>
</xs:sequence>
</xs:complexType>
<xs:complexType name="PreExistingConditionType">
<xs:group ref="PreExistingConditionGroup"/>
</xs:complexType>
<xs:group name="PreExReductionGroup">
<xs:sequence>
<xs:element name="preexStartDate" type="xs:date" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Start date from which the pre-existing period is calculated. If null, use the member's first effective date.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="reductionEndDate" type="xs:date" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Cut off pre-existing conditions on this date.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="reductionReasonReceiptDate" type="xs:date" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Receipt date for the reduction.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="reductionReasonCode" type="CodeEntryInputType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Reference to the PreExReductionReason codeset; reason why the pre-existing period was reduced.</xs:documentation>
</xs:annotation>
</xs:element>
</xs:sequence>
</xs:group>
<xs:group name="OtherResponsiblePersonInfoGroup">
<xs:sequence>
<xs:element name="sourceOfAuthorization" type="SourceOfAuthorizationDomainType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>One of the following enumerated values: 1 Enrollment application, 2 Continuation of coverage, 3 Court documents, 4 Written request, 5 Verbal request.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="responsiblePersonEmailAddress" type="EmailAddressValueType" minOccurs="0" maxOccurs="1"/>
<xs:element name="responsiblePersonName" type="PersonNameType" minOccurs="0" maxOccurs="1"/>
<xs:element name="responsibleAddressInfo" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="postalAddress" type="PostalAddressType" minOccurs="0" maxOccurs="1"/>
<xs:element name="addressPhoneList" type="TelephoneNumberListType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="responsibilityTypeCodeCode" type="CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
<xs:element name="relationshipToMemberCode" type="CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:complexType name="OtherResponsiblePersonInfoType">
<xs:group ref="OtherResponsiblePersonInfoGroup"/>
</xs:complexType>
<xs:group name="AuthorizedIndividualGroup">
<xs:sequence>
<xs:element name="effectiveStartDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="effectiveEndDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="scope" type="LongStringType" minOccurs="0" maxOccurs="1"/>
<xs:element name="hccReviewer" type="String50Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="documentsReceivedDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="authorizedPerson" type="PersonNameType" minOccurs="0" maxOccurs="1"/>
<xs:element name="postalAddress" type="PostalAddressType" minOccurs="0" maxOccurs="1"/>
<xs:element name="authorizedIndividualGroupPhoneList" type="TelephoneNumberListType" minOccurs="0" maxOccurs="1"/>
<xs:element name="representativeTypeCode" type="CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
<xs:element name="relationshipToMemberCode" type="CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:complexType name="TelephoneNumberType">
<xs:sequence>
<xs:group ref="TelephoneNumberGroup"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="TelephoneNumberListType">
<xs:sequence>
<xs:element name="listMode" type="ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="telephoneNumber" type="TelephoneNumberType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="AuthorizedIndividualType">
<xs:group ref="AuthorizedIndividualGroup"/>
</xs:complexType>
<xs:group name="HIPAAPermissionGroup">
<xs:sequence>
<xs:element name="permissionScope" type="LongStringType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Describes the scope of the granted permissions.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="effectiveStartDate" type="xs:date" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>The date upon which the permission was granted.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="effectiveEndDate" type="xs:date" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>The date on which the permission ends.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="permittedPerson" type="PersonNameType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>The name of the person holding the permission.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="hIPAAPermissionGroupPhoneList" type="TelephoneNumberListType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Phone numbers for the permission holder.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="relationshipToMemberCode" type="CodeEntryInputType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Reference to the PHIRelationshipToMember codesets; the relationship between the permission holder and the member.</xs:documentation>
</xs:annotation>
</xs:element>
</xs:sequence>
</xs:group>
<xs:complexType name="HIPAAPermissionType">
<xs:group ref="HIPAAPermissionGroup"/>
</xs:complexType>
<xs:group name="HIPAARestrictionGroup">
<xs:sequence>
<xs:element name="restrictionScope" type="LongStringType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>A descriptoion of the restriction scope.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="effectiveStartDate" type="xs:date" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Date on which the restriction begins.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="effectiveEndDate" type="xs:date" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Date on which the restriction ends.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="restrictedPerson" type="PersonNameType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Identifies the person to whom the restrictions apply.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="relationshipToMemberCode" type="CodeEntryInputType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Reference to the PHIRelationshipToMember codeset; identifies the relation of the restricted individual to the member.</xs:documentation>
</xs:annotation>
</xs:element>
</xs:sequence>
</xs:group>
<xs:complexType name="HIPAARestrictionType">
<xs:group ref="HIPAARestrictionGroup"/>
</xs:complexType>
<xs:group name="HIPAAAuthorizationGroup">
<xs:sequence>
<xs:element name="authorizationType" type="PHIAuthorizationType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>The type of authorization, such as Disclose, Use, Use and Disclose.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="authorizationScope" type="LongStringType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Describes the scope of the authorization.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="effectiveStartDate" type="xs:date" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Date as of which information can be used or dislosed.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="effectiveEndDate" type="xs:date" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Date on which the authorization ends.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="whoCanBeDisclosedTo" type="LongStringType" minOccurs="0" maxOccurs="1"/>
<xs:element name="signature" type="String50Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="signatureDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="authorizationPurposeCode" type="CodeEntryInputType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Reference to the PHIAuthorizationPurpose codeset, identifies the purpose of the authorization.</xs:documentation>
</xs:annotation>
</xs:element>
</xs:sequence>
</xs:group>
<xs:complexType name="HIPAAAuthorizationType">
<xs:group ref="HIPAAAuthorizationGroup"/>
</xs:complexType>
<xs:group name="ConfidentialCommunicationDirectiveGroup">
<xs:sequence>
<xs:element name="confidentialCommunicationScope" type="LongStringType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Describes the scope of the confidential communications.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="effectiveStartDate" type="xs:date" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Start date of confidential communications.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="effectiveEndDate" type="xs:date" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>End date of confidential communications. </xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="confidentialCommunicationTypeCode" type="CodeEntryInputType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Reference to the PHIConfidentialCommunicationType codeset; identifies the type of directive (for example, Endangered member).</xs:documentation>
</xs:annotation>
</xs:element>
</xs:sequence>
</xs:group>
<xs:complexType name="ConfidentialCommunicationDirectiveType">
<xs:group ref="ConfidentialCommunicationDirectiveGroup"/>
</xs:complexType>
<!-- START Base Lookup Types -->
<xs:complexType name="AccountHccIDType">
<xs:sequence>
<xs:element name="accountHccIdentificationNumber" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="parentAccountHccIdentificationNumber" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="topAccountHccIdentificationNumber" type="xs:string" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="IDLookupType">
<xs:sequence>
<xs:element name="hccIdentificationNumber" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="referenceIdentificationNumber" type="xs:long" minOccurs="0" maxOccurs="1"/>
<xs:element name="name" type="xs:string" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="ParentAccountLookupType">
<xs:sequence>
<xs:element name="hccIdentificationNumber" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="name" type="xs:string" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="AccountReferenceType">
<xs:annotation>
<xs:documentation>Account information used for matching during a search input.</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="hccIdentifier" type="AccountHccIDType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="otherIdentificationNumber" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="identificationType" type="CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
<xs:element name="taxId" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="asOfDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="AccountLookupType">
<xs:annotation>
<xs:documentation>Account information used for matching during a search input.</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="accountIdentifier" type="IDLookupType" minOccurs="0" maxOccurs="1"/>
<xs:element name="parentAccountIdentifier" type="ParentAccountLookupType" minOccurs="0" maxOccurs="1"/>
<xs:element name="topAccountIdentifier" type="IDLookupType" minOccurs="0" maxOccurs="1"/>
<xs:element name="taxId" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="asOfDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="AccountType">
<xs:sequence>
<xs:element name="accountHccIdentifier" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="accountName" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="accountReferenceIdentifier" type="xs:long" minOccurs="0" maxOccurs="1"/>
<xs:element name="parentAccountHccIdentifier" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="parentAccountName" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="parentAccountReferenceIdentifier" type="xs:long" minOccurs="0" maxOccurs="1"/>
<xs:element name="topAccountHccIdentifier" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="topAccountName" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="topAccountReferenceIdentifier" type="xs:long" minOccurs="0" maxOccurs="1"/>
<xs:element name="otherNames" type="OtherNamesListType" minOccurs="0" maxOccurs="unbounded" />
<xs:element name="otherIDs" type="OtherIDsType" minOccurs="0" maxOccurs="unbounded" />
<xs:element name="taxId" type="xs:string" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="OtherNamesListType">
<xs:sequence>
<xs:element name="otherName" type="xs:string" minOccurs="1" maxOccurs="1"/>
<xs:element name="otherNameTypeCode" type="CodeEntryType" minOccurs="1" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="OtherIDsType">
<xs:sequence>
<xs:element name="otherID" type="xs:string" minOccurs="1" maxOccurs="1"/>
<xs:element name="otherIDTypeCode" type="CodeEntryType" minOccurs="1" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="BenefitPlanReferenceType">
<xs:complexContent>
<xs:extension base="HealthRulesResourceType">
<xs:sequence>
<xs:element name="benefitPlanHccId" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="benefitPlanName" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="otherID" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="identificationType" type="CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
<xs:element name="asOfDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:complexType name="PractitionerReferenceType">
<xs:annotation>
<xs:documentation>Practitioner information used for matching during a search.</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="hccIdentificationNumber" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="practitionerOtherIdentificationNumber" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="firstName" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="lastName" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="asOfDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="PractitionerByRoleReferenceType">
<xs:annotation>
<xs:documentation>Practitioner id and role name will be returned for a given practitioner role otherId and its code entry type.</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="hccIdentificationNumber" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="practitionerRoleOtherIdentificationNumber" type="xs:string" minOccurs="1" maxOccurs="1"/>
<xs:element name="practitionerRoleOtherIdTypeCode" type="CodeEntryInputType" minOccurs="1" maxOccurs="1"/>
<xs:element name="asOfDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="roleName" type="xs:string" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="SupplierReferenceType">
<xs:annotation>
<xs:documentation>Supplier information used for matching during a search.</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="hccIdentificationNumber" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="supplierNpi" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="supplierOtherIdentificationNumber" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="primaryName" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="asOfDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="SubmittedSupplierReferenceType">
<xs:annotation>
<xs:documentation>Submitted Supplier information used for matching during a search.</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="submittedSupplierId" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="submittedSupplierNpi" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="submittedSupplierOtherIdentificationNumber" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="primaryName" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="asOfDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="SupplierLocationReferenceType">
<xs:sequence>
<xs:element name="hccIdentifier" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="supplierLocationNpi" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="supplierOtherIdentificationNumber" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="fullName" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="asOfDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="SupplierNetworkReferenceType">
<xs:annotation>
<xs:documentation>Affiliated supplier network information used for matching during a search.</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="hccIdentificationNumber" type="xs:string" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="AccountsReferenceType">
<xs:sequence>
<xs:element name="hccIdentifier" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="description" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="effectiveStartDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="ProductReferenceType">
<xs:sequence>
<xs:element name="productName" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="hccProductId" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="effectiveStartDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="effectiveEndDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<!-- END Base Lookup Types -->
<!--xs:group name="CodeEntryInputGroup">
<xs:sequence>
<xs:element name="codeSetName" type="String50Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="codeEntry" type="String50Type" minOccurs="1" maxOccurs="1"/>
</xs:sequence>
</xs:group-->
<xs:complexType name="IdentifierType">
<xs:sequence>
<xs:element name="identifier" type="xs:long"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="CodeEntryInputType">
<xs:sequence>
<xs:group ref="CodeEntryInputGroup"/>
</xs:sequence>
</xs:complexType>
<xs:group name="CodeEntryInputGroup">
<xs:sequence>
<xs:element name="codeSetName" type="String50Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="codeEntry" type="String50Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="shortName" type="String50Type" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:group name="CodeEntryGroup">
<xs:sequence>
<xs:element name="codeEntry" type="String50Type" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>The code.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="shortName" type="String50Type" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>The name corresponding to that code.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="shortDescription" type="MediumDescriptionType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>A description of the code. </xs:documentation>
</xs:annotation>
</xs:element>
</xs:sequence>
</xs:group>
<xs:complexType name="CodeEntryType">
<xs:group ref="CodeEntryGroup"/>
</xs:complexType>
<xs:group name="InsuranceCompanyGroup">
<xs:sequence>
<xs:element name="companyName" type="LongNameType" minOccurs="0" maxOccurs="1"/>
<xs:element name="specialRoutingInformation" type="LongNameType" minOccurs="0" maxOccurs="1"/>
<!--xs:element name="address" type="AddressInformationType" minOccurs="0" maxOccurs="1"/-->
<xs:element name="address" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="postalAddress" type="PostalAddressType" minOccurs="0" maxOccurs="1"/>
<xs:element name="addressPhoneList" type="TelephoneNumberListType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
</xs:element>
</xs:sequence>
</xs:group>
<xs:complexType name="InsuranceCompanyType">
<xs:group ref="InsuranceCompanyGroup"/>
</xs:complexType>
<xs:group name="BankAccountGroup">
<xs:sequence>
<xs:element name="bankAccountIdentifier" type="xs:long" minOccurs="0" maxOccurs="1"/>
<xs:element name="bankAddress" type="PostalAddressType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:group name="ServiceGroup">
<xs:sequence>
<xs:element name="serviceCode" type="String50Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="serviceShortDescription" type="String50Type" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Short description of the service.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="modifierLongDescription" type="String1000Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="alternateDescription" type="String1000Type" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Alternate description of the service, acceptable to be sent on EOBs. Should only be populated when then original description is not suitable for members.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="effectiveStartDate" type="xs:date" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Service effective start date.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="effectiveEndDate" type="xs:date" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Service effective end date.</xs:documentation>
</xs:annotation>
</xs:element>
</xs:sequence>
</xs:group>
<xs:complexType name="ServiceType">
<xs:group ref="ServiceGroup"/>
</xs:complexType>
<!-- Simple Groups -->
<xs:group name="TelephoneNumberGroup">
<xs:annotation>
<xs:documentation>Simple Telephone Number Group</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="phoneCountryCode" type="PhoneCountryCodeType" minOccurs="0" maxOccurs="1"/>
<xs:element name="phoneAreaCode" type="AreaCodeType" minOccurs="0" maxOccurs="1"/>
<xs:element name="phoneNumber" type="PhoneNumberType" minOccurs="0" maxOccurs="1"/>
<xs:element name="phoneExtensionNumber" type="PhoneExtensionType" minOccurs="0" maxOccurs="1"/>
<!-- Phone types are different for Individuals and Organizations -->
<xs:choice>
<xs:element name="individualPhoneTypeCode" type="CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
<xs:element name="organizationPhoneTypeCode" type="CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
</xs:choice>
</xs:sequence>
</xs:group>
<xs:group name="DateSpanGroup">
<xs:annotation>
<xs:documentation>Represents a Date Span from-to date</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="startDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="endDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:complexType name="DateSpanType">
<xs:annotation>
<xs:documentation>Concrete type of Date Span Group</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:group ref="DateSpanGroup"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="CountryCodeDomainType">
<xs:annotation>
<xs:documentation>Concrete type for Country code</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="countryCode" type="stl:ISO3166CountryCode" nillable="true" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="GenericTransactionType">
<xs:sequence>
<xs:element name="transactionInfo" type="GenericTransactionInfoType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="GenericTransactionInfoType">
<xs:sequence>
<xs:element name="transactionId" type="String60Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="transactionType" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="routeName" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="routeId" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="transactionStatus" type="ServiceStatusType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<!-- Simple type restrictions -->
<xs:simpleType name="TaxIdType">
<xs:restriction base="xs:string">
<xs:maxLength value="12"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="AddressLineType">
<xs:annotation>
<xs:documentation>250 Characters (Payor constraint)</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:maxLength value="250"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="AddressInputStringType">
<xs:annotation>
<xs:documentation>250 Characters (Payor constraint)</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:maxLength value="250"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="AreaCodeType">
<xs:restriction base="xs:string">
<xs:maxLength value="3"/>
<xs:pattern value="[0-9][0-9][0-9]"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="CountyCodeType">
<xs:restriction base="xs:string">
<xs:maxLength value="5"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="FormattedTextType">
<xs:annotation>
<xs:documentation>1000 characters (Payor constraint)</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:maxLength value="1000"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="HccClaimLineNumberType">
<xs:annotation>
<xs:documentation>50 Character (Payor Defined)</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:maxLength value="50"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="HccClaimNumberType">
<xs:annotation>
<xs:documentation>30 Characters (Payor Constraint)</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:maxLength value="30"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="LongNameType">
<xs:annotation>
<xs:documentation>150 Characters (Payor Constraint)</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:maxLength value="150"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="MediumDescriptionType">
<xs:annotation>
<xs:documentation>300 Characters</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:maxLength value="300"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="PhoneExtensionType">
<xs:annotation>
<xs:documentation>7 Characters</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:maxLength value="7"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="PhoneNumberType">
<xs:annotation>
<xs:documentation>15 Characters</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:maxLength value="15"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="ZipCodeType">
<xs:annotation>
<xs:documentation>10 Characters (US BIAS)</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:maxLength value="10"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="ZipCodeExtensionType">
<xs:annotation>
<xs:documentation>4 Characters (US BIAS)</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:maxLength value="4"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="ProperNameType">
<xs:annotation>
<xs:documentation>35 Characters (Payor Constraint)</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:maxLength value="35"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="String50Type">
<xs:annotation>
<xs:documentation>50 Characters (Payor Constraint: ITS String type)</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:maxLength value="50"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="String100Type">
<xs:annotation>
<xs:documentation>100 Characters (Payor Constraint: ITS String type)</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:maxLength value="100"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="String150Type">
<xs:annotation>
<xs:documentation>150 Characters (Payor Constraint: ITS String type)</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:maxLength value="150"/>
</xs:restriction>
</xs:simpleType>
<!-- Map from ITS StringIdentifier type -->
<xs:simpleType name="String200Type">
<xs:restriction base="xs:string">
<xs:maxLength value="200"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="String255Type">
<xs:restriction base="xs:string">
<xs:maxLength value="255"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="String300Type">
<xs:restriction base="xs:string">
<xs:maxLength value="300"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="String500Type">
<xs:restriction base="xs:string">
<xs:maxLength value="500"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="String900Type">
<xs:annotation>
<xs:documentation>900 Characters (ITS Text type)</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:maxLength value="900"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="LongStringType">
<xs:annotation>
<xs:documentation>900 Characters (ITS LongString type)</xs:documentation>
</xs:annotation>
<xs:restriction base="String900Type"/>
</xs:simpleType>
<xs:simpleType name="String1000Type">
<xs:restriction base="xs:string">
<xs:maxLength value="1000"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="ExtraLongFormattedTextType">
<xs:annotation>
<xs:documentation>2000 Characters (ITS ExtraLongFormattedText type)</xs:documentation>
</xs:annotation>
<xs:restriction base="String2000Type"/>
</xs:simpleType>
<xs:simpleType name="String2000Type">
<xs:restriction base="xs:string">
<xs:maxLength value="2000"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="String4000Type">
<xs:annotation>
<xs:documentation>Oracle VARCHAR2 constraints</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:maxLength value="4000"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="String20000Type">
<xs:restriction base="xs:string">
<xs:maxLength value="20000"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="CurrencyStringType">
<xs:annotation>
<xs:documentation>Currency</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:maxLength value="12"/>
</xs:restriction>
</xs:simpleType>
<xs:complexType name="CurrencyType">
<xs:annotation>
<xs:documentation>Explicit Currency Type</xs:documentation>
</xs:annotation>
<xs:simpleContent>
<xs:extension base="xs:decimal"/>
</xs:simpleContent>
</xs:complexType>
<xs:simpleType name="PositiveCurrencyType">
<xs:annotation>
<xs:documentation>The Explicit Positive Currency type specifies a positive decimal value.</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:decimal">
<xs:minExclusive value="0"/>
</xs:restriction>
</xs:simpleType>
<xs:complexType name="UnitValueType">
<xs:annotation>
<xs:documentation>Type for unit qualified values</xs:documentation>
</xs:annotation>
<xs:simpleContent>
<xs:extension base="xs:decimal"/>
</xs:simpleContent>
</xs:complexType>
<xs:complexType name="ReferenceType">
<xs:sequence>
<!-- <xs:element name="URI" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="referenceType" minOccurs="0" maxOccurs="1"/> -->
<xs:element name="ID" type="xs:string" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<!--xs:complexType name="ResponseInfoType">
<xs:sequence>
<xs:element name="status" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="error" type="ErrorInfoType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType-->
<xs:group name="ErrorStatusGroup">
<xs:sequence>
<xs:element name="status" type="ServiceStatusType"/>
<!--  SUCCESS or FAILURE -->
<xs:element name="errors" type="ErrorsType" minOccurs="0" maxOccurs="1"/>
<!--  populated in case of FAILURE -->
</xs:sequence>
</xs:group>
<xs:group name="FaultInfoGroup">
<xs:sequence>
<xs:element name="messageCode" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="message" type="xs:string" minOccurs="1" maxOccurs="1"/>
<xs:element name="dateTime" type="xs:dateTime" minOccurs="0" maxOccurs="1"/>
<xs:element name="authenticatedUser" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="traceInfo" type="xs:string" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:group name="ErrorInfoGroup">
<xs:sequence>
<xs:element name="errorType" type="ErrorType" minOccurs="0" maxOccurs="1"/>
<xs:group ref="FaultInfoGroup"/>
</xs:sequence>
</xs:group>
<xs:complexType name="ErrorInfoType">
<xs:group ref="ErrorInfoGroup"/>
</xs:complexType>
<xs:complexType name="ErrorsType">
<xs:sequence>
<xs:element name="error" type="ErrorInfoType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="WarningInfoType">
<xs:group ref="FaultInfoGroup"/>
</xs:complexType>
<xs:complexType name="WarningsType">
<xs:sequence>
<xs:element name="warning" type="WarningInfoType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="TransactionInformationType">
<xs:sequence>
<xs:element name="alreadyInWorkbasket" type="xs:boolean">
<xs:annotation>
<xs:documentation>True if the record is currently in the Payor workbasket.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="blockedByLock" type="xs:boolean">
<xs:annotation>
<xs:documentation>True if the record is locked.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="cvcId" type="xs:long" minOccurs="0">
<xs:annotation>
<xs:documentation>Transaction identifier.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="exceptions" type="TransactionExceptionType" nillable="true" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="lockingUser" type="xs:string" minOccurs="0">
<xs:annotation>
<xs:documentation>If the record is locked, name of the user who has it locked.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="needsRepair" type="xs:boolean">
<xs:annotation>
<xs:documentation>True if the record is in "needs repair" state.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="needsReview" type="xs:boolean">
<xs:annotation>
<xs:documentation>True if the record is in "needs review" state.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="rejected" type="xs:boolean"/>
<xs:element name="transactionSubmitted" type="xs:boolean">
<xs:annotation>
<xs:documentation>True if the transaction is submitted. False if the transaction is locked before submit can occur.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="versionEffectiveDate" type="xs:date" minOccurs="0">
<xs:annotation>
<xs:documentation>As-of date for the transation.</xs:documentation>
</xs:annotation>
</xs:element>
</xs:sequence>
</xs:complexType>
<xs:complexType name="TransactionExceptionType">
<xs:sequence>
<xs:element name="exceptionType" type="TransactionExceptionStatusType" minOccurs="0">
<xs:annotation>
<xs:documentation>One of the following enumerated values: Repair, Review, Reject, Warn.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="messageCode" type="xs:string" minOccurs="0">
<xs:annotation>
<xs:documentation>Message code that applies to the error.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="messageDescription" type="xs:string" minOccurs="0">
<xs:annotation>
<xs:documentation>Message description that applies to the error code.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="policyName" type="xs:string" minOccurs="0">
<xs:annotation>
<xs:documentation>HealthRules Payor policy that triggered the exception.</xs:documentation>
</xs:annotation>
</xs:element>
</xs:sequence>
</xs:complexType>
<xs:simpleType name="TransactionExceptionStatusType">
<xs:restriction base="xs:string">
<xs:enumeration value="Repair"/>
<xs:enumeration value="Review"/>
<xs:enumeration value="Reject"/>
<xs:enumeration value="Warn"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="PhoneCountryCodeType">
<xs:annotation>
<xs:documentation>Phone Country Code Derived from ITS</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:enumeration value="93"/>
<xs:enumeration value="355"/>
<xs:enumeration value="213"/>
<xs:enumeration value="684"/>
<xs:enumeration value="376"/>
<xs:enumeration value="244"/>
<xs:enumeration value="1-264"/>
<xs:enumeration value="672"/>
<xs:enumeration value="1-268"/>
<xs:enumeration value="54"/>
<xs:enumeration value="374"/>
<xs:enumeration value="297"/>
<xs:enumeration value="247"/>
<xs:enumeration value="61"/>
<xs:enumeration value="43"/>
<xs:enumeration value="994"/>
<xs:enumeration value="1-242"/>
<xs:enumeration value="973"/>
<xs:enumeration value="880"/>
<xs:enumeration value="1-246"/>
<xs:enumeration value="375"/>
<xs:enumeration value="32"/>
<xs:enumeration value="501"/>
<xs:enumeration value="229"/>
<xs:enumeration value="1-441"/>
<xs:enumeration value="975"/>
<xs:enumeration value="591"/>
<xs:enumeration value="387"/>
<xs:enumeration value="267"/>
<xs:enumeration value="55"/>
<xs:enumeration value="1-284"/>
<xs:enumeration value="673"/>
<xs:enumeration value="359"/>
<xs:enumeration value="226"/>
<xs:enumeration value="257"/>
<xs:enumeration value="855"/>
<xs:enumeration value="237"/>
<xs:enumeration value="238"/>
<xs:enumeration value="1-345"/>
<xs:enumeration value="236"/>
<xs:enumeration value="235"/>
<xs:enumeration value="56"/>
<xs:enumeration value="86"/>
<xs:enumeration value="61-8"/>
<xs:enumeration value="57"/>
<xs:enumeration value="269"/>
<xs:enumeration value="242"/>
<xs:enumeration value="243"/>
<xs:enumeration value="682"/>
<xs:enumeration value="506"/>
<xs:enumeration value="385"/>
<xs:enumeration value="53"/>
<xs:enumeration value="5399"/>
<xs:enumeration value="357"/>
<xs:enumeration value="420"/>
<xs:enumeration value="45"/>
<xs:enumeration value="246"/>
<xs:enumeration value="253"/>
<xs:enumeration value="1-767"/>
<xs:enumeration value="1-809"/>
<xs:enumeration value="670"/>
<xs:enumeration value="593"/>
<xs:enumeration value="20"/>
<xs:enumeration value="503"/>
<xs:enumeration value="88213"/>
<xs:enumeration value="240"/>
<xs:enumeration value="291"/>
<xs:enumeration value="372"/>
<xs:enumeration value="251"/>
<xs:enumeration value="298"/>
<xs:enumeration value="500"/>
<xs:enumeration value="679"/>
<xs:enumeration value="358"/>
<xs:enumeration value="33"/>
<xs:enumeration value="596"/>
<xs:enumeration value="594"/>
<xs:enumeration value="689"/>
<xs:enumeration value="241"/>
<xs:enumeration value="220"/>
<xs:enumeration value="995"/>
<xs:enumeration value="49"/>
<xs:enumeration value="233"/>
<xs:enumeration value="350"/>
<xs:enumeration value="881"/>
<xs:enumeration value="30"/>
<xs:enumeration value="299"/>
<xs:enumeration value="1-473"/>
<xs:enumeration value="590"/>
<xs:enumeration value="1-671"/>
<xs:enumeration value="502"/>
<xs:enumeration value="224"/>
<xs:enumeration value="245"/>
<xs:enumeration value="592"/>
<xs:enumeration value="509"/>
<xs:enumeration value="504"/>
<xs:enumeration value="852"/>
<xs:enumeration value="36"/>
<xs:enumeration value="354"/>
<xs:enumeration value="91"/>
<xs:enumeration value="62"/>
<xs:enumeration value="871"/>
<xs:enumeration value="874"/>
<xs:enumeration value="873"/>
<xs:enumeration value="872"/>
<xs:enumeration value="870"/>
<xs:enumeration value="98"/>
<xs:enumeration value="964"/>
<xs:enumeration value="353"/>
<xs:enumeration value="8816"/>
<xs:enumeration value="8817"/>
<xs:enumeration value="972"/>
<xs:enumeration value="39"/>
<xs:enumeration value="225"/>
<xs:enumeration value="1-876"/>
<xs:enumeration value="81"/>
<xs:enumeration value="962"/>
<xs:enumeration value="254"/>
<xs:enumeration value="686"/>
<xs:enumeration value="850"/>
<xs:enumeration value="82"/>
<xs:enumeration value="965"/>
<xs:enumeration value="996"/>
<xs:enumeration value="856"/>
<xs:enumeration value="371"/>
<xs:enumeration value="961"/>
<xs:enumeration value="266"/>
<xs:enumeration value="231"/>
<xs:enumeration value="218"/>
<xs:enumeration value="423"/>
<xs:enumeration value="370"/>
<xs:enumeration value="352"/>
<xs:enumeration value="853"/>
<xs:enumeration value="389"/>
<xs:enumeration value="261"/>
<xs:enumeration value="265"/>
<xs:enumeration value="60"/>
<xs:enumeration value="960"/>
<xs:enumeration value="223"/>
<xs:enumeration value="356"/>
<xs:enumeration value="692"/>
<xs:enumeration value="222"/>
<xs:enumeration value="230"/>
<xs:enumeration value="52"/>
<xs:enumeration value="691"/>
<xs:enumeration value="1-808"/>
<xs:enumeration value="373"/>
<xs:enumeration value="377"/>
<xs:enumeration value="976"/>
<xs:enumeration value="1-664"/>
<xs:enumeration value="212"/>
<xs:enumeration value="258"/>
<xs:enumeration value="95"/>
<xs:enumeration value="264"/>
<xs:enumeration value="674"/>
<xs:enumeration value="977"/>
<xs:enumeration value="31"/>
<xs:enumeration value="599"/>
<xs:enumeration value="687"/>
<xs:enumeration value="64"/>
<xs:enumeration value="505"/>
<xs:enumeration value="227"/>
<xs:enumeration value="234"/>
<xs:enumeration value="683"/>
<xs:enumeration value="1-670"/>
<xs:enumeration value="47"/>
<xs:enumeration value="968"/>
<xs:enumeration value="92"/>
<xs:enumeration value="680"/>
<xs:enumeration value="970"/>
<xs:enumeration value="507"/>
<xs:enumeration value="675"/>
<xs:enumeration value="595"/>
<xs:enumeration value="51"/>
<xs:enumeration value="63"/>
<xs:enumeration value="48"/>
<xs:enumeration value="351"/>
<xs:enumeration value="1-787"/>
<xs:enumeration value="1-939"/>
<xs:enumeration value="974"/>
<xs:enumeration value="262"/>
<xs:enumeration value="40"/>
<xs:enumeration value="7"/>
<xs:enumeration value="250"/>
<xs:enumeration value="378"/>
<xs:enumeration value="239"/>
<xs:enumeration value="966"/>
<xs:enumeration value="221"/>
<xs:enumeration value="381"/>
<xs:enumeration value="248"/>
<xs:enumeration value="232"/>
<xs:enumeration value="65"/>
<xs:enumeration value="421"/>
<xs:enumeration value="386"/>
<xs:enumeration value="677"/>
<xs:enumeration value="252"/>
<xs:enumeration value="27"/>
<xs:enumeration value="34"/>
<xs:enumeration value="94"/>
<xs:enumeration value="290"/>
<xs:enumeration value="1-869"/>
<xs:enumeration value="1-758"/>
<xs:enumeration value="508"/>
<xs:enumeration value="1-784"/>
<xs:enumeration value="249"/>
<xs:enumeration value="597"/>
<xs:enumeration value="268"/>
<xs:enumeration value="46"/>
<xs:enumeration value="41"/>
<xs:enumeration value="963"/>
<xs:enumeration value="886"/>
<xs:enumeration value="992"/>
<xs:enumeration value="255"/>
<xs:enumeration value="66"/>
<xs:enumeration value="88216"/>
<xs:enumeration value="228"/>
<xs:enumeration value="690"/>
<xs:enumeration value="676"/>
<xs:enumeration value="1-868"/>
<xs:enumeration value="216"/>
<xs:enumeration value="90"/>
<xs:enumeration value="993"/>
<xs:enumeration value="1-649"/>
<xs:enumeration value="688"/>
<xs:enumeration value="256"/>
<xs:enumeration value="380"/>
<xs:enumeration value="971"/>
<xs:enumeration value="44"/>
<xs:enumeration value="1"/>
<xs:enumeration value="878"/>
<xs:enumeration value="598"/>
<xs:enumeration value="1-340"/>
<xs:enumeration value="998"/>
<xs:enumeration value="678"/>
<xs:enumeration value="58"/>
<xs:enumeration value="84"/>
<xs:enumeration value="808"/>
<xs:enumeration value="681"/>
<xs:enumeration value="685"/>
<xs:enumeration value="967"/>
<xs:enumeration value="260"/>
<xs:enumeration value="263"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="ToothNameDomainType">
<xs:annotation>
<xs:documentation>
1 "1" "Permanent Maxillary Right Third Molar"
2 "2" "Permanent Maxillary Right Second Molar"
3 "3" "Permanent Maxillary Right First Molar"
4 "4" "Permanent Maxillary Right Second Premolar"
5 "5" "Permanent Maxillary Right First Premolar"
6 "6" "Permanent Maxillary Right Canine"
7 "7" "Permanent Maxillary Right Lateral Incisor"
8 "8" "Permanent Maxillary Right Central Incisor"
9 "9" "Permanent Maxillary Left Central Incisor"
10 "10" "Permanent Maxillary Left Lateral Incisor"
11 "11" "Permanent Maxillary Left Canine"
12 "12" "Permanent Maxillary Left First Premolar"
13 "13" "Permanent Maxillary Left Second Premolar"
14 "14" "Permanent Maxillary Left First Molar"
15 "15" "Permanent Maxillary Left Second Molar"
16 "16" "Permanent Maxillary Left Third Molar"
17 "17" "Permanent Mandibular Left Third Molar"
18 "18" "Permanent Mandibular Left Second Molar"
19 "19" "Permanent Mandibular Left First Molar"
20 "20" "Permanent Mandibular Left Second Premolar"
21 "21" "Permanent Mandibular Left First Premolar"
22 "22" "Permanent Mandibular Left Canine"
23 "23" "Permanent Mandibular Left Lateral Incisor"
24 "24" "Permanent Mandibular Left Central Incisor"
25 "25" "Permanent Mandibular Right Central Incisor"
26 "26" "Permanent Mandibular Right Lateral Incisor"
27 "27" "Permanent Mandibular Right Canine"
28 "28" "Permanent Mandibular Right First Premolar"
29 "29" "Permanent Mandibular Right Left Second Premolar"
30 "30" "Permanent Mandibular Right First Molar"
31 "31" "Permanent Mandibular Right Left Second Molar"
32 "32" "Permanent Mandibular Right Third Molar"
A "A" "Primary Maxillary Right Second Molar"
B "B" "Primary Maxillary Right First Molar"
C "C" "Primary Maxillary Right Canine Molar"
D "D" "Primary Maxillary Right Lateral Incisor"
E "E" "Primary Maxillary Right Central Incisor"
F "F" "Primary Maxillary Left Central Incisor"
G "G" "Primary Maxillary Left Lateral Incisor"
H "H" "Primary Maxillary Left Canine Molar"
I "I" "Primary Maxillary Left First Molar"
J "J" "Primary Maxillary Left Second Molar"
K "K" "Primary Mandibular Left Second Molar"
L "L" "Primary Mandibular Left First Molar"
M "M" "Primary Mandibular Left Canine Molar"
N "N" "Primary Mandibular Left Lateral Incisor"
O "O" "Primary Mandibular Left Central Incisor"
P "P" "Primary Mandibular Right Central Incisor"
Q "Q" "Primary Mandibular Right Lateral Incisor"
R "R" "Primary Mandibular Right Canine Molar"
S "S" "Primary Mandibular Right First Molar"
T "T" "Primary Mandibular Right Second Molar"
51 "51" "Super Permanent Maxillary Right Third Molar"
52 "52" "Super Permanent Maxillary Right Second Molar"
53 "53" "Super Permanent Maxillary Right First Molar"
54 "54" "Super Permanent Maxillary Right Second Premolar"
55 "55" "Super Permanent Maxillary Right First Premolar"
56 "56" "Super Permanent Maxillary Right Canine"
57 "57" "Super Permanent Maxillary Right Lateral Incisor"
58 "58" "Super Permanent Maxillary Right Central Incisor"
59 "59" "Super Permanent Maxillary Left Central Incisor"
60 "60" "Super Permanent Maxillary Left Lateral Incisor"
61 "61" "Super Permanent Maxillary Left Canine"
62 "62" "Super Permanent Maxillary Left First Premolar"
63 "63" "Super Permanent Maxillary Left Second Premolar"
64 "64" "Super Permanent Maxillary Left First Molar"
65 "65" "Super Permanent Maxillary Left Second Molar"
66 "66" "Super Permanent Maxillary Left Third Molar"
67 "67" "Super Permanent Mandibular Left Third Molar"
68 "68" "Super Permanent Mandibular Left Second Molar"
69 "69" "Super Permanent Mandibular Left First Molar"
70 "70" "Super Permanent Mandibular Left Second Premolar"
71 "71" "Super Permanent Mandibular Left First Premolar"
72 "72" "Super Permanent Mandibular Left Canine"
73 "73" "Super Permanent Mandibular Left Lateral Incisor"
74 "74" "Super Permanent Mandibular Left Central Incisor"
75 "75" "Super Permanent Mandibular Right Central Incisor"
76 "76" "Super Permanent Mandibular Right Lateral Incisor"
77 "77" "Super Permanent Mandibular Right Canine"
78 "78" "Super Permanent Mandibular Right First Premolar"
79 "79" "Super Permanent Mandibular Right Left Second Premolar"
80 "80" "Super Permanent Mandibular Right First Molar"
81 "81" "Super Permanent Mandibular Right Left Second Molar"
82 "82" "Super Permanent Mandibular Right Third Molar"
AS "AS" "Super Primary Maxillary Right Second Molar"
BS "BS" "Super Primary Maxillary Right First Molar"
CS "CS" "Super Primary Maxillary Right Canine Molar"
DS "DS" "Super Primary Maxillary Right Lateral Incisor"
ES "ES" "Super Primary Maxillary Right Central Incisor"
FS "FS" "Super Primary Maxillary Left Central Incisor"
GS "GS" "Super Primary Maxillary Left Lateral Incisor"
HS "HS" "Super Primary Maxillary Left Canine Molar"
IS "IS" "Super Primary Maxillary Left First Molar"
JS "JS" "Super Primary Maxillary Left Second Molar"
KS "KS" "Super Primary Mandibular Left Second Molar"
LS "LS" "Super Primary Mandibular Left First Molar"
MS "MS" "Super Primary Mandibular Left Canine Molar"
NS "NS" "Super Primary Mandibular Left Lateral Incisor"
OS "OS" "Super Primary Mandibular Left Central Incisor"
PS "PS" "Super Primary Mandibular Right Central Incisor"
QS "QS" "Super Primary Mandibular Right Lateral Incisor"
RS "RS" "Super Primary Mandibular Right Canine Molar"
SS "SS" "Super Primary Mandibular Right First Molar"
TS "TS" "Super Primary Mandibular Right Second Molar"
</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:enumeration value="1"/>
<xs:enumeration value="2"/>
<xs:enumeration value="3"/>
<xs:enumeration value="4"/>
<xs:enumeration value="5"/>
<xs:enumeration value="6"/>
<xs:enumeration value="7"/>
<xs:enumeration value="8"/>
<xs:enumeration value="9"/>
<xs:enumeration value="10"/>
<xs:enumeration value="11"/>
<xs:enumeration value="12"/>
<xs:enumeration value="13"/>
<xs:enumeration value="14"/>
<xs:enumeration value="15"/>
<xs:enumeration value="16"/>
<xs:enumeration value="17"/>
<xs:enumeration value="18"/>
<xs:enumeration value="19"/>
<xs:enumeration value="20"/>
<xs:enumeration value="21"/>
<xs:enumeration value="22"/>
<xs:enumeration value="23"/>
<xs:enumeration value="24"/>
<xs:enumeration value="25"/>
<xs:enumeration value="26"/>
<xs:enumeration value="27"/>
<xs:enumeration value="28"/>
<xs:enumeration value="29"/>
<xs:enumeration value="30"/>
<xs:enumeration value="31"/>
<xs:enumeration value="32"/>
<xs:enumeration value="A"/>
<xs:enumeration value="B"/>
<xs:enumeration value="C"/>
<xs:enumeration value="D"/>
<xs:enumeration value="E"/>
<xs:enumeration value="F"/>
<xs:enumeration value="G"/>
<xs:enumeration value="H"/>
<xs:enumeration value="I"/>
<xs:enumeration value="J"/>
<xs:enumeration value="K"/>
<xs:enumeration value="L"/>
<xs:enumeration value="M"/>
<xs:enumeration value="N"/>
<xs:enumeration value="O"/>
<xs:enumeration value="P"/>
<xs:enumeration value="Q"/>
<xs:enumeration value="R"/>
<xs:enumeration value="S"/>
<xs:enumeration value="T"/>
<xs:enumeration value="51"/>
<xs:enumeration value="52"/>
<xs:enumeration value="53"/>
<xs:enumeration value="54"/>
<xs:enumeration value="55"/>
<xs:enumeration value="56"/>
<xs:enumeration value="57"/>
<xs:enumeration value="58"/>
<xs:enumeration value="59"/>
<xs:enumeration value="60"/>
<xs:enumeration value="61"/>
<xs:enumeration value="62"/>
<xs:enumeration value="63"/>
<xs:enumeration value="64"/>
<xs:enumeration value="65"/>
<xs:enumeration value="66"/>
<xs:enumeration value="67"/>
<xs:enumeration value="68"/>
<xs:enumeration value="69"/>
<xs:enumeration value="70"/>
<xs:enumeration value="71"/>
<xs:enumeration value="72"/>
<xs:enumeration value="73"/>
<xs:enumeration value="74"/>
<xs:enumeration value="75"/>
<xs:enumeration value="76"/>
<xs:enumeration value="77"/>
<xs:enumeration value="78"/>
<xs:enumeration value="79"/>
<xs:enumeration value="80"/>
<xs:enumeration value="81"/>
<xs:enumeration value="82"/>
<xs:enumeration value="AS"/>
<xs:enumeration value="BS"/>
<xs:enumeration value="CS"/>
<xs:enumeration value="DS"/>
<xs:enumeration value="ES"/>
<xs:enumeration value="FS"/>
<xs:enumeration value="GS"/>
<xs:enumeration value="HS"/>
<xs:enumeration value="IS"/>
<xs:enumeration value="JS"/>
<xs:enumeration value="KS"/>
<xs:enumeration value="LS"/>
<xs:enumeration value="MS"/>
<xs:enumeration value="NS"/>
<xs:enumeration value="OS"/>
<xs:enumeration value="PS"/>
<xs:enumeration value="QS"/>
<xs:enumeration value="RS"/>
<xs:enumeration value="SS"/>
<xs:enumeration value="TS"/>
</xs:restriction>
</xs:simpleType>
<xs:complexType name="DiagnosisCodePointerListType">
<xs:sequence>
<xs:element name="diagnosisCodePointer" type="String50Type" minOccurs="0" maxOccurs="4"/>
</xs:sequence>
</xs:complexType>
<xs:simpleType name="USStateTerritoryCode">
<xs:annotation>
<xs:documentation>
Two-letter code for one of the 59 U.S. states/territories.
</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:enumeration value="AL"/>
<xs:enumeration value="AK"/>
<xs:enumeration value="AS"/>
<xs:enumeration value="AZ"/>
<xs:enumeration value="AR"/>
<xs:enumeration value="CA"/>
<xs:enumeration value="CO"/>
<xs:enumeration value="CT"/>
<xs:enumeration value="DE"/>
<xs:enumeration value="DC"/>
<xs:enumeration value="FM"/>
<xs:enumeration value="FL"/>
<xs:enumeration value="GA"/>
<xs:enumeration value="GU"/>
<xs:enumeration value="HI"/>
<xs:enumeration value="ID"/>
<xs:enumeration value="IL"/>
<xs:enumeration value="IN"/>
<xs:enumeration value="IA"/>
<xs:enumeration value="KS"/>
<xs:enumeration value="KY"/>
<xs:enumeration value="LA"/>
<xs:enumeration value="ME"/>
<xs:enumeration value="MH"/>
<xs:enumeration value="MD"/>
<xs:enumeration value="MA"/>
<xs:enumeration value="MI"/>
<xs:enumeration value="MN"/>
<xs:enumeration value="MS"/>
<xs:enumeration value="MO"/>
<xs:enumeration value="MT"/>
<xs:enumeration value="NE"/>
<xs:enumeration value="NV"/>
<xs:enumeration value="NH"/>
<xs:enumeration value="NJ"/>
<xs:enumeration value="NM"/>
<xs:enumeration value="NY"/>
<xs:enumeration value="NC"/>
<xs:enumeration value="ND"/>
<xs:enumeration value="MP"/>
<xs:enumeration value="OH"/>
<xs:enumeration value="OK"/>
<xs:enumeration value="OR"/>
<xs:enumeration value="PW"/>
<xs:enumeration value="PA"/>
<xs:enumeration value="PR"/>
<xs:enumeration value="RI"/>
<xs:enumeration value="SC"/>
<xs:enumeration value="SD"/>
<xs:enumeration value="TN"/>
<xs:enumeration value="TX"/>
<xs:enumeration value="UT"/>
<xs:enumeration value="VT"/>
<xs:enumeration value="VI"/>
<xs:enumeration value="VA"/>
<xs:enumeration value="WA"/>
<xs:enumeration value="WV"/>
<xs:enumeration value="WI"/>
<xs:enumeration value="WY"/>
<!-- ALABAMA -->
<!-- ALASKA -->
<!-- AMERICAN SAMOA -->
<!-- ARIZONA -->
<!-- ARKANSAS -->
<!-- CALIFORNIA -->
<!-- COLORADO -->
<!-- CONNECTICUT -->
<!-- DELAWARE -->
<!-- DISTRICT OF COLUMBIA -->
<!-- FEDERATED STATES OF MICRONESIA -->
<!-- FLORIDA -->
<!-- GEORGIA -->
<!-- GUAM -->
<!-- HAWAII -->
<!-- IDAHO -->
<!-- ILLINOIS -->
<!-- INDIANA -->
<!-- IOWA -->
<!-- KANSAS -->
<!-- KENTUCKY -->
<!-- LOUISIANA -->
<!-- MAINE -->
<!-- MARSHALL ISLANDS -->
<!-- MARYLAND -->
<!-- MASSACHUSETTS -->
<!-- MICHIGAN -->
<!-- MINNESOTA -->
<!-- MISSISSIPPI -->
<!-- MISSOURI -->
<!-- MONTANA -->
<!-- NEBRASKA -->
<!-- NEVADA -->
<!-- NEW HAMPSHIRE -->
<!-- NEW JERSEY -->
<!-- NEW MEXICO -->
<!-- NEW YORK -->
<!-- NORTH CAROLINA -->
<!-- NORTH DAKOTA -->
<!-- NORTHERN MARIANA ISLANDS -->
<!-- OHIO -->
<!-- OKLAHOMA -->
<!-- OREGON -->
<!-- PALAU -->
<!-- PENNSYLVANIA -->
<!-- PUERTO RICO -->
<!-- RHODE ISLAND -->
<!-- SOUTH CAROLINA -->
<!-- SOUTH DAKOTA -->
<!-- TENNESSEE -->
<!-- TEXAS -->
<!-- UTAH -->
<!-- VERMONT -->
<!-- VIRGIN ISLANDS -->
<!-- VIRGINIA -->
<!-- WASHINGTON -->
<!-- WEST VIRGINIA -->
<!-- WISCONSIN -->
<!-- WYOMING -->
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="SmokingStatusType">
<xs:restriction base="xs:string">
<xs:enumeration value="Smoker"/>
<xs:enumeration value="Non Smoker"/>
<xs:enumeration value="Unknown"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="SSNType">
<xs:restriction base="xs:string">
<xs:maxLength value="12"/>
<xs:pattern value="(\s)|([0-9][0-9][0-9]\-[0-9][0-9]\-[0-9][0-9][0-9][0-9])"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="DisabilityTypeDomainType">
<xs:restriction base="xs:string">
<xs:enumeration value="Awaiting Verification"/>
<xs:enumeration value="No Verification Received"/>
<xs:enumeration value="Verification Under Review"/>
<xs:enumeration value="Indefinitely Approved"/>
<xs:enumeration value="Temporarily Approved"/>
<xs:enumeration value="Awaiting Re-verification"/>
<xs:enumeration value="Denied"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="VerificationType">
<xs:restriction base="xs:string">
<xs:enumeration value="Student Verification"/>
<xs:enumeration value="Disabled Dependent"/>
<xs:enumeration value="Dependent Attestation"/>
<xs:enumeration value="Work Related Death"/>
<xs:enumeration value="Retired State Police Affirmation"/>
<xs:enumeration value="MSP Waiver"/>
<xs:enumeration value="SSN Waiver"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="StudentStatusDomainType">
<xs:restriction base="xs:string">
<xs:enumeration value="Full-time"/>
<xs:enumeration value="Not a Student"/>
<xs:enumeration value="Part-time"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="SalaryIntervalDomainType">
<xs:restriction base="xs:string">
<xs:enumeration value="Semi-Monthly"/>
<xs:enumeration value="Quarterly"/>
<xs:enumeration value="Weekly"/>
<xs:enumeration value="Bi-Weekly"/>
<xs:enumeration value="Monthly"/>
<xs:enumeration value="Annually"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="SourceOfAuthorizationDomainType">
<xs:restriction base="xs:string">
<xs:enumeration value="Enrollment application"/>
<xs:enumeration value="Continuation of coverage"/>
<xs:enumeration value="Court documents"/>
<xs:enumeration value="Written request"/>
<xs:enumeration value="Verbal request"/>
<xs:enumeration value="Power of Attorney"/>
<xs:enumeration value="Short Certificate"/>
<xs:enumeration value="Other Required Documentation"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="PHIAuthorizationType">
<xs:restriction base="xs:string">
<xs:enumeration value="Use"/>
<xs:enumeration value="Disclose"/>
<xs:enumeration value="Use and Disclose"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="ErrorType">
<xs:restriction base="xs:string">
<xs:enumeration value="SYSTEM"/>
<xs:enumeration value="POLICY"/>
<xs:enumeration value="ACTIVITY"/>
<xs:enumeration value="PERMISSION"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="ExcessResponsibilityDomainType">
<xs:restriction base="xs:string">
<xs:enumeration value="Billed Amount"/>
<xs:enumeration value="Allowed Amount"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="BaseNetworkClassificationCodeType">
<xs:restriction base="xs:string">
<xs:enumeration value="In-Network"/>
<xs:enumeration value="Out-of-Network"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="ResponsibilitySequenceType">
<xs:restriction base="xs:string">
<xs:enumeration value="Primary"/>
<xs:enumeration value="Secondary"/>
<xs:enumeration value="Tertiary"/>
<xs:enumeration value="Equal Split"/>
<xs:enumeration value="Unknown"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="TransactionType">
<xs:restriction base="xs:string">
<xs:enumeration value="Amend"/>
<xs:enumeration value="Terminate"/>
<xs:enumeration value="Create"/>
<xs:enumeration value="NoChange"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="CommunicationContactMethodType">
<xs:annotation>
<xs:documentation>
1 "Phone"
2 "Email"
3 "Text Message"
4 "Fax"
5 "Other"
6. "EMPTY_VALUE_INDICATED" syntax for clearing out previously set values
7 "Alternate Format"
</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:enumeration value="Phone"/>
<xs:enumeration value="Email"/>
<xs:enumeration value="Text Message"/>
<xs:enumeration value="Fax"/>
<xs:enumeration value="Other"/>
<xs:enumeration value="EMPTY_VALUE_INDICATED"/>
<xs:enumeration value="Alternate Format"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="OIPolicyTypeDomainType">
<xs:annotation>
<xs:documentation>
1 "1" "Medicare Part A"
2 "2" "Medicare Part B"
3 "3" "Medicare Part A and B"
4 "4" "Medicare Unknown"
5 "5" "Medicare - ESRD"
6 "6" "Medicare Part A only - ESRD"
7 "7" "Non-Medicare"
8 "TRICARE" "Tricare Military Health Insurance"
9 "9" "Medicare Part C"
10 "10" "Medicare Part D"
11 "11" "Medicare Part C and D"
12 "12" "Medicare Supplement"
13 "13" "Commercial"
</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:enumeration value="1"/>
<xs:enumeration value="2"/>
<xs:enumeration value="3"/>
<xs:enumeration value="4"/>
<xs:enumeration value="5"/>
<xs:enumeration value="6"/>
<xs:enumeration value="7"/>
<xs:enumeration value="8"/>
<xs:enumeration value="9"/>
<xs:enumeration value="10"/>
<xs:enumeration value="11"/>
<xs:enumeration value="12"/>
<xs:enumeration value="13"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="WorkbasketType">
<xs:restriction base="xs:string">
<xs:enumeration value="Repair"/>
<xs:enumeration value="Review"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="ExceptionType">
<xs:restriction base="xs:string">
<xs:enumeration value="Validation"/>
<xs:enumeration value="Transformation"/>
<xs:enumeration value="Propagation"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="ServiceStatusType">
<xs:annotation>
<xs:documentation>Enumeration: returns pre-defined status</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:enumeration value="Match Found"/>
<xs:enumeration value="No Match Found"/>
<xs:enumeration value="Multiple Match Found"/>
<xs:enumeration value="No Member Found"/>
<xs:enumeration value="SUCCESS"/>
<xs:enumeration value="FAILURE"/>
<xs:enumeration value="WARNING"/>
<xs:enumeration value="No Change"/>
<xs:enumeration value="ERROR"/>
<xs:enumeration value="Not Processed"/>
<xs:enumeration value="Cancel Already Processed"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="ListUpdateModeType">
<xs:restriction base="xs:string">
<xs:enumeration value="MERGE"/>
<xs:enumeration value="REPLACE"/>
<!-- Add new list to existing list, performing update when match is found -->
<!-- Replace existing list with new list -->
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="ServiceTypeCodeType">
<xs:restriction base="xs:string">
<xs:enumeration value="ADA code"/>
<xs:enumeration value="CPT-4 code"/>
<xs:enumeration value="HCPCS code"/>
<xs:enumeration value="Homegrown Code"/>
<xs:enumeration value="HIEC code"/>
<xs:enumeration value="NDC 5-4-2"/>
<xs:enumeration value="UB Revenue Code"/>
<xs:enumeration value="HIPPS Code"/>
<xs:enumeration value="UPN"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="ListActionType">
<xs:restriction base="xs:string">
<xs:enumeration value="DEFAULT"/>
<xs:enumeration value="REPLACE"/>
<!-- Apply default logic -->
<!-- Replace existing list with new list -->
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="String1Type">
<xs:annotation>
<xs:documentation>1 Characters</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:maxLength value="1"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="String2Type">
<xs:annotation>
<xs:documentation>2 Characters</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:maxLength value="2"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="String3Type">
<xs:annotation>
<xs:documentation>3 Characters</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:maxLength value="3"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="String4Type">
<xs:annotation>
<xs:documentation>4 Characters</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:maxLength value="4"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="String5Type">
<xs:annotation>
<xs:documentation>5 Characters</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:maxLength value="5"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="String8Type">
<xs:annotation>
<xs:documentation>8 Characters</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:maxLength value="8"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="String9Type">
<xs:annotation>
<xs:documentation>9 Characters</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:maxLength value="9"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="String10Type">
<xs:annotation>
<xs:documentation>10 Characters</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:maxLength value="10"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="String12Type">
<xs:annotation>
<xs:documentation>12 Characters</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:maxLength value="12"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="String15Type">
<xs:annotation>
<xs:documentation>15 Characters</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:maxLength value="15"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="String16Type">
<xs:annotation>
<xs:documentation>16 Characters</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:maxLength value="16"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="String18Type">
<xs:annotation>
<xs:documentation>18 Characters</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:maxLength value="18"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="String25Type">
<xs:annotation>
<xs:documentation>25 Characters</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:maxLength value="25"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="String30Type">
<xs:annotation>
<xs:documentation>30 Characters</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:maxLength value="30"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="String35Type">
<xs:annotation>
<xs:documentation>35 Characters</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:maxLength value="35"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="String48Type">
<xs:annotation>
<xs:documentation>48 Characters</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:maxLength value="48"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="String60Type">
<xs:annotation>
<xs:documentation>60 Characters</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:maxLength value="60"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="String80Type">
<xs:annotation>
<xs:documentation>80 Characters</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:maxLength value="80"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="String256Type">
<xs:annotation>
<xs:documentation>256 Characters</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:maxLength value="256"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="MonthNameType">
<xs:annotation>
<xs:documentation/>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:enumeration value="JAN"/>
<xs:enumeration value="FEB"/>
<xs:enumeration value="MAR"/>
<xs:enumeration value="APR"/>
<xs:enumeration value="MAY"/>
<xs:enumeration value="JUN"/>
<xs:enumeration value="JUL"/>
<xs:enumeration value="AUG"/>
<xs:enumeration value="SEP"/>
<xs:enumeration value="OCT"/>
<xs:enumeration value="NOV"/>
<xs:enumeration value="DEC"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="WorkFlowActionCodeType">
<xs:annotation>
<xs:documentation/>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:enumeration value="Continue CVC"/>
<xs:enumeration value="Cancel CVC"/>
<xs:enumeration value="Fulfill With Code"/>
<xs:enumeration value="Review/Repair"/>
<xs:enumeration value="Repair"/>
<xs:enumeration value="Review"/>
<xs:enumeration value="Repricing"/>
<xs:enumeration value="Requires Funding"/>
<xs:enumeration value="External System"/>
<xs:enumeration value="Requires Funding Request Pre-Approval"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="ProviderRoleType">
<xs:annotation>
<xs:documentation/>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:enumeration value="PCP"/>
<xs:enumeration value="OBGYN"/>
<xs:enumeration value="Mental Health Facility"/>
<xs:enumeration value="Home Hospital"/>
<xs:enumeration value="Primary Network"/>
<xs:enumeration value="Fitness Center"/>
<xs:enumeration value="Obstetrics and Gynecology Facility"/>
<xs:enumeration value="Laboratory"/>
<xs:enumeration value="Facility"/>
<xs:enumeration value="Optometrist"/>
<xs:enumeration value="Pharmacy"/>
<xs:enumeration value="Dentist"/>
<xs:enumeration value="Managed Care Organization"/>
<xs:enumeration value="Restricted Physician"/>
<xs:enumeration value="Restricted Clinic"/>
<xs:enumeration value="Restricted Hospital"/>
<xs:enumeration value="Restricted Pharmacy"/>
<xs:enumeration value="Care Coordination Organization"/>
<xs:enumeration value="Care Coordinator"/>
</xs:restriction>
</xs:simpleType>
<xs:complexType name="LicenseNumberListType">
<xs:sequence>
<xs:element name="listMode" type="ListUpdateModeType" minOccurs="0" maxOccurs="1"/>
<xs:element name="licenseNumber" type="LicenseNumberType" minOccurs="0" maxOccurs="unbounded" />
</xs:sequence>
</xs:complexType>
<xs:complexType name="LicenseNumberType">
<xs:sequence>
<xs:element name="licenseNumber" type="String50Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="licenseState" type="String900Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="licenseCountry" type="CountryCodeDomainType" minOccurs="0" maxOccurs="1"/>
<xs:element name="effectiveStartDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="effectiveEndDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="typeOfLicense" type="CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
<xs:element name="licenseTerminateReason" type="CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="IdentificationNumberListType">
<xs:sequence>
<xs:element name="listMode" type="ListUpdateModeType" minOccurs="0" maxOccurs="1"/>
<xs:element name="identificationNumber" type="IdentificationNumberType" minOccurs="0" maxOccurs="unbounded" />
</xs:sequence>
</xs:complexType>
<xs:complexType name="ClaimReviewListType">
<xs:sequence>
<xs:element name="listMode" type="ListUpdateModeType" minOccurs="0" maxOccurs="1"/>
<xs:element name="claimReview" type="ClaimReviewType" minOccurs="0" maxOccurs="unbounded" />
</xs:sequence>
</xs:complexType>
<xs:complexType name="ClaimReviewType">
<xs:sequence>
<xs:element name="enableClaimReview" type="xs:boolean" minOccurs="0" maxOccurs="1"/>
<xs:element name="reviewServiceStartDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="reviewServiceEndDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="reviewReceiptStartDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="reviewReceiptEndDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="claimReviewClaimType" type="String2Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="requestingUser" type="String50Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="reviewReasonDescription" type="String50Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="reviewPractitionerList" type="ReviewPractitionerListType" minOccurs="0" maxOccurs="1"/>
<xs:element name="reviewSupplierList" type="ReviewSupplierListType" minOccurs="0" maxOccurs="1"/>
<xs:element name="claimReviewReason" type="CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="ReviewPractitionerListType">
<xs:sequence>
<xs:element name="otherThan" type="xs:boolean" minOccurs="0" maxOccurs="1" />
<xs:element name="listMode" type="ListUpdateModeType" minOccurs="0" maxOccurs="1"/>
<xs:element name="practitionerHccIdentifier" type="String60Type" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="ReviewSupplierListType">
<xs:sequence>
<xs:element name="otherThan" type="xs:boolean" minOccurs="0" maxOccurs="1" />
<xs:element name="listMode" type="ListUpdateModeType" minOccurs="0" maxOccurs="1"/>
<xs:element name="supplierHccIdentifier" type="String60Type" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="PaymentHoldType">
<xs:sequence>
<xs:element name="enablePaymentHold" type="xs:boolean" minOccurs="0" maxOccurs="1"/>
<xs:element name="requestingUser" type="String50Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="paymentHoldReasonDescription" type="String50Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="paymentHoldReason" type="CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="CorrespondenceInfoListType">
<xs:sequence>
<xs:element name="listMode" type="ListUpdateModeType" minOccurs="0" maxOccurs="1"/>
<xs:element name="correspondenceInfo" type="CorrespondenceInfoType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="ServiceFacilityLocationType">
<xs:sequence>
<xs:element name="locationName" type="LongStringType" minOccurs="0" maxOccurs="1"/>
<xs:element name="streetAddress" type="LongStringType" minOccurs="0" maxOccurs="1"/>
<xs:element name="streetAddress2" type="LongStringType" minOccurs="0" maxOccurs="1"/>
<xs:element name="streetAddress3" type="LongStringType" minOccurs="0" maxOccurs="1"/>
<xs:element name="cityName" type="ProperNameType" minOccurs="0" maxOccurs="1"/>
<xs:element name="stateCode" type="LongStringType" minOccurs="0" maxOccurs="1"/>
<xs:element name="zipCode" type="ZipCodeType" minOccurs="0" maxOccurs="1"/>
<xs:element name="zipExtensionCode" type="ZipCodeExtensionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="countryCode" type="CountryCodeDomainType" minOccurs="0" maxOccurs="1"/>
<xs:element name="npi" type="String50Type" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Facility National Provider ID.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="otherID" type="String50Type" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Facility other ID.</xs:documentation>
</xs:annotation>
</xs:element>
</xs:sequence>
</xs:complexType>
</xs:schema>
</file>
<file path="PRIME_SERVICES_XSD/connector-common-schema/iso3166-country-code.xsd">
<?xml version="1.0"?>
<xsd:schema xmlns:xsd="http://www.w3.org/2001/XMLSchema"
xmlns:stl="http://www.codesynthesis.com/xmlns/xsstl"
targetNamespace="http://www.codesynthesis.com/xmlns/xsstl">
<xsd:annotation>
<xsd:documentation>
Copyright (C) 2006-2007 Code Synthesis Tools CC
Redistribution and use with or without modification are permitted
under the terms of the new BSD license. See the accompanying LICENSE
file.
</xsd:documentation>
</xsd:annotation>
<xsd:simpleType name="ISO3166CountryCode">
<xsd:annotation>
<xsd:documentation>
Two-letter (alpha-2) ISO 3166-1 code for one of the 243 countries.
</xsd:documentation>
</xsd:annotation>
<xsd:restriction base="xsd:string">
<xsd:enumeration value="AF"/> <!-- AFGHANISTAN -->
<xsd:enumeration value="AX"/> <!-- &Aring;LAND ISLANDS -->
<xsd:enumeration value="AL"/> <!-- ALBANIA -->
<xsd:enumeration value="DZ"/> <!-- ALGERIA -->
<xsd:enumeration value="AS"/> <!-- AMERICAN SAMOA -->
<xsd:enumeration value="AD"/> <!-- ANDORRA -->
<xsd:enumeration value="AO"/> <!-- ANGOLA -->
<xsd:enumeration value="AI"/> <!-- ANGUILLA -->
<xsd:enumeration value="AQ"/> <!-- ANTARCTICA -->
<xsd:enumeration value="AG"/> <!-- ANTIGUA AND BARBUDA -->
<xsd:enumeration value="AR"/> <!-- ARGENTINA -->
<xsd:enumeration value="AM"/> <!-- ARMENIA -->
<xsd:enumeration value="AW"/> <!-- ARUBA -->
<xsd:enumeration value="AU"/> <!-- AUSTRALIA -->
<xsd:enumeration value="AT"/> <!-- AUSTRIA -->
<xsd:enumeration value="AZ"/> <!-- AZERBAIJAN -->
<xsd:enumeration value="BS"/> <!-- BAHAMAS -->
<xsd:enumeration value="BH"/> <!-- BAHRAIN -->
<xsd:enumeration value="BD"/> <!-- BANGLADESH -->
<xsd:enumeration value="BB"/> <!-- BARBADOS -->
<xsd:enumeration value="BY"/> <!-- BELARUS -->
<xsd:enumeration value="BE"/> <!-- BELGIUM -->
<xsd:enumeration value="BZ"/> <!-- BELIZE -->
<xsd:enumeration value="BJ"/> <!-- BENIN -->
<xsd:enumeration value="BM"/> <!-- BERMUDA -->
<xsd:enumeration value="BT"/> <!-- BHUTAN -->
<xsd:enumeration value="BO"/> <!-- BOLIVIA -->
<xsd:enumeration value="BQ"/> <!-- BONAIRE, SINT EUSTATIUS AND SABA -->
<xsd:enumeration value="BA"/> <!-- BOSNIA AND HERZEGOVINA -->
<xsd:enumeration value="BW"/> <!-- BOTSWANA -->
<xsd:enumeration value="BV"/> <!-- BOUVET ISLAND -->
<xsd:enumeration value="BR"/> <!-- BRAZIL -->
<xsd:enumeration value="IO"/> <!-- BRITISH INDIAN OCEAN TERRITORY -->
<xsd:enumeration value="BN"/> <!-- BRUNEI DARUSSALAM -->
<xsd:enumeration value="BG"/> <!-- BULGARIA -->
<xsd:enumeration value="BF"/> <!-- BURKINA FASO -->
<xsd:enumeration value="BI"/> <!-- BURUNDI -->
<xsd:enumeration value="KH"/> <!-- CAMBODIA -->
<xsd:enumeration value="CM"/> <!-- CAMEROON -->
<xsd:enumeration value="CA"/> <!-- CANADA -->
<xsd:enumeration value="CV"/> <!-- CAPE VERDE -->
<xsd:enumeration value="KY"/> <!-- CAYMAN ISLANDS -->
<xsd:enumeration value="CF"/> <!-- CENTRAL AFRICAN REPUBLIC -->
<xsd:enumeration value="TD"/> <!-- CHAD -->
<xsd:enumeration value="CL"/> <!-- CHILE -->
<xsd:enumeration value="CN"/> <!-- CHINA -->
<xsd:enumeration value="CX"/> <!-- CHRISTMAS ISLAND -->
<xsd:enumeration value="CC"/> <!-- COCOS (KEELING) ISLANDS -->
<xsd:enumeration value="CO"/> <!-- COLOMBIA -->
<xsd:enumeration value="KM"/> <!-- COMOROS -->
<xsd:enumeration value="CG"/> <!-- CONGO -->
<xsd:enumeration value="CD"/> <!-- CONGO, THE DEMOCRATIC REPUBLIC OF THE -->
<xsd:enumeration value="CK"/> <!-- COOK ISLANDS -->
<xsd:enumeration value="CR"/> <!-- COSTA RICA -->
<xsd:enumeration value="CI"/> <!-- COTE D'IVOIRE -->
<xsd:enumeration value="HR"/> <!-- CROATIA -->
<xsd:enumeration value="CU"/> <!-- CUBA -->
<xsd:enumeration value="CW"/> <!-- CURACAO -->
<xsd:enumeration value="CY"/> <!-- CYPRUS -->
<xsd:enumeration value="CZ"/> <!-- CZECH REPUBLIC -->
<xsd:enumeration value="DK"/> <!-- DENMARK -->
<xsd:enumeration value="DJ"/> <!-- DJIBOUTI -->
<xsd:enumeration value="DM"/> <!-- DOMINICA -->
<xsd:enumeration value="DO"/> <!-- DOMINICAN REPUBLIC -->
<xsd:enumeration value="EC"/> <!-- ECUADOR -->
<xsd:enumeration value="EG"/> <!-- EGYPT -->
<xsd:enumeration value="SV"/> <!-- EL SALVADOR -->
<xsd:enumeration value="GQ"/> <!-- EQUATORIAL GUINEA -->
<xsd:enumeration value="ER"/> <!-- ERITREA -->
<xsd:enumeration value="EE"/> <!-- ESTONIA -->
<xsd:enumeration value="ET"/> <!-- ETHIOPIA -->
<xsd:enumeration value="FK"/> <!-- FALKLAND ISLANDS (MALVINAS) -->
<xsd:enumeration value="FO"/> <!-- FAROE ISLANDS -->
<xsd:enumeration value="FJ"/> <!-- FIJI -->
<xsd:enumeration value="FI"/> <!-- FINLAND -->
<xsd:enumeration value="FR"/> <!-- FRANCE -->
<xsd:enumeration value="GF"/> <!-- FRENCH GUIANA -->
<xsd:enumeration value="PF"/> <!-- FRENCH POLYNESIA -->
<xsd:enumeration value="TF"/> <!-- FRENCH SOUTHERN TERRITORIES -->
<xsd:enumeration value="GA"/> <!-- GABON -->
<xsd:enumeration value="GM"/> <!-- GAMBIA -->
<xsd:enumeration value="GE"/> <!-- GEORGIA -->
<xsd:enumeration value="DE"/> <!-- GERMANY -->
<xsd:enumeration value="GH"/> <!-- GHANA -->
<xsd:enumeration value="GI"/> <!-- GIBRALTAR -->
<xsd:enumeration value="GR"/> <!-- GREECE -->
<xsd:enumeration value="GL"/> <!-- GREENLAND -->
<xsd:enumeration value="GD"/> <!-- GRENADA -->
<xsd:enumeration value="GP"/> <!-- GUADELOUPE -->
<xsd:enumeration value="GU"/> <!-- GUAM -->
<xsd:enumeration value="GT"/> <!-- GUATEMALA -->
<xsd:enumeration value="GG"/> <!-- GUERNSEY -->
<xsd:enumeration value="GN"/> <!-- GUINEA -->
<xsd:enumeration value="GW"/> <!-- GUINEA-BISSAU -->
<xsd:enumeration value="GY"/> <!-- GUYANA -->
<xsd:enumeration value="HT"/> <!-- HAITI -->
<xsd:enumeration value="HM"/> <!-- HEARD ISLAND AND MCDONALD ISLANDS -->
<xsd:enumeration value="VA"/> <!-- HOLY SEE (VATICAN CITY STATE) -->
<xsd:enumeration value="HN"/> <!-- HONDURAS -->
<xsd:enumeration value="HK"/> <!-- HONG KONG -->
<xsd:enumeration value="HU"/> <!-- HUNGARY -->
<xsd:enumeration value="IS"/> <!-- ICELAND -->
<xsd:enumeration value="IN"/> <!-- INDIA -->
<xsd:enumeration value="ID"/> <!-- INDONESIA -->
<xsd:enumeration value="IR"/> <!-- IRAN, ISLAMIC REPUBLIC OF -->
<xsd:enumeration value="IQ"/> <!-- IRAQ -->
<xsd:enumeration value="IE"/> <!-- IRELAND -->
<xsd:enumeration value="IM"/> <!-- ISLE OF MAN -->
<xsd:enumeration value="IL"/> <!-- ISRAEL -->
<xsd:enumeration value="IT"/> <!-- ITALY -->
<xsd:enumeration value="JM"/> <!-- JAMAICA -->
<xsd:enumeration value="JP"/> <!-- JAPAN -->
<xsd:enumeration value="JE"/> <!-- JERSEY -->
<xsd:enumeration value="JO"/> <!-- JORDAN -->
<xsd:enumeration value="KZ"/> <!-- KAZAKHSTAN -->
<xsd:enumeration value="KE"/> <!-- KENYA -->
<xsd:enumeration value="KI"/> <!-- KIRIBATI -->
<xsd:enumeration value="KP"/> <!-- KOREA, DEMOCRATIC PEOPLE'S REPUBLIC OF -->
<xsd:enumeration value="KR"/> <!-- KOREA, REPUBLIC OF -->
<xsd:enumeration value="KW"/> <!-- KUWAIT -->
<xsd:enumeration value="KG"/> <!-- KYRGYZSTAN -->
<xsd:enumeration value="LA"/> <!-- LAO PEOPLE'S DEMOCRATIC REPUBLIC -->
<xsd:enumeration value="LV"/> <!-- LATVIA -->
<xsd:enumeration value="LB"/> <!-- LEBANON -->
<xsd:enumeration value="LS"/> <!-- LESOTHO -->
<xsd:enumeration value="LR"/> <!-- LIBERIA -->
<xsd:enumeration value="LY"/> <!-- LIBYAN ARAB JAMAHIRIYA -->
<xsd:enumeration value="LI"/> <!-- LIECHTENSTEIN -->
<xsd:enumeration value="LT"/> <!-- LITHUANIA -->
<xsd:enumeration value="LU"/> <!-- LUXEMBOURG -->
<xsd:enumeration value="MO"/> <!-- MACAO -->
<xsd:enumeration value="MK"/> <!-- MACEDONIA, THE FORMER YUGOSLAV REPUBLIC OF -->
<xsd:enumeration value="MG"/> <!-- MADAGASCAR -->
<xsd:enumeration value="MW"/> <!-- MALAWI -->
<xsd:enumeration value="MY"/> <!-- MALAYSIA -->
<xsd:enumeration value="MV"/> <!-- MALDIVES -->
<xsd:enumeration value="ML"/> <!-- MALI -->
<xsd:enumeration value="MT"/> <!-- MALTA -->
<xsd:enumeration value="MH"/> <!-- MARSHALL ISLANDS -->
<xsd:enumeration value="MQ"/> <!-- MARTINIQUE -->
<xsd:enumeration value="MR"/> <!-- MAURITANIA -->
<xsd:enumeration value="MU"/> <!-- MAURITIUS -->
<xsd:enumeration value="YT"/> <!-- MAYOTTE -->
<xsd:enumeration value="MX"/> <!-- MEXICO -->
<xsd:enumeration value="FM"/> <!-- MICRONESIA, FEDERATED STATES OF -->
<xsd:enumeration value="MD"/> <!-- MOLDOVA, REPUBLIC OF -->
<xsd:enumeration value="MC"/> <!-- MONACO -->
<xsd:enumeration value="MN"/> <!-- MONGOLIA -->
<xsd:enumeration value="ME"/> <!-- MONTENEGRO -->
<xsd:enumeration value="MS"/> <!-- MONTSERRAT -->
<xsd:enumeration value="MA"/> <!-- MOROCCO -->
<xsd:enumeration value="MZ"/> <!-- MOZAMBIQUE -->
<xsd:enumeration value="MM"/> <!-- MYANMAR -->
<xsd:enumeration value="NA"/> <!-- NAMIBIA -->
<xsd:enumeration value="NR"/> <!-- NAURU -->
<xsd:enumeration value="NP"/> <!-- NEPAL -->
<xsd:enumeration value="NL"/> <!-- NETHERLANDS -->
<xsd:enumeration value="AN"/> <!-- NETHERLANDS ANTILLES -->
<xsd:enumeration value="NC"/> <!-- NEW CALEDONIA -->
<xsd:enumeration value="NZ"/> <!-- NEW ZEALAND -->
<xsd:enumeration value="NI"/> <!-- NICARAGUA -->
<xsd:enumeration value="NE"/> <!-- NIGER -->
<xsd:enumeration value="NG"/> <!-- NIGERIA -->
<xsd:enumeration value="NU"/> <!-- NIUE -->
<xsd:enumeration value="NF"/> <!-- NORFOLK ISLAND -->
<xsd:enumeration value="MP"/> <!-- NORTHERN MARIANA ISLANDS -->
<xsd:enumeration value="NO"/> <!-- NORWAY -->
<xsd:enumeration value="OM"/> <!-- OMAN -->
<xsd:enumeration value="PK"/> <!-- PAKISTAN -->
<xsd:enumeration value="PW"/> <!-- PALAU -->
<xsd:enumeration value="PS"/> <!-- PALESTINIAN TERRITORY, OCCUPIED -->
<xsd:enumeration value="PA"/> <!-- PANAMA -->
<xsd:enumeration value="PG"/> <!-- PAPUA NEW GUINEA -->
<xsd:enumeration value="PY"/> <!-- PARAGUAY -->
<xsd:enumeration value="PE"/> <!-- PERU -->
<xsd:enumeration value="PH"/> <!-- PHILIPPINES -->
<xsd:enumeration value="PN"/> <!-- PITCAIRN -->
<xsd:enumeration value="PL"/> <!-- POLAND -->
<xsd:enumeration value="PT"/> <!-- PORTUGAL -->
<xsd:enumeration value="PR"/> <!-- PUERTO RICO -->
<xsd:enumeration value="QA"/> <!-- QATAR -->
<xsd:enumeration value="RE"/> <!-- REUNION -->
<xsd:enumeration value="RO"/> <!-- ROMANIA -->
<xsd:enumeration value="RU"/> <!-- RUSSIAN FEDERATION -->
<xsd:enumeration value="RW"/> <!-- RWANDA -->
<xsd:enumeration value="BL"/> <!-- SAINT BARTHLEMY -->
<xsd:enumeration value="SH"/> <!-- SAINT HELENA -->
<xsd:enumeration value="KN"/> <!-- SAINT KITTS AND NEVIS -->
<xsd:enumeration value="LC"/> <!-- SAINT LUCIA -->
<xsd:enumeration value="MF"/> <!-- SAINT MARTIN -->
<xsd:enumeration value="PM"/> <!-- SAINT PIERRE AND MIQUELON -->
<xsd:enumeration value="VC"/> <!-- SAINT VINCENT AND THE GRENADINES -->
<xsd:enumeration value="WS"/> <!-- SAMOA -->
<xsd:enumeration value="SM"/> <!-- SAN MARINO -->
<xsd:enumeration value="ST"/> <!-- SAO TOME AND PRINCIPE -->
<xsd:enumeration value="SA"/> <!-- SAUDI ARABIA -->
<xsd:enumeration value="SN"/> <!-- SENEGAL -->
<xsd:enumeration value="RS"/> <!-- SERBIA -->
<xsd:enumeration value="SC"/> <!-- SEYCHELLES -->
<xsd:enumeration value="SL"/> <!-- SIERRA LEONE -->
<xsd:enumeration value="SG"/> <!-- SINGAPORE -->
<xsd:enumeration value="SX"/> <!-- SINT MAARTEN (DUTCH PART) -->
<xsd:enumeration value="SK"/> <!-- SLOVAKIA -->
<xsd:enumeration value="SI"/> <!-- SLOVENIA -->
<xsd:enumeration value="SB"/> <!-- SOLOMON ISLANDS -->
<xsd:enumeration value="SO"/> <!-- SOMALIA -->
<xsd:enumeration value="ZA"/> <!-- SOUTH AFRICA -->
<xsd:enumeration value="GS"/> <!-- SOUTH GEORGIA AND THE SOUTH SANDWICH ISLANDS -->
<xsd:enumeration value="SS"/> <!-- SOUTH SUDAN -->
<xsd:enumeration value="ES"/> <!-- SPAIN -->
<xsd:enumeration value="LK"/> <!-- SRI LANKA -->
<xsd:enumeration value="SD"/> <!-- SUDAN -->
<xsd:enumeration value="SR"/> <!-- SURINAME -->
<xsd:enumeration value="SJ"/> <!-- SVALBARD AND JAN MAYEN -->
<xsd:enumeration value="SZ"/> <!-- SWAZILAND -->
<xsd:enumeration value="SE"/> <!-- SWEDEN -->
<xsd:enumeration value="CH"/> <!-- SWITZERLAND -->
<xsd:enumeration value="SY"/> <!-- SYRIAN ARAB REPUBLIC -->
<xsd:enumeration value="TW"/> <!-- TAIWAN, PROVINCE OF CHINA -->
<xsd:enumeration value="TJ"/> <!-- TAJIKISTAN -->
<xsd:enumeration value="TZ"/> <!-- TANZANIA, UNITED REPUBLIC OF -->
<xsd:enumeration value="TH"/> <!-- THAILAND -->
<xsd:enumeration value="TL"/> <!-- TIMOR-LESTE -->
<xsd:enumeration value="TG"/> <!-- TOGO -->
<xsd:enumeration value="TK"/> <!-- TOKELAU -->
<xsd:enumeration value="TO"/> <!-- TONGA -->
<xsd:enumeration value="TT"/> <!-- TRINIDAD AND TOBAGO -->
<xsd:enumeration value="TN"/> <!-- TUNISIA -->
<xsd:enumeration value="TR"/> <!-- TURKEY -->
<xsd:enumeration value="TM"/> <!-- TURKMENISTAN -->
<xsd:enumeration value="TC"/> <!-- TURKS AND CAICOS ISLANDS -->
<xsd:enumeration value="TV"/> <!-- TUVALU -->
<xsd:enumeration value="UG"/> <!-- UGANDA -->
<xsd:enumeration value="UA"/> <!-- UKRAINE -->
<xsd:enumeration value="AE"/> <!-- UNITED ARAB EMIRATES -->
<xsd:enumeration value="GB"/> <!-- UNITED KINGDOM -->
<xsd:enumeration value="US"/> <!-- UNITED STATES -->
<xsd:enumeration value="UM"/> <!-- UNITED STATES MINOR OUTLYING ISLANDS -->
<xsd:enumeration value="UY"/> <!-- URUGUAY -->
<xsd:enumeration value="UZ"/> <!-- UZBEKISTAN -->
<xsd:enumeration value="VU"/> <!-- VANUATU -->
<xsd:enumeration value="VE"/> <!-- VENEZUELA -->
<xsd:enumeration value="VN"/> <!-- VIET NAM -->
<xsd:enumeration value="VG"/> <!-- VIRGIN ISLANDS, BRITISH -->
<xsd:enumeration value="VI"/> <!-- VIRGIN ISLANDS, U.S. -->
<xsd:enumeration value="WF"/> <!-- WALLIS AND FUTUNA -->
<xsd:enumeration value="EH"/> <!-- WESTERN SAHARA -->
<xsd:enumeration value="YE"/> <!-- YEMEN -->
<xsd:enumeration value="ZM"/> <!-- ZAMBIA -->
<xsd:enumeration value="ZW"/> <!-- ZIMBABWE -->
</xsd:restriction>
</xsd:simpleType>
</xsd:schema>
</file>
<file path="PRIME_SERVICES_XSD/connector-common-schema/match-input.xsd">
<?xml version="1.0" encoding="UTF-8"?>
<!-- edited with XMLSpy v2014 sp1 (x64) (http://www.altova.com) by Rebecca Stevenson (HEALTHEDGE SOFTWARE INC) -->
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema"
xmlns="http://www.healthedge.com/connector/schema/matchinput"
xmlns:tns="http://www.healthedge.com/connector/schema/matchinput"
targetNamespace="http://www.healthedge.com/connector/schema/matchinput" elementFormDefault="unqualified"
version="4.0">
<xs:annotation>
<xs:documentation>
DISCLAIMER
This pre-release software provided by HealthEdge Inc. is a work-in-progress.
HealthEdge provides pre-release information to early adopters for the purpose of design and planning.
It has no warranty either explicit or implied and is subject to change.
</xs:documentation>
</xs:annotation>
<xs:complexType name="MemberMatchInputType">
<xs:annotation>
<xs:documentation>Member match input data.</xs:documentation>
</xs:annotation>
<xs:complexContent>
<xs:extension base="MatchInputType">
<xs:group ref="MemberMatchInputGroup">
<xs:annotation>
<xs:documentation>Member and subscriber information used for matching. Custom fields allows you
to specify ad hoc fields; see the Implementation Guide for a detailed example.
</xs:documentation>
</xs:annotation>
</xs:group>
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:complexType name="ExternalMemberMatchInputType">
<xs:annotation>
<xs:documentation>Member match input data.</xs:documentation>
</xs:annotation>
<xs:complexContent>
<xs:extension base="MatchInputType">
<xs:group ref="ExternalMemberMatchInputGroup">
<xs:annotation>
<xs:documentation>ExternalMember and dependedent information used for matching. Custom fields allows you
to specify ad hoc fields; see the Implementation Guide for a detailed example.
</xs:documentation>
</xs:annotation>
</xs:group>
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:group name="MemberMatchInputGroup">
<xs:annotation>
<xs:documentation>
Resembles the list of attributes of the ITS type - MemberMatchInput
</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="id" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="carrierHccId" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="topAccount" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="customString1" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="customString2" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="customString3" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="customString4" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="customInteger1" type="xs:int" minOccurs="0" maxOccurs="1"/>
<xs:element name="customInteger2" type="xs:int" minOccurs="0" maxOccurs="1"/>
<xs:element name="customInteger3" type="xs:int" minOccurs="0" maxOccurs="1"/>
<xs:element name="customInteger4" type="xs:int" minOccurs="0" maxOccurs="1"/>
<xs:element name="customDate1" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="customDate2" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="customDate3" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="customDate4" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="customDecimal1" type="xs:decimal" minOccurs="0" maxOccurs="1"/>
<xs:element name="customDecimal2" type="xs:decimal" minOccurs="0" maxOccurs="1"/>
<xs:element name="customDecimal3" type="xs:decimal" minOccurs="0" maxOccurs="1"/>
<xs:element name="customDecimal4" type="xs:decimal" minOccurs="0" maxOccurs="1"/>
<xs:element name="member" type="IndividualMatchInputType" minOccurs="0" maxOccurs="1"/>
<xs:element name="subscriber" type="IndividualMatchInputType" minOccurs="0" maxOccurs="1"/>
<xs:element name="asOfDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:group name="ExternalMemberMatchInputGroup">
<xs:annotation>
<xs:documentation>
Resembles the list of attributes of the ITS type - ExternalMemberMatchInput
</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="id" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="firstName" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="lastName" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="dateOfBirth" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="idPrefix" type="xs:string" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:group name="MatchInputGroup">
<xs:annotation>
<xs:documentation>
Resembles the structure of the ITS type - MatchInput
</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="definitionName" type="xs:string" minOccurs="1" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:complexType name="MatchInputType">
<xs:group ref="MatchInputGroup"/>
</xs:complexType>
<xs:group name="MatchAddressGroup">
<xs:annotation>
<xs:documentation>Address information used for matching during a search.</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="address" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="cityName" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="stateCode" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="zipCode" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="zipExtensionCode" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="countryCode" type="xs:string" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:complexType name="MatchAddressType">
<xs:group ref="MatchAddressGroup">
<xs:annotation>
<xs:documentation>Address information used for matching during a search.</xs:documentation>
</xs:annotation>
</xs:group>
</xs:complexType>
<xs:group name="IndividualMatchInputGroup">
<xs:annotation>
<xs:documentation>Individual information used for matching during a search.</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="firstName" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="lastName" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="fullName" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="gender" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="dateOfBirth" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="taxId" type="xs:string" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:complexType name="IndividualMatchInputType">
<xs:sequence>
<xs:group ref="IndividualMatchInputGroup">
<xs:annotation>
<xs:documentation>Individual information used for matching during a search.</xs:documentation>
</xs:annotation>
</xs:group>
<xs:element name="address" type="MatchAddressType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
</xs:schema>
</file>
<file path="PRIME_SERVICES_XSD/connector-common-schema/phone-number.xsd">
<?xml version="1.0"?>
<xsd:schema xmlns:xsd="http://www.w3.org/2001/XMLSchema"
xmlns:stl="http://www.codesynthesis.com/xmlns/xsstl"
targetNamespace="http://www.codesynthesis.com/xmlns/xsstl">
<xsd:annotation>
<xsd:documentation>
Copyright (C) 2006-2007 Code Synthesis Tools CC
Redistribution and use with or without modification are permitted
under the terms of the new BSD license. See the accompanying LICENSE
file.
</xsd:documentation>
</xsd:annotation>
<xsd:simpleType name="PhoneNumber">
<xsd:annotation>
<xsd:documentation>
Full international telephone number is up to 15 digits long.
The country code is up to 3 digits long. The area code is
country-dependent and is not used for some countries. If
used, it seems to be from 1 to 5 digits long. This leaves
the subscriber number up to 14 digits. Plus there is the
optional extension. Putting this all together, we get:
country-area-subscriber-extension
The area code and extension are optional. Here are a few
examples:
1-800-1234567    (country-area-subscriber)
1-800-1234567-89 (country-area-subscriber-extension)
34-912345678     (country-subscriber)
34-912345678-9   (country-subscriber-extension)
See also http://en.wikipedia.org/wiki/Area_code
http://en.wikipedia.org/wiki/E.164
</xsd:documentation>
</xsd:annotation>
<xsd:restriction base="xsd:string">
<xsd:pattern value="([1-9][0-9]{0,2})(-[1-9][0-9]{0,4})?(-[1-9][0-9]{0,13})(-[0-9]+)?"/>
</xsd:restriction>
</xsd:simpleType>
<xsd:simpleType name="PhoneCountryCode">
<xsd:annotation>
<xsd:documentation>
Telephone country code. Up to 3 digits long.
</xsd:documentation>
</xsd:annotation>
<xsd:restriction base="xsd:unsignedShort">
<xsd:minInclusive value="1"/>
<xsd:maxInclusive value="999"/>
</xsd:restriction>
</xsd:simpleType>
<xsd:simpleType name="PhoneAreaCode">
<xsd:annotation>
<xsd:documentation>
Telephone area code. Up to 5 digits long.
</xsd:documentation>
</xsd:annotation>
<xsd:restriction base="xsd:unsignedInt">
<xsd:minInclusive value="1"/>
<xsd:maxInclusive value="99999"/>
</xsd:restriction>
</xsd:simpleType>
<xsd:simpleType name="PhoneSubscriberNumber">
<xsd:annotation>
<xsd:documentation>
Telephone subscriber number. Up to 14 digits long.
</xsd:documentation>
</xsd:annotation>
<xsd:restriction base="xsd:unsignedLong">
<xsd:minInclusive value="1"/>
<xsd:maxInclusive value="99999999999999"/>
</xsd:restriction>
</xsd:simpleType>
<xsd:simpleType name="PhoneExtensionNumber">
<xsd:annotation>
<xsd:documentation>
Telephone extension number. Theoretically of arbitrary length.
</xsd:documentation>
</xsd:annotation>
<xsd:restriction base="xsd:unsignedLong"/>
</xsd:simpleType>
<xsd:complexType name="PhoneNumberStruct">
<xsd:annotation>
<xsd:documentation>
Structured full international telephone number.
</xsd:documentation>
</xsd:annotation>
<xsd:sequence>
<xsd:element name="country" type="stl:PhoneCountryCode"/>
<xsd:element name="area" type="stl:PhoneAreaCode" minOccurs="0"/>
<xsd:element name="subscriber" type="stl:PhoneSubscriberNumber"/>
<xsd:element name="extension" type="stl:PhoneExtensionNumber" minOccurs="0"/>
</xsd:sequence>
</xsd:complexType>
</xsd:schema>
</file>
<file path="PRIME_SERVICES_XSD/connector-common-schema/us-state-code.xsd">
<?xml version="1.0"?>
<xsd:schema xmlns:xsd="http://www.w3.org/2001/XMLSchema"
xmlns:stl="http://www.codesynthesis.com/xmlns/xsstl"
targetNamespace="http://www.codesynthesis.com/xmlns/xsstl">
<xsd:annotation>
<xsd:documentation>
Copyright (C) 2006-2007 Code Synthesis Tools CC
Redistribution and use with or without modification are permitted
under the terms of the new BSD license. See the accompanying LICENSE
file.
The following five types are defined for representing U.S. states
and territories:
USStateTerritoryCode     50 states + 9 territories
USStateCode              50 states + District of Columbia
USTerritoryCode          9 territories - District of Columbia
USContinentalStateCode   USStateCode - Hawaii
USContiguousStateCode    USContinentalStateCode - Alaska
See also:  http://en.wikipedia.org/wiki/US_States
http://en.wikipedia.org/wiki/Continental_United_States
http://www.usps.com/ncsc/lookups/usps_abbreviations.html
</xsd:documentation>
</xsd:annotation>
<xsd:simpleType name="USStateTerritoryCode">
<xsd:annotation>
<xsd:documentation>
Two-letter code for one of the 59 U.S. states/territories.
</xsd:documentation>
</xsd:annotation>
<xsd:restriction base="xsd:string">
<xsd:enumeration value="AL"/> <!-- ALABAMA -->
<xsd:enumeration value="AK"/> <!-- ALASKA -->
<xsd:enumeration value="AS"/> <!-- AMERICAN SAMOA -->
<xsd:enumeration value="AZ"/> <!-- ARIZONA -->
<xsd:enumeration value="AR"/> <!-- ARKANSAS -->
<xsd:enumeration value="CA"/> <!-- CALIFORNIA -->
<xsd:enumeration value="CO"/> <!-- COLORADO -->
<xsd:enumeration value="CT"/> <!-- CONNECTICUT -->
<xsd:enumeration value="DE"/> <!-- DELAWARE -->
<xsd:enumeration value="DC"/> <!-- DISTRICT OF COLUMBIA -->
<xsd:enumeration value="FM"/> <!-- FEDERATED STATES OF MICRONESIA -->
<xsd:enumeration value="FL"/> <!-- FLORIDA -->
<xsd:enumeration value="GA"/> <!-- GEORGIA -->
<xsd:enumeration value="GU"/> <!-- GUAM -->
<xsd:enumeration value="HI"/> <!-- HAWAII -->
<xsd:enumeration value="ID"/> <!-- IDAHO -->
<xsd:enumeration value="IL"/> <!-- ILLINOIS -->
<xsd:enumeration value="IN"/> <!-- INDIANA -->
<xsd:enumeration value="IA"/> <!-- IOWA -->
<xsd:enumeration value="KS"/> <!-- KANSAS -->
<xsd:enumeration value="KY"/> <!-- KENTUCKY -->
<xsd:enumeration value="LA"/> <!-- LOUISIANA -->
<xsd:enumeration value="ME"/> <!-- MAINE -->
<xsd:enumeration value="MH"/> <!-- MARSHALL ISLANDS -->
<xsd:enumeration value="MD"/> <!-- MARYLAND -->
<xsd:enumeration value="MA"/> <!-- MASSACHUSETTS -->
<xsd:enumeration value="MI"/> <!-- MICHIGAN -->
<xsd:enumeration value="MN"/> <!-- MINNESOTA -->
<xsd:enumeration value="MS"/> <!-- MISSISSIPPI -->
<xsd:enumeration value="MO"/> <!-- MISSOURI -->
<xsd:enumeration value="MT"/> <!-- MONTANA -->
<xsd:enumeration value="NE"/> <!-- NEBRASKA -->
<xsd:enumeration value="NV"/> <!-- NEVADA -->
<xsd:enumeration value="NH"/> <!-- NEW HAMPSHIRE -->
<xsd:enumeration value="NJ"/> <!-- NEW JERSEY -->
<xsd:enumeration value="NM"/> <!-- NEW MEXICO -->
<xsd:enumeration value="NY"/> <!-- NEW YORK -->
<xsd:enumeration value="NC"/> <!-- NORTH CAROLINA -->
<xsd:enumeration value="ND"/> <!-- NORTH DAKOTA -->
<xsd:enumeration value="MP"/> <!-- NORTHERN MARIANA ISLANDS -->
<xsd:enumeration value="OH"/> <!-- OHIO -->
<xsd:enumeration value="OK"/> <!-- OKLAHOMA -->
<xsd:enumeration value="OR"/> <!-- OREGON -->
<xsd:enumeration value="PW"/> <!-- PALAU -->
<xsd:enumeration value="PA"/> <!-- PENNSYLVANIA -->
<xsd:enumeration value="PR"/> <!-- PUERTO RICO -->
<xsd:enumeration value="RI"/> <!-- RHODE ISLAND -->
<xsd:enumeration value="SC"/> <!-- SOUTH CAROLINA -->
<xsd:enumeration value="SD"/> <!-- SOUTH DAKOTA -->
<xsd:enumeration value="TN"/> <!-- TENNESSEE -->
<xsd:enumeration value="TX"/> <!-- TEXAS -->
<xsd:enumeration value="UT"/> <!-- UTAH -->
<xsd:enumeration value="VT"/> <!-- VERMONT -->
<xsd:enumeration value="VI"/> <!-- VIRGIN ISLANDS -->
<xsd:enumeration value="VA"/> <!-- VIRGINIA -->
<xsd:enumeration value="WA"/> <!-- WASHINGTON -->
<xsd:enumeration value="WV"/> <!-- WEST VIRGINIA -->
<xsd:enumeration value="WI"/> <!-- WISCONSIN -->
<xsd:enumeration value="WY"/> <!-- WYOMING -->
</xsd:restriction>
</xsd:simpleType>
<xsd:simpleType name="USStateCode">
<xsd:annotation>
<xsd:documentation>
Two-letter code for one of the 50 U.S. states and District of Columbia.
</xsd:documentation>
</xsd:annotation>
<xsd:restriction base="stl:USStateTerritoryCode">
<xsd:enumeration value="AL"/> <!-- ALABAMA -->
<xsd:enumeration value="AK"/> <!-- ALASKA -->
<xsd:enumeration value="AZ"/> <!-- ARIZONA -->
<xsd:enumeration value="AR"/> <!-- ARKANSAS -->
<xsd:enumeration value="CA"/> <!-- CALIFORNIA -->
<xsd:enumeration value="CO"/> <!-- COLORADO -->
<xsd:enumeration value="CT"/> <!-- CONNECTICUT -->
<xsd:enumeration value="DE"/> <!-- DELAWARE -->
<xsd:enumeration value="DC"/> <!-- DISTRICT OF COLUMBIA -->
<xsd:enumeration value="FL"/> <!-- FLORIDA -->
<xsd:enumeration value="GA"/> <!-- GEORGIA -->
<xsd:enumeration value="HI"/> <!-- HAWAII -->
<xsd:enumeration value="ID"/> <!-- IDAHO -->
<xsd:enumeration value="IL"/> <!-- ILLINOIS -->
<xsd:enumeration value="IN"/> <!-- INDIANA -->
<xsd:enumeration value="IA"/> <!-- IOWA -->
<xsd:enumeration value="KS"/> <!-- KANSAS -->
<xsd:enumeration value="KY"/> <!-- KENTUCKY -->
<xsd:enumeration value="LA"/> <!-- LOUISIANA -->
<xsd:enumeration value="ME"/> <!-- MAINE -->
<xsd:enumeration value="MD"/> <!-- MARYLAND -->
<xsd:enumeration value="MA"/> <!-- MASSACHUSETTS -->
<xsd:enumeration value="MI"/> <!-- MICHIGAN -->
<xsd:enumeration value="MN"/> <!-- MINNESOTA -->
<xsd:enumeration value="MS"/> <!-- MISSISSIPPI -->
<xsd:enumeration value="MO"/> <!-- MISSOURI -->
<xsd:enumeration value="MT"/> <!-- MONTANA -->
<xsd:enumeration value="NE"/> <!-- NEBRASKA -->
<xsd:enumeration value="NV"/> <!-- NEVADA -->
<xsd:enumeration value="NH"/> <!-- NEW HAMPSHIRE -->
<xsd:enumeration value="NJ"/> <!-- NEW JERSEY -->
<xsd:enumeration value="NM"/> <!-- NEW MEXICO -->
<xsd:enumeration value="NY"/> <!-- NEW YORK -->
<xsd:enumeration value="NC"/> <!-- NORTH CAROLINA -->
<xsd:enumeration value="ND"/> <!-- NORTH DAKOTA -->
<xsd:enumeration value="OH"/> <!-- OHIO -->
<xsd:enumeration value="OK"/> <!-- OKLAHOMA -->
<xsd:enumeration value="OR"/> <!-- OREGON -->
<xsd:enumeration value="PA"/> <!-- PENNSYLVANIA -->
<xsd:enumeration value="RI"/> <!-- RHODE ISLAND -->
<xsd:enumeration value="SC"/> <!-- SOUTH CAROLINA -->
<xsd:enumeration value="SD"/> <!-- SOUTH DAKOTA -->
<xsd:enumeration value="TN"/> <!-- TENNESSEE -->
<xsd:enumeration value="TX"/> <!-- TEXAS -->
<xsd:enumeration value="UT"/> <!-- UTAH -->
<xsd:enumeration value="VT"/> <!-- VERMONT -->
<xsd:enumeration value="VA"/> <!-- VIRGINIA -->
<xsd:enumeration value="WA"/> <!-- WASHINGTON -->
<xsd:enumeration value="WV"/> <!-- WEST VIRGINIA -->
<xsd:enumeration value="WI"/> <!-- WISCONSIN -->
<xsd:enumeration value="WY"/> <!-- WYOMING -->
</xsd:restriction>
</xsd:simpleType>
<xsd:simpleType name="USTerritoryCode">
<xsd:annotation>
<xsd:documentation>
Two-letter code for one of the 9 U.S. territories sans District of
Columbia.
</xsd:documentation>
</xsd:annotation>
<xsd:restriction base="stl:USStateTerritoryCode">
<xsd:enumeration value="AS"/> <!-- AMERICAN SAMOA -->
<xsd:enumeration value="FM"/> <!-- FEDERATED STATES OF MICRONESIA -->
<xsd:enumeration value="GU"/> <!-- GUAM -->
<xsd:enumeration value="MH"/> <!-- MARSHALL ISLANDS -->
<xsd:enumeration value="MP"/> <!-- NORTHERN MARIANA ISLANDS -->
<xsd:enumeration value="PW"/> <!-- PALAU -->
<xsd:enumeration value="PR"/> <!-- PUERTO RICO -->
<xsd:enumeration value="VI"/> <!-- VIRGIN ISLANDS -->
</xsd:restriction>
</xsd:simpleType>
<xsd:simpleType name="USContinentalStateCode">
<xsd:annotation>
<xsd:documentation>
Two-letter code for one of the 50 U.S. states and District of Columbia
sans Hawaii.
</xsd:documentation>
</xsd:annotation>
<xsd:restriction base="stl:USStateCode">
<xsd:enumeration value="AL"/> <!-- ALABAMA -->
<xsd:enumeration value="AK"/> <!-- ALASKA -->
<xsd:enumeration value="AZ"/> <!-- ARIZONA -->
<xsd:enumeration value="AR"/> <!-- ARKANSAS -->
<xsd:enumeration value="CA"/> <!-- CALIFORNIA -->
<xsd:enumeration value="CO"/> <!-- COLORADO -->
<xsd:enumeration value="CT"/> <!-- CONNECTICUT -->
<xsd:enumeration value="DE"/> <!-- DELAWARE -->
<xsd:enumeration value="DC"/> <!-- DISTRICT OF COLUMBIA -->
<xsd:enumeration value="FL"/> <!-- FLORIDA -->
<xsd:enumeration value="GA"/> <!-- GEORGIA -->
<xsd:enumeration value="ID"/> <!-- IDAHO -->
<xsd:enumeration value="IL"/> <!-- ILLINOIS -->
<xsd:enumeration value="IN"/> <!-- INDIANA -->
<xsd:enumeration value="IA"/> <!-- IOWA -->
<xsd:enumeration value="KS"/> <!-- KANSAS -->
<xsd:enumeration value="KY"/> <!-- KENTUCKY -->
<xsd:enumeration value="LA"/> <!-- LOUISIANA -->
<xsd:enumeration value="ME"/> <!-- MAINE -->
<xsd:enumeration value="MD"/> <!-- MARYLAND -->
<xsd:enumeration value="MA"/> <!-- MASSACHUSETTS -->
<xsd:enumeration value="MI"/> <!-- MICHIGAN -->
<xsd:enumeration value="MN"/> <!-- MINNESOTA -->
<xsd:enumeration value="MS"/> <!-- MISSISSIPPI -->
<xsd:enumeration value="MO"/> <!-- MISSOURI -->
<xsd:enumeration value="MT"/> <!-- MONTANA -->
<xsd:enumeration value="NE"/> <!-- NEBRASKA -->
<xsd:enumeration value="NV"/> <!-- NEVADA -->
<xsd:enumeration value="NH"/> <!-- NEW HAMPSHIRE -->
<xsd:enumeration value="NJ"/> <!-- NEW JERSEY -->
<xsd:enumeration value="NM"/> <!-- NEW MEXICO -->
<xsd:enumeration value="NY"/> <!-- NEW YORK -->
<xsd:enumeration value="NC"/> <!-- NORTH CAROLINA -->
<xsd:enumeration value="ND"/> <!-- NORTH DAKOTA -->
<xsd:enumeration value="OH"/> <!-- OHIO -->
<xsd:enumeration value="OK"/> <!-- OKLAHOMA -->
<xsd:enumeration value="OR"/> <!-- OREGON -->
<xsd:enumeration value="PA"/> <!-- PENNSYLVANIA -->
<xsd:enumeration value="RI"/> <!-- RHODE ISLAND -->
<xsd:enumeration value="SC"/> <!-- SOUTH CAROLINA -->
<xsd:enumeration value="SD"/> <!-- SOUTH DAKOTA -->
<xsd:enumeration value="TN"/> <!-- TENNESSEE -->
<xsd:enumeration value="TX"/> <!-- TEXAS -->
<xsd:enumeration value="UT"/> <!-- UTAH -->
<xsd:enumeration value="VT"/> <!-- VERMONT -->
<xsd:enumeration value="VA"/> <!-- VIRGINIA -->
<xsd:enumeration value="WA"/> <!-- WASHINGTON -->
<xsd:enumeration value="WV"/> <!-- WEST VIRGINIA -->
<xsd:enumeration value="WI"/> <!-- WISCONSIN -->
<xsd:enumeration value="WY"/> <!-- WYOMING -->
</xsd:restriction>
</xsd:simpleType>
<xsd:simpleType name="USContiguousStateCode">
<xsd:annotation>
<xsd:documentation>
Two-letter code for one of the 50 U.S. states and District of Columbia
sans Hawaii and Alaska.
</xsd:documentation>
</xsd:annotation>
<xsd:restriction base="stl:USContinentalStateCode">
<xsd:enumeration value="AL"/> <!-- ALABAMA -->
<xsd:enumeration value="AZ"/> <!-- ARIZONA -->
<xsd:enumeration value="AR"/> <!-- ARKANSAS -->
<xsd:enumeration value="CA"/> <!-- CALIFORNIA -->
<xsd:enumeration value="CO"/> <!-- COLORADO -->
<xsd:enumeration value="CT"/> <!-- CONNECTICUT -->
<xsd:enumeration value="DE"/> <!-- DELAWARE -->
<xsd:enumeration value="DC"/> <!-- DISTRICT OF COLUMBIA -->
<xsd:enumeration value="FL"/> <!-- FLORIDA -->
<xsd:enumeration value="GA"/> <!-- GEORGIA -->
<xsd:enumeration value="ID"/> <!-- IDAHO -->
<xsd:enumeration value="IL"/> <!-- ILLINOIS -->
<xsd:enumeration value="IN"/> <!-- INDIANA -->
<xsd:enumeration value="IA"/> <!-- IOWA -->
<xsd:enumeration value="KS"/> <!-- KANSAS -->
<xsd:enumeration value="KY"/> <!-- KENTUCKY -->
<xsd:enumeration value="LA"/> <!-- LOUISIANA -->
<xsd:enumeration value="ME"/> <!-- MAINE -->
<xsd:enumeration value="MD"/> <!-- MARYLAND -->
<xsd:enumeration value="MA"/> <!-- MASSACHUSETTS -->
<xsd:enumeration value="MI"/> <!-- MICHIGAN -->
<xsd:enumeration value="MN"/> <!-- MINNESOTA -->
<xsd:enumeration value="MS"/> <!-- MISSISSIPPI -->
<xsd:enumeration value="MO"/> <!-- MISSOURI -->
<xsd:enumeration value="MT"/> <!-- MONTANA -->
<xsd:enumeration value="NE"/> <!-- NEBRASKA -->
<xsd:enumeration value="NV"/> <!-- NEVADA -->
<xsd:enumeration value="NH"/> <!-- NEW HAMPSHIRE -->
<xsd:enumeration value="NJ"/> <!-- NEW JERSEY -->
<xsd:enumeration value="NM"/> <!-- NEW MEXICO -->
<xsd:enumeration value="NY"/> <!-- NEW YORK -->
<xsd:enumeration value="NC"/> <!-- NORTH CAROLINA -->
<xsd:enumeration value="ND"/> <!-- NORTH DAKOTA -->
<xsd:enumeration value="OH"/> <!-- OHIO -->
<xsd:enumeration value="OK"/> <!-- OKLAHOMA -->
<xsd:enumeration value="OR"/> <!-- OREGON -->
<xsd:enumeration value="PA"/> <!-- PENNSYLVANIA -->
<xsd:enumeration value="RI"/> <!-- RHODE ISLAND -->
<xsd:enumeration value="SC"/> <!-- SOUTH CAROLINA -->
<xsd:enumeration value="SD"/> <!-- SOUTH DAKOTA -->
<xsd:enumeration value="TN"/> <!-- TENNESSEE -->
<xsd:enumeration value="TX"/> <!-- TEXAS -->
<xsd:enumeration value="UT"/> <!-- UTAH -->
<xsd:enumeration value="VT"/> <!-- VERMONT -->
<xsd:enumeration value="VA"/> <!-- VIRGINIA -->
<xsd:enumeration value="WA"/> <!-- WASHINGTON -->
<xsd:enumeration value="WV"/> <!-- WEST VIRGINIA -->
<xsd:enumeration value="WI"/> <!-- WISCONSIN -->
<xsd:enumeration value="WY"/> <!-- WYOMING -->
</xsd:restriction>
</xsd:simpleType>
</xsd:schema>
</file>
<file path="PRIME_SERVICES_XSD/connector-enrollment/enrollment-lookup.xsd">
<?xml version="1.0" encoding="UTF-8"?>
<!-- edited with XMLSpy v2014 sp1 (x64) (http://www.altova.com) by Rebecca Stevenson (HEALTHEDGE SOFTWARE INC) -->
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:base="http://www.healthedge.com/connector/schema/basetypes"
xmlns:member="http://www.healthedge.com/connector/schema/membership"
xmlns:subsc="http://www.healthedge.com/connector/schema/subscription"
xmlns:enroll="http://www.healthedge.com/connector/schema/enrollment"
xmlns:minput="http://www.healthedge.com/connector/schema/matchinput"
xmlns="http://www.healthedge.com/connector/schema/enrollmentlookup"
xmlns:tns="http://www.healthedge.com/connector/schema/enrollmentlookup"
targetNamespace="http://www.healthedge.com/connector/schema/enrollmentlookup" elementFormDefault="unqualified"
version="4.0">
<xs:annotation>
<xs:documentation>
DISCLAIMER
This pre-release software provided by HealthEdge Inc. is a work-in-progress.
HealthEdge provides pre-release information to early adopters for the purpose of design and planning.
It has no warranty either explicit or implied and is subject to change.
</xs:documentation>
</xs:annotation>
<xs:import namespace="http://www.healthedge.com/connector/schema/basetypes" schemaLocation="../connector-common-schema/base-types.xsd"/>
<xs:import namespace="http://www.healthedge.com/connector/schema/membership" schemaLocation="membership.xsd"/>
<xs:import namespace="http://www.healthedge.com/connector/schema/subscription" schemaLocation="subscription.xsd"/>
<xs:import namespace="http://www.healthedge.com/connector/schema/enrollment" schemaLocation="enrollment.xsd"/>
<xs:import namespace="http://www.healthedge.com/connector/schema/matchinput" schemaLocation="../connector-common-schema/match-input.xsd"/>
<xs:element name="membershipLookupResponse" type="MembershipResponseType"/>
<xs:element name="membershipLookupCriteria" type="MembershipLookupType"/>
<xs:complexType name="MembershipLookupType">
<xs:complexContent>
<xs:extension base="minput:MemberMatchInputType">
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:element name="subscriptionLookupResponse" type="SubscriptionResponseType"/>
<xs:element name="subscriptionLookupCriteria" type="SubscriptionLookupType"/>
<xs:complexType name="SubscriptionLookupType">
<xs:complexContent>
<xs:extension base="minput:MemberMatchInputType">
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:element name="enrollmentLookupResponse" type="EnrollmentResponseType"/>
<xs:element name="enrollmentLookupCriteria" type="EnrollmentLookupType"/>
<xs:complexType name="EnrollmentLookupType">
<xs:complexContent>
<xs:extension base="minput:MemberMatchInputType">
<xs:sequence>
<xs:element name="latestEndorsementEffectiveDate" type="xs:dateTime" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:complexType name="MembershipResponseType">
<xs:sequence>
<xs:element ref="member:membership" minOccurs="0" maxOccurs="1"/>
<xs:group ref="base:ErrorStatusGroup"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="SubscriptionResponseType">
<xs:sequence>
<xs:element ref="subsc:subscription" minOccurs="0" maxOccurs="1"/>
<xs:group ref="base:ErrorStatusGroup"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="EnrollmentResponseType">
<xs:sequence>
<xs:element ref="enroll:enrollment" minOccurs="0" maxOccurs="1"/>
<xs:group ref="base:ErrorStatusGroup"/>
</xs:sequence>
</xs:complexType>
</xs:schema>
</file>
<file path="PRIME_SERVICES_XSD/connector-enrollment/enrollment.xsd">
<?xml version="1.0"?>
<!-- edited with XMLSpy v2014 sp1 (http://www.altova.com) by Rebecca (healthedge) -->
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns="http://www.healthedge.com/connector/schema/enrollment" xmlns:tns="http://www.healthedge.com/connector/schema/enrollment" xmlns:base="http://www.healthedge.com/connector/schema/basetypes" xmlns:subscription="http://www.healthedge.com/connector/schema/subscription" xmlns:membership="http://www.healthedge.com/connector/schema/membership" targetNamespace="http://www.healthedge.com/connector/schema/enrollment" elementFormDefault="unqualified" version="4.0">
<xs:import namespace="http://www.healthedge.com/connector/schema/basetypes" schemaLocation="../connector-common-schema/base-types.xsd"/>
<xs:import namespace="http://www.healthedge.com/connector/schema/subscription" schemaLocation="subscription.xsd"/>
<xs:import namespace="http://www.healthedge.com/connector/schema/membership" schemaLocation="membership.xsd"/>
<xs:element name="enrollment" type="EnrollmentType"/>
<xs:complexType name="EnrollmentType">
<xs:complexContent>
<xs:extension base="base:HealthRulesResourceType">
<xs:group ref="EnrollmentGroup"/>
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:group name="EnrollmentGroup">
<xs:sequence>
<xs:element name="asOfDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="subscription" type="subscription:SubscriptionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="members" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="member" type="membership:MembershipType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<!--xs:element name="planSelections" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="planSelection" type="enrollmenttypes:MembershipPlanSelectionsType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="individual" type="enrollmenttypes:IndividualType" minOccurs="0" maxOccurs="1"/-->
</xs:sequence>
</xs:group>
</xs:schema>
</file>
<file path="PRIME_SERVICES_XSD/connector-enrollment/membership.xsd">
<?xml version="1.0"?>
<!-- edited with XMLSpy v2014 sp1 (http://www.altova.com) by Rebecca (healthedge) -->
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns="http://www.healthedge.com/connector/schema/membership" xmlns:tns="http://www.healthedge.com/connector/schema/membership" xmlns:base="http://www.healthedge.com/connector/schema/basetypes" targetNamespace="http://www.healthedge.com/connector/schema/membership" elementFormDefault="unqualified" version="4.0">
<xs:import namespace="http://www.healthedge.com/connector/schema/basetypes" schemaLocation="../connector-common-schema/base-types.xsd"/>
<xs:element name="membership" type="MembershipType"/>
<xs:complexType name="MembershipType">
<xs:complexContent>
<xs:extension base="base:HealthRulesResourceType">
<xs:group ref="MembershipGroup"/>
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:simpleType name="ProviderRoleType">
<xs:restriction base="xs:string">
<xs:enumeration value="PCP">
<xs:annotation><xs:documentation>Primary Care Provider</xs:documentation></xs:annotation>
</xs:enumeration>
<xs:enumeration value="OBGYN">
<xs:annotation><xs:documentation>Obstetrical Gynecologist</xs:documentation></xs:annotation>
</xs:enumeration>
<xs:enumeration value="MHF">
<xs:annotation><xs:documentation>Mental Health Facility</xs:documentation></xs:annotation>
</xs:enumeration>
<xs:enumeration value="Hosp">
<xs:annotation><xs:documentation>Home Hospital</xs:documentation></xs:annotation>
</xs:enumeration>
<xs:enumeration value="Network">
<xs:annotation><xs:documentation>Primary Network</xs:documentation></xs:annotation>
</xs:enumeration>
<xs:enumeration value="Fitness">
<xs:annotation><xs:documentation>Fitness Center</xs:documentation></xs:annotation>
</xs:enumeration>
<xs:enumeration value="3D">
<xs:annotation><xs:documentation>Obstetrics and Gynecology Facility</xs:documentation></xs:annotation>
</xs:enumeration>
<xs:enumeration value="Laboratory">
<xs:annotation><xs:documentation>Laboratory</xs:documentation></xs:annotation>
</xs:enumeration>
<xs:enumeration value="Facility">
<xs:annotation><xs:documentation>Facility</xs:documentation></xs:annotation>
</xs:enumeration>
<xs:enumeration value="Optometrist">
<xs:annotation><xs:documentation>Doctor of Optometry</xs:documentation></xs:annotation>
</xs:enumeration>
<xs:enumeration value="Pharmacy">
<xs:annotation><xs:documentation>Pharmacy</xs:documentation></xs:annotation>
</xs:enumeration>
<xs:enumeration value="Dentist">
<xs:annotation><xs:documentation>Dentist</xs:documentation></xs:annotation>
</xs:enumeration>
<xs:enumeration value="MCO">
<xs:annotation><xs:documentation>Managed Care Organization</xs:documentation></xs:annotation>
</xs:enumeration>
<xs:enumeration value="Restricted Physician">
<xs:annotation><xs:documentation>Restricted Physician</xs:documentation></xs:annotation>
</xs:enumeration>
<xs:enumeration value="Restricted Clinic">
<xs:annotation><xs:documentation>Restricted Clinic</xs:documentation></xs:annotation>
</xs:enumeration>
<xs:enumeration value="Restricted Hospital">
<xs:annotation><xs:documentation>Restricted Hospital</xs:documentation></xs:annotation>
</xs:enumeration>
<xs:enumeration value="Restricted Pharmacy">
<xs:annotation><xs:documentation>Restricted Pharmacy</xs:documentation></xs:annotation>
</xs:enumeration>
<xs:enumeration value="Care Coordination Organization">
<xs:annotation><xs:documentation>Care Coordination Organization</xs:documentation></xs:annotation>
</xs:enumeration>
<xs:enumeration value="Care Coordinator">
<xs:annotation><xs:documentation>Care Coordinator</xs:documentation></xs:annotation>
</xs:enumeration>
<xs:enumeration value="Managing Provider">
<xs:annotation><xs:documentation>Managing Provider</xs:documentation></xs:annotation>
</xs:enumeration>
<xs:enumeration value="Vision">
<xs:annotation><xs:documentation>Vision</xs:documentation></xs:annotation>
</xs:enumeration>
<xs:enumeration value="Allergy">
<xs:annotation><xs:documentation>Allergy</xs:documentation></xs:annotation>
</xs:enumeration>
<xs:enumeration value="Ear Nose Throat">
<xs:annotation><xs:documentation>Ear Nose Throat</xs:documentation></xs:annotation>
</xs:enumeration>
</xs:restriction>
</xs:simpleType>
<xs:group name="MembershipGroup">
<xs:sequence>
<xs:element name="membershipIdentifier" type="xs:long" minOccurs="0" maxOccurs="1"/>
<xs:element name="memberIsSubscriber" type="xs:boolean" default="false" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>If true, the member is the subscriber. This is automatically set by the system for members with relationship to subscriber "self". </xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="outOfServiceArea" type="xs:boolean" default="false" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>If true, the member lives outside the service area for their benefit plan.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="hccIdentifier" type="base:String50Type" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>The business identifier for the member. This can be generated by adding a suffix to the subscription ID based on configured rules.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="receiptDate" type="xs:date" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Date on which the member's application was received from the account.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="smokingStatus" type="base:SmokingStatusType">
<xs:annotation>
<xs:documentation>Member's smoking status.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="waivePHIClaimViewRestriction" type="xs:boolean" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Specifies if PHI claim view restriction defined at the Health Insurance Company level applies to this member.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="payeeHccId" type="base:String50Type" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>If checks and correspondence for this member should go to someone other than the subscriber, the other member's HCC ID should be placed in this field.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="isMemberInHospice" type="xs:boolean" default="false" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Indicates if Member is in hospice. </xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="individual" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:group ref="base:IndividualInformationGroup"/>
</xs:complexType>
</xs:element>
<xs:element name="physicalAddress" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>A list of the member's physical addresses. A residential address must be present, and other addresses (work, school, seasonal) may also be included. Each member has their own address.</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="memberPhysicalAddress" type="base:MemberPhysicalAddressType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="correspondenceAddress" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Member's correspondence address.</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:group ref="base:MemberCorrespondenceAddressGroup"/>
</xs:complexType>
</xs:element>
<xs:element name="otherIdNumberList" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>A list of other identification numbers for the member. These can be used for links to other systems, or to improve claim matching.</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="identificationNumber" type="base:IdentificationNumberType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="disabilityInfoForEligibility" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>If the member has extended eligibility because of a disability, thiese elements contain information and validation about the disability.</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:group ref="base:DisabilityInfoForEligibilityGroup"/>
</xs:complexType>
</xs:element>
<xs:element name="dependentVerification" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="dependentVerification" type="base:DependentVerificationType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="physicalCharacteristics" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:group ref="base:PhysicalCharacteristicGroup"/>
</xs:complexType>
</xs:element>
<xs:element name="employmentInfo" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:group ref="base:EmploymentInfoGroup"/>
</xs:complexType>
</xs:element>
<xs:element name="dentalInfo" type="base:MemberDentalInfoType" minOccurs="0" maxOccurs="1">
</xs:element>
<xs:element name="priorCoverageInfo" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:group ref="base:PriorCoverageInfoGroup"/>
</xs:complexType>
</xs:element>
<xs:element name="preExistingConditionInfo" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="preExistingConditionInfo" type="base:PreExistingConditionType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="preExReduction" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>These elements can be used to override the default pre-existing condition behavior.</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:group ref="base:PreExReductionGroup"/>
</xs:complexType>
</xs:element>
<xs:element name="otherResponsiblePersonInfo" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Information on a person other than the subscriber who is legally responsible for a member.</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="otherResponsiblePersonInfo" type="base:OtherResponsiblePersonInfoType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="memberRepresentative" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Individuals with special authorization regarding the member.</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="authorizedIndividual" type="base:AuthorizedIndividualType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="membershipUDTList" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>User-defined terms on the member record.The available custom fields are configured on the benefit plan.</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="membershipUDT" type="base:UDTListType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="informationAccessPermissionList" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Identifies persons with unusual PHI permissions.</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="HIPAAPermission" type="base:HIPAAPermissionType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="informationAccessRestrictionList" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Identifies persons with unusual PHI restrictions.</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="HIPAARestriction" type="base:HIPAARestrictionType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="phiAuthorizationList" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>List of PHI authorizations.</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="HIPAAAuthorization" type="base:HIPAAAuthorizationType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="ccDirectiveList" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Confidential communications directivies. These are used for situations such as endangered members. In such a case, all communications related to the member are sent to the member, not the subscriber.</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="confidentialCommunicationDirective" type="base:ConfidentialCommunicationDirectiveType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="subscriptionReference" type="base:ReferenceType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>The subscription of which the membership is a part.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="individualReference" type="base:ReferenceType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>In Medicaid lines of business, it can be important to track the head of household, even if that individual is not part of the subscription.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="relationshipToSubscriberDefinitionReference" type="base:ReferenceType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>The member's relationship to the subscriber. This generally uses the HIPAA relationship codes, which are mapped to member types Subscriber, Spouse, Child, Dependent, or Domestic Partner. If the member type is Subscriber, then memberIsSubscriber is automatically True.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="raceOrEthnicityCodes" type="CodeEntryInputTypeForRaceEthnicity" minOccurs="0" maxOccurs="unbounded">
<xs:annotation>
<xs:documentation>The member's race or ethnicity, wihch may be required by government programs.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="vipReasonCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Reference to VIPReason or HealthStatusReason codeset.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="healthStatusReasonCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Reference to HealthStatusReason codeset; the reason this member has restricted health status.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="informationSourceCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Reference to the InformationSource codeset; the origin site of the information that triggered the membership request.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="attachmentSetReference" type="base:ReferenceType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>External documents related to the membership.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="planSelection" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>From MemberSelections; a list of plans in which the member has enrolled.</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="startDate" type="xs:date"/>
<xs:element name="endDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="enrollmentInfo" type="EnrollmentInformationType" minOccurs="0" maxOccurs="1"/>
<xs:element name="memberTerminateReasonCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
<!-- <xs:element name="benefitPlanIdentificationNumber" type="base:String50Type" minOccurs="0" maxOccurs="1"/> -->
<xs:element name="benefitPlanReference" type="base:BenefitPlanReferenceType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="providerSelection" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>From MemberSelections; a list of provider choices the member has made. </xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="providerRoleType" type="ProviderRoleType" nillable="true" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Type of Provider</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="startDate" type="xs:date"/>
<xs:element name="endDate" type="xs:date"/>
<!-- <xs:element name="practionerIdentIficationNumber" type="base:String50Type" minOccurs="0" maxOccurs="1"/> -->
<xs:element name="practitionerReference" type="base:PractitionerReferenceType" minOccurs="0" maxOccurs="1"/>
<xs:element name="practitionerRoleReference" type="base:PractitionerByRoleReferenceType" minOccurs="0" maxOccurs="1"/>
<xs:element name="supplierReference" type="base:SupplierReferenceType" minOccurs="0" maxOccurs="1"/>
<xs:element name="affiliatedSupplierNetworkReference" type="base:SupplierNetworkReferenceType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
</xs:element>
</xs:sequence>
</xs:group>
<xs:group name="EnrollmentInformationGroup">
<xs:sequence>
<xs:element name="applicationSignatureDomain" type="ApplicationSignatureDomainType" minOccurs="0" maxOccurs="1"/>
<xs:element name="applicationSignatureDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="applicationReceiptDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="completedDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="submitDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="disenrollDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="disenrollReason" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="medicareEnrollmentPeriodCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:complexType name="EnrollmentInformationType">
<xs:group ref="EnrollmentInformationGroup"/>
</xs:complexType>
<xs:simpleType name="ApplicationSignatureDomainType">
<xs:restriction base="xs:string">
<xs:enumeration value="1"/>
<xs:enumeration value="2"/>
<xs:enumeration value="3"/>
</xs:restriction>
</xs:simpleType>
<xs:complexType name="CodeEntryInputTypeForRaceEthnicity">
<xs:sequence>
<xs:group ref="CodeEntryInputGroupForRaceOrEthnicity"/>
</xs:sequence>
</xs:complexType>
<xs:group name="CodeEntryInputGroupForRaceOrEthnicity">
<xs:sequence>
<xs:element name="codeSetName" type="String50Type" minOccurs="0" maxOccurs="1"/>
<xs:choice>
<xs:element name="codeEntry" type="String50Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="shortName" type="String50Type" minOccurs="0" maxOccurs="1"/>
</xs:choice>
<xs:element name="raceOrEthnicitySourceCodeEntry" type="base:CodeEntryInputType"  minOccurs="0" maxOccurs="1"/>
<xs:element name="entryDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:simpleType name="String50Type">
<xs:annotation>
<xs:documentation>50 Characters (Payor Constraint: ITS String type)</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:maxLength value="50"/>
</xs:restriction>
</xs:simpleType>
</xs:schema>
</file>
<file path="PRIME_SERVICES_XSD/connector-enrollment/subscription.xsd">
<?xml version="1.0"?>
<!-- edited with XMLSpy v2014 sp1 (x64) (http://www.altova.com) by Kumar Hanumolu (HEALTHEDGE SOFTWARE INC) -->
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema"
xmlns="http://www.healthedge.com/connector/schema/subscription"
xmlns:tns="http://www.healthedge.com/connector/schema/subscription"
xmlns:base="http://www.healthedge.com/connector/schema/basetypes"
xmlns:payeeBankAccount="http://www.healthedge.com/connector/schema/payeebankaccounts"
targetNamespace="http://www.healthedge.com/connector/schema/subscription"
elementFormDefault="unqualified"
version="4.0">
<xs:import namespace="http://www.healthedge.com/connector/schema/basetypes" schemaLocation="../connector-common-schema/base-types.xsd"/>
<xs:import namespace="http://www.healthedge.com/connector/schema/payeebankaccounts" schemaLocation="../connector-payeebankaccounts/payeeBankAccounts.xsd"/>
<xs:element name="subscription" type="SubscriptionType"/>
<xs:complexType name="SubscriptionType">
<xs:complexContent>
<xs:extension base="base:HealthRulesResourceType">
<xs:group ref="SubscriptionGroup"/>
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:group name="SubscriptionGroup">
<xs:sequence>
<xs:element name="subscriptionIdentifier" type="xs:long" minOccurs="0" maxOccurs="1"/>
<xs:element name="payeeHccId" type="base:String50Type" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>To whom should checks be sent for this subscription. Checks are sent to the subscriber when member pay for services out of pocket and submit receipts. This field is used for cases such as an out-of-country subscriber who is unable to cash a check. Do not use for endangered members where a member should have a check sent to a differnt payee.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="hccIdentifier" type="base:String50Type" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Business identifier for the subscription. Member IDs are often generated by adding suffixes to this ID. </xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="receiptDate" type="xs:date" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Date the subscription application was received. </xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="originalEffectiveDate" type="xs:date" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Date the subscriber first became active with the health plan. If converting members, this may be earlier than the earliest active date in the system. This date is not used by the system.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="applicationSignature" type="xs:boolean" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>If true, the enrollment application was signed. </xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="applicationDate" type="xs:date" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Date on which the subscriber signed the enrollment application. </xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="lastPremiumPaidDate" type="xs:date" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Last date on which the premium was paid. </xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="paymentHold" type="PaymentHoldGroupType" minOccurs="0" maxOccurs="1">
</xs:element>
<xs:element name="subscriptionUDTList" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>User-defined terms or custom fields for the subscription. The list of available fields is configured on the benefit plan.</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="subscriptionUDT" type="base:UDTListType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="qualityControlReviewConclusions" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="qualityControlReviewConclusion" type="QualityControlReviewConclusionType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="accountReference" type="base:AccountReferenceType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>The account through which coverage is offered. For group business, this will be the subscriber's employer. For individuals business, this will be an umbrella such as Medicare, Medicaid, etc.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="vipReasonCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>The reason a subscription is a VIP subscription. If this is set, then VIP permissions are required for access to the subscription and related data such as claims and authorizations.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="informationSourceCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Reference to the InformationSource codeset, which identifies how the subscription application was received (EDI, paper, etc.).</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="cobraSelection" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>From SubscriptionSelections</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="cobraStart" type="xs:date" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Date on which COBRA coverage begins. </xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="cobraEnd" type="xs:date" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Date on which COBRA coverage ends. </xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="cobraReceiptDate" type="xs:date" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Date on which the COBRA application was received.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="cobraPaidThroughDate" type="xs:date" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Date through which COBRA premiums have been paid.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="comment" type="base:String1000Type" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Comment about the COBRA coverage.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="cobraQualifyingEventCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Reference to the CobraQualifyingEvent codeset; identifies the reason for putting the subscription on COBRA. </xs:documentation>
</xs:annotation>
</xs:element>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="payeeBankAccount" type="payeeBankAccount:PayeeBankAccountsType" minOccurs="0" maxOccurs="1" />
</xs:sequence>
</xs:group>
<xs:group name="PaymentHoldGroup">
<xs:sequence>
<xs:element name="enablePaymentHold" type="xs:boolean" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>If true, claims are held and no payments are sent. Note that these claims are not in a workbasket.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="requestingUser" type="base:String50Type" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Name of the person who requested the hold. This person is not necessarily a user in the system.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="paymentHoldReasonDescription" type="base:String50Type" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Text describing the reason for the hold.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="paymentHoldReasonCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Reference to a PayHoldReason codeset entry.</xs:documentation>
</xs:annotation>
</xs:element>
</xs:sequence>
</xs:group>
<xs:complexType name="PaymentHoldGroupType">
<xs:group ref="PaymentHoldGroup" />
</xs:complexType>
<xs:complexType name="QualityControlReviewConclusionType">
<xs:group ref="QualityControlReviewConclusionGroup"/>
</xs:complexType>
<xs:group name="QualityControlReviewConclusionGroup">
<xs:sequence>
<xs:element name="transactionId" type="xs:long" minOccurs="0" maxOccurs="1"/>
<xs:element name="sendToReview" type="xs:boolean" minOccurs="0" maxOccurs="1"/>
<xs:element name="userName" type="base:StringIdentifierType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
</xs:schema>
</file>
<file path="PRIME_SERVICES_XSD/connector-enrollmentsparse/enrollment-sparse-lookup.xsd">
<?xml version="1.0" encoding="UTF-8"?>
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema"
xmlns:base="http://www.healthedge.com/connector/schema/basetypes"
xmlns="http://www.healthedge.com/connector/schema/enrollmentsparselookup"
xmlns:tns="http://www.healthedge.com/connector/schema/enrollmentsparselookup"
xmlns:memberSparse="http://www.healthedge.com/connector/schema/membershipsparse"
xmlns:subSparse="http://www.healthedge.com/connector/schema/subscriptionsparse"
xmlns:enrollSparse="http://www.healthedge.com/connector/schema/enrollmentsparse"
xmlns:minput="http://www.healthedge.com/connector/schema/matchinput"
targetNamespace="http://www.healthedge.com/connector/schema/enrollmentsparselookup"
elementFormDefault="unqualified" version="4.1">
<xs:annotation>
<xs:documentation>
DISCLAIMER
This pre-release software provided by HealthEdge Inc. is a work-in-progress.
HealthEdge provides pre-release information to early adopters for the purpose of design and planning.
It has no warranty either explicit or implied and is subject to change.
</xs:documentation>
</xs:annotation>
<xs:import namespace="http://www.healthedge.com/connector/schema/basetypes" schemaLocation="../connector-common-schema/base-types.xsd"/>
<xs:import namespace="http://www.healthedge.com/connector/schema/membershipsparse" schemaLocation="membership-sparse.xsd"/>
<xs:import namespace="http://www.healthedge.com/connector/schema/subscriptionsparse" schemaLocation="subscription-sparse.xsd"/>
<xs:import namespace="http://www.healthedge.com/connector/schema/enrollmentsparse" schemaLocation="enrollment-sparse.xsd"/>
<xs:import namespace="http://www.healthedge.com/connector/schema/matchinput" schemaLocation="../connector-common-schema/match-input.xsd"/>
<xs:element name="enrollmentSparseLookupResponse" type="EnrollmentSparseResponseType"/>
<xs:element name="subscriptionSparseLookupResponse" type="SubscriptionSparseResponseType"/>
<xs:element name="membershipSparseLookupResponse" type="MembershipSparseResponseType"/>
<xs:element name="enrollmentLookupCriteria" type="EnrollmentLookupType"/>
<xs:complexType name="EnrollmentLookupType">
<xs:complexContent>
<xs:extension base="minput:MemberMatchInputType">
<xs:sequence>
<xs:element name="latestEndorsementEffectiveDate" type="xs:dateTime" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:element name="membershipLookupCriteria" type="MembershipLookupType"/>
<xs:complexType name="MembershipLookupType">
<xs:complexContent>
<xs:extension base="minput:MemberMatchInputType">
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:element name="subscriptionLookupCriteria" type="SubscriptionLookupType"/>
<xs:complexType name="SubscriptionLookupType">
<xs:complexContent>
<xs:extension base="minput:MemberMatchInputType">
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:complexType name="MembershipSparseResponseType">
<xs:sequence>
<xs:element ref="memberSparse:membership" minOccurs="0" maxOccurs="1"/>
<xs:group ref="base:ErrorStatusGroup"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="SubscriptionSparseResponseType">
<xs:sequence>
<xs:element ref="subSparse:subscription" minOccurs="0" maxOccurs="1"/>
<xs:group ref="base:ErrorStatusGroup"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="EnrollmentSparseResponseType">
<xs:sequence>
<xs:element ref="enrollSparse:enrollment" minOccurs="0" maxOccurs="1"/>
<xs:group ref="base:ErrorStatusGroup"/>
</xs:sequence>
</xs:complexType>
</xs:schema>
</file>
<file path="PRIME_SERVICES_XSD/connector-enrollmentsparse/enrollment-sparse-response.xsd">
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<!-- edited with XMLSpy v2014 sp1 (x64) (http://www.altova.com) by Rebecca Stevenson (HEALTHEDGE SOFTWARE INC) -->
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema"
xmlns="http://www.healthedge.com/connector/schema/enrollmentsparseresponse"
xmlns:tns="http://www.healthedge.com/connector/schema/enrollmentsparseresponse"
xmlns:base="http://www.healthedge.com/connector/schema/basetypes"
xmlns:subsidy="http://www.healthedge.com/connector/schema/subsidy"
xmlns:hicn="http://www.healthedge.com/connector/schema/medicarehicn"
xmlns:cobpolicy="http://www.healthedge.com/connector/schema/cobpolicy"
xmlns:memberfactors="http://www.healthedge.com/connector/schema/memberfactors"
xmlns:payeebankaccount="http://www.healthedge.com/connector/schema/payeebankaccounts"
xmlns:enrollment="http://www.healthedge.com/connector/schema/enrollmenttypes"
targetNamespace="http://www.healthedge.com/connector/schema/enrollmentsparseresponse"
elementFormDefault="unqualified" version="4.1">
<xs:annotation>
<xs:documentation>
DISCLAIMER
This  pre-release software provided by HealthEdge Inc. is a work-in-progress.
HealthEdge provides pre-release information to early adopters for the purpose of design and planning.
It has no warranty either explicit or implied and is subject to change.
</xs:documentation>
</xs:annotation>
<xs:import namespace="http://www.healthedge.com/connector/schema/basetypes" schemaLocation="../connector-common-schema/base-types.xsd"/>
<xs:import namespace="http://www.healthedge.com/connector/schema/medicarehicn" schemaLocation="../connector-medicarehicn/MedicareHICNInfo.xsd"/>
<xs:import namespace="http://www.healthedge.com/connector/schema/cobpolicy" schemaLocation="../connector-cobpolicy/cobPolicy.xsd"/>
<xs:import namespace="http://www.healthedge.com/connector/schema/subsidy" schemaLocation="../connector-subsidy/subsidies.xsd"/>
<xs:import namespace="http://www.healthedge.com/connector/schema/memberfactors" schemaLocation="../connector-memberfactors/memberFactors.xsd"/>
<xs:import namespace="http://www.healthedge.com/connector/schema/payeebankaccounts" schemaLocation="../connector-payeebankaccounts/payeeBankAccounts.xsd"/>
<xs:import namespace="http://www.healthedge.com/connector/schema/enrollmenttypes" schemaLocation="enrollment-types.xsd"/>
<xs:element name="enrollmentResponse" type="EnrollmentResponseType"/>
<xs:complexType name="EnrollmentResponseType">
<xs:sequence>
<xs:element name="transactionId" type="base:String60Type" minOccurs="0" maxOccurs="1" />
<xs:element name="subscriptionId" type="xs:string" minOccurs="0">
<xs:annotation>
<xs:documentation>Subscription for which the enrollment was submitted.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="subscriberId" type="xs:string" minOccurs="0">
<xs:annotation>
<xs:documentation>Subscriber for whom the enrollment was submitted.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="informationSource" type="xs:string" minOccurs="0">
<xs:annotation>
<xs:documentation>Source system for the enrollment.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="status" type="base:ServiceStatusType" minOccurs="0">
<xs:annotation>
<xs:documentation>Enrollment status. SUCCESS (transaction complete without errors or validation failures), FAILURE (system or validation error), NOCHANGE (request resulted in no net subscription, so was not submitted).</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="enrollmentType" type="EnrollmentTransactionType" minOccurs="0">
<xs:annotation>
<xs:documentation>The type of enrollment. Add (new enrollment), Amend (update to existing enrollment), Term (termination), or Reinstate (reinstatement of previous enrollment).</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="accountChangeStatus" type="base:ServiceStatusType" minOccurs="0" maxOccurs="1"/>
<xs:element name="accountChangeCVCId" type="xs:long" minOccurs="0" maxOccurs="1"/>
<xs:element name="binderPaymentStatus" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="transactionInformation" type="base:TransactionInformationType" minOccurs="0"/>
<xs:element name="secondaryTransactionInformation" type="base:TransactionInformationType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="member" type="MemberResponseType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="reportingCategory" type="ReportingCategoryResponseType" minOccurs="0" maxOccurs="1"/>
<xs:element name="errors" type="base:ErrorsType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Exception string in case of system error.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="subsidyResponse" type="subsidy:SubscriptionSubsidyResponseType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="cobPolicyResponse" type="cobpolicy:COBPolicyResponseType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="medicareHICNResponse" type="hicn:MedicareHICNInfoResponseType" minOccurs="0" maxOccurs="unbounded" />
<xs:element name="memberFactorsResponse" type="memberfactors:MemberFactorsResponseType" minOccurs="0" maxOccurs="unbounded" />
<xs:element name="payeeBankAccountResponse" type="payeebankaccount:PayeeBankAccountsResponseType" minOccurs="0" maxOccurs="1" />
<!--  populated in case of FAILURE -->
</xs:sequence>
</xs:complexType>
<xs:complexType name="ReportingCategoryResponseType">
<xs:sequence>
<xs:element name="subscriberResponsibleAmount" type="base:CurrencyType" minOccurs="0"/>
<xs:element name="accountResponsibleAmount" type="base:CurrencyType" minOccurs="0"/>
<xs:element name="startDate" type="xs:string" minOccurs="0"/>
<xs:element name="endDate" type="xs:string" minOccurs="0"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="MemberResponseType">
<xs:sequence>
<xs:element name="memberId" type="xs:string" minOccurs="0">
<xs:annotation>
<xs:documentation>ID of the member for whom the enrollment was submitted.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="maintenanceOverride" type="xs:boolean" default="true" minOccurs="0" maxOccurs="1" />
<xs:element name="maintenanceOverrideResult" type="xs:string" minOccurs="0" maxOccurs="1" />
<xs:element name="lastName" type="xs:string" minOccurs="0">
<xs:annotation>
<xs:documentation>Last name of the member for whom the enrollment was submitted.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="firstName" type="xs:string" minOccurs="0">
<xs:annotation>
<xs:documentation>First name of the member for whom the enrollment was submitted.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="dob" type="xs:string" minOccurs="0">
<xs:annotation>
<xs:documentation>Date of birth of the member for whom the enrollment was submitted. </xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="endorsementDate" type="xs:string" minOccurs="0">
<xs:annotation>
<xs:documentation>Endorsement date for the enrollment.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="status" type="base:ServiceStatusType" minOccurs="0">
<xs:annotation>
<xs:documentation>Enrollment status. SUCCESS (transaction complete without errors or validation failures), FAILURE (system or validation error), NOCHANGE (request resulted in no net subscription, so was not submitted).</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="planSelection" type="PlanSelectionType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="providerSelection" type="ProviderSelectionType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="transactionInformation" type="base:TransactionInformationType" minOccurs="0"/>
<xs:element name="secondaryTransactionInformation" type="base:TransactionInformationType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="individualMappingInfo" type="IndividualMappingInfo" minOccurs="0" maxOccurs="1"/>
<xs:element name="memberInputID" type="xs:string" minOccurs="0">
<xs:annotation>
<xs:documentation>The input member ID, used for auditing and traceability.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="manualReviewList" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="listMode" type="base:ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="manualReview" type="enrollment:MemberManualReviewType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
</xs:sequence>
</xs:complexType>
<xs:complexType name="IndividualMappingInfo">
<xs:sequence>
<xs:element name="status" type="base:ServiceStatusType" minOccurs="0" maxOccurs="1"/>
<xs:element name="message" type="base:String50Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="errors" type="base:ErrorsType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="PlanSelectionType">
<xs:sequence>
<xs:element name="enrolledPlan" type="xs:string" minOccurs="0">
<xs:annotation>
<xs:documentation>Plan in which the member is enrolled.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="startDate" type="xs:string" minOccurs="0">
<xs:annotation>
<xs:documentation>Start date of the plan.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="endDate" type="xs:string" minOccurs="0">
<xs:annotation>
<xs:documentation>End date of the plan.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="disenrollDate" type="xs:string" minOccurs="0">
<xs:annotation>
<xs:documentation>Disenrollment date of the plan.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="disenrollReason" type="xs:string" minOccurs="0">
<xs:annotation>
<xs:documentation>Reason for disenrollment.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="waiveBenefitWaitingPeriod" type="xs:boolean" default="false" minOccurs="0" maxOccurs="1" />
</xs:sequence>
</xs:complexType>
<xs:complexType name="ProviderSelectionType">
<xs:sequence>
<xs:element name="practitioner" type="xs:string" minOccurs="0">
<xs:annotation>
<xs:documentation>Pracitioner name.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="practitionerNPI" type="xs:string" minOccurs="0">
<xs:annotation>
<xs:documentation>Practitioner National Provider ID.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="pcp" type="xs:boolean" minOccurs="0">
<xs:annotation>
<xs:documentation>If true, practitioner is PCP.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="supplierNetwork" type="xs:string" minOccurs="0">
<xs:annotation>
<xs:documentation>supplier network name.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="startDate" type="xs:string" minOccurs="0"/>
<xs:element name="endDate" type="xs:string" minOccurs="0"/>
</xs:sequence>
</xs:complexType>
<xs:simpleType name="EnrollmentTransactionType">
<xs:restriction base="xs:string">
<xs:enumeration value="ADD"/>
<xs:enumeration value="AMEND"/>
<xs:enumeration value="TERMINATE"/>
<xs:enumeration value="REINSTATE"/>
</xs:restriction>
</xs:simpleType>
</xs:schema>
</file>
<file path="PRIME_SERVICES_XSD/connector-enrollmentsparse/enrollment-sparse.xsd">
<?xml version="1.0"?>
<!-- edited with XMLSpy v2014 sp1 (http://www.altova.com) by Rebecca (healthedge) -->
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema"
xmlns="http://www.healthedge.com/connector/schema/enrollmentsparse"
xmlns:tns="http://www.healthedge.com/connector/schema/enrollmentsparse"
xmlns:base="http://www.healthedge.com/connector/schema/basetypes"
xmlns:subscription="http://www.healthedge.com/connector/schema/subscriptionsparse"
xmlns:membership="http://www.healthedge.com/connector/schema/membershipsparse"
xmlns:enrollmenttypes="http://www.healthedge.com/connector/schema/enrollmenttypes"
xmlns:sparseResp="http://www.healthedge.com/connector/schema/enrollmentsparseresponse"
targetNamespace="http://www.healthedge.com/connector/schema/enrollmentsparse"
elementFormDefault="unqualified" version="4.1">
<xs:import namespace="http://www.healthedge.com/connector/schema/basetypes" schemaLocation="../connector-common-schema/base-types.xsd"/>
<xs:import namespace="http://www.healthedge.com/connector/schema/subscriptionsparse" schemaLocation="subscription-sparse.xsd"/>
<xs:import namespace="http://www.healthedge.com/connector/schema/membershipsparse" schemaLocation="membership-sparse.xsd"/>
<xs:import namespace="http://www.healthedge.com/connector/schema/enrollmenttypes" schemaLocation="enrollment-types.xsd"/>
<xs:import namespace="http://www.healthedge.com/connector/schema/enrollmentsparseresponse" schemaLocation="enrollment-sparse-response.xsd" />
<xs:element name="enrollment" type="EnrollmentType"/>
<xs:complexType name="EnrollmentType">
<xs:complexContent>
<xs:extension base="base:HealthRulesResourceType">
<xs:group ref="EnrollmentGroup"/>
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:simpleType name="ActionModeType">
<xs:restriction base="xs:string">
<xs:enumeration value="FULL" />
<xs:enumeration value="SPARSE" />
<xs:enumeration value="REPLACE" />
<xs:enumeration value="AUDIT" />
</xs:restriction>
</xs:simpleType>
<xs:group name="EnrollmentGroup">
<xs:sequence>
<xs:element name="transactionId" type="base:String60Type" maxOccurs="1" minOccurs="0" />
<xs:element name="actionMode" type="ActionModeType" maxOccurs="1" minOccurs="0" default="SPARSE" />
<xs:element name="asOfDate" type="xs:date" minOccurs="0" maxOccurs="1" />
<xs:element name="activate" type="xs:boolean" minOccurs="0" maxOccurs="1"/>
<xs:element name="subscriberId" type="base:String50Type" minOccurs="0" maxOccurs="1" />
<xs:element name="cascadeTerms" type="xs:boolean" default="true" minOccurs="0" maxOccurs="1" />
<xs:element name="cascadeCancels" type="xs:boolean" default="true" minOccurs="0" maxOccurs="1" />
<xs:element name="cascadeReinstate" type="xs:boolean" default="false" minOccurs="0" maxOccurs="1" />
<xs:element name="sendToWorkBasketIfExceptionsPresent" type="xs:boolean" default="true" minOccurs="0" maxOccurs="1" />
<xs:element name="requestFromHmem" type="xs:boolean" default="false" minOccurs="0" maxOccurs="1" />
<xs:element name="subscription" type="subscription:SubscriptionType" minOccurs="0" maxOccurs="1" />
<xs:element name="member" type="membership:MembershipType" minOccurs="1" maxOccurs="unbounded" />
<xs:element name="udtResultQuery" type="udtAttributes" minOccurs="0" maxOccurs="unbounded" />
<xs:element name="accountDateRanges" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="accountDateRangeListMode" type="base:ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="accountDateRange" type="AccountDateRangeType" minOccurs="0" maxOccurs="unbounded">
<xs:annotation>
<xs:documentation>
List of Account date range type for account change.
</xs:documentation>
</xs:annotation>
</xs:element>
</xs:sequence>
</xs:complexType>
</xs:element>
</xs:sequence>
</xs:group>
<xs:complexType name="EnrollmentTransitBeanType">
<xs:sequence>
<xs:element name="transaction" type="base:GenericTransactionType" minOccurs="0" maxOccurs="1" />
<xs:element name="input" type="EnrollmentType" minOccurs="0" maxOccurs="1" />
<xs:element name="response" type="sparseResp:EnrollmentResponseType" minOccurs="0" maxOccurs="1" />
<xs:element name="predicate" type="xs:boolean" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="udtAttributes">
<xs:sequence>
<xs:element name="udtName" type="xs:string" minOccurs="0" maxOccurs="1" />
<xs:element name="attributes" type="xs:string" minOccurs="0" maxOccurs="unbounded" />
</xs:sequence>
</xs:complexType>
<xs:complexType name="AccountDateRangeType">
<xs:sequence>
<xs:element name="accountHccIdentifier" type="base:AccountHccIDType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
The account through which coverage is offered.
For group business, this will be the
subscriber's employer. For individuals business,
this will be an umbrella such as Medicare,
Medicaid, etc.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="accountAsOfDate" type="xs:date" minOccurs="0" maxOccurs="1" />
<xs:element name="startValue"  type="xs:string" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
For internal purposes only. Do not use.
</xs:documentation>
</xs:annotation>
</xs:element>
</xs:sequence>
</xs:complexType>
</xs:schema>
</file>
<file path="PRIME_SERVICES_XSD/connector-enrollmentsparse/enrollment-types.xsd">
<?xml version="1.0"?>
<!-- edited with XMLSpy v2014 sp1 (http://www.altova.com) by Rebecca (healthedge) -->
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema"
xmlns:base="http://www.healthedge.com/connector/schema/basetypes"
xmlns="http://www.healthedge.com/connector/schema/enrollmenttypes"
xmlns:tns="http://www.healthedge.com/connector/schema/enrollmenttypes"
targetNamespace="http://www.healthedge.com/connector/schema/enrollmenttypes"
elementFormDefault="unqualified" version="4.1">
<xs:import namespace="http://www.healthedge.com/connector/schema/basetypes" schemaLocation="../connector-common-schema/base-types.xsd"/>
<xs:annotation>
<xs:documentation>
DISCLAIMER
This  pre-release software provided by HealthEdge Inc. is a work-in-progress.
HealthEdge provides pre-release information to early adopters for the purpose of design and planning.
It has no warranty either explicit or implied and is subject to change.
</xs:documentation>
</xs:annotation>
<xs:group name="PaymentHoldGroup">
<xs:sequence>
<xs:element name="enablePaymentHold" type="xs:boolean" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>If true, claims are held and no payments are sent. Note that these claims are not in a workbasket.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="requestingUser" type="base:String50Type" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Name of the person who requested the hold. This person is not necessarily a user in the system.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="paymentHoldReasonDescription" type="base:String50Type" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Text describing the reason for the hold.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="paymentHoldReasonCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Reference to a PayHoldReason codeset entry.</xs:documentation>
</xs:annotation>
</xs:element>
</xs:sequence>
</xs:group>
<xs:group name="QualityControlReviewConclusionGroup">
<xs:sequence>
<xs:element name="transactionId" type="xs:long" minOccurs="0" maxOccurs="1"/>
<xs:element name="sendToReview" type="xs:boolean" minOccurs="0" maxOccurs="1"/>
<xs:element name="userName" type="base:StringIdentifierType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:complexType name="QualityControlReviewConclusionType">
<xs:group ref="QualityControlReviewConclusionGroup"/>
</xs:complexType>
<xs:complexType name="ClaimReviewType">
<xs:group ref="ClaimReviewGroup"/>
</xs:complexType>
<xs:group name="ClaimReviewGroup">
<xs:sequence>
<xs:element name="enableClaimReview" type="xs:boolean" minOccurs="0" maxOccurs="1"/>
<xs:element name="claimType" type="ClaimReviewClaimType" default="Review All Claims" minOccurs="0" maxOccurs="1"/>
<xs:element name="claimReviewReasonCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
<xs:element name="reviewReasonDescription" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="requestingUser" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="reviewServiceStartDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="reviewServiceEndDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="reviewReceiptStartDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="reviewReceiptEndDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="reviewPractitionerList" type="ReviewPactitionerType" minOccurs="0" maxOccurs="1"/>
<xs:element name="reviewSupplierList" type="ReviewSupplierType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:complexType name="ReviewPactitionerType">
<xs:sequence>
<xs:element name="otherThan" type="xs:boolean" minOccurs="0" maxOccurs="1"/>
<xs:element name="practitionerReference" minOccurs="0" maxOccurs="unbounded">
<xs:complexType>
<xs:sequence>
<xs:element name="practitionerID" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="practitionerMatch" type="base:PractitionerReferenceType" minOccurs="1" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
</xs:element>
</xs:sequence>
</xs:complexType>
<xs:complexType name="ReviewSupplierType">
<xs:sequence>
<xs:element name="otherThan" type="xs:boolean" minOccurs="0" maxOccurs="1"/>
<xs:element name="supplierReference" minOccurs="0" maxOccurs="unbounded">
<xs:complexType>
<xs:sequence>
<xs:element name="supplierID" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="supplierMatch" type="base:SupplierReferenceType" minOccurs="1" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
</xs:element>
</xs:sequence>
</xs:complexType>
<xs:complexType name="IndividualType">
<xs:group ref="IndividualGroup"/>
</xs:complexType>
<xs:group name="IndividualGroup">
<xs:sequence>
<xs:element name="members" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="member" type="RelatedMemberType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="externalMemberInfo" type="ExternalMemberInformationType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:complexType name="RelatedMemberType">
<xs:sequence>
<xs:element name="applyClaimHistoryFromOtherMembers" type="xs:boolean" minOccurs="0" maxOccurs="1"/>
<xs:element name="membershipReference" type="base:ReferenceType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="ExternalMemberInformationType">
<xs:group ref="ExternalMemberInformationGroup"/>
</xs:complexType>
<xs:group name="ExternalMemberInformationGroup">
<xs:sequence>
<xs:element name="taxIdentificationNumber" type="base:SSNType" minOccurs="0" maxOccurs="1"/>
<xs:element name="primaryName" type="base:PersonNameType" minOccurs="0" maxOccurs="1"/>
<xs:element name="addressInfo" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="postalAddress" type="base:PostalAddressType" minOccurs="0" maxOccurs="1"/>
<xs:element name="addressPhoneList" type="base:TelephoneNumberType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
</xs:sequence>
</xs:group>
<xs:group name="PlanSelectionsGroup">
<xs:sequence>
<xs:element name="DateRangesGroup" type="DateRangesType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="InactiveDataRangesGroup" type="InactiveDateRangesType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="benefitPlanReference" type="base:ReferenceType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:complexType name="PlanSelectionsType">
<xs:group ref="PlanSelectionsGroup"/>
</xs:complexType>
<xs:group name="MembershipPlanSelectionsGroup">
<xs:sequence>
<xs:element name="dateRanges" type="MemberPlanSeclectionDateRangeType" minOccurs="0" maxOccurs="unbounded"/>
<!--xs:element name="inactiveDateRanges" type="MemberPlanSeclectionDateRangeType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="benefitPlanReference" type="base:ReferenceType" minOccurs="0" maxOccurs="1"/-->
</xs:sequence>
</xs:group>
<xs:complexType name="MembershipPlanSelectionsType">
<xs:group ref="MembershipPlanSelectionsGroup"/>
</xs:complexType>
<xs:group name="ProviderSelectionsGroup">
<xs:sequence>
<xs:element name="DateRangesGroup" type="DateRangesType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="InactiveDataRangesGroup" type="InactiveDateRangesType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="benefitPlanReference" type="base:ReferenceType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:complexType name="ProviderSelectionsType">
<xs:group ref="ProviderSelectionsGroup"/>
</xs:complexType>
<xs:group name="MembershipProviderSelectionsGroup">
<xs:sequence>
<xs:element name="ProviderRoleName" type="ProviderRoleDomainType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="dataRanges" type="MembershipInactiveDateRangesType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:group>
<xs:complexType name="MembershipProviderSelectionsType">
<xs:group ref="MembershipProviderSelectionsGroup"/>
</xs:complexType>
<xs:group name="ComplianceProgramSelectionsGroup">
<xs:sequence>
<xs:element name="MembershipDateRangesGroup" type="DateRangesType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="MembershipInactiveDataRangesGroup" type="InactiveDateRangesType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="benefitPlanReference" type="base:ReferenceType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:complexType name="ComplianceProgramSelectionsType">
<xs:group ref="ComplianceProgramSelectionsGroup"/>
</xs:complexType>
<xs:group name="MembershipComplianceProgramSelectionsGroup">
<xs:sequence>
<xs:element name="MembershipDateRangesGroup" type="DateRangesType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="MembershipInactiveDataRangesGroup" type="InactiveDateRangesType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="complianceProgramReference" type="base:ReferenceType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:complexType name="MembershipComplianceProgramSelectionsType">
<xs:group ref="MembershipComplianceProgramSelectionsGroup"/>
</xs:complexType>
<xs:group name="DateRangesGroup">
<xs:sequence>
<xs:element name="startDate" type="xs:date"/>
<xs:element name="endDate" type="xs:date"/>
<xs:element name="status" type="PlanSelectionStatus"/>
<xs:element name="MemeberGroup" type="MemberType" minOccurs="0" maxOccurs="unbounded"/>
<!-- SubscriptionSelections.planSelections -->
<xs:element name="coverageTier" type="base:ReferenceType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:complexType name="DateRangesType">
<xs:group ref="DateRangesGroup"/>
</xs:complexType>
<xs:group name="MemberPlanSeclectionDateRangeGroup">
<xs:sequence>
<!--xs:element name="startDate" type="xs:date"/>
<xs:element name="endDate" type="xs:date"/-->
<xs:element name="status" type="PlanSelectionStatus"/>
<xs:element name="enrollmentInfo" type="EnrollmentInformationType" minOccurs="0" maxOccurs="1"/>
<xs:element name="memberTerminateReasonCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:complexType name="MemberPlanSeclectionDateRangeType">
<xs:group ref="MemberPlanSeclectionDateRangeGroup"/>
</xs:complexType>
<xs:group name="MembershipDateRangesGroup">
<xs:sequence>
<xs:element name="startDate" type="xs:date"/>
<xs:element name="endDate" type="xs:date"/>
<xs:element name="coverage" type="CurrencyType"/>
<xs:element name="claimHistoryFromOtherPlans" type="ClaimHistoryFromOtherPlansType"/>
<xs:element name="status" type="PlanSelectionStatus"/>
<xs:element name="EnrollmentInfoGroup" type="EnrollmentInformationType" minOccurs="0" maxOccurs="1"/>
<xs:element name="benefitNetworkReference" type="base:ReferenceType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="memberTerminateReasonCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:complexType name="MembershipDateRangesType">
<xs:group ref="MembershipDateRangesGroup"/>
</xs:complexType>
<xs:group name="MembershipComplianceDateRangesGroup">
<xs:sequence>
<xs:element name="startDate" type="xs:date"/>
<xs:element name="endDate" type="xs:date"/>
<xs:element name="complianceCode" type="ComplianceCode"/>
</xs:sequence>
</xs:group>
<xs:complexType name="MembershipComplianceDateRangesType">
<xs:group ref="MembershipComplianceDateRangesGroup"/>
</xs:complexType>
<xs:group name="MemberGroup">
<xs:sequence>
<xs:element name="memberHccId" type="xs:long"/>
<xs:element name="memberType" type="xs:long"/>
<xs:element name="membershipReference" type="base:ReferenceType" minOccurs="0" maxOccurs="1"/>
<!-- SubscriptionSelections.planSelections -->
<xs:element name="coverageTier" type="base:ReferenceType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:complexType name="MemberType">
<xs:group ref="MemberGroup"/>
</xs:complexType>
<xs:group name="EnrollmentInformationGroup">
<xs:sequence>
<xs:element name="applicationSignatureDomain" type="ApplicationSignatureDomainType" minOccurs="0" maxOccurs="1"/>
<xs:element name="applicationSignatureDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="applicationReceiptDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="completedDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="submitDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="disenrollDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="disenrollReason" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="medicareEnrollmentPeriodCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:complexType name="EnrollmentInformationType">
<xs:group ref="EnrollmentInformationGroup"/>
</xs:complexType>
<xs:group name="InactiveDateRangesGroup">
<xs:sequence>
<xs:element name="startDate" type="xs:date"/>
<xs:element name="endDate" type="xs:date"/>
<xs:element name="status" type="PlanSelectionStatus"/>
<xs:group ref="MemberGroup" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:group>
<xs:complexType name="InactiveDateRangesType">
<xs:group ref="InactiveDateRangesGroup"/>
</xs:complexType>
<xs:group name="MembershipInactiveDateRangesGroup">
<xs:sequence>
<xs:element name="startDate" type="xs:date"/>
<xs:element name="endDate" type="xs:date"/>
<xs:element name="isAutoAssigned" type="xs:boolean"/>
<xs:element name="claimHistoryFromOtherPlans" type="ClaimHistoryFromOtherPlansType"/>
<xs:element name="selectedProvider" type="SelectedProviderType"/>
<xs:group ref="EnrollmentInformationGroup" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:group>
<xs:complexType name="MembershipInactiveDateRangesType">
<xs:group ref="MembershipInactiveDateRangesGroup"/>
</xs:complexType>
<xs:group name="SelectedProviderGroup">
<xs:sequence>
<xs:element name="practitionerReference" type="base:ReferenceType" minOccurs="0" maxOccurs="1"/>
<xs:element name="practitionerRoleReference" type="base:ReferenceType" minOccurs="0" maxOccurs="1"/>
<xs:element name="supplierReference" type="base:ReferenceType" minOccurs="0" maxOccurs="1"/>
<xs:element name="supplierNetworkReference" type="base:ReferenceType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:complexType name="SelectedProviderType">
<xs:group ref="SelectedProviderGroup"/>
</xs:complexType>
<xs:group name="ApplicationInfoGroup">
<xs:sequence>
<xs:element name="applicationId" type="base:String50Type" minOccurs="0" maxOccurs="1">
</xs:element>
<xs:element name="ratingArea" type="base:String50Type" minOccurs="0" maxOccurs="1">
</xs:element>
<xs:element name="paymentTransactionId" type="base:String50Type" minOccurs="0" maxOccurs="1">
</xs:element>
<xs:element name="paymentDate" type="xs:date" minOccurs="0" maxOccurs="1">
</xs:element>
</xs:sequence>
</xs:group>
<xs:group name="CobraSelectionsGroup">
<xs:sequence>
<xs:element name="cobraStart" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="cobraEnd" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="cobraReceiptDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="cobraPaidThroughDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="comment" type="base:String50Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="cobraQualifyingEventCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:complexType name="CobraSelectionsType">
<xs:group ref="CobraSelectionsGroup"/>
</xs:complexType>
<xs:complexType name="RaceOrEthnicityListRawType">
<xs:sequence>
<xs:element name="listMode" type="base:ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="raceOrEthnicityCodes" type="CodeEntryInputTypeForRaceEthnicity" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="MemberClaimReviewType">
<xs:complexContent>
<xs:extension base="ClaimReviewType">
<xs:sequence>
<xs:element name="serviceCategory" type="ServiceCategoryType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:complexType name="ServiceCategoryType">
<xs:sequence>
<xs:element name="serviceCategoryType" type="xs:string" minOccurs="1" maxOccurs="1"/>
<xs:choice>
<xs:element name="serviceCategoryIdentifier" type="xs:string" minOccurs="1" maxOccurs="1"/>
<xs:element name="serviceCategoryName" type="xs:string" minOccurs="1" maxOccurs="1"/>
</xs:choice>
</xs:sequence>
</xs:complexType>
<xs:complexType name="MemberManualReviewType">
<xs:sequence>
<xs:element name="manualReviewFlag" type="xs:boolean" minOccurs="1" maxOccurs="1"/>
<xs:element name="manualReviewReasonCode" type="base:CodeEntryInputType" minOccurs="1" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:simpleType name="PlanSelectionStatus">
<xs:restriction base="xs:string">
<xs:enumeration value="A"/>
<xs:enumeration value="P"/>
<xs:enumeration value="I"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="MemberTypeCode">
<xs:restriction base="xs:string">
<xs:enumeration value="1"/>
<xs:enumeration value="2"/>
<xs:enumeration value="3"/>
<xs:enumeration value="4"/>
<xs:enumeration value="5"/>
<xs:enumeration value="6"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="ClaimReviewClaimType">
<xs:restriction base="xs:string">
<xs:enumeration value="Review All Claims"/>
<xs:enumeration value="Review Denied Claims"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="ClaimHistoryFromOtherPlansType">
<xs:restriction base="xs:string">
<xs:enumeration value="1"/>
<xs:enumeration value="2"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="CurrencyType">
<xs:restriction base="xs:string"/>
</xs:simpleType>
<xs:simpleType name="ApplicationSignatureDomainType">
<xs:restriction base="xs:string">
<xs:enumeration value="1"/>
<xs:enumeration value="2"/>
<xs:enumeration value="3"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="ProviderRoleDomainType">
<xs:restriction base="xs:string">
<xs:enumeration value="1"/>
<xs:enumeration value="2"/>
<xs:enumeration value="3"/>
<xs:enumeration value="4"/>
<xs:enumeration value="5"/>
<xs:enumeration value="6"/>
<xs:enumeration value="7"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="ComplianceCode">
<xs:restriction base="xs:string">
<xs:enumeration value="U"/>
<xs:enumeration value="C"/>
<xs:enumeration value="N"/>
</xs:restriction>
</xs:simpleType>
<xs:complexType name="CodeEntryInputTypeForRaceEthnicity">
<xs:sequence>
<xs:group ref="CodeEntryInputGroupForRaceOrEthnicity"/>
</xs:sequence>
</xs:complexType>
<xs:group name="CodeEntryInputGroupForRaceOrEthnicity">
<xs:sequence>
<xs:element name="codeSetName" type="String50Type" minOccurs="0" maxOccurs="1"/>
<xs:choice>
<xs:element name="codeEntry" type="String50Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="shortName" type="String50Type" minOccurs="0" maxOccurs="1"/>
</xs:choice>
<xs:element name="raceOrEthnicitySourceCodeEntry" type="base:CodeEntryInputType"  minOccurs="0" maxOccurs="1"/>
<xs:element name="entryDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:simpleType name="String50Type">
<xs:annotation>
<xs:documentation>50 Characters (Payor Constraint: ITS String type)</xs:documentation>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:maxLength value="50"/>
</xs:restriction>
</xs:simpleType>
</xs:schema>
</file>
<file path="PRIME_SERVICES_XSD/connector-enrollmentsparse/membership-sparse.xsd">
<?xml version="1.0"?>
<!-- edited with XMLSpy v2014 sp1 (http://www.altova.com) by Rebecca (healthedge) -->
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns="http://www.healthedge.com/connector/schema/membershipsparse" xmlns:tns="http://www.healthedge.com/connector/schema/membershipsparse" xmlns:base="http://www.healthedge.com/connector/schema/basetypes" xmlns:enrollment="http://www.healthedge.com/connector/schema/enrollmenttypes" xmlns:minput="http://www.healthedge.com/connector/schema/matchinput" xmlns:hicn="http://www.healthedge.com/connector/schema/medicarehicn" xmlns:cobpolicy="http://www.healthedge.com/connector/schema/cobpolicy" xmlns:membercomplianceprogram="http://www.healthedge.com/connector/schema/membercomplianceprogram" xmlns:memberfactors="http://www.healthedge.com/connector/schema/memberfactors" targetNamespace="http://www.healthedge.com/connector/schema/membershipsparse" elementFormDefault="unqualified" version="4.2">
<xs:import namespace="http://www.healthedge.com/connector/schema/basetypes" schemaLocation="../connector-common-schema/base-types.xsd"/>
<xs:import namespace="http://www.healthedge.com/connector/schema/enrollmenttypes" schemaLocation="enrollment-types.xsd"/>
<xs:import namespace="http://www.healthedge.com/connector/schema/matchinput" schemaLocation="../connector-common-schema/match-input.xsd"/>
<xs:import namespace="http://www.healthedge.com/connector/schema/medicarehicn" schemaLocation="../connector-medicarehicn/MedicareHICNInfo.xsd"/>
<xs:import namespace="http://www.healthedge.com/connector/schema/cobpolicy" schemaLocation="../connector-cobpolicy/cobPolicy.xsd"/>
<xs:import namespace="http://www.healthedge.com/connector/schema/membercomplianceprogram" schemaLocation="../connector-membercomplianceprogram/memberComplianceProgram.xsd"/>
<xs:import namespace="http://www.healthedge.com/connector/schema/memberfactors" schemaLocation="../connector-memberfactors/memberFactors.xsd"/>
<xs:element name="membership" type="MembershipType"/>
<xs:complexType name="MembershipType">
<xs:complexContent>
<xs:extension base="base:HealthRulesResourceType">
<xs:group ref="MembershipGroup"/>
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:simpleType name="ClaimHistoryOtherPlansType">
<xs:annotation>
<xs:documentation/>
</xs:annotation>
<xs:restriction base="xs:string">
<xs:enumeration value="Carry forward"/>
<xs:enumeration value="Ignore"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="ProviderRoleType">
<xs:restriction base="xs:string">
<xs:enumeration value="PCP">
<xs:annotation>
<xs:documentation>Primary Care Provider</xs:documentation>
</xs:annotation>
</xs:enumeration>
<xs:enumeration value="OBGYN">
<xs:annotation>
<xs:documentation>Obstetrical Gynecologist</xs:documentation>
</xs:annotation>
</xs:enumeration>
<xs:enumeration value="MHF">
<xs:annotation>
<xs:documentation>Mental Health Facility</xs:documentation>
</xs:annotation>
</xs:enumeration>
<xs:enumeration value="Hosp">
<xs:annotation>
<xs:documentation>Home Hospital</xs:documentation>
</xs:annotation>
</xs:enumeration>
<xs:enumeration value="Network">
<xs:annotation>
<xs:documentation>Primary Network</xs:documentation>
</xs:annotation>
</xs:enumeration>
<xs:enumeration value="Fitness">
<xs:annotation>
<xs:documentation>Fitness Center</xs:documentation>
</xs:annotation>
</xs:enumeration>
<xs:enumeration value="3D">
<xs:annotation>
<xs:documentation>Obstetrics and Gynecology Facility</xs:documentation>
</xs:annotation>
</xs:enumeration>
<xs:enumeration value="Laboratory">
<xs:annotation>
<xs:documentation>Laboratory</xs:documentation>
</xs:annotation>
</xs:enumeration>
<xs:enumeration value="Facility">
<xs:annotation>
<xs:documentation>Facility</xs:documentation>
</xs:annotation>
</xs:enumeration>
<xs:enumeration value="Optometrist">
<xs:annotation>
<xs:documentation>Doctor of Optometry</xs:documentation>
</xs:annotation>
</xs:enumeration>
<xs:enumeration value="Pharmacy">
<xs:annotation>
<xs:documentation>Pharmacy</xs:documentation>
</xs:annotation>
</xs:enumeration>
<xs:enumeration value="Dentist">
<xs:annotation>
<xs:documentation>Dentist</xs:documentation>
</xs:annotation>
</xs:enumeration>
<xs:enumeration value="MCO">
<xs:annotation>
<xs:documentation>Managed Care Organization</xs:documentation>
</xs:annotation>
</xs:enumeration>
<xs:enumeration value="Restricted Physician">
<xs:annotation>
<xs:documentation>Restricted Physician</xs:documentation>
</xs:annotation>
</xs:enumeration>
<xs:enumeration value="Restricted Clinic">
<xs:annotation>
<xs:documentation>Restricted Clinic</xs:documentation>
</xs:annotation>
</xs:enumeration>
<xs:enumeration value="Restricted Hospital">
<xs:annotation>
<xs:documentation>Restricted Hospital</xs:documentation>
</xs:annotation>
</xs:enumeration>
<xs:enumeration value="Restricted Pharmacy">
<xs:annotation>
<xs:documentation>Restricted Pharmacy</xs:documentation>
</xs:annotation>
</xs:enumeration>
<xs:enumeration value="Care Coordination Organization">
<xs:annotation>
<xs:documentation>Care Coordination Organization</xs:documentation>
</xs:annotation>
</xs:enumeration>
<xs:enumeration value="Care Coordinator">
<xs:annotation>
<xs:documentation>Care Coordinator</xs:documentation>
</xs:annotation>
</xs:enumeration>
<xs:enumeration value="Managing Provider">
<xs:annotation>
<xs:documentation>Managing Provider</xs:documentation>
</xs:annotation>
</xs:enumeration>
<xs:enumeration value="Vision">
<xs:annotation>
<xs:documentation>Vision</xs:documentation>
</xs:annotation>
</xs:enumeration>
<xs:enumeration value="Allergy">
<xs:annotation>
<xs:documentation>Allergy</xs:documentation>
</xs:annotation>
</xs:enumeration>
<xs:enumeration value="Ear Nose Throat">
<xs:annotation>
<xs:documentation>Ear Nose Throat</xs:documentation>
</xs:annotation>
</xs:enumeration>
<xs:enumeration value="Restricted Podiatrist">
<xs:annotation>
<xs:documentation>Restricted Podiatrist</xs:documentation>
</xs:annotation>
</xs:enumeration>
<xs:enumeration value="Restricted Dentist">
<xs:annotation>
<xs:documentation>Restricted Dentist</xs:documentation>
</xs:annotation>
</xs:enumeration>
<xs:enumeration value="Restricted DME">
<xs:annotation>
<xs:documentation>Restricted DME</xs:documentation>
</xs:annotation>
</xs:enumeration>
<xs:enumeration value="Restricted Dental Clinic">
<xs:annotation>
<xs:documentation>Restricted Dental Clinic</xs:documentation>
</xs:annotation>
</xs:enumeration>
<xs:enumeration value="Restricted Physician Group">
<xs:annotation>
<xs:documentation>Restricted Physician Group</xs:documentation>
</xs:annotation>
</xs:enumeration>
<xs:enumeration value="Restricted Physician Assistant">
<xs:annotation>
<xs:documentation>Restricted Physician Assistant</xs:documentation>
</xs:annotation>
</xs:enumeration>
<xs:enumeration value="Restricted Nurse Practitioner">
<xs:annotation>
<xs:documentation>Restricted Nurse Practitioner</xs:documentation>
</xs:annotation>
</xs:enumeration>
<xs:enumeration value="Restricted Alternate Pharmacy">
<xs:annotation>
<xs:documentation>Restricted Alternate Pharmacy</xs:documentation>
</xs:annotation>
</xs:enumeration>
<xs:enumeration value="Restricted Alternate Physician">
<xs:annotation>
<xs:documentation>Restricted Alternate Physician</xs:documentation>
</xs:annotation>
</xs:enumeration>
<xs:enumeration value="Restricted Alternate Clinic">
<xs:annotation>
<xs:documentation>Restricted Alternate Clinic</xs:documentation>
</xs:annotation>
</xs:enumeration>
<xs:enumeration value="Restricted Alternate Hospital">
<xs:annotation>
<xs:documentation>Restricted Alternate Hospital</xs:documentation>
</xs:annotation>
</xs:enumeration>
</xs:restriction>
</xs:simpleType>
<xs:complexType name="RelationshipToSubscriberDefinitionReferenceType">
<xs:sequence>
<xs:element name="reference" type="base:ReferenceType" minOccurs="0" maxOccurs="1"/>
<xs:element name="relationshipName" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="domainName" type="xs:string" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:simpleType name="MaintenanceCodeType">
<xs:restriction base="xs:string">
<xs:enumeration value="CREATE"/>
<xs:enumeration value="CHANGE"/>
<xs:enumeration value="TERMINATE"/>
<xs:enumeration value="REINSTATEMENT"/>
<xs:enumeration value="AUDIT"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="HOHActionType">
<xs:restriction base="xs:string">
<xs:enumeration value="AMEND"/>
<xs:enumeration value="DELETE"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="ActionModeType">
<xs:restriction base="xs:string">
<xs:enumeration value="DEFAULT" />
<xs:enumeration value="REPLACE" />
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="OverrideResultType">
<xs:restriction base="xs:string">
<xs:enumeration value="ADD"/>
<xs:enumeration value="AMEND"/>
<xs:enumeration value="TERMINATE"/>
<xs:enumeration value="REINSTATEMENT"/>
</xs:restriction>
</xs:simpleType>
<xs:complexType name="ReportingCategoryType">
<xs:sequence>
<xs:element name="entityIdentifierCode" type="xs:string" minOccurs="0"/>
<xs:element name="reportingCategoryName" type="xs:string" minOccurs="0"/>
<xs:element name="referenceQualifierIdentifier" type="xs:string" minOccurs="0"/>
<xs:element name="referenceId" type="xs:string" minOccurs="0"/>
<xs:element name="amount" type="base:CurrencyType" minOccurs="0"/>
<xs:element name="startDate" type="xs:date" minOccurs="0"/>
<xs:element name="endDate" type="xs:date" minOccurs="0"/>
</xs:sequence>
<xs:attribute name="counter" type="xs:long" use="required"/>
</xs:complexType>
<xs:group name="MembershipGroup">
<xs:sequence>
<xs:element name="maintenanceTypeCode" type="MaintenanceCodeType" default="CREATE" minOccurs="0" maxOccurs="1"/>
<xs:element name="maintenanceReasonCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Reference to SubscriptionCreateReason, SubscriptionAmendReason, SubscriptionTerminateReason and
SubscriptionReinstateReason codeset.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="maintenanceComment" type="base:String900Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="maintenanceOverride" type="xs:boolean" default="false" minOccurs="0" maxOccurs="1"/>
<xs:element name="maintenanceOverrideResult" type="OverrideResultType" minOccurs="0" maxOccurs="1"/>
<xs:element name="benefitStatusCode" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="membershipIdentifier" type="xs:long" minOccurs="0" maxOccurs="1"/>
<xs:element name="memberIsSubscriber" type="xs:boolean" default="false" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
This field determines whether the member is a subscriber or dependent. It is recommended to always pass this flag. If the member is a subscriber, set it to true. If this flag is null, it will be set to false.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="hccIdentifier" type="base:String50Type" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
The business identifier for the member. This can be generated by adding a suffix to the
subscription ID based on configured rules.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="memberInputID" type="xs:string" minOccurs="0">
<xs:annotation>
<xs:documentation>The input member ID, used for auditing and traceability.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="receiptDate" type="xs:date" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Date on which the member's application was received from the account.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="outOfServiceArea" type="xs:boolean" default="false" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
If true, the member lives outside the service
area for their benefit plan.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="smokingStatus" type="base:SmokingStatusType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Member's smoking status.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="isHandicapped" type="xs:boolean" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Handicapped StatusTrue for Yes. False for No
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="waivePHIClaimViewRestriction" type="xs:boolean" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Specifies if PHI claim view restriction defined
at the Health Insurance Company level applies to this member.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="payeeHccId" type="base:String50Type" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
If checks and correspondence for this member
should go to someone other than the subscriber,
the other member's
HCC ID should be placed in this field.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="isMemberInHospice" type="xs:boolean" default="false" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Indicates if Member is in hospice.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="memberMatchData" type="minput:MemberMatchInputType" minOccurs="0" maxOccurs="1"/>
<xs:element name="oldMemberData" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:group ref="OldMemberDataGroup"/>
</xs:complexType>
</xs:element>
<xs:element name="individual" type="Individual" minOccurs="0" maxOccurs="1"/>
<xs:element name="physicalAddress" type="PhysicalAddress" minOccurs="0" maxOccurs="1"/>
<xs:element name="correspondenceAddress" type="CorrespondenceAddress" minOccurs="0" maxOccurs="1"/>
<xs:element name="communicationPreferences" type="base:IndividualCommunicationPreferencesType" minOccurs="0" maxOccurs="1"/>
<xs:element name="specificCommunicationPreferences" type="base:IndividualSpecificCommunicationPreferencesType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="otherIdNumberList" type="OtherIdNumberList" minOccurs="0" maxOccurs="1"/>
<xs:element name="disabilityInfoForEligibility" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
If the member has extended eligibility because of a disability, thiese elements contain
information and validation about the disability.
</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:group ref="base:DisabilityInfoForEligibilityGroup"/>
</xs:complexType>
</xs:element>
<xs:element name="dependentVerification" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="listMode" type="base:ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="dependentVerification" type="base:DependentVerificationType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="physicalCharacteristics" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:group ref="base:PhysicalCharacteristicGroup"/>
</xs:complexType>
</xs:element>
<xs:element name="employmentInfo" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:group ref="base:EmploymentInfoGroup"/>
</xs:complexType>
</xs:element>
<xs:element name="dentalInfo" type="base:MemberDentalInfoType" minOccurs="0" maxOccurs="1"/>
<xs:element name="priorCoverageInfo" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:group ref="base:PriorCoverageInfoGroup"/>
</xs:complexType>
</xs:element>
<xs:element name="preExistingConditionInfo" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="listMode" type="base:ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="preExistingConditionInfo" type="base:PreExistingConditionType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="preExReduction" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
These elements can be used to override the default pre-existing condition behavior.
</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:group ref="base:PreExReductionGroup"/>
</xs:complexType>
</xs:element>
<xs:element name="otherResponsiblePersonInfo" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Information on a person other than the subscriber who is legally responsible for a member.
</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="listMode" type="base:ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="otherResponsiblePersonInfo" type="base:OtherResponsiblePersonInfoType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="memberRepresentative" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Individuals with special authorization regarding
the member.
</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="listMode" type="base:ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="authorizedIndividual" type="base:AuthorizedIndividualType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="membershipUDTList" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
User-defined terms on the member record.The
available custom fields are configured on the benefit plan.
</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="listMode" type="base:ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="membershipUDT" type="base:UDTListType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="informationAccessPermissionList" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Identifies persons with unusual PHI permissions.
</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="listMode" type="base:ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="HIPAAPermission" type="base:HIPAAPermissionType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="informationAccessRestrictionList" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Identifies persons with unusual PHI restrictions.
</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="listMode" type="base:ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="HIPAARestriction" type="base:HIPAARestrictionType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="phiAuthorizationList" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
List of PHI authorizations.
</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="listMode" type="base:ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="HIPAAAuthorization" type="base:HIPAAAuthorizationType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="ccDirectiveList" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Confidential communications directivies. These are used for situations such as endangered
members. In such a case, all communications related to the member are sent to the member,
not the subscriber.
</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="listMode" type="base:ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="confidentialCommunicationDirective" type="base:ConfidentialCommunicationDirectiveType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="subscriptionReference" type="base:ReferenceType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
The subscription of which the membership is a	part.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="individualReference" type="base:ReferenceType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
In Medicaid lines of business, it can be important to track the head of household, even
if that individual is not part of the subscription.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="relationshipToSubscriberDefinitionReference" type="RelationshipToSubscriberDefinitionReferenceType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
The member's relationship to the subscriber.
This generally uses the HIPAA relationship codes, which are mapped to
member types Subscriber, Spouse, Child, Dependent, or Domestic
Partner. If the member type is	Subscriber, then memberIsSubscriber
is automatically True.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="raceOrEthnicity" type="enrollment:RaceOrEthnicityListRawType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
The member's race or ethnicity, wihch may be required by government programs.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="vipReasonCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Reference to VIPReason or HealthStatusReason
codeset.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="sexualOrientationCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Reference to Sexual Orientation codeset.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="genderIdentityCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Reference to Gender Identity codeset.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="genderAtBirthCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Reference to Gender At Birth codeset.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="pronounsCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Reference to member Pronouns codeset.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="healthStatusReasonCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Reference to HealthStatusReason codeset; the
reason this member has restricted health status.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="informationSourceCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Reference to the InformationSource codeset; the
origin site of the information that triggered the membership
request.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="attachmentSetReference" type="base:ReferenceType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
External documents related to the membership.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="planSelectionListMode" type="base:ListActionType" minOccurs="0" maxOccurs="1"/>
<!-- CON-18015 -   -->
<xs:element name="allowSamePlanMerges" type="xs:boolean" default="false" minOccurs="0">
<xs:annotation>
<xs:documentation>
Use this flag in the sparse request to determine if overlapping plan selection date spans, for the SAME plan, should be merged or if an exception should be thrown
This flag only works with planSelectionListMode = DEFAULT. The flag is ignored when listMode = REPLACE.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="planSelection" minOccurs="0" maxOccurs="unbounded">
<xs:annotation>
<xs:documentation>
From MemberSelections; a list of plans in which
the member has enrolled.
</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="startDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="endDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="claimHistoryFromOtherPlans" type="ClaimHistoryOtherPlansType" nillable="true" minOccurs="0" maxOccurs="1"/>
<xs:element name="enrollmentInfo" type="enrollment:EnrollmentInformationType" minOccurs="0" maxOccurs="1"/>
<xs:element name="memberTerminateReasonCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
<xs:element name="specialEnrollmentPeriodReasonCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
<xs:element name="waiveBenefitWaitingPeriod" type="xs:boolean" default="false" minOccurs="0" maxOccurs="1" />
<!-- START Fields not mapped to Lookup input as of now -->
<xs:element name="planDescription" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="planCode" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="classOfContractNumber" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="programCode" type="xs:string" minOccurs="0" maxOccurs="1"/>
<!-- END Fields not mapped to Lookup input as of now -->
<xs:element name="benefitPlanMatchData" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:group ref="BenefitPlanMatchGroup"/>
</xs:complexType>
</xs:element>
<xs:element name="benefitPlanReference" type="base:IdentifierType" minOccurs="0" maxOccurs="1"/>
<xs:element name="healthCoverageMaintenanceCode" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="insuranceLineCode" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="benefitNetworks" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
From MemberPlanSelections: a list of BenefitNetworkNames
</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="benefitNetworkName" type="xs:string" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="planSelectionUDTList" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
User-defined terms on the member plan selection date range record.The
available custom fields are configurable.
</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="listMode" type="base:ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="planSelectionUDT" type="base:UDTListType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="eligibility" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
From EDI: For eligibility dates for a plan for a member.
</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="startDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="endDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
</xs:element>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="providerSelections" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
From MemberSelections; a list of provider choices
the member has made.
</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="listMode" type="base:ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="providerSelection" type="ProviderSelectionType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="reportingCategory" type="ReportingCategoryType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="medicareHICNlistMode" type="base:ListUpdateModeType" minOccurs="0" maxOccurs="1"/>
<xs:element name="medicareHICN" type="hicn:MedicareHICNInfoType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="cobPolicy" type="cobpolicy:COBPolicyType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="headOfHousehold" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
In Medicaid lines of business, it can be important to track the head of household, even
if that individual is not part of the subscription.
</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="relatedMember" type="minput:MemberMatchInputType" minOccurs="0" maxOccurs="1"/>
<xs:element name="relatedMembers" type="RelatedMembersType" minOccurs="0" maxOccurs="1"/>
<xs:element name="externalMemberInformation" type="ExternalMemberInformationType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="memberComplianceProgram" type="membercomplianceprogram:MemberComplianceProgType" minOccurs="0" maxOccurs="1"/>
<xs:element name="enrollmentMemberFactors" type="memberfactors:MemberFactorsCoreType" minOccurs="0" maxOccurs="1"/>
<xs:element name="alternatePaymentContact" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Alternate Payment Recipient name and address.
</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="recipientName" type="base:PersonNameType" minOccurs="0" maxOccurs="1"/>
<xs:element name="recipientAddress" type="base:PostalAddressType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="claimReviewList" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="listMode" type="base:ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="claimReview" type="enrollment:MemberClaimReviewType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="manualReviewList" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="listMode" type="base:ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="manualReview" type="enrollment:MemberManualReviewType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
</xs:sequence>
</xs:group>
<xs:complexType name="ExternalMemberMatchCriteriaType">
<xs:annotation>
<xs:documentation>
Resembles the list of attributes of the ITS type - ExternalMemberMatchInput
</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="identificationNumber" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="identificationType" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
<xs:element name="taxIdentificationNumber" type="xs:string" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="RelatedMembersType">
<xs:sequence>
<xs:element name="relatedMember" type="InternalMembershipType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="InternalMembershipType">
<xs:sequence>
<xs:element name="hccIdentifier" type="base:String50Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="individual" type="IndividualType" minOccurs="0" maxOccurs="1"/>
<xs:element name="correspondenceAddress" type="CorrespondenceAddress" minOccurs="0" maxOccurs="1"/>
<xs:element name="otherIdNumberList" type="OtherIdNumberList" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="ExternalMemberInformationType">
<xs:sequence>
<xs:sequence>
<xs:element name="matchDefinitionName" type="xs:string" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
<xs:element name="externalMemberMatchCriteriaType" type="ExternalMemberMatchCriteriaType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Social Security Number or otherId.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="hohActionTypeCode" type="HOHActionType" default="AMEND" minOccurs="0" maxOccurs="1"/>
<xs:element name="actionMode" type="ActionModeType" maxOccurs="1" minOccurs="0" default="DEFAULT" />
<xs:element name="asOfDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="taxIdentificationNumber" type="base:SSNType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Social Security Number. Dashes are required. Changes are almost always made as of 1/1/1800.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="primaryName" type="base:PersonNameType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>The individual's primary name.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="addressInfo" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="postalAddress" type="base:PostalAddressType" minOccurs="0" maxOccurs="1"/>
<xs:element name="addressPhoneList" type="base:TelephoneNumberListType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="hohOtherIdNumberList" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>A list of other identification numbers for the member. These can be used for links to other systems, or to improve claim matching.</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="listMode" type="base:ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="identificationNumber" type="base:IdentificationNumberType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
</xs:sequence>
</xs:complexType>
<xs:group name="OldMemberDataGroup">
<xs:sequence>
<xs:element name="primaryName" type="base:PersonNameType" minOccurs="0" maxOccurs="1"/>
<xs:element name="hccIdentifier" type="base:String50Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="carrierHccId" type="base:String50Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="taxIdentificationNumber" type="base:SSNType" minOccurs="0" maxOccurs="1"/>
<xs:element name="genderCode" type="base:GenderCodeType" minOccurs="0" maxOccurs="1"/>
<xs:element name="maritalStatusCode" type="base:MaritalStatusCodeType" minOccurs="0" maxOccurs="1"/>
<xs:element name="birthDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="immigrationStatusCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
<xs:element name="address" type="base:BasicAddressType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:group name="BenefitPlanMatchGroup">
<xs:sequence>
<xs:element name="benefitPlanName" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="benefitPlanHccId" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="benefitPlanOtherIdentifier" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:group ref="BenefitPlanIdentificationGroup"/>
</xs:complexType>
</xs:element>
<xs:element name="asOfDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:group name="BenefitPlanIdentificationGroup">
<xs:sequence>
<xs:element name="otherID" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="identificationType" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:group name="ProviderMatchGroup">
<xs:sequence>
<xs:element name="asOfDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="practitioner" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:group ref="PractitionerMatchGroup"/>
</xs:complexType>
</xs:element>
<xs:element name="practitionerRole" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:group ref="PractitionerRoleMatchGroup"/>
</xs:complexType>
</xs:element>
<xs:element name="supplier" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:group ref="SupplierMatchGroup"/>
</xs:complexType>
</xs:element>
<xs:element name="affiliatedSupplierNetwork" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:group ref="SupplierNetworkMatchGroup"/>
</xs:complexType>
</xs:element>
<xs:element name="supplierLocation" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:group ref="SupplierLocationMatchGroup"/>
</xs:complexType>
</xs:element>
<xs:element name="supplierNetwork" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:group ref="SupplierNetworkMatchGroup"/>
</xs:complexType>
</xs:element>
</xs:sequence>
</xs:group>
<xs:group name="PractitionerMatchGroup">
<xs:sequence>
<xs:element name="practitionerOtherIdentificationNumber" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="firstName" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="lastName" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="hccIdentificationNumber" type="xs:string" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:group name="PractitionerRoleMatchGroup">
<xs:sequence>
<xs:element name="hccIdentificationNumber" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="practitionerRoleIdentificationNumber" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="roleName" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="practitionerRoleOtherIdentificationNumber" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="practitionerRoleOtherIdTypeCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:group name="SupplierMatchGroup">
<xs:sequence>
<xs:element name="supplierOtherIdentificationNumber" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="primaryName" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="hccIdentificationNumber" type="xs:string" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:group name="SupplierLocationMatchGroup">
<xs:sequence>
<xs:element name="hccIdentificationNumber" type="xs:string" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:group name="SupplierNetworkMatchGroup">
<xs:sequence>
<xs:element name="hccIdentificationNumber" type="xs:string" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:complexType name="ProviderSelectionType">
<xs:sequence>
<xs:element name="providerRoleType" type="xs:string" nillable="true" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Type of Provider</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="providerDateRanges" type="ProviderDateRangeType" minOccurs="1" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="ProviderDateRangeType">
<xs:sequence>
<xs:element name="startDate" type="xs:date"/>
<xs:element name="endDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="providerMatch" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:group ref="ProviderMatchGroup"/>
</xs:complexType>
</xs:element>
<xs:element name="practitionerReference" type="base:IdentifierType" minOccurs="0" maxOccurs="1"/>
<xs:element name="practitionerRoleReference" type="base:IdentifierType" minOccurs="0" maxOccurs="1"/>
<xs:element name="supplierReference" type="base:IdentifierType" minOccurs="0" maxOccurs="1"/>
<xs:element name="affiliatedSupplierNetworkReference" type="base:IdentifierType" minOccurs="0" maxOccurs="1"/>
<xs:element name="supplierLocationReference" type="base:IdentifierType" minOccurs="0" maxOccurs="1"/>
<xs:element name="supplierNetworkReference" type="base:IdentifierType" minOccurs="0" maxOccurs="1"/>
<xs:element name="pcpAutoAssigned" type="xs:boolean" default="false" minOccurs="0" maxOccurs="1" />
<xs:element name="providerSelectionReason" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1" />
</xs:sequence>
</xs:complexType>
<xs:complexType name="Individual">
<xs:group ref="base:IndividualInformationGroup"/>
</xs:complexType>
<xs:complexType name="IndividualType">
<xs:sequence>
<xs:element name="taxIdentificationNumber" type="base:SSNType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Social Security Number. Dashes are required. Changes are almost always made as of 1/1/1800.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="primaryName" type="base:PersonNameType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>The individual's primary name.</xs:documentation>
</xs:annotation>
</xs:element>
</xs:sequence>
</xs:complexType>
<xs:complexType name="PhysicalAddress">
<xs:annotation>
<xs:documentation>
A list of the member's physical addresses. A residential address must be present, and other
addresses (work,school, seasonal) may also be included. Each member has their own address.
</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="listMode" type="base:ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="memberPhysicalAddress" type="base:MemberPhysicalAddressType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="CorrespondenceAddress">
<xs:annotation>
<xs:documentation>
Member's correspondence address.
</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:group ref="base:MemberCorrespondenceAddressGroup"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="OtherIdNumberList">
<xs:annotation>
<xs:documentation>
A list of other identification numbers for the member. These can be used for links to other
systems, or to improve	claim matching.
</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="listMode" type="base:ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="identificationNumber" type="base:IdentificationNumberType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:schema>
</file>
<file path="PRIME_SERVICES_XSD/connector-enrollmentsparse/subscription-sparse.xsd">
<?xml version="1.0"?>
<!-- edited with XMLSpy v2015 rel. 4 (x64) (http://www.altova.com) by khanumolu (HE) -->
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema"
xmlns="http://www.healthedge.com/connector/schema/subscriptionsparse"
xmlns:tns="http://www.healthedge.com/connector/schema/subscriptionsparse"
xmlns:subsidy="http://www.healthedge.com/connector/schema/subsidy"
xmlns:base="http://www.healthedge.com/connector/schema/basetypes"
xmlns:enrollment="http://www.healthedge.com/connector/schema/enrollmenttypes"
xmlns:payeeBankAccount="http://www.healthedge.com/connector/schema/payeebankaccounts"
targetNamespace="http://www.healthedge.com/connector/schema/subscriptionsparse"
elementFormDefault="unqualified" version="4.1">
<xs:import namespace="http://www.healthedge.com/connector/schema/subsidy" schemaLocation="../connector-subsidy/subsidies.xsd"/>
<xs:import namespace="http://www.healthedge.com/connector/schema/basetypes" schemaLocation="../connector-common-schema/base-types.xsd"/>
<xs:import namespace="http://www.healthedge.com/connector/schema/enrollmenttypes" schemaLocation="enrollment-types.xsd"/>
<xs:import namespace="http://www.healthedge.com/connector/schema/payeebankaccounts" schemaLocation="../connector-payeebankaccounts/payeeBankAccounts.xsd"/>
<xs:element name="subscription" type="SubscriptionType"/>
<xs:complexType name="SubscriptionType">
<xs:complexContent>
<xs:extension base="base:HealthRulesResourceType">
<xs:group ref="SubscriptionGroup"/>
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:group name="SubscriptionGroup">
<xs:sequence>
<xs:element name="maintenanceReasonCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Reference to SubscriptionCreateReason, SubscriptionAmendReason, SubscriptionTerminateReason and SubscriptionReinstateReason codeset.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="maintenanceComment" type="base:String900Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="subscriptionIdentifier" type="xs:long" minOccurs="0" maxOccurs="1"/>
<xs:element name="payeeHccId" type="base:String50Type" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
To whom should checks be sent for this
subscription. Checks are sent to the subscriber
when member pay for services out of pocket and
submit receipts. This field is used for cases
such as an out-of-country subscriber who is
unable to cash a check. Do not use for
endangered members where a member should have a
check sent to a differnt payee.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="hccIdentifier" type="base:String50Type" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Business identifier for the subscription. Member
IDs are often generated by adding suffixes to
this ID.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="receiptDate" type="xs:date" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Date the subscription application was received.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="autoWithdrawalEnabled" type="xs:boolean" default="false" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Is automatic withdrawal enabled for subscription?
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="originalEffectiveDate" type="xs:date" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Date the subscriber first became active with the
health plan. If converting members, this may be
earlier than the earliest active date in the
system. This date is not used by the system.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="applicationSignature" type="xs:boolean" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
If true, the enrollment application was signed.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="applicationDate" type="xs:date" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Date on which the subscriber signed the
enrollment application.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="lastPremiumPaidDate" type="xs:date" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Last date on which the premium was paid.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="lastPremiumPaymentDate" type="xs:date" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Last payment date of PremiumPayment
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="paymentHold" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:group ref="enrollment:PaymentHoldGroup"/>
</xs:complexType>
</xs:element>
<xs:element name="subscriptionUDTList" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
User-defined terms or custom fields for the
subscription. The list of available fields is
configured on the benefit plan.
</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="listMode" type="base:ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="subscriptionUDT" type="base:UDTListType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="accountMatchData" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:group ref="AccountMatchGroup"/>
</xs:complexType>
</xs:element>
<xs:element name="accountReference" type="base:IdentifierType" minOccurs="0" maxOccurs="1"/>
<!-- START Fields not mapped to Lookup input as of now -->
<xs:element name="division" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="memberGroup" type="xs:string" minOccurs="0" maxOccurs="1"/>
<!-- END Fields not mapped to Lookup input as of now -->
<xs:element name="vipReasonCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
The reason a subscription is a VIP subscription.
If this is set, then VIP permissions are
required for access to the subscription and
related data such as claims and authorizations.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="informationSourceCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Reference to the InformationSource codeset,
which identifies how the subscription
application was received (EDI, paper, etc.).
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="cobraSelectionList" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="listMode" type="base:ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="cobraSelection" minOccurs="0" maxOccurs="unbounded">
<xs:annotation>
<xs:documentation>
From SubscriptionSelections
</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="cobraStart" type="xs:date" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Date on which COBRA coverage begins.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="cobraEnd" type="xs:date" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Date on which COBRA coverage ends.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="cobraReceiptDate" type="xs:date" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Date on which the COBRA application
was received.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="cobraPaidThroughDate" type="xs:date" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Date through which COBRA premiums
have been paid.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="comment" type="base:String1000Type" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Comment about the COBRA coverage.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="cobraQualifyingEventCode" type="base:CodeEntryInputType"
minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Reference to the
CobraQualifyingEvent codeset;
identifies the reason for putting
the subscription on COBRA.
</xs:documentation>
</xs:annotation>
</xs:element>
</xs:sequence>
</xs:complexType>
</xs:element>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="individualPlanSelections" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="individualPlanSelectionListMode" type="base:ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="individualPlanSelection" type="IndividualPlanSelectionType" minOccurs="0" maxOccurs="unbounded">
<xs:annotation>
<xs:documentation>
From IndividualPlanSelections; a list of individual plan selections in which
the subscription has enrolled.
</xs:documentation>
</xs:annotation>
</xs:element>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="claimReviewList" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="listMode" type="base:ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="claimReview" type="enrollment:ClaimReviewType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="subsidy" type="subsidy:SubscriptionSubsidyType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="applicationInfo" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:group ref="enrollment:ApplicationInfoGroup"/>
</xs:complexType>
</xs:element>
<xs:element name="brokerSelections" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="listMode" type="base:ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="brokerSelection" type="SubscriptionBrokerSelectionType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="paymentType" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1" />
<xs:element name="payeeBankAccount" type="payeeBankAccount:PayeeBankAccountsType" minOccurs="0" maxOccurs="1" />
</xs:sequence>
</xs:group>
<xs:complexType name="SubscriptionBrokerSelectionType">
<xs:sequence>
<xs:element name="broker" type="SubscriptionBrokerType" minOccurs="0" maxOccurs="1"/>
<xs:element name="dateRanges" type="SubscriptionBrokerDateRangeType" minOccurs="1" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="SubscriptionBrokerDateRangeType">
<xs:sequence>
<xs:element name="startDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="endDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="brokerAgents" type="SubscriptionBrokerAgentType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="SubscriptionBrokerType">
<xs:sequence>
<xs:element name="brokerIdentifier" type="xs:long" minOccurs="0" maxOccurs="1"/>
<xs:element name="brokerHccId" type="base:String50Type" minOccurs="0" maxOccurs="1" />
</xs:sequence>
</xs:complexType>
<xs:complexType name="SubscriptionBrokerAgentType">
<xs:sequence>
<xs:element name="brokerAgentIdentifier" type="xs:long" minOccurs="0" maxOccurs="1" />
<xs:element name="brokerAgentHccId" type="base:String50Type" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="IndividualPlanSelectionType">
<xs:sequence>
<xs:element name="startDate" type="xs:date" minOccurs="1" maxOccurs="1"/>
<xs:element name="endDate" type="xs:date" minOccurs="1" maxOccurs="1"/>
<xs:element name="rateLockDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="planYearStartDate" type="PlanYearStartDateType" minOccurs="1" maxOccurs="1"/>
<xs:element name="benefitPlanReference" type="base:IdentifierType" minOccurs="0" maxOccurs="1"/>
<xs:element name="benefitPlanMatchData" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:group ref="BenefitPlanMatchGroup"/>
</xs:complexType>
</xs:element>
</xs:sequence>
</xs:complexType>
<xs:group name="BenefitPlanMatchGroup">
<xs:sequence>
<xs:element name="benefitPlanName" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="benefitPlanHccId" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="benefitPlanOtherIdentifier" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:group ref="BenefitPlanIdentificationGroup"/>
</xs:complexType>
</xs:element>
<xs:element name="asOfDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:complexType name="PlanYearStartDateType">
<xs:sequence>
<xs:element name="monthName" type="base:MonthNameType" minOccurs="1" maxOccurs="1"/>
<xs:element name="dayNumber" type="xs:integer" minOccurs="1" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:group name="BenefitPlanIdentificationGroup">
<xs:sequence>
<xs:element name="otherID" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="identificationType" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:group name="AccountMatchGroup">
<xs:sequence>
<xs:element name="accountHccIdentifier" type="base:AccountHccIDType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
The account through which coverage is offered.
For group business, this will be the
subscriber's employer. For individuals business,
this will be an umbrella such as Medicare,
Medicaid, etc.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="accountOtherIdentifier" minOccurs="0" maxOccurs="unbounded">
<xs:complexType>
<xs:group ref="AccountIdentificationGroup"/>
</xs:complexType>
</xs:element>
<xs:element name="asOfDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:group name="AccountIdentificationGroup">
<xs:sequence>
<xs:element name="otherIdentificationNumber" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="identificationType" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
</xs:schema>
</file>
<file path="PRIME_SERVICES_XSD/connector-medicarehicn/MedicareHICNInfo.xsd">
<?xml version="1.0" encoding="utf-8"?>
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema"
xmlns="http://www.healthedge.com/connector/schema/medicarehicn"
xmlns:tns="http://www.healthedge.com/connector/schema/medicarehicn"
xmlns:base="http://www.healthedge.com/connector/schema/basetypes"
targetNamespace="http://www.healthedge.com/connector/schema/medicarehicn"
elementFormDefault="unqualified" version="5.0">
<xs:import namespace="http://www.healthedge.com/connector/schema/basetypes" schemaLocation="../connector-common-schema/base-types.xsd"/>
<xs:element name="medicareHICNList" type="MedicareHICNInfoListType"/>
<xs:element name="medicareHICNInfo" type="MedicareHICNInfoType"/>
<xs:element name="medicareHICNResponse" type="MedicareHICNInfoResponseType"/>
<xs:complexType name="MedicareHICNInfoResponseType">
<xs:complexContent>
<xs:extension base="base:HealthRulesResourceType">
<xs:sequence>
<xs:element name="memberHccID" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="status" type="base:ServiceStatusType" minOccurs="1" maxOccurs="1"/>
<xs:element name="medicareHICNInfo" minOccurs="0" maxOccurs="unbounded">
<xs:complexType>
<xs:sequence>
<xs:element name="hicn" type="base:String50Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="mbi" type="base:String50Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="transactionType" type="base:TransactionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="effectiveDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="expirationDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="entryDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="medicareEligibilityReasonCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="errors" type="base:ErrorsType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:complexType name="MedicareHICNInfoListType">
<xs:sequence>
<xs:element name="memberHccID" type="xs:string" minOccurs="1" maxOccurs="1"/>
<xs:element name="updateMode" type="base:ListUpdateModeType" minOccurs="0" maxOccurs="1"/>
<xs:element name="medicareHICNInfo" type="MedicareHICNInfoType" minOccurs="1" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="MedicareHICNInfoType">
<xs:complexContent>
<xs:extension base="base:HealthRulesResourceType">
<xs:group ref="MedicareHICNInfoGroup"/>
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:group name="MedicareHICNInfoGroup">
<xs:sequence>
<xs:element name="hicn" type="base:String50Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="mbi" type="base:String50Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="effectiveDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="expirationDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="entryDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="waitingPeriodStartDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="waitingPeriodEndDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="nursingHomeCompareIndicator" type="xs:boolean" minOccurs="0" maxOccurs="1"/>
<xs:element name="stateMedicaidEnrollment" type="xs:boolean" minOccurs="0" maxOccurs="1"/>
<xs:element name="stateMedicaidEnrollments" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="updateMode" type="base:ListUpdateModeType" minOccurs="0" maxOccurs="1"/>
<xs:element name="stateMedicaidEnrollment" type="MedicareDateRangeType" minOccurs="1" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="workingSpouse" type="xs:boolean" minOccurs="0" maxOccurs="1"/>
<xs:element name="workingSpouses" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="updateMode" type="base:ListUpdateModeType" minOccurs="0" maxOccurs="1"/>
<xs:element name="workingSpouse" type="MedicareDateRangeType" minOccurs="1" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="longTermCareResident" type="xs:boolean" minOccurs="0" maxOccurs="1"/>
<xs:element name="dialysisDateRanges" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="updateMode" type="base:ListUpdateModeType" minOccurs="0" maxOccurs="1"/>
<xs:element name="dialysisDateRange" type="OptionalDateRangeType" minOccurs="1" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="transplantDateRanges" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="updateMode" type="base:ListUpdateModeType" minOccurs="0" maxOccurs="1"/>
<xs:element name="transplantDateRange" type="OptionalDateRangeType" minOccurs="1" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="esrdIndicator" type="xs:boolean" minOccurs="0" maxOccurs="1"/>
<xs:element name="esrdDateRanges" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="updateMode" type="base:ListUpdateModeType" minOccurs="0" maxOccurs="1"/>
<xs:element name="esrdDateRange" type="MedicareDateRangeType" minOccurs="1" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="hospiceIndicator" type="xs:boolean" minOccurs="0" maxOccurs="1"/>
<xs:element name="hospiceDateRanges" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="updateMode" type="base:ListUpdateModeType" minOccurs="0" maxOccurs="1"/>
<xs:element name="hospiceDateRange" type="MedicareDateRangeType" minOccurs="1" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="institutionalIndicator" type="xs:boolean" minOccurs="0" maxOccurs="1"/>
<xs:element name="institutionalDateRanges" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="updateMode" type="base:ListUpdateModeType" minOccurs="0" maxOccurs="1"/>
<xs:element name="institutionalDateRange" type="MedicareDateRangeType" minOccurs="1" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="medicaidDateRanges" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="updateMode" type="base:ListUpdateModeType" minOccurs="0" maxOccurs="1"/>
<xs:element name="medicaidDateRange" type="MedicareMedicaidDateRangeType" minOccurs="1" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="nhcDateRanges" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="updateMode" type="base:ListUpdateModeType" minOccurs="0" maxOccurs="1"/>
<xs:element name="nhcDateRange" type="MedicareDateRangeType" minOccurs="1" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="partADates" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="updateMode" type="base:ListUpdateModeType" minOccurs="0" maxOccurs="1"/>
<xs:element name="partADate" type="MedicarePartDateRangeType" minOccurs="1" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="partBDates" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="updateMode" type="base:ListUpdateModeType" minOccurs="0" maxOccurs="1"/>
<xs:element name="partBDate" type="MedicarePartDateRangeType" minOccurs="1" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="premiumWithholdDateRanges" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="updateMode" type="base:ListUpdateModeType" minOccurs="0" maxOccurs="1"/>
<xs:element name="premiumWithholdDateRange" type="MedicarePremiumWithholdDateRangeType" minOccurs="1" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="supplementalDateRanges" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="updateMode" type="base:ListUpdateModeType" minOccurs="0" maxOccurs="1"/>
<xs:element name="supplementalDateRange" type="MedicareSupplementalDateRangeType" minOccurs="1" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="partDDateRanges" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="updateMode" type="base:ListUpdateModeType" minOccurs="0" maxOccurs="1"/>
<xs:element name="partDDateRanges" type="MedicarePartDDateRangeType" minOccurs="1" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="medicareEligibilityReasonCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
<xs:element name="medicareHICNFields" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="updateMode" type="base:ListUpdateModeType" minOccurs="0" maxOccurs="1"/>
<xs:element name="medicareHICNField" type="MedicareHICNFieldType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="medicarePrescriptionPaymentPlans" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="updateMode" type="base:ListUpdateModeType" minOccurs="0" maxOccurs="1"/>
<xs:element name="medicarePrescriptionPaymentPlan" type="MedicarePrescriptionPaymentPlanType" minOccurs="1" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="medicaidDualStatusRanges"  minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="updateMode" type="base:ListUpdateModeType" minOccurs="0" maxOccurs="1"/>
<xs:element name="medicaidDualStatus" type="MedicaidDualStatusType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
</xs:sequence>
</xs:group>
<xs:complexType name="OptionalDateRangeType">
<xs:sequence>
<xs:element name="startDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="endDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="MedicareDateRangeType">
<xs:sequence>
<xs:element name="startDate" type="xs:date" minOccurs="1" maxOccurs="1"/>
<xs:element name="endDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="MedicareMedicaidDateRangeType">
<xs:sequence>
<xs:element name="startDate" type="xs:date" minOccurs="1" maxOccurs="1"/>
<xs:element name="endDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="medicaidRecertificationDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="MedicarePartDateRangeType">
<xs:sequence>
<xs:element name="effectiveDate" type="xs:date" minOccurs="1" maxOccurs="1"/>
<xs:element name="terminationDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="MedicarePremiumWithholdDateRangeType">
<xs:sequence>
<xs:element name="startDate" type="xs:date" minOccurs="1" maxOccurs="1"/>
<xs:element name="endDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="premiumWithholdFlag" type="xs:boolean" minOccurs="0" maxOccurs="1"/>
<xs:element name="premiumWithholdPaymentMethodType" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="premiumWithholdOption" type="xs:string" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="MedicareSupplementalDateRangeType">
<xs:sequence>
<xs:element name="startDate" type="xs:date" minOccurs="1" maxOccurs="1"/>
<xs:element name="endDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="personCode" type="base:String300Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="supplementalTypeCode" type="base:String300Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="supplementalRxCoverage" type="xs:boolean" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="MedicarePrescriptionPaymentPlanType">
<xs:sequence>
<xs:element name="startDate" type="xs:date" minOccurs="1" maxOccurs="1"/>
<xs:element name="endDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="medicarePrescriptionPaymentPlanStatusIndicator" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="MedicarePartDDateRangeType">
<xs:sequence>
<xs:element name="startDate" type="xs:date" minOccurs="1" maxOccurs="1"/>
<xs:element name="endDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="partDBestAvailableEvidenceIndicator" type="xs:boolean" minOccurs="0" maxOccurs="1"/>
<xs:element name="partDCreditableCoverageIndicator" type="xs:boolean" minOccurs="0" maxOccurs="1"/>
<xs:element name="partDLEPDateRanges" type="MedicarePartDLEPDateRangeType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="partDLISCopayCategoryDates" type="MedicarePartDLISCopayCategoryDateRangeType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="partDLISSubsidyLevelDates" type="MedicarePartDLISSubsidyLevelDateRangeType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="partDCurrLISPremSubsidyDates" type="MedicarePartDCurrentLISPremiumSubsidyDateRangeType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="MedicarePartDCurrentLISPremiumSubsidyDateRangeType">
<xs:sequence>
<xs:element name="startDate" type="xs:date" minOccurs="1" maxOccurs="1"/>
<xs:element name="endDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="partDCurrentLISPremiumSubsidyAmount" type="xs:decimal" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="MedicarePartDLEPDateRangeType">
<xs:sequence>
<xs:element name="startDate" type="xs:date" minOccurs="1" maxOccurs="1"/>
<xs:element name="endDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="partDLEPAmount" type="xs:decimal" minOccurs="0" maxOccurs="1"/>
<xs:element name="partDLEPWaivedAmount" type="xs:decimal" minOccurs="0" maxOccurs="1"/>
<xs:element name="partDLEPSubsidyAmount" type="xs:decimal" minOccurs="0" maxOccurs="1"/>
<xs:element name="partDLEPCurrentNumberofUncoveredMonths" type="xs:int" minOccurs="0" maxOccurs="1"/>
<xs:element name="partDLEPTotalNumberofUncoveredMonths" type="xs:int" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="MedicarePartDLISCopayCategoryDateRangeType">
<xs:sequence>
<xs:element name="startDate" type="xs:date" minOccurs="1" maxOccurs="1"/>
<xs:element name="endDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="partDLISCopayCategoryCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="MedicarePartDLISSubsidyLevelDateRangeType">
<xs:sequence>
<xs:element name="startDate" type="xs:date" minOccurs="1" maxOccurs="1"/>
<xs:element name="endDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="partDLISSubsidyLevel" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="MedicareHICNFieldType">
<xs:sequence>
<xs:element name="fieldName" type="xs:string" minOccurs="1" maxOccurs="1"/>
<xs:element name="fieldValue" type="xs:string" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="MedicaidDualStatusType">
<xs:sequence>
<xs:element name="effectiveDate" type="xs:date" minOccurs="1" maxOccurs="1"/>
<xs:element name="terminationDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="gracePeriodStartDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="medicaidDual" type="xs:boolean" minOccurs="0" maxOccurs="1"/>
<xs:element name="medicaidDualStatusSourceCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
<xs:element name="medicaidDualStatusCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<!-- lookup start-->
<xs:element name="medicareHICNReferenceLookupCriteria" type="MedicareHICNLookupInputType"/>
<xs:element name="medicareHICNLookupCriteria" type="MedicareHICNLookupInputType"/>
<xs:complexType name="MedicareHICNLookupInputType">
<xs:complexContent>
<xs:extension base="base:HealthRulesResourceType">
<xs:sequence>
<xs:element name="memberHccId" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="asOfDate" type="xs:string" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:element name="medicareHICNReferenceLookupListResponse" type="MedicareHICNReferenceType">
<xs:annotation>
<xs:documentation>Member ID is used for matching during a search.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:complexType name="MedicareHICNReferenceType">
<xs:complexContent>
<xs:extension base="base:HealthRulesResourceType">
<xs:sequence>
<xs:element name="memberHccId" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:sequence>
<xs:element name="hicn" type="xs:string" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="mbi" type="xs:string" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
<xs:element name="asOfDate" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:group ref="base:ErrorStatusGroup"/>
</xs:sequence>
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:element name="medicareHICNLookupListResponse" type="MedicareHICNLookupResponseType">
<xs:annotation>
<xs:documentation>Member ID is used for matching during a search.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:complexType name="MedicareHICNLookupResponseType">
<xs:complexContent>
<xs:extension base="base:HealthRulesResourceType">
<xs:sequence>
<xs:element name="memberHccID" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="asOfDate" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="medicareHICNs" type="MedicareHICNsType" minOccurs="0" maxOccurs="1"/>
<xs:group ref="base:ErrorStatusGroup"/>
</xs:sequence>
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:complexType name="MedicareHICNsType">
<xs:sequence>
<xs:element name="medicareHICN" type="MedicareHICNInfoType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:schema>
</file>
<file path="PRIME_SERVICES_XSD/connector-membercomplianceprogram/memberComplianceProgram.xsd">
<?xml version="1.0" encoding="utf-8"?>
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema"
xmlns="http://www.healthedge.com/connector/schema/membercomplianceprogram"
xmlns:tns="http://www.healthedge.com/connector/schema/membercomplianceprogram"
xmlns:base="http://www.healthedge.com/connector/schema/basetypes"
xmlns:minput="http://www.healthedge.com/connector/schema/matchinput"
targetNamespace="http://www.healthedge.com/connector/schema/membercomplianceprogram" elementFormDefault="unqualified" version="4.0">
<xs:import namespace="http://www.healthedge.com/connector/schema/basetypes" schemaLocation="../connector-common-schema/base-types.xsd"/>
<xs:import namespace="http://www.healthedge.com/connector/schema/matchinput" schemaLocation="../connector-common-schema/match-input.xsd"/>
<xs:element name="memberComplianceProgram" type="MemberComplianceProgramType"/>
<!-- OUTPUT BEGIN -->
<xs:element name="memberComplianceProgramResponse" type="MemberComplianceProgramResponseType"/>
<xs:complexType name="MemberComplianceProgramResponseType">
<xs:sequence>
<xs:element name="memberComplianceProgramInput" type="MembershipComplianceProgramSelectionListType" minOccurs="1" maxOccurs="1" />
<xs:element name="status" type="base:ServiceStatusType" minOccurs="0"/>
<xs:element name="transactionInformation" type="base:TransactionInformationType" minOccurs="0"/>
<xs:element name="errors" type="base:ErrorsType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Exception string in case of system error.</xs:documentation>
</xs:annotation>
</xs:element>
</xs:sequence>
</xs:complexType>
<!-- OUTPUT END -->
<!-- MemberComplianceProgram Service INPUT BEGIN -->
<xs:complexType name="MemberComplianceProgramType">
<xs:complexContent>
<xs:extension base="base:HealthRulesResourceType">
<xs:group ref="MembershipComplianceProgramSelectionListGroup"/>
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:group name="MembershipComplianceProgramSelectionListGroup">
<xs:sequence>
<xs:element name="membershipIdentifier" type="xs:long" minOccurs="0" maxOccurs="1"/>
<xs:element name="memberHccID" type="base:String50Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="memberMatchData" type="minput:MemberMatchInputType" minOccurs="0" maxOccurs="1"/>
<xs:element name="membershipComplianceProgSelectionsType" type="MembershipComplianceProgSelectionsType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:complexType name="MembershipComplianceProgramSelectionListType">
<xs:group ref="MembershipComplianceProgramSelectionListGroup"/>
</xs:complexType>
<xs:complexType name="MembershipComplianceProgSelectionsType">
<xs:group ref="MembershipComplianceProgramSelectionsGroup"/>
</xs:complexType>
<!-- MemberComplianceProgram Service INPUT END -->
<!-- Used by Enrollment Sparse BEGIN -->
<xs:complexType name="MemberComplianceProgType">
<xs:complexContent>
<xs:extension base="base:HealthRulesResourceType">
<xs:group ref="MembershipComplianceProgramSelectionsGroup"/>
</xs:extension>
</xs:complexContent>
</xs:complexType>
<!-- The following blocks are used by the enrollment sparse service and the member compliance program service -->
<xs:group name="MembershipComplianceProgramSelectionsGroup">
<xs:sequence>
<xs:element name="complianceProgramSelections" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
From MemberSelections; a list of compliance programs the member has selected.
</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="updateMode" type="UpdateModeType" minOccurs="0" maxOccurs="1"/>
<xs:element name="complianceProgramSelection" type="ComplianceProgramSelectionType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
</xs:sequence>
</xs:group>
<xs:complexType name="ComplianceProgramSelectionType">
<xs:sequence>
<xs:element name="complianceProgramDateRanges" type="ComplianceProgramDateRangeType" minOccurs="1" maxOccurs="1"/>
<xs:element name="complianceProgramReference" type="base:ReferenceType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="ComplianceProgramDateRangeType">
<xs:sequence>
<xs:element name="startDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="endDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="complianceCode" type="ComplianceCode" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<!-- Used by Enrollment Sparse END -->
<xs:simpleType name="ComplianceCode">
<xs:restriction base="xs:string">
<xs:enumeration value="U"/>
<xs:enumeration value="C"/>
<xs:enumeration value="N"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="UpdateModeType">
<xs:restriction base="xs:string">
<xs:enumeration value="MERGE" />
<xs:enumeration value="REPLACE" />
<xs:enumeration value="DELETE" />
</xs:restriction>
</xs:simpleType>
<!-- ComplianceProgram Lookup Types START -->
<xs:element name="complianceProgramLookupCriteria" type="ComplianceProgramLookupInputType"/>
<xs:complexType name="ComplianceProgramLookupInputType">
<xs:complexContent>
<xs:extension base="base:HealthRulesResourceType">
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:element name="complianceProgramLookupListResponse" type="ComplianceProgramReferenceResponseType">
</xs:element>
<xs:complexType name="ComplianceProgramReferenceResponseType">
<xs:complexContent>
<xs:extension base="base:HealthRulesResourceType">
<xs:sequence>
<xs:element name="complianceProgramReference" type="ComplianceProgramReferenceType" minOccurs="0" maxOccurs="unbounded"/>
<xs:group ref="base:ErrorStatusGroup"/>
</xs:sequence>
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:group name="ComplianceProgramReferenceGroup">
<xs:sequence>
<xs:element name="programName" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="account" type="base:AccountsReferenceType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="product" type="base:ProductReferenceType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:group>
<xs:complexType name="ComplianceProgramReferenceType">
<xs:group ref="ComplianceProgramReferenceGroup"/>
</xs:complexType>
<!-- ComplianceProgram Lookup Types END -->
</xs:schema>
</file>
<file path="PRIME_SERVICES_XSD/connector-memberfactors/memberFactors.xsd">
<?xml version="1.0" encoding="utf-8"?>
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema"
xmlns="http://www.healthedge.com/connector/schema/memberfactors"
xmlns:tns="http://www.healthedge.com/connector/schema/memberfactors"
xmlns:base="http://www.healthedge.com/connector/schema/basetypes"
xmlns:minput="http://www.healthedge.com/connector/schema/matchinput"
targetNamespace="http://www.healthedge.com/connector/schema/memberfactors" elementFormDefault="unqualified" version="5.0">
<xs:import namespace="http://www.healthedge.com/connector/schema/basetypes" schemaLocation="../connector-common-schema/base-types.xsd"/>
<xs:import namespace="http://www.healthedge.com/connector/schema/matchinput" schemaLocation="../connector-common-schema/match-input.xsd"/>
<xs:element name="memberFactors" type="MemberFactorsType"/>
<xs:complexType name="MemberFactorsType">
<xs:complexContent>
<xs:extension base="base:HealthRulesResourceType">
<xs:group ref="MemberFactorsGroup"/>
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:group name="MemberFactorsGroup">
<xs:sequence>
<xs:element name="membershipIdentifier" type="xs:long" minOccurs="0" maxOccurs="1"/>
<xs:element name="memberMatchData" type="minput:MemberMatchInputType" minOccurs="0" maxOccurs="1"/>
<xs:element name="memberFactorCore" type="MemberFactorsCoreType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:complexType name="MemberFactorsCoreType">
<xs:group ref="MemberFactorsCore"/>
</xs:complexType>
<xs:group name="MemberFactorsCore">
<xs:sequence>
<xs:element name="updateMode" type="UpdateModeType" minOccurs="0" maxOccurs="1"/>
<xs:element name="memberFactors" type="MemberFactorSetType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:element name="memberFactorsResponse" type="MemberFactorsResponseType"/>
<xs:complexType name="MemberFactorsResponseType">
<xs:sequence>
<xs:element name="originalMemberFactorsInput" type="MemberFactorsType" minOccurs="0" maxOccurs="1"/>
<xs:element name="status" type="base:ServiceStatusType" minOccurs="0"/>
<xs:element name="errors" type="base:ErrorsType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Exception string in case of system error.</xs:documentation>
</xs:annotation>
</xs:element>
</xs:sequence>
</xs:complexType>
<xs:simpleType name="UpdateModeType">
<xs:restriction base="xs:string">
<xs:enumeration value="Create"/>
<xs:enumeration value="Amend"/>
<xs:enumeration value="Replace"/>
<xs:enumeration value="Delete"/>
</xs:restriction>
</xs:simpleType>
<xs:complexType name="MemberFactorSetType">
<xs:group ref="MemberFactorSetGroup"/>
</xs:complexType>
<xs:group name="MemberFactorSetGroup">
<xs:sequence>
<xs:element name="memberFactor" type="MemberFactorType" minOccurs="0" maxOccurs="unbounded" />
</xs:sequence>
</xs:group>
<xs:complexType name="MemberFactorType">
<xs:group ref="MemberFactorGroup"/>
</xs:complexType>
<xs:group name="MemberFactorGroup">
<xs:sequence>
<xs:element name="factorType" type="base:CodeEntryInputType" minOccurs="1" maxOccurs="1" />
<xs:element name="factorDateRanges" type="MemberFactorDateRangeType" minOccurs="0" maxOccurs="unbounded" />
</xs:sequence>
</xs:group>
<xs:complexType name="MemberFactorDateRangeType">
<xs:group ref="MemberFactorDateRangeGroup"/>
</xs:complexType>
<xs:group name="MemberFactorDateRangeGroup">
<xs:sequence>
<xs:element name="factorStartDate" type="xs:date" minOccurs="1" maxOccurs="1" />
<xs:element name="factorEndDate" type="xs:date" minOccurs="0" maxOccurs="1" />
<xs:element name="factorQualifier" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1" />
<xs:element name="factorValue" type="xs:decimal" minOccurs="1" maxOccurs="1" />
</xs:sequence>
</xs:group>
</xs:schema>
</file>
<file path="PRIME_SERVICES_XSD/connector-payeebankaccounts/payeeBankAccounts.xsd">
<?xml version="1.0" encoding="utf-8"?>
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema"
xmlns="http://www.healthedge.com/connector/schema/payeebankaccounts"
xmlns:tns="http://www.healthedge.com/connector/schema/payeebankaccounts"
xmlns:base="http://www.healthedge.com/connector/schema/basetypes"
xmlns:minput="http://www.healthedge.com/connector/schema/matchinput"
targetNamespace="http://www.healthedge.com/connector/schema/payeebankaccounts" elementFormDefault="unqualified" version="5.0">
<xs:import namespace="http://www.healthedge.com/connector/schema/basetypes" schemaLocation="../connector-common-schema/base-types.xsd"/>
<xs:import namespace="http://www.healthedge.com/connector/schema/matchinput" schemaLocation="../connector-common-schema/match-input.xsd"/>
<xs:element name="payeeBankAccounts" type="PayeeBankAccountsType"/>
<xs:element name="payeeBankAccountsResponse" type="PayeeBankAccountsResponseType"/>
<xs:element name="payeeBankAccountsLookupCriteria" type="PayeeBankAccountsLookupCriteriaType"/>
<xs:element name="payeeBankAccountsLookupResponse" type="PayeeBankAccountsLookupResponseType"/>
<xs:complexType name="PayeeBankAccountsResponseType">
<xs:sequence>
<xs:element name="payeeBankAccount" type="PayeeBankAccountsType" minOccurs="0" maxOccurs="1"/>
<xs:element name="status" type="base:ServiceStatusType" minOccurs="0"/>
<xs:element name="transactionInformation" type="base:TransactionInformationType" minOccurs="0" maxOccurs="1"/>
<xs:element name="errors" type="base:ErrorsType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Exception string in case of system error.</xs:documentation>
</xs:annotation>
</xs:element>
</xs:sequence>
</xs:complexType>
<xs:complexType name="PayeeBankAccountsType">
<xs:complexContent>
<xs:extension base="base:HealthRulesResourceType">
<xs:sequence>
<xs:group ref="PayeeBankAccountsGroup"/>
<xs:element name="maintenanceComment" type="base:String900Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="maintenanceReasonCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Reference to  PayeeBankAccountsAmendReason, PayeeBankAccountsCreateReason Code Set.
</xs:documentation>
</xs:annotation>
</xs:element>
</xs:sequence>
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:complexType name="PayeeBankAccountsLookupCriteriaType">
<xs:complexContent>
<xs:extension base="base:HealthRulesResourceType">
<xs:sequence>
<xs:element name="bankAccountId" type="xs:string" minOccurs="1" maxOccurs="1"/>
<xs:element name="endorsementEffectiveDate" type="xs:dateTime" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:complexType name="PayeeBankAccountsLookupResponseType">
<xs:complexContent>
<xs:extension base="base:HealthRulesResourceType">
<xs:sequence>
<xs:element name="payeeBankAccount" type="PayeeBankAccountsType" minOccurs="0" maxOccurs="1"/>
<xs:element name="status" type="base:ServiceStatusType" minOccurs="1" maxOccurs="1"/>
<xs:element name="errors" type="base:ErrorsType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:group name="PayeeBankAccountsGroup">
<xs:sequence>
<xs:element name="instanceActiveCode" type="xs:string" minOccurs="0" maxOccurs="1" />
<xs:element name="bankAccountId" type="xs:string" minOccurs="1" maxOccurs="1" />
<xs:element name="oldBankAccountId" type="xs:string" minOccurs="0" maxOccurs="1" />
<xs:element name="endorsementEffectiveDate" type="xs:dateTime" minOccurs="0" maxOccurs="1"/>
<xs:element name="endorsementExpirationDate" type="xs:dateTime" minOccurs="0" maxOccurs="1"/>
<xs:element name="payee" type="PayeeType" minOccurs="0" maxOccurs="1" />
<xs:choice>
<xs:element name="payeeBankAccountDateRange" type="PayeeBankAccountDateRangeType" minOccurs="1"
maxOccurs="1"/>
<xs:element name="payeeBankAccountDateRanges" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="payeeBankAccountDateRange" type="PayeeBankAccountDateRangeType" minOccurs="1"
maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
</xs:choice>
</xs:sequence>
</xs:group>
<xs:complexType name="PayeeType">
<xs:complexContent>
<xs:extension base="base:HealthRulesResourceType">
<xs:sequence>
<xs:element name="payeeSupplierHccId" type="xs:string" minOccurs="0" maxOccurs="1" />
<xs:element name="payeeSupplierLocationHccId" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="payeeBrokerHccId" type="xs:string" minOccurs="0" maxOccurs="1" />
<xs:element name="payeeSubscriptionHccId" type="xs:string" minOccurs="0" maxOccurs="1" />
</xs:sequence>
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:complexType name="PayeeBankAccountDateRangeType">
<xs:sequence>
<xs:element name="startDate" type="xs:string" minOccurs="1" maxOccurs="1" />
<xs:element name="endDate" type="xs:string" minOccurs="1" maxOccurs="1" />
<xs:element name="routingNumber" type="xs:string" minOccurs="1" maxOccurs="1" />
<xs:element name="accountNumber" type="xs:string" minOccurs="1" maxOccurs="1" />
<xs:element name="bankName" type="xs:string" minOccurs="0" maxOccurs="1" />
<xs:element name="countryCode" type="base:CountryCodeDomainType" minOccurs="1" maxOccurs="1" />
<xs:element name="accountOwner" type="base:String150Type" minOccurs="0" maxOccurs="1" />
<xs:element name="bankAccountType" type="base:CodeEntryInputType" minOccurs="1" maxOccurs="1" />
<xs:element name="externalUsageType" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1" />
</xs:sequence>
</xs:complexType>
</xs:schema>
</file>
<file path="PRIME_SERVICES_XSD/connector-providerlookup/providerlookup.xsd">
<?xml version="1.0" encoding="UTF-8"?>
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:base="http://www.healthedge.com/connector/schema/basetypes"
xmlns="http://www.healthedge.com/connector/schema/providerlookup"
xmlns:tns="http://www.healthedge.com/connector/schema/providerlookup"
targetNamespace="http://www.healthedge.com/connector/schema/providerlookup" elementFormDefault="unqualified"
version="4.2">
<xs:annotation>
<xs:documentation>
DISCLAIMER
This pre-release software provided by HealthEdge Inc. is a work-in-progress.
HealthEdge provides pre-release information to early adopters for the purpose of design and planning.
It has no warranty either explicit or implied and is subject to change.
</xs:documentation>
</xs:annotation>
<xs:import namespace="http://www.healthedge.com/connector/schema/basetypes" schemaLocation="../connector-common-schema/base-types.xsd"/>
<xs:element name="practitionerReferenceLookupResponse" type="PractitionerReferenceLookupResponseType"/>
<xs:complexType name="PractitionerReferenceLookupResponseType">
<xs:complexContent>
<xs:extension base="ProviderResponseType">
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:element name="practitionerReferenceLookupCriteria" type="PractitionerReferenceLookupType">
<xs:annotation>
<xs:documentation>Practitioner information used for matching during a search.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:complexType name="PractitionerReferenceLookupType">
<xs:complexContent>
<xs:extension base="base:PractitionerReferenceType">
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:element name="practitionerReferenceByRoleLookupResponse" type="PractitionerByRoleResponseType">
<xs:annotation>
<xs:documentation>Practitioner Role information used for matching during a search.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:complexType  name="PractitionerByRoleResponseType">
<xs:sequence>
<xs:element name="practitionerByRoleReference" type="base:PractitionerByRoleReferenceType" minOccurs="0" maxOccurs="1"/>
<xs:group ref="base:ErrorStatusGroup"/>
</xs:sequence>
</xs:complexType>
<xs:element name="practitionerReferenceByRoleLookupCriteria" type="PractitionerByRoleReferenceLookupType">
<xs:annotation>
<xs:documentation>Practitioner Role information used for matching during a search.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:complexType name="PractitionerByRoleReferenceLookupType">
<xs:complexContent>
<xs:extension base="base:PractitionerByRoleReferenceType">
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:element name="practitionerLookupListResponse" type="PractitionerDetailResponseType"/>
<xs:element name="practitionerLookupCriteria" type="PractitionerLookupType">
<xs:annotation>
<xs:documentation>Practitioner's information used during retrieval of details.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:complexType name="PractitionerLookupType">
<xs:complexContent>
<xs:extension base="ProviderBatchLookupInputType">
<xs:sequence>
<xs:element name="endorsementEffectiveDate" type="xs:dateTime" minOccurs="0" maxOccurs="1"/>
<xs:element name="practitionerReferenceId" type="base:IdentifierType" minOccurs="0" maxOccurs="1"/>
<xs:element name="practitionerId" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="practitionerFirstName" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="practitionerLastName" type="xs:string" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:element name="supplierLocationReferenceLookupResponse" type="SupplierLocationReferenceLookupResponseType"/>
<xs:complexType name="SupplierLocationReferenceLookupResponseType">
<xs:complexContent>
<xs:extension base="ProviderResponseType">
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:element name="supplierLocationReferenceLookupCriteria" type="SupplierLocationReferenceLookupType">
<xs:annotation>
<xs:documentation>Supplier information used for matching during a search.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:complexType name="SupplierLocationReferenceLookupType">
<xs:complexContent>
<xs:extension base="base:SupplierLocationReferenceType">
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:element name="supplierReferenceLookupResponse" type="SupplierReferenceLookupResponseType"/>
<xs:complexType name="SupplierReferenceLookupResponseType">
<xs:complexContent>
<xs:extension base="ProviderResponseType">
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:element name="supplierReferenceLookupCriteria" type="SupplierReferenceLookupType">
<xs:annotation>
<xs:documentation>Supplier information used for matching during a search.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:complexType name="SupplierReferenceLookupType">
<xs:complexContent>
<xs:extension base="base:SupplierReferenceType">
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:element name="submittedSupplierReferenceLookupResponse" type="SubmittedSupplierReferenceLookupResponseType"/>
<xs:complexType name="SubmittedSupplierReferenceLookupResponseType">
<xs:complexContent>
<xs:extension base="ProviderResponseType">
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:element name="submittedSupplierReferenceLookupCriteria" type="SubmittedSupplierReferenceLookupType">
<xs:annotation>
<xs:documentation>Submitted Supplier information used for matching during a search.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:complexType name="SubmittedSupplierReferenceLookupType">
<xs:complexContent>
<xs:extension base="base:SubmittedSupplierReferenceType">
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:element name="supplierLookupListResponse" type="SupplierDetailResponseType"/>
<xs:element name="supplierLookupCriteria" type="SupplierLookupType">
<xs:annotation>
<xs:documentation>Supplier's information used during retrieval of details.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:complexType name="SupplierLookupType">
<xs:complexContent>
<xs:extension base="ProviderBatchLookupInputType">
<xs:sequence>
<xs:element name="endorsementEffectiveDate" type="xs:dateTime" minOccurs="0" maxOccurs="1"/>
<xs:element name="supplierReferenceId" type="base:IdentifierType" minOccurs="0" maxOccurs="1"/>
<xs:element name="supplierName" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="supplierNPI" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="supplierHccId" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="supplierOtherIdentificationNumber" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="supplierTaxId" type="xs:string" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:complexType name="ProviderBatchLookupInputType">
<xs:sequence>
<xs:element name="onlyPCP" type="xs:boolean" minOccurs="0" maxOccurs="1"/>
<xs:element name="asOfDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="includeTerminated" type="xs:boolean" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="ProviderResponseType">
<xs:sequence>
<xs:element name="practitionerReference" type="base:PractitionerReferenceType" minOccurs="0" maxOccurs="1"/>
<xs:element name="supplierReference" type="base:SupplierReferenceType" minOccurs="0" maxOccurs="1"/>
<xs:element name="submittedSupplierReference" type="base:SubmittedSupplierReferenceType" minOccurs="0" maxOccurs="1"/>
<xs:element name="supplierLocationReference" type="base:SupplierLocationReferenceType" minOccurs="0" maxOccurs="1"/>
<xs:group ref="base:ErrorStatusGroup"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="PractitionerDetailResponseType">
<xs:sequence>
<xs:element name="practitionerDetail" type="PractitionerDetailType" minOccurs="0" maxOccurs="unbounded"/>
<xs:group ref="base:ErrorStatusGroup"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="SupplierDetailResponseType">
<xs:sequence>
<xs:element name="supplierDetail" type="SupplierDetailType" minOccurs="0" maxOccurs="unbounded"/>
<xs:group ref="base:ErrorStatusGroup"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="PractitionerDetailType">
<xs:sequence>
<xs:element name="hccID" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:group ref="base:PractitionerInformationGroup"/>
<xs:element name="activeCode" type="ProviderActiveCodeType" minOccurs="0" maxOccurs="1"/>
<xs:element name="firstActiveDate" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="practitionerCredential" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="practitionerLanguage" type="base:LanguageSpokenType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="practitionerIdDetail" type="base:IdentificationNumberType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="correspondenceAddress" type="ProviderAddressType" minOccurs="0" maxOccurs="1"/>
<xs:element name="practitionerLicense" type="LicenseType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="RaceOrEthnicityCode" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="primarySpecialty" type="SpecialtyType" minOccurs="0" maxOccurs="1"/>
<xs:element name="secondarySpecialty" type="SpecialtyType" minOccurs="0" maxOccurs="1"/>
<xs:element name="specialtyList" type="SpecialtyListType" minOccurs="0" maxOccurs="1"/>
<xs:element name="practitionerCredentialing" type="PractitionerCredentialing" minOccurs="0" maxOccurs="1"/>
<xs:element name="practitionerUDTList" type="ProviderUDTListType" minOccurs="0" maxOccurs="1"/>
<xs:element name="benefitNetworkList" type="BenefitNetworkList" minOccurs="0" maxOccurs="1"/>
<xs:element name="otherCorrespondenceAddressList" type="ProviderOtherAddressType" minOccurs="0" maxOccurs="1"/>
<xs:element name="versionEndDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="otherNames" type="ProviderOtherNamesType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="SupplierDetailType">
<xs:sequence>
<xs:group ref="base:SupplierInformationGroup"/>
<xs:element name="versionEndDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="endorsementEffectiveDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="endorsementExpirationDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="activeCode" type="ProviderActiveCodeType" minOccurs="0" maxOccurs="1"/>
<xs:element name="otherOrganizationName" type="base:LongNameType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="otherIdDetail" type="base:IdentificationNumberType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="correspondenceAddress" type="ProviderAddressType" minOccurs="0" maxOccurs="1"/>
<xs:element name="supplierLicense" type="LicenseType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="supplierUDTList" type="ProviderUDTListType" minOccurs="0" maxOccurs="1"/>
<xs:element name="benefitNetworkList" type="BenefitNetworkList" minOccurs="0" maxOccurs="1"/>
<xs:element name="otherCorrespondenceAddressList" type="ProviderOtherAddressType" minOccurs="0" maxOccurs="1"/>
<xs:element name="supplierClassType" type="SpecialtyListType" minOccurs="0" maxOccurs="1" />
</xs:sequence>
</xs:complexType>
<xs:element name="supplierNetworkLookupListResponse" type="SupplierNetworkDetailResponseType"/>
<xs:element name="supplierNetworkLookupCriteria" type="SupplierNetworkLookupType">
<xs:annotation>
<xs:documentation>Supplier network's information used during retrieval of details.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:complexType name="SupplierNetworkLookupType">
<xs:sequence>
<xs:element name="supplierNetworkIdentifier" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="networkHccIdentifier" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="networkName" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="networkOtherIdentifier" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="asOfDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="endorsementEffectiveDate" type="xs:dateTime" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="SupplierNetworkDetailResponseType">
<xs:sequence>
<xs:element name="supplierNetworkDetail" type="SupplierNetworkDetailType" minOccurs="0" maxOccurs="unbounded"/>
<xs:group ref="base:ErrorStatusGroup"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="SupplierNetworkDetailType">
<xs:sequence>
<xs:element name="supplierNetworkIdentifier" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="hccIdentifier" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="receiptDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="supplierNetworkName" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="versionEndDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="effectiveStartDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="pcpPanelStatus" type="base:CodeEntryType" minOccurs="0" maxOccurs="1"/>
<xs:element name="networkType" type="base:CodeEntryType" minOccurs="0" maxOccurs="1"/>
<xs:element name="PaymentHold" type="base:PaymentHoldType" minOccurs="0" maxOccurs="1"/>
<xs:element name="otherIdDetail" type="base:IdentificationNumberType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="parentNetworks" type="ParentNetworkType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="claimReview" type="base:ClaimReviewType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="benefitNetwork" type="BenefitNetworkType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="taxEntity" type="TaxEntityType" minOccurs="0" maxOccurs="1"/>
<xs:element name="generalCorrespondence" type="base:CorrespondenceInfoType" minOccurs="0" maxOccurs="1"/>
<xs:element name="otherCorrespondence" type="base:CorrespondenceInfoListType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="ParentNetworkType">
<xs:sequence>
<xs:element name="supplierNetworkIdentifier" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="hccIdentifier" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="effectiveStartDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="BenefitNetworkType">
<xs:sequence>
<xs:element name="benefitNetworkId" type="xs:long" minOccurs="0" maxOccurs="1"/>
<xs:element name="benefitNetworkName" type="xs:string" minOccurs="1" maxOccurs="1"/>
<xs:element name="benefitNetworkDescription" type="xs:string" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="LicenseType">
<xs:sequence>
<xs:group ref="base:LicenseNumberGroup"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="ProviderAddressType">
<xs:sequence>
<xs:element name="emailAddress" type="base:EmailAddressSimpleType" minOccurs="0" maxOccurs="1"/>
<xs:element name="correspondenceAddress" type="base:PostalAddressType" minOccurs="0" maxOccurs="1"/>
<xs:element name="phoneNumber" type="ProviderPhoneType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="correspondenceUsageType" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="ProviderPhoneType">
<xs:sequence>
<xs:group ref="base:TelephoneNumberGroup"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="SpecialtyListType">
<xs:sequence>
<xs:element name="specialty" type="SpecialtyType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="SpecialtyType">
<xs:sequence>
<xs:group ref="SpecialtyGroup"/>
</xs:sequence>
</xs:complexType>
<xs:group name="SpecialtyGroup">
<xs:annotation>
<xs:documentation>Provider Specialty Information</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="specialtyCode" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="specialtyName" type="xs:string" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:complexType name="PractitionerCredentialing">
<xs:sequence>
<xs:element name="medicalSchoolInfo" type="MedicalSchoolInfo" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="residencyInfo" type="ResidencyInfo" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="generalCredentialInfo" type="Credentialing" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="MedicalSchoolInfo">
<xs:sequence>
<xs:group ref="MedicalSchoolInfoGroup"/>
</xs:sequence>
</xs:complexType>
<xs:group name="MedicalSchoolInfoGroup">
<xs:annotation>
<xs:documentation>Medical School Information</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="schoolName" type="xs:string" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:complexType name="ResidencyInfo">
<xs:sequence>
<xs:group ref="ResidencyInfoGroup"/>
</xs:sequence>
</xs:complexType>
<xs:group name="ResidencyInfoGroup">
<xs:annotation>
<xs:documentation>Residency Information</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="residencyProgramName" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="residencySpecialty" type="SpecialtyType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:complexType name="Credentialing">
<xs:sequence>
<xs:group ref="CredentialingGroup"/>
</xs:sequence>
</xs:complexType>
<xs:group name="CredentialingGroup">
<xs:annotation>
<xs:documentation>Credential Information</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="dateSentToCredentialEntity" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="originalEffectiveStartDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="effectiveStartDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="effectiveEndDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="recredentialDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="credentialResponsibilityEntity" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="credentialStatus" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="stateApprovalInfo" type="StateApprovalInfo" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="credentialSourceInfo" type="CredentialSourceInfo" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:group>
<xs:complexType name="StateApprovalInfo">
<xs:sequence>
<xs:group ref="StateApprovalInfoGroup"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="CredentialSourceInfo">
<xs:sequence>
<xs:group ref="CredentialSourceInfoGroup"/>
</xs:sequence>
</xs:complexType>
<xs:group name="StateApprovalInfoGroup">
<xs:annotation>
<xs:documentation>State Approval Information</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="stateGivingApproval" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="countryGivingApproval" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="boardCertificationInfo" type="BoardCertificationInfo" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:group>
<xs:complexType name="BoardCertificationInfo">
<xs:sequence>
<xs:group ref="BoardCertificationInfoGroup"/>
</xs:sequence>
</xs:complexType>
<xs:group name="BoardCertificationInfoGroup">
<xs:annotation>
<xs:documentation>Board Certification Information</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="certificationStatus" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="boardApprovedSpecialty" type="xs:string" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:group name="CredentialSourceInfoGroup">
<xs:annotation>
<xs:documentation>Credential Source Information</xs:documentation>
</xs:annotation>
<xs:sequence>
<xs:element name="credentialSourceName" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="credentialSourceCode" type="xs:string" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:simpleType name="ProviderActiveCodeType">
<xs:restriction base="xs:string">
<xs:enumeration value="Active"/>
<xs:enumeration value="Terminated"/>
</xs:restriction>
</xs:simpleType>
<xs:complexType name="ProviderUDTListType">
<xs:sequence>
<xs:element name="udtList" type="base:UDTListType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="TaxEntityType">
<xs:sequence>
<xs:element name="taxId" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="taxName" type="xs:string" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="BenefitNetworkList">
<xs:sequence>
<xs:element name="BenefitNetwork" type="BenefitNetworkType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="ProviderOtherAddressType">
<xs:sequence>
<xs:element name="providerOtherCorrAddress" type="ProviderAddressType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="ProviderOtherNamesType">
<xs:sequence>
<xs:element name="otherNameUsed" type="OtherNameType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="OtherNameType">
<xs:sequence>
<xs:element name="personName" type="OtherPersonName" minOccurs="0" maxOccurs="1"/>
<xs:element name="otherNameType" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="OtherPersonName">
<xs:sequence>
<xs:element name="lastName" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="firstName" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="middleName" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="prefixCode" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="nameSuffixList" type="NameSuffixListType" minOccurs="0" maxOccurs="1"/>
<xs:element name="credentialSuffixList" type="CredentialSuffixListType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="NameSuffixListType">
<xs:sequence>
<xs:element name="nameSuffix" type="xs:string" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="CredentialSuffixListType">
<xs:sequence>
<xs:element name="credentialSuffix" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:schema>
</file>
<file path="PRIME_SERVICES_XSD/connector-subsidy/subsidies.xsd">
<?xml version="1.0"?>
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema"
xmlns="http://www.healthedge.com/connector/schema/subsidy"
xmlns:tns="http://www.healthedge.com/connector/schema/subsidy"
xmlns:base="http://www.healthedge.com/connector/schema/basetypes"
targetNamespace="http://www.healthedge.com/connector/schema/subsidy"
elementFormDefault="unqualified" version="4.0">
<xs:import namespace="http://www.healthedge.com/connector/schema/basetypes" schemaLocation="../connector-common-schema/base-types.xsd"/>
<xs:element name="subsidy" type="SubscriptionSubsidyType"/>
<xs:element name="subsidyResponse" type="SubscriptionSubsidyResponseType"/>
<xs:complexType name="SubscriptionSubsidyType">
<xs:complexContent>
<xs:extension base="base:HealthRulesResourceType">
<xs:sequence>
<xs:element name="subscriptionHccId" type="base:String50Type">
<xs:annotation>
<xs:documentation>The business identifier for the subscription - Required</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="otherBillRecipientHccId" type="base:String50Type">
<xs:annotation>
<xs:documentation>The business identifier for the bill recipient - Required</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="benefitPlanTypeCode" type="base:CodeEntryInputType">
<xs:annotation>
<xs:documentation>The benefit plan type this subsidy should be applied to - Required</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="billingCategoryCode" type="base:CodeEntryInputType">
<xs:annotation>
<xs:documentation>The billing category this subsidy should be applied to - Required</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="dateRanges">
<xs:complexType>
<xs:sequence>
<xs:element name="updateMode" type="base:ListUpdateModeType" minOccurs="0" maxOccurs="1"/>
<xs:element name="dateRange" type="SubsidyDateRangeType" minOccurs = "1" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
</xs:sequence>
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:complexType name="SubscriptionSubsidyResponseType">
<xs:complexContent>
<xs:extension base="base:HealthRulesResourceType">
<xs:sequence>
<xs:element name="subscriptionHccId" type="base:String50Type" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>The business identifier for the subscription - Optional</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="subsidyId" type="base:String50Type" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>The business identifier for the Subscription Subsidy - Optional</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="status" type="base:ServiceStatusType" minOccurs="0">
<xs:annotation>
<xs:documentation>SubscriptionSubsidy status. SUCCESS (transaction complete without errors or validation failures), FAILURE (system or validation error).
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="errors" type="base:ErrorsType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Exception string in case of system or validation error.</xs:documentation>
</xs:annotation>
</xs:element>
</xs:sequence>
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:complexType name="SubsidyDateRangeType">
<xs:sequence>
<xs:element name="startDate" type="xs:date">
<xs:annotation>
<xs:documentation>The start date of the subsidy - Required</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="throughDate" type="xs:date" minOccurs="0">
<xs:annotation>
<xs:documentation>The through date of the subsidy - Optional</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="amount" type="base:CurrencyType">
<xs:annotation>
<xs:documentation>The doller amount of the subsidy (per month) - Required</xs:documentation>
</xs:annotation>
</xs:element>
</xs:sequence>
</xs:complexType>
<!-- lookup start -->
<xs:element name="subsidyReferenceLookupCriteria" type="SubsidyReferenceLookupCriteriaType" />
<xs:element name="subsidyReferenceLookupResponse" type="SubsidyReferenceLookupResponseType" />
<xs:complexType name="SubsidyReferenceLookupCriteriaType">
<xs:complexContent>
<xs:extension base="base:HealthRulesResourceType">
<xs:sequence>
<xs:group ref="SubsidyLookupGroup"/>
</xs:sequence>
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:complexType name="SubsidyReferenceLookupResponseType">
<xs:complexContent>
<xs:extension base="base:HealthRulesResourceType">
<xs:sequence>
<xs:element name="subsidyIdentifier" type="base:IdentifierType" minOccurs="0" maxOccurs="unbounded"/>
<xs:group ref="SubsidyLookupGroup"/>
<xs:group ref="base:ErrorStatusGroup"/>
</xs:sequence>
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:group name="SubsidyLookupGroup">
<xs:sequence>
<xs:element name="subscriptionHccId" type="xs:string" minOccurs="0" maxOccurs="1"></xs:element>
<xs:element name="otherBillReceipientHccId" type="xs:string" minOccurs="0" maxOccurs="1"></xs:element>
<xs:element name="benefitPlanTypeCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1"></xs:element>
<xs:element name="billingCategoryCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1"></xs:element>
<xs:element name="asOfDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
</xs:schema>
</file>
<file path="PRIME_SERVICES_XSD/connector-supplierlocationlookup/supplierlocationlookup.xsd">
<?xml version="1.0"?>
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema"
xmlns="http://www.healthedge.com/connector/schema/supplierlocationlookup"
xmlns:base="http://www.healthedge.com/connector/schema/basetypes"
targetNamespace="http://www.healthedge.com/connector/schema/supplierlocationlookup"
elementFormDefault="unqualified" version="4.1">
<xs:import namespace="http://www.healthedge.com/connector/schema/basetypes" schemaLocation="../connector-common-schema/base-types.xsd"/>
<xs:element name="supplierLocationLookupResponse" type="SupplierLocationLookupResponseType"/>
<xs:element name="supplierLocationLookupInput" type="SupplierLocationLookupInputType"/>
<xs:complexType name="SupplierLocationLookupInputType">
<xs:sequence>
<xs:element name="supplierLocationReference" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="supplierLocationHccIdentifier" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="supplierLocationNationalProviderId" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="onlyPCP" type="xs:boolean" minOccurs="0" maxOccurs="1"/>
<xs:element name="supplierLocationName" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="otherName" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="asOfDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="endorsementDate" type="xs:dateTime" minOccurs="0" maxOccurs="1"/>
<xs:element name="includeTerminated" type="xs:boolean" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="SupplierLocationType">
<xs:sequence>
<xs:element name="supplierReference" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="supplierHccIdentifier" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="supplierLocationReference" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="supplierLocationHccIdentifier" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="endorsementEffectiveDate" type="xs:dateTime" minOccurs="0" maxOccurs="1"/>
<xs:element name="supplierLocationNationalProviderId" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="pcp" type="xs:boolean" nillable="true" minOccurs="0" maxOccurs="1"/>
<xs:element name="isAutoAssignedAsPCP" type="xs:boolean" nillable="true" minOccurs="0" maxOccurs="1"/>
<xs:element name="supplierLocationName" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="otherNames" type="base:OtherNamesListType" minOccurs="0" maxOccurs="unbounded" />
<xs:element name="practiceAddress" type="AddressInformationType" minOccurs="0" maxOccurs="1"/>
<xs:element name="language" type="base:LanguageSpokenType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="claimPaymentPayee" type="PayeeSelectionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="capitatedPaymentPayee" type="PayeeSelectionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="supplierLocationUDTList" type="base:UDTListType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="effectiveStartDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="isHandicapAccessible" type="xs:boolean" minOccurs="0" maxOccurs="1"/>
<xs:element name="isHospital" type="xs:boolean" minOccurs="0" maxOccurs="1"/>
<xs:element name="primaryLocationIndicator" type="xs:boolean" minOccurs="0" maxOccurs="1"/>
<xs:element name="locationPanels" type="LocationPanelsType" minOccurs="0" maxOccurs="1"/>
<xs:element name="locationPracticeInformation" type="LocationPracticeInformationType" minOccurs="0" maxOccurs="1"/>
<xs:element name="instanceActiveCode" type="InstanceActiveCodeType" minOccurs="0" maxOccurs="1"/>
<xs:element name="generalCorrespondenceAddress" type="CorrespondenceInformationType" minOccurs="0" maxOccurs="1"/>
<xs:element name="otherCorrespondenceAddressList" type="CorrespondenceInformationType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="otherIdNumberList" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="listMode" type="base:ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="identificationNumber" type="base:IdentificationNumberType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="supplierClassification" type="ClassificationListType" minOccurs="0" maxOccurs="1"/>
<xs:element name="remittanceType" type="base:CodeEntryType" minOccurs="0" maxOccurs="1"/>
<xs:element name="paymentType" type="base:CodeEntryType" minOccurs="0" maxOccurs="1"/>
<xs:element name="weeklyHoursOfOperation" type="WeeklyHoursOfOperationType" minOccurs="0" maxOccurs="1"/>
<xs:element name="benefitNetworkList" type="BenefitNetworkList" minOccurs="0" maxOccurs="1"/>
<xs:element name="versionEndDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="BenefitNetworkList">
<xs:sequence>
<xs:element name="BenefitNetwork" type="BenefitNetworkType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="BenefitNetworkType">
<xs:sequence>
<xs:element name="benefitNetworkId" type="xs:long" minOccurs="0" maxOccurs="1"/>
<xs:element name="benefitNetworkName" type="xs:string" minOccurs="1" maxOccurs="1"/>
<xs:element name="benefitNetworkDescription" type="xs:string" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="SupplierLocationLookupResponseType">
<xs:sequence>
<xs:element name="SupplierLocationLookup" type="SupplierLocationType" minOccurs="0" maxOccurs="unbounded"/>
<xs:group ref="base:ErrorStatusGroup"/>
</xs:sequence>
</xs:complexType>
<xs:simpleType name="PayeeSelectionType">
<xs:restriction base="xs:string">
<xs:enumeration value="Supplier"/>
<xs:enumeration value="Location"/>
</xs:restriction>
</xs:simpleType>
<xs:simpleType name="InstanceActiveCodeType">
<xs:restriction base="xs:string">
<xs:enumeration value="ACTIVE"/>
<xs:enumeration value="TERMINATED"/>
</xs:restriction>
</xs:simpleType>
<xs:complexType name="ClassificationListType">
<xs:sequence>
<xs:element name="updateMode" type="base:ListUpdateModeType"  minOccurs="0" maxOccurs="1"/>
<xs:element name="classification" type="ClassificationType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="ClassificationType">
<xs:sequence>
<xs:element name="classificationIdentifier" type="xs:long" minOccurs="0" maxOccurs="1"/>
<xs:element name="code" type="base:String50Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="description" type="xs:string" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="LocationPanelsType">
<xs:sequence>
<xs:element name="panel" type="LocationPanelType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="LocationPanelType">
<xs:sequence>
<xs:element name="panelStatusCode" type="PanelStatusCodeType" minOccurs="0" maxOccurs="1"/>
<xs:element name="allowReturningMembersToClosedPanel" type="xs:boolean" nillable="true" minOccurs="0" maxOccurs="1"/>
<xs:element name="allowFamilyMembersToClosedPanel" type="xs:boolean" nillable="true" minOccurs="0" maxOccurs="1"/>
<xs:element name="maxNumberOfMembers" type="xs:int" minOccurs="0" maxOccurs="1"/>
<xs:element name="panelTypes" type="LocationPanelTypesType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="LocationPanelTypesType">
<xs:sequence>
<xs:element name="panelType" type="base:CodeEntryType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
<xs:simpleType name="PanelStatusCodeType">
<xs:restriction base="xs:string">
<xs:enumeration value="Open"/>
<xs:enumeration value="Closed"/>
</xs:restriction>
</xs:simpleType>
<xs:complexType name="LocationPracticeInformationType">
<xs:sequence>
<xs:element name="panelGenderCode " type="base:GenderCodeType" nillable="true" minOccurs="0" maxOccurs="1"/>
<xs:element name="maxAgeSeen"  type="xs:int" minOccurs="0" maxOccurs="1"/>
<xs:element name="minAgeSeen"  type="xs:int" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="CorrespondenceInformationType">
<xs:sequence>
<xs:element name="emailAddress" type="base:EmailAddressValueType" minOccurs="0" maxOccurs="1"/>
<xs:element name="addressInfo" type="AddressInformationType" minOccurs="0" maxOccurs="1" />
<xs:element name="contacts" type="ContactListType" minOccurs="0" maxOccurs="1" />
<xs:element name="correspondenceUsageType" type="base:CodeEntryType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="AddressInformationType">
<xs:sequence>
<xs:element name="postalAddress" type="base:PostalAddressType" minOccurs="0" maxOccurs="1"/>
<xs:element name="addressPhones" type="AddressPhoneType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="AddressPhoneType">
<xs:sequence>
<xs:element name="addressPhone" type="base:TelephoneNumberType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="ContactListType">
<xs:sequence>
<xs:element name="contact" type="ContactType" minOccurs="0" maxOccurs="unbounded" />
</xs:sequence>
</xs:complexType>
<xs:complexType name="ContactType">
<xs:sequence>
<xs:element name="title" type="base:String50Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="emailAddress" type="base:EmailAddressValueType"  minOccurs="0" maxOccurs="1"/>
<xs:element name="personName" type="base:PersonNameType" minOccurs="0" maxOccurs="1"/>
<xs:element name="telephones" type="TelephoneType"  minOccurs="0" maxOccurs="1"/>
<xs:element name="usageType" type="base:CodeEntryType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="TelephoneType">
<xs:sequence>
<xs:element name="telephone" type="base:TelephoneNumberType"  minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="WeeklyHoursOfOperationType">
<xs:sequence>
<xs:element name="monday" type="OpenCloseTimesType" minOccurs="0" maxOccurs="1"/>
<xs:element name="tuesday" type="OpenCloseTimesType" minOccurs="0" maxOccurs="1"/>
<xs:element name="wednesday" type="OpenCloseTimesType" minOccurs="0" maxOccurs="1"/>
<xs:element name="thursday" type="OpenCloseTimesType" minOccurs="0" maxOccurs="1"/>
<xs:element name="friday" type="OpenCloseTimesType" minOccurs="0" maxOccurs="1"/>
<xs:element name="saturday" type="OpenCloseTimesType" minOccurs="0" maxOccurs="1"/>
<xs:element name="sunday" type="OpenCloseTimesType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="OpenCloseTimesType">
<xs:sequence>
<xs:element name="openCloseTime" type="OpenCloseTimeType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="OpenCloseTimeType">
<xs:sequence>
<xs:element name="openTime" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="openTimeAMPM" type="AMPMType" minOccurs="0" maxOccurs="1"/>
<xs:element name="closeTime" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="closeTimeAMPM" type="AMPMType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:simpleType name="AMPMType">
<xs:restriction base="xs:string">
<xs:enumeration value="AM"/>
<xs:enumeration value="PM"/>
</xs:restriction>
</xs:simpleType>
<!--
<xs:complexType name="OrganizationInformationType">
<xs:sequence>
<xs:element name="primaryName" type="base:String200Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="taxId" type="base:String50Type" minOccurs="0" maxOccurs="1" />
<xs:element name="otherNames" type="OtherNamesType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="OtherNamesType">
<xs:sequence>
<xs:element name="otherName" type="OtherOrganizationNameUsedType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
-->
</xs:schema>
</file>
<file path="PRIME_SERVICES_XSD/membercarereserve.xsd">
<?xml version="1.0" encoding="utf-8"?>
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema"
xmlns="http://www.healthedge.com/connector/schema/membercarereserve"
xmlns:tns="http://www.healthedge.com/connector/schema/membercarereserve"
xmlns:base="http://www.healthedge.com/connector/schema/basetypes"
targetNamespace="http://www.healthedge.com/connector/schema/membercarereserve"
elementFormDefault="unqualified" version="4.0">
<xs:import namespace="http://www.healthedge.com/connector/schema/basetypes"
schemaLocation="../PRIME_SERVICES_XSD/connector-common-schema/base-types.xsd" />
<xs:element name="memberCareReserve" type="MemberCareReserveType" />
<xs:element name="memberCareReserveResponse" type="MemberCareReserveResponseType" />
<xs:complexType name="MemberCareReserveResponseType">
<xs:complexContent>
<xs:extension base="base:HealthRulesResourceType">
<xs:sequence>
<xs:element name="memberHccID" type="xs:string"
minOccurs="1" maxOccurs="1" />
<xs:element name="status" type="base:ServiceStatusType"
minOccurs="0" />
<xs:element name="memberReserveID" type="xs:long"
minOccurs="1" maxOccurs="1" />
<xs:element name="transactionInformation" type="base:TransactionInformationType"
minOccurs="0" maxOccurs="1" />
<xs:element name="errors" type="base:ErrorsType"
minOccurs="0" maxOccurs="1" />
</xs:sequence>
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:complexType name="MemberCareReserveType">
<xs:complexContent>
<xs:extension base="base:HealthRulesResourceType">
<xs:group ref="MemberCareReserveGroup" />
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:group name="MemberCareReserveGroup">
<xs:sequence>
<xs:element name="memberHccID" type="xs:string" minOccurs="1"
maxOccurs="1" />
<!--<xs:element name="transactionReasonCode" type="MemberCareReserveAction"
minOccurs="1" maxOccurs="1"/> -->
<!--<xs:element name="comment" type="xs:string" minOccurs="0" maxOccurs="1"/> -->
<xs:element name="memberCareReserveSourceCode" type="base:CodeEntryInputType"
minOccurs="1" maxOccurs="1" />
<xs:element name="memberCareReserveCategoryCode" type="base:CodeEntryInputType"
minOccurs="1" maxOccurs="1" />
<xs:element name="dateRanges" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="updateMode" type="base:ListUpdateModeType"
minOccurs="1" maxOccurs="1" />
<xs:element name="dateRange" type="ReserveDateRangeType"
minOccurs="1" maxOccurs="unbounded" />
</xs:sequence>
</xs:complexType>
</xs:element>
</xs:sequence>
</xs:group>
<xs:complexType name="ReserveDateRangeType">
<xs:sequence>
<xs:element name="reserveStartDate" type="xs:date"
minOccurs="1" maxOccurs="1" />
<xs:element name="reserveToDate" type="xs:date" minOccurs="0"
maxOccurs="1" />
<xs:element name="monthlyReserveAmount" type="base:CurrencyType"
minOccurs="0" maxOccurs="1" />
</xs:sequence>
</xs:complexType>
</xs:schema>
</file>
<file path="WRAPPER_XSD/enrollment-sparse-wrapper.xsd">
<?xml version="1.0"?>
<!-- edited with XMLSpy v2014 sp1 (http://www.altova.com) by Rebecca (healthedge) -->
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema"
xmlns="http://www.ust-global.com/schema/enrollmentsparse"
xmlns:tns="http://www.ust-global.com/schema/enrollmentsparse"
xmlns:base="http://www.healthedge.com/connector/schema/basetypes"
xmlns:subscription="http://www.healthedge.com/connector/schema/subscriptionsparse"
xmlns:membership="http://www.ust-global.com/schema/membershipsparse"
xmlns:enrollmenttypes="http://www.healthedge.com/connector/schema/enrollmenttypes"
xmlns:sparseResp="http://www.healthedge.com/connector/schema/enrollmentsparseresponse"
targetNamespace="http://www.ust-global.com/schema/enrollmentsparse"
elementFormDefault="unqualified" version="4.1">
<xs:import namespace="http://www.healthedge.com/connector/schema/basetypes" schemaLocation="../PRIME_SERVICES_XSD/connector-common-schema/base-types.xsd"/>
<xs:import namespace="http://www.healthedge.com/connector/schema/subscriptionsparse" schemaLocation="../PRIME_SERVICES_XSD/connector-enrollmentsparse/subscription-sparse.xsd"/>
<xs:import namespace="http://www.ust-global.com/schema/membershipsparse" schemaLocation="membership-sparse-wrapper.xsd"/>
<xs:import namespace="http://www.healthedge.com/connector/schema/enrollmenttypes" schemaLocation="../PRIME_SERVICES_XSD/connector-enrollmentsparse/enrollment-types.xsd"/>
<xs:import namespace="http://www.healthedge.com/connector/schema/enrollmentsparseresponse" schemaLocation="../PRIME_SERVICES_XSD/connector-enrollmentsparse/enrollment-sparse-response.xsd" />
<xs:element name="enrollment" type="EnrollmentType"/>
<xs:complexType name="EnrollmentType">
<xs:complexContent>
<xs:extension base="base:HealthRulesResourceType">
<xs:group ref="EnrollmentGroup"/>
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:simpleType name="ActionModeType">
<xs:restriction base="xs:string">
<xs:enumeration value="FULL" />
<xs:enumeration value="SPARSE" />
<xs:enumeration value="REPLACE" />
<xs:enumeration value="AUDIT" />
</xs:restriction>
</xs:simpleType>
<xs:group name="EnrollmentGroup">
<xs:sequence>
<xs:element name="transactionId" type="base:String60Type" maxOccurs="1" minOccurs="0" />
<xs:element name="actionMode" type="ActionModeType" maxOccurs="1" minOccurs="0" default="SPARSE" />
<xs:element name="asOfDate" type="xs:date" minOccurs="0" maxOccurs="1" />
<xs:element name="activate" type="xs:boolean" minOccurs="0" maxOccurs="1"/>
<xs:element name="subscriberId" type="base:String50Type" minOccurs="0" maxOccurs="1" />
<xs:element name="cascadeTerms" type="xs:boolean" default="true" minOccurs="0" maxOccurs="1" />
<xs:element name="cascadeCancels" type="xs:boolean" default="true" minOccurs="0" maxOccurs="1" />
<xs:element name="cascadeReinstate" type="xs:boolean" default="false" minOccurs="0" maxOccurs="1" />
<xs:element name="sendToWorkBasketIfExceptionsPresent" type="xs:boolean" default="true" minOccurs="0" maxOccurs="1" />
<xs:element name="requestFromHmem" type="xs:boolean" default="false" minOccurs="0" maxOccurs="1" />
<xs:element name="subscription" type="subscription:SubscriptionType" minOccurs="0" maxOccurs="1" />
<xs:element name="member" type="membership:MembershipType" minOccurs="1" maxOccurs="unbounded" />
<xs:element name="udtResultQuery" type="udtAttributes" minOccurs="0" maxOccurs="unbounded" />
<xs:element name="accountDateRanges" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="accountDateRangeListMode" type="base:ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="accountDateRange" type="AccountDateRangeType" minOccurs="0" maxOccurs="unbounded">
<xs:annotation>
<xs:documentation>
List of Account date range type for account change.
</xs:documentation>
</xs:annotation>
</xs:element>
</xs:sequence>
</xs:complexType>
</xs:element>
</xs:sequence>
</xs:group>
<xs:complexType name="EnrollmentTransitBeanType">
<xs:sequence>
<xs:element name="transaction" type="base:GenericTransactionType" minOccurs="0" maxOccurs="1" />
<xs:element name="input" type="EnrollmentType" minOccurs="0" maxOccurs="1" />
<xs:element name="response" type="sparseResp:EnrollmentResponseType" minOccurs="0" maxOccurs="1" />
<xs:element name="predicate" type="xs:boolean" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="udtAttributes">
<xs:sequence>
<xs:element name="udtName" type="xs:string" minOccurs="0" maxOccurs="1" />
<xs:element name="attributes" type="xs:string" minOccurs="0" maxOccurs="unbounded" />
</xs:sequence>
</xs:complexType>
<xs:complexType name="AccountDateRangeType">
<xs:sequence>
<xs:element name="accountHccIdentifier" type="base:AccountHccIDType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
The account through which coverage is offered.
For group business, this will be the
subscriber's employer. For individuals business,
this will be an umbrella such as Medicare,
Medicaid, etc.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="accountAsOfDate" type="xs:date" minOccurs="0" maxOccurs="1" />
<xs:element name="startValue"  type="xs:string" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
For internal purposes only. Do not use.
</xs:documentation>
</xs:annotation>
</xs:element>
</xs:sequence>
</xs:complexType>
</xs:schema>
</file>
<file path="WRAPPER_XSD/header.xsd">
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<xsd:schema xmlns:xsd="http://www.w3.org/2001/XMLSchema"
xmlns:xs="http://www.w3.org/2001/XMLSchema"
xmlns:stl="http://www.codesynthesis.com/xmlns/xsstl"
xmlns:tns="http://www.ust-global.com/schema"
xmlns:header="http://www.ust-global.com/schema/common"
targetNamespace="http://www.ust-global.com/schema/common">
<xsd:annotation>
<xsd:documentation>
Base XSD for all Wrapper XSDs developed by UST Global
</xsd:documentation>
</xsd:annotation>
<xs:element name="header">
<xs:complexType>
<xs:sequence>
<xs:element name="ediFilename" type="xs:string" />
<xs:element name="ediFileId" type="xs:string" />
<xs:element name="ediFileType" type="xs:string" />
<xs:element name="totalEdiTransaction"  type="xs:int" />
<xs:element name="totalMemberCount"  type="xs:int" />
<xs:element name="totalXMLTransactionCount"  type="xs:int" />
<xs:element name="XMLfileCreationDate" type="xs:dateTime" />
<xs:element name="correlationId" type="xs:string" />
<xs:element name="correlationIdDesc" type="xs:string" 	minOccurs="0" />
<xs:element name="senderId" type="xs:string" />
<xs:element name="receiverId" type="xs:string" />
</xs:sequence>
</xs:complexType>
</xs:element>
</xsd:schema>
</file>
<file path="WRAPPER_XSD/inbound_enrollment_request_batch - Copy.xsd">
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema"
xmlns:enroll="http://www.ust-global.com/schema/enrollmentsparse"
xmlns:membercare="http://www.healthedge.com/connector/schema/membercarereserve"
xmlns:enrollment="http://www.healthedge.com/connector/schema/enrollmentsparse"
elementFormDefault="qualified" version="4.1">
<xs:annotation>
<xs:documentation>
Wrapper Request XSD for Enrollment
</xs:documentation>
</xs:annotation>
me="totalEdiTransaction"  type="xs:int" />
<xs:element name="totalMemberCount"  type="xs:int" />
<xs:element name="totalXMLTransactionCount"  type="xs:int" />
<xs:element name="XMLfileCreationDate" type="xs:date" />
<xs:element name="correlationId" type="xs:string" />
<xs:element name="correlationIdDesc" type="xs:string" 	minOccurs="0" />
<xs:element name="senderId" type="xs:string" />
<xs:element name="receiverId" type="xs:string" />
<xs:element name="termByAbsenceContext" type="termByAbsenceContext" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<!-- Defining inbound record of submit operation -->
<xs:element name="enrollmentSparseSubmitRequestRecord" type="EnrollmentSparseSubmitRequestRecord"/>
<xs:complexType name="EnrollmentSparseSubmitRequestRecord">
<xs:sequence>
<xs:element name="ediMemberRecordSequence" type="xs:string" />
<xs:element name="actionCode" type="xs:string" />
<xs:element name="recordId" type="xs:string" minOccurs="0" />
<xs:element name="recordIdFromSource" type="xs:string" />
<xs:element name="sourceTypeIdentifier" type="xs:string" />
<xs:element name="memberIdentifier" type="xs:string" />
<xs:element name="recordIdDesc" type="xs:string"	minOccurs="0" />
<xs:element name="enrollment" type="enroll:EnrollmentType" />
<xs:element name="rayId" type="xs:string" minOccurs="0" />
<xs:element name="tenantId" type="xs:string" minOccurs="0" />
<xs:element name="referenceIdentifier" type="xs:string" minOccurs="0" />
<xs:element name="retriedReferenceIdentifier" type="xs:string" minOccurs="0" />
<xs:element ref="membercare:memberCareReserve" />
</xs:sequence>
</xs:complexType>
<!-- Defining list of inbound record of submit operation -->
<xs:element name="enrollmentSparseSubmitRequestRecordList">
<xs:complexType>
<xs:sequence>
<xs:element name="recordCount" type="xs:int" />
<xs:element ref="enrollmentSparseSubmitRequestRecord"  minOccurs="1" maxOccurs="unbounded" />
</xs:sequence>
</xs:complexType>
</xs:element>
<!-- ***** Wrapper for submit operation - End ***** -->
<!-- Defining Enrollment Inbound Element for all inbound requests -->
<xs:element name="enrollmentSparseIBRequest">
<xs:complexType>
<xs:sequence>
<xs:element ref="enrollmentSparseSubmitRequestRecordList"
minOccurs="1" maxOccurs="1" />
</xs:sequence>
</xs:complexType>
</xs:element>
<!-- Defining the root element for all Enrollment Inbound operations -->
<xs:element name="enrollmentSparseIBRequestRoot" type="EnrollmentSparseIBRequestRoot"/>
<xs:complexType name="EnrollmentSparseIBRequestRoot">
<xs:sequence>
<xs:element ref="header"/>
<xs:element ref="enrollmentSparseIBRequest" maxOccurs="unbounded"
minOccurs="1" />
</xs:sequence>
</xs:complexType>
<!-- Enrollment Adaptor Request -->
<xs:simpleType name="ConnectionModeType">
<xs:restriction base="xs:string">
<xs:enumeration value="API" />
<xs:enumeration value="QUEUE" />
</xs:restriction>
</xs:simpleType>
<xs:element name="EnrollmentAdaptorRequest" type="EnrollmentAdaptorRequest"/>
<xs:complexType name="EnrollmentAdaptorRequest">
<xs:sequence>
<xs:element ref="enrollmentSparseIBRequestRoot"  />
<xs:element name="commit" type="xs:boolean" />
<xs:element name="connectionMode" type="ConnectionModeType"/>
</xs:sequence>
</xs:complexType>
<xs:element name="EnrollmentQueueRequestRecord" type="EnrollmentQueueRequestRecord"/>
<xs:complexType name="EnrollmentQueueRequestRecord">
<xs:sequence>
<xs:element name="actionCode" type="xs:string" />
<xs:element name="recordId" type="xs:string" />
<xs:element name="enrollmentType" type="enrollment:EnrollmentType" />
<xs:element name="commit" type="xs:boolean" />
<xs:element name="connectionMode" type="ConnectionModeType"/>
</xs:sequence>
</xs:complexType>
<xs:simpleType name="termByAbsenceContext">
<xs:restriction base="xs:string">
<xs:enumeration value="TBA_APPLICABLE_ACCOUNT"/>
<xs:enumeration value="TBA_GENERATED_XML"/>
</xs:restriction>
</xs:simpleType>
</xs:schema>
</file>
<file path="WRAPPER_XSD/inbound_enrollment_request_batch.xsd">
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema"
xmlns:enroll="http://www.ust-global.com/schema/enrollmentsparse"
xmlns:membercare="http://www.healthedge.com/connector/schema/membercarereserve"
xmlns:enrollment="http://www.healthedge.com/connector/schema/enrollmentsparse"
elementFormDefault="qualified" version="4.1">
<xs:annotation>
<xs:documentation>
Wrapper Request XSD for Enrollment
</xs:documentation>
</xs:annotation>
<xs:import namespace="http://www.ust-global.com/schema/enrollmentsparse"		schemaLocation="enrollment-sparse-wrapper.xsd" />
<xs:import namespace="http://www.healthedge.com/connector/schema/membercarereserve"		schemaLocation="../PRIME_SERVICES_XSD/membercarereserve.xsd" />
<xs:import namespace="http://www.healthedge.com/connector/schema/enrollmentsparse"    schemaLocation="../PRIME_SERVICES_XSD/connector-enrollmentsparse/enrollment-sparse.xsd" />
<!-- **** Wrapper for submit operation - Start **** -->
<xs:element name="header">
<xs:complexType>
<xs:sequence>
<xs:element name="ediFilename" type="xs:string" />
<xs:element name="ediFileId" type="xs:string" />
<xs:element name="ediFileType" type="xs:string" />
<xs:element name="ediArchiveFileName" type="xs:string" />
<xs:element name="totalEdiTransaction"  type="xs:int" />
<xs:element name="totalMemberCount"  type="xs:int" />
<xs:element name="totalXMLTransactionCount"  type="xs:int" />
<xs:element name="XMLfileCreationDate" type="xs:date" />
<xs:element name="correlationId" type="xs:string" />
<xs:element name="correlationIdDesc" type="xs:string" 	minOccurs="0" />
<xs:element name="senderId" type="xs:string" />
<xs:element name="receiverId" type="xs:string" />
<xs:element name="termByAbsenceContext" type="termByAbsenceContext" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<!-- Defining inbound record of submit operation -->
<xs:element name="enrollmentSparseSubmitRequestRecord" type="EnrollmentSparseSubmitRequestRecord"/>
<xs:complexType name="EnrollmentSparseSubmitRequestRecord">
<xs:sequence>
<xs:element name="ediMemberRecordSequence" type="xs:string" />
<xs:element name="actionCode" type="xs:string" />
<xs:element name="recordId" type="xs:string" minOccurs="0" />
<xs:element name="recordIdFromSource" type="xs:string" />
<xs:element name="sourceTypeIdentifier" type="xs:string" />
<xs:element name="memberIdentifier" type="xs:string" />
<xs:element name="recordIdDesc" type="xs:string"	minOccurs="0" />
<xs:element name="enrollment" type="enroll:EnrollmentType" />
<xs:element name="rayId" type="xs:string" minOccurs="0" />
<xs:element name="tenantId" type="xs:string" minOccurs="0" />
<xs:element name="referenceIdentifier" type="xs:string" minOccurs="0" />
<xs:element name="retriedReferenceIdentifier" type="xs:string" minOccurs="0" />
<xs:element ref="membercare:memberCareReserve" />
</xs:sequence>
</xs:complexType>
<!-- Defining list of inbound record of submit operation -->
<xs:element name="enrollmentSparseSubmitRequestRecordList">
<xs:complexType>
<xs:sequence>
<xs:element name="recordCount" type="xs:int" />
<xs:element ref="enrollmentSparseSubmitRequestRecord"  minOccurs="1" maxOccurs="unbounded" />
</xs:sequence>
</xs:complexType>
</xs:element>
<!-- ***** Wrapper for submit operation - End ***** -->
<!-- Defining Enrollment Inbound Element for all inbound requests -->
<xs:element name="enrollmentSparseIBRequest">
<xs:complexType>
<xs:sequence>
<xs:element ref="enrollmentSparseSubmitRequestRecordList"
minOccurs="1" maxOccurs="1" />
</xs:sequence>
</xs:complexType>
</xs:element>
<!-- Defining the root element for all Enrollment Inbound operations -->
<xs:element name="enrollmentSparseIBRequestRoot" type="EnrollmentSparseIBRequestRoot"/>
<xs:complexType name="EnrollmentSparseIBRequestRoot">
<xs:sequence>
<xs:element ref="header"/>
<xs:element ref="enrollmentSparseIBRequest" maxOccurs="unbounded"
minOccurs="1" />
</xs:sequence>
</xs:complexType>
<!-- Enrollment Adaptor Request -->
<xs:simpleType name="ConnectionModeType">
<xs:restriction base="xs:string">
<xs:enumeration value="API" />
<xs:enumeration value="QUEUE" />
</xs:restriction>
</xs:simpleType>
<xs:element name="EnrollmentAdaptorRequest" type="EnrollmentAdaptorRequest"/>
<xs:complexType name="EnrollmentAdaptorRequest">
<xs:sequence>
<xs:element ref="enrollmentSparseIBRequestRoot"  />
<xs:element name="commit" type="xs:boolean" />
<xs:element name="connectionMode" type="ConnectionModeType"/>
</xs:sequence>
</xs:complexType>
<xs:element name="EnrollmentQueueRequestRecord" type="EnrollmentQueueRequestRecord"/>
<xs:complexType name="EnrollmentQueueRequestRecord">
<xs:sequence>
<xs:element name="actionCode" type="xs:string" />
<xs:element name="recordId" type="xs:string" />
<xs:element name="enrollmentType" type="enrollment:EnrollmentType" />
<xs:element name="commit" type="xs:boolean" />
<xs:element name="connectionMode" type="ConnectionModeType"/>
</xs:sequence>
</xs:complexType>
<xs:simpleType name="termByAbsenceContext">
<xs:restriction base="xs:string">
<xs:enumeration value="TBA_APPLICABLE_ACCOUNT"/>
<xs:enumeration value="TBA_GENERATED_XML"/>
</xs:restriction>
</xs:simpleType>
</xs:schema>
</file>
<file path="WRAPPER_XSD/inbound_enrollment_response_batch.xsd">
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns="http://www.ust-global.com/schema"
xmlns:tns="http://www.ust-global.com/schema/enrollment" targetNamespace="http://www.ust-global.com/schema/enrollment"
xmlns:resp="http://www.healthedge.com/connector/schema/enrollmentsparseresponse"
xmlns:header="http://www.ust-global.com/schema/common"
elementFormDefault="qualified" version="4.1">
<xs:annotation>
<xs:documentation>
Wrapper Response XSD for Inbound Enrollment
</xs:documentation>
</xs:annotation>
<xs:import namespace="http://www.healthedge.com/connector/schema/enrollmentsparseresponse" 	schemaLocation="../PRIME_SERVICES_XSD/connector-enrollmentsparse/enrollment-sparse-response.xsd" />
<xs:import namespace="http://www.ust-global.com/schema/common" 	schemaLocation="header.xsd" />
<!-- **** Wrapper for submit operation - Start ***** -->
<!-- Defining inbound record of submit operation -->
<xs:element name="enrollmentSparseSubmitResponseRecord">
<xs:complexType>
<xs:sequence>
<xs:element name="recordId" type="xs:string" />
<xs:element name="recordIdDesc" type="xs:string" 	minOccurs="0" />
<xs:element ref="resp:enrollmentResponse" />
</xs:sequence>
</xs:complexType>
</xs:element>
<!-- Defining list of inbound record of submit operation -->
<xs:element name="enrollmentSparseSubmitResponseRecordList">
<xs:complexType>
<xs:sequence>
<xs:element name="recordCount" type="xs:int" />
<xs:element ref="tns:enrollmentSparseSubmitResponseRecord" minOccurs="1" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<!-- ***** Wrapper for submit operation - End ***** -->
<!-- Defining Enrollment Inbound Element for all inbound responses-->
<xs:element name="enrollmentSparseIBResponse">
<xs:complexType>
<xs:sequence>
<xs:element ref="tns:enrollmentSparseSubmitResponseRecordList" minOccurs="1" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<!-- Defining the root element for all Enrollment Inbound operations-->
<xs:element name="enrollmentSparseIBResponseRoot">
<xs:complexType>
<xs:sequence>
<xs:element ref="header:header" />
<xs:element ref="tns:enrollmentSparseIBResponse" maxOccurs="unbounded" minOccurs="1" />
</xs:sequence>
</xs:complexType>
</xs:element>
</xs:schema>
</file>
<file path="WRAPPER_XSD/membership-sparse-wrapper.xsd">
<?xml version="1.0"?>
<!-- edited with XMLSpy v2014 sp1 (http://www.altova.com) by Rebecca (healthedge) -->
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns="http://www.ust-global.com/schema/membershipsparse"
xmlns:tns="http://www.ust-global.com/schema/membershipsparse"
xmlns:base="http://www.healthedge.com/connector/schema/basetypes"
xmlns:enrollment="http://www.healthedge.com/connector/schema/enrollmenttypes"
xmlns:membershipsparse="http://www.healthedge.com/connector/schema/membershipsparse"
xmlns:minput="http://www.healthedge.com/connector/schema/matchinput"
xmlns:hicn="http://www.healthedge.com/connector/schema/medicarehicn"
xmlns:cobpolicy="http://www.healthedge.com/connector/schema/cobpolicy"
xmlns:membercomplianceprogram="http://www.healthedge.com/connector/schema/membercomplianceprogram"
xmlns:memberfactors="http://www.healthedge.com/connector/schema/memberfactors"
targetNamespace="http://www.ust-global.com/schema/membershipsparse" elementFormDefault="unqualified" version="4.2">
<xs:import namespace="http://www.healthedge.com/connector/schema/basetypes" schemaLocation="../PRIME_SERVICES_XSD/connector-common-schema/base-types.xsd"/>
<xs:import namespace="http://www.healthedge.com/connector/schema/enrollmenttypes" schemaLocation="../PRIME_SERVICES_XSD/connector-enrollmentsparse/enrollment-types.xsd"/>
<xs:import namespace="http://www.healthedge.com/connector/schema/membershipsparse" schemaLocation="../PRIME_SERVICES_XSD/connector-enrollmentsparse/membership-sparse.xsd"/>
<xs:import namespace="http://www.healthedge.com/connector/schema/matchinput" schemaLocation="../PRIME_SERVICES_XSD/connector-common-schema/match-input.xsd"/>
<xs:import namespace="http://www.healthedge.com/connector/schema/medicarehicn" schemaLocation="../PRIME_SERVICES_XSD/connector-medicarehicn/MedicareHICNInfo.xsd"/>
<xs:import namespace="http://www.healthedge.com/connector/schema/cobpolicy" schemaLocation="../PRIME_SERVICES_XSD/connector-cobpolicy/cobPolicy.xsd"/>
<xs:import namespace="http://www.healthedge.com/connector/schema/membercomplianceprogram" schemaLocation="../PRIME_SERVICES_XSD/connector-membercomplianceprogram/memberComplianceProgram.xsd"/>
<xs:import namespace="http://www.healthedge.com/connector/schema/memberfactors" schemaLocation="../PRIME_SERVICES_XSD/connector-memberfactors/memberFactors.xsd"/>
<xs:element name="membership" type="MembershipType"/>
<xs:complexType name="MembershipType">
<xs:complexContent>
<xs:extension base="base:HealthRulesResourceType">
<xs:group ref="MembershipGroup"/>
</xs:extension>
</xs:complexContent>
</xs:complexType>
<xs:group name="MembershipGroup">
<xs:sequence>
<xs:element name="maintenanceTypeCode" type="membershipsparse:MaintenanceCodeType" default="CREATE" minOccurs="0" maxOccurs="1"/>
<xs:element name="maintenanceReasonCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Reference to SubscriptionCreateReason, SubscriptionAmendReason, SubscriptionTerminateReason and
SubscriptionReinstateReason codeset.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="maintenanceComment" type="base:String900Type" minOccurs="0" maxOccurs="1"/>
<xs:element name="maintenanceOverride" type="xs:boolean" default="false" minOccurs="0" maxOccurs="1"/>
<xs:element name="maintenanceOverrideResult" type="membershipsparse:OverrideResultType" minOccurs="0" maxOccurs="1"/>
<xs:element name="benefitStatusCode" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="membershipIdentifier" type="xs:long" minOccurs="0" maxOccurs="1"/>
<xs:element name="memberIsSubscriber" type="xs:boolean" default="false" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
This field determines whether the member is a subscriber or dependent. It is recommended to always pass this flag. If the member is a subscriber, set it to true. If this flag is null, it will be set to false.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="hccIdentifier" type="base:String50Type" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
The business identifier for the member. This can be generated by adding a suffix to the
subscription ID based on configured rules.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="memberInputID" type="xs:string" minOccurs="0">
<xs:annotation>
<xs:documentation>The input member ID, used for auditing and traceability.</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="receiptDate" type="xs:date" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Date on which the member's application was received from the account.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="outOfServiceArea" type="xs:boolean" default="false" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
If true, the member lives outside the service
area for their benefit plan.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="smokingStatus" type="base:SmokingStatusType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Member's smoking status.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="isHandicapped" type="xs:boolean" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>Handicapped StatusTrue for Yes. False for No
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="waivePHIClaimViewRestriction" type="xs:boolean" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Specifies if PHI claim view restriction defined
at the Health Insurance Company level applies to this member.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="payeeHccId" type="base:String50Type" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
If checks and correspondence for this member
should go to someone other than the subscriber,
the other member's
HCC ID should be placed in this field.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="isMemberInHospice" type="xs:boolean" default="false" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Indicates if Member is in hospice.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="memberMatchData" type="minput:MemberMatchInputType" minOccurs="0" maxOccurs="1"/>
<xs:element name="oldMemberData" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:group ref="membershipsparse:OldMemberDataGroup"/>
</xs:complexType>
</xs:element>
<xs:element name="individual" type="membershipsparse:Individual" minOccurs="0" maxOccurs="1"/>
<xs:element name="physicalAddress" type="membershipsparse:PhysicalAddress" minOccurs="0" maxOccurs="1"/>
<xs:element name="correspondenceAddress" type="membershipsparse:CorrespondenceAddress" minOccurs="0" maxOccurs="1"/>
<xs:element name="communicationPreferences" type="base:IndividualCommunicationPreferencesType" minOccurs="0" maxOccurs="1"/>
<xs:element name="specificCommunicationPreferences" type="base:IndividualSpecificCommunicationPreferencesType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="otherIdNumberList" type="membershipsparse:OtherIdNumberList" minOccurs="0" maxOccurs="1"/>
<xs:element name="qualifierList" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
A list of wrapper other identification numbers for the member. These can be used for links to other
systems, or to improve	claim matching.
</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="listMode" type="base:ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="qualifier"  minOccurs="0" maxOccurs="unbounded">
<xs:complexType>
<xs:sequence>
<xs:element name="qualifierName" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="qualifierValue" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="startDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="endDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
</xs:element>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="disabilityInfoForEligibility" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
If the member has extended eligibility because of a disability, thiese elements contain
information and validation about the disability.
</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:group ref="base:DisabilityInfoForEligibilityGroup"/>
</xs:complexType>
</xs:element>
<xs:element name="dependentVerification" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="listMode" type="base:ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="dependentVerification" type="base:DependentVerificationType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="physicalCharacteristics" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:group ref="base:PhysicalCharacteristicGroup"/>
</xs:complexType>
</xs:element>
<xs:element name="employmentInfo" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:group ref="base:EmploymentInfoGroup"/>
</xs:complexType>
</xs:element>
<xs:element name="dentalInfo" type="base:MemberDentalInfoType" minOccurs="0" maxOccurs="1"/>
<xs:element name="priorCoverageInfo" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:group ref="base:PriorCoverageInfoGroup"/>
</xs:complexType>
</xs:element>
<xs:element name="preExistingConditionInfo" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="listMode" type="base:ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="preExistingConditionInfo" type="base:PreExistingConditionType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="preExReduction" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
These elements can be used to override the default pre-existing condition behavior.
</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:group ref="base:PreExReductionGroup"/>
</xs:complexType>
</xs:element>
<xs:element name="otherResponsiblePersonInfo" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Information on a person other than the subscriber who is legally responsible for a member.
</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="listMode" type="base:ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="otherResponsiblePersonInfo" type="base:OtherResponsiblePersonInfoType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="memberRepresentative" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Individuals with special authorization regarding
the member.
</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="listMode" type="base:ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="authorizedIndividual" type="base:AuthorizedIndividualType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="membershipUDTList" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
User-defined terms on the member record.The
available custom fields are configured on the benefit plan.
</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="listMode" type="base:ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="membershipUDT" type="base:UDTListType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="informationAccessPermissionList" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Identifies persons with unusual PHI permissions.
</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="listMode" type="base:ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="HIPAAPermission" type="base:HIPAAPermissionType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="informationAccessRestrictionList" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Identifies persons with unusual PHI restrictions.
</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="listMode" type="base:ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="HIPAARestriction" type="base:HIPAARestrictionType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="phiAuthorizationList" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
List of PHI authorizations.
</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="listMode" type="base:ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="HIPAAAuthorization" type="base:HIPAAAuthorizationType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="ccDirectiveList" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Confidential communications directivies. These are used for situations such as endangered
members. In such a case, all communications related to the member are sent to the member,
not the subscriber.
</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="listMode" type="base:ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="confidentialCommunicationDirective" type="base:ConfidentialCommunicationDirectiveType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="subscriptionReference" type="base:ReferenceType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
The subscription of which the membership is a	part.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="individualReference" type="base:ReferenceType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
In Medicaid lines of business, it can be important to track the head of household, even
if that individual is not part of the subscription.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="relationshipToSubscriberDefinitionReference" type="membershipsparse:RelationshipToSubscriberDefinitionReferenceType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
The member's relationship to the subscriber.
This generally uses the HIPAA relationship codes, which are mapped to
member types Subscriber, Spouse, Child, Dependent, or Domestic
Partner. If the member type is	Subscriber, then memberIsSubscriber
is automatically True.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="raceOrEthnicity" type="enrollment:RaceOrEthnicityListRawType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
The member's race or ethnicity, wihch may be required by government programs.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="vipReasonCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Reference to VIPReason or HealthStatusReason
codeset.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="sexualOrientationCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Reference to Sexual Orientation codeset.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="genderIdentityCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Reference to Gender Identity codeset.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="genderAtBirthCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Reference to Gender At Birth codeset.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="pronounsCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Reference to member Pronouns codeset.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="healthStatusReasonCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Reference to HealthStatusReason codeset; the
reason this member has restricted health status.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="informationSourceCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Reference to the InformationSource codeset; the
origin site of the information that triggered the membership
request.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="attachmentSetReference" type="base:ReferenceType" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
External documents related to the membership.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="planSelectionListMode" type="base:ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="allowSamePlanMerges" type="xs:boolean" default="false" minOccurs="0">
<xs:annotation>
<xs:documentation>
Use this flag in the sparse request to determine if overlapping plan selection date spans, for the SAME plan, should be merged or if an exception should be thrown
This flag only works with planSelectionListMode = DEFAULT. The flag is ignored when listMode = REPLACE.
</xs:documentation>
</xs:annotation>
</xs:element>
<xs:element name="planSelection" minOccurs="0" maxOccurs="unbounded">
<xs:annotation>
<xs:documentation>
From MemberSelections; a list of plans in which
the member has enrolled.
</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="startDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="endDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="claimHistoryFromOtherPlans" type="membershipsparse:ClaimHistoryOtherPlansType" nillable="true" minOccurs="0" maxOccurs="1"/>
<xs:element name="enrollmentInfo" type="enrollment:EnrollmentInformationType" minOccurs="0" maxOccurs="1"/>
<xs:element name="memberTerminateReasonCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
<xs:element name="specialEnrollmentPeriodReasonCode" type="base:CodeEntryInputType" minOccurs="0" maxOccurs="1"/>
<xs:element name="waiveBenefitWaitingPeriod" type="xs:boolean" default="false" minOccurs="0" maxOccurs="1" />
<!-- START Fields not mapped to Lookup input as of now -->
<xs:element name="planDescription" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="planCode" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="classOfContractNumber" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="programCode" type="xs:string" minOccurs="0" maxOccurs="1"/>
<!-- END Fields not mapped to Lookup input as of now -->
<xs:element name="benefitPlanMatchData" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:group ref="BenefitPlanMatchGroup" minOccurs="0"/>
<xs:group ref="BenefitPlanReferenceElements" minOccurs="0"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="benefitPlanReference" type="base:IdentifierType" minOccurs="0" maxOccurs="1"/>
<xs:element name="healthCoverageMaintenanceCode" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="insuranceLineCode" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="benefitNetworks" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
From MemberPlanSelections: a list of BenefitNetworkNames
</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="benefitNetworkName" type="xs:string" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="planSelectionUDTList" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
User-defined terms on the member plan selection date range record.The
available custom fields are configurable.
</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="listMode" type="base:ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="planSelectionUDT" type="base:UDTListType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="eligibility" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
From EDI: For eligibility dates for a plan for a member.
</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="startDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
<xs:element name="endDate" type="xs:date" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
</xs:element>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="providerSelections" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
From MemberSelections; a list of provider choices
the member has made.
</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="listMode" type="base:ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="providerSelection" type="membershipsparse:ProviderSelectionType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="reportingCategory" type="membershipsparse:ReportingCategoryType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="medicareHICNlistMode" type="base:ListUpdateModeType" minOccurs="0" maxOccurs="1"/>
<xs:element name="medicareHICN" type="hicn:MedicareHICNInfoType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="cobPolicy" type="cobpolicy:COBPolicyType" minOccurs="0" maxOccurs="unbounded"/>
<xs:element name="headOfHousehold" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
In Medicaid lines of business, it can be important to track the head of household, even
if that individual is not part of the subscription.
</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="relatedMember" type="minput:MemberMatchInputType" minOccurs="0" maxOccurs="1"/>
<xs:element name="relatedMembers" type="membershipsparse:RelatedMembersType" minOccurs="0" maxOccurs="1"/>
<xs:element name="externalMemberInformation" type="membershipsparse:ExternalMemberInformationType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="memberComplianceProgram" type="membercomplianceprogram:MemberComplianceProgType" minOccurs="0" maxOccurs="1"/>
<xs:element name="enrollmentMemberFactors" type="memberfactors:MemberFactorsCoreType" minOccurs="0" maxOccurs="1"/>
<xs:element name="alternatePaymentContact" minOccurs="0" maxOccurs="1">
<xs:annotation>
<xs:documentation>
Alternate Payment Recipient name and address.
</xs:documentation>
</xs:annotation>
<xs:complexType>
<xs:sequence>
<xs:element name="recipientName" type="base:PersonNameType" minOccurs="0" maxOccurs="1"/>
<xs:element name="recipientAddress" type="base:PostalAddressType" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="claimReviewList" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="listMode" type="base:ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="claimReview" type="enrollment:MemberClaimReviewType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="manualReviewList" minOccurs="0" maxOccurs="1">
<xs:complexType>
<xs:sequence>
<xs:element name="listMode" type="base:ListActionType" minOccurs="0" maxOccurs="1"/>
<xs:element name="manualReview" type="enrollment:MemberManualReviewType" minOccurs="0" maxOccurs="unbounded"/>
</xs:sequence>
</xs:complexType>
</xs:element>
</xs:sequence>
</xs:group>
<xs:group name="BenefitPlanMatchGroup">
<xs:sequence>
<xs:element name="parameter" minOccurs="0" maxOccurs="unbounded">
<xs:complexType>
<xs:group ref="BenefitPlanIdentificationParameter"/>
</xs:complexType>
</xs:element>
</xs:sequence>
</xs:group>
<xs:group name="BenefitPlanIdentificationParameter">
<xs:sequence>
<xs:element name="name" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="value" type="xs:string" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
<xs:group name="BenefitPlanReferenceElements">
<xs:sequence>
<xs:element name="benefitPlanHccId" type="xs:string" minOccurs="0" maxOccurs="1"/>
<xs:element name="benefitPlanName" type="xs:string" minOccurs="0" maxOccurs="1"/>
</xs:sequence>
</xs:group>
</xs:schema>
</file>
<file path="wsdl/CodeEntryLookupCore.wsdl">
<?xml version="1.0" encoding="UTF-8"?>
<definitions xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tns="http://healthedge.com"
xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns="http://schemas.xmlsoap.org/wsdl/"
xmlns:codeentrylookup="http://www.healthedge.com/connector/schema/codeentrylookup" targetNamespace="http://healthedge.com">
<types>
<xsd:schema>
<xsd:import namespace="http://www.healthedge.com/connector/schema/codeentrylookup" schemaLocation="../PRIME_SERVICES_XSD/connector-codeentrylookup/codeentrylookup.xsd"/>
</xsd:schema>
<xsd:schema>
<xsd:import namespace="http://www.healthedge.com/connector/schema/basetypes" schemaLocation="../PRIME_SERVICES_XSD/connector-common-schema/base-types.xsd"/>
</xsd:schema>
<xsd:schema>
<xsd:import namespace="http://www.healthedge.com/connector/schema/matchinput" schemaLocation="../PRIME_SERVICES_XSD/connector-common-schema/match-input.xsd" />
</xsd:schema>
</types>
<message name="codeEntryLookupCriteriaInput">
<part name="input" element="codeentrylookup:codeEntryLookupCriteria"/>
</message>
<message name="codeEntryLookupListResponseOutput">
<part name="output" element="codeentrylookup:codeEntryLookupListResponse"/>
</message>
<message name="codeEntryLookupResponseOutput">
<part name="output" element="codeentrylookup:codeEntryLookupResponse"/>
</message>
<portType name="CodeEntryLookupPortType">
<!--<operation name="getAll">
<input message="tns:codeEntryLookupCriteriaInput"/>
<output message="tns:codeEntryLookupListResponseOutput"/>
</operation>-->
<operation name="get">
<input message="tns:codeEntryLookupCriteriaInput"/>
<output message="tns:codeEntryLookupResponseOutput"/>
</operation>
</portType>
<binding name="CodeEntryLookupBinding" type="tns:CodeEntryLookupPortType">
<soap:binding transport="http://schemas.xmlsoap.org/soap/http" style="document"/>
<!--<operation name="getAll">
<soap:operation soapAction="http://healthedge.com/getAll"/>
<input>
<soap:body use="literal"/>
</input>
<output>
<soap:body use="literal"/>
</output>
</operation>-->
<operation name="get">
<soap:operation soapAction="http://healthedge.com/get"/>
<input>
<soap:body use="literal"/>
</input>
<output>
<soap:body use="literal"/>
</output>
</operation>
</binding>
<service name="CodeEntryLookup">
<port name="CodeEntryLookupPort" binding="tns:CodeEntryLookupBinding">
<soap:address location="http://localhost:7001/cprime-integration-webservices/CodeEntryLookup"/>
</port>
</service>
</definitions>
</file>
<file path="wsdl/EnrollmentSparseCore.wsdl">
<?xml version="1.0" encoding="UTF-8"?>
<definitions xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tns="http://healthedge.com" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns="http://schemas.xmlsoap.org/wsdl/"
xmlns:enroll="http://www.healthedge.com/connector/schema/enrollmentsparse" xmlns:resp="http://www.healthedge.com/connector/schema/enrollmentsparseresponse"
targetNamespace="http://healthedge.com">
<types>
<xsd:schema>
<xsd:import namespace="http://www.healthedge.com/connector/schema/enrollmentsparse" schemaLocation="../PRIME_SERVICES_XSD/connector-enrollmentsparse/enrollment-sparse.xsd" />
</xsd:schema>
<xsd:schema>
<xsd:import namespace="http://www.healthedge.com/connector/schema/subscriptionsparse" schemaLocation="../PRIME_SERVICES_XSD/connector-enrollmentsparse/subscription-sparse.xsd" />
</xsd:schema>
<xsd:schema>
<xsd:import namespace="http://www.healthedge.com/connector/schema/membershipsparse" schemaLocation="../PRIME_SERVICES_XSD/connector-enrollmentsparse/membership-sparse.xsd" />
</xsd:schema>
<xsd:schema>
<xsd:import namespace="http://www.healthedge.com/connector/schema/basetypes" schemaLocation="../PRIME_SERVICES_XSD/connector-common-schema/base-types.xsd" />
</xsd:schema>
<xsd:schema>
<xsd:import namespace="http://www.codesynthesis.com/xmlns/xsstl" schemaLocation="../PRIME_SERVICES_XSD/connector-common-schema/iso3166-country-code.xsd" />
</xsd:schema>
<xsd:schema>
<xsd:import namespace="http://www.codesynthesis.com/xmlns/xsstl" schemaLocation="../PRIME_SERVICES_XSD/connector-common-schema/us-state-code.xsd" />
</xsd:schema>
<xsd:schema>
<xsd:import namespace="http://www.codesynthesis.com/xmlns/xsstl" schemaLocation="../PRIME_SERVICES_XSD/connector-common-schema/phone-number.xsd" />
</xsd:schema>
<xsd:schema>
<xsd:import namespace="http://www.healthedge.com/connector/schema/enrollmentsparseresponse" schemaLocation="../PRIME_SERVICES_XSD/connector-enrollmentsparse/enrollment-sparse-response.xsd" />
</xsd:schema>
<xsd:schema>
<xsd:import namespace="http://www.healthedge.com/connector/schema/matchinput" schemaLocation="../PRIME_SERVICES_XSD/connector-common-schema/match-input.xsd" />
</xsd:schema>
<xsd:schema>
<xsd:import namespace="http://www.healthedge.com/connector/schema/medicarehicn" schemaLocation="../PRIME_SERVICES_XSD/connector-medicarehicn/MedicareHICNInfo.xsd"/>
</xsd:schema>
<xsd:schema>
<xsd:import namespace="http://www.healthedge.com/connector/schema/cobpolicy" schemaLocation="../PRIME_SERVICES_XSD/connector-cobpolicy/cobPolicy.xsd"/>
</xsd:schema>
<xsd:schema>
<xsd:import namespace="http://www.healthedge.com/connector/schema/subsidy" schemaLocation="../PRIME_SERVICES_XSD/connector-subsidy/subsidies.xsd"/>
</xsd:schema>
<xsd:schema>
<xsd:import namespace="http://www.healthedge.com/connector/schema/memberfactors" schemaLocation="../PRIME_SERVICES_XSD/connector-memberfactors/memberFactors.xsd"/>
</xsd:schema>
</types>
<message name="enrollmentSparseInput">
<part name="enrollInput" element="enroll:enrollment" />
</message>
<message name="enrollmentSparseResponseOutput">
<part name="enrollOutput" element="resp:enrollmentResponse" />
</message>
<portType name="EnrollmentSparsePortType">
<operation name="submit">
<input message="tns:enrollmentSparseInput" />
<output message="tns:enrollmentSparseResponseOutput" />
</operation>
</portType>
<binding name="EnrollmentSparseBinding" type="tns:EnrollmentSparsePortType">
<soap:binding transport="http://schemas.xmlsoap.org/soap/http"
style="document" />
<operation name="submit">
<soap:operation soapAction="http://healthedge.com/submit" />
<input>
<soap:body use="literal" />
</input>
<output>
<soap:body use="literal" />
</output>
</operation>
</binding>
<service name="EnrollmentSparse">
<port name="EnrollmentSparsePort" binding="tns:EnrollmentSparseBinding">
<soap:address
location="http://localhost:7001/cprime-integration-webservices/EnrollmentSparse" />
</port>
</service>
</definitions>
</file>
<file path="wsdl/EnrollmentSparseLookup.wsdl">
<?xml version="1.0" encoding="UTF-8"?>
<definitions 	xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/"
xmlns:tns="http://healthedge.com"
xmlns:xsd="http://www.w3.org/2001/XMLSchema"
xmlns="http://schemas.xmlsoap.org/wsdl/"
xmlns:lookup="http://www.healthedge.com/connector/schema/enrollmentsparselookup"
targetNamespace="http://healthedge.com">
<types>
<xsd:schema>
<xsd:import namespace="http://www.healthedge.com/connector/schema/enrollmentsparselookup" schemaLocation="../PRIME_SERVICES_XSD/connector-enrollmentsparse/enrollment-sparse-lookup.xsd"/>
</xsd:schema>
<xsd:schema>
<xsd:import namespace="http://www.healthedge.com/connector/schema/basetypes" schemaLocation="../PRIME_SERVICES_XSD/connector-common-schema/base-types.xsd" />
</xsd:schema>
<xsd:schema>
<xsd:import namespace="http://www.healthedge.com/connector/schema/matchinput" schemaLocation="../PRIME_SERVICES_XSD/connector-common-schema/match-input.xsd" />
</xsd:schema>
</types>
<message name="enrollmentSparseLookupCriteriaInput">
<part name="input" element="lookup:enrollmentLookupCriteria"/>
</message>
<message name="enrollmentSparseLookupResponseOutput">
<part name="output" element="lookup:enrollmentSparseLookupResponse"/>
</message>
<portType name="EnrollmentSparseLookupPortType">
<operation name="get">
<input message="tns:enrollmentSparseLookupCriteriaInput"/>
<output message="tns:enrollmentSparseLookupResponseOutput"/>
</operation>
</portType>
<binding name="EnrollmentSparseLookupBinding" type="tns:EnrollmentSparseLookupPortType">
<soap:binding transport="http://schemas.xmlsoap.org/soap/http" style="document"/>
<operation name="get">
<soap:operation soapAction="http://healthedge.com/get"/>
<input>
<soap:body use="literal"/>
</input>
<output>
<soap:body use="literal"/>
</output>
</operation>
</binding>
<service name="EnrollmentSparseLookup">
<port name="EnrollmentSparseLookupPort" binding="tns:EnrollmentSparseLookupBinding">
<soap:address location="http://localhost:7001/cprime-integration-webservices/EnrollmentSparseLookup"/>
</port>
</service>
</definitions>
</file>
<file path="wsdl/PractitionerLookupCore.wsdl">
<?xml version="1.0" encoding="UTF-8"?>
<definitions    xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/"
xmlns:tns="http://healthedge.com"
xmlns:xsd="http://www.w3.org/2001/XMLSchema"
xmlns="http://schemas.xmlsoap.org/wsdl/"
xmlns:providerlookup="http://www.healthedge.com/connector/schema/providerlookup"
targetNamespace="http://healthedge.com">
<types>
<xsd:schema>
<xsd:import namespace="http://www.healthedge.com/connector/schema/providerlookup" schemaLocation="../PRIME_SERVICES_XSD/connector-providerlookup/providerlookup.xsd"/>
</xsd:schema>
<xsd:schema>
<xsd:import namespace="http://www.healthedge.com/connector/schema/basetypes" schemaLocation="../PRIME_SERVICES_XSD/connector-common-schema/base-types.xsd" />
</xsd:schema>
<xsd:schema>
<xsd:import namespace="http://www.healthedge.com/connector/schema/matchinput" schemaLocation="../PRIME_SERVICES_XSD/connector-common-schema/match-input.xsd" />
</xsd:schema>
</types>
<message name="practitionerLookupCriteriaInput">
<part name="input" element="providerlookup:practitionerLookupCriteria"/>
</message>
<message name="practitionerLookupListResponseOutput">
<part name="output" element="providerlookup:practitionerLookupListResponse"/>
</message>
<portType name="PractitionerLookupPortType">
<operation name="getAll">
<input message="tns:practitionerLookupCriteriaInput"/>
<output message="tns:practitionerLookupListResponseOutput"/>
</operation>
</portType>
<binding name="PractitionerLookupBinding" type="tns:PractitionerLookupPortType">
<soap:binding transport="http://schemas.xmlsoap.org/soap/http" style="document"/>
<operation name="getAll">
<soap:operation soapAction="http://healthedge.com/getAll"/>
<input>
<soap:body use="literal"/>
</input>
<output>
<soap:body use="literal"/>
</output>
</operation>
</binding>
<service name="PractitionerLookup">
<port name="PractitionerLookupPort" binding="tns:PractitionerLookupBinding">
<soap:address location="http://localhost:7001/cprime-integration-webservices/PractitionerLookup"/>
</port>
</service>
</definitions>
</file>
<file path="wsdl/SupplierLocationLookup.wsdl">
<?xml version="1.0" encoding="UTF-8"?>
<definitions xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/"
xmlns:tns="http://healthedge.com"
xmlns:xsd="http://www.w3.org/2001/XMLSchema"
xmlns="http://schemas.xmlsoap.org/wsdl/"
xmlns:supplierlocation="http://www.healthedge.com/connector/schema/supplierlocationlookup"
targetNamespace="http://healthedge.com">
<types>
<xsd:schema>
<xsd:import namespace="http://www.healthedge.com/connector/schema/supplierlocationlookup" schemaLocation="../PRIME_SERVICES_XSD/connector-supplierlocationlookup/supplierlocationlookup.xsd" />
</xsd:schema>
<xsd:schema>
<xsd:import namespace="http://www.healthedge.com/connector/schema/basetypes" schemaLocation="../PRIME_SERVICES_XSD/connector-common-schema/base-types.xsd" />
</xsd:schema>
<xsd:schema>
<xsd:import namespace="http://www.codesynthesis.com/xmlns/xsstl" schemaLocation="../PRIME_SERVICES_XSD/connector-common-schema/iso3166-country-code.xsd" />
</xsd:schema>
<xsd:schema>
<xsd:import namespace="http://www.codesynthesis.com/xmlns/xsstl" schemaLocation="../PRIME_SERVICES_XSD/connector-common-schema/us-state-code.xsd" />
</xsd:schema>
<xsd:schema>
<xsd:import namespace="http://www.codesynthesis.com/xmlns/xsstl" schemaLocation="../PRIME_SERVICES_XSD/connector-common-schema/phone-number.xsd" />
</xsd:schema>
</types>
<message name="supplierLocationLookupInput">
<part name="input" element="supplierlocation:supplierLocationLookupInput" />
</message>
<message name="supplierLocationLookupResponseOutput">
<part name="output" element="supplierlocation:supplierLocationLookupResponse" />
</message>
<portType name="SupplierLocationLookupPortType">
<operation name="get">
<input message="tns:supplierLocationLookupInput" />
<output message="tns:supplierLocationLookupResponseOutput" />
</operation>
</portType>
<binding name="SupplierLocationLookupBinding" type="tns:SupplierLocationLookupPortType">
<soap:binding transport="http://schemas.xmlsoap.org/soap/http"
style="document" />
<operation name="get">
<soap:operation soapAction="http://healthedge.com/get" />
<input>
<soap:body use="literal" />
</input>
<output>
<soap:body use="literal" />
</output>
</operation>
</binding>
<service name="SupplierLocationLookup">
<port name="SupplierLocationLookupPort" binding="tns:SupplierLocationLookupBinding">
<soap:address
location="http://localhost:7001/cprime-integration-webservices/SupplierLocationLookup" />
</port>
</service>
</definitions>
</file>
<file path="wsdl/SupplierLookupCore.wsdl">
<?xml version="1.0" encoding="UTF-8"?>
<definitions    xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/"
xmlns:tns="http://healthedge.com"
xmlns:xsd="http://www.w3.org/2001/XMLSchema"
xmlns="http://schemas.xmlsoap.org/wsdl/"
xmlns:providerlookup="http://www.healthedge.com/connector/schema/providerlookup"
targetNamespace="http://healthedge.com">
<types>
<xsd:schema>
<xsd:import namespace="http://www.healthedge.com/connector/schema/providerlookup" schemaLocation="../PRIME_SERVICES_XSD/connector-providerlookup/providerlookup.xsd"/>
</xsd:schema>
<xsd:schema>
<xsd:import namespace="http://www.healthedge.com/connector/schema/basetypes" schemaLocation="../PRIME_SERVICES_XSD/connector-common-schema/base-types.xsd" />
</xsd:schema>
<xsd:schema>
<xsd:import namespace="http://www.healthedge.com/connector/schema/matchinput" schemaLocation="../PRIME_SERVICES_XSD/connector-common-schema/match-input.xsd" />
</xsd:schema>
</types>
<message name="supplierLookupCriteriaInput">
<part name="input" element="providerlookup:supplierLookupCriteria"/>
</message>
<message name="supplierLookupListResponseOutput">
<part name="output" element="providerlookup:supplierLookupListResponse"/>
</message>
<portType name="SupplierLookupPortType">
<operation name="getAll">
<input message="tns:supplierLookupCriteriaInput"/>
<output message="tns:supplierLookupListResponseOutput"/>
</operation>
</portType>
<binding name="SupplierLookupBinding" type="tns:SupplierLookupPortType">
<soap:binding transport="http://schemas.xmlsoap.org/soap/http" style="document"/>
<operation name="getAll">
<soap:operation soapAction="http://healthedge.com/getAll"/>
<input>
<soap:body use="literal"/>
</input>
<output>
<soap:body use="literal"/>
</output>
</operation>
</binding>
<service name="SupplierLookup">
<port name="SupplierLookupPort" binding="tns:SupplierLookupBinding">
<soap:address location="http://localhost:7001/cprime-integration-webservices/SupplierLookup"/>
</port>
</service>
</definitions>
</file>