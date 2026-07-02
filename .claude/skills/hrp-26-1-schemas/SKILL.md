---
name: hrp-26-1-schemas
description: Authoritative HealthEdge HealthRules Payer (HRP) 26.1 target schemas — the PRIME-services connector XSDs and WSDLs that inbound EDI maps into (enrollment, enrollment-sparse, cobPolicy, providerlookup, subsidy, memberFactors, etc.). ALWAYS use this to resolve or validate any mapping TARGET XML path or field, and whenever HRP, HealthEdge, connector, enrollment-sparse, or a 26.1 schema is involved. Never guess a HealthEdge path — confirm it against the XSD.
---

# HRP 26.1 Target Schemas (source of truth for mapping targets)

HRP = **HealthEdge HealthRules Payer**, a health-plan core administrative processing system.
Inbound EDI (e.g. 834 enrollment) is transformed into HRP's **HealthRules Connector**
PRIME-services schemas. The 26.1 versions of those schemas live in
`Edifecs/HRP_26_1_Upgrade/` and are the authoritative definition of every target path/field.

**Always resolve a mapping target against the specific XSD here. Never invent a HealthEdge
field or path.** If a target path in a spec does not exist in the schema, flag it.

## Where things are

- `PRIME_SERVICES_XSD/connector-enrollment/` — `enrollment.xsd`, `membership.xsd`,
  `subscription.xsd`, `enrollment-lookup.xsd`.
- `PRIME_SERVICES_XSD/connector-enrollmentsparse/` — `enrollment-sparse.xsd`,
  `enrollment-types.xsd`, `membership-sparse.xsd`, `subscription-sparse.xsd`, plus lookup/response.
  (Inbound 834 maps predominantly into the **enrollment-sparse** shape.)
- `PRIME_SERVICES_XSD/connector-common-schema/` — `base-types.xsd` (String50Type etc.),
  country/state codes, phone, match-input. Element types resolve here.
- Other connectors: `connector-cobpolicy`, `connector-codeentrylookup`, `connector-medicarehicn`,
  `connector-membercomplianceprogram`, `connector-memberfactors`, `connector-payeebankaccounts`,
  `connector-providerlookup`, `connector-subsidy`, `connector-supplierlocationlookup`,
  and `membercarereserve.xsd`.
- `WRAPPER_XSD/` — batch request/response wrappers and `header.xsd`.
- `wsdl/` — service definitions (EnrollmentSparseCore, CodeEntryLookupCore, PractitionerLookupCore,
  SupplierLocationLookup, etc.).
- `Mapping-HRP_26_1.md` — internal notes on the 26.1 mapping (and the map-XML legend).

## Target namespaces (root of target paths)

All under `http://www.healthedge.com/connector/schema/…`: `basetypes`, `enrollment`,
`enrollmentsparse`, `enrollmenttypes`, `membership`, `membershipsparse`, `subscription`,
`cobpolicy`, `codeentrylookup`, `medicarehicn`, `membercomplianceprogram`, `memberfactors`,
`payeebankaccounts`, `providerlookup`, `subsidy`, `membercarereserve`, `matchinput`.

## How to resolve a target path

1. Identify the connector from the path/context (e.g. `enrollment-sparse` → enrollmentsparse XSDs).
2. Open that XSD (and its imports, esp. `enrollment-types.xsd`, `base-types.xsd`); grep the
   element name — do not read the whole schema.
3. Confirm the element exists, its type, cardinality (`minOccurs`/`maxOccurs`), and any
   enumeration; read the `<xs:documentation>` for meaning.
4. Report the resolved path/type, or state clearly if it is not defined.

For Edifecs map behavior see skill `edifecs-specbuilder`; for the crosswalk data see
`edi-mapping-specs`. If a schema question is version-specific and unclear, search the web for
HealthEdge HealthRules Connector documentation and note it is external.