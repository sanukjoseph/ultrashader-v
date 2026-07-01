---
title: "Edifecs XEngine — Complete Documentation"
source: "https://help.edifecsfedcloud.com/svc/product/xengine/9.4/"
generated: "2026-06-29"
total_pages: 27
pages_ok: 27
---

# Edifecs XEngine — Complete Documentation

| | |
|---|---|
| **Source** | [Edifecs XEngine 9.4 Help](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/) |
| **Generated** | Mon, 29 Jun 2026 20:49:37 GMT |
| **Pages** | 27 captured / 0 failed / 27 total |

---

## Table of Contents

- [XEngine Overview](#xengine-overview)
- [Supported Standards](#supported-standards)
- [Supported Data Formats](#supported-data-formats)
- [XEngine System Requirements](#xengine-system-requirements)
- [Known Issues and Limitations](#known-issues-and-limitations)
- [XEngine Installation](#xengine-installation)
  - [Set Environment Variable](#set-environment-variable)
  - [Install XEngine](#install-xengine)
  - [Install Options](#install-options)
  - [Test XEngine Installation](#test-xengine-installation)
    - [Test Your Installation](#test-your-installation)
    - [Test by Customizing Selector](#test-by-customizing-selector)
    - [Test by Using Command Line Parameter](#test-by-using-command-line-parameter)
    - [Test Harness Parameters](#test-harness-parameters)
  - [Uninstall XEngine](#uninstall-xengine)
- [XEngine Architecture](#xengine-architecture)
  - [XEngine Architecture Overview](#xengine-architecture-overview)
  - [XEngine Directory Structure](#xengine-directory-structure)
- [Enhance XEngine Performance](#enhance-xengine-performance)
  - [Understand XEngine Performance Statistics](#understand-xengine-performance-statistics)
  - [Enhance XEngine Performance](#enhance-xengine-performance)
  - [Understand XEngine Performance Numbers](#understand-xengine-performance-numbers)
  - [Guideline Caching](#guideline-caching)
  - [External Code List Caching](#external-code-list-caching)
  - [JavaScript Caching](#javascript-caching)
  - [Disable Parser Schemas](#disable-parser-schemas)
  - [Disable Syntax Checking](#disable-syntax-checking)

---

## Content

---

<a id="xengine-overview"></a>

## XEngine Overview

> 📄 Source: [XEngine_Overview.htm](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/XEngine_Overview.htm)

### XEngine Overview


Edifecs XEngine is an SDK (Software Development Kit) that performs the validation of Healthcare and general industry transactions for syntax, semantics, and trading partner-specific business rules.


With real-time edits and filters on the data entering or leaving your enterprise, you are assured that your back-end applications and data warehouses, as well as those of your trading partners, contain accurate and valid transaction data, and achieve maximum transaction automation.


By handling specific requirements before the data reaches your back-end systems, you can proactively catch and manage exceptions that cause adjudication rates to fall.


XEngine SDK comes as an integral part of the XEngine Server solution in the form of a module.


#### XEngine Benefits


With Edifecs XEngine you can:

- Validate production data for compliance with HIPAA, HL7, NCPDP, or proprietary formats and rules, including WEDI SNIP Types 1-6 for in-built HIPAA transactions.
- Validate data against your Companion Guide-specific edits, by trading partner or service type, before data is passed through to your back-end systems.
- Relax edits for specific trading partners to create warnings, informational responses, or to simply ignore the edits.
- Split and re-batch transactions in real time: good transactions from bad or based on content.
- Receive automated error reports in human-readable and/or XML formats to share internally or with trading partners.
- Keep abreast of the latest transaction versions, as well as over 60 code set updates, through monthly executable updates.
- Stay up-to-date with the ICD-9, ICD-10, CPT-4, NDC, and SNFR-HIPPS codes.
- Automatically create acknowledgment messages such as TA1, 997, and 824 transactions.
- Automatically transform EDI data into XML for consumption by other systems or processes in your organization.
- Scale to even the most high-volume environments, with the most robust cross-platform support in the market.
- Install and implement in a matter of days, by using a standalone server (XEServer).


XEngine is an embeddable SDK which provides the following functionality:

- [Native data validation against envelope and transaction guidelines](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/Native_Data_Processing_Overview.htm)
- [Native data conversion into XData](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/Native_Data_Processing_Overview.htm#native_conversion)
- [XData validation and conversion into the native format](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/XData_Processing_Overview.htm)
- [Fully customizable trading partner Selectors](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/Selector_Overview.htm)
- [WEDI/SNIP Testing for HIPAA](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/WEDI_SNIP_Testing_for_HIPAA_Healthcare_Edition_Only.htm) (Healthcare Edition only)
- [NCCI Support](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/NCCI_Support.htm)
- [Locale Support](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/Locale_Support.htm)
- [Acknowledgment generation based on validation results](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/Acknowledgements_Overview.htm)
- [Data and claims splitting](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/Data_Splitting_Overview.htm)
- Error reporting and collection
- [Error severity configuration](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/Error_Severity_Settings_Overview.htm)
- XEngine Server - facilitates configuration of XEngine
- Integration with Edifecs SpecBuilder for rule definition and error severity configuration


For a list of the standards that XEngine supports, see [Supported Standards](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/Supported_Standards.htm). 


XEngine allows using the following SNIP types:

- 1 - integrity testing
- 2 - requirement testing
- 3 - balancing testing
- 4 - situational testing
- 5 - external code set testing
- 6 - product types or line-of-services testing
- 7 - one-on-one testing specific to a trading partner


XEngine 9.4

---

<a id="supported-standards"></a>

## Supported Standards

> 📄 Source: [Supported_Standards.htm](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/Supported_Standards.htm)

### Supported Standards


Depending on the Edifecs version you have, some of the guideline standards described in this document may not be available to you. The following table shows the standards supported by the two available versions.


| Supported Standards | Healthcare Edition | Enterprise Edition |
| --- | --- | --- |
| X12 | YES | YES |
| X12N/HIPAA | YES | NO |
| Health Level 7 (HL7) | YES | NO |
| UN/EDIFACT | YES | YES |
| NCPDP Telecom | YES | NO |
| NCPDP SCRIPT | YES | NO |
| NCPDP Batch | YES | NO |
| Positional NSF | YES | NO |
| Positional UB92 | YES | NO |
| Delimited Flat Files (DFF) | YES | YES |
| ODETTE | YES | YES |
| TRADACOM | YES | YES |
| Inland Revenue | YES | YES |
| EANCOM | YES | YES |
| ISA | YES | YES |
| UCS | YES | YES |
| VICS | YES | YES |



Note In case you need to work with PFF/DFF guidelines and generate XData, MData or map your data in SpecBuilder, you must set the Standard field of such guideline to PFF/DFF.

---

<a id="supported-data-formats"></a>

## Supported Data Formats

> 📄 Source: [Supported_Data_Formats.htm](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/Supported_Data_Formats.htm)

### Supported Data Formats


XEngine supports XML and JSON data formats. With XEngine, you can:

- Translate and validate XML data against an XML schema guideline - a document with an .ecs extension that can contain one or more schema structures. Each schema structure is a representation of an [XML schema](https://help.edifecsfedcloud.com/go/specbuilder/9.4/Content/XML_Schema_Overview.htm) document. The XML schema guideline defines element types that can occur in an XML instance document and their relationships and determines how the structure is represented in a file, so it can be used to interpret and validate the XML instance document. With an XML schema guideline, you can combine multiple schema files in a single document. You can also create individual documents that refer to each other, creating a reference tree since the XML schema guideline supports external references to XML schema files as well as XML schema guidelines, providing a useful solution for many business tasks. By using Edifecs SpeBuilder, you can [view](https://help.edifecsfedcloud.com/go/specbuilder/9.4/Content/Open_an_XML_Schema_Guideline.htm) and [edit](https://help.edifecsfedcloud.com/go/specbuilder/9.4/Content/Edit_an_XML_Schema_Guideline.htm) XML schema guidelines.
- Validate JSON data against a JSON guideline that was developed by Edifecs as the proprietary format that defines the structure of JSON data similar to a JSON schema. JSON guideline can have an object or a simple type as a child node. An object can be defined by simple types or by other objects. An object can have a property or/and extension as a child. For more information on JSON guideline property settings and on the available simple types, see the [SpecBuilder Help Center](https://help.edifecsfedcloud.com/go/specbuilder/9.4/Content/JSON_Guideline_Overview.htm). By using Edifecs SpeBuilder, you can view and [edit](https://help.edifecsfedcloud.com/go/specbuilder/9.4/Content/Work_with_JSON_Editor.htm) JSON guidelines.


XML schema and JSON guideline describe the structure that is built when processing XML/JSON data files. The ${XERoot}\samples\standards\XML and ${XERoot}\samples\standards\JSON directories contain sample data and guidelines you can use to test data validation.


**Note** Translator does not support the JSON data format.

---

<a id="xengine-system-requirements"></a>

## XEngine System Requirements

> 📄 Source: [XEngine_System_Requirements.htm](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/XEngine_System_Requirements.htm)

#


System Requirements


The following hardware and software are required for XEngine 9.4.


| Requirement | Description |
| --- | --- |
| Operating Systems (64-bit) | Microsoft Windows 11 Microsoft Windows Server 2019, 2022, 2025 Red Hat Enterprise Linux 7.x, 8.x (available since XEngine 9.2 hotfix 5), 9 SUSE Linux 12, 15 Amazon Linux 2 Kernel 5.10 zLinux SLES11 SP2 and later AIX 7.2, 7.3 |
| AIX Requirements | On AIX systems, the following parameters should be set to "unlimited": data seg size - type ulimit -d unlimited file size - type ulimit -f unlimited max memory size - type ulimit -m unlimited virtual memory - type ulimit -v unlimited Note: To see a list of all available parameters, type ulimit -a. |
| Hardware/Software | CPU: 4 - 32 cores 3.0 GHz (16 cores are recommended) RAM: 8 - 64 GB (16 GB are recommended) Hard disk space: 10 GB of free disk space Note: The actual CPU and RAM requirements may vary and should be based on the expected workload. |
| Certified Databases (for DB selector) | Microsoft SQL Server 2017, 2019, 2022, 2025 Oracle Database 19c, 21c R21.3, 23c, 26ai PostgreSQL 13.3 |
| Java | Java 17 is mandatory for the product. You must download and install JDK 17 prior to using the product. Adoptium OpenJDK 17.0.8+7 and 17.0.15+6 are certified Edifecs compatible for all supported operating systems. Edifecs supports the use of JDKs from Oracle, Adoptium, and other vendors if they are binary compatible. However, Edifecs does not endorse any of these options, and the use of these options is at your organization's own risk. Please seek legal counsel in selecting the JDK option that best suits your organization's needs and license requirements. |


 Changes in system requirements since 8.4


This table lists the changes of the hardware and software required for the following versions of XEngine.


| Requirement | Name | 8.4 | 8.6 | 8.8 | 8.8.1 | 9.0 | 9.1 | 9.2, 9.2.2 | 9.2.3 | 9.2.4-9.2.6 | 9.2.7 | 9.3, 9.3.1 | 9.3.2, 9.3.3 | 9.4 |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| Operating System (64-bit) | Microsoft Windows 7 (32-bit and 64-bit for 8.4) | | | | |   |   |   |   |   |   |   |   |   |
| Microsoft Windows 8 (32-bit and 64-bit for 8.4) | | | | |   |   |   |   |   |   |   |   |   | |
| Microsoft Windows 8.1 |   |   |   |   | |   |   |   |   |   |   |   |   | |
| Microsoft Windows 10 |   |   | | | | | | | | | | |   | |
| Microsoft Windows 11 |   |   |   |   |   |   |   |   |   |   | | | | |
| Microsoft Windows Vista |   |   | | |   |   |   |   |   |   |   |   |   | |
| Microsoft Windows Server 2008 (32-bit and 64-bit for 8.4) | | | | |   |   |   |   |   |   |   |   |   | |
| Microsoft Windows Server 2012 (32-bit and 64-bit for 8.4) | | | | |   |   |   |   |   |   |   |   |   | |
| Microsoft Windows Server 2012 R2 |   |   | | | |   |   |   |   |   |   |   |   | |
| Microsoft Windows Server 2016 |   |   |   | | | | | | | | | |   | |
| Microsoft Windows Server 2019 |   |   |   |   |   | | | | | | | | | |
| Microsoft Windows Server 2022 |   |   |   |   |   |   |   |   |   |   | | | | |
| Microsoft Windows Server 2025 |   |   |   |   |   |   |   |   |   |   |   |   | | |
| Red Hat Enterprise Linux 4.x |   |   | | |   |   |   |   |   |   |   |   |   | |
| Red Hat Enterprise Linux 5.x | | | | | |   |   |   |   |   |   |   |   | |
| Red Hat Enterprise Linux 6.x |   |   | | | | | | |   |   |   |   |   | |
| Red Hat Enterprise Linux 7.x |   |   | | | | | | | | | | | | |
| Red Hat Enterprise Linux 8.x (available since XEngine 9.2 hotfix 5) |   |   |   |   |   |   | | | | | | | | |
| Red Hat Enterprise Linux 9 |   |   |   |   |   |   |   |   |   | | | | | |
| SUSE Linux 9 |   |   | | |   |   |   |   |   |   |   |   |   | |
| SUSE Linux 10 (32-bit and 64-bit for 8.4) | | | | |   |   |   |   |   |   |   |   |   | |
| SUSE Linux 11 (32-bit and 64-bit for 8.4) | | | | | |   |   |   |   |   |   |   |   | |
| SUSE Linux 12 |   |   |   |   |   | | | | | | | | | |
| SUSE Linux 15 |   |   |   |   |   | | | | | | | | | |
| zLinux | | | | |   |   |   |   |   |   |   |   |   | |
| zLinux SLES11 SP2 |   |   |   |   | | | | | | | | | | |
| Amazon Linux 2 Kernel 5.10 |   |   |   |   |   |   |   |   |   |   | | | | |
| AIX 6.1 TL5 | | | | | | | |   |   |   |   |   |   | |
| AIX 7 |   | | | |   |   |   |   |   |   |   |   |   | |
| AIX 7.1 | |   |   |   | | | | | | | |   |   | |
| AIX 7.2 |   |   |   |   |   |   |   |   | | | | | | |
| AIX 7.3 |   |   |   |   |   |   |   |   |   |   |   | | | |
| HP-UX 11.23i (Itanium) | | | | | |   |   |   |   |   |   |   |   | |
| HP-UX 11.31 | | | | | |   |   |   |   |   |   |   |   | |
| Sun Solaris 9 (SPARC) (32-bit and 64-bit for 8.4) | | | | |   |   |   |   |   |   |   |   |   | |
| Sun Solaris 10 (ix86) (ix86 64-bit for 8.4) | | | | |   |   |   |   |   |   |   |   |   | |
| Sun Solaris 10 (AMD/Intel and SPARC) | | | | | |   |   |   |   |   |   |   |   | |
| Sun Solaris 11 (AMD/Intel and SPARC) |   |   |   |   | |   |   |   |   |   |   |   |   | |
| Java | Oracle JDK 1.8.0_40 |   | | | |   |   |   |   |   |   |   |   |   |
| Oracle JDK 7 | | |   |   |   |   |   |   |   |   |   |   |   | |
| IBM JDK 7 |   | |   |   |   |   |   |   |   |   |   |   |   | |
| IBM JDK 8 |   |   | | | |   |   |   |   |   |   |   |   | |
| Oracle Java SE Development Kit 8 (JDK 8u261) |   |   |   |   | |   |   |   |   |   |   |   |   | |
| OpenJDK 11 (11.0.2 or later) |   |   |   |   |   | | | | | |   |   |   | |
| OpenJDK 11 (11.0.11 or later) |   |   |   |   |   |   |   |   |   |   | | |   | |
| JDK 11.0.20+8 |   |   |   |   |   |   |   |   |   |   |   | |   | |
| Adopt OpenJDK 11.0.6 |   |   |   |   |   | | | | | |   |   |   | |
| Adoptium OpenJDK 17.0.6 |   |   |   |   |   |   |   |   |   |   | | | | |
| Adoptium OpenJDK 17.0.8+7 |   |   |   |   |   |   |   |   |   |   |   |   | | |
| Adoptium OpenJDK 17.0.15+6 |   |   |   |   |   |   |   |   |   |   |   |   | | |

---

<a id="known-issues-and-limitations"></a>

## Known Issues and Limitations

> 📄 Source: [XE_Known_Issues_and_Limitations.htm](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/XE_Known_Issues_and_Limitations.htm)

### Known Issues and Limitations


###### Product installation

- The XEngine installer may not have sufficient permissions to install the product when the maximum level of User Account Control (UAC) is set for .msi or perl2exe execution. In this case, use the Run as administrator option when you run the installer on Windows.
- When you are installing XEngine on Linux, glibc may report an invalid pointer error which you can safely suppress by setting the environment variable MALLOC_CHECK_=0.


###### XEngine limitations

- XEngine .NET API does not support Java-based actions in XEngine Validator and Java-based functions in Translator.
- XEngine .NET API does not support Java map functions.
- The following tools are unavailable in XEngine : AFFGenerator, deidentifyconsole, ECLConsole, XESolutions (except scrubber), and the ECTools package.


###### JSON data validation

- During JSON data validation, only simple data types are checked for uniqueness. XEngine does not check for the uniqueness of complex data such as arrays and objects.
- Though JSON data that contains a single string token (for example, “test”) is considered valid JSON data, XEngine is not able to select a matching parser schema for the data.


###### XML external entities


By default, XML external entities are disabled for security reasons. You can enable them using the following engine parameter: XEngine.XML.AllowExternalEntities = true


###### Severity configuration limitation for Mapper


When validation is turned off and user wants to change *warnings* fired by translator's data formatter to *errors*, the severity of such errors must not be "Critical" (1000); only "Normal" (1001) is supported.


Some links in HTML error reports do not work on Internet Explorer


If you are using Internet Explorer and if the link contains "{" or "}", the link does not work. You need to rename the file or use a stream factory that does not generate files with GUIDs. The links do, however, work on Firefox.


###### Envelope replacement data


LDNS configuration files can be modified to use replacement data in the resulting split data file. The following names are available for use:

- ReplacementInterchangeSenderID
- ReplacementInterchangeReceiverID
- ReplacementGroupSenderID
- ReplacementGroupReceiverID


###### Conversion from an XSD-based standard into XData not supported


XEngine does not support direct conversion from an XSD-based standard into XData.


###### XData is not created when a system error or an error in processing the envelopes occur


Fatal errors always override the CreateAlways parameter value. This is by design.


###### XData handling with mismatching standard value between root and properties


It is possible to specify Edifact as a standard on the root node for X12 XData. Processing completes as usual for X12 data with no errors, but the UNA service string could be added in the front. This only happens when matching to the engine standard is used on the root node, otherwise engine fails to load.


###### Limitations in the splitting of data containing binary segments


The following limitations exist when binary segments are present in the data:

- The split result is only valid in UTF16 encoding.
- Transcoders should not be used. Bad data has a corrupted binary payload when guideline lookup for the transaction fails.


###### SB/CD processing mode does not support Big Data File (BDF) mode


BDF is only supported in the regular processing mode where the selector is used. If a guideline is passed directly, BDF mode is disabled.


###### DNS Traversal with DataNodeViewer and EventViewer in BDF files cannot be done


DNS Traverse cannot be executed in the BDF mode and is only limited to the in-memory processing.


###### Error limits


The error limit can only be set for the leaf nodes in XData to native processing and translation with target validation (Transactions, Transmissions, Messages, JSONDocuments, and XMLDocuments).


###### Splitting and acknowledgment creation should be executed within one result processor


The Splitter and Acknowledgment Creator should be executed within one Result Processor (in parallel) as long as acknowledgments are expected to have data splitting results.


###### TA1 Limitation with regard to not reflecting group errors


TA1 mandates that some errors on nested groups should be reflected. For example, if a critical error occurs on the Group level, TA105 should accept an 024 code and TA1 should become rejected. A TA1 should be created when the Interchange is handled and before getting to Group level. With the current implementation, it is not possible to reflect Group errors on a TA1.


###### Error description not informative


If an XML data file has UTF-8 encoding, but the file contains forbidden bytes (like 0xC0 or 0xC1), during transcoding into XEngine internal encoding, the xerces::transcoder throws an exception that says: invalid byte 1 (À) of a 1-byte sequence. This message comes from the xerces transcoder and cannot be more detailed. The numbers that appear in the message are meaningless because they address bytes in the transcoder's local buffer.


###### Errors on NCPDP Batch trailer are reported with incorrect record count


All errors reported on the NCPDP Batch Trailer have invalid record count due to the changed handling of DTL record.


###### JA/JSA data context information for XSD standards


Data offset may not always return correct information based on the current token: - getOffset returns position after opening XML tag for each "on content" handler (in "as is" mode that does not give correct offset for the subsequent calls) - getOffset returns position of the last linked token in the "on end node" handler" instead of node content start offset.


###### Substitution group resolution for macros in XSD


Guideline node returned as a part of the linker event for the element that was matched to the substitution only provides information on the substitution definition and does not provide facets info from the original element definition.


###### Linker events for "any" type on XSD guideline


If element is defined with the type "any" then linker links all content that is found under this element to the element guideline node. This includes values of all attributes found on or under this element in the data.


###### Used XPath expressions


There is a bug in the Xerces XPath scanner. If one of the special characters (#%&;?\^`{}~) is used as an expression (or as an XPath token) the scanner gets into an infinite loop.


###### Crash if exception is thrown from destructor of XEMemOStream


If customer implements his own stream class for XEngine and puts exception throwing in destructor then XEngine crashes when an exception is actually thrown.


###### DB Selector 

- Selector data within the database should only be edited with EAM.
- Only one instance of EAM Server should be connected to the database at one time.
- Edited database selector data should not be saved into the database while XEngine is using the selector for Control Number processing. This leads to an exception.


Note XEngine distribution does not include the Oracle JDBC and PostgreSQL JDBC drivers. To work with Oracle or PostgreSQL databases, you have to download the [Oracle JDBC driver](https://www.oracle.com/database/technologies/appdev/jdbc-downloads.html) or the [PostgreSQL JDBC driver](https://jdbc.postgresql.org/download) and put the ojdbc{version}.jar or postgresql-{version}.jar to ${ECRootPath}/repository/User/XEngine/libs. If you use Edifecs Application Manager and have XEServer installed, make sure that the version of the Oracle JDBC or PostgreSQL JDBC driver that you use in XEngine at ${ECRootPath}/repository/User/XEngine/libs and the version of the Oracle JDBC or PostgreSQL JDBC driver that you use in XEServer at ${XESRoot}\platform\lib.user are the same.


###### XSD support

- Only atomic guidelines are supported. Multiple schemas can be defined, but they must be contained in a single .ecs file.
- Business actions from the original element specification are executed even though the type is specified explicitly by the "xsi:type" attribute.
- Data is linked directly to the corresponding "any" element, "anyAtribute", or an element of "anytype" in "lax" mode and there is no specification for a corresponding item in the XSD.
- Name and namespace URI are missing from the reporting in "skip" or "lax" modes and no specification for the missing item in the XSD.
- No events are generated for missing data content declared in the guideline.
- Tags cannot be applied on XSD virtual nodes.
- Referenced items are reported on the virtual guideline node created with the additional facets from the reference specification.
- Linker event for the element matched to a substitution group provides information on the substitution group definition and does not contain information about the base element itself.
- UPath-based severity is always applied at the element or attribute level. A type-based UPath never matches.  - Valid UPath - "element(name = 'shipTo').sequence[1].complexType(name = 'PurchaseOrderType').element(name = 'purchaseOrder').schema[1]". - Invalid UPath - "complexType(name = 'PurchaseOrderType').element(name = 'purchaseOrder').schema[1]".
- To get the name of a root element in an XSD schema, use the following XPath: <data-pos>name(/*[1])</data-pos>

- The getDataOffset, getDataSize, and isDatPresent methods in JavaScript and Java actions may return unexpected results.
- Business actions from the base types are ignored while processing derived elements.
- Pattern support in XSD guidelines has a limitation while working with ranges. - Usage of the opening or closing hyphen within the range specification is considered to be an incomplete range. Incomplete ranges are interpreted as "starts from zero" or "ends with last character". For example, [-a] is the same as [\\u0000-a], and [a-] is the same as [a-\\uFFFF], [-] means "all characters". A pattern like <xs:pattern value="([+-])?\d+([.,]\d+)?(E)?(-\d+)?"> raises an error and needs to be modified as shown to be properly processed: <xs:pattern value="([\-+])?\d+([.,]\d+)?(E)?(-\d+)?"> This is a limitation of the third-party component (Apache Xerces) used for XSD validation.


###### XEDataHelper Float to string conversion


Converting float to string rounds the decimal part to 3 digits; Specialized Java functions should be used for more precise conversions.


###### Delimiters


Usually delimiter value is set to one character. But segment delimiters can have the length of more than one symbol. For example, delimiter on segment level can be CR and LF, and can also be preceded by 1 other symbol, for example, ~CRLF.


###### Providing a source file


You can no longer use the Validator.JScript.IncludeFile parameter to specify a JavaScript source file. You must use the Validator.JScript.IncludeSourceFile parameter. The source file can be specified in the XERegistry.xml file or by using the parameter in the test harness.


###### Splitting with repackage


If any child has repackage set to false, it does not split at any child level, even if repackage is set to true. It only splits at the parent level.


###### Translator force target creation issue


When forced creation of target is set and a lot of target objects are created, XEngine performance is slowed down when producing result files. However, the time can be reduced by splitting the source file prior to running translation, and then translating each of the data pieces separately.


###### XEngine Application Server issues


When installing XEngine on an application server, there are some special considerations:

- We recommend that you install XEngine JAR files to the shared lib folder, so that the classes are only loaded once - by the common classloader.
- Call XESystem.start only once.


###### Acknowledgment creation is not supported for HL7 2.1


###### Mixed standard files processing


A mixed standards file is a file that contains data, defined in different standards such as EDI file along with Positional Flat file, and so on. Although such combinations are rare, the engine supports this type of standard mixing in a single physical file with certain limitations. Only the following standards can be a part of a mixed file, supported by the new Java engine: X12 (including HIPAA), EDIFACT (including SCRIPT), and HL7. In the next versions this list will be extended.


###### Usage of the Agreements.xml file when the Delimiters section is empty


When the Agreements.xml file structure is incomplete due to an empty Delimiters section, the following exception is reported:


Cannot find data schema for '<std_name>' standard.


In addition, if there are no other errors in XEngine, then XData is generated, while Event report is not.


###### Invalid JavaScript code issue


When XEngine executes invalid JavaScript code, the exact line number where an error has been found may be reported inaccurately.


###### Data Replacement: the quotation marks restriction in JSON string values


The quotation marks that are not masked/released in the string values, such as, "text \"quoted value\" text", may cause an incorrect JSON file in the output.


If a source JSON string value has the following masked/released quotation marks in <comment>:


<comment>This is the test purchase order data file. It should be validated against \"JSON Document for Purchase Order\" a sample guideline.</comment>.


The JSON output file is the following:


"item": {


...


"comment": "This is the test purchase order data file. It should be validated against "JSON Document for Purchase Order" sample guideline."


###### XML Schema Validation issue


XML Schema Validation reports a required attribute twice via ErrorHandler. This [bug](https://bugs.openjdk.org/browse/JDK-8298087) has been introduced in OpenJDK 17.0.5.


###### Error Reporting issue


Due to an issue within certain versions of Java, in some cases, XSD validation report may contain duplicate entries.

---

<a id="xengine-installation"></a>

## XEngine Installation

> 📄 Source: [Book_XEngine_Installation.htm](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/Book_XEngine_Installation.htm)

### XEngine Installation


This section has the following information:

---

<a id="set-environment-variable"></a>

### Set Environment Variable

> 📄 Source: [XE_Set_Environment_Variable.htm](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/XE_Set_Environment_Variable.htm)

#### Set an Environment Variable


Make sure that the JAVA_HOME variable is defined in your system before you run XEngine.


JAVA_HOME: XEngine must be able to locate your Java installation. If JAVA_HOME is not defined as an environment variable, add it to your permanent settings and point to the location of Java in your system.


Example


Set JAVA_HOME=C:\Program Files\Java\jdk-11.0.11


Note JAVA_HOME must point to the location of the latest version of the Java Development Kit (JDK). Automatic Java updates may install the JDK in a directory different from the default one.

---

<a id="install-xengine"></a>

### Install XEngine

> 📄 Source: [Installation_Instructions/Install_XEngine.htm](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/Installation_Instructions/Install_XEngine.htm)

#### Install XEngine


You can install XEngine by using the following tools:

- The InstallShield Wizard package on a Windows platform
- The MultiSetup package on a Windows platform
- The self-extractable package
- The Edifecs Installation Manager package


Before you begin the installation process, make sure you have set the necessary environment variables.


Note In XEngine 9.1 and earlier versions, user configuration files are stored at ${XERoot}/user-configs. Since XEngine 9.2, user configuration files are stored at ${ECRootPath}/repository/User/XEngine/user-configs. During the XEngine 9.2 installation, the user-configs directory with your configuration files is migrated to the new location automatically.


To install XEngine, download an installation file, and use one of the following installation procedures:


| To | Do this |
| --- | --- |
| Download XEngine | To get the download instructions, contact our support team. Download the distribution file named XEngine_(release number).(build number)_(platform)_(archive date).tar.gz for Unix or XEngine_(release number).(build number)_(platform)_(archive date).exe for Windows, where (release number) is the release number, (build number) is the build number, (platform) is the name of your installation platform, and (archive date) is the date when the file was created. |
| Install XEngine on Windows by using InstallShield | Log on to [*https://software.edifecs.com*](https://software.edifecs.com) and navigate to the Windows Installshield directory. Navigate to the directory that corresponds to the version of XEngine you are going to install. Download a distribution file named XEngine_(release number).(build number)_(platform)_(archive date).msi, where (release number) is the release number, (build number) is the build number, (platform) is the name of your installation platform, and (archive date) is the date when the file was created. Double-click the downloaded file to begin the installation. Follow the instructions in the installer to select the appropriate installation options and complete the installation. If you are using XEngine for HIPAA validation, navigate to the HIPAA directory and download the HIPAA standards database (Edifecs Standards Database EDI - HIPAA.msi) and the External Code Lists (ECL) for HIPAA files. Double-click each of those .msi files to install them. |
| Install XEngine on Windows by using MultiSetup package | Contact your Edifecs consultant to receive the MultiSetup package. Double-click the MultiSetup.exe file to begin the installation. By using the Edifecs XEngine Setup 9.4 wizard, you can also install Edifecs Application Manager, XEServer, and Standards Database. By default, all products are installed. Click *, and then click This feature will not be available not to install the selected product. Click Next till you complete the installation. ## Install XEngine Using the Self-extractable Package Note For UNIX systems, the GNU version of tar is required for installation. Prerequisites for installation on Red Hat Enterprise Linux 8.x You should install the libnsl.so.1 package first, before you install XEngine on Red Hat Enterprise Linux 8.x. Since the XEngine installer for UNIX systems requires the libnsl.so.1 library that is not installed in Red Hat Enterprise Linux 8.x by default. Without this library, the XEngine installer will not be able to start. To install the library manually, set up a YUM repository, and then run the following command: yum install libnsl The library is installed at the following location: %ECRootPath%/usr/lib64/libnsl.so.1. #### Installation Steps XEngine is installed in the XEngine directory within the directory specified by the %ECRootPath% environment variable if it has been set, in the folder from which the installation scripts are executed, or in the destination specified by the -d install option (see Install Options). You can identify Edifecs packages when you install XEngine in the current or specified path. The wizard installs them one by one based on a predefined order. The following packages are available for installation: XEngine, XEServer, Edifecs Application Manager, Standards, and ECL. By default, all the packages are selected for installation. Use the following options to specify the installation parameters: - p - path to the folder with packages, optional - i - path to the folder where packages must be installed, optional The following priority of paths is used: -i %ECRootPath%/${XERoot} Current folder To Do this Install XEngine on a UNIX system Navigate to the file directory of your installation platform (some examples below): AIX - IBM AIX Linux -Linux Red Hat Enterprise Linux 7.x, 8.x (available since XEngine 9.2 hotfix 5) (64-bit); Linux SuSE 12, 15. Download a distribution file named XEngine_(release number).(build number)_(platform)_(archive date).tar.gz where (release number) is the release number, (build number) is the build number, (platform) is the name of your installation platform, and (archive date) is the date when the file was created. For more information on downloading an installation file, see the Install XEngine section. If you are using XEngine for HIPAA validation, do the following: Navigate to the HIPAA/HIPAA_Perl_Unix subdirectory. Download the HIPAA standards database contained in the "HIPAAInstEdifecs.tar.gz" file. Navigate to the ECL2/ECL2_Perl_Unix subdirectory. Download the External Code Lists (ECL) for HIPAA contained in the "ECL2InstEdifecs.tar.gz" file. Decompress files from the downloaded distribution archives by executing the following commands in order: gzip -d *.gz tar -xf XEngine_(release)_(build)_(platform)_(date).tar tar -xf HIPAAInstEdifecs.tar (HIPAA only) tar -xf ECL2InstEdifecs.tar (HIPAA only) Install XEngine and, optionally, the HIPAA database and external code lists by typing the following commands: XEngineInstaller HIPAAGuidelineInstaller-(platform) (HIPAA only - this prompts you to install the external code lists) HIPAAEclInstaller-(platform) (HIPAA only - to install this alone) Depending on your installation options, restart the command shell. Some environment settings and calls to the setEnv script may have been specified at a system level, outside of the current user profile. If one or more of the XEngine environment variables retain references to a previous XEngine installation after you restart the command shell, consult your system administrator. Note During installation on Linux, glibc can report an invalid pointer error which you can safely suppress by setting the environment variable MALLOC_CHECK_=0. Install XEngine on Windows Navigate to the directory of your installation platform. Download a distribution file named XEngine_(release number).(build number)_(platform)_(archive date).exe where (release number) is the release number, (build number) is the build number, (platform) is the name of your installation platform, and (archive date) is the date when the file was created. For more information about downloading an installation file, see the Install XEngine section. Double-click the .exe file to extract the installation files. Double-click the XEngineInstaller.exe file to start the installation. XEngine is installed in the %ECRootPath%/${XERoot} directory. If you are using XEngine for HIPAA validation, do the following: Navigate to the HIPAA/HIPAA_Perl_Win subdirectory. Download the HIPAA standards database contained in the "HIPAAInstEdifecs.exe" file. Navigate to the ECL2/ECL2_Perl_Win subdirectory. Download the External Code Lists (ECL) for HIPAA contained in the "ECL2InstEdifecs.exe" file. Double-click the .exe files to extract the installation files. Install the application and, optionally, the HIPAA standards database and the external code lists, by typing the following commands: XEngineInstaller.exe HIPAAGuidelineInstaller-(platform).exe HIPAAEclInstaller-(platform).exe Install XEngine with Edifecs Installation Manager Edifecs Installation Manager is a framework that allows you to remotely install and configure Edifecs products (XEngine, XEServer, and so on) on multiple hosts. Using Edifecs Installation Manager, you can: Install several products on different hosts. Configure installation parameters for these products. Manage products installed on remote hosts. To install XEngine using Edifecs Installation Manager, you should first install Edifecs Installation Manager. To get the Edifecs Installation Manager installer (eim-portal-dist-(release number).zip), contact Edifecs support*. ## Installation To install XEngine, complete the steps below. #### Prerequisites Before you install XEngine using Edifecs Installation Manager, make sure you have the following: Edifecs Installation Manager is [installed and configured](https://help.edifecsfedcloud.com/go/eim/1.0/Content/Set_up_Installation_Manager.htm) on the control host. Remote hosts for the Edifecs products are [prepared](https://help.edifecsfedcloud.com/go/eim/1.0/Content/Remote_Hosts_and_Third-Party_Software.htm). Edifecs Installation Manager can install XEngine on Windows and Linux. Before you install XEngine using Edifecs Installation Manager, make sure that a remote host has the required hardware and software installed. A remote host with installed and configured SSH Server is [added](https://help.edifecsfedcloud.com/go/eim/1.0/Content/EIM_Add_Server.htm) to Edifecs Installation Manager. To install XEngine using Edifecs Installation Manager: To get the download instructions, contact [*Edifecs support*](https://support.edifecs.com/). On the control host, copy the distribution file named eim-xe-(release number).(build number).im.zip to the im_data [folder](https://help.edifecsfedcloud.com/go/eim/1.0/Content/Set_up_Installation_Manager.htm). The system environment variable $IM_DATA must point to this folder. [Start](https://help.edifecsfedcloud.com/go/eim/1.0/Content/Set_up_Installation_Manager.htm) Edifecs Installation Manager if it has not yet been started. On the Edifecs Installation Manager page, at the top right, in the PRODUCTS list, make sure that a corresponding XEngine item has appeared. Under SERVERS, select a server (a remote host) you need. Next to your server name, click , and then, from the drop-down menu, select Properties. In the Edifecs Installation Manager page, under SERVERS, next to your server name, click Add Products/Components. In the <YourServerName>/Add Products/Components pane, select a product (XEngine) you need. Click Add Selected. XEngine appears in your server list with products to install. In the Edifecs Installation Manager page, under SERVERS, in your server, select XEngine, and then, at the top right, click Next. On the DEPLOYMENT pane, click Start Deployment. XEngine is installed on your remote host. |

 Install a Hotfix


To install an XEngine hotfix for a corresponding release version, complete the following steps:


###### Prerequisites


A corresponding release version, for example, XEngine 9.4.

 Prerequisites for installation on Red Hat Enterprise Linux 8.x


You should install the libnsl.so.1 package first, before you install XEngine on Red Hat Enterprise Linux 8.x. Since the XEngine installer for UNIX systems requires the libnsl.so.1 library that is not installed in Red Hat Enterprise Linux 8.x by default. Without this library, the XEngine installer will not be able to start.


To install the library manually, set up a YUM repository, and then run the following command:


yum install libnsl


The library is installed at the following location: %ECRootPath%/usr/lib64/libnsl.so.1.






To install a hotfix:


To install a hotfix as the .jar file:

1. Run the command: java -jar xe-hotfix-<NumberOfHotfix>.jar, for example, java -jar xe-hotfix-9.4.jar.
2. To check if the hotfix has already been installed, run the command: java -jar xe-hotfix-<NumberOfHotfix>.jar check, for example, java -jar xe-hotfix-9.4.jar check.

---

<a id="install-options"></a>

### Install Options

> 📄 Source: [Install_Options.htm](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/Install_Options.htm)

#### Install Options


The following options are available for installations on Windows and Unix:


-h Print this help message


-j <ini_loc> The path to the installation ini file (if the path not defined install.ini will be picked up from the script folder)


-s <package_loc> Path to the installation package


-d <install_path> Destination: path where the product will be installed


-r <root_path> The Edifecs products root folder. Has no effect if such folder is already set


-b A flag, to retain backup of the previous version


-m Disable system environment update (environment variables, Windows registry, COM)


-l <log_name> Redirect all output to the file <log_name>


-null Suppress NULL redirection in system calls

---

<a id="test-xengine-installation"></a>

### Test XEngine Installation

> 📄 Source: [Book_Test_the_XEngine_Installation.htm](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/Book_Test_the_XEngine_Installation.htm)

#### Test the XEngine Installation


This section has the following information:

---

<a id="test-your-installation"></a>

#### Test Your Installation

> 📄 Source: [Test_Your_Installation.htm](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/Test_Your_Installation.htm)

##### Test Your Installation


Run the Test Harness Test Your Own File(s)


To help you test your installation, the following test harness is shipped with XEngine:

- Java-based test harness - %XERoot%/exec/run.bat


Note UNIX systems - the Java test harness is %XERoot%/exec/run.sh.


This test harness can be run on AIX, Linux, Windows.


Note The Java test harness relies on the JDK, the location of which must be specified by using the JAVA_HOME environment variable - for example, JAVA_HOME= C:\Program Files\Java\jdk-11.0.11.


###### Run the Test Harness


Perform the following tasks prior to using the test harnesses on Windows: 

1. Edit the run.bat file and change the java executable path to the proper location of java.exe. 
2. Execute %XERoot%/exec/setEnv.bat to set the proper environment variables needed by the test harnesses.


Note When using Unix, execute . ./setEnv.sh to create required environment variables for current session.


Before processing any samples, run the test harness without parameters. If XEngine is installed correctly, the argument list is displayed.

 Click here to see test harness parameters.


| xeconsole v7.0.0.2804 Usage: xeconsole <options>, where options are -<option name> <option_value>. -d <datafile> : name of data file. Accumulative -x <xdatafile> : name of XData file. Accumulative -md "<datafile>\|<source name>" : name of data file and corresponding source name for mapping. Accumulative, see the following samples -dir <foldername>: A folder containing data and XData files to be processed -mdir <foldername>: a folder of data files for mapping -g <guideline> : name of guideline file -map <mapfile> : name of map file -s <settings> : 0 - DNSB, 1 - LDNSB, 2 - VALIDATOR, 4 - CONVERTER 8 - CUSTOM, 16 - TARGET VALIDATOR, the combination of this flags can be specified manually -system <param>=<value>: sets global system parameters. Accumulative -i <number> : number of iterations (the default value is 1) -reset <number> : number of iterations with calling of XESystem::reset() between them (the default value is 1) -o <output> : prefix name of the output file -m <number> : use memory blob for data: 0 - no memory blob, 1 - BLOB, 2 - pre-created data node, 3 - stream -oe <encoding> : flag specifies encoding of the data. By default, it is UTF-16 -ie <encoding> : flag specifies encoding of the input data. By default, encoding is autodetected. -sl <filename> : specifies an optional selector to process a Data Source object. -a <X\|N\|XN\|D> : creates acknowledgment: N - as native, X - as XML, D - acks will be created basing on default settings, Default is None -e <X\|H\|XH> : generates error report. H - HTML, X - XML, M - Multipage HTML -mr <X> : generates mapper report. X - XML H - HTML, M - Multipage HTML -dr <H> : generates DataWithError report. H - HTML -df <N> : generates COBA Dispute file. N - native -cr <N> : generates Consumable Error report. N - native -ldns <X\|H\|XH> : generates ldns report. H - HTML, X - XML M - Multipage HTML -task <filename>: name of the master task file -sr <X\|H\|XH> : generates summary report. H - HTML, X - XML -rp <RPName> : registers custom result processor with the name "RPName" -ep <param>=<value>: specifies engine parameters. Accumulative -dp <param>=<value>: specifies data source parameters. Accumulative -mo <N\|XD\|MD\|NB>: specifies output format for Mapper: N - Native, XD - XData, MD - MData, NB - NativeBatch -ps <filename> : specifies an optional parser schema to process a Data Source object. Accumulative -dns : dumps an XML image of Data Node Structure. -evt : dumps an XML image of the list of XEngineEvents. -xsd <filename> : validates the supplied XML with -x against <filename> -rule <RuleName>: activates data splitting and specifies the data splitter rule to process. If "all" is specified then all data splitter rules are processed -reuse <N\|W\|A> : turns on reusing mode. By default, reusing is disabled. N - none(default), W - weak, A - agressive -t <number> : specifies the number of threads (the default value is 1) -tm <p\|s> : thread model p - thread pool, s - simple(default) -vf <filename> : result verification file -template <template>: template for DNS dump. Accumulative -value <value> : value to retrieve from DN during DNS dump. Accumulative -st <short\|full>: statistic saving. -sf <0\|1\|2> : stream factory. 0 - new style names (by default), 1 - old style names, 2 - empty streams(no output) -ex : do not stop execution after the exception. -log <filename> : logs all console output to external file - sz <size_limit> : limits log file size to <size_limit> bytes -bdf <0\|1\|2> : BDF support 0 - off (by default), 1 - DN reporting is not supported for this release. -bdf 0 will be used. 2 - BDF support -w : wait for enter to be pressed before execution -progress <number>: shows progress with step of <number> percents -listen : listens to external command. Starts additional thread which listens to STDIN for s_stop, s_reset, a_stop, a_reset commands -harness-mode <client\|server>: starts harness in client or server mode. The default value is None, so the console starts in usual mode -servername <server>: specifies server name. May be specified as server:port. Unsupported -serverport <number>: specifies server port. The default value is 10002 for both client and server -command <command>: Has effect only in client mode 0 - XESystem::start, calls XESystem::start() on server side 1 - XESystem::stop, calls XESystem::stop() on server side 2 - XESystem::reset, calls XESystem::reset() on server side 3 - XESystem::terminate, calls XESystem::terminate() on server side 4 - Server::stop, stops the xeconsole server -sync <0\|1\|2> : Has effect only in client mode. Starts client in synchronous(1), asynchronous(0) or semi-synchronous mode(2). In synchronous mode client waits for the server to complete the task. In asynchronous mode it exits immediately after task is transmitted and put to the task queue. In semi-synchronous mode client waits for the number of iterations specified by -iw option, and then exit (the default value is 1) -maxclients <number>: Has effect only in server mode. Maximum number of simultaneous client connections (the default value is 1) -iw <number> : Number of iteration to wait for the response from the server. Has effect only with -sync 2 and -harness-mode client. The default value is 0 (return immediately). -dnstart <dotted_notaion>: start validation from specific data node. Has effect only with -m 2 and predefined guideline for desired transaction specified with option -g where <doted_notation> has a format of A[.B.C...]. Examples for X12/EDIFACT data structures: "2" refers to Interchange[2]. "3.1" refers to Interchange[3]/Group[1]. "1.1.2" refers to Interchange[1]/Group[1]/Transaction[2]. -v : prints version info and exits -va : prints versions for all binaries and exits -regexp <templatefile>\|<valuefile> : check value by regular expression   Options -d, -x, -g, -ps, -sl, -value, -template may be specified in the following format -<option> @<filename>, where filename contains new line separated list of the values for the <option> Options -system, -ep, -dp may be specified in the following format -<option> @<filename>, where filename contains new line separated list of parameters in the following form: <parameter_name> <parameter_value>   Run Translator without validation of the target data: xeconsole.exe -md "837.dat\|Main" -md "DFF.dat\|Additional 2" -map test.ems   Run Translator with validation of the target data by using list of sources and parser schemas: xeconsole.exe -md @dat.txt -ps @ps.txt -map test.ems -s 16 where dat.txt content (order is not important when source names are provided): 837.dat\|Main DFF.dat\|Additional 1 DFF2.dat\|Additional 2 and ps.txt (order must match the order of sources in dat.txt): <empty line for 837 means that parser schema from XE config should be used> DFF_Parser_Schema.ecs DFF_Parser_Schema.ecs Option -mo is shorthand for -ep Mapper.Settings.OutputFormat= for example, -mo N is equivalent of -ep Mapper.Settings.OutputFormat=Native |
| --- |







For a complete explanation of test harness parameters, see [Test Harness Parameters](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/Test_Harness_Parameters.htm).


Edifecs provides a set of sample test files and guidelines for all the supported standards that can be found in the ${XERoot}/samples/standards directory. XEngine is configured to run these sample files and validate any of these files.


To verify XEngine and the HIPAA configuration, perform a validation of sample HIPAA file by running the following command line:

- For Windows: `%XERoot%/exec/run.bat -d "/samples/standards/HIPAA/data/837-1-ex1_A1.dat" -s 2`
- For Unix: `$XERoot/exec/run.sh -d "/samples/standards/HIPAA/data/837-1-ex1_A1.dat" -s 2`


The “-d <data_file>” mode initializes native data processing specified in parameter “-s”. When "-s" is 4 or 7, XEngine processes in Native-to-XData mode, and “-s 2” specifies that a full validation is performed.


Sample files shipped with XEngine have no errors in the data and the verification completes without errors on any correctly-configured system. When using Windows, ${XERoot} should be substituted with an appropriate location.


Note You should have External Code Lists installed on your computer before running validation.


If you are running the data splitting operation from the run.bat utilities, you must specify the "-s 3" and "-rule all" flags. The "-s 3" flag is effectively an AND operation of the "-s 1" and "-s 2" flags, which results in the validation and result splitting operations being executed. The "-rule all" flag enables the generation of an XML file containing the name of the data splitting rule used during data processing and includes all data splitting rules.


To see the result and create an XML audit report, run "-e X" in the command line, or "-e H" for an HTML report, or "-e XH" for both.


###### Test Your Own File(s)


In a production environment, XEngine uses the Selector to route transactions to the proper guideline based on a number of lookup parameters, including Sender/Receiver ID's, Version, and Transaction ID. The XEngine evaluation setup includes a Selector that is configured for use with the sample data files provided by Edifecs.

---

<a id="test-by-customizing-selector"></a>

#### Test by Customizing Selector

> 📄 Source: [Test_by_Customizing_the_Selector.htm](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/Test_by_Customizing_the_Selector.htm)

##### Test by Customizing the Selector


One option for testing your installation is to edit the ${XERoot}/config/XESelectorConfig-generic.xml file directly to test your data file’s sender/receiver IDs. To do so, follow these steps:


Note Lookup link name/value pairs are case sensitive. Be sure to enter the names and values exactly as they appear.

1. Make a backup copy of XESelectorConfig-generic.xml file.
2. Open XESelectorConfig-generic.xml file in a text or XML editor.  
3. Locate the first lookup line matching your interchange control version as in the following example:


Example


<lookup linkName="InterchangeControlVersion">00401</lookup>

1. Edit the lookup lines immediately following that line to define your data sender/receiver information.


Example


<lookup linkName="InterchangeSenderID">Interchange Sen</lookup>


<lookup linkName="InterchangeSenderQual">ZZ</lookup>


<lookup linkName="InterchangeReceiverID">Interchange Rec</lookup>


<lookup linkName="InterchangeReceiverQual">ZZ</lookup>


<lookup linkName="InterchangeControlVersion">00401</lookup>


The code values in the lookup lines should correspond to the ISA fields of the data. Examples of the ISA fields are the following:


Example


InterchangeSenderID = <ISA06>


InterchangeSenderQual = <ISA05>


InterchangeReceiverID = <ISA08>


InterchangeReceiverQual = <ISA07>

1. Repeat a similar lookup line customization for the functional group level within the same interchange:


Example


<lookup linkName="GroupVersionNumber">004010X098</lookup>


<lookup linkName="GroupSenderID">Application Sen</lookup>


<lookup linkName="GroupReceiverID">Application Rec</lookup>


Lookup values should match the GS fields of the data, as in the following:


Example


GroupSenderID = <GS02>


GroupReceiverID = <GS03>

1. Once the selector changes have been saved, run the validation by entering the following command line:

---

<a id="test-by-using-command-line-parameter"></a>

#### Test by Using Command Line Parameter

> 📄 Source: [Test_by_Using_a_Command_Line_Parameter.htm](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/Test_by_Using_a_Command_Line_Parameter.htm)

##### Test by Using a Command Line Parameter


When testing your installation, the selector configuration can be bypassed altogether by specifying the guideline to be used in a parameter for the run.bat (or run.sh) utility. When XEngine uses the selector, the envelope segments are normally kept separate from the transaction and validated separately. When you include the name of the guideline as a parameter for the run.bat (or run.sh) utility, you are specifying to run.bat (or run.sh) that your guideline is complete and includes information about envelope segments. You can create complete guidelines based on standard ones by using SpecBuilder and including envelope segments.


Once you have a complete guideline file, run the validation by using the following command line:

- For Windows: `run.bat -d <datafile> -s 2 -g <guideline_file>`
- For Unix: `run.sh -d <datafile> -s 2 -g <guideline_file>`


Note The drawback to using this method is that your test data file cannot contain multiple transactions of different types - for example, the test file cannot contain a mix of type 837 transactions with type 834 and type 276.

---

<a id="test-harness-parameters"></a>

#### Test Harness Parameters

> 📄 Source: [Test_Harness_Parameters.htm](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/Test_Harness_Parameters.htm)

##### Test Harness Parameters


Valid parameters for the "run.sh" and "run.bat" test harness scripts are listed in the following table.


The following rules apply to the specification of these parameters:

- One of the following parameters is required each time you process a file with the test harness (-d, -x, -ecs, or -dir). All other parameters are optional.
- Only one -d or -ecs can be specified in one command line execution.
- Specifying several -x parameters starts XDataToNative in batch mode.
- Parameters can appear in any order.
- When using multiple parameters, separate them with spaces.


| Parameter | Description |
| --- | --- |
| -d <datafile> | The name of a data file. |
| -x <xdatafilename> | The name of an XData file. |
| -md "<datafile>\|<source name>" | The name of a data file and a corresponding source name for mapping. |
| -dir <foldername> | A folder containing data and XData files to be processed. |
| -mdir <foldername> | A folder containing data files for mapping. |
| -g <guideline> | The name of a guideline file. |
| -gdir <directory> | A directory containing guidelines to be processed. |
| -map <mapfile> | The name of a map file. |
| -s <settings> | 0 - DNSB 1 - LDNSB 2 - VALIDATOR 4 - CONVERTER 8 - CUSTOM 16 - TARGET VALIDATOR 32 - Converts native data to JData or JData to native data 64 - TAGGING. The combination of these flags can be specified manually. |
| -system <param>=<value> | The global system parameters. |
| -i <number> | The number of iterations. The default value is 1. |
| -reset <number> | The number of iterations with calling of XESystem::reset() between them. The default value is 1. |
| -o <output> | The prefix name of an output file. |
| -m <number> | The usage of a memory blob for data: 0 - no memory blob, 1 - BLOB, 2 - a pre-created data node, 3 - a stream, 4 - a BLOB with a specified encoding. |
| -oe <encoding> | This flag specifies encoding of the data. By default, it is set to UTF-16. |
| -ie <encoding> | This flag specifies encoding of the input data. By default, encoding is autodetected. |
| -j <selector_type> | This flag specifies a selector type to be used: 1 - an external Java selector, 2 - a common Java selector. |
| -sl <filename> | Specifies an optional selector to process a Data Source object. |
| -tpname <tp_name> | Specifies a trading partner name (works only with -j 2 option) |
| -a <X\|N\|XN\|D> | Creates an acknowledgment: N - as native, X - as XML, XN - as XML and native, D - acknowledgments are created based on default settings. The default value is None. |
| -e <X\|H\|XH> | Generates an error report. H - an HTML format, X - an XML format, M - a Multipage HTML format, XHM - XML, HTML, and Multipage HTML formats. |
| -mr <X> | Generates a mapper report. X - an XML format, H - an HTML format, M - a Multipage HTML format, XHM - XML, HTML, and Multipage HTML formats. |
| -dr <H> | Generates a DataWithError report. H - an HTML format. |
| -df <N> | Generates a COBA Dispute file. N - a native format. |
| -cr <N> | Generates a Consumable Error report. N - a native format. |
| -ldns <X\|H\|XH> | Generates an ldns report. H - an HTML format, X - an XML format, M - a Multipage HTML format, XHM - XML, HTML, and Multipage HTML formats. |
| -locale <id> | The particular locale. |
| -task <filename> | The name of a master task file. |
| -sr <X\|H\|XH> | Generates a summary report. H - an HTML format, X - an XML format, XH - XML and HTML formats. |
| -rp <RPName> | Registers a custom result processor with a specified name. |
| -ep <param>=<value> | Specifies engine parameters. |
| -dp <param>=<value> | Specifies data source parameters. |
| -mo <N\|XD\|MD\|NB> | Specifies an output format for a Mapper: N - a Native format, XD - an XData format, MD - an MData format, NB - a NativeBatch format. |
| -ps <filename> | Specifies an optional parser schema to process a Data Source object. |
| -dns | Dumps an XML image of a Data Node Structure. |
| -evt | Dumps an XML image of the list of XEngineEvents. |
| -xsd <filename> | Validates the supplied XML with -x against the specified file. |
| -rule <RuleName> | Activates data splitting and specifies the data splitter rule. If "all" is specified, then all data splitter rules are processed. |
| -t <number> | Specifies the number of threads. The default value is 1. |
| -tm <p\|s> | A thread model. p - a thread pool, s - simple (default). |
| -vf <filename> | A result verification file. |
| -template <template> | The template for a DNS dump. |
| -value <value> | The value to retrieve from DN during a DNS dump. |
| -st <short\|full> | Saves the statistic. |
| -sf <0\|1\|2> | A stream factory. 0 - new style names (default), 1 - old style names, 2 - empty streams(no output). |
| -ex | Enables the execution after an exception occurs. 0 - the execution does not stop when an exception occurs. 1 - the execution stops when an exception occurs. |
| -log <filename> | Logs all console output to the external file. |
| -xelog <filename> | Logs execution details to the external file. |
| -sz <size_limit> | Limits log file size (in bytes). |
| -bdf <0\|1\|2> | Specifies the BDF (big data file) support mode, which is used for processing big data files: 0 - the BDF support is disabled. 1 - currently the same as mode 0. This mode is updated in future versions of the test harness. 2 - The BDF support is enabled. Note The BDF mode is not supported for the XML standard. For more information, see [Big Data File Mode](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/Big_Data_File_Mode.htm). |
| -w | Wait for enter to be pressed before the execution. |
| -progress <number> | Shows progress with the step of <number> percents. |
| -harness-mode <client\|server> | Starts the harness in the client or server mode. The default value is None, so the console starts in the usual mode. |
| -servername <server> | Specifies a server name. May be specified as server:port. Unsupported. |
| -serverport <number> | Specifies a server port. The default value is 10002 for both client and server. |
| -command <command> | Has an effect only in the client mode. 0 - XESystem::start, calls XESystem::start() on the server side 1 - XESystem::stop, calls XESystem::stop() on the server side 2 - XESystem::reset, calls XESystem::reset() on the server side 3 - XESystem::terminate, calls XESystem::terminate() on the server side 4 - Server::stop, stops the server |
| -sync <0\|1\|2> | Has an effect only in the client mode. Starts a client in the synchronous(1), asynchronous(0) or semi-synchronous(2) mode. In the synchronous mode, the client waits for the server to complete the task. In the asynchronous mode, it exits immediately after a task is transmitted and put to the task queue. In the semi-synchronous mode, the client waits for the number of iterations specified by the -iw parameter, and then exits. The default value is 1. |
| -maxclients <number> | Has effect only in the server mode. The maximum number of simultaneous client connections. The default value is 1. |
| -iw <number> | The number of iteration to wait for the response from the server. Has an effect only with the -sync 2 and -harness-mode client. The default value is 0 (return immediately). |
| -dnstart <dotted_notaion> | Start the validation from a specific data node. Has an effect only with the -m 2 and predefined guideline for a desired transaction specified with option -g where <doted_notation> has a format of A[.B.C...]. Examples for X12/EDIFACT data structures: "2" refers to Interchange[2]. "3.1" refers to Interchange[3]/Group[1]. "1.1.2" refers to Interchange[1]/Group[1]/Transaction[2]. |
| -v | Prints a version info and exits. |
| -va | Prints versions for all binaries and exits. |
| -dumpPID <filename> | Adds the process ID to an external file. |
| -ts<tag schema> | Defines a tag schema to use. |
| -tr | Enables a DFF tag flat report. |

---

<a id="uninstall-xengine"></a>

### Uninstall XEngine

> 📄 Source: [Installation_Instructions/Uninstall_XEngine.htm](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/Installation_Instructions/Uninstall_XEngine.htm)

#### Uninstall XEngine


You can uninstall XEngine by using the Control Panel in Windows or by using the following steps in Unix.


| To | Do this |
| --- | --- |
| Uninstall XEngine | Rename your current XEngine installation directory. Remove the %ECRootPath%/Common and %ECRootPath%/STANDARDS directories. Edit the shell profile files (.profile, .bash_profile, and .login, and the rest) to remove all the references to the setEnv.sh script from <${XERoot}> or its subdirectories. Only if you manually preset the XEngine environment, edit any of the following environment variables that are defined on your system to remove all the references to the files/folders residing in the ${XERoot} folder or its subfolders: PATH and LD_LIBRARY_PATH/SHLIB_PATH /LIBPATH. Only if you manually preset the XEngine environment, remove the following environment variables: %ECRootPath%, %XERoot% and %Z%. Restart the command shell to refresh the environment settings. |

---

<a id="xengine-architecture"></a>

## XEngine Architecture

> 📄 Source: [Book_XEngine_Architecture.htm](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/Book_XEngine_Architecture.htm)

### XEngine Architecture


This section has the following information:

---

<a id="xengine-architecture-overview"></a>

### XEngine Architecture Overview

> 📄 Source: [XEngine_Architecture_Overview.htm](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/XEngine_Architecture_Overview.htm)

#### XEngine Architecture Overview


The XEngine API contains interfaces and classes that validate and convert native EDI data files to XData format and XData to native EDI. In addition to validation and conversion, the API provides extensive support for analyzing the results of data handling that allows you to locate errors and to split the results of incoming data according to the criteria you specify.


The XEngine API provides two distinct processing mechanisms for handling data - data processing and result processing.


Data processing refers to the handling of the data itself, its parsing, validation, conversion, creation of Data Node Structure or Logical Node Structure. For more information, see [Data Processing](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/Data_Processing_Overview.htm).


###### Data Processing

- [Parsing Data](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/Parsing_Overview.htm)
- Link to Guidelines
- Validate Data
- [Create a Data Node Structure](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/Data_Node_Structure_Overview.htm)
- [Create a Logical Data Node Structure](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/Data_Node_Structure_Overview.htm#ldns)
- Convert Data
- [Create Audit Objects](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/Audit_Information_Overview.htm)


Result processing refers to the generation of reports based on the resulting audit object. These reports allow you to analyze specific aspects of the processed data, including result-driven data. For more information, see [Processing Results](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/Book_Results_Processing.htm).


###### Result Processing

- [Create Acknowledgments](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/Acknowledgements_Overview.htm)
- Create Error Reports

---

<a id="xengine-directory-structure"></a>

### XEngine Directory Structure

> 📄 Source: [XEngine_Directory_Structure.htm](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/XEngine_Directory_Structure.htm)

#### XEngine Directory Structure


The directory structure that is created when XEngine is installed is shown later in this topic. Click a directory icon to see the description of its contents. Note that this is the general directory layout and not all directories in the structure are described.


*[Image: XEngine Directory Structure]*

---

<a id="enhance-xengine-performance"></a>

## Enhance XEngine Performance

> 📄 Source: [Book_XE_Enhance_XEngine_Performance.htm](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/Book_XE_Enhance_XEngine_Performance.htm)

### Enhance XEngine Performance


This section has the following information:

---

<a id="understand-xengine-performance-statistics"></a>

### Understand XEngine Performance Statistics

> 📄 Source: [Understand_XEngine_Performance_Statistics.htm](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/Understand_XEngine_Performance_Statistics.htm)

#### Understand XEngine Performance Statistics


Short Performance Statistic Report Example Long Performance Statistic Report Example


When you set the option to gather performance statistics, the results of the performance tests are written to a file named "statistics.xml" in the current working directory.


The first time XEngine is installed and a data file is processed, the processing time reported includes the time to convert the ECS guideline file into the optimized TGL format in addition to the process execution time. When performance tests are iterated, the processing time for successive iterations is less. This is because processing time is greatly reduced after the guidelines have been cached in memory. The time it takes to execute the second and later iterations is the best estimate of how XEngine performs when you have integrated it into your runtime environment.


Note that when processing data by using multiple iterations, the average time reported at the conclusion of the processing does not include the execution time of the first iteration.


The performance test utility can produce full and short statistic reports. Specify the “-st full” parameter to print a full statistic report, and “-st short” to print a short report.


##### Short Performance Statistic Report Example


The following XML code is an example of a short statistic report obtained by running the performance test with the "sample 101.dat" file for 10 iterations:


Example


<?xml version="1.0" encoding="UTF-8"?>


<XEStatistics>


   <Average>


The following line displays the total performance time from start to finish:


Example


 <statistics name="XEconsole" fullTime="2062" />    


The following line displays the total performance time of the task. A task is a performance test of one data file. The value is computed because the test harness can process several tasks simultaneously.


Example


<statistics name="Task" fullTime="1969" />


The Iteration value in the following line includes the time for data processing, result processing and verification. Technically, all numbers in this item are sum of (data processing, result processing and verification) and the value can be different from sum because of the limited precision of the computer timer.


Example


 <statistics name="Iteration" fullTime="1966" firstIter="1848" count="10" avTime="13" fullAvTime="196"/>


The fullTime parameter value in the following line is the total time of all iterations in result processing. The firstIter parameter value is the total time of the first iteration. The count parameter value is the number of iterations in this test. The avTime parameter value is the average time of one iteration, not counting the time of the first iteration. The fullAvTime parameter value is the average time of all iterations including the first one.


Example


<statistics name="ResultProc" fullTime="46" firstIter="18" count="10" avTime="3" fullAvTime="4"/>


The following line displays the corresponding data processing performance values:


Example


<statistics name="DataProc" fullTime="1906" firstIter="1820" count="10" avTime="9" fullAvTime="190"/>


The following line displays the verification performance values:


Example


 <statistics name="Verification" fullTime="0" firstIter="0" count="10" avTime="0" fullAvTime="0"/>


    </Average>


The following line displays the total performance test time. This is the same value as the fullTime parameter in the first statistics tag.


Example


 <Level name="XEconsole" time ="2062"/>


</XEStatistics>


##### Long Performance Statistic Report Example


The following XML code is an example of a full statistic report obtained by running the performance test with the "sample 101.dat" file for 10 iterations. The first three lines are identical to the short report.


Example


<?xml version="1.0" encoding="UTF-8"?>


<XEStatistics>


   <Average>


      <statistics name="XEconsole" fullTime="2097" />


      <statistics name="Task" fullTime="2001" />


      <statistics name="Iteration" fullTime="1999" firstIter="1903" count="10" avTime="10" fullAvTime="199"/>


      <statistics name="ResultProc" fullTime="30" firstIter="17" count="10" avTime="1" fullAvTime="3"/>


      <statistics name="DataProc" fullTime="1958" firstIter="1877" count="10" avTime="9" fullAvTime="195"/>


      <statistics name="Verification" fullTime="0" firstIter="0" count="10" avTime="0" fullAvTime="0"/>


   </Average>


   <Level name="XEconsole" time ="2097">   [This line displays the Iterations statistic.]


      <Level name="Task" comment ="N2X" time ="2001"> [This line displays the total test time.]


         <Level name="Iteration" comment ="iter#_0" time ="1903">  [This line displays the sum of the data and result processing time.]


            <Level name="DataProc" comment ="preparation and execution" time ="1877"/> [This line displays the data processing time of iteration #0.]


            <Level name="ResultProc" comment ="preparation and execution" time ="17">  [This line displays the result processing time of iteration #0.]


               <Level name="Verification" comment ="Result verification" time ="0"/>


            </Level>


         </Level>


         <Level name="Iteration" comment ="iter#_1" time ="10">


            <Level name="DataProc" comment ="preparation and execution" time ="9"/>


            <Level name="ResultProc" comment ="preparation and execution" time ="1">


               <Level name="Verification" comment ="Result verification" time ="0"/>


            </Level>


         </Level>


         <Level name="Iteration" comment ="iter#_2" time ="10">


            <Level name="DataProc" comment ="preparation and execution" time ="9"/>


            <Level name="ResultProc" comment ="preparation and execution" time ="1">


               <Level name="Verification" comment ="Result verification" time ="0"/>


            </Level>


         </Level>


         <Level name="Iteration" comment ="iter#_3" time ="11">


            <Level name="DataProc" comment ="preparation and execution" time ="9"/>


            <Level name="ResultProc" comment ="preparation and execution" time ="2">


               <Level name="Verification" comment ="Result verification" time ="0"/>


            </Level>


         </Level>


         <Level name="Iteration" comment ="iter#_4" time ="10">


            <Level name="DataProc" comment ="preparation and execution" time ="9"/>


            <Level name="ResultProc" comment ="preparation and execution" time ="1">


               <Level name="Verification" comment ="Result verification" time ="0"/>


            </Level>


         </Level>


         <Level name="Iteration" comment ="iter#_5" time ="13">


            <Level name="DataProc" comment ="preparation and execution" time ="9"/>


            <Level name="ResultProc" comment ="preparation and execution" time ="4">


               <Level name="Verification" comment ="Result verification" time ="0"/>


            </Level>


         </Level>


         <Level name="Iteration" comment ="iter#_6" time ="11">


            <Level name="DataProc" comment ="preparation and execution" time ="9"/>


            <Level name="ResultProc" comment ="preparation and execution" time ="1">


               <Level name="Verification" comment ="Result verification" time ="0"/>


            </Level>


         </Level>


         <Level name="Iteration" comment ="iter#_7" time ="10">


            <Level name="DataProc" comment ="preparation and execution" time ="9"/>


            <Level name="ResultProc" comment ="preparation and execution" time ="1">


               <Level name="Verification" comment ="Result verification" time ="0"/>


            </Level>


         </Level>


         <Level name="Iteration" comment ="iter#_8" time ="11">


            <Level name="DataProc" comment ="preparation and execution" time ="9"/>


            <Level name="ResultProc" comment ="preparation and execution" time ="1">


               <Level name="Verification" comment ="Result verification" time ="0"/>


            </Level>


         </Level>


         <Level name="Iteration" comment ="iter#_9" time ="10">


            <Level name="DataProc" comment ="preparation and execution" time ="9"/>


            <Level name="ResultProc" comment ="preparation and execution" time ="1">


               <Level name="Verification" comment ="Result verification" time ="0"/>


            </Level>


         </Level>


      </Level>


   </Level>


</XEStatistics>

---

<a id="enhance-xengine-performance"></a>

### Enhance XEngine Performance

> 📄 Source: [Enhance_XEngine_Performance.htm](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/Enhance_XEngine_Performance.htm)

#### Enhance XEngine Performance


This section describes various XEngine settings that you can modify in order to enhance XEngine's validation, conversion, and data splitting performance. Depending on the kind of data you are handling and your environment, some or all of the settings described can be modified to improve XEngine's performance over its behavior by using the default settings.


Click one of the following for more information:

- [Understand XEngine Performance Numbers](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/Understand_XEngine_Performance_Numbers.htm)
- [Guideline Caching](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/Guideline_Caching.htm)
- [Data Splitting Overview](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/Data_Splitting_Overview.htm)
- [External Code List Caching](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/External_Code_List_Caching.htm)
- [JavaScript Caching](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/JavaScript_Caching.htm)
- [Disable Parser Schemas](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/Disable_Parser_Schemas.htm)
- [Disable Syntax Checking](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/Disable_Syntax_Checking.htm)

---

<a id="understand-xengine-performance-numbers"></a>

### Understand XEngine Performance Numbers

> 📄 Source: [Understand_XEngine_Performance_Numbers.htm](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/Understand_XEngine_Performance_Numbers.htm)

#### Understand XEngine Performance Numbers


During process execution, performance information is written on the screen. At the bottom of the report for each iteration, the time it takes to process one iteration is reported in ticks (1000 ticks equal approximately 1 second). The very first time XEngine is installed on a system and a data file is executed, the time reported for the processing includes the time it takes to initialize the necessary XEngine objects required to process the type of data and processing mode you submit as well as the time it takes for process execution.


You notice that if you run a process by using multiple iterations, the processing time for each succeeding iteration takes a fraction of the time the initial one did. This is because once a guideline is cached in memory and any other objects you set to be cached, the time it takes to process data is greatly reduced. The time it takes to process each iteration, except the first, in multi-iteration execution is the true representative of how XEngine performs once you have integrated it into your runtime environment. When processing data by using multiple iterations, the average time reported at the conclusion of the processing does not include the execution time of the first iteration.


To test performance by using multiple iterations, use the [test harness](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/Test_Your_Installation.htm) by using the [-i parameter](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/Test_Harness_Parameters.htm#j).

---

<a id="guideline-caching"></a>

### Guideline Caching

> 📄 Source: [Guideline_Caching.htm](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/Guideline_Caching.htm)

#### Guideline Caching


When first executed, XEngine reads guideline files and converts them from the standard .ecs format to an optimized .tgl format, which is used for validation. If you validate one or more files against the same guideline on a regular basis, you can configure XEngine to cache one or more guidelines into memory, which improves performance because XEngine only has to do the conversion once.


To configure XEngine to cache guidelines into memory:

1. Open XERegistry.xml in a text editor.
2. Modify the "Item Name="GuidelineCacheSize" setting to specify the number of guidelines that XEngine caches into memory.

---

<a id="external-code-list-caching"></a>

### External Code List Caching

> 📄 Source: [External_Code_List_Caching.htm](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/External_Code_List_Caching.htm)

#### External Code List Caching


XEngine uses external code lists for HIPAA validations. When XEngine runs, the code list(s) required for validation are loaded into the memory by XEngine. If you perform multiple validations that use the same code list(s), you can configure XEngine to cache code lists in memory, which improves performance as XEngine only has to load the code lists into the memory once - upon execution, but not each time it process a file. You can change this behavior and force XEngine to load code lists every time it processes a data file. This approach is the most efficient when the data file uses a lot of different code lists.


You can customize your cache type by providing one of the following cache properties in code lists:

- Full (default): All codes are cached in memory at the time that XEngine is started/restarted.
- Refreshable: Codes are cached but the system checks for code list updates and reloads the codes if there are any updates.
- No Cache: XEngine makes a call to code list database every time to check for the code.

---

<a id="javascript-caching"></a>

### JavaScript Caching

> 📄 Source: [JavaScript_Caching.htm](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/JavaScript_Caching.htm)

#### JavaScript Caching


XEngine uses JavaScript to validate HIPAA implementation guideline rules (SNIP types 1-6) and user-defined rules agreed to between you and your trading partner (SNIP type 7). By default, the standard HIPAA guidelines that ship with XEngine and SpecBuilder contain JavaScript rules for SNIP types 1-6; to add user-defined rules for SNIP type 7, you can either enter custom JavaScript rules into your guidelines by using the Script Rules Designer in SpecBuilder, or you can write your own external JavaScript and point to the include files that XEngine uses during validation in the registry settings file. During XEngine execution, any JavaScript existing in the guideline or pointed to in the registry is pre-compiled and used to add additional rules checking during data validation.


XEngine allows you to cache JavaScript contexts into memory. When you cache multiple JavaScript contexts, they are reused as long as they remain in the cache. XEngine uses cached JavaScript contexts only for node-level actions. If you use JavaScript context caching, be aware that guideline global declaration scripts are started only once, during the context caching process. However, all JavaScript global objects are "alive" in the cached context.


In order to decide how to configure JavaScript context caching to optimize XEngine performance, you must determine the number of guidelines you are using to process the different levels of your data files and the number of simultaneous threads you are running. Each thread process that runs uses a cached context so if, for example, you use two HIPAA guidelines and two threads, you must configure XEngine to cache four JavaScript contexts (two guidelines for each thread). If, however, you use different guidelines for one or more envelope levels, you should also create two threads for each guideline you need.  


JavaScript cache settings are set in the registry settings file (${XERoot}/config/XERegistry.xml).


To set XEngine to cache JavaScript contexts:

1. Open XERegistry.xml in a text editor.
2. Locate the "Product Name=Validator" section.
3. Change the following setting to the specified value:


Item Name="JSContextCacheSize">x</Item>


where x represents the number of JavaScript contexts that you want XEngine to cache at one time.

1. Save the file.

---

<a id="disable-parser-schemas"></a>

### Disable Parser Schemas

> 📄 Source: [Disable_Parser_Schemas.htm](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/Disable_Parser_Schemas.htm)

#### Disable Parser Schemas


If you only process one type of data file or a small subset of those supported by XEngine, you can disable the [parser schemas](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/Parsing_Overview.htm) for the guidelines that you don't use to reduce the system requirements for XEngine. To do so, open the [registry settings file](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/Registry_File_Overview.htm) and locate the ParserSchema category in the Parser product category and comment out the parser schema declarations for all the standards you don't plan to use.


  Example


  <Product Name="Parser">


        <Category Name="ParserSchema">


   <!--    <Item Name="SchemaFile"><XEngine root>/config/schema/x12_parser_2_char_delim_wrepeating-x-4020.ecs</Item>


   -->

---

<a id="disable-syntax-checking"></a>

### Disable Syntax Checking

> 📄 Source: [Disable_Syntax_Checking.htm](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/Content/Disable_Syntax_Checking.htm)

#### Disable Syntax Checking


If you don't require syntax checking during validation of X12 and EDIFACT data files, you can disable syntax checking, which speeds up validation and conversion of native files.


To disable syntax checking:


###### X12

1. Open the file validator-options-x12.xml in a text editor.
2. Locate the line <Property Name="Usage">1</Property> .
3. Change the 1 to 0, which disables syntax checking.
4. Save the file.


###### EDIFACT

1. Open the file validator-options-edifact.xml in a text editor.
2. Locate the line <Property Name="Usage">1</Property>.
3. Change the 1 to 0, which disables syntax checking.
4. Save the file.

---

*Documentation sourced from the [Edifecs XEngine Help Portal](https://help.edifecsfedcloud.com/svc/product/xengine/9.4/). All content © Edifecs Inc.*

*Generated: Mon, 29 Jun 2026 20:49:37 GMT — 27 pages.*
