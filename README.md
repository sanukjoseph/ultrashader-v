# ultrashader-v

Reference repository for a health-plan **Edifecs** EDI integration. It collects, in one place,
the business mapping specifications, the EDI technical guides, and the runtime transformation
artifacts used to move X12 transactions (834, 837I/P, 835, 278, 277CA, 275) to and from the
platform's internal representations (XML, DFF, CSV, JSON).

The repository is organized into three layers:

| Layer | Folder | Purpose |
| --- | --- | --- |
| 1. Business mapping specs | `BA Files/` | Source ↔ target field crosswalks (the "what maps to what"), by transaction. |
| 2. EDI technical guides | `Edifecs/` | Implementation guides (SEF), target schemas (XSD/WSDL), code crosswalks, upgrade sets. |
| 3. Runtime logic | `Refrence/ArtifactsRepository/` | The actual maps, guidelines, and scripts that perform each transformation. |

---

## First: remove the large `.ecs` guideline files from Git

Before anything else, take the Edifecs SpecBuilder guideline exports (`*.ecs`) out of version
control. There are **63** of them totalling **~119 MB** — more than half the repository — and
they bloat every clone and pull. They are large derived guideline files and should be restored
from Edifecs SpecBuilder / the source of truth rather than tracked here.

1. Add the provided `.gitignore` to the repository root (it already lists `*.ecs`).
2. Stop tracking the files that are already committed (this removes them from Git's index
   but leaves the files on disk; `.gitignore` then keeps them from being re-added):

   ```bash
   # Quote the pattern so Git — not the shell — expands it across all folders
   git rm --cached -- '*.ecs'
   ```

3. Commit the change:

   ```bash
   git add .gitignore
   git commit -m "Stop tracking large .ecs guideline exports; add .gitignore"
   ```

4. Verify none remain tracked:

   ```bash
   git ls-files '*.ecs'   # should print nothing
   ```

Note: the above removes the files going forward. They still exist in prior commits, so a fresh
clone's history remains large until history is rewritten (e.g. with `git filter-repo`). Do that
separately only if repository size in history is a concern.

---

## Repository layout

```text
ultrashader-v/
├── README.md
├── .gitignore
├── BA Files/            # Layer 1 — business mapping specifications
│   ├── INDEX.md         # index of the mapping-spec sheets
│   ├── bundles/         # one markdown bundle per transaction area (16 files)
│   └── optimized/       # the mapping-spec sheets as CSV, mirroring the source tree
│       ├── Advantasure IB/            Authorization IB/     Claims IB/
│       ├── Claims OB/  (incl. Clover PDM Rosters/ …)        EDI 275 Attachment Service/
│       ├── Encounter IB/              Enrollment IB/        Enrollment OB/
│       ├── Payment IB/                Payment OB/           PULSE/
│       ├── QA Automation/             Repository/           Repricer OB-IB/
│       └── Secondary Editing IB/      Secondary Editing OB/
├── Edifecs/             # Layer 2 — EDI technical guides
│   ├── Guide/           # SEF implementation guides (834, 837I, 837P)
│   ├── Crosswalk/       # code / value crosswalks (.crsw)
│   ├── HRP_26_1_Upgrade/# PRIME_SERVICES_XSD/, WRAPPER_XSD/, wsdl/ for the 26.1 upgrade
│   └── *.md             # SpecBuilder / XEngine / EAM tool documentation
└── Refrence/            # Layer 3 — runtime transformation artifacts
    └── ArtifactsRepository/
        ├── Claims/        # IB/OB × Common/Institutional/Professional (Claims, Encounter, Repricer)
        ├── ClaimsRepo/    Enrollment/         EnrollmentAutomation/   EnrollmentsRepo/
        ├── Payments/      SecondaryEditing/   CSV_To_837_Automation/
        └── …              # each project holds: Guideline/  Map(s)/  Groovy/  Velocity/  SplitRule/
```

---

## Layer 1 — `BA Files/` (mapping specifications)

The analyst-facing crosswalks: for each transaction, which EDI segment/element maps to which
internal field, with usage, enumerations, default/hard-coded values, and notes.

- `optimized/` — **416** CSV sheets, one per worksheet of each mapping-spec workbook, arranged
  in the same folder tree as the source (by transaction area, version, and Archive/Sample).
- `bundles/` — **16** markdown files, one per top-level transaction area, grouping that area's
  sheets for easy reading.
- `INDEX.md` — catalog of the sheets. `1` supporting `.txt` note is also included.

Transaction areas: Advantasure IB, Authorization IB, Claims IB, Claims OB (including the Clover
PDM provider rosters — Cooper, Delegated, Minute Clinic, Northside, Penn, Piedmont, SantechI),
EDI 275 Attachment Service, Encounter IB, Enrollment IB, Enrollment OB, Payment IB, Payment OB,
PULSE, QA Automation, Repository, Repricer OB-IB, Secondary Editing IB, Secondary Editing OB.

## Layer 2 — `Edifecs/` (EDI technical guides)

- `Guide/` — **SEF** (`.sef`) implementation guides describing the *structure* of a transaction
  (loops, segments, elements, codes, cardinality): 834, 837I, 837P.
- `Crosswalk/` — **8** `.crsw` code/value crosswalk tables.
- `HRP_26_1_Upgrade/` — target **XSD** schemas (`PRIME_SERVICES_XSD/`, `WRAPPER_XSD/`) and
  **WSDL** service definitions for the 26.1 upgrade (**31** XSD, **6** WSDL).
- Tool documentation (`.md`): SpecBuilder, XEngine, XEServer, EAM, ECTools, and an INDEX.

## Layer 3 — `Refrence/ArtifactsRepository/` (runtime logic)

The implementation that actually performs the transformations, grouped by domain and then by
project (inbound/outbound × transaction × Common/Institutional/Professional). A project folder
typically contains:

- `Guideline/` — EDI guideline exports (`.ecs` — see removal step above) and related sources.
- `Map/` or `Maps/` — Edifecs transformation maps (`.ems`) and packaged maps (`.empkg`).
- `Groovy/` — Groovy scripts for custom logic (ordering, header updates, audit reporting).
- `Velocity/` — Velocity templates (`.vtmpl`) that render audit JSON / output.
- `SplitRule/` — message split rules.

Domains: `Claims` (Claims / Encounter / Repricer, IB and OB), `ClaimsRepo`, `Enrollment`,
`EnrollmentAutomation`, `EnrollmentsRepo`, `Payments`, `SecondaryEditing`, `CSV_To_837_Automation`.

---

## Artifact types

| Extension | Meaning |
| --- | --- |
| `.csv` | Mapping-spec worksheet (source↔target field crosswalk). |
| `.md` | Transaction bundle, index, or tool documentation. |
| `.sef` | EDI implementation guide (Standard Exchange Format) — transaction structure. |
| `.ecs` | Edifecs SpecBuilder guideline export (EDI SOURCE/TARGET). Excluded from Git — see above. |
| `.ems` | Edifecs transformation map (source guideline → target guideline). |
| `.empkg` | Packaged Edifecs map. |
| `.xsd` / `.wsdl` | Target XML schemas / web-service definitions. |
| `.crsw` | Code / value crosswalk. |
| `.vtmpl` | Velocity template (audit JSON / output rendering). |
| `.groovy` | Groovy transformation script. |
| `.esf` | Severity / guide variant. |
| `.xml`, `.txt`, `.properties` | Samples, notes, and configuration. |
| `.bak` | Backup copies (kept for reference). |

## Transactions covered

- **834** — Benefit Enrollment and Maintenance (Enrollment IB/OB, EnrollmentsRepo).
- **837I / 837P** — Health Care Claim, Institutional / Professional (Claims, Encounter, Repricer).
- **835** — Claim Payment/Advice (Payment IB/OB).
- **278** — Health Care Services Review / authorization (Authorization IB).
- **277CA** — Claim Acknowledgment (Claims IB).
- **275** — Additional Information / attachment (EDI 275 Attachment Service).

## Conventions

- **IB / OB** — inbound (into the platform) vs outbound (out to a trading partner).
- **Versioning** — mapping specs and artifacts carry versions (e.g. `V26.1.1.0`, `V2.3`,
  `EdifecsV2.0`). The newest version lives at the folder root.
- **`Archive/`** — superseded versions retained for history; **`Sample Input/`** (and `Bak/`)
  hold example input files used to validate a mapping.
- Folder names mirror the transaction area and, where relevant, the trading partner or client.