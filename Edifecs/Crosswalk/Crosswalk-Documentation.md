# Crosswalk Files

Generated from the CRSW files in the Crosswalk folder.

## Overview

These files use the .crsw extension and were decoded as SQLite database containers. Each file contains one or more tables that store the crosswalk mapping data, schema metadata, and configuration properties.

### How the files were decoded

- The .crsw files were inspected as binary files and identified by their SQLite header signature.
- Each file was opened through Node.js using the built-in SQLite support.
- The database schema was read from sqlite_master.
- Each table was queried and converted into markdown tables.
- The resulting document preserves the discovered content in a readable, reviewable format.

### What is included in this document

- File-level summary for each .crsw file
- Table names and SQL definitions
- Rows from the data tables such as Map, MetaSchema, Properties, and any other discovered tables
- A manual record of the decoding approach and the content structure

## Crosswalk IB834.crsw

- File size: 18432 bytes
- Database pages: undefined
- Page size: undefined
- Tables discovered: 6

### Criteria

_No rows found._

### DateRanges

_No rows found._

### Map

SQL: CREATE TABLE Map (Id INTEGER PRIMARY KEY AUTOINCREMENT, c1 DEFAULT '', c2 DEFAULT '', c3 DEFAULT '', c4 DEFAULT '', c5 DEFAULT '', c6 DEFAULT '', c7 DEFAULT '', c8 DEFAULT '', c9 DEFAULT '', c11 DEFAULT '', c13 DEFAULT '', c15 DEFAULT '')

| Id | c1 | c2 | c3 | c4 | c5 | c6 | c7 | c8 | c9 | c11 | c13 | c15 |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| 1 |  |  | CMSFFM          | 90617           | Medicare |  | IBEnrollmentMedicare |  | FEDERAL |  |  |  |
| 2 |  |  | CNCT4HLTHCO     | COLORADOCHOICE  | Commercial |  | IBEnrollmentCommercial |  | HEALTHTRIO |  | IndividualOffEx |  |
| 5 |  |  | CMSFF           | 77320           | Medicaid |  | IBEnrollmentMedicaid |  | HEALTHTRIO |  | IndividualOffEx |  |
| 8 |  |  | 274582239       | 00490           | Commercial |  | IBEnrollmentCommercial |  | HEALTHTRIO |  | CF34298 |  |
| 9 |  |  | CNCT4HLTHCOIHAD | CNCT4HLPHCOIHAD | Commercial |  | IBEnrollmentCommercial |  | HEALTHTRIO |  | CF41066 |  |
| 10 |  |  | CNCT4HLTHCOIHHD | CNCT4HLOHCOIHAD | Commercial |  | IBEnrollmentCommercial |  | HEALTHTRIO |  | IndividualOnEx |  |
| 11 |  |  | CMSFFM | 54837           | Commercial |  | IBEnrollmentCommercial |  | HEALTHTRIO |  | CF00201 |  |
| 12 |  |  | CMSFFM          | 54837           | Commercial |  | IBEnrollmentCommercial |  | HEALTHTRIO |  | CF00201 |  |

### MetaSchema

SQL: CREATE TABLE MetaSchema (InternalName CHAR[10] PRIMARY KEY, DisplayName, Ordinal, DataIndex, IsSource, DataType, MinConstraint, MaxConstraint, Alive, IsLookup, IsIndexed)

| InternalName | DisplayName | Ordinal | DataIndex | IsSource | DataType | MinConstraint | MaxConstraint | Alive | IsLookup | IsIndexed |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| c3 | InterchangeSenderID | 0 | 3 | 1 | 0 |  |  | 1 | 1 | 1 |
| c4 | InterchangeReceiverID | 1 | 4 | 1 | 0 |  |  | 1 | 1 | 1 |
| c5 | LOB | 0 | 5 | 0 | 0 |  |  | 1 | 1 | 1 |
| c7 | FileName | 1 | 7 | 0 | 0 |  |  | 1 | 1 | 1 |
| c9 | Exchange | 2 | 9 | 0 | 0 |  |  | 1 | 1 | 1 |
| c13 | accounthccid | 3 | 11 | 0 | 0 |  |  | 1 | 1 | 1 |

### Properties

SQL: CREATE TABLE Properties (UniqueId TEXT NOT NULL, Name TEXT NOT NULL, Description TEXT, Version TEXT, Comments TEXT, Behavior TEXT NOT NULL, CacheType TEXT, Protected INTEGER)

| UniqueId | Name | Description | Version | Comments | Behavior | CacheType | Protected |
| --- | --- | --- | --- | --- | --- | --- | --- |
| ed2ca77f-93e8-4996-bf19-0f6b76abbcdf | Crosswalk IB834 |  |  |  | Extend | Full | 0 |

### TradingPartners

_No rows found._

## IB_837_Repricer_ClaimSourceLookup.crsw

- File size: 15360 bytes
- Database pages: undefined
- Page size: undefined
- Tables discovered: 6

### Criteria

_No rows found._

### DateRanges

_No rows found._

### Map

SQL: CREATE TABLE Map (Id INTEGER PRIMARY KEY AUTOINCREMENT, c1 DEFAULT '', c2 DEFAULT '', c3 DEFAULT '', c4 DEFAULT '', c5 DEFAULT '', c6 DEFAULT '', c7 DEFAULT '')

| Id | c1 | c2 | c3 | c4 | c5 | c6 | c7 |
| --- | --- | --- | --- | --- | --- | --- | --- |
| 1 |  |  | 880231433 | Multiplan | 843646813       | First Health |  |
| 2 |  |  | BlueCard | Penfield |  |  |  |

### MetaSchema

SQL: CREATE TABLE MetaSchema (InternalName CHAR[10] PRIMARY KEY, DisplayName, Ordinal, DataIndex, IsSource, DataType, MinConstraint, MaxConstraint, Alive, IsLookup, IsIndexed)

| InternalName | DisplayName | Ordinal | DataIndex | IsSource | DataType | MinConstraint | MaxConstraint | Alive | IsLookup | IsIndexed |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| c3 | SenderID_Input | 1 | 3 | 1 | 0 |  |  | 1 | 1 | 1 |
| c4 | SenderID_Output | 0 | 4 | 0 | 0 |  |  | 1 | 1 | 1 |

### Properties

SQL: CREATE TABLE Properties (UniqueId TEXT NOT NULL, Name TEXT NOT NULL, Description TEXT, Version TEXT, Comments TEXT, Behavior TEXT NOT NULL, CacheType TEXT, Protected INTEGER)

| UniqueId | Name | Description | Version | Comments | Behavior | CacheType | Protected |
| --- | --- | --- | --- | --- | --- | --- | --- |
| 091a9d4d-9505-4531-9c09-4f2c90ac48da | IB_837_Repricer_ClaimSourceLookup |  |  |  | Extend | Full | 0 |

### TradingPartners

_No rows found._

## IB_837_SecondaryEditing_ClaimSourceLookup.crsw

- File size: 15360 bytes
- Database pages: undefined
- Page size: undefined
- Tables discovered: 6

### Criteria

_No rows found._

### DateRanges

_No rows found._

### Map

SQL: CREATE TABLE Map (Id INTEGER PRIMARY KEY AUTOINCREMENT, c1 DEFAULT '', c2 DEFAULT '', c3 DEFAULT '', c4 DEFAULT '', c5 DEFAULT '', c6 DEFAULT '', c7 DEFAULT '')

| Id | c1 | c2 | c3 | c4 | c5 | c6 | c7 |
| --- | --- | --- | --- | --- | --- | --- | --- |
| 1 |  |  | 133068979 | Claritev | 843646813       | First Health |  |
| 2 |  |  | 842694744 | Zelis |  |  |  |

### MetaSchema

SQL: CREATE TABLE MetaSchema (InternalName CHAR[10] PRIMARY KEY, DisplayName, Ordinal, DataIndex, IsSource, DataType, MinConstraint, MaxConstraint, Alive, IsLookup, IsIndexed)

| InternalName | DisplayName | Ordinal | DataIndex | IsSource | DataType | MinConstraint | MaxConstraint | Alive | IsLookup | IsIndexed |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| c3 | SenderID_Input | 1 | 3 | 1 | 0 |  |  | 1 | 1 | 1 |
| c4 | SenderID_Output | 0 | 4 | 0 | 0 |  |  | 1 | 1 | 1 |

### Properties

SQL: CREATE TABLE Properties (UniqueId TEXT NOT NULL, Name TEXT NOT NULL, Description TEXT, Version TEXT, Comments TEXT, Behavior TEXT NOT NULL, CacheType TEXT, Protected INTEGER)

| UniqueId | Name | Description | Version | Comments | Behavior | CacheType | Protected |
| --- | --- | --- | --- | --- | --- | --- | --- |
| 091a9d4d-9505-4531-9c09-4f2c90ac48da | IB_837_SecondaryEditing_ClaimSourceLookup |  |  |  | Extend | Full | 0 |

### TradingPartners

_No rows found._

## P_OB_835_ControlReport_Crosswalk.crsw

- File size: 13312 bytes
- Database pages: undefined
- Page size: undefined
- Tables discovered: 6

### Criteria

_No rows found._

### DateRanges

_No rows found._

### Map

SQL: CREATE TABLE Map (Id INTEGER PRIMARY KEY AUTOINCREMENT, c1 DEFAULT '', c2 DEFAULT '')

| Id | c1 | c2 |
| --- | --- | --- |
| 2 | IBCGRP01 | AmeriHealth HMO Inc. NJCompany Code - IBX03 |
| 3 | IBCGRP02 | AmeriHealth HMO Inc. PA Company Code - IBX04 |
| 4 | IBCGRP03 | AmeriHealth Ins. Co of NJ Company Code - IBX07 |
| 5 | IBCGRP04 | Independence Assurance Company Company Code - IBX12 |
| 6 | IBCGRP05 | Independence Hospital Indemnity Plan, Inc. Company Code - IBXBC |
| 7 | IBCGRP06 | Keystone Health Plan East Company Code - IBX02 |
| 8 | IBCGRP07 | QCC Insurance Company Company Code - IBX01 |
| 9 | IBCGRP08 | AmeriHealth HMO  Inc. NJ Company Code - IBX03 |
| 10 | IBCGRP09 | AmeriHealth Ins. Co of NJ  Company Code - IBX07 |
| 11 | IBCGRP10 | Keystone Health Plan East Company Code - IBX02 |
| 12 | IBCGRP11 | QCC Insurance Company Company Code - IBX01 |

### MetaSchema

SQL: CREATE TABLE MetaSchema (InternalName CHAR[10] PRIMARY KEY, DisplayName, Ordinal, DataIndex, IsSource, DataType, MinConstraint, MaxConstraint, Alive, IsLookup, IsIndexed)

| InternalName | DisplayName | Ordinal | DataIndex | IsSource | DataType | MinConstraint | MaxConstraint | Alive | IsLookup | IsIndexed |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| c1 | GroupID | 0 | 1 | 1 | 0 |  |  | 1 | 1 | 1 |
| c2 | GroupName | 0 | 2 | 0 | 0 |  |  | 1 | 1 | 1 |

### Properties

SQL: CREATE TABLE Properties (UniqueId TEXT NOT NULL, Name TEXT NOT NULL, Description TEXT, Version TEXT, Comments TEXT, Behavior TEXT NOT NULL, CacheType TEXT, Protected INTEGER)

| UniqueId | Name | Description | Version | Comments | Behavior | CacheType | Protected |
| --- | --- | --- | --- | --- | --- | --- | --- |
| 1245246e-adb8-4109-8a6a-1e122ece6f5b | LegalEntityCrosswalk |  |  |  | Extend | Full | 0 |

### TradingPartners

_No rows found._

## Sample - Company ID to Address.crsw

- File size: 10240 bytes
- Database pages: undefined
- Page size: undefined
- Tables discovered: 4

### DateRanges

_No rows found._

### Map

SQL: CREATE TABLE Map (Id INTEGER PRIMARY KEY AUTOINCREMENT, c1, c2, c3)

| Id | c1 | c2 | c3 |
| --- | --- | --- | --- |
| 1 | 98004 | 2600 116th Avenue NE, Ste 200 | Edifecs |
| 2 | 98043 | 7001 220th Street Southwest  Mountlake Ter, WA | Premera |
| 3 | 91367 | 21555 Oxnard Street Woodland Hills, CA | BCBSCA |
| 4 | 40202 | 500 West Main Street  Louisville, KY | HUMANA |
| 5 | 06002 | 900 Cottage Grove Road Bloomfield, CT | Cigna |
| 6 | 10041 | 55 Water Street New York, NY | Emblem Health |
| 7 | 06156 | 151 Farmington Avenue Hartford, CT | Aetna |
| 8 | 98101 | 1800 Ninth Avenue Seattle, WA | Regence Blue Shield |
| 9 | 48034 | 27000 W. 11 Mile Road Southfield, MI | BCBSMI |
| 10 | 64108 | One Pershing Square 2301 Main Kansas City | BCBSKC |

### MetaSchema

SQL: CREATE TABLE MetaSchema (InternalName CHAR[10] PRIMARY KEY, DisplayName, Ordinal, DataIndex, IsSource, DataType, MinConstraint, MaxConstraint, Alive, IsLookup, IsIndexed)

| InternalName | DisplayName | Ordinal | DataIndex | IsSource | DataType | MinConstraint | MaxConstraint | Alive | IsLookup | IsIndexed |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| c1 | ZipCode | 0 | 1 | 0 | 0 |  |  | 1 | 1 | 1 |
| c2 | Address | 1 | 2 | 0 | 1 |  |  | 1 | 1 | 1 |
| c3 | CompanyName | 0 | 3 | 1 | 1 |  |  | 1 | 1 | 1 |

### Properties

SQL: CREATE TABLE Properties (UniqueId TEXT NOT NULL)

| UniqueId |
| --- |
| 8069ce77-b017-49f1-a186-c33bc320cb8d |

## crosswalk_277ca.crsw

- File size: 21504 bytes
- Database pages: undefined
- Page size: undefined
- Tables discovered: 6

### Criteria

_No rows found._

### DateRanges

_No rows found._

### Map

SQL: CREATE TABLE Map (Id INTEGER PRIMARY KEY AUTOINCREMENT, c1 DEFAULT '', c2 DEFAULT '', c3 DEFAULT '', c4 DEFAULT '', c5 DEFAULT '', c6 DEFAULT '', c8 DEFAULT '', c9 DEFAULT '', c10 DEFAULT '', c11 DEFAULT '', c12 DEFAULT '', c13 DEFAULT '', c14 DEFAULT '')

| Id | c1 | c2 | c3 | c4 | c5 | c6 | c8 | c9 | c10 | c11 | c12 | c13 | c14 |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| 1 |  |  | CONSOLIDATED | A2 | 19 | WQ |  | A1 | 19 | WQ | A1 | 19 | WQ |
| 2 |  |  | NEEDS_REPAIR | P5 | 19 | WQ |  | A1 | 19 | WQ | A1 | 19 | WQ |
| 3 |  |  | NEEDS_REVIEW | P5 | 19 | WQ |  | A1 | 19 | WQ | A1 | 19 | WQ |
| 4 |  |  | DENIED | F2 | 20 | WQ |  | A1 | 19 | WQ | A1 | 19 | WQ |
| 5 |  |  | REJECTED | A3 | 19 | U |  | A1 | 19 | WQ | A1 | 19 | WQ |
| 6 |  |  | FINAL | F1 | 20 | WQ |  | A1 | 19 | WQ | A1 | 19 | WQ |
| 7 |  |  | NEEDS_REPRICING | P2 | 19 | WQ |  | A1 | 19 | WQ | A1 | 19 | WQ |
| 8 |  |  | WAITING_FOR_EXTERNAL_SYSTEM | P2 | 19 | WQ |  | A1 | 19 | WQ | A1 | 19 | WQ |
| 9 |  |  | DEFAULT | A1 | 19 | WQ |  | A1 | 19 | WQ | A1 | 19 | WQ |

### MetaSchema

SQL: CREATE TABLE MetaSchema (InternalName CHAR[10] PRIMARY KEY, DisplayName, Ordinal, DataIndex, IsSource, DataType, MinConstraint, MaxConstraint, Alive, IsLookup, IsIndexed)

| InternalName | DisplayName | Ordinal | DataIndex | IsSource | DataType | MinConstraint | MaxConstraint | Alive | IsLookup | IsIndexed |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| c3 | CLAIM_STATUS | 0 | 3 | 1 | 0 |  |  | 1 | 1 | 1 |
| c4 | 2200D_STC01-01 | 0 | 4 | 0 | 0 |  |  | 1 | 1 | 1 |
| c5 | 2200D_STC01-02 | 1 | 5 | 0 | 0 |  |  | 1 | 1 | 1 |
| c6 | 2200D_STC03 | 2 | 6 | 0 | 0 |  |  | 1 | 1 | 1 |
| c9 | 2200B_STC01-01 | 3 | 8 | 0 | 0 |  |  | 1 | 1 | 1 |
| c10 | 2200B_STC01-02 | 4 | 9 | 0 | 0 |  |  | 1 | 1 | 1 |
| c11 | 2200B_STC03 | 5 | 10 | 0 | 0 |  |  | 1 | 1 | 1 |
| c12 | 2200C_STC01-01 | 6 | 11 | 0 | 0 |  |  | 1 | 1 | 1 |
| c13 | 2200C_STC01-02 | 7 | 12 | 0 | 0 |  |  | 1 | 1 | 1 |
| c14 | 2200C_STC03 | 8 | 13 | 0 | 0 |  |  | 1 | 1 | 1 |

### Properties

SQL: CREATE TABLE Properties (UniqueId TEXT NOT NULL, Name TEXT NOT NULL, Description TEXT, Version TEXT, Comments TEXT, Behavior TEXT NOT NULL, CacheType TEXT, Protected INTEGER)

| UniqueId | Name | Description | Version | Comments | Behavior | CacheType | Protected |
| --- | --- | --- | --- | --- | --- | --- | --- |
| 470962ce-9a89-4b60-86ae-4186a91e5cf9 | Crosswalk_277CA |  |  |  | Extend | Full | 0 |

### TradingPartners

_No rows found._

## p_ib_837_claimsourcelookup.crsw

- File size: 17408 bytes
- Database pages: undefined
- Page size: undefined
- Tables discovered: 6

### Criteria

_No rows found._

### DateRanges

_No rows found._

### Map

SQL: CREATE TABLE Map (Id INTEGER PRIMARY KEY AUTOINCREMENT, c1 DEFAULT '', c2 DEFAULT '', c3 DEFAULT '', c4 DEFAULT '', c5 DEFAULT '', c6 DEFAULT '', c7 DEFAULT '')

| Id | c1 | c2 | c3 | c4 | c5 | c6 | c7 |
| --- | --- | --- | --- | --- | --- | --- | --- |
| 1 |  |  | BlueCard | 030240928 | BlueCard | E | P_IB_837P_EDI_Electronic.esf |
| 2 |  |  | SDSOCR837I | H0657 | SDSOCR837I | S |  |
| 3 |  |  | SDSOCR837P | H0657 | SDSOCR837P | S |  |
| 4 |  |  | 387654 | 030240928 | 387654 | E |  |
| 5 |  |  | 39876 | 030240928 | 39876 | E |  |
| 7 |  |  | Unknown | 030240928 | Unknown | E |  |
| 8 |  |  | USTOCR837I | H0657 | paper | S |  |
| 9 |  |  | USTOCR837P | H0657 | paper | S |  |
| 10 |  |  | SDS | 030240928 | USTOCR | S |  |

### MetaSchema

SQL: CREATE TABLE MetaSchema (InternalName CHAR[10] PRIMARY KEY, DisplayName, Ordinal, DataIndex, IsSource, DataType, MinConstraint, MaxConstraint, Alive, IsLookup, IsIndexed)

| InternalName | DisplayName | Ordinal | DataIndex | IsSource | DataType | MinConstraint | MaxConstraint | Alive | IsLookup | IsIndexed |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| c3 | Sender Id | 0 | 3 | 1 | 0 |  |  | 1 | 1 | 1 |
| c4 | Receiver Id | 1 | 4 | 1 | 0 |  |  | 1 | 1 | 1 |
| c5 | ClaimSource | 0 | 5 | 0 | 0 |  |  | 1 | 1 | 1 |
| c6 | ClaimDeliveryType | 1 | 6 | 0 | 0 |  |  | 1 | 1 | 1 |

### Properties

SQL: CREATE TABLE Properties (UniqueId TEXT NOT NULL, Name TEXT NOT NULL, Description TEXT, Version TEXT, Comments TEXT, Behavior TEXT NOT NULL, CacheType TEXT, Protected INTEGER)

| UniqueId | Name | Description | Version | Comments | Behavior | CacheType | Protected |
| --- | --- | --- | --- | --- | --- | --- | --- |
| 580b763e-5783-4a5b-91c6-f0fc6745e354 | P_IB_837_ClaimSourceLookup |  |  |  | Extend | Full | 0 |

### TradingPartners

_No rows found._

## p_ib_837_pwk01lookup.crsw

- File size: 13312 bytes
- Database pages: undefined
- Page size: undefined
- Tables discovered: 6

### Criteria

_No rows found._

### DateRanges

_No rows found._

### Map

SQL: CREATE TABLE Map (Id INTEGER PRIMARY KEY AUTOINCREMENT, c1 DEFAULT '', c2 DEFAULT '')

| Id | c1 | c2 |
| --- | --- | --- |
| 39 | 03 | 9 |
| 40 | 04 | 9 |
| 41 | 05 | 9 |
| 42 | 06 | 2 |
| 43 | 07 | 9 |
| 44 | 08 | 9 |
| 45 | 09 | 8 |
| 46 | 10 | 9 |
| 47 | 11 | 9 |
| 48 | 13 | 9 |
| 49 | 15 | 9 |
| 50 | 21 | 3 |
| 51 | A3 | 9 |
| 52 | A4 | 9 |
| 53 | AM | 9 |
| 54 | AS | 10 |
| 55 | B2 | 11 |
| 56 | B3 | 12 |
| 57 | B4 | 13 |
| 58 | BR | 9 |
| 59 | BS | 9 |
| 60 | BT | 9 |
| 61 | CB | 9 |
| 62 | CK | 9 |
| 63 | CT | 14 |
| 64 | D2 | 9 |
| 65 | DA | 15 |
| 66 | DB | 9 |
| 67 | DG | 16 |
| 68 | DJ | 9 |
| 69 | DS | 17 |
| 70 | EB | 18 |
| 71 | HC | 6 |
| 72 | HR | 5 |
| 73 | I5 | 9 |
| 74 | IR | 9 |
| 75 | LA | 9 |
| 76 | M1 | 1 |
| 77 | MT | 19 |
| 78 | NN | 20 |
| 79 | OB | 21 |
| 80 | OC | 9 |
| 81 | OD | 7 |
| 82 | OE | 9 |
| 83 | OX | 9 |
| 84 | OZ | 22 |
| 85 | P4 | 9 |
| 86 | P5 | 9 |
| 87 | PE | 9 |
| 88 | PN | 23 |
| 89 | PO | 24 |
| 90 | PQ | 9 |
| 91 | PY | 9 |
| 92 | PZ | 25 |
| 93 | RB | 26 |
| 94 | RR | 27 |
| 95 | RT | 28 |
| 96 | RX | 9 |
| 97 | SG | 9 |
| 98 | VS | 9 |
| 99 | XP | 9 |

### MetaSchema

SQL: CREATE TABLE MetaSchema (InternalName CHAR[10] PRIMARY KEY, DisplayName, Ordinal, DataIndex, IsSource, DataType, MinConstraint, MaxConstraint, Alive, IsLookup, IsIndexed)

| InternalName | DisplayName | Ordinal | DataIndex | IsSource | DataType | MinConstraint | MaxConstraint | Alive | IsLookup | IsIndexed |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| c1 | PWK01 | 0 | 1 | 1 | 0 |  |  | 1 | 1 | 1 |
| c2 | CodeEntry | 0 | 2 | 0 | 0 |  |  | 1 | 1 | 1 |

### Properties

SQL: CREATE TABLE Properties (UniqueId TEXT NOT NULL, Name TEXT NOT NULL, Description TEXT, Version TEXT, Comments TEXT, Behavior TEXT NOT NULL, CacheType TEXT, Protected INTEGER)

| UniqueId | Name | Description | Version | Comments | Behavior | CacheType | Protected |
| --- | --- | --- | --- | --- | --- | --- | --- |
| 8a631c95-2b49-4c76-9357-99b4831d0f17 | P_IB_837_PWK01LookUP |  |  |  | Extend | Full | 0 |

### TradingPartners

_No rows found._
