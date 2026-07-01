# Repository Structure

```text
ultrashader-v/
├── BA Files/
│   ├── bundles/
│   │   ├── Advantasure_IB.md
│   │   ├── Authorization_IB.md
│   │   ├── Claims_IB.md
│   │   ├── Claims_OB.md
│   │   ├── EDI_275_Attachment_Service.md
│   │   ├── Encounter_IB.md
│   │   ├── Enrollment_IB.md
│   │   ├── Enrollment_OB.md
│   │   ├── Payment_IB.md
│   │   ├── Payment_OB.md
│   │   ├── PULSE.md
│   │   ├── QA_Automation.md
│   │   ├── Repository.md
│   │   ├── Repricer_OB-IB.md
│   │   ├── Secondary_Editing_IB.md
│   │   └── Secondary_Editing_OB.md
│   ├── INDEX.md
│   └── optimized/
│       ├── Advantasure IB/
│       │   └── V26.2.0.0/
│       │       ├── EdifecsProduct_MappingSpec_Enrollment_DFF_-_XML_Conversion_V3.5__Appendix.csv
│       │       ├── EdifecsProduct_MappingSpec_Enrollment_DFF_-_XML_Conversion_V3.5__Cover_Page.csv
│       │       ├── EdifecsProduct_MappingSpec_Enrollment_DFF_-_XML_Conversion_V3.5__Cross_Walk.csv
│       │       ├── EdifecsProduct_MappingSpec_Enrollment_DFF_-_XML_Conversion_V3.5__Header_Logic.csv
│       │       ├── EdifecsProduct_MappingSpec_Enrollment_DFF_-_XML_Conversion_V3.5__Mapping_Spec.csv
│       │       ├── EdifecsProduct_MappingSpec_Enrollment_DFF_-_XML_Conversion_V3.5__Sheet1.csv
│       │       ├── EdifecsProduct_MappingSpec_Enrollment_DFF_-_XML_Conversion_V3.5__Transactions.csv
│       │       └── EdifecsProduct_MappingSpec_Enrollment_DFF_-_XML_Conversion_V3.5__Version_History.csv
│       ├── Authorization IB/
│       │   ├── EDI 278/
│       │   │   └── V26.1.1/
│       │   │       ├── 278_AuthorizationIB_Audit_mapping__Audit_events.csv
│       │   │       ├── 278_AuthorizationIB_Audit_mapping__Cover_sheet.csv
│       │   │       ├── 278_AuthorizationIB_Audit_mapping__Edifecs_Json_Mapping.csv
│       │   │       ├── 278_AuthorizationIB_Audit_mapping__Sample_Audit.csv
│       │   │       ├── EDIFECS_Product_MappingSpec_AuthorizationInbound_278_EDI_to_XML_Conversion_V1.2__Auth_Mapping.csv
│       │   │       ├── EDIFECS_Product_MappingSpec_AuthorizationInbound_278_EDI_to_XML_Conversion_V1.2__conversional_copy.csv
│       │   │       ├── EDIFECS_Product_MappingSpec_AuthorizationInbound_278_EDI_to_XML_Conversion_V1.2__Cover_Sheet.csv
│       │   │       ├── EDIFECS_Product_MappingSpec_AuthorizationInbound_278_EDI_to_XML_Conversion_V1.2__Default_Values.csv
│       │   │       └── EDIFECS_Product_MappingSpec_AuthorizationInbound_278_EDI_to_XML_Conversion_V1.2__Version_History.csv
│       │   └── Symphony Auth/
│       │       └── V26.1.1/
│       │           ├── EDIFECSProduct_Symphony_Auth_IB_Audit_mapping_XML_to_XML_Conversion_V1.0__Audit_events.csv
│       │           ├── EDIFECSProduct_Symphony_Auth_IB_Audit_mapping_XML_to_XML_Conversion_V1.0__Cover_sheet.csv
│       │           ├── EDIFECSProduct_Symphony_Auth_IB_Audit_mapping_XML_to_XML_Conversion_V1.0__Edifecs_Json_Mapping.csv
│       │           └── EDIFECSProduct_Symphony_Auth_IB_Audit_mapping_XML_to_XML_Conversion_V1.0__Sample_Audit.csv
│       ├── Claims IB/
│       │   ├── Audit_JSON_Mapping__Audit_Events.csv
│       │   ├── Audit_JSON_Mapping__Cover_Page.csv
│       │   ├── Audit_JSON_Mapping__JSON_Mapping.csv
│       │   ├── EDIFECSProduct_277CA_MappingSpec_Tablestructure_V1.0__277CA_Mapping.csv
│       │   ├── EDIFECSProduct_277CA_MappingSpec_Tablestructure_V1.0__CoverPage.csv
│       │   ├── EDIFECSProduct_277CA_MappingSpec_Tablestructure_V1.0__IB_to_Table_mapping.csv
│       │   ├── EDIFECSProduct_277CA_MappingSpec_Tablestructure_V1.0__Table_Layout.csv
│       │   ├── EDIFECSProduct_277CA_MappingSpec_Tablestructure_V1.0__VersionHistory.csv
│       │   ├── EDIFECSProduct_277CA_MappingSpec_Tablestructure_V1.0__Xwalk.csv
│       │   ├── EdifecsProduct_MappingSpec_InboundClaims_837_EDI_to_XMLConversion_V2.3__837I_Base_Mapping.csv
│       │   ├── EdifecsProduct_MappingSpec_InboundClaims_837_EDI_to_XMLConversion_V2.3__837I_Mapping_Default_Value_.csv
│       │   ├── EdifecsProduct_MappingSpec_InboundClaims_837_EDI_to_XMLConversion_V2.3__837P_Base_Mapping_Default_Va.csv
│       │   ├── EdifecsProduct_MappingSpec_InboundClaims_837_EDI_to_XMLConversion_V2.3__837P_Base_Mapping.csv
│       │   ├── EdifecsProduct_MappingSpec_InboundClaims_837_EDI_to_XMLConversion_V2.3__Cover_Page.csv
│       │   ├── EdifecsProduct_MappingSpec_InboundClaims_837_EDI_to_XMLConversion_V2.3__Crosswalk.csv
│       │   ├── EdifecsProduct_MappingSpec_InboundClaims_837_EDI_to_XMLConversion_V2.3__Sheet1.csv
│       │   └── EdifecsProduct_MappingSpec_InboundClaims_837_EDI_to_XMLConversion_V2.3__Version_History.csv
│       ├── Claims OB/
│       │   ├── 26.1/
│       │   │   ├── EdifecsProduct_Mappingspec_OutboundClaims_Encounters_837IP_XML_to_EDIConversion_V0.2__Additional_Dis.csv
│       │   │   ├── EdifecsProduct_Mappingspec_OutboundClaims_Encounters_837IP_XML_to_EDIConversion_V0.2__Cover_Page.csv
│       │   │   ├── EdifecsProduct_Mappingspec_OutboundClaims_Encounters_837IP_XML_to_EDIConversion_V0.2__Type_Instituti.csv
│       │   │   ├── EdifecsProduct_Mappingspec_OutboundClaims_Encounters_837IP_XML_to_EDIConversion_V0.2__Type_Professio.csv
│       │   │   └── EdifecsProduct_Mappingspec_OutboundClaims_Encounters_837IP_XML_to_EDIConversion_V0.2__Version_Histor.csv
│       │   ├── Clover PDM Rosters/
│       │   │   ├── Cooper/
│       │   │   │   ├── Archive/
│       │   │   │   │   ├── Clover_Roster_Mapping_Cooper__Inbound_Outbound_File_Req_s.csv
│       │   │   │   │   ├── Clover_Roster_Mapping_Cooper__Layout_New_Provider_.csv
│       │   │   │   │   ├── Clover_Roster_Mapping_Cooper__Mapping_New_Provider_.csv
│       │   │   │   │   ├── Clover_Roster_Mapping_Cooper__Taxonomy_Crosswalk.csv
│       │   │   │   │   ├── Clover_Roster_Mapping_Cooper_Edifecs_V1.0__Inbound_Outbound_File_Req_s.csv
│       │   │   │   │   ├── Clover_Roster_Mapping_Cooper_Edifecs_V1.0__Layout_New_Provider_.csv
│       │   │   │   │   ├── Clover_Roster_Mapping_Cooper_Edifecs_V1.0__Mapping_New_Provider_.csv
│       │   │   │   │   ├── Clover_Roster_Mapping_Cooper_Edifecs_V1.0__Taxonomy_Crosswalk.csv
│       │   │   │   │   ├── Clover_Roster_Mapping_Cooper_Edifecs_V1.1__Inbound_Outbound_File_Req_s.csv
│       │   │   │   │   ├── Clover_Roster_Mapping_Cooper_Edifecs_V1.1__Layout_New_Provider_.csv
│       │   │   │   │   ├── Clover_Roster_Mapping_Cooper_Edifecs_V1.1__Mapping_New_Provider_.csv
│       │   │   │   │   ├── Clover_Roster_Mapping_Cooper_Edifecs_V1.1__Revision_History.csv
│       │   │   │   │   ├── Clover_Roster_Mapping_Cooper_Edifecs_V1.1__State_Code_Crosswalk.csv
│       │   │   │   │   └── Clover_Roster_Mapping_Cooper_Edifecs_V1.1__Taxonomy_Crosswalk.csv
│       │   │   │   ├── Clover_Roster_Mapping_Cooper_Edifecs_V2.0__Inbound_Outbound_File_Req_s.csv
│       │   │   │   ├── Clover_Roster_Mapping_Cooper_Edifecs_V2.0__Layout_New_Provider_.csv
│       │   │   │   ├── Clover_Roster_Mapping_Cooper_Edifecs_V2.0__Mapping_New_Provider_.csv
│       │   │   │   ├── Clover_Roster_Mapping_Cooper_Edifecs_V2.0__Revision_History.csv
│       │   │   │   ├── Clover_Roster_Mapping_Cooper_Edifecs_V2.0__State_Code_Crosswalk.csv
│       │   │   │   ├── Clover_Roster_Mapping_Cooper_Edifecs_V2.0__Taxonomy_Crosswalk.csv
│       │   │   │   └── Sample Input/
│       │   │   │       ├── 3326755_Cooper__New_Provider_Enrollment.csv
│       │   │   │       ├── 3326755_Cooper__Provider_Change.csv
│       │   │   │       ├── 3326755_Cooper__Provider_Terms.csv
│       │   │   │       ├── 3339316_Cooper__New_Provider_Enrollment.csv
│       │   │   │       ├── 3339316_Cooper__Provider_Change.csv
│       │   │   │       └── 3339316_Cooper__Provider_Terms.csv
│       │   │   ├── Delegated Roster - Standard Layout/
│       │   │   │   ├── Archive/
│       │   │   │   │   ├── Delegated_Roster_Standard_Layout__Deleg_Pre-Validation_Mapping.csv
│       │   │   │   │   ├── Delegated_Roster_Standard_Layout__Deleg._Roster_Template_Sample.csv
│       │   │   │   │   ├── Delegated_Roster_Standard_Layout__File_Requirements.csv
│       │   │   │   │   ├── Delegated_Roster_Standard_Layout__Taxonomy_Crosswalk.csv
│       │   │   │   │   ├── Delegated_Roster_Standard_Layout_EdifecsV1.0__Deleg_Pre-Validation_Mapping.csv
│       │   │   │   │   ├── Delegated_Roster_Standard_Layout_EdifecsV1.0__Deleg._Roster_Template_Sample.csv
│       │   │   │   │   ├── Delegated_Roster_Standard_Layout_EdifecsV1.0__File_Requirements.csv
│       │   │   │   │   ├── Delegated_Roster_Standard_Layout_EdifecsV1.0__State_Code_Crosswalk.csv
│       │   │   │   │   └── Delegated_Roster_Standard_Layout_EdifecsV1.0__Taxonomy_Crosswalk.csv
│       │   │   │   ├── Delegated_Roster_Standard_Layout_EdifecsV2.0__Deleg_Pre-Validation_Mapping.csv
│       │   │   │   ├── Delegated_Roster_Standard_Layout_EdifecsV2.0__Deleg._Roster_Template_Sample.csv
│       │   │   │   ├── Delegated_Roster_Standard_Layout_EdifecsV2.0__File_Requirements.csv
│       │   │   │   ├── Delegated_Roster_Standard_Layout_EdifecsV2.0__Revision_History.csv
│       │   │   │   ├── Delegated_Roster_Standard_Layout_EdifecsV2.0__State_Code_Crosswalk.csv
│       │   │   │   ├── Delegated_Roster_Standard_Layout_EdifecsV2.0__Taxonomy_Crosswalk.csv
│       │   │   │   └── Delegated_Sample__Delegated_Standard_Layout.csv
│       │   │   ├── Minute Clinic/
│       │   │   │   ├── Archive/
│       │   │   │   │   ├── Clover_Roaster_Mapping_Minute_clinic_v01__Core_Providers_-_PreValidation.csv
│       │   │   │   │   ├── Clover_Roaster_Mapping_Minute_clinic_v01__Core_Providers_Mapping.csv
│       │   │   │   │   ├── Clover_Roaster_Mapping_Minute_clinic_v01__I_Network_Layout.csv
│       │   │   │   │   ├── Clover_Roaster_Mapping_Minute_clinic_v01__Revision_History.csv
│       │   │   │   │   ├── Clover_Roaster_Mapping_Minute_clinic_v01__Virtual_Providers_Mapping.csv
│       │   │   │   │   ├── Clover_Roaster_Mapping_Minute_clinic_v01__Virtual_Providers-Prevalida.csv
│       │   │   │   │   ├── Clover_Roster_Mapping_Minute_Clinic__Inbound_Outbound_File_Req_s.csv
│       │   │   │   │   ├── Clover_Roster_Mapping_Minute_Clinic__Layout.csv
│       │   │   │   │   ├── Clover_Roster_Mapping_Minute_Clinic__Mapping.csv
│       │   │   │   │   ├── Clover_Roster_Mapping_Minute_Clinic__Open_Items.csv
│       │   │   │   │   ├── Clover_Roster_Mapping_Minute_Clinic_Edifecs_V1.0__Inbound_Outbound_File_Req_s.csv
│       │   │   │   │   ├── Clover_Roster_Mapping_Minute_Clinic_Edifecs_V1.0__Layout.csv
│       │   │   │   │   ├── Clover_Roster_Mapping_Minute_Clinic_Edifecs_V1.0__Mapping.csv
│       │   │   │   │   └── Clover_Roster_Mapping_Minute_Clinic_Edifecs_V1.0__Open_Items.csv
│       │   │   │   ├── Clover_Roaster_Mapping_Minute_clinic_v1.0__Core_Providers_-_PreValidation.csv
│       │   │   │   ├── Clover_Roaster_Mapping_Minute_clinic_v1.0__Core_Providers_Mapping.csv
│       │   │   │   ├── Clover_Roaster_Mapping_Minute_clinic_v1.0__File_Requirements.csv
│       │   │   │   ├── Clover_Roaster_Mapping_Minute_clinic_v1.0__I_Network_Layout.csv
│       │   │   │   ├── Clover_Roaster_Mapping_Minute_clinic_v1.0__Revision_History.csv
│       │   │   │   ├── Clover_Roaster_Mapping_Minute_clinic_v1.0__State_Code_Crosswalk.csv
│       │   │   │   ├── Clover_Roaster_Mapping_Minute_clinic_v1.0__Virtual_Providers_Mapping.csv
│       │   │   │   ├── Clover_Roaster_Mapping_Minute_clinic_v1.0__Virtual_Providers-Prevalida.csv
│       │   │   │   ├── Clover_Roaster_Mapping_Minute_clinic_v2.0__Core_Providers_-_PreValidation.csv
│       │   │   │   ├── Clover_Roaster_Mapping_Minute_clinic_v2.0__Core_Providers_Mapping.csv
│       │   │   │   ├── Clover_Roaster_Mapping_Minute_clinic_v2.0__File_Requirements.csv
│       │   │   │   ├── Clover_Roaster_Mapping_Minute_clinic_v2.0__I_Network_Layout.csv
│       │   │   │   ├── Clover_Roaster_Mapping_Minute_clinic_v2.0__Revision_History.csv
│       │   │   │   ├── Clover_Roaster_Mapping_Minute_clinic_v2.0__State_Code_Crosswalk.csv
│       │   │   │   ├── Clover_Roaster_Mapping_Minute_clinic_v2.0__Virtual_Providers_Mapping.csv
│       │   │   │   ├── Clover_Roaster_Mapping_Minute_clinic_v2.0__Virtual_Providers-Prevalida.csv
│       │   │   │   └── Sample Input/
│       │   │   │       ├── 3344841_MinuteClinic__Core_Providers.csv
│       │   │   │       ├── 3344841_MinuteClinic__Termed_Providers.csv
│       │   │   │       ├── 3344841_MinuteClinic__Virtual_Providers.csv
│       │   │   │       ├── 3346534_MinuteClinic__Core_Providers.csv
│       │   │   │       ├── 3346534_MinuteClinic__Termed_Providers.csv
│       │   │   │       ├── 3346534_MinuteClinic__Virtual_Providers.csv
│       │   │   │       └── Bak/
│       │   │   │           ├── 3342882_MinuteClinic__Core_Providers.csv
│       │   │   │           └── 3342882_MinuteClinic__Virtual_Care_Providers.csv
│       │   │   ├── Northside/
│       │   │   │   ├── Archive/
│       │   │   │   │   ├── Clover_Roaster_Mapping_Northside__Cooper_Layout_New_Provider_.csv
│       │   │   │   │   ├── Clover_Roaster_Mapping_Northside__I_Network_Layout.csv
│       │   │   │   │   ├── Clover_Roaster_Mapping_Northside__Northside_Layout.csv
│       │   │   │   │   ├── Clover_Roaster_Mapping_Northside__Northside_Mapping.csv
│       │   │   │   │   ├── Clover_Roaster_Mapping_Northside_Edifecs_V1.0__I_Network_Layout.csv
│       │   │   │   │   ├── Clover_Roaster_Mapping_Northside_Edifecs_V1.0__Northside_Layout.csv
│       │   │   │   │   ├── Clover_Roaster_Mapping_Northside_Edifecs_V1.0__Northside_Mapping.csv
│       │   │   │   │   ├── Clover_Roster_Mapping_Northside__Inbound_Outbound_File_Req_s.csv
│       │   │   │   │   ├── Clover_Roster_Mapping_Northside__Layout.csv
│       │   │   │   │   ├── Clover_Roster_Mapping_Northside__Mapping.csv
│       │   │   │   │   └── Clover_Roster_Mapping_Northside__Open_Items.csv
│       │   │   │   ├── Clover_Roaster_Mapping_Northside_EdifecsV2.0__I_Network_Layout.csv
│       │   │   │   ├── Clover_Roaster_Mapping_Northside_EdifecsV2.0__Northside_Layout.csv
│       │   │   │   ├── Clover_Roaster_Mapping_Northside_EdifecsV2.0__Northside_Mapping.csv
│       │   │   │   ├── Clover_Roaster_Mapping_Northside_EdifecsV2.0__Revision_History.csv
│       │   │   │   ├── Clover_Roaster_Mapping_Northside_EdifecsV2.0__State_Code_Crosswalk.csv
│       │   │   │   └── Sample Input/
│       │   │   │       ├── 3341244_Northside__Demographics.csv
│       │   │   │       ├── 3341244_Northside__New_Providers.csv
│       │   │   │       ├── 3341244_Northside__NS_Billing_Information.csv
│       │   │   │       └── 3341244_Northside__Term_Providers.csv
│       │   │   ├── Penn/
│       │   │   │   ├── Archive/
│       │   │   │   │   ├── Clover_Roaster_Mapping_Penn_v1__I_Network_Layout.csv
│       │   │   │   │   ├── Clover_Roaster_Mapping_Penn_v1__Penn_mapping.csv
│       │   │   │   │   ├── Clover_Roaster_Mapping_Penn_v1__Penn_Pre-Validation.csv
│       │   │   │   │   ├── Clover_Roaster_Mapping_Penn_v1__Revision_History.csv
│       │   │   │   │   ├── Clover_Roaster_Mapping_Penn_v1__Taxonomy_Crosswalk.csv
│       │   │   │   │   ├── Clover_Roster_Mapping_Penn__Inbound_Outbound_File_Req_s.csv
│       │   │   │   │   ├── Clover_Roster_Mapping_Penn__Layout.csv
│       │   │   │   │   ├── Clover_Roster_Mapping_Penn__Mapping.csv
│       │   │   │   │   └── Clover_Roster_Mapping_Penn__Open_Items.csv
│       │   │   │   ├── Clover_Roaster_Mapping_Penn_v1.1__I_Network_Layout.csv
│       │   │   │   ├── Clover_Roaster_Mapping_Penn_v1.1__Penn_mapping.csv
│       │   │   │   ├── Clover_Roaster_Mapping_Penn_v1.1__Penn_Pre-Validation.csv
│       │   │   │   ├── Clover_Roaster_Mapping_Penn_v1.1__Revision_History.csv
│       │   │   │   ├── Clover_Roaster_Mapping_Penn_v1.1__Taxonomy_Crosswalk.csv
│       │   │   │   └── Sample Input/
│       │   │   │       ├── 2025_0113_Pennmedicine_Clover_Health_Plan_January_Monthly_Export__Sheet1.csv
│       │   │   │       └── 2025_0414_Pennmedicine_Clover_Health_Plan_April_Export_-_03354023__Sheet1.csv
│       │   │   ├── Pidemont/
│       │   │   │   └── Sample/
│       │   │   │       ├── Clover_Health_MA_-_Piedmont_Clinic_May_2025_BOM_FINAL__Contract_Updates.csv
│       │   │   │       ├── Clover_Health_MA_-_Piedmont_Clinic_May_2025_BOM_FINAL__Demographic_Updates.csv
│       │   │   │       ├── Clover_Health_MA_-_Piedmont_Clinic_May_2025_BOM_FINAL__Master.csv
│       │   │   │       └── Clover_Health_MA_-_Piedmont_Clinic_May_2025_BOM_FINAL__Terminations.csv
│       │   │   └── SantechI Network Layout and Sample/
│       │   │       ├── Cooper.csv
│       │   │       ├── Northside.csv
│       │   │       └── Santech_I-Network_Layout__I_Network_Layout.csv
│       │   ├── EdifecsProduct_Mappingspec_OutboundClaims__837IP_XML_to_EDIConversion_V1.2__Additional_Discussion.csv
│       │   ├── EdifecsProduct_Mappingspec_OutboundClaims__837IP_XML_to_EDIConversion_V1.2__Cover_Page.csv
│       │   ├── EdifecsProduct_Mappingspec_OutboundClaims__837IP_XML_to_EDIConversion_V1.2__Type_Institutional.csv
│       │   ├── EdifecsProduct_Mappingspec_OutboundClaims__837IP_XML_to_EDIConversion_V1.2__Type_Professional.csv
│       │   ├── EdifecsProduct_Mappingspec_OutboundClaims__837IP_XML_to_EDIConversion_V1.2__Version_History.csv
│       │   └── WIP/
│       │       ├── EdifecsProduct_Mappingspec_OutboundClaims__837IP_XML_to_EDIConversion_V1.3__Additional_Discussion.csv
│       │       ├── EdifecsProduct_Mappingspec_OutboundClaims__837IP_XML_to_EDIConversion_V1.3__Cover_Page.csv
│       │       ├── EdifecsProduct_Mappingspec_OutboundClaims__837IP_XML_to_EDIConversion_V1.3__Type_Institutional.csv
│       │       ├── EdifecsProduct_Mappingspec_OutboundClaims__837IP_XML_to_EDIConversion_V1.3__Type_Professional.csv
│       │       └── EdifecsProduct_Mappingspec_OutboundClaims__837IP_XML_to_EDIConversion_V1.3__Version_History.csv
│       ├── EDI 275 Attachment Service/
│       │   ├── EDI_275_Audit_Layout_V1.0__Audit_events.csv
│       │   ├── EDI_275_Audit_Layout_V1.0__Audit_Layout.csv
│       │   └── EDI_275_Audit_Layout_V1.0__Cover_Sheet.csv
│       ├── Encounter IB/
│       │   └── 26.2.0/
│       │       ├── Archive/
│       │       │   ├── EdifecsProduct_MappingSpec_Inbound_Encounter_837_EDI_to_XMLConversion_V0.1__837I_Base_Mapping.csv
│       │       │   ├── EdifecsProduct_MappingSpec_Inbound_Encounter_837_EDI_to_XMLConversion_V0.1__837I_Mapping_Default_Val.csv
│       │       │   ├── EdifecsProduct_MappingSpec_Inbound_Encounter_837_EDI_to_XMLConversion_V0.1__837P_Base_Mapping_Defaul.csv
│       │       │   ├── EdifecsProduct_MappingSpec_Inbound_Encounter_837_EDI_to_XMLConversion_V0.1__837P_Base_Mapping.csv
│       │       │   ├── EdifecsProduct_MappingSpec_Inbound_Encounter_837_EDI_to_XMLConversion_V0.1__Cover_Page.csv
│       │       │   ├── EdifecsProduct_MappingSpec_Inbound_Encounter_837_EDI_to_XMLConversion_V0.1__Crosswalk.csv
│       │       │   ├── EdifecsProduct_MappingSpec_Inbound_Encounter_837_EDI_to_XMLConversion_V0.1__Sheet1.csv
│       │       │   ├── EdifecsProduct_MappingSpec_Inbound_Encounter_837_EDI_to_XMLConversion_V0.1__Version_History.csv
│       │       │   ├── EdifecsProduct_MappingSpec_Inbound_Encounter_837_EDI_to_XMLConversion_V1.0__837P_Enc_Mapping_Default.csv
│       │       │   ├── EdifecsProduct_MappingSpec_Inbound_Encounter_837_EDI_to_XMLConversion_V1.0__837P_Encounter_Mapping_.csv
│       │       │   ├── EdifecsProduct_MappingSpec_Inbound_Encounter_837_EDI_to_XMLConversion_V1.0__Cover_Page.csv
│       │       │   ├── EdifecsProduct_MappingSpec_Inbound_Encounter_837_EDI_to_XMLConversion_V1.0__Crosswalk.csv
│       │       │   ├── EdifecsProduct_MappingSpec_Inbound_Encounter_837_EDI_to_XMLConversion_V1.0__Sheet1.csv
│       │       │   └── EdifecsProduct_MappingSpec_Inbound_Encounter_837_EDI_to_XMLConversion_V1.0__Version_History.csv
│       │       ├── EdifecsProduct_MappingSpec_Inbound_Encounter_837_EDI_to_XMLConversion_V1.1__837P_Enc_Mapping_Default.csv
│       │       ├── EdifecsProduct_MappingSpec_Inbound_Encounter_837_EDI_to_XMLConversion_V1.1__837P_Encounter_Mapping_.csv
│       │       ├── EdifecsProduct_MappingSpec_Inbound_Encounter_837_EDI_to_XMLConversion_V1.1__Cover_Page.csv
│       │       ├── EdifecsProduct_MappingSpec_Inbound_Encounter_837_EDI_to_XMLConversion_V1.1__Crosswalk.csv
│       │       ├── EdifecsProduct_MappingSpec_Inbound_Encounter_837_EDI_to_XMLConversion_V1.1__Sheet1.csv
│       │       └── EdifecsProduct_MappingSpec_Inbound_Encounter_837_EDI_to_XMLConversion_V1.1__Version_History.csv
│       ├── Enrollment IB/
│       │   └── V26.2.0.0/
│       │       ├── Audit_JSON_Mapping-Enrollment__Audit_Events.csv
│       │       ├── Audit_JSON_Mapping-Enrollment__Coversheet.csv
│       │       ├── Audit_JSON_Mapping-Enrollment__JSON_mapping.csv
│       │       ├── Audit_JSON_Mapping-Enrollment__New_Audit_Events-In-Discussion.csv
│       │       ├── EdifecsProduct_MappingSpec_Enrollment_834_EDI-XML_Conversion_V3.2__asofdate.csv
│       │       ├── EdifecsProduct_MappingSpec_Enrollment_834_EDI-XML_Conversion_V3.2__Checklist.csv
│       │       ├── EdifecsProduct_MappingSpec_Enrollment_834_EDI-XML_Conversion_V3.2__Commercial.csv
│       │       ├── EdifecsProduct_MappingSpec_Enrollment_834_EDI-XML_Conversion_V3.2__Conversion_Copy.csv
│       │       ├── EdifecsProduct_MappingSpec_Enrollment_834_EDI-XML_Conversion_V3.2__Cover_Sheet.csv
│       │       ├── EdifecsProduct_MappingSpec_Enrollment_834_EDI-XML_Conversion_V3.2__Enumerations.csv
│       │       ├── EdifecsProduct_MappingSpec_Enrollment_834_EDI-XML_Conversion_V3.2__Header_Default.csv
│       │       ├── EdifecsProduct_MappingSpec_Enrollment_834_EDI-XML_Conversion_V3.2__Medicaid.csv
│       │       ├── EdifecsProduct_MappingSpec_Enrollment_834_EDI-XML_Conversion_V3.2__Medicare.csv
│       │       ├── EdifecsProduct_MappingSpec_Enrollment_834_EDI-XML_Conversion_V3.2__Version_History.csv
│       │       └── TBA/
│       │           ├── TBA_domain_table__INS02.csv
│       │           └── TBA_domain_table__Sheet1.csv
│       ├── Enrollment OB/
│       │   └── V26.1.1.0/
│       │       ├── EdifecsProduct_Mappingspec_OutboundEnrollment__834_XML_to_EDIConversion_V1.2__Comparison_with_IB_and.csv
│       │       ├── EdifecsProduct_Mappingspec_OutboundEnrollment__834_XML_to_EDIConversion_V1.2__Conversion_copy.csv
│       │       ├── EdifecsProduct_Mappingspec_OutboundEnrollment__834_XML_to_EDIConversion_V1.2__Cover_Sheet.csv
│       │       ├── EdifecsProduct_Mappingspec_OutboundEnrollment__834_XML_to_EDIConversion_V1.2__Mapping_Outbound.csv
│       │       ├── EdifecsProduct_Mappingspec_OutboundEnrollment__834_XML_to_EDIConversion_V1.2__Version_History.csv
│       │       ├── OB_Enrollment_Audit_Mapping_V1.0__Audit_Events.csv
│       │       ├── OB_Enrollment_Audit_Mapping_V1.0__Audit_Mapping.csv
│       │       ├── OB_Enrollment_Audit_Mapping_V1.0__Cover_sheet.csv
│       │       ├── OB_Enrollment_Audit_Mapping_V1.0__Json_layout.csv
│       │       ├── OB_Enrollment_Audit_Mapping_V1.0__queue_details.csv
│       │       ├── OB_Enrollment_Audit_Mapping_V1.0__Sample_Audit_Json.csv
│       │       └── OB_Enrollment_Audit_Mapping_V1.0__Version_History.csv
│       ├── Payment IB/
│       │   └── V26.1.1.0/
│       │       ├── EdifecsProduct_Audit_JSON_Mapping_PaymentInbound_ZelisAdoption_V1.1__Attachments.csv
│       │       ├── EdifecsProduct_Audit_JSON_Mapping_PaymentInbound_ZelisAdoption_V1.1__Audit_events.csv
│       │       ├── EdifecsProduct_Audit_JSON_Mapping_PaymentInbound_ZelisAdoption_V1.1__Correspondence_Audit_Mapping.csv
│       │       ├── EdifecsProduct_Audit_JSON_Mapping_PaymentInbound_ZelisAdoption_V1.1__Cover_Sheet.csv
│       │       ├── EdifecsProduct_Audit_JSON_Mapping_PaymentInbound_ZelisAdoption_V1.1__Payment_status_Audit_Mapping.csv
│       │       ├── EdifecsProduct_Audit_JSON_Mapping_PaymentInbound_ZelisAdoption_V1.1__Revision_History.csv
│       │       ├── EdifecsProduct_Audit_JSON_Mapping_PaymentInbound_ZelisAdoption_V1.1__Sample_Audit_Json.csv
│       │       └── Payment IB_PNC&CHC/
│       │           ├── EdifecsProduct_Audit_JSON_IB_Payment_Mapping_V1.0__Audit_events.csv
│       │           ├── EdifecsProduct_Audit_JSON_IB_Payment_Mapping_V1.0__Audit_JSON_Mapping.csv
│       │           ├── EdifecsProduct_Audit_JSON_IB_Payment_Mapping_V1.0__Audit_Sample.csv
│       │           ├── EdifecsProduct_Audit_JSON_IB_Payment_Mapping_V1.0__Cover_Page.csv
│       │           ├── EdifecsProduct_Audit_JSON_IB_Payment_Mapping_V1.0__Revision_History.csv
│       │           ├── EdifecsProduct_Payment_IB_Check_Recon_Mapping_v1.1__Audit_Json_Layout.csv
│       │           ├── EdifecsProduct_Payment_IB_Check_Recon_Mapping_v1.1__Check_Reconciliation-CHC.csv
│       │           ├── EdifecsProduct_Payment_IB_Check_Recon_Mapping_v1.1__Header_Logic.csv
│       │           ├── EdifecsProduct_Payment_IB_Check_Recon_Mapping_v1.1__Version_History.csv
│       │           ├── EdifecsProduct_Payment_IB_Provider_Settlement_Mapping_v1.1__Header_Logic.csv
│       │           ├── EdifecsProduct_Payment_IB_Provider_Settlement_Mapping_v1.1__Provider_Settlement_Mapping.csv
│       │           ├── EdifecsProduct_Payment_IB_Provider_Settlement_Mapping_v1.1__Revision_History.csv
│       │           └── Payment IB - Audit Structure.txt
│       ├── Payment OB/
│       │   ├── Archive/
│       │   │   ├── V24.3.0.0/
│       │   │   │   ├── EdifecsProduct_Mapping_Spec_OutboundPayment_835_DFF_to_EDIConversion_V1.4__835_Mapping.csv
│       │   │   │   ├── EdifecsProduct_Mapping_Spec_OutboundPayment_835_DFF_to_EDIConversion_V1.4__Attachments.csv
│       │   │   │   ├── EdifecsProduct_Mapping_Spec_OutboundPayment_835_DFF_to_EDIConversion_V1.4__Coversheet.csv
│       │   │   │   ├── EdifecsProduct_Mapping_Spec_OutboundPayment_835_DFF_to_EDIConversion_V1.4__Payment_Extract.csv
│       │   │   │   ├── EdifecsProduct_Mapping_Spec_OutboundPayment_835_DFF_to_EDIConversion_V1.4__PSD_Tickets.csv
│       │   │   │   └── EdifecsProduct_Mapping_Spec_OutboundPayment_835_DFF_to_EDIConversion_V1.4__Revision_History.csv
│       │   │   └── V25.2.0.0/
│       │   │       ├── Archive/
│       │   │       │   ├── Audit_JSON_Payment_Mapping_V0.1__Audit_events.csv
│       │   │       │   ├── Audit_JSON_Payment_Mapping_V0.1__Audit_JSON_Mapping.csv
│       │   │       │   ├── Audit_JSON_Payment_Mapping_V0.1__Cover_Page.csv
│       │   │       │   ├── Audit_JSON_Payment_Mapping_V0.1__Legend.csv
│       │   │       │   ├── Audit_JSON_Payment_Mapping_V0.1__Summary_File.csv
│       │   │       │   ├── Audit_JSON_Payment_Mapping_V0.2__Audit_events.csv
│       │   │       │   ├── Audit_JSON_Payment_Mapping_V0.2__Audit_JSON_Mapping.csv
│       │   │       │   ├── Audit_JSON_Payment_Mapping_V0.2__Cover_Page.csv
│       │   │       │   └── Audit_JSON_Payment_Mapping_V0.2__Legend.csv
│       │   │       ├── EdifecsProduct_Audit_JSON_OB_Payment_Mapping_V1.0__Audit_events.csv
│       │   │       ├── EdifecsProduct_Audit_JSON_OB_Payment_Mapping_V1.0__Audit_JSON_Mapping.csv
│       │   │       ├── EdifecsProduct_Audit_JSON_OB_Payment_Mapping_V1.0__Cover_Page.csv
│       │   │       ├── EdifecsProduct_Audit_JSON_OB_Payment_Mapping_V1.0__Legend.csv
│       │   │       ├── EdifecsProduct_Mapping_Spec_OutboundPayment_835_DFF_to_EDIConversion_V1.5__835_Mapping.csv
│       │   │       ├── EdifecsProduct_Mapping_Spec_OutboundPayment_835_DFF_to_EDIConversion_V1.5__Attachments.csv
│       │   │       ├── EdifecsProduct_Mapping_Spec_OutboundPayment_835_DFF_to_EDIConversion_V1.5__Coversheet.csv
│       │   │       ├── EdifecsProduct_Mapping_Spec_OutboundPayment_835_DFF_to_EDIConversion_V1.5__Payment_Extract.csv
│       │   │       ├── EdifecsProduct_Mapping_Spec_OutboundPayment_835_DFF_to_EDIConversion_V1.5__PSD_Tickets.csv
│       │   │       └── EdifecsProduct_Mapping_Spec_OutboundPayment_835_DFF_to_EDIConversion_V1.5__Revision_History.csv
│       │   ├── V26.1.0.0/
│       │   │   ├── EdifecsProduct_Audit_JSON_OB_Payment_Mapping_V1.0__Audit_events.csv
│       │   │   ├── EdifecsProduct_Audit_JSON_OB_Payment_Mapping_V1.0__Audit_JSON_Mapping.csv
│       │   │   ├── EdifecsProduct_Audit_JSON_OB_Payment_Mapping_V1.0__Cover_Page.csv
│       │   │   ├── EdifecsProduct_Audit_JSON_OB_Payment_Mapping_V1.0__Legend.csv
│       │   │   ├── EdifecsProduct_Mapping_Spec_OutboundPayment_835_DFF_to_EDIConversion_V2.0__835_Mapping.csv
│       │   │   ├── EdifecsProduct_Mapping_Spec_OutboundPayment_835_DFF_to_EDIConversion_V2.0__Attachments.csv
│       │   │   ├── EdifecsProduct_Mapping_Spec_OutboundPayment_835_DFF_to_EDIConversion_V2.0__Coversheet.csv
│       │   │   ├── EdifecsProduct_Mapping_Spec_OutboundPayment_835_DFF_to_EDIConversion_V2.0__Payment_Extract.csv
│       │   │   ├── EdifecsProduct_Mapping_Spec_OutboundPayment_835_DFF_to_EDIConversion_V2.0__PSD_Tickets.csv
│       │   │   └── EdifecsProduct_Mapping_Spec_OutboundPayment_835_DFF_to_EDIConversion_V2.0__Revision_History.csv
│       │   └── V26.1.1.1/
│       │       ├── EdifecsProduct_Mapping_Spec_OutboundPayment_835_DFF_to_EDIConversion_V2.1__835_Mapping.csv
│       │       ├── EdifecsProduct_Mapping_Spec_OutboundPayment_835_DFF_to_EDIConversion_V2.1__Attachments.csv
│       │       ├── EdifecsProduct_Mapping_Spec_OutboundPayment_835_DFF_to_EDIConversion_V2.1__Coversheet.csv
│       │       ├── EdifecsProduct_Mapping_Spec_OutboundPayment_835_DFF_to_EDIConversion_V2.1__Payment_Extract.csv
│       │       ├── EdifecsProduct_Mapping_Spec_OutboundPayment_835_DFF_to_EDIConversion_V2.1__PSD_Tickets.csv
│       │       └── EdifecsProduct_Mapping_Spec_OutboundPayment_835_DFF_to_EDIConversion_V2.1__Revision_History.csv
│       ├── PULSE/
│       │   ├── Archive/
│       │   │   ├── PULSE360_EDIconvertor_AuditAlldata_Layout__V1.6__Claims.csv
│       │   │   ├── PULSE360_EDIconvertor_AuditAlldata_Layout__V1.6__Cover.csv
│       │   │   ├── PULSE360_EDIconvertor_AuditAlldata_Layout__V1.6__Enrollment.csv
│       │   │   ├── PULSE360_EDIconvertor_AuditAlldata_Layout__V1.6__Payments.csv
│       │   │   ├── PULSE360_EDIconvertor_AuditAlldata_Layout__V1.7__Claims.csv
│       │   │   ├── PULSE360_EDIconvertor_AuditAlldata_Layout__V1.7__Cover.csv
│       │   │   ├── PULSE360_EDIconvertor_AuditAlldata_Layout__V1.7__Enrollment.csv
│       │   │   └── PULSE360_EDIconvertor_AuditAlldata_Layout__V1.7__Payments.csv
│       │   ├── PULSE360_EDIconvertor_AuditAlldata_Layout__V1.7__Claims.csv
│       │   ├── PULSE360_EDIconvertor_AuditAlldata_Layout__V1.7__Cover.csv
│       │   ├── PULSE360_EDIconvertor_AuditAlldata_Layout__V1.7__Enrollment.csv
│       │   └── PULSE360_EDIconvertor_AuditAlldata_Layout__V1.7__Payments.csv
│       ├── QA Automation/
│       │   ├── EdifecsProduct_MappingSpec_QA_Automation_834_EDI_to_CSVConversion_V1.3__Cover_Page.csv
│       │   ├── EdifecsProduct_MappingSpec_QA_Automation_834_EDI_to_CSVConversion_V1.3__Crosswalks.csv
│       │   ├── EdifecsProduct_MappingSpec_QA_Automation_834_EDI_to_CSVConversion_V1.3__CSV_format.csv
│       │   ├── EdifecsProduct_MappingSpec_QA_Automation_834_EDI_to_CSVConversion_V1.3__Default_Values.csv
│       │   ├── EdifecsProduct_MappingSpec_QA_Automation_834_EDI_to_CSVConversion_V1.3__EDI_834_Mapping.csv
│       │   ├── EdifecsProduct_MappingSpec_QA_Automation_834_EDI_to_CSVConversion_V1.3__Revision_History.csv
│       │   ├── EdifecsProduct_MappingSpec_QA_Automation_834_EDI_to_CSVConversion_V1.3__Sample_CSV_Format.csv
│       │   ├── EdifecsProduct_MappingSpec_QA_Automation_837I_CSV_to_EDI_Conversion_V1.1__837I_Mapping_Spec.csv
│       │   ├── EdifecsProduct_MappingSpec_QA_Automation_837I_CSV_to_EDI_Conversion_V1.1__Cover_Page.csv
│       │   ├── EdifecsProduct_MappingSpec_QA_Automation_837I_CSV_to_EDI_Conversion_V1.1__CSV_Layout.csv
│       │   ├── EdifecsProduct_MappingSpec_QA_Automation_837I_CSV_to_EDI_Conversion_V1.1__Default_Values.csv
│       │   ├── EdifecsProduct_MappingSpec_QA_Automation_837I_CSV_to_EDI_Conversion_V1.1__Sample_CSV_Format.csv
│       │   ├── EdifecsProduct_MappingSpec_QA_Automation_837I_CSV_to_EDI_Conversion_V1.1__Sheet1.csv
│       │   ├── EdifecsProduct_MappingSpec_QA_Automation_837I_CSV_to_EDI_Conversion_V1.1__Version_History.csv
│       │   ├── EdifecsProduct_MappingSpec_QA_Automation_837I_EDI_to_CSVConversion_V1.0__837I.csv
│       │   ├── EdifecsProduct_MappingSpec_QA_Automation_837I_EDI_to_CSVConversion_V1.0__Cover_Page.csv
│       │   ├── EdifecsProduct_MappingSpec_QA_Automation_837I_EDI_to_CSVConversion_V1.0__CSV_Layout.csv
│       │   ├── EdifecsProduct_MappingSpec_QA_Automation_837I_EDI_to_CSVConversion_V1.0__Default_Values.csv
│       │   ├── EdifecsProduct_MappingSpec_QA_Automation_837I_EDI_to_CSVConversion_V1.0__Sample_CSV_Format.csv
│       │   ├── EdifecsProduct_MappingSpec_QA_Automation_837I_EDI_to_CSVConversion_V1.0__Sheet1.csv
│       │   ├── EdifecsProduct_MappingSpec_QA_Automation_837I_EDI_to_CSVConversion_V1.0__Version_History.csv
│       │   ├── EdifecsProduct_MappingSpec_QA_Automation_837P_CSV_to_EDI_Conversion_V1.1__837P_MappingSpec.csv
│       │   ├── EdifecsProduct_MappingSpec_QA_Automation_837P_CSV_to_EDI_Conversion_V1.1__Cover_Page.csv
│       │   ├── EdifecsProduct_MappingSpec_QA_Automation_837P_CSV_to_EDI_Conversion_V1.1__CSV_Format.csv
│       │   ├── EdifecsProduct_MappingSpec_QA_Automation_837P_CSV_to_EDI_Conversion_V1.1__Default_Values.csv
│       │   ├── EdifecsProduct_MappingSpec_QA_Automation_837P_CSV_to_EDI_Conversion_V1.1__Sample_CSV.csv
│       │   ├── EdifecsProduct_MappingSpec_QA_Automation_837P_CSV_to_EDI_Conversion_V1.1__Sheet1.csv
│       │   ├── EdifecsProduct_MappingSpec_QA_Automation_837P_CSV_to_EDI_Conversion_V1.1__Version_History.csv
│       │   ├── EdifecsProduct_MappingSpec_QA_Automation_837P_EDI_to_CSVConversion_V1.0__837P.csv
│       │   ├── EdifecsProduct_MappingSpec_QA_Automation_837P_EDI_to_CSVConversion_V1.0__Cover_Page.csv
│       │   ├── EdifecsProduct_MappingSpec_QA_Automation_837P_EDI_to_CSVConversion_V1.0__CSV_Format.csv
│       │   ├── EdifecsProduct_MappingSpec_QA_Automation_837P_EDI_to_CSVConversion_V1.0__Default_Values.csv
│       │   ├── EdifecsProduct_MappingSpec_QA_Automation_837P_EDI_to_CSVConversion_V1.0__Sample_CSV.csv
│       │   ├── EdifecsProduct_MappingSpec_QA_Automation_837P_EDI_to_CSVConversion_V1.0__Sheet1.csv
│       │   ├── EdifecsProduct_MappingSpec_QA_Automation_837P_EDI_to_CSVConversion_V1.0__Version_History.csv
│       │   ├── EDIFECSProduct_MappingSpec_QA_Automation_Advantasure_DFF_to_CSV_conversion_V2.0__Cover_Page.csv
│       │   ├── EDIFECSProduct_MappingSpec_QA_Automation_Advantasure_DFF_to_CSV_conversion_V2.0__Crosswalk.csv
│       │   ├── EDIFECSProduct_MappingSpec_QA_Automation_Advantasure_DFF_to_CSV_conversion_V2.0__CSV_Format.csv
│       │   ├── EDIFECSProduct_MappingSpec_QA_Automation_Advantasure_DFF_to_CSV_conversion_V2.0__CSV_Mapping.csv
│       │   ├── EDIFECSProduct_MappingSpec_QA_Automation_Advantasure_DFF_to_CSV_conversion_V2.0__Default_Values.csv
│       │   └── EDIFECSProduct_MappingSpec_QA_Automation_Advantasure_DFF_to_CSV_conversion_V2.0__Revision_History.csv
│       ├── Repository/
│       │   ├── Claims/
│       │   │   └── V26.1.1.0/
│       │   │       ├── Claims_Repository_-_837IP_Table_Mapping_vs_Column_Names_V2.1__LEGEND.csv
│       │   │       ├── Claims_Repository_-_837IP_Table_Mapping_vs_Column_Names_V2.1__SUBMITTED_CLAIM_AMBULANCE_CERTI.csv
│       │   │       ├── Claims_Repository_-_837IP_Table_Mapping_vs_Column_Names_V2.1__SUBMITTED_CLAIM_BILLINGPROVIDER.csv
│       │   │       ├── Claims_Repository_-_837IP_Table_Mapping_vs_Column_Names_V2.1__SUBMITTED_CLAIM_CLAIMLINE_OTHER.csv
│       │   │       ├── Claims_Repository_-_837IP_Table_Mapping_vs_Column_Names_V2.1__SUBMITTED_CLAIM_DIAGNOSIS_INFO.csv
│       │   │       ├── Claims_Repository_-_837IP_Table_Mapping_vs_Column_Names_V2.1__SUBMITTED_CLAIM_LEVEL_ADJUSTMEN.csv
│       │   │       ├── Claims_Repository_-_837IP_Table_Mapping_vs_Column_Names_V2.1__SUBMITTED_CLAIM_LINE_AMBULANCE_.csv
│       │   │       ├── Claims_Repository_-_837IP_Table_Mapping_vs_Column_Names_V2.1__SUBMITTED_CLAIM_LINE_LEVEL_ADJU.csv
│       │   │       ├── Claims_Repository_-_837IP_Table_Mapping_vs_Column_Names_V2.1__SUBMITTED_CLAIM_LINE.csv
│       │   │       ├── Claims_Repository_-_837IP_Table_Mapping_vs_Column_Names_V2.1__SUBMITTED_CLAIM_MEDICARE_INPATI.csv
│       │   │       ├── Claims_Repository_-_837IP_Table_Mapping_vs_Column_Names_V2.1__SUBMITTED_CLAIM_MEDICARE_OUTPAT.csv
│       │   │       ├── Claims_Repository_-_837IP_Table_Mapping_vs_Column_Names_V2.1__SUBMITTED_CLAIM_OTHER_PAYER.csv
│       │   │       ├── Claims_Repository_-_837IP_Table_Mapping_vs_Column_Names_V2.1__SUBMITTED_CLAIM_OTHER_SUBSCRIBE.csv
│       │   │       ├── Claims_Repository_-_837IP_Table_Mapping_vs_Column_Names_V2.1__SUBMITTED_CLAIM_PATIENT_DETAILS.csv
│       │   │       ├── Claims_Repository_-_837IP_Table_Mapping_vs_Column_Names_V2.1__SUBMITTED_CLAIM_PROVIDER_DETAIL.csv
│       │   │       ├── Claims_Repository_-_837IP_Table_Mapping_vs_Column_Names_V2.1__SUBMITTED_CLAIM_REPORT_TABLE.csv
│       │   │       ├── Claims_Repository_-_837IP_Table_Mapping_vs_Column_Names_V2.1__SUBMITTED_CLAIM_SUBSCRIBER_DETA.csv
│       │   │       ├── Claims_Repository_-_837IP_Table_Mapping_vs_Column_Names_V2.1__SUBMITTED_CLAIM.csv
│       │   │       ├── EdifecsProduct_MappingSpec_ClaimsRepo_837IP_EDI_to_DFFConversion_V2.1__837I.csv
│       │   │       ├── EdifecsProduct_MappingSpec_ClaimsRepo_837IP_EDI_to_DFFConversion_V2.1__837P.csv
│       │   │       ├── EdifecsProduct_MappingSpec_ClaimsRepo_837IP_EDI_to_DFFConversion_V2.1__CAS.csv
│       │   │       ├── EdifecsProduct_MappingSpec_ClaimsRepo_837IP_EDI_to_DFFConversion_V2.1__Cover_Page.csv
│       │   │       ├── EdifecsProduct_MappingSpec_ClaimsRepo_837IP_EDI_to_DFFConversion_V2.1__Loop_vs_TableName.csv
│       │   │       ├── EdifecsProduct_MappingSpec_ClaimsRepo_837IP_EDI_to_DFFConversion_V2.1__Sheet1.csv
│       │   │       ├── EdifecsProduct_MappingSpec_ClaimsRepo_837IP_EDI_to_DFFConversion_V2.1__Tables.csv
│       │   │       └── EdifecsProduct_MappingSpec_ClaimsRepo_837IP_EDI_to_DFFConversion_V2.1__Version_History.csv
│       │   └── Enrollment/
│       │       └── V26.1.1.0/
│       │           ├── EdifecsProduct_MappingSpec_EnrollmentRepo_834_EDI_to_DFFConversion_V2.0__Cover_Page.csv
│       │           ├── EdifecsProduct_MappingSpec_EnrollmentRepo_834_EDI_to_DFFConversion_V2.0__EDI_834.csv
│       │           ├── EdifecsProduct_MappingSpec_EnrollmentRepo_834_EDI_to_DFFConversion_V2.0__Generic_Attributes.csv
│       │           ├── EdifecsProduct_MappingSpec_EnrollmentRepo_834_EDI_to_DFFConversion_V2.0__Revision_History.csv
│       │           └── EdifecsProduct_MappingSpec_EnrollmentRepo_834_EDI_to_DFFConversion_V2.0__Tables.csv
│       ├── Repricer OB-IB/
│       │   ├── IB Repricer/
│       │   │   └── V26.1.0.0/
│       │   │       ├── EDIFECSProduct_AuditProcessing_InboundRepricer_V2.0__Audit_Events.csv
│       │   │       ├── EDIFECSProduct_AuditProcessing_InboundRepricer_V2.0__Audit_Mapping.csv
│       │   │       ├── EDIFECSProduct_AuditProcessing_InboundRepricer_V2.0__Cover_Page.csv
│       │   │       ├── EdifecsProduct_MappingSpec_IB_Repricer_837_EDI_to_XMLConversion_V1.0__Cover_Page.csv
│       │   │       ├── EdifecsProduct_MappingSpec_IB_Repricer_837_EDI_to_XMLConversion_V1.0__Mapping.csv
│       │   │       ├── EdifecsProduct_MappingSpec_IB_Repricer_837_EDI_to_XMLConversion_V1.0__Ref.csv
│       │   │       ├── EdifecsProduct_MappingSpec_IB_Repricer_837_EDI_to_XMLConversion_V1.0__Sheet1.csv
│       │   │       └── EdifecsProduct_MappingSpec_IB_Repricer_837_EDI_to_XMLConversion_V1.0__Version_History.csv
│       │   └── OB Repricer/
│       │       └── V26.1.0.0/
│       │           ├── EdifecsProduct_AuditProcessing_OB_Repricer_V2.0__Audit_events.csv
│       │           ├── EdifecsProduct_AuditProcessing_OB_Repricer_V2.0__Cover_Page.csv
│       │           ├── EdifecsProduct_AuditProcessing_OB_Repricer_V2.0__JSON_Mapping.csv
│       │           ├── EdifecsProduct_MappingSpec_OB_Repricer_837_DFF_to_EDI_Conversion_V2.1__837I_CDS_Values_.csv
│       │           ├── EdifecsProduct_MappingSpec_OB_Repricer_837_DFF_to_EDI_Conversion_V2.1__837I_Mapping_.csv
│       │           ├── EdifecsProduct_MappingSpec_OB_Repricer_837_DFF_to_EDI_Conversion_V2.1__837P_CDS_Values_.csv
│       │           ├── EdifecsProduct_MappingSpec_OB_Repricer_837_DFF_to_EDI_Conversion_V2.1__837P_Mapping.csv
│       │           ├── EdifecsProduct_MappingSpec_OB_Repricer_837_DFF_to_EDI_Conversion_V2.1__Cover_Page.csv
│       │           ├── EdifecsProduct_MappingSpec_OB_Repricer_837_DFF_to_EDI_Conversion_V2.1__Institutional_Layout.csv
│       │           ├── EdifecsProduct_MappingSpec_OB_Repricer_837_DFF_to_EDI_Conversion_V2.1__Professional_Layout.csv
│       │           └── EdifecsProduct_MappingSpec_OB_Repricer_837_DFF_to_EDI_Conversion_V2.1__Version_History.csv
│       ├── Secondary Editing IB/
│       │   └── V26.1.0.0/
│       │       ├── EdifecsProduct_AuditProcessing_InboundSecondaryEditing_V3.0__Audit_events.csv
│       │       ├── EdifecsProduct_AuditProcessing_InboundSecondaryEditing_V3.0__Cover_Page.csv
│       │       ├── EdifecsProduct_AuditProcessing_InboundSecondaryEditing_V3.0__JSON_Mapping.csv
│       │       ├── EdifecsProduct_AuditProcessing_InboundSecondaryEditing_V3.0__Sample_Json.csv
│       │       ├── EdifecsProduct_MappingSpec_Secondary_Editing_DFF_to_XMLConversion_V2.0__Cotivity.csv
│       │       ├── EdifecsProduct_MappingSpec_Secondary_Editing_DFF_to_XMLConversion_V2.0__Cover_Page.csv
│       │       ├── EdifecsProduct_MappingSpec_Secondary_Editing_DFF_to_XMLConversion_V2.0__EDI_837.csv
│       │       ├── EdifecsProduct_MappingSpec_Secondary_Editing_DFF_to_XMLConversion_V2.0__EDI_Format.csv
│       │       ├── EdifecsProduct_MappingSpec_Secondary_Editing_DFF_to_XMLConversion_V2.0__Evicore.csv
│       │       ├── EdifecsProduct_MappingSpec_Secondary_Editing_DFF_to_XMLConversion_V2.0__IB_file_Layouts.csv
│       │       ├── EdifecsProduct_MappingSpec_Secondary_Editing_DFF_to_XMLConversion_V2.0__Optum.csv
│       │       ├── EdifecsProduct_MappingSpec_Secondary_Editing_DFF_to_XMLConversion_V2.0__Sheet1.csv
│       │       └── EdifecsProduct_MappingSpec_Secondary_Editing_DFF_to_XMLConversion_V2.0__Version_History.csv
│       └── Secondary Editing OB/
│           └── V26.1.0.0/
│               ├── EdifecsProduct_AuditProcessing_OB_Secondary_Editing_V2.0__Audit_events.csv
│               ├── EdifecsProduct_AuditProcessing_OB_Secondary_Editing_V2.0__Cover_Page.csv
│               ├── EdifecsProduct_AuditProcessing_OB_Secondary_Editing_V2.0__JSON_Mapping.csv
│               ├── EdifecsProduct_MappingSpec_OB_Secondary_Editing_837_DFF_to_EDI_Conversion_V1.0__837I_CDS_Values_.csv
│               ├── EdifecsProduct_MappingSpec_OB_Secondary_Editing_837_DFF_to_EDI_Conversion_V1.0__837I_Mapping_.csv
│               ├── EdifecsProduct_MappingSpec_OB_Secondary_Editing_837_DFF_to_EDI_Conversion_V1.0__837P_CDS_Values_.csv
│               ├── EdifecsProduct_MappingSpec_OB_Secondary_Editing_837_DFF_to_EDI_Conversion_V1.0__837P_Mapping.csv
│               ├── EdifecsProduct_MappingSpec_OB_Secondary_Editing_837_DFF_to_EDI_Conversion_V1.0__Cover_Page.csv
│               ├── EdifecsProduct_MappingSpec_OB_Secondary_Editing_837_DFF_to_EDI_Conversion_V1.0__Inst_DFF_Layout.csv
│               ├── EdifecsProduct_MappingSpec_OB_Secondary_Editing_837_DFF_to_EDI_Conversion_V1.0__Prof_DFF_Layout.csv
│               ├── EdifecsProduct_MappingSpec_OB_Secondary_Editing_837_DFF_to_EDI_Conversion_V1.0__sample_inst2.csv
│               ├── EdifecsProduct_MappingSpec_OB_Secondary_Editing_837_DFF_to_EDI_Conversion_V1.0__sample_prof1.csv
│               └── EdifecsProduct_MappingSpec_OB_Secondary_Editing_837_DFF_to_EDI_Conversion_V1.0__Version_History.csv
├── Edifecs/
│   ├── Crosswalk/
│   │   ├── Crosswalk IB834.crsw
│   │   ├── crosswalk_277ca.crsw
│   │   ├── Crosswalk-Documentation.md
│   │   ├── IB_837_Repricer_ClaimSourceLookup.crsw
│   │   ├── IB_837_SecondaryEditing_ClaimSourceLookup.crsw
│   │   ├── p_ib_837_claimsourcelookup.crsw
│   │   ├── p_ib_837_pwk01lookup.crsw
│   │   ├── P_OB_835_ControlReport_Crosswalk.crsw
│   │   └── Sample - Company ID to Address.crsw
│   ├── eam-docs.md
│   ├── ECTools-Documentation.md
│   ├── Guide/
│   │   ├── 834-sef.sef
│   │   ├── 837I-sef.sef
│   │   └── 837P-sef.sef
│   ├── HRP_26_1_Upgrade/
│   │   ├── Mapping-HRP_26_1.md
│   │   ├── PRIME_SERVICES_XSD/
│   │   │   ├── connector-cobpolicy/
│   │   │   │   └── cobPolicy.xsd
│   │   │   ├── connector-codeentrylookup/
│   │   │   │   └── codeentrylookup.xsd
│   │   │   ├── connector-common-schema/
│   │   │   │   ├── base-types.xsd
│   │   │   │   ├── iso3166-country-code.xsd
│   │   │   │   ├── match-input.xsd
│   │   │   │   ├── phone-number.xsd
│   │   │   │   └── us-state-code.xsd
│   │   │   ├── connector-enrollment/
│   │   │   │   ├── enrollment-lookup.xsd
│   │   │   │   ├── enrollment.xsd
│   │   │   │   ├── membership.xsd
│   │   │   │   └── subscription.xsd
│   │   │   ├── connector-enrollmentsparse/
│   │   │   │   ├── enrollment-sparse-lookup.xsd
│   │   │   │   ├── enrollment-sparse-response.xsd
│   │   │   │   ├── enrollment-sparse.xsd
│   │   │   │   ├── enrollment-types.xsd
│   │   │   │   ├── membership-sparse.xsd
│   │   │   │   └── subscription-sparse.xsd
│   │   │   ├── connector-medicarehicn/
│   │   │   │   └── MedicareHICNInfo.xsd
│   │   │   ├── connector-membercomplianceprogram/
│   │   │   │   └── memberComplianceProgram.xsd
│   │   │   ├── connector-memberfactors/
│   │   │   │   └── memberFactors.xsd
│   │   │   ├── connector-payeebankaccounts/
│   │   │   │   └── payeeBankAccounts.xsd
│   │   │   ├── connector-providerlookup/
│   │   │   │   └── providerlookup.xsd
│   │   │   ├── connector-subsidy/
│   │   │   │   └── subsidies.xsd
│   │   │   ├── connector-supplierlocationlookup/
│   │   │   │   └── supplierlocationlookup.xsd
│   │   │   └── membercarereserve.xsd
│   │   ├── WRAPPER_XSD/
│   │   │   ├── enrollment-sparse-wrapper.xsd
│   │   │   ├── header.xsd
│   │   │   ├── inbound_enrollment_request_batch - Copy.xsd
│   │   │   ├── inbound_enrollment_request_batch.xsd
│   │   │   ├── inbound_enrollment_response_batch.xsd
│   │   │   └── membership-sparse-wrapper.xsd
│   │   └── wsdl/
│   │       ├── CodeEntryLookupCore.wsdl
│   │       ├── EnrollmentSparseCore.wsdl
│   │       ├── EnrollmentSparseLookup.wsdl
│   │       ├── PractitionerLookupCore.wsdl
│   │       ├── SupplierLocationLookup.wsdl
│   │       └── SupplierLookupCore.wsdl
│   ├── INDEX.md
│   ├── specbuilder-docs.md
│   ├── specbuilder-function-structure.md
│   ├── xengine-docs.md
│   └── xeserver-docs.md
└── Refrence/
    ├── Artifact- Payments.md
    ├── Artifact- SecondaryEditing.md
    ├── Artifact-Claims.md
    ├── Artifact-Enrollment.md
    ├── Artifact-EnrollmentAutomation.md
    ├── Artifact-EnrollmentsRepo.md
    ├── Artifacts-ClaimsRepo.md
    ├── Artifacts-CSV_To_837_Automation.md
    ├── ArtifactsRepository/
    │   ├── Claims/
    │   │   ├── IBClaimsCommon/
    │   │   │   ├── Groovy/
    │   │   │   │   ├── IB_837_Audit_Error_Capture.txt
    │   │   │   │   ├── IB_837_Audit_Error_Capture.txt.bak
    │   │   │   │   ├── P_IB_837_API_Token_Reprocess.txt
    │   │   │   │   ├── P_IB_837_Audit.groovy.txt
    │   │   │   │   ├── P_IB_837_AuditErrorCapture.groovy
    │   │   │   │   ├── P_IB_837_ISA_Split.txt
    │   │   │   │   ├── P_IB_837_ISA_Split.txt.bak
    │   │   │   │   └── P_IB_837_Pulse_Report.groovy.txt
    │   │   │   ├── Maps/
    │   │   │   │   ├── P_IB_837_277CA_Map_ControlNumber.empkg
    │   │   │   │   ├── P_IB_837_999_Map_ControlNumber.ems
    │   │   │   │   └── P_IB_837_TA1_Map_ControlNumber.empkg
    │   │   │   ├── SplitRule/
    │   │   │   │   ├── P_IB_837_ClaimsSplit.xml
    │   │   │   │   └── P_IB_837_EDISplit.xml
    │   │   │   └── Velocity/
    │   │   │       ├── Blank.vtmpl
    │   │   │       ├── P_IB_837_ClaimAuditTemplate.vtmpl
    │   │   │       └── P_IB_837_ClaimUnichronTemplate.vtmpl
    │   │   ├── IBClaimsInstitutional/
    │   │   │   ├── Guideline/
    │   │   │   │   ├── P_IB_837I_EDI_SOURCE.ecs
    │   │   │   │   └── P_IB_837I_EDI_TARGET.ecs
    │   │   │   └── Map/
    │   │   │       ├── ~P_IB_837I_X12_to_XML_20251107-011905.ems
    │   │   │       └── P_IB_837I_X12_to_XML.ems
    │   │   ├── IBClaimsProfessional/
    │   │   │   ├── Guideline/
    │   │   │   │   ├── P_IB_837P_EDI_SOURCE.ecs
    │   │   │   │   └── P_IB_837P_EDI_TARGET.ecs
    │   │   │   └── Map/
    │   │   │       └── P_IB_837P_X12_to_XML.ems
    │   │   ├── IBEncounterCommon/
    │   │   │   ├── Groovy/
    │   │   │   │   ├── IB_837_Encounter_ISA_Split.txt
    │   │   │   │   └── IB_837_Encounter_ISA_Split.txt.bak
    │   │   │   ├── Guideline/
    │   │   │   │   └── IB_837P_Encounter_EDI_Target.ecs
    │   │   │   ├── Maps/
    │   │   │   │   ├── IB_Encounter_277CA_Map_ControlNumber.empkg
    │   │   │   │   ├── IB_Encounter_999_Map_ControlNumber.ems
    │   │   │   │   └── IB_Encounter_TA1_Map_ControlNumber.empkg
    │   │   │   └── SplitRule/
    │   │   │       └── IB_837_Encounter_Claims_Split.xml
    │   │   ├── IBEncounterInstitutional/
    │   │   │   ├── Guideline/
    │   │   │   │   └── IB_837I_Encounter_EDI_Source.ecs
    │   │   │   └── Map/
    │   │   │       └── IB_837I_EDI_TO_XML_Encounter.ems
    │   │   ├── IBEncounterProffessional/
    │   │   │   ├── Guideline/
    │   │   │   │   └── IB_837P_Encounter_EDI_Source.ecs
    │   │   │   └── Map/
    │   │   │       └── IB_837P_EDI_TO_XML_Encounter.ems
    │   │   ├── IBRepricerCommon/
    │   │   │   ├── Guideline/
    │   │   │   │   └── IB_REPRICER_XML_TARGET.ecs
    │   │   │   ├── Map/
    │   │   │   │   └── IB_Claims_999ControlNumberGeneration.ems
    │   │   │   ├── Splitrule/
    │   │   │   │   └── IB_837_Repricer_EDISplit.xml
    │   │   │   └── Velocity/
    │   │   │       ├── IB_837_ClaimsRepricerAuditTemplate.vtmpl
    │   │   │       └── IB_837_ClaimsRepricerAuditTemplate.vtmpl.bak
    │   │   ├── IBRepricerInstitutional/
    │   │   │   ├── Guideline/
    │   │   │   │   └── IB_837I_REPRICER_SOURCE.ecs
    │   │   │   └── Map/
    │   │   │       └── IB_REPRICER_837I_To_XML.ems
    │   │   ├── IBRepricerProfessional/
    │   │   │   ├── Guideline/
    │   │   │   │   └── IB_837P_REPRICER_SOURCE.ecs
    │   │   │   └── Map/
    │   │   │       └── IB_REPRICER_837P_To_XML.ems
    │   │   ├── OBRepricerCommon/
    │   │   │   ├── ParserSchema/
    │   │   │   │   └── OB_DFF_Repricer_Parser.ecs
    │   │   │   ├── SplitRule/
    │   │   │   │   ├── OBRepricer_DFF_Split.xml
    │   │   │   │   ├── OBRepricer_EDI_Claim_Split.xml
    │   │   │   │   └── OBRepricer_EDI_Transaction_Split.xml
    │   │   │   └── Velocity/
    │   │   │       ├── OB_837_AuditVelocity_Record_EDI_Failure.vtmpl
    │   │   │       ├── OB_837_AuditVelocity_Record_EDI_Success.vtmpl
    │   │   │       ├── OB_837_AuditVelocity_Success_DFF1_Recieved.vtmpl
    │   │   │       └── OB_837_AuditVelocity_Success_DFF2_IL.vtmpl
    │   │   ├── OBRepricerInstitutional/
    │   │   │   ├── Guideline/
    │   │   │   │   ├── OB_837I_Repricer_EDI_Target.ecs
    │   │   │   │   └── OB_Inst_Repricer_DFF_Source.ecs
    │   │   │   └── Map/
    │   │   │       └── OB_837I_DFF_to_EDI_Repricer.ems
    │   │   └── OBRepricerProffessional/
    │   │       ├── Guideline/
    │   │       │   ├── OB_837P_Repricer_EDI_Target.ecs
    │   │       │   └── OB_Prof_Repricer_DFF_Source.ecs
    │   │       └── Map/
    │   │           └── OB_837P_DFF_TO_EDI_Repricer.ems
    │   ├── ClaimsRepo/
    │   │   ├── Groovy/
    │   │   │   ├── IB_837REPO_CounterGroovy - Copy.groovy
    │   │   │   ├── IB_837REPO_CounterGroovy.groovy
    │   │   │   └── IB_837REPO_CounterGroovy.groovy.bak
    │   │   ├── Guideline/
    │   │   │   └── P_IB_837REPO_DFF_TARGET.ecs
    │   │   ├── Map/
    │   │   │   ├── P_IB_837I_REPO_X12_To_DFF.ems
    │   │   │   └── P_IB_837P_REPO_X12_To_DFF.ems
    │   │   ├── ParserSchema/
    │   │   │   └── P_IB_837REPO_Parserschema.ecs
    │   │   └── Velocity/
    │   │       ├── IB_837_ClaimsRepoVelocity.vtmpl
    │   │       └── IB_837_ClaimsRepoVelocity.vtmpl.bak
    │   ├── CSV_To_837_Automation/
    │   │   └── CSV_TO_837_Automation_Professional/
    │   │       ├── Guideline/
    │   │       │   ├── CSV_837P_Automation_EDI_TARGET.ecs
    │   │       │   └── CSV_Prof_Automation_SOURCE.ecs
    │   │       └── Map/
    │   │           └── CSV_TO_EDI_837P_Map.ems
    │   ├── Enrollment/
    │   │   ├── IBEnrollmentADV/
    │   │   │   ├── Groovy/
    │   │   │   │   ├── Advantasure_Pulse.txt
    │   │   │   │   ├── DFF_Audit_Report
    │   │   │   │   ├── DFF_Audit_Report.bak
    │   │   │   │   ├── DFF_Ordering
    │   │   │   │   ├── DFF_Ordering.bak
    │   │   │   │   ├── P_IB_ADV_834_API_Token_Reprocess.txt
    │   │   │   │   ├── Update_Header
    │   │   │   │   └── Update_Header.bak
    │   │   │   ├── Guideline/
    │   │   │   │   ├── P_IB_DFF_SOURCE.ecs
    │   │   │   │   ├── P_IB_DFF_To_XML.ems
    │   │   │   │   └── P_IB_XML_TARGET.ecs
    │   │   │   ├── Map/
    │   │   │   │   └── P_IB_DFF_To_XML.ems
    │   │   │   ├── Parser/
    │   │   │   │   ├── P_IB_834_DFF_Parser.ecs
    │   │   │   │   └── P_IB_834_XE_Native _Parser.ecs
    │   │   │   ├── SplitRule/
    │   │   │   │   └── P_IB_DFF_MessageSplit.xml
    │   │   │   └── Velocity/
    │   │   │       ├── Blank.vtmpl
    │   │   │       ├── P-IB-ADV-834-EnrollmentAuditTemplate
    │   │   │       └── P-IB-ADV-834-EnrollmentAuditTemplate.bak
    │   │   ├── IBEnrollmentCommercial/
    │   │   │   └── Map/
    │   │   │       ├── P_IB_834_X12_to_XML_Commercial_backUp.ems
    │   │   │       └── P_IB_834_X12_to_XML_Commercial.ems
    │   │   ├── IBEnrollmentCommon/
    │   │   │   ├── Groovy/
    │   │   │   │   ├── .bak
    │   │   │   │   ├── IB_834_API_Token_Reprocess.groovy
    │   │   │   │   ├── P_IB_834_AuditErrorCapture.groovy
    │   │   │   │   ├── P_IB_834_AuditErrorCapture.groovy.bak
    │   │   │   │   ├── P_IB_834_AuditJson.groovy
    │   │   │   │   ├── P_IB_834_Pulse_HeaderUpdate.groovy
    │   │   │   │   ├── P_IB_834_Pulse_Report.groovy
    │   │   │   │   └── P-IB-834-RecordIdentifier.groovy
    │   │   │   ├── Guideline/
    │   │   │   │   ├── P_IB_834_EDI_SOURCE.ecs
    │   │   │   │   └── P_IB_834_EDI_TARGET.ecs
    │   │   │   ├── SplitRule/
    │   │   │   │   ├── P_IB_834_EDIFamilySplit.xml
    │   │   │   │   └── P_IB_834_EDISplit.xml
    │   │   │   └── Velocity/
    │   │   │       ├── Blank.vtmpl
    │   │   │       └── IB_834_EnrollmentUnichronTemplate.vtmpl
    │   │   ├── IBEnrollmentMedicaid/
    │   │   │   └── Map/
    │   │   │       ├── ~P_IB_834_X12_to_XML_Medicaid_20251219-020757.ems
    │   │   │       ├── ~P_IB_834_X12_to_XML_Medicaid_20251224-023751.ems
    │   │   │       ├── P_IB_834_X12_to_XML_Medicaid - BackUp.ems
    │   │   │       ├── P_IB_834_X12_to_XML_Medicaid.ems
    │   │   │       └── P_IB_834_X12_to_XML_Medicaid.ems.bak
    │   │   ├── IBEnrollmentMedicare/
    │   │   │   └── Map/
    │   │   │       ├── P_IB_834_X12_to_XML_Medicare - BackUp.ems
    │   │   │       └── P_IB_834_X12_to_XML_Medicare.ems
    │   │   └── OBEnrollment/
    │   │       ├── Common/
    │   │       │   └── Velocity/
    │   │       │       ├── OB_834_Audit_JSON.vtmpl
    │   │       │       └── OB_834_Audit_JSON.vtmpl.bak
    │   │       ├── Guideline/
    │   │       │   ├── OB_834_EDI_TARGET - Copy.ecs
    │   │       │   ├── OB_834_EDI_TARGET - Copy.ecs.bak
    │   │       │   ├── OB_834_EDI_TARGET.csv
    │   │       │   ├── OB_834_EDI_TARGET.ecs
    │   │       │   └── OB_834_XML_SOURCE.ecs
    │   │       └── Map/
    │   │           ├── ~OB_834_Member_Sorting_Same_Family_Per_ST-SE_QTY_20260408-055350.ems
    │   │           ├── OB_834_Member_Sorting_Map.ems
    │   │           ├── OB_834_Member_Sorting_Same_Family_Per_ST-SE_copy.ems
    │   │           ├── OB_834_Member_Sorting_Same_Family_Per_ST-SE_QTY.ems
    │   │           ├── OB_834_Member_Sorting_Same_Family_Per_ST-SE_QTY.ems.bak
    │   │           ├── OB_834_XML_TO_X12_mergerkey.ems
    │   │           ├── OB_834_XML_TO_X12.ems
    │   │           └── POC-Maps/
    │   │               ├── ~OB_834_Member_Sorting_Same_Family_Per_ST-SE_20251218-012916.ems
    │   │               ├── ~OB_834_Member_Sorting_Single_ST-SE_20251218-040203.ems
    │   │               ├── ~OB_834_Member_Sorting_Single_ST-SE_20260105-054112.ems
    │   │               ├── OB_834_Member_Sorting_Same_Family_Per_ST-SE.ems
    │   │               ├── OB_834_Member_Sorting_Same_Family_Per_ST-SE.ems.bak
    │   │               ├── OB_834_Member_Sorting_Single_ST-SE.ems
    │   │               └── OB_834_Member_Sorting_Single_ST-SE.ems.bak
    │   ├── EnrollmentAutomation/
    │   │   ├── IBEnrollment834/
    │   │   │   ├── Guideline/
    │   │   │   │   └── IB_834_Automation_EDI_Source.ecs
    │   │   │   ├── Map/
    │   │   │   │   └── IB_834_Automation_Map.ems
    │   │   │   ├── Parser/
    │   │   │   │   └── IB_834_Automation_ParserSchema.ecs
    │   │   │   ├── SplitRule/
    │   │   │   │   └── IB_834_Automation_EDI_Splitrule.xml
    │   │   │   └── Template/
    │   │   │       ├── IB_834_Automation_Header.txt
    │   │   │       └── IB_834_Automation_Header.txt.bak
    │   │   └── IBEnrollmentADV/
    │   │       ├── Groovy/
    │   │       │   ├── P_IB_DFF_Ordering.txt
    │   │       │   └── P_IB_DFF_Ordering.txt.bak
    │   │       ├── Guideline/
    │   │       │   └── P_IB_DFF_AUTOMATION_SOURCE.ecs
    │   │       ├── Map/
    │   │       │   └── P_IB_DFF_CSV_AUTOMATION.ems
    │   │       ├── Parser/
    │   │       │   ├── P_IB_DFF_Parser.ecs
    │   │       │   └── P_IB_DFF_XE_Native_Parser.ecs
    │   │       ├── SplitRule/
    │   │       │   └── P_IB_DFF_Splitrule.xml
    │   │       └── Template/
    │   │           ├── P_IB_CSV_Header.txt
    │   │           └── P_IB_CSV_Header.txt.bak
    │   ├── EnrollmentsRepo/
    │   │   ├── Groovy/
    │   │   │   └── IB_834REPO_CounterGroovy.groovy
    │   │   ├── Guideline/
    │   │   │   ├── P_IB_834REPO_DFF_TARGET.ecs
    │   │   │   └── P_IB_834REPO_EDI_SOURCE.ecs
    │   │   ├── Map/
    │   │   │   └── P_IB_834REPO_X12_To_DFF.ems
    │   │   ├── ParserSchema/
    │   │   │   └── P_IB_834REPO_DFF_Parser.ecs
    │   │   ├── SplitRule/
    │   │   │   └── P_IB_834REPO_EDISplit.xml
    │   │   └── Velocity/
    │   │       └── IB_834_EnrollmentsRepoVelocity.vtmpl
    │   ├── Payments/
    │   │   ├── Groovy/
    │   │   │   ├── P_OB_835_API_Token_Reprocess.txt
    │   │   │   ├── P_OB_835_ControlReportGroovy.groovy
    │   │   │   ├── P_OB_835_ControlReportGroovy.groovy.bak
    │   │   │   ├── P_OB_835_ErrorCaptureGroovy.groovy
    │   │   │   ├── P_OB_835_ErrorCaptureGroovy.groovy.bak
    │   │   │   ├── P_OB_835_PulseReportGroovy.groovy
    │   │   │   └── P_OB_835_PulseReportGroovy.groovy.bak
    │   │   ├── Guideline/
    │   │   │   ├── P_OB_835_DFF_SOURCE.ecs
    │   │   │   ├── P_OB_835_X12_SOURCE_ControlReport.ecs
    │   │   │   └── P_OB_835_X12_TARGET.ecs
    │   │   ├── IBPayments/
    │   │   │   ├── IBPFFPayments/
    │   │   │   │   ├── IBPaymentsCheckReconciliation/
    │   │   │   │   │   ├── Groovy/
    │   │   │   │   │   │   └── IB_Payments_CheckRecon_Groovy.txt
    │   │   │   │   │   ├── Guideline/
    │   │   │   │   │   │   └── IB_Payments_CheckRecon_PFF_Source.ecs
    │   │   │   │   │   ├── Map/
    │   │   │   │   │   │   └── IB_Payments_CheckRecon_PFF_to_XML.ems
    │   │   │   │   │   └── ParserSchema/
    │   │   │   │   │       └── IB_Payments_Parser_Schema_Check_Reconciliation.ecs
    │   │   │   │   ├── IBPaymentsCommon/
    │   │   │   │   │   ├── Groovy/
    │   │   │   │   │   │   ├── IB_Payments_Error_Capture_Groovy.txt
    │   │   │   │   │   │   └── IB_Payments_Error_Capture_Groovy.txt.bak
    │   │   │   │   │   ├── Guideline/
    │   │   │   │   │   │   └── IB_Payments_XML_Target.ecs
    │   │   │   │   │   ├── SplitRule/
    │   │   │   │   │   │   └── IB_Payments_SplitRule.xml
    │   │   │   │   │   └── Velocity/
    │   │   │   │   │       ├── IB_Payments_Audit_Template.vtmpl
    │   │   │   │   │       └── IB_Payments_Audit_Template.vtmpl.bak
    │   │   │   │   └── IBPaymentsProviderSettlement/
    │   │   │   │       ├── Groovy/
    │   │   │   │       │   └── IB_Payments_Provider_Settlement_Groovy.txt
    │   │   │   │       ├── Guideline/
    │   │   │   │       │   └── IB_Payments_ProviderSettlement_PFF_Source.ecs
    │   │   │   │       ├── Map/
    │   │   │   │       │   └── IB_Payments_ProviderSettlement_PFF_to_XML.ems
    │   │   │   │       └── ParserSchema/
    │   │   │   │           └── IB_Payments_Parser_Schema_ProviderSettlement.ecs
    │   │   │   └── IBZelisPayments/
    │   │   │       └── IBZelisPaymentsCommon/
    │   │   │           ├── Groovy/
    │   │   │           │   ├── IB_Zelis_Payments_AuditSplit_Groovy.groovy
    │   │   │           │   ├── IB_Zelis_Payments_AuditSplit_Groovy.groovy.bak
    │   │   │           │   ├── IB_Zelis_Payments_JsonValidation_Groovy.groovy
    │   │   │           │   └── IB_Zelis_Payments_JsonValidation_Groovy.groovy.bak
    │   │   │           ├── Guideline/
    │   │   │           │   └── IB_Zelis_Payments_Json_Source.ecs
    │   │   │           ├── Severity/
    │   │   │           │   ├── IB_Zelis_Payment_Severity.esf
    │   │   │           │   └── IB_Zelis_Payment_Severity.esf.bak
    │   │   │           ├── SplitRule/
    │   │   │           │   └── IB_Zelis_Payments_SplitRule.xml
    │   │   │           └── Velocity/
    │   │   │               ├── IB_Zelis_Payments_FileLevel_Template.vtmpl
    │   │   │               ├── IB_Zelis_Payments_FileLevel_Template.vtmpl.bak
    │   │   │               ├── IB_Zelis_Payments_RecordLevel_Template.vtmpl
    │   │   │               └── IB_Zelis_Payments_RecordLevel_Template.vtmpl.bak
    │   │   ├── Map/
    │   │   │   └── P_OB_835_DFF_to_EDI.ems
    │   │   ├── ParserSchema/
    │   │   │   └── P_OB_835_DFF.ecs
    │   │   └── Velocity/
    │   │       ├── Blank.vtmpl
    │   │       ├── OB_835_AuditVelocity.vtmpl
    │   │       └── OB_835_AuditVelocity.vtmpl.bak
    │   └── SecondaryEditing/
    │       ├── IBSecondaryClaimsCommon/
    │       │   ├── Groovy/
    │       │   │   ├── IB_SecondaryClaims_Audit_Step.txt
    │       │   │   ├── IB_SecondaryClaims_Audit_Step.txt.bak
    │       │   │   ├── IB_SecondaryClaims_PrefixScrub.txt
    │       │   │   ├── IB_SecondaryClaims_PrefixScrub.txt.bak
    │       │   │   ├── IB_SecondaryClaims_Split.txt
    │       │   │   └── IB_SecondaryClaims_Split.txt.bak
    │       │   ├── Guideline/
    │       │   │   └── IB_SecondaryClaims_XML_Target.ecs
    │       │   ├── SplitRule/
    │       │   │   └── IB_SecondaryClaims_DFF_MessageSplit.xml
    │       │   └── Velocity/
    │       │       ├── IB_SecondaryClaim_AuditTemplate
    │       │       └── IB_SecondaryClaim_AuditTemplate.bak
    │       ├── IBSecondaryClaimsCotivitiInstitutional/
    │       │   ├── Guideline/
    │       │   │   ├── IB_SecondaryClaims_Inst_Cotiviti_DFF_Translation_SOURCE.ecs
    │       │   │   └── IB_SecondaryClaims_Inst_Cotiviti_DFF_Validation_SOURCE.ecs
    │       │   ├── Map/
    │       │   │   └── IB_SecondaryClaims_Inst_Cotiviti_DFF_To_XML.ems
    │       │   └── parser/
    │       │       ├── IB_SecondaryClaims_Inst_Cotiviti_CustomParser.ecs
    │       │       └── IB_SecondaryClaims_Inst_Cotiviti_Parser.ecs
    │       ├── IBSecondaryClaimsCotivitiProfessional/
    │       │   ├── Guideline/
    │       │   │   ├── IB_SecondaryClaims_Prof_Cotiviti_DFF_Translation_SOURCE.ecs
    │       │   │   └── IB_SecondaryClaims_Prof_Cotiviti_DFF_Validation_SOURCE.ecs
    │       │   ├── Map/
    │       │   │   └── IB_SecondaryClaims_Prof_Cotiviti_DFF_To_XML.ems
    │       │   └── parser/
    │       │       ├── IB_SecondaryClaims_Prof_Cotiviti_CustomParser.ecs
    │       │       └── IB_SecondaryClaims_Prof_Cotiviti_Parser.ecs
    │       ├── IBSecondaryClaimsEvicore/
    │       │   ├── Guideline/
    │       │   │   ├── IB_SecondaryClaims_Evicore_DFF_Translation_SOURCE.ecs
    │       │   │   └── IB_SecondaryClaims_Evicore_DFF_Validation_SOURCE.ecs
    │       │   ├── Map/
    │       │   │   └── IB_SecondaryClaims_Evicore_DFF_To_XML.ems
    │       │   └── Parser/
    │       │       ├── IB_SecondaryClaims_Evicore_CustomParser.ecs
    │       │       └── IB_SecondaryClaims_Evicore_Parser.ecs
    │       ├── IBSecondaryClaimsOptum/
    │       │   ├── Guideline/
    │       │   │   ├── IB_SecondaryClaims_Optum_DFF_Translation_SOURCE.ecs
    │       │   │   └── IB_SecondaryClaims_Optum_DFF_Validation_SOURCE.ecs
    │       │   ├── Map/
    │       │   │   └── IB_SecondaryClaims_Optum_DFF_To_XML.ems
    │       │   └── Parser/
    │       │       ├── IB_SecondaryClaims_Optum_CustomParser.ecs
    │       │       └── IB_SecondaryClaims_Optum_Parser.ecs
    │       └── Test.properties
    ├── BA-Mapping-Sheet.md
    ├── Claims/
    │   ├── P_IB_837I_X12_to_XML_split 3 1.ems
    │   ├── P_IB_837I_X12_to_XML_split 4 1.ems
    │   ├── P_IB_837P_X12_to_XML.ems
    │   └── P_IB_837P_XML_To_XML.ems
    ├── Claims-EMS.md
    └── INDEX.md
```
