---
name: edifecs-specbuilder
description: Authoritative reference for how Edifecs works — SpecBuilder maps, functions, guidelines, XEngine/XEServer runtime, EAM, and reading .ems/.ecs/.crsw artifacts. Use whenever explaining, tracing, debugging, or authoring Edifecs map/guideline/function behavior, or when interpreting a transformation map. Always consult the bundled Edifecs docs before answering from general knowledge; web-search only if the docs do not cover it.
---

# Edifecs SpecBuilder / XEngine (source of truth)

The `Edifecs/*.md` files are the official Edifecs 9.4 documentation (scraped from Edifecs help).
Treat them as the source of truth for Edifecs behavior. Do not answer Edifecs questions from
memory; quote the relevant doc section. These docs are large (1–2 MB) — grep for the specific
topic, do not read whole.

## Which doc to consult

- `Edifecs/specbuilder-docs.md` — SpecBuilder 9.4 (847 pages): guidelines, maps, mapping
  functions, expressions, code lists, validation. Primary source for **how a map works**.
- `Edifecs/specbuilder-function-structure.md` — MapEditor project/function structure.
- `Edifecs/xengine-docs.md` — XEngine runtime (how maps execute at runtime).
- `Edifecs/xeserver-docs.md` — XEServer (hosting/serving transforms).
- `Edifecs/eam-docs.md` — Edifecs Application Manager (operations/monitoring, 507 pages).
- `Edifecs/ECTools-Documentation.md` — ECTools utilities.
- `Edifecs/INDEX.md` — index of the Edifecs folder.

## Reading map artifacts (`Refrence/ArtifactsRepository/`)

- `.ems` — Edifecs transformation map (source guideline → target guideline).
- `.ecs` — SpecBuilder guideline (EDI SOURCE/TARGET). Excluded from Git; restore from
  SpecBuilder when needed (see `README.md`).
- `.crsw` — crosswalk / code-value lookup (see `Edifecs/Crosswalk/Crosswalk-Documentation.md`).
- `.empkg` — packaged map. Groovy scripts and Velocity (`.vtmpl`) templates hold custom logic.
- Per-domain orientation: `Refrence/Artifact*.md` (e.g. `Artifact-Enrollment.md`, `Claims-EMS.md`).

The compact map-XML notation used in these artifacts is decoded at the top of
`Edifecs/HRP_26_1_Upgrade/Mapping-HRP_26_1.md` (schema dictionary: `CP`=ConnectionPoint,
`P`=Property, `F`=Function, `C`=Connector, etc.). Read that legend before interpreting map XML.

## Rules

- Ground every Edifecs claim in a doc section you actually read; cite the file.
- If the docs do not cover a version-specific detail, search the web (Edifecs help /
  release notes) and say the answer came from outside the repo.
- For the mapping target schema, defer to skill `hrp-26-1-schemas`; for X12 structure, to
  the SEF guides via `edi-mapping-specs`.