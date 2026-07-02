---
name: edi-mapping-navigator
description: Entry point for any EDI mapping work in this Edifecs↔HealthEdge HRP repository. Use whenever the user asks to trace, validate, explain, or author a mapping between an X12 transaction (834, 837, 835, 278, 277CA, 275) and HRP/XML/DFF, mentions Edifecs, SpecBuilder, a segment/loop/element, or a target field — even if they don't name a file. Routes to the right source of truth and the other mapping skills.
---

# EDI Mapping Navigator

Orchestrates mapping work in this repository. The repository maps X12 EDI to/from the
**HealthEdge HealthRules Payer (HRP) 26.1** connector schemas using **Edifecs** SpecBuilder /
XEngine. Read `CLAUDE.md` at the repo root first if you have not — it holds the golden rules.

## Always follow the source-of-truth order

For a mapping question, resolve each layer against the authoritative source; do not answer from
general knowledge, and do not guess:

1. **How does Edifecs do this?** → skill `edifecs-specbuilder` (the `Edifecs/*.md` product docs).
2. **What is the target field/path?** → skill `hrp-26-1-schemas` (the `Edifecs/HRP_26_1_Upgrade`
   XSDs). Never invent a HealthEdge path.
3. **What is the X12 structure (segment/loop/element/code)?** → the SEF guide via skill
   `edi-mapping-specs` (`Edifecs/Guide/*.sef`).
4. **What is the documented crosswalk?** → skill `edi-mapping-specs` (`BA Files/`).
5. **How is it actually implemented?** → the runtime map in `Refrence/ArtifactsRepository/`
   (see the per-domain notes `Refrence/Artifact*.md`).

## Routing examples

- "What does 834 DMG02 map to in HRP?" → SEF (834 structure) + BA spec (crosswalk) + HRP XSD
  (confirm the target path exists) — combine all three.
- "How does this Edifecs map handle X / what does this function do?" → `edifecs-specbuilder`.
- "Is REF mandatory in loop 2000A of 837P?" → SEF guide, via `edi-mapping-specs`.
- "Where is the target `enrollment-sparse` path defined?" → `hrp-26-1-schemas`.

## Discipline

- Locate before reading: use `Refrence/INDEX.md`, `Edifecs/INDEX.md`, and `BA Files/INDEX.md`
  to find the file, then grep the specific segment/loop/element/path — files are large.
- If a fact is not in these internal sources (external X12/HIPAA rules, HealthEdge/Edifecs
  behavior beyond the docs), search the web and cite it.
- Never fabricate a mapping. If it is not documented, say so.