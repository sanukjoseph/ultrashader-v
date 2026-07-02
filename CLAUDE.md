# CLAUDE.md — Edifecs ↔ HealthEdge HRP EDI Mapping Repository

Reference/knowledge repository for a health-plan EDI integration built on **Edifecs**
(SpecBuilder / XEngine / EAM). It maps X12 transactions (834, 837I/P, 835, 278, 277CA, 275)
to and from the **HealthEdge HealthRules Payer (HRP)** 26.1 connector schemas and internal
DFF/XML/CSV/JSON. This is not a build project; there are no build/test commands. The work is
reading, tracing, validating, and authoring **mappings**.

## Source-of-truth hierarchy (consult in this order; do not rely on memory)

1. **How Edifecs works** → `Edifecs/*.md` (SpecBuilder, XEngine, EAM, XEServer, ECTools docs,
   scraped from Edifecs 9.4 help). Authoritative for map/function/guideline behavior.
2. **Mapping TARGET structure** → `Edifecs/HRP_26_1_Upgrade/**/*.xsd` and `wsdl/` (HealthEdge
   HRP 26.1 PRIME-services connector schemas). Authoritative for every target XML path/field.
3. **X12 EDI structure** → `Edifecs/Guide/*.sef` (834, 837I, 837P SEF guides) and
   `Edifecs/Crosswalk/*.crsw`. Authoritative for segments, loops, elements, codes, cardinality.
4. **The crosswalks (what maps to what)** → `BA Files/` (analyst mapping specs: `optimized/*.csv`,
   `bundles/*.md`, `INDEX.md`).
5. **The implemented transformations** → `Refrence/ArtifactsRepository/` (Edifecs maps `.ems`,
   guidelines, Groovy, Velocity, SplitRules) with per-domain notes in `Refrence/Artifact*.md`.

## Golden rules

- **Mapping is the goal.** For any mapping question, work top-down through the hierarchy above.
- **Resolve every target path against the HRP 26.1 XSD** — never invent or guess a HealthEdge
  field/path. If a path is not in the schema, say so.
- **For Edifecs behavior, quote the Edifecs docs**, not general knowledge. If the docs don't
  cover it, say so and then search the web.
- **For X12 structure, read the transaction's SEF guide** before answering.
- **Never fabricate a mapping.** If a source→target mapping is not in `BA Files/` or a
  `Refrence/` map, state that it is not present rather than inferring one.
- **Use web search when internal sources don't cover it** (external X12/HIPAA rules, HealthEdge
  or Edifecs product behavior beyond the bundled docs, standards versions). Cite what you find.
- **These files are large** (docs 1–2 MB, `.ecs` up to 12 MB, SEF ~1.6 MB). Always grep/slice
  the relevant segment, loop, element, or sheet — never read a whole file into context.

## Layout

- `BA Files/` — mapping specs (crosswalks) by transaction area, plus bundles and INDEX.
- `Edifecs/` — Edifecs product docs (`*.md`), SEF guides (`Guide/`), crosswalks (`Crosswalk/`),
  and the **HRP 26.1** schemas (`HRP_26_1_Upgrade/`).
- `Refrence/ArtifactsRepository/` — the runtime maps and scripts, by domain.

## Skills (in `.claude/skills/`; each explains when it applies)

- `edi-mapping-navigator` — start here: routing + the source-of-truth workflow above.
- `edifecs-specbuilder` — how Edifecs maps/functions/guidelines work (the product docs).
- `hrp-26-1-schemas` — the HRP 26.1 target schemas and how to resolve target paths.
- `edi-mapping-specs` — the BA crosswalks and the SEF/EDI structure reference.

## Conventions

- **IB / OB** = inbound (into HRP) / outbound (to a trading partner).
- **Versioning**: newest version at the folder root; superseded ones under `Archive/`;
  example inputs under `Sample Input/` (and `Bak/`).
- Repo hygiene: `*.ecs` guideline exports are excluded from Git (see `README.md`); restore
  from Edifecs SpecBuilder when a task needs one.


  