---
name: edi-mapping-specs
description: The business-analyst mapping-spec crosswalks (BA Files) plus the X12 SEF structure guides. Use to answer "what does field X map to", find a source→target crosswalk, look up default/hard-coded values or enumerations, or determine X12 segment/loop/element structure and cardinality for 834/837/835/278/277CA/275. Read the crosswalk from BA Files and the transaction's SEF guide; do not fabricate mappings.
---

# Mapping Specs & EDI Structure

Two authoritative, complementary sources for a mapping:

## 1. The crosswalks — `BA Files/`

Per-transaction analyst mapping specs: which EDI segment/element maps to which target field,
with usage, enumerations, default/hard-coded values, and notes.

- `BA Files/INDEX.md` — catalog of the sheets; start here to locate one.
- `BA Files/optimized/**/*.csv` — one CSV per worksheet, in the source folder tree (by
  transaction area, version, `Archive/`, `Sample Input/`). Grep these directly, e.g.
  `rg -n "NM103" "BA Files/optimized/Enrollment IB"`.
- `BA Files/bundles/*.md` — the same sheets grouped per transaction area for reading.

Transaction areas: Advantasure IB, Authorization IB, Claims IB, Claims OB (incl. Clover PDM
rosters), EDI 275 Attachment Service, Encounter IB, Enrollment IB/OB, Payment IB/OB, PULSE,
QA Automation, Repository, Repricer OB-IB, Secondary Editing IB/OB.

Prefer the newest version (folder root) over `Archive/`. Never invent a mapping: if a
source→target pair is not in a sheet, say it is not documented.

## 2. The X12 structure — `Edifecs/Guide/*.sef`

SEF implementation guides for **834, 837I, 837P** define the transaction structure (loops,
segments, elements, codes, cardinality). Use them for questions like "is segment X mandatory
in loop Y", "what elements are in segment Z", "what codes are valid for element E".

- Read `references/sef-format.md` first — it explains the SEF `.SETS`/`.SEGS` notation and
  requirement designators (M/O/C, `!`, `.`, `>1`, masks).
- These files are ~1–1.6 MB; grep for the specific loop/segment/element, never read whole.
- For code/value translation, also check `Edifecs/Crosswalk/*.crsw`.

## Reference

- `references/sef-format.md` — how to read the SEF guides.
- `references/edi-glossary.md` — X12 / Edifecs terms and the three repo layers.

## Related

- Target field/path resolution → skill `hrp-26-1-schemas` (always confirm the target exists).
- Edifecs map/function behavior → skill `edifecs-specbuilder`.
- If X12/HIPAA structure isn't covered by the SEF here, search the web for the X12 5010
  implementation guide and note it is external.