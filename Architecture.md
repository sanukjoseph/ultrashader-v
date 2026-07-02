SEF transaction set (base, versioned)          HRP XSD (target, versioned)
                       \                                        /
                        \                                      /
                   ┌──────────────  Mapping IR  ──────────────┐   ← single source of truth,
                   │  metadata · source refs · target refs    │     stored as text, git-versioned
                   │  field mappings (SpecBuilder-func vocab   │     (each BA change = a diff/commit)
                   │  + Script) · code sets · defaults ·       │
                   │  header logic · enums · audit             │
                   └───────────────────┬──────────────────────┘
        ┌──────────────┬───────────────┼───────────────┬───────────────┐
      SEF →          .ems map       .crsw code       Groovy/          validation
   SpecBuilder → ECS  (functions +    tables +        Velocity         vs pinned XSD
   (guideline)        JScript)        HRP codeEntry   (header/audit)