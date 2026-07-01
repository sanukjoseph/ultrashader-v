# Refrence Folder Index

```text
Refrence/
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
└── Claims-EMS.md

```