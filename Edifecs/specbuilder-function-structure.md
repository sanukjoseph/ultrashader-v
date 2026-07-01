# Project Structure

## Folder tree

```text
MapEditor/
├── Appearance/
│   ├── bp_disabled_enter.ico
│   ├── bp_disabled_leave.ico
│   ├── bp_disabled.ico
│   ├── bp_enter.ico
│   ├── bp_leave.ico
│   ├── bp.ico
│   ├── Functions.xml
│   ├── gear.ico
│   ├── note.ico
│   ├── runpoint.ico
│   └── runtime.ico
├── DocumentOptions/
│   └── Options.xml
├── export/
│   ├── ExcelExportWizardSetting.xml
│   └── MB-template.xml
├── FindReplace/
│   ├── Filter.Functions.xml
│   ├── Filter.Guidelines.xml
│   └── Options.xml
├── Java/
│   ├── JavaClassesDeclaration.htm
│   ├── JavaHandlerCommon.vbs
│   ├── minus.gif
│   ├── NetClassesDeclaration.htm
│   ├── OnUserNodeJava.htm
│   ├── OnUserNodeJava.js
│   ├── OnUserNodeNet.htm
│   └── plus.gif
├── scripts/
│   └── export-folder-structure-to-markdown.js
└── Templates/
    ├── 1/
    │   ├── Copy.xml
    │   ├── Date.xml
    │   ├── General.xml
    │   ├── Math.xml
    │   └── String.xml
    ├── 2/
    │   ├── Copy.xml
    │   ├── Date.xml
    │   ├── General.xml
    │   ├── Math.xml
    │   ├── Programming.xml
    │   └── String.xml
    ├── 3/
    │   ├── Copy.xml
    │   ├── Date.xml
    │   ├── General.xml
    │   ├── Math.xml
    │   ├── Programming.xml
    │   └── String.xml
    └── 4/
        ├── Copy.xml
        ├── Date.xml
        ├── General.xml
        ├── Math.xml
        ├── Programming.xml
        └── String.xml
```

## File contents

### Appearance/bp_disabled_enter.ico

_Binary or non-text file; content skipped._

### Appearance/bp_disabled_leave.ico

_Binary or non-text file; content skipped._

### Appearance/bp_disabled.ico

_Binary or non-text file; content skipped._

### Appearance/bp_enter.ico

_Binary or non-text file; content skipped._

### Appearance/bp_leave.ico

_Binary or non-text file; content skipped._

### Appearance/bp.ico

_Binary or non-text file; content skipped._

### Appearance/Functions.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<AppearanceDescriptor>
	<Appearances>
		<Appearance FunctionTemplate="ConditionalCopy">
			<Properties>
				<Property Name="Icon">gear.ico</Property>
			</Properties>
		</Appearance>
		<Appearance FunctionTemplate="ConversionalCopy">
			<Properties>
				<Property Name="Icon">gear.ico</Property>
			</Properties>
		</Appearance>
		<Appearance FunctionTemplate="Crosswalk">
			<Properties>
				<Property Name="Icon">gear.ico</Property>
			</Properties>
		</Appearance>
		<Appearance FunctionTemplate="JScript">
			<Properties>
				<Property Name="Icon">gear.ico</Property>
			</Properties>
		</Appearance>
		<Appearance FunctionTemplate="Java">
			<Properties>
				<Property Name="Icon">gear.ico</Property>
			</Properties>
		</Appearance>
		<Appearance FunctionTemplate="Concatenate">
			<Properties>
				<Property Name="Icon">gear.ico</Property>
			</Properties>
		</Appearance>
		<Appearance FunctionTemplate="Append">
			<Properties>
				<Property Name="Visualizer">Append</Property>
				<Property Name="Icon">gear.ico</Property>
			</Properties>
		</Appearance>
		<Appearance FunctionTemplate="Split">
			<Properties>
				<Property Name="Icon">gear.ico</Property>
			</Properties>
		</Appearance>
		<Appearance FunctionTemplate="NameNormalization">
			<Properties>
				<Property Name="Icon">gear.ico</Property>
			</Properties>
		</Appearance>
		<Appearance FunctionTemplate="NumericConversion">
			<Properties>
				<Property Name="Icon">gear.ico</Property>
			</Properties>
		</Appearance>
		<Appearance FunctionTemplate="Substring">
			<Properties>
				<Property Name="Icon">gear.ico</Property>
			</Properties>
		</Appearance>
		<Appearance FunctionTemplate="Trim">
			<Properties>
				<Property Name="Icon">gear.ico</Property>
			</Properties>
		</Appearance>
		<Appearance FunctionTemplate="SystemDateTime">
			<Properties>
				<Property Name="Icon">gear.ico</Property>
			</Properties>
		</Appearance>
		<Appearance FunctionTemplate="ConvertDateTime">
			<Properties>
				<Property Name="Icon">gear.ico</Property>
			</Properties>
		</Appearance>
		<Appearance FunctionTemplate="ChangeVariable">
			<Properties>
				<Property Name="Visualizer">Variable</Property>
				<Property Name="Icon">gear.ico</Property>
			</Properties>
		</Appearance>
		<Appearance FunctionTemplate="Increment">
			<Properties>
				<Property Name="Visualizer">Variable</Property>
				<Property Name="Icon">gear.ico</Property>
			</Properties>
		</Appearance>
		<Appearance FunctionTemplate="Decrement">
			<Properties>
				<Property Name="Visualizer">Variable</Property>
				<Property Name="Icon">gear.ico</Property>
			</Properties>
		</Appearance>
		<Appearance FunctionTemplate="SetValue">
			<Properties>
				<Property Name="Visualizer">SetValue</Property>
			</Properties>
		</Appearance>
		<Appearance FunctionTemplate="FreeForm">
			<Properties>
				<Property Name="Icon">note.ico</Property>
			</Properties>
		</Appearance>
		<Appearance FunctionTemplate="NET">
			<Properties>
				<Property Name="Icon">gear.ico</Property>
			</Properties>
		</Appearance>
		<Appearance FunctionTemplate="LookAhead">
			<Properties>
				<Property Name="Icon">gear.ico</Property>
				<Property Name="Visualizer">LookAhead</Property>
			</Properties>
		</Appearance>
		<Appearance FunctionTemplate="ClearBuffer">
			<Properties>
				<Property Name="Visualizer">ClearBuffer</Property>
				<Property Name="Icon">gear.ico</Property>
			</Properties>
		</Appearance>
		<Appearance FunctionTemplate="Error">
			<Properties>
				<Property Name="Icon">gear.ico</Property>
			</Properties>
		</Appearance>
		<Appearance FunctionTemplate="Exception">
			<Properties>
				<Property Name="Icon">gear.ico</Property>
			</Properties>
		</Appearance>
		<Appearance FunctionTemplate="ActivateDataView">
			<Properties>
				<Property Name="Visualizer">ActivateDataView</Property>
				<Property Name="Icon">gear.ico</Property>
			</Properties>
		</Appearance>
	</Appearances>
</AppearanceDescriptor>
```

### Appearance/gear.ico

_Binary or non-text file; content skipped._

### Appearance/note.ico

_Binary or non-text file; content skipped._

### Appearance/runpoint.ico

_Binary or non-text file; content skipped._

### Appearance/runtime.ico

_Binary or non-text file; content skipped._

### DocumentOptions/Options.xml

```xml
<?xml version="1.0"?>
<Options>
	<Option Name="LongAutoBackup" DisplayName="When emergency backup creation takes much time" DataType="enum" DefaultValue="0" Desc="Use this option to select the way to handle time-consuming emergency backup creation.">
		<Choices>
			<Choice DisplayName="Show a warning" Value="0"/>
			<Choice DisplayName="Skip emergency backup creation" Value="1"/>
			<Choice DisplayName="Do not interrupt the backup creation" Value="2"/>
		</Choices>
	</Option>
	<Option Name="TargetCreationOrder" DisplayName="Target creation order" DataType="enum" DefaultValue="0" Desc="Use this option to perform the data mapping based either on the node order in the guideline or in the source data file.">
		<Choices>
			<Choice DisplayName="Data" Value="0"/>
			<Choice DisplayName="Guideline" Value="1"/>
		</Choices>
	</Option>
	<Option Name="GlobalUserNoteLabels" DisplayName="Global user notes" DataType="list" DefaultValue="Edit..." Desc="To modify user note labels, click Edit. You will be able to add, delete or edit user note labels in the list.">
		<Choices/>
	</Option>
</Options>
```

### export/ExcelExportWizardSetting.xml

```xml
<ExcelExport Version="1.0">
<Settings Source="EDI" Target="EDI"><Parameters><Parameter Name="Source"><Value><![CDATA[]]></Value><Parameters><Parameter Name="Header"><Value><![CDATA[<Name>]]></Value></Parameter><Parameter Name="Columns"><Value><![CDATA[Segment	Element	
Transaction			
Loop	<ID>		
Segment	<ID>		
Composite		<Parent Node ID><Index>:<ID>	
Element		<Parent Node ID><Index>:<ID>	
Internal Properties	Internal Properties		
Internal Property		<Name>	]]></Value></Parameter></Parameters></Parameter><Parameter Name="Target"><Value><![CDATA[]]></Value><Parameters><Parameter Name="Header"><Value><![CDATA[<Name>]]></Value></Parameter><Parameter Name="Columns"><Value><![CDATA[Segment	Element	
Transaction			
Loop	<ID>		
Segment	<ID>		
Composite		<Parent Node ID>:<Index>:<Name>	
Element		<Parent Node ID>:<Index>:<Name>	
Internal Properties	Internal Properties		
Internal Property		<Name>	]]></Value></Parameter></Parameters></Parameter><Parameter Name="NaturalOrder"><Value><![CDATA[True]]></Value></Parameter><Parameter Name="Limit"><Value><![CDATA[0]]></Value></Parameter><Parameter Name="Title"><Value><![CDATA["<source:Name>" to "<target:Name>"]]></Value></Parameter></Parameters></Settings>
<Settings Source="DelimitedFlatFile" Target="EDI"><Parameters><Parameter Name="Source"><Value><![CDATA[]]></Value><Parameters><Parameter Name="Header"><Value><![CDATA[<Name>]]></Value></Parameter><Parameter Name="Columns"><Value><![CDATA[Record	Field	
Message			
GroupRecord	<ID>		
Record	<ID>		
Field		<Parent Node ID>:<Index>:<Name>	
Internal Properties	Internal Properties		
Internal Property		<Name>	]]></Value></Parameter></Parameters></Parameter><Parameter Name="Target"><Value><![CDATA[]]></Value><Parameters><Parameter Name="Header"><Value><![CDATA[<Name>]]></Value></Parameter><Parameter Name="Columns"><Value><![CDATA[Segment	Element	
Transaction			
Loop	<ID>		
Segment	<ID>		
Composite		<Parent Node ID>:<Index>:<Name>	
Element		<Parent Node ID>:<Index>:<Name>	
Internal Properties	Internal Properties		
Internal Property		<Name>	]]></Value></Parameter></Parameters></Parameter><Parameter Name="NaturalOrder"><Value><![CDATA[True]]></Value></Parameter><Parameter Name="Limit"><Value><![CDATA[0]]></Value></Parameter><Parameter Name="Title"><Value><![CDATA["<source:Name>" to "<target:Name>"]]></Value></Parameter></Parameters></Settings>
<Settings Source="EDI" Target="DelimitedFlatFile"><Parameters><Parameter Name="Source"><Value><![CDATA[]]></Value><Parameters><Parameter Name="Header"><Value><![CDATA[<Name>]]></Value></Parameter><Parameter Name="Columns"><Value><![CDATA[Segment	Element	
Transaction			
Loop	<ID>		
Segment	<ID>		
Composite		<Parent Node ID><Index>:<ID>	
Element		<Parent Node ID><Index>:<ID>	
Internal Properties	Internal Properties		
Internal Property		<Name>	]]></Value></Parameter></Parameters></Parameter><Parameter Name="Target"><Value><![CDATA[]]></Value><Parameters><Parameter Name="Header"><Value><![CDATA[<Name>]]></Value></Parameter><Parameter Name="Columns"><Value><![CDATA[Record	Field	
Message			
GroupRecord	<ID>		
Record	<ID>		
Field		<Parent Node ID><Index>:<ID>	
Internal Properties	Internal Properties		
Internal Property		<Name>	]]></Value></Parameter></Parameters></Parameter><Parameter Name="NaturalOrder"><Value><![CDATA[True]]></Value></Parameter><Parameter Name="Limit"><Value><![CDATA[0]]></Value></Parameter><Parameter Name="Title"><Value><![CDATA["<source:Name>" to "<target:Name>"]]></Value></Parameter></Parameters></Settings>
<Settings Source="EDI" Target="PositionalFlatFile"><Parameters><Parameter Name="Source"><Value><![CDATA[]]></Value><Parameters><Parameter Name="Columns"><Value><![CDATA[Segment	Composite	Element	
Transaction				
Loop	<ID>			
Segment	<ID>			
Composite		<Parent Node ID><Index>:<ID>		
Element			<Parent Node ID><Index>:<ID>	
Internal Properties	Internal Properties			
Internal Property			<Name>	]]></Value></Parameter><Parameter Name="Header"><Value><![CDATA[<Name>]]></Value></Parameter></Parameters></Parameter><Parameter Name="Target"><Value><![CDATA[]]></Value><Parameters><Parameter Name="Columns"><Value><![CDATA[Record	Field	
Message			
GroupRecord			
Record	<ID>		
Composite			
Field	<Parent Node ID>	<ID>	
Internal Properties	Internal Properties		
Internal Property		<Name>	]]></Value></Parameter><Parameter Name="Header"><Value><![CDATA[<Name>]]></Value></Parameter></Parameters></Parameter><Parameter Name="NaturalOrder"><Value><![CDATA[True]]></Value></Parameter><Parameter Name="Limit"><Value><![CDATA[0]]></Value></Parameter><Parameter Name="Title"><Value><![CDATA["<source:Name>" to "<target:Name>"]]></Value></Parameter></Parameters></Settings>
<Settings Source="EDI" Target="RosettaNet"><Parameters><Parameter Name="Source"><Value><![CDATA[]]></Value><Parameters><Parameter Name="Header"><Value><![CDATA[<Name>]]></Value></Parameter><Parameter Name="Columns"><Value><![CDATA[Segment	Element	
Transaction			
Loop	<ID>		
Segment	<ID>		
Composite		<Parent Node ID><Index>:<ID>	
Element		<Parent Node ID><Index>:<ID>	
Internal Properties	Internal Properties		
Internal Property		<Name>	]]></Value></Parameter></Parameters></Parameter><Parameter Name="Target"><Value><![CDATA[]]></Value><Parameters><Parameter Name="Header"><Value><![CDATA[<Name>]]></Value></Parameter><Parameter Name="Columns"><Value><![CDATA[Data	
BusinessMessage		
Choice		
BusinessDataEntity		
BusinessProperty		
Reference		
FundamentalBusinessDataEntity	<Name>	
QuantitativeFundamentalBusinessDataEntity	<Name>	
CodedFundamentalBusinessDataEntity	<Name>	
AttributeFundamentalBusinessDataEntity	<Name>	]]></Value></Parameter></Parameters></Parameter><Parameter Name="NaturalOrder"><Value><![CDATA[True]]></Value></Parameter><Parameter Name="Limit"><Value><![CDATA[0]]></Value></Parameter><Parameter Name="PublishSettings"><Value><![CDATA[True]]></Value></Parameter><Parameter Name="Title"><Value><![CDATA["<source:Name>" to "<target:Name>"]]></Value></Parameter></Parameters></Settings>
<Settings Source="EDI" Target="XMLSchema"><Parameters><Parameter Name="Source"><Value><![CDATA[]]></Value><Parameters><Parameter Name="Columns"><Value><![CDATA[Segment	Element	
Transaction			
Loop	<ID>		
Segment	<ID>		
Composite		<Parent Node ID>:<Index>:<Name>	
Element		<Parent Node ID>:<Index>:<Name>	
Internal Properties	Internal Properties		
Internal Property		<Name>	]]></Value></Parameter><Parameter Name="Header"><Value><![CDATA[<Name>]]></Value></Parameter></Parameters></Parameter><Parameter Name="Target"><Value><![CDATA[]]></Value><Parameters><Parameter Name="Columns"><Value><![CDATA[schema	element	attribute	
schema				
element		<name>		
attribute			<name>	
Internal Properties	Internal Properties		
Internal Property		<Name>		]]></Value></Parameter><Parameter Name="Header"><Value><![CDATA[]]></Value></Parameter></Parameters></Parameter><Parameter Name="NaturalOrder"><Value><![CDATA[True]]></Value></Parameter><Parameter Name="Limit"><Value><![CDATA[0]]></Value></Parameter><Parameter Name="Title"><Value><![CDATA["<source:Name>" to "Xml Schema"]]></Value></Parameter></Parameters></Settings>
<Settings Source="HL7" Target="HL7v3"><Parameters><Parameter Name="Source"><Value><![CDATA[]]></Value><Parameters><Parameter Name="Columns"><Value><![CDATA[Segment	Field	
Message			
Group	Group:<ID>		
Segment	<ID>		
Field		<Parent Node ID>:<Index>:<Name>	
ComponentField		<Name>	
SimpleField		<Name>	
Internal Properties	Internal Properties		
Internal Property		<Name>	]]></Value></Parameter><Parameter Name="Header"><Value><![CDATA[<Name>]]></Value></Parameter></Parameters></Parameter><Parameter Name="Target"><Value><![CDATA[]]></Value><Parameters><Parameter Name="Header"><Value><![CDATA[<Name>]]></Value></Parameter><Parameter Name="Columns"><Value><![CDATA[Association	Attribute	
Interaction			
Association	<Name>		
Attribute		<Name>	]]></Value></Parameter></Parameters></Parameter><Parameter Name="NaturalOrder"><Value><![CDATA[True]]></Value></Parameter><Parameter Name="Limit"><Value><![CDATA[1]]></Value></Parameter><Parameter Name="Title"><Value><![CDATA["<source:Name>" to "<target:Name>"]]></Value></Parameter><Parameter Name="PublishSettings"><Value><![CDATA[False]]></Value></Parameter></Parameters></Settings>
<Settings Source="PositionalFlatFile" Target="EDI"><Parameters><Parameter Name="Source"><Value><![CDATA[]]></Value><Parameters><Parameter Name="Header"><Value><![CDATA[<Name>]]></Value></Parameter><Parameter Name="Columns"><Value><![CDATA[Record	Field	
Message			
GroupRecord	<ID>		
Record	<ID>		
Composite		<Parent Node ID><Index>:<ID>	
Field		<Parent Node ID><Index>:<ID>	
Internal Properties	Internal Properties		
Internal Property		<Name>	]]></Value></Parameter></Parameters></Parameter><Parameter Name="Target"><Value><![CDATA[]]></Value><Parameters><Parameter Name="Header"><Value><![CDATA[<Name>]]></Value></Parameter><Parameter Name="Columns"><Value><![CDATA[Segment	Element	
Transaction			
Loop	<ID>		
Segment	<ID>		
Composite		<Parent Node ID><Index>:<ID>	
Element		<Parent Node ID><Index>:<ID>	
Internal Properties	Internal Properties		
Internal Property		<Name>	]]></Value></Parameter></Parameters></Parameter><Parameter Name="NaturalOrder"><Value><![CDATA[True]]></Value></Parameter><Parameter Name="Limit"><Value><![CDATA[0]]></Value></Parameter><Parameter Name="Title"><Value><![CDATA["<source:Name>" to "<target:Name>"]]></Value></Parameter></Parameters></Settings>
<Settings Source="RosettaNet" Target="EDI"><Parameters><Parameter Name="Source"><Value><![CDATA[]]></Value><Parameters><Parameter Name="Header"><Value><![CDATA[<Name>]]></Value></Parameter><Parameter Name="Columns"><Value><![CDATA[Path	Data	
BusinessMessage	<Name>		
Choice			
BusinessDataEntity	<Name>		
BusinessProperty	<Name>		
Reference	<Name>		
FundamentalBusinessDataEntity		<Name>	
QuantitativeFundamentalBusinessDataEntity		<Name>	
CodedFundamentalBusinessDataEntity		<Name>	
AttributeFundamentalBusinessDataEntity		<Name>	]]></Value></Parameter></Parameters></Parameter><Parameter Name="Target"><Value><![CDATA[]]></Value><Parameters><Parameter Name="Header"><Value><![CDATA[<Name>]]></Value></Parameter><Parameter Name="Columns"><Value><![CDATA[Element	
Transaction		
Loop		
Segment		
Composite	<Parent Node ID><Index>:<ID>	
Element	<Parent Node ID><Index>:<ID>	
Internal Properties	Internal Properties		
Internal Property	<Name>	]]></Value></Parameter></Parameters></Parameter><Parameter Name="NaturalOrder"><Value><![CDATA[True]]></Value></Parameter><Parameter Name="Limit"><Value><![CDATA[0]]></Value></Parameter><Parameter Name="PublishSettings"><Value><![CDATA[True]]></Value></Parameter><Parameter Name="Title"><Value><![CDATA["<source:Name>" to "<target:Name>"]]></Value></Parameter></Parameters></Settings>
<Settings Source="XMLSchema" Target="EDI"><Parameters><Parameter Name="Source"><Value><![CDATA[]]></Value><Parameters><Parameter Name="Columns"><Value><![CDATA[Path	Element	
schema			
element		<name>	
attribute		<name>	
Internal Properties	Internal Properties		
Internal Property		<Name>		]]></Value></Parameter><Parameter Name="Header"><Value><![CDATA[]]></Value></Parameter></Parameters></Parameter><Parameter Name="Target"><Value><![CDATA[]]></Value><Parameters><Parameter Name="Columns"><Value><![CDATA[Segment	Element	
Transaction			
Loop	<ID>		
Segment	<ID>		
Composite		<Parent Node ID>:<Index>:<Name>	
Element		<Parent Node ID>:<Index>:<Name>	
Internal Properties	Internal Properties		
Internal Property		<Name>	]]></Value></Parameter><Parameter Name="Header"><Value><![CDATA[<Name>]]></Value></Parameter></Parameters></Parameter><Parameter Name="NaturalOrder"><Value><![CDATA[True]]></Value></Parameter><Parameter Name="Limit"><Value><![CDATA[1]]></Value></Parameter><Parameter Name="Title"><Value><![CDATA["Xml Schema" to "<target:Name>"]]></Value></Parameter></Parameters></Settings>
</ExcelExport>
```

### export/MB-template.xml

```xml
<?xml version="1.0"?>
<?mso-application progid="Excel.Sheet"?>
<Workbook xmlns="urn:schemas-microsoft-com:office:spreadsheet"
 xmlns:o="urn:schemas-microsoft-com:office:office"
 xmlns:x="urn:schemas-microsoft-com:office:excel"
 xmlns:ss="urn:schemas-microsoft-com:office:spreadsheet"
 xmlns:html="http://www.w3.org/TR/REC-html40">
 <DocumentProperties xmlns="urn:schemas-microsoft-com:office:office">
  <LastPrinted>2007-04-27T16:23:06Z</LastPrinted>
  <Version>12.00</Version>
 </DocumentProperties>
 <ExcelWorkbook xmlns="urn:schemas-microsoft-com:office:excel">
  <WindowHeight>10005</WindowHeight>
  <WindowWidth>10005</WindowWidth>
  <WindowTopX>120</WindowTopX>
  <WindowTopY>135</WindowTopY>
  <ProtectStructure>False</ProtectStructure>
  <ProtectWindows>False</ProtectWindows>
 </ExcelWorkbook>
 <Styles>
  <Style ss:ID="Default" ss:Name="Normal">
   <Alignment ss:Vertical="Bottom"/>
   <Borders/>
   <Font ss:FontName="Arial"/>
   <Interior/>
   <NumberFormat/>
   <Protection/>
  </Style>
  <Style ss:ID="s62" ss:Name="Hyperlink">
   <Font ss:FontName="Arial" ss:Color="#0000FF" ss:Underline="Single"/>
  </Style>
  <Style ss:ID="m21099840">
   <Alignment ss:Horizontal="Left" ss:Vertical="Bottom"/>
   <Borders>
    <Border ss:Position="Bottom" ss:LineStyle="Continuous" ss:Weight="1"/>
    <Border ss:Position="Left" ss:LineStyle="Continuous" ss:Weight="2"/>
    <Border ss:Position="Right" ss:LineStyle="Continuous" ss:Weight="1"/>
    <Border ss:Position="Top" ss:LineStyle="Continuous" ss:Weight="2"/>
   </Borders>
   <Font ss:FontName="Arial" x:Family="Swiss"/>
   <Interior ss:Color="#FFFF99" ss:Pattern="Solid"/>
  </Style>
  <Style ss:ID="m21099860">
   <Alignment ss:Horizontal="Left" ss:Vertical="Bottom"/>
   <Borders>
    <Border ss:Position="Bottom" ss:LineStyle="Continuous" ss:Weight="1"/>
    <Border ss:Position="Left" ss:LineStyle="Continuous" ss:Weight="2"/>
    <Border ss:Position="Right" ss:LineStyle="Continuous" ss:Weight="1"/>
    <Border ss:Position="Top" ss:LineStyle="Continuous" ss:Weight="1"/>
   </Borders>
   <Font ss:FontName="Arial" x:Family="Swiss"/>
   <Interior ss:Color="#FFFF99" ss:Pattern="Solid"/>
  </Style>
  <Style ss:ID="m21099880">
   <Alignment ss:Horizontal="Left" ss:Vertical="Bottom"/>
   <Borders>
    <Border ss:Position="Bottom" ss:LineStyle="Continuous" ss:Weight="1"/>
    <Border ss:Position="Left" ss:LineStyle="Continuous" ss:Weight="2"/>
    <Border ss:Position="Right" ss:LineStyle="Continuous" ss:Weight="1"/>
    <Border ss:Position="Top" ss:LineStyle="Continuous" ss:Weight="1"/>
   </Borders>
   <Font ss:FontName="Arial" x:Family="Swiss"/>
   <Interior ss:Color="#FFFF99" ss:Pattern="Solid"/>
  </Style>
  <Style ss:ID="m21099900">
   <Alignment ss:Horizontal="Left" ss:Vertical="Bottom"/>
   <Borders>
    <Border ss:Position="Bottom" ss:LineStyle="Continuous" ss:Weight="2"/>
    <Border ss:Position="Left" ss:LineStyle="Continuous" ss:Weight="2"/>
    <Border ss:Position="Right" ss:LineStyle="Continuous" ss:Weight="2"/>
    <Border ss:Position="Top" ss:LineStyle="Continuous" ss:Weight="2"/>
   </Borders>
   <Font ss:FontName="Arial" x:Family="Swiss" ss:Size="8" ss:Italic="1"/>
   <Interior ss:Color="#99CCFF" ss:Pattern="Solid"/>
  </Style>
  <Style ss:ID="m21099920">
   <Alignment ss:Vertical="Bottom" ss:WrapText="1"/>
   <Borders>
    <Border ss:Position="Bottom" ss:LineStyle="Continuous" ss:Weight="2"/>
    <Border ss:Position="Left" ss:LineStyle="Continuous" ss:Weight="2"/>
    <Border ss:Position="Right" ss:LineStyle="Continuous" ss:Weight="2"/>
    <Border ss:Position="Top" ss:LineStyle="Continuous" ss:Weight="2"/>
   </Borders>
   <Font ss:FontName="Arial" x:Family="Swiss" ss:Size="8" ss:Italic="1"/>
   <Interior ss:Color="#99CCFF" ss:Pattern="Solid"/>
  </Style>
  <Style ss:ID="s63">
   <Borders/>
  </Style>
  <Style ss:ID="s65">
   <Alignment ss:Vertical="Top"/>
   <Font ss:FontName="Arial" ss:Color="#0000FF"/>
   <Interior/>
  </Style>
  <Style ss:ID="s66">
   <Alignment ss:Vertical="Top"/>
   <Borders>
    <Border ss:Position="Bottom" ss:LineStyle="Continuous" ss:Weight="2"/>
    <Border ss:Position="Left" ss:LineStyle="Continuous" ss:Weight="2"/>
    <Border ss:Position="Top" ss:LineStyle="Continuous" ss:Weight="2"/>
   </Borders>
   <Font ss:FontName="Arial" ss:Color="#0000FF"/>
   <Interior ss:Color="#C0C0C0" ss:Pattern="Solid"/>
  </Style>
  <Style ss:ID="s67">
   <Alignment ss:Horizontal="Center" ss:Vertical="Top" ss:WrapText="1"/>
   <Borders>
    <Border ss:Position="Bottom" ss:LineStyle="Continuous" ss:Weight="2"/>
    <Border ss:Position="Top" ss:LineStyle="Continuous" ss:Weight="2"/>
   </Borders>
   <Font ss:FontName="Arial" x:CharSet="204" x:Family="Swiss" ss:Bold="1"/>
   <Interior ss:Color="#C0C0C0" ss:Pattern="Solid"/>
  </Style>
  <Style ss:ID="s68">
   <Alignment ss:Vertical="Top"/>
   <Borders>
    <Border ss:Position="Bottom" ss:LineStyle="Continuous" ss:Weight="2"/>
    <Border ss:Position="Right" ss:LineStyle="Continuous" ss:Weight="2"/>
    <Border ss:Position="Top" ss:LineStyle="Continuous" ss:Weight="2"/>
   </Borders>
   <Font ss:FontName="Arial" ss:Color="#0000FF"/>
   <Interior ss:Color="#C0C0C0" ss:Pattern="Solid"/>
  </Style>
  <Style ss:ID="s70">
   <Alignment ss:Vertical="Top"/>
  </Style>
  <Style ss:ID="s71">
   <Alignment ss:Horizontal="Center" ss:Vertical="Top" ss:WrapText="1"/>
   <Borders>
    <Border ss:Position="Left" ss:LineStyle="Continuous" ss:Weight="2"/>
    <Border ss:Position="Top" ss:LineStyle="Continuous" ss:Weight="2"/>
   </Borders>
   <Font ss:FontName="Arial" x:Family="Swiss" ss:Bold="1"/>
   <Interior ss:Color="#C0C0C0" ss:Pattern="Solid"/>
  </Style>
  <Style ss:ID="s72">
   <Alignment ss:Horizontal="Center" ss:Vertical="Top"/>
   <Borders>
    <Border ss:Position="Left" ss:LineStyle="Continuous" ss:Weight="2"/>
    <Border ss:Position="Right" ss:LineStyle="Continuous" ss:Weight="2"/>
    <Border ss:Position="Top" ss:LineStyle="Continuous" ss:Weight="2"/>
   </Borders>
   <Font ss:FontName="Arial" x:Family="Swiss" ss:Bold="1"/>
   <Interior ss:Color="#C0C0C0" ss:Pattern="Solid"/>
  </Style>
  <Style ss:ID="s73">
   <Alignment ss:Horizontal="Center" ss:Vertical="Top" ss:WrapText="1"/>
   <Borders>
    <Border ss:Position="Right" ss:LineStyle="Continuous" ss:Weight="2"/>
    <Border ss:Position="Top" ss:LineStyle="Continuous" ss:Weight="2"/>
   </Borders>
   <Font ss:FontName="Arial" x:Family="Swiss" ss:Bold="1"/>
   <Interior ss:Color="#C0C0C0" ss:Pattern="Solid"/>
  </Style>
  <Style ss:ID="s74">
   <Alignment ss:Horizontal="Center" ss:Vertical="Top" ss:WrapText="1"/>
   <Borders>
    <Border ss:Position="Bottom" ss:LineStyle="Continuous" ss:Weight="2"/>
    <Border ss:Position="Left" ss:LineStyle="Continuous" ss:Weight="2"/>
    <Border ss:Position="Right" ss:LineStyle="Continuous" ss:Weight="2"/>
    <Border ss:Position="Top" ss:LineStyle="Continuous" ss:Weight="2"/>
   </Borders>
   <Font ss:FontName="Arial" x:Family="Swiss" ss:Bold="1"/>
   <Interior ss:Color="#C0C0C0" ss:Pattern="Solid"/>
  </Style>
  <Style ss:ID="s75">
   <Alignment ss:Horizontal="Center" ss:Vertical="Top"/>
   <Borders>
    <Border ss:Position="Bottom" ss:LineStyle="Continuous" ss:Weight="2"/>
    <Border ss:Position="Left" ss:LineStyle="Continuous" ss:Weight="2"/>
    <Border ss:Position="Right" ss:LineStyle="Continuous" ss:Weight="2"/>
   </Borders>
   <Font ss:FontName="Arial" x:Family="Swiss" ss:Bold="1"/>
   <Interior ss:Color="#C0C0C0" ss:Pattern="Solid"/>
  </Style>
  <Style ss:ID="s76">
   <Borders>
    <Border ss:Position="Bottom" ss:LineStyle="Continuous" ss:Weight="1"/>
    <Border ss:Position="Left" ss:LineStyle="Continuous" ss:Weight="1"/>
    <Border ss:Position="Right" ss:LineStyle="Continuous" ss:Weight="1"/>
   </Borders>
   <Font ss:FontName="Arial" x:CharSet="204" x:Family="Swiss"/>
  </Style>
  <Style ss:ID="s83">
   <Alignment ss:Horizontal="Left" ss:Vertical="Bottom"/>
   <Borders>
    <Border ss:Position="Bottom" ss:LineStyle="Continuous" ss:Weight="1"/>
    <Border ss:Position="Left" ss:LineStyle="Continuous" ss:Weight="1"/>
    <Border ss:Position="Right" ss:LineStyle="Continuous" ss:Weight="2"/>
    <Border ss:Position="Top" ss:LineStyle="Continuous" ss:Weight="2"/>
   </Borders>
   <Font ss:FontName="Arial" x:Family="Swiss" ss:Color="#0000FF" ss:Bold="1"
    ss:Italic="1"/>
   <Interior ss:Color="#FFFF99" ss:Pattern="Solid"/>
  </Style>
  <Style ss:ID="s90">
   <Alignment ss:Horizontal="Left" ss:Vertical="Bottom"/>
   <Borders>
    <Border ss:Position="Bottom" ss:LineStyle="Continuous" ss:Weight="1"/>
    <Border ss:Position="Left" ss:LineStyle="Continuous" ss:Weight="1"/>
    <Border ss:Position="Right" ss:LineStyle="Continuous" ss:Weight="2"/>
    <Border ss:Position="Top" ss:LineStyle="Continuous" ss:Weight="1"/>
   </Borders>
   <Font ss:FontName="Arial" x:Family="Swiss" ss:Color="#0000FF" ss:Bold="1"
    ss:Italic="1"/>
   <Interior ss:Color="#FFFF99" ss:Pattern="Solid"/>
  </Style>
  <Style ss:ID="s91">
   <Alignment ss:Vertical="Bottom" ss:WrapText="1"/>
   <Borders>
    <Border ss:Position="Bottom" ss:LineStyle="Continuous" ss:Weight="1"/>
    <Border ss:Position="Left" ss:LineStyle="Continuous" ss:Weight="1"/>
    <Border ss:Position="Right" ss:LineStyle="Continuous" ss:Weight="2"/>
    <Border ss:Position="Top" ss:LineStyle="Continuous" ss:Weight="1"/>
   </Borders>
   <Font ss:FontName="Arial" x:Family="Swiss" ss:Color="#0000FF" ss:Bold="1"
    ss:Italic="1"/>
   <Interior ss:Color="#FFFF99" ss:Pattern="Solid"/>
  </Style>
  <Style ss:ID="s92">
   <Borders>
    <Border ss:Position="Bottom" ss:LineStyle="Continuous" ss:Weight="1"/>
    <Border ss:Position="Left" ss:LineStyle="Continuous" ss:Weight="2"/>
    <Border ss:Position="Right" ss:LineStyle="Continuous" ss:Weight="1"/>
    <Border ss:Position="Top" ss:LineStyle="Continuous" ss:Weight="1"/>
   </Borders>
   <Font ss:FontName="Arial" x:Family="Swiss"/>
   <Interior ss:Color="#CCFFFF" ss:Pattern="Solid"/>
  </Style>
  <Style ss:ID="s93">
   <Borders>
    <Border ss:Position="Bottom" ss:LineStyle="Continuous" ss:Weight="1"/>
    <Border ss:Position="Left" ss:LineStyle="Continuous" ss:Weight="1"/>
    <Border ss:Position="Right" ss:LineStyle="Continuous" ss:Weight="1"/>
    <Border ss:Position="Top" ss:LineStyle="Continuous" ss:Weight="1"/>
   </Borders>
   <Font ss:FontName="Arial" x:Family="Swiss" ss:Italic="1"/>
   <Interior ss:Color="#CCFFFF" ss:Pattern="Solid"/>
  </Style>
  <Style ss:ID="s94">
   <Alignment ss:Vertical="Bottom" ss:WrapText="1"/>
   <Borders>
    <Border ss:Position="Bottom" ss:LineStyle="Continuous" ss:Weight="1"/>
    <Border ss:Position="Left" ss:LineStyle="Continuous" ss:Weight="1"/>
    <Border ss:Position="Right" ss:LineStyle="Continuous" ss:Weight="2"/>
    <Border ss:Position="Top" ss:LineStyle="Continuous" ss:Weight="1"/>
   </Borders>
   <Font ss:FontName="Arial" x:Family="Swiss"/>
   <Interior ss:Color="#CCFFFF" ss:Pattern="Solid"/>
  </Style>
  <Style ss:ID="s95">
   <Font ss:FontName="Arial" x:Family="Swiss" ss:Size="8" ss:Italic="1"/>
  </Style>
  <Style ss:ID="s96">
   <Alignment ss:Horizontal="Left" ss:Vertical="Bottom"/>
   <Borders>
    <Border ss:Position="Bottom" ss:LineStyle="Continuous" ss:Weight="1"/>
    <Border ss:Position="Left" ss:LineStyle="Continuous" ss:Weight="2"/>
    <Border ss:Position="Right" ss:LineStyle="Continuous" ss:Weight="1"/>
    <Border ss:Position="Top" ss:LineStyle="Continuous" ss:Weight="1"/>
   </Borders>
   <Font ss:FontName="Arial" x:Family="Swiss" ss:Size="8" ss:Italic="1"/>
   <Interior ss:Color="#CCFFFF" ss:Pattern="Solid"/>
  </Style>
  <Style ss:ID="s97">
   <Alignment ss:Horizontal="Left" ss:Vertical="Bottom"/>
   <Borders>
    <Border ss:Position="Bottom" ss:LineStyle="Continuous" ss:Weight="1"/>
    <Border ss:Position="Left" ss:LineStyle="Continuous" ss:Weight="1"/>
    <Border ss:Position="Right" ss:LineStyle="Continuous" ss:Weight="1"/>
    <Border ss:Position="Top" ss:LineStyle="Continuous" ss:Weight="1"/>
   </Borders>
   <Font ss:FontName="Arial" x:Family="Swiss" ss:Size="8" ss:Italic="1"/>
   <Interior ss:Color="#CCFFFF" ss:Pattern="Solid"/>
  </Style>
  <Style ss:ID="s98">
   <Alignment ss:Horizontal="Left" ss:Vertical="Bottom" ss:WrapText="1"/>
   <Borders>
    <Border ss:Position="Bottom" ss:LineStyle="Continuous" ss:Weight="1"/>
    <Border ss:Position="Left" ss:LineStyle="Continuous" ss:Weight="1"/>
    <Border ss:Position="Right" ss:LineStyle="Continuous" ss:Weight="2"/>
    <Border ss:Position="Top" ss:LineStyle="Continuous" ss:Weight="1"/>
   </Borders>
   <Font ss:FontName="Arial" x:Family="Swiss" ss:Size="8" ss:Italic="1"/>
   <Interior ss:Color="#CCFFFF" ss:Pattern="Solid"/>
  </Style>
  <Style ss:ID="s99">
   <Alignment ss:Vertical="Bottom"/>
   <Borders>
    <Border ss:Position="Bottom" ss:LineStyle="Continuous" ss:Weight="1"/>
    <Border ss:Position="Left" ss:LineStyle="Continuous" ss:Weight="2"/>
    <Border ss:Position="Right" ss:LineStyle="Continuous" ss:Weight="1"/>
    <Border ss:Position="Top" ss:LineStyle="Continuous" ss:Weight="1"/>
   </Borders>
   <Font ss:FontName="Arial" x:Family="Swiss"/>
   <Interior ss:Color="#CCFFCC" ss:Pattern="Solid"/>
  </Style>
  <Style ss:ID="s100">
   <Borders>
    <Border ss:Position="Bottom" ss:LineStyle="Continuous" ss:Weight="1"/>
    <Border ss:Position="Left" ss:LineStyle="Continuous" ss:Weight="1"/>
    <Border ss:Position="Right" ss:LineStyle="Continuous" ss:Weight="1"/>
    <Border ss:Position="Top" ss:LineStyle="Continuous" ss:Weight="1"/>
   </Borders>
   <Font ss:FontName="Arial" x:Family="Swiss" ss:Italic="1"/>
   <Interior ss:Color="#CCFFCC" ss:Pattern="Solid"/>
  </Style>
  <Style ss:ID="s102" ss:Parent="s62">
   <Alignment ss:Vertical="Bottom" ss:WrapText="1"/>
   <Borders>
    <Border ss:Position="Bottom" ss:LineStyle="Continuous" ss:Weight="1"/>
    <Border ss:Position="Left" ss:LineStyle="Continuous" ss:Weight="1"/>
    <Border ss:Position="Right" ss:LineStyle="Continuous" ss:Weight="2"/>
    <Border ss:Position="Top" ss:LineStyle="Continuous" ss:Weight="1"/>
   </Borders>
   <Font ss:FontName="Arial" ss:Color="#0000FF" ss:Underline="Single"/>
   <Interior ss:Color="#CCFFCC" ss:Pattern="Solid"/>
  </Style>
  <Style ss:ID="s103">
   <Alignment ss:Vertical="Bottom"/>
   <Borders>
    <Border ss:Position="Left" ss:LineStyle="Continuous" ss:Weight="2"/>
    <Border ss:Position="Right" ss:LineStyle="Continuous" ss:Weight="1"/>
    <Border ss:Position="Top" ss:LineStyle="Continuous" ss:Weight="1"/>
   </Borders>
   <Font ss:FontName="Arial" x:Family="Swiss" ss:Size="8" ss:Italic="1"/>
   <Interior ss:Color="#CCFFCC" ss:Pattern="Solid"/>
  </Style>
  <Style ss:ID="s104">
   <Borders>
    <Border ss:Position="Left" ss:LineStyle="Continuous" ss:Weight="1"/>
    <Border ss:Position="Right" ss:LineStyle="Continuous" ss:Weight="1"/>
    <Border ss:Position="Top" ss:LineStyle="Continuous" ss:Weight="1"/>
   </Borders>
   <Font ss:FontName="Arial" x:Family="Swiss" ss:Size="8" ss:Italic="1"/>
   <Interior ss:Color="#CCFFCC" ss:Pattern="Solid"/>
  </Style>
  <Style ss:ID="s105">
   <Alignment ss:Vertical="Bottom" ss:WrapText="1"/>
   <Borders>
    <Border ss:Position="Left" ss:LineStyle="Continuous" ss:Weight="1"/>
    <Border ss:Position="Right" ss:LineStyle="Continuous" ss:Weight="2"/>
    <Border ss:Position="Top" ss:LineStyle="Continuous" ss:Weight="1"/>
   </Borders>
   <Font ss:FontName="Arial" x:Family="Swiss" ss:Size="8" ss:Italic="1"/>
   <Interior ss:Color="#CCFFCC" ss:Pattern="Solid"/>
  </Style>
  <Style ss:ID="s121">
   <Alignment ss:Horizontal="Left" ss:Vertical="Bottom"/>
   <Borders>
    <Border ss:Position="Bottom" ss:LineStyle="Continuous" ss:Weight="2"/>
    <Border ss:Position="Left" ss:LineStyle="Continuous" ss:Weight="2"/>
   </Borders>
   <Interior ss:Color="#C0C0C0" ss:Pattern="Solid"/>
  </Style>
  <Style ss:ID="s125">
   <Borders>
    <Border ss:Position="Bottom" ss:LineStyle="Continuous" ss:Weight="2"/>
    <Border ss:Position="Left" ss:LineStyle="Continuous" ss:Weight="1"/>
    <Border ss:Position="Right" ss:LineStyle="Continuous" ss:Weight="2"/>
    <Border ss:Position="Top" ss:LineStyle="Continuous" ss:Weight="2"/>
   </Borders>
   <Interior ss:Color="#CC99FF" ss:Pattern="Solid"/>
  </Style>
  <Style ss:ID="s126">
   <Font ss:FontName="Arial" x:Family="Swiss" ss:Italic="1"/>
  </Style>
 </Styles>
 <Worksheet ss:Name="Map Area Template">
  <Table ss:ExpandedColumnCount="3" ss:ExpandedRowCount="4" x:FullColumns="1"
   x:FullRows="1">
   <Column ss:StyleID="s63" ss:AutoFitWidth="0" ss:Width="182.25"/>
   <Column ss:AutoFitWidth="0" ss:Width="243.75"/>
   <Column ss:AutoFitWidth="0" ss:Width="203.25"/>
   <Row ss:AutoFitHeight="0" ss:Height="13.5" ss:StyleID="s65">
    <Cell ss:StyleID="s66"/>
    <Cell ss:StyleID="s67"><Data ss:Type="String">Document Title</Data></Cell>
    <Cell ss:StyleID="s68"/>
   </Row>
   <Row ss:AutoFitHeight="0" ss:Height="13.5" ss:StyleID="s70">
    <Cell ss:StyleID="s71"><Data ss:Type="String">Source Title</Data></Cell>
    <Cell ss:StyleID="s72"/>
    <Cell ss:StyleID="s73"><Data ss:Type="String">Target Title</Data></Cell>
   </Row>
   <Row ss:AutoFitHeight="0" ss:Height="13.5" ss:StyleID="s70">
    <Cell ss:StyleID="s74"><Data ss:Type="String">Source Columns Header</Data></Cell>
    <Cell ss:StyleID="s75"><Data ss:Type="String">Translation Instructions</Data></Cell>
    <Cell ss:StyleID="s74"><Data ss:Type="String">Target Columns Header</Data></Cell>
   </Row>
   <Row>
    <Cell ss:StyleID="s76"><Data ss:Type="String">Source Content Section</Data></Cell>
    <Cell ss:StyleID="s76"><Data ss:Type="String">Translation Instructions Section</Data></Cell>
    <Cell ss:StyleID="s76"><Data ss:Type="String">Target Content Section</Data></Cell>
   </Row>
  </Table>
  <WorksheetOptions xmlns="urn:schemas-microsoft-com:office:excel">
   <PageSetup>
    <Layout x:Orientation="Landscape"/>
    <Header x:Data="&amp;ЛAn Inbound Map&amp;ЦEDI to IDOC&amp;ПVersion 1.0"/>
    <Footer x:Data="&amp;ПPage &amp;С of &amp;К"/>
    <PageMargins x:Bottom="0.984251969" x:Left="0.78740157499999996"
     x:Right="0.78740157499999996" x:Top="0.984251969"/>
   </PageSetup>
   <Print>
    <ValidPrinterInfo/>
    <HorizontalResolution>-3</HorizontalResolution>
    <VerticalResolution>600</VerticalResolution>
   </Print>
   <Selected/>
   <ProtectObjects>False</ProtectObjects>
   <ProtectScenarios>False</ProtectScenarios>
  </WorksheetOptions>
 </Worksheet>
 <Worksheet ss:Name="Map Function Template">
  <Table ss:ExpandedColumnCount="3" ss:ExpandedRowCount="10" x:FullColumns="1"
   x:FullRows="1">
   <Column ss:Index="3" ss:AutoFitWidth="0" ss:Width="96"/>
   <Row>
    <Cell ss:MergeAcross="1" ss:StyleID="m21099840"><Data ss:Type="String">Function #:</Data><Comment
      ss:Author="Edifecs Development"><ss:Data
       xmlns="http://www.w3.org/TR/REC-html40"><B><Font html:Face="Tahoma"
         html:Size="8" html:Color="#000000">Edifecs Development:</Font></B><Font
        html:Face="Tahoma" html:Size="8" html:Color="#000000">&#10;Label &quot;Function#&quot;. Can be changed to any text.</Font></ss:Data></Comment></Cell>
    <Cell ss:StyleID="s83"><Data ss:Type="Number">3</Data><Comment
      ss:Author="Edifecs Development"><ss:Data
       xmlns="http://www.w3.org/TR/REC-html40"><B><Font html:Face="Tahoma"
         html:Size="8" html:Color="#000000">Edifecs Development:</Font></B><Font
        html:Face="Tahoma" html:Size="8" html:Color="#000000">&#10;Dynamically populated map function number.</Font></ss:Data></Comment></Cell>
   </Row>
   <Row>
    <Cell ss:MergeAcross="1" ss:StyleID="m21099860"><Data ss:Type="String">Status:</Data><Comment
      ss:Author="Edifecs Development"><ss:Data
       xmlns="http://www.w3.org/TR/REC-html40"><B><Font html:Face="Tahoma"
         html:Size="8" html:Color="#000000">Edifecs Development:</Font></B><Font
        html:Face="Tahoma" html:Size="8" html:Color="#000000">&#10;Status label, can be changed to any text. Row is only present when function status is &quot;incomplete&quot;.</Font></ss:Data></Comment></Cell>
    <Cell ss:StyleID="s90"><Data ss:Type="String">Incomplete</Data><Comment
      ss:Author="Edifecs Development"><ss:Data
       xmlns="http://www.w3.org/TR/REC-html40"><B><Font html:Face="Tahoma"
         html:Size="8" html:Color="#000000">Edifecs Development:</Font></B><Font
        html:Face="Tahoma" html:Size="8" html:Color="#000000">&#10;Label; can be changed to any text.</Font></ss:Data></Comment></Cell>
   </Row>
   <Row>
    <Cell ss:MergeAcross="1" ss:StyleID="m21099880"><Data ss:Type="String">Name:</Data><Comment
      ss:Author="Edifecs Development"><ss:Data
       xmlns="http://www.w3.org/TR/REC-html40"><B><Font html:Face="Tahoma"
         html:Size="8" html:Color="#000000">Edifecs Development:</Font></B><Font
        html:Face="Tahoma" html:Size="8" html:Color="#000000">&#10;Label &quot;Name&quot;, can be changed by user to any text.</Font></ss:Data></Comment></Cell>
    <Cell ss:StyleID="s91"><Data ss:Type="String">Date Conversion</Data><Comment
      ss:Author="Edifecs Development"><ss:Data
       xmlns="http://www.w3.org/TR/REC-html40"><B><Font html:Face="Tahoma"
         html:Size="8" html:Color="#000000">Edifecs Development:</Font></B><Font
        html:Face="Tahoma" html:Size="8" html:Color="#000000">&#10;Dynamically populated function name.</Font></ss:Data></Comment></Cell>
   </Row>
   <Row>
    <Cell ss:StyleID="s92"><Data ss:Type="String">in1</Data><Comment
      ss:Author="Edifecs Development"><ss:Data
       xmlns="http://www.w3.org/TR/REC-html40"><B><Font html:Face="Tahoma"
         html:Size="8" html:Color="#000000">Edifecs Development:</Font></B><Font
        html:Face="Tahoma" html:Size="8" html:Color="#000000">&#10;Dynamically populated  name of the inbound parameter.</Font></ss:Data></Comment></Cell>
    <Cell ss:StyleID="s93"><Data ss:Type="String">in</Data><Comment
      ss:Author="Edifecs Development"><ss:Data
       xmlns="http://www.w3.org/TR/REC-html40"><B><Font html:Face="Tahoma"
         html:Size="8" html:Color="#000000">Edifecs Development:</Font></B><Font
        html:Face="Tahoma" html:Size="8" html:Color="#000000">&#10;Label; can be changed to any text.</Font></ss:Data></Comment></Cell>
    <Cell ss:StyleID="s94"><Data ss:Type="String">this</Data><Comment
      ss:Author="Edifecs Development"><ss:Data
       xmlns="http://www.w3.org/TR/REC-html40"><B><Font html:Face="Tahoma"
         html:Size="8" html:Color="#000000">Edifecs Development:</Font></B><Font
        html:Face="Tahoma" html:Size="8" html:Color="#000000">&#10;Dynamically populated value of the inbound parameter.</Font></ss:Data></Comment></Cell>
   </Row>
   <Row ss:AutoFitHeight="0" ss:Height="11.25" ss:StyleID="s95">
    <Cell ss:StyleID="s96"/>
    <Cell ss:StyleID="s97"/>
    <Cell ss:StyleID="s98"><Data ss:Type="String">description</Data><Comment
      ss:Author="Edifecs Development"><ss:Data
       xmlns="http://www.w3.org/TR/REC-html40"><B><Font html:Face="Tahoma"
         html:Size="8" html:Color="#000000">Edifecs Development:</Font></B><Font
        html:Face="Tahoma" html:Size="8" html:Color="#000000">&#10;Dynamically populated parameter description.</Font></ss:Data></Comment></Cell>
   </Row>
   <Row>
    <Cell ss:StyleID="s99"><Data ss:Type="String">out1</Data><Comment
      ss:Author="Edifecs Development"><ss:Data
       xmlns="http://www.w3.org/TR/REC-html40"><B><Font html:Face="Tahoma"
         html:Size="8" html:Color="#000000">Edifecs Development:</Font></B><Font
        html:Face="Tahoma" html:Size="8" html:Color="#000000">&#10;Dynamically populated  name of outbound parameter.</Font></ss:Data></Comment></Cell>
    <Cell ss:StyleID="s100"><Data ss:Type="String">out</Data><Comment
      ss:Author="Edifecs Development"><ss:Data
       xmlns="http://www.w3.org/TR/REC-html40"><B><Font html:Face="Tahoma"
         html:Size="8" html:Color="#000000">Edifecs Development:</Font></B><Font
        html:Face="Tahoma" html:Size="8" html:Color="#000000">&#10;Label; can be changed to any text.</Font></ss:Data></Comment></Cell>
    <Cell ss:StyleID="s102"><Data ss:Type="String">function#25</Data><Comment
      ss:Author="Edifecs Development"><ss:Data
       xmlns="http://www.w3.org/TR/REC-html40"><B><Font html:Face="Tahoma"
         html:Size="8" html:Color="#000000">Edifecs Development:</Font></B><Font
        html:Face="Tahoma" html:Size="8" html:Color="#000000">&#10;Dynamically populated value of the outbound parameter.</Font></ss:Data></Comment></Cell>
   </Row>
   <Row ss:AutoFitHeight="0" ss:Height="13.5">
    <Cell ss:StyleID="s103"/>
    <Cell ss:StyleID="s104"/>
    <Cell ss:StyleID="s105"><Data ss:Type="String">description</Data><Comment
      ss:Author="Edifecs Development"><ss:Data
       xmlns="http://www.w3.org/TR/REC-html40"><B><Font html:Face="Tahoma"
         html:Size="8" html:Color="#000000">Edifecs Development:</Font></B><Font
        html:Face="Tahoma" html:Size="8" html:Color="#000000">&#10;Dynamically populated parameter description.</Font></ss:Data></Comment></Cell>
   </Row>
   <Row ss:AutoFitHeight="0" ss:Height="13.5">
    <Cell ss:MergeAcross="2" ss:StyleID="m21099900"><Data ss:Type="String">Settings</Data><Comment
      ss:Author="Edifecs Development"><ss:Data
       xmlns="http://www.w3.org/TR/REC-html40"><B><Font html:Face="Tahoma"
         html:Size="8" html:Color="#000000">Edifecs Development:</Font></B><Font
        html:Face="Tahoma" html:Size="8" html:Color="#000000">&#10;Label &quot;Settings&quot;.</Font></ss:Data></Comment></Cell>
   </Row>
   <Row ss:AutoFitHeight="0" ss:Height="13.5">
    <Cell ss:MergeAcross="2" ss:StyleID="m21099920"><Data ss:Type="String">Text</Data></Cell>
   </Row>
   <Row ss:AutoFitHeight="0" ss:Height="13.5">
    <Cell ss:MergeAcross="1" ss:StyleID="s121"><Data ss:Type="String">UN label</Data><Comment
      ss:Author="Edifecs Development"><ss:Data
       xmlns="http://www.w3.org/TR/REC-html40"><B><Font html:Face="Tahoma"
         html:Size="8" html:Color="#000000">Edifecs Development:</Font></B><Font
        html:Face="Tahoma" html:Size="8" html:Color="#000000">&#10;Dynamically populated user note name.</Font></ss:Data></Comment></Cell>
    <Cell ss:StyleID="s125"><Data ss:Type="String">User note</Data><Comment
      ss:Author="Edifecs Development"><ss:Data
       xmlns="http://www.w3.org/TR/REC-html40"><B><Font html:Face="Tahoma"
         html:Size="8" html:Color="#000000">Edifecs Development:</Font></B><Font
        html:Face="Tahoma" html:Size="8" html:Color="#000000">&#10;Dynamically populated user note value.</Font></ss:Data></Comment></Cell>
   </Row>
  </Table>
  <WorksheetOptions xmlns="urn:schemas-microsoft-com:office:excel">
   <PageSetup>
    <PageMargins x:Bottom="0.984251969" x:Left="0.78740157499999996"
     x:Right="0.78740157499999996" x:Top="0.984251969"/>
   </PageSetup>
   <Print>
    <ValidPrinterInfo/>
    <HorizontalResolution>600</HorizontalResolution>
    <VerticalResolution>600</VerticalResolution>
   </Print>
   <Panes>
    <Pane>
     <Number>3</Number>
     <ActiveRow>8</ActiveRow>
     <RangeSelection>R9C1:R9C3</RangeSelection>
    </Pane>
   </Panes>
   <ProtectObjects>False</ProtectObjects>
   <ProtectScenarios>False</ProtectScenarios>
  </WorksheetOptions>
 </Worksheet>
 <Worksheet ss:Name="Properties">
  <Table ss:ExpandedColumnCount="2" ss:ExpandedRowCount="5" x:FullColumns="1"
   x:FullRows="1">
   <Column ss:AutoFitWidth="0" ss:Width="93"/>
   <Row>
    <Cell><Data ss:Type="String">Title:</Data></Cell>
    <Cell ss:StyleID="s126"><Data ss:Type="String">val</Data></Cell>
   </Row>
   <Row>
    <Cell><Data ss:Type="String">Subject:</Data></Cell>
    <Cell ss:StyleID="s126"><Data ss:Type="String">val</Data></Cell>
   </Row>
   <Row>
    <Cell><Data ss:Type="String">Author:</Data></Cell>
    <Cell ss:StyleID="s126"><Data ss:Type="String">val</Data></Cell>
   </Row>
   <Row>
    <Cell><Data ss:Type="String">Company:</Data></Cell>
    <Cell ss:StyleID="s126"><Data ss:Type="String">val</Data></Cell>
   </Row>
   <Row>
    <Cell><Data ss:Type="String">Publication Date:</Data></Cell>
    <Cell ss:StyleID="s126"><Data ss:Type="String">val</Data></Cell>
   </Row>
  </Table>
  <WorksheetOptions xmlns="urn:schemas-microsoft-com:office:excel">
   <Panes>
    <Pane>
     <Number>3</Number>
     <ActiveRow>4</ActiveRow>
    </Pane>
   </Panes>
   <ProtectObjects>False</ProtectObjects>
   <ProtectScenarios>False</ProtectScenarios>
  </WorksheetOptions>
 </Worksheet>
</Workbook>
```

### FindReplace/Filter.Functions.xml

```xml
<FindReplace Version="1.0" CompatibilityVersion="1.0">
<Filter IsActive="True">
	<Options>
		<Option DisplayName="Name" IsActive="True"/>
		<Option DisplayName="Settings" IsActive="True"/>
		<Option DisplayName="User Notes" IsActive="True"/>
		<Option DisplayName="JS Text" IsActive="True"/>
		<Option DisplayName="Inputs" IsActive="True"/>
	</Options>
</Filter>
</FindReplace>
```

### FindReplace/Filter.Guidelines.xml

```xml
<FindReplace Version="1.0" CompatibilityVersion="1.0">
	<Filter IsActive="False">
		<Guidelines>
			<Guideline DocType="EDI" GdlType="EDIFACT" IsActive="True">
				<Nodes>
					<Node ID="InternalProperties" DisplayType="Internal Properties" IsActive="True"/>
					<Node ID="Transaction" DisplayType="{Resolve}" IsActive="True">
						<Properties>
							<Property ID="ID" IsActive="True"/>
							<Property ID="Name" IsActive="True"/>
							<Property ID="Purpose" DisplayName="{Resolve}" IsActive="True"/>
							<Property ID="GroupID" DisplayName="{Resolve}" IsActive="True"/>
							<Property ID="StdVersion" DisplayName="Version" IsActive="True"/>
							<Property ID="Standard" IsActive="True"/>
							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="Loop" DisplayType="{Resolve}" IsActive="True">
						<Properties>
							<Property ID="LoopKey" IsActive="True" />
							<Property ID="ID" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="Name" IsActive="True" />
							<Property ID="Requirement" DisplayName="Std Status" IsActive="True" />
							<Property ID="UsrRequirement" DisplayName="User Status" IsActive="True" />
							<Property ID="Area" DisplayName="Table Area" IsActive="True" />
							<Property ID="Sequence" DisplayName="Position" IsActive="True" />
							<Property ID="MaxUse" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="Purpose" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="Note:setnotes" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="Note:description" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="User Notes" IsActive="True" />
						</Properties>
					</Node>
					<Node ID="Segment" IsActive="True">
						<Properties>
							<Property ID="ID" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="Name" IsActive="True" />
							<Property ID="Requirement" DisplayName="Std Status" IsActive="True" />
							<Property ID="UsrRequirement" DisplayName="User Status" IsActive="True" />
							<Property ID="Area" DisplayName="Table Area" IsActive="True" />
							<Property ID="Sequence" DisplayName="Position" IsActive="True" />
							<Property ID="MaxUse" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="Purpose" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="Note:setnotes" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="Note:description" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="User Notes" IsActive="True" />
						</Properties>
					</Node>
					<Node ID="Composite" IsActive="True">
						<Properties>
							<Property ID="ID" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="Name" IsActive="True" />
							<Property ID="Requirement" DisplayName="Std Status" IsActive="True" />
							<Property ID="UsrRequirement" DisplayName="User Status" IsActive="True" />
							<Property ID="Sequence" DisplayName="Position" IsActive="True" />
							<Property ID="MaxUse" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="Purpose" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="Note:setcomments" DisplayName="Note:Notes" IsActive="True" />
							<Property ID="AF:FieldName" IsActive="True" />
							<Property ID="AF:Record" IsActive="True" />
							<Property ID="AF:Example" IsActive="True" />
							<Property ID="AF:Mode" IsActive="True" />
							<Property ID="AF:Label" IsActive="True" />
							<Property ID="AF:Control" IsActive="True" />
							<Property ID="AF:Format" IsActive="True" />
							<Property ID="AF:Notes" IsActive="True" />
							<Property ID="User Notes" IsActive="True" />
						</Properties>
					</Node>
					<Node ID="Element" IsActive="True">
						<Properties>
							<Property ID="ID" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="Name" IsActive="True" />
							<Property ID="Requirement" DisplayName="Std Status" IsActive="True" />
							<Property ID="UsrRequirement" DisplayName="User Status" IsActive="True" />
							<Property ID="Sequence" DisplayName="Position" IsActive="True" />
							<Property ID="MinSize" DisplayName="Min Length" IsActive="True" />
							<Property ID="MaxSize" DisplayName="Max Length" IsActive="True" />
							<Property ID="MaxUse" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="DataType" DisplayName="Type" IsActive="True" />
							<Property ID="Purpose" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="AF:FieldName" IsActive="True" />
							<Property ID="AF:Record" IsActive="True" />
							<Property ID="AF:Example" IsActive="True" />
							<Property ID="AF:Mode" IsActive="True" />
							<Property ID="AF:Label" IsActive="True" />
							<Property ID="AF:Control" IsActive="True" />
							<Property ID="AF:Format" IsActive="True" />
							<Property ID="AF:Notes" IsActive="True" />
							<Property ID="KeyType" DisplayName="Key Type" IsActive="True" />
							<Property ID="KeyValue" DisplayName="Key Value" IsActive="True" />
							<Property ID="User Notes" IsActive="True" />
							<Property ID="Codes" IsActive="True"/>
						</Properties>
					</Node>
				</Nodes>
			</Guideline>
			<Guideline DocType="EDI" GdlType="TRADACOMS" DisplayName="EDI (TRADACOMS)" IsActive="True">
				<Nodes>
					<Node ID="InternalProperties" DisplayType="Internal Properties" IsActive="True"/>
					<Node ID="Transaction" DisplayType="{Resolve}" IsActive="True">
						<Properties>
							<Property ID="ID" IsActive="True"/>
							<Property ID="Name" IsActive="True"/>
							<Property ID="Purpose" DisplayName="{Resolve}" IsActive="True"/>
							<Property ID="GroupID" DisplayName="{Resolve}" IsActive="True"/>
							<Property ID="StdVersion" DisplayName="Version" IsActive="True"/>
							<Property ID="Standard" IsActive="True"/>
							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="Loop" DisplayType="{Resolve}" IsActive="True">
						<Properties>
							<Property ID="LoopKey" IsActive="True" />
							<Property ID="ID" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="Name" IsActive="True" />
							<Property ID="Requirement" DisplayName="Std Status" IsActive="True" />
							<Property ID="UsrRequirement" DisplayName="User Status" IsActive="True" />
							<Property ID="Area" DisplayName="Table Area" IsActive="True" />
							<Property ID="Count" DisplayName="Repetition" IsActive="True" />
							<Property ID="Sequence" DisplayName="Position" IsActive="True" />
							<Property ID="MaxUse" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="Purpose" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="Note:setnotes" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="Note:setcomments" DisplayName="Note:Set Comments" IsActive="True" />
							<Property ID="Note:semantics" DisplayName="Note:Semantics" IsActive="True" />
							<Property ID="Note:description" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="User Notes" IsActive="True" />
						</Properties>
					</Node>
					<Node ID="Segment" IsActive="True">
						<Properties>
							<Property ID="ID" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="Name" IsActive="True" />
							<Property ID="Requirement" DisplayName="Std Status" IsActive="True" />
							<Property ID="UsrRequirement" DisplayName="User Status" IsActive="True" />
							<Property ID="Area" DisplayName="Table Area" IsActive="True" />
							<Property ID="Count" DisplayName="Repetition" IsActive="True" />
							<Property ID="Sequence" DisplayName="Position" IsActive="True" />
							<Property ID="MaxUse" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="Purpose" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="Note:setnotes" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="Note:setcomments" DisplayName="Note:Set Comments" IsActive="True" />
							<Property ID="User Notes" IsActive="True" />
						</Properties>
					</Node>
					<Node ID="Composite" IsActive="True">
						<Properties>
							<Property ID="ID" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="Name" IsActive="True" />
							<Property ID="Requirement" DisplayName="Std Status" IsActive="True" />
							<Property ID="UsrRequirement" DisplayName="User Status" IsActive="True" />
							<Property ID="Sequence" DisplayName="Position" IsActive="True" />
							<Property ID="MaxUse" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="Purpose" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="AF:FieldName" IsActive="True" />
							<Property ID="AF:Record" IsActive="True" />
							<Property ID="AF:Example" IsActive="True" />
							<Property ID="AF:Mode" IsActive="True" />
							<Property ID="AF:Label" IsActive="True" />
							<Property ID="AF:Control" IsActive="True" />
							<Property ID="AF:Format" IsActive="True" />
							<Property ID="AF:Notes" IsActive="True" />
							<Property ID="User Notes" IsActive="True" />
						</Properties>
					</Node>
					<Node ID="Element" IsActive="True">
						<Properties>
							<Property ID="ID" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="Name" IsActive="True" />
							<Property ID="Requirement" DisplayName="Std Status" IsActive="True" />
							<Property ID="UsrRequirement" DisplayName="User Status" IsActive="True" />
							<Property ID="Sequence" DisplayName="Position" IsActive="True" />
							<Property ID="MinSize" DisplayName="Min Length" IsActive="True" />
							<Property ID="MaxSize" DisplayName="Max Length" IsActive="True" />
							<Property ID="MaxUse" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="DataType" DisplayName="Type" IsActive="True" />
							<Property ID="Purpose" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="AF:FieldName" IsActive="True" />
							<Property ID="AF:Record" IsActive="True" />
							<Property ID="AF:Example" IsActive="True" />
							<Property ID="AF:Mode" IsActive="True" />
							<Property ID="AF:Label" IsActive="True" />
							<Property ID="AF:Control" IsActive="True" />
							<Property ID="AF:Format" IsActive="True" />
							<Property ID="AF:Notes" IsActive="True" />
							<Property ID="KeyType" DisplayName="Key Type" IsActive="True" />
							<Property ID="KeyValue" DisplayName="Key Value" IsActive="True" />
							<Property ID="User Notes" IsActive="True" />
							<Property ID="Codes" IsActive="True"/>
						</Properties>
					</Node>
				</Nodes>
			</Guideline>
			<Guideline DocType="EDI" GdlType="X12" DisplayName="EDI (X12)" IsActive="True">
				<Nodes>
					<Node ID="InternalProperties" DisplayType="Internal Properties" IsActive="True"/>
					<Node ID="Transaction" DisplayType="{Resolve}" IsActive="True">
						<Properties>
							<Property ID="ID" IsActive="True"/>
							<Property ID="Name" IsActive="True"/>
							<Property ID="Purpose" DisplayName="{Resolve}" IsActive="True"/>
							<Property ID="GroupID" DisplayName="{Resolve}" IsActive="True"/>
							<Property ID="StdVersion" DisplayName="Version" IsActive="True"/>
							<Property ID="Standard" IsActive="True"/>
							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="Loop" DisplayType="{Resolve}" IsActive="True">
						<Properties>
							<Property ID="LoopKey" IsActive="True" />
							<Property ID="ID" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="Name" IsActive="True" />
							<Property ID="Requirement" DisplayName="Std Status" IsActive="True" />
							<Property ID="UsrRequirement" DisplayName="User Status" IsActive="True" />
							<Property ID="Area" DisplayName="Table Area" IsActive="True" />
							<Property ID="Count" DisplayName="Repetition" IsActive="True" />
							<Property ID="Sequence" DisplayName="Position" IsActive="True" />
							<Property ID="MaxUse" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="Purpose" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="Note:setnotes" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="Note:setcomments" DisplayName="Note:Set Comments" IsActive="True" />
							<Property ID="Note:semantics" DisplayName="Note:Semantics" IsActive="True" />
							<Property ID="Note:description" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="User Notes" IsActive="True" />
						</Properties>
					</Node>
					<Node ID="Segment" IsActive="True">
						<Properties>
							<Property ID="ID" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="Name" IsActive="True" />
							<Property ID="Requirement" DisplayName="Std Status" IsActive="True" />
							<Property ID="UsrRequirement" DisplayName="User Status" IsActive="True" />
							<Property ID="Area" DisplayName="Table Area" IsActive="True" />
							<Property ID="Count" DisplayName="Repetition" IsActive="True" />
							<Property ID="Sequence" DisplayName="Position" IsActive="True" />
							<Property ID="MaxUse" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="Purpose" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="Note:setnotes" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="Note:setcomments" DisplayName="Note:Set Comments" IsActive="True" />
							<Property ID="Note:semantics" DisplayName="Note:Semantics" IsActive="True" />
							<Property ID="Note:description" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="User Notes" IsActive="True" />
						</Properties>
					</Node>
					<Node ID="Composite" IsActive="True">
						<Properties>
							<Property ID="ID" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="Name" IsActive="True" />
							<Property ID="Requirement" DisplayName="Std Status" IsActive="True" />
							<Property ID="UsrRequirement" DisplayName="User Status" IsActive="True" />
							<Property ID="Sequence" DisplayName="Position" IsActive="True" />
							<Property ID="MaxUse" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="Purpose" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="Note:setcomments" DisplayName="Note:Comments" IsActive="True" />
							<Property ID="Note:semantics" DisplayName="Note:Semantics" IsActive="True" />
							<Property ID="AF:FieldName" IsActive="True" />
							<Property ID="AF:Record" IsActive="True" />
							<Property ID="AF:Example" IsActive="True" />
							<Property ID="AF:Mode" IsActive="True" />
							<Property ID="AF:Label" IsActive="True" />
							<Property ID="AF:Control" IsActive="True" />
							<Property ID="AF:Format" IsActive="True" />
							<Property ID="AF:Notes" IsActive="True" />
							<Property ID="User Notes" IsActive="True" />
						</Properties>
					</Node>
					<Node ID="Element" IsActive="True">
						<Properties>
							<Property ID="ID" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="Name" IsActive="True" />
							<Property ID="Requirement" DisplayName="Std Status" IsActive="True" />
							<Property ID="UsrRequirement" DisplayName="User Status" IsActive="True" />
							<Property ID="Sequence" DisplayName="Position" IsActive="True" />
							<Property ID="MinSize" DisplayName="Min Length" IsActive="True" />
							<Property ID="MaxSize" DisplayName="Max Length" IsActive="True" />
							<Property ID="MaxUse" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="DataType" DisplayName="Type" IsActive="True" />
							<Property ID="Purpose" DisplayName="{Resolve}" IsActive="True" />
							<Property ID="AF:FieldName" IsActive="True" />
							<Property ID="AF:Record" IsActive="True" />
							<Property ID="AF:Example" IsActive="True" />
							<Property ID="AF:Mode" IsActive="True" />
							<Property ID="AF:Label" IsActive="True" />
							<Property ID="AF:Control" IsActive="True" />
							<Property ID="AF:Format" IsActive="True" />
							<Property ID="AF:Notes" IsActive="True" />
							<Property ID="KeyType" DisplayName="Key Type" IsActive="True" />
							<Property ID="KeyValue" DisplayName="Key Value" IsActive="True" />
							<Property ID="User Notes" IsActive="True" />
							<Property ID="Codes" IsActive="True"/>
						</Properties>
					</Node>
				</Nodes>
			</Guideline>
			<Guideline DocType="DelimitedFlatFile" DisplayName="Delimited Flat File" IsActive="True">
				<Nodes>
					<Node ID="InternalProperties" DisplayType="Internal Properties" IsActive="True"/>
					<Node ID="Message" IsActive="True">
						<Properties>
							<Property ID="ID" IsActive="True"/>
							<Property ID="Name" IsActive="True"/>
							<Property ID="Standard" IsActive="True"/>
							<Property ID="Version" IsActive="True"/>
							<Property ID="Purpose" IsActive="True"/>
							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="GroupRecord" DisplayType="Group Record" IconKey="GroupRecord" IsActive="True">
						<Properties>
							<Property ID="ID" IsActive="True"/>
							<Property ID="Name" IsActive="True"/>
							<Property ID="MinUse" DisplayName="Min Use" IsActive="True"/>
							<Property ID="MaxUse" DisplayName="Max Use" IsActive="True"/>
							<Property ID="Purpose" IsActive="True"/>
							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="Record" IsActive="True">
						<Properties>
							<Property ID="ID" IsActive="True"/>
							<Property ID="Name" IsActive="True"/>
							<Property ID="MinUse" DisplayName="Min Use" IsActive="True"/>
							<Property ID="MaxUse" DisplayName="Max Use" IsActive="True"/>
							<Property ID="Purpose" IsActive="True"/>
							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="Field" IsActive="True">
						<Properties>
							<Property ID="ID" IsActive="True"/>
							<Property ID="Name" IsActive="True"/>
							<Property ID="Requirement" IsActive="True" />
							<Property ID="UsrRequirement" DisplayName="User Option" IsActive="True" />
							<Property ID="DataType" DisplayName="Type" IsActive="True" />
							<Property ID="Sequence" DisplayName="Position" IsActive="True"/>
							<Property ID="MinSize" DisplayName="Min Length" IsActive="True"/>
							<Property ID="MaxSize" DisplayName="Max Length" IsActive="True"/>
							<Property ID="KeyType" DisplayName="Tag Field" IsActive="True" />
							<Property ID="KeyValue" DisplayName="Tag Value" IsActive="True" />
							<Property ID="Purpose" IsActive="True"/>
							<Property ID="User Notes" IsActive="True"/>
							<Property ID="Codes" IsActive="True"/>
						</Properties>
					</Node>
				</Nodes>
			</Guideline>
			<Guideline DocType="EDIParserSchema" DisplayName="EDI Parser Schema" IsActive="True">
				<Nodes>
					<Node ID="InternalProperties" DisplayType="Internal Properties" IsActive="True"/>
					<Node ID="GroupNode" IsActive="True">
						<Properties>
							<Property ID="Name" IsActive="True"/>
							<Property ID="EndNode" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="StaticProperty" IsActive="True">
						<Properties>
							<Property ID="Name" IsActive="True"/>
							<Property ID="Type" IsActive="True"/>
							<Property ID="Value" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="LeafField" IsActive="True">
						<Properties>
							<Property ID="Name" IsActive="True"/>
							<Property ID="KeyField" IsActive="True"/>
							<Property ID="Link" IsActive="True"/>
							<Property ID="Property" IsActive="True"/>
							<Property ID="KeyValue" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="EdiDelimiterInfo" IsActive="True">
						<Properties>
							<Property ID="Sequence" DisplayName="Position" IsActive="True"/>
							<Property ID="Level" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="NodeField" IsActive="True">
						<Properties>
							<Property ID="Name" IsActive="True"/>
							<Property ID="EndNode" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="LeafNode" IsActive="True">
						<Properties>
							<Property ID="Name" IsActive="True"/>
							<Property ID="EndNode" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="InitialFileDetect" IsActive="True">
						<Properties>
							<Property ID="SkipStartPosition" IsActive="True"/>
							<Property ID="SkipLength" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="DetectInfo" IsActive="True">
						<Properties>
							<Property ID="StartPosition" IsActive="True"/>
							<Property ID="Length" IsActive="True"/>
							<Property ID="Delimiter" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="ReleaseCharacter" IsActive="True">
						<Properties>
							<Property ID="Length" IsActive="True"/>
							<Property ID="Sequence" DisplayName="Position" IsActive="True"/>
							<Property ID="Delimiter" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="DecimalIndicator" IsActive="True">
						<Properties>
							<Property ID="Length" IsActive="True"/>
							<Property ID="Sequence" DisplayName="Position" IsActive="True"/>
							<Property ID="Delimiter" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="TagDelimiter" IsActive="True">
						<Properties>
							<Property ID="Length" IsActive="True"/>
							<Property ID="Sequence" DisplayName="Position" IsActive="True"/>
							<Property ID="Delimiter" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="SegmentDelimiter" IsActive="True">
						<Properties>
							<Property ID="Length" IsActive="True"/>
							<Property ID="Sequence" DisplayName="Position" IsActive="True"/>
							<Property ID="Delimiter" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="ElementDelimiter" IsActive="True">
						<Properties>
							<Property ID="Length" IsActive="True"/>
							<Property ID="Sequence" DisplayName="Position" IsActive="True"/>
							<Property ID="Delimiter" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="SubElementDelimiter" IsActive="True">
						<Properties>
							<Property ID="Length" IsActive="True"/>
							<Property ID="Sequence" DisplayName="Position" IsActive="True"/>
							<Property ID="Delimiter" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="RepeatDelimiter" IsActive="True">
						<Properties>
							<Property ID="Length" IsActive="True"/>
							<Property ID="Sequence" DisplayName="Position" IsActive="True"/>
							<Property ID="Delimiter" IsActive="True"/>
						</Properties>
					</Node>
				</Nodes>
			</Guideline>
			<Guideline DocType="HL7" IsActive="True">
				<Nodes>
					<Node ID="InternalProperties" DisplayType="Internal Properties" IsActive="True"/>
					<Node ID="Message" IsActive="True">
						<Properties>
							<Property ID="MessageID" DisplayName="Message ID" IsActive="True"/>
							<Property ID="Name" IsActive="True"/>
							<Property ID="Event" IsActive="True"/>
							<Property ID="EventName" DisplayName="Event Name" IsActive="True"/>
							<Property ID="Standard" IsActive="True"/>
							<Property ID="StdVersion" DisplayName="Version" IsActive="True"/>
							<Property ID="Purpose" IsActive="True"/>
							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="Group" IsActive="True">
						<Properties>
							<Property ID="LoopKey" IsActive="True"/>
							<Property ID="ID" IsActive="True"/>
							<Property ID="Name" IsActive="True"/>
							<Property ID="Requirement" IsActive="True"/>
							<Property ID="UsrRequirement" DisplayName="User Option" IsActive="True"/>
							<Property ID="Sequence" IsActive="True"/>
							<Property ID="MaxUse" DisplayName="Repeats" IsActive="True"/>
							<Property ID="Purpose" IsActive="True"/>
							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="Segment" IsActive="True">
						<Properties>
							<Property ID="ID" IsActive="True"/>
							<Property ID="Name" IsActive="True"/>
							<Property ID="Requirement" IsActive="True"/>
							<Property ID="UsrRequirement" DisplayName="User Option" IsActive="True"/>
							<Property ID="Sequence" DisplayName="Position" IsActive="True"/>
							<Property ID="MaxUse" DisplayName="Repeats" IsActive="True"/>
							<Property ID="Purpose" IsActive="True"/>
							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="SimpleField" DisplayType="Simple Field" IconKey="SimpleField" IsActive="True">
						<Properties>
							<Property ID="ID" IsActive="True"/>
							<Property ID="Sequence" DisplayName="Position" IsActive="True"/>
							<Property ID="Name" IsActive="True"/>
							<Property ID="DataType" DisplayName="Data Type" IsActive="True"/>
							<Property ID="Requirement" IsActive="True"/>
							<Property ID="MaxUse" DisplayName="Repeats" IsActive="True"/>
							<Property ID="UsrRequirement" DisplayName="User Option" IsActive="True"/>
							<Property ID="MaxSize" DisplayName="Length" IsActive="True"/>
							<Property ID="Purpose" IsActive="True"/>
							<Property ID="AF:FieldName" IsActive="True"/>
							<Property ID="AF:Record" IsActive="True"/>
							<Property ID="AF:Example" IsActive="True"/>
							<Property ID="AF:Mode" IsActive="True"/>
							<Property ID="AF:Label" IsActive="True"/>
							<Property ID="AF:Control" IsActive="True"/>
							<Property ID="AF:Format" IsActive="True"/>
							<Property ID="AF:Notes" IsActive="True"/>
							<Property ID="KeyType" DisplayName="Key Type" IsActive="True"/>
							<Property ID="KeyValue" DisplayName="Key Value" IsActive="True"/>
							<Property ID="User Notes" IsActive="True"/>
							<Property ID="Codes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="ComponentField" DisplayType="Component Field" IconKey="ComponentField" IsActive="True">
						<Properties>
							<Property ID="ID" IsActive="True"/>
							<Property ID="Sequence" DisplayName="Position" IsActive="True"/>
							<Property ID="Name" IsActive="True"/>
							<Property ID="DataType" DisplayName="Data Type" IsActive="True"/>
							<Property ID="Requirement" IsActive="True"/>
							<Property ID="MaxUse" DisplayName="Repeats" IsActive="True"/>
							<Property ID="UsrRequirement" DisplayName="User Option" IsActive="True"/>
							<Property ID="MaxSize" DisplayName="Length" IsActive="True"/>
							<Property ID="Purpose" IsActive="True"/>
							<Property ID="AF:FieldName" IsActive="True"/>
							<Property ID="AF:Record" IsActive="True"/>
							<Property ID="AF:Example" IsActive="True"/>
							<Property ID="AF:Mode" IsActive="True"/>
							<Property ID="AF:Label" IsActive="True"/>
							<Property ID="AF:Control" IsActive="True"/>
							<Property ID="AF:Format" IsActive="True"/>
							<Property ID="AF:Notes" IsActive="True"/>
							<Property ID="KeyType" DisplayName="Key Type" IsActive="True"/>
							<Property ID="KeyValue" DisplayName="Key Value" IsActive="True"/>
							<Property ID="User Notes" IsActive="True"/>
							<Property ID="Codes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="Field" IsActive="True">
						<Properties>
							<Property ID="ID" IsActive="True"/>
							<Property ID="Sequence" DisplayName="Position" IsActive="True"/>
							<Property ID="Name" IsActive="True"/>
							<Property ID="DataType" DisplayName="Data Type" IsActive="True"/>
							<Property ID="Requirement" IsActive="True"/>
							<Property ID="MaxUse" DisplayName="Repeats" IsActive="True"/>
							<Property ID="UsrRequirement" DisplayName="User Option" IsActive="True"/>
							<Property ID="MaxSize" DisplayName="Length" IsActive="True"/>
							<Property ID="Purpose" IsActive="True"/>
							<Property ID="AF:FieldName" IsActive="True"/>
							<Property ID="AF:Record" IsActive="True"/>
							<Property ID="AF:Example" IsActive="True"/>
							<Property ID="AF:Mode" IsActive="True"/>
							<Property ID="AF:Label" IsActive="True"/>
							<Property ID="AF:Control" IsActive="True"/>
							<Property ID="AF:Format" IsActive="True"/>
							<Property ID="AF:Notes" IsActive="True"/>
							<Property ID="KeyType" DisplayName="Key Type" IsActive="True"/>
							<Property ID="KeyValue" DisplayName="Key Value" IsActive="True"/>
							<Property ID="User Notes" IsActive="True"/>
							<Property ID="Codes" IsActive="True"/>
						</Properties>
					</Node>
				</Nodes>
			</Guideline>
			<Guideline DocType="HL7v3" IsActive="True">
				<Nodes>
					<Node ID="InternalProperties" DisplayType="Internal Properties" IsActive="True"/>
					<Node ID="Interaction" IsActive="True">
						<Properties>
							<Property ID="ID" IsActive="True"/>
							<Property ID="Name" IsActive="True"/>
							<Property ID="Domain" IsActive="True"/>
							<Property ID="Version" IsActive="True"/>
							<Property ID="Event ID" IsActive="True"/>
							<Property ID="Event Name" IsActive="True"/>
							<Property ID="Message ID" IsActive="True"/>
							<Property ID="Message Name" IsActive="True"/>
							<Property ID="Transmission ID" IsActive="True"/>
							<Property ID="Transmission Name" IsActive="True"/>
							<Property ID="Control Act ID" IsActive="True"/>
							<Property ID="Control Act Name" IsActive="True"/>
							<Property ID="Sending Role ID" IsActive="True"/>
							<Property ID="Sending Role Name" IsActive="True"/>
							<Property ID="Receiving Role ID" IsActive="True"/>
							<Property ID="Receiving Role Name" IsActive="True"/>
							<Property ID="Description" IsActive="True"/>
							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="Association" IsActive="True">
						<Properties>
							<Property ID="Name" IsActive="True"/>
							<Property ID="Class Name" IsActive="True"/>
							<Property ID="CMET" IsActive="True"/>
							<Property ID="Cardinality" IsActive="True"/>
							<Property ID="Row Number" IsActive="True"/>
							<Property ID="Mandatory" IsActive="True"/>
							<Property ID="Conformance" IsActive="True"/>
							<Property ID="Description" IsActive="True"/>
							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="Attribute" IsActive="True">
						<Properties>
							<Property ID="Name" IsActive="True"/>
							<Property ID="Row Number" IsActive="True"/>
							<Property ID="Cardinality" IsActive="True"/>
							<Property ID="Mandatory" IsActive="True"/>
							<Property ID="Conformance" IsActive="True"/>
							<Property ID="DataType" DisplayName="Data Type" IsActive="True"/>
							<Property ID="Vocabulary" IsActive="True"/>
							<Property ID="Fixed Value" IsActive="True"/>
							<Property ID="Default Value" IsActive="True"/>
							<Property ID="Coding Strength" IsActive="True"/>
							<Property ID="Structural" IsActive="True"/>
							<Property ID="Description" IsActive="True"/>
							<Property ID="AF:FieldName" IsActive="True"/>
							<Property ID="AF:Record" IsActive="True"/>
							<Property ID="AF:Example" IsActive="True"/>
							<Property ID="AF:Mode" IsActive="True"/>
							<Property ID="AF:Label" IsActive="True"/>
							<Property ID="AF:Control" IsActive="True"/>
							<Property ID="AF:Format" IsActive="True"/>
							<Property ID="AF:Notes" IsActive="True"/>
							<Property ID="Key Type" IsActive="True"/>
							<Property ID="Key Value" IsActive="True"/>
							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
				</Nodes>
			</Guideline>
			<Guideline DocType="NCPDP" IsActive="True">
				<Nodes>
					<Node ID="InternalProperties" DisplayType="Internal Properties" IsActive="True"/>
					<Node ID="Transmission" IsActive="True">
						<Properties>
							<Property ID="ID" IsActive="True"/>
							<Property ID="Name" IsActive="True"/>
							<Property ID="Type" IsActive="True"/>
							<Property ID="Standard" IsActive="True"/>
							<Property ID="StdVersion" DisplayName="Version" IsActive="True"/>
							<Property ID="Purpose" DisplayName="Definition" IsActive="True"/>
							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="Segment" IsActive="True">
						<Properties>
							<Property ID="ID" IsActive="True"/>
							<Property ID="Sequence" DisplayName="Position" IsActive="True"/>
							<Property ID="Name" IsActive="True"/>
							<Property ID="Requirement" IsActive="True"/>
							<Property ID="UsrRequirement" DisplayName="User Option" IsActive="True"/>
							<Property ID="Purpose" DisplayName="Definition" IsActive="True"/>
							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="Transaction" IsActive="True">
						<Properties>
							<Property ID="ID" IsActive="True"/>
							<Property ID="Sequence" IsActive="True"/>
							<Property ID="Name" IsActive="True"/>
							<Property ID="Requirement" IsActive="True"/>
							<Property ID="UsrRequirement" DisplayName="User Option" IsActive="True"/>
							<Property ID="Purpose" DisplayName="Definition" IsActive="True"/>
							<Property ID="Count" DisplayName="Repeated" IsActive="True"/>
							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="Field" IsActive="True">
						<Properties>
							<Property ID="ID" IsActive="True"/>
							<Property ID="Name" IsActive="True"/>
							<Property ID="Purpose" DisplayName="Definition" IsActive="True"/>
							<Property ID="Requirement" IsActive="True"/>
							<Property ID="UsrRequirement" DisplayName="User Option" IsActive="True"/>
							<Property ID="DataType" DisplayName="Data Type" IsActive="True"/>
							<Property ID="MinSize" Display="Min Size" IsActive="True"/>
							<Property ID="MaxSize" Display="Max Size" IsActive="True"/>
							<Property ID="Format" IsActive="True"/>
							<Property ID="Sequence" DisplayName="Position" IsActive="True"/>
							<Property ID="KeyType" DisplayName="Key Type" IsActive="True"/>
							<Property ID="KeyValue" DisplayName="Key Value" IsActive="True"/>
							<Property ID="AF:FieldName" IsActive="True"/>
							<Property ID="AF:Record" IsActive="True"/>
							<Property ID="AF:Example" IsActive="True"/>
							<Property ID="AF:Mode" IsActive="True"/>
							<Property ID="AF:Label" IsActive="True"/>
							<Property ID="AF:Control" IsActive="True"/>
							<Property ID="AF:Format" IsActive="True"/>
							<Property ID="AF:Notes" IsActive="True"/>
							<Property ID="User Notes" IsActive="True"/>
							<Property ID="Codes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="QualifiedField" DisplayType="Qualified Field" IconKey="QualifiedField" IsActive="True">
						<Properties>
							<Property ID="ID" IsActive="True"/>
							<Property ID="Name" IsActive="True"/>
							<Property ID="Purpose" DisplayName="Definition" IsActive="True"/>
							<Property ID="Requirement" IsActive="True"/>
							<Property ID="UsrRequirement" DisplayName="User Option" IsActive="True"/>
							<Property ID="DataType" DisplayName="Data Type" IsActive="True"/>
							<Property ID="MinSize" Display="Min Size" IsActive="True"/>
							<Property ID="MaxSize" Display="Max Size" IsActive="True"/>
							<Property ID="Format" IsActive="True"/>
							<Property ID="Sequence" DisplayName="Position" IsActive="True"/>
							<Property ID="KeyType" DisplayName="Key Type" IsActive="True"/>
							<Property ID="KeyValue" DisplayName="Key Value" IsActive="True"/>
							<Property ID="AF:FieldName" IsActive="True"/>
							<Property ID="AF:Record" IsActive="True"/>
							<Property ID="AF:Example" IsActive="True"/>
							<Property ID="AF:Mode" IsActive="True"/>
							<Property ID="AF:Label" IsActive="True"/>
							<Property ID="AF:Control" IsActive="True"/>
							<Property ID="AF:Format" IsActive="True"/>
							<Property ID="AF:Notes" IsActive="True"/>
							<Property ID="User Notes" IsActive="True"/>
							<Property ID="Codes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="IterationField" DisplayType="Iteration Field" IconKey="IterationField" IsActive="True">
						<Properties>
							<Property ID="ID" IsActive="True"/>
							<Property ID="Name" IsActive="True"/>
							<Property ID="Purpose" DisplayName="Definition" IsActive="True"/>
							<Property ID="Requirement" IsActive="True"/>
							<Property ID="UsrRequirement" DisplayName="User Option" IsActive="True"/>
							<Property ID="DataType" DisplayName="Data Type" IsActive="True"/>
							<Property ID="MinSize" Display="Min Size" IsActive="True"/>
							<Property ID="MaxSize" Display="Max Size" IsActive="True"/>
							<Property ID="Format" IsActive="True"/>
							<Property ID="Sequence" DisplayName="Position" IsActive="True"/>
							<Property ID="KeyType" DisplayName="Key Type" IsActive="True"/>
							<Property ID="KeyValue" DisplayName="Key Value" IsActive="True"/>
							<Property ID="AF:FieldName" IsActive="True"/>
							<Property ID="AF:Record" IsActive="True"/>
							<Property ID="AF:Example" IsActive="True"/>
							<Property ID="AF:Mode" IsActive="True"/>
							<Property ID="AF:Label" IsActive="True"/>
							<Property ID="AF:Control" IsActive="True"/>
							<Property ID="AF:Format" IsActive="True"/>
							<Property ID="AF:Notes" IsActive="True"/>
							<Property ID="User Notes" IsActive="True"/>
							<Property ID="Codes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="CountField" DisplayType="Count Field" IconKey="CountField" IsActive="True">
						<Properties>
							<Property ID="ID" IsActive="True"/>
							<Property ID="Name" IsActive="True"/>
							<Property ID="Purpose" DisplayName="Definition" IsActive="True"/>
							<Property ID="Requirement" IsActive="True"/>
							<Property ID="UsrRequirement" DisplayName="User Option" IsActive="True"/>
							<Property ID="DataType" DisplayName="Data Type" IsActive="True"/>
							<Property ID="MinSize" Display="Min Size" IsActive="True"/>
							<Property ID="MaxSize" Display="Max Size" IsActive="True"/>
							<Property ID="Format" IsActive="True"/>
							<Property ID="Sequence" DisplayName="Position" IsActive="True"/>
							<Property ID="KeyType" DisplayName="Key Type" IsActive="True"/>
							<Property ID="KeyValue" DisplayName="Key Value" IsActive="True"/>
							<Property ID="AF:FieldName" IsActive="True"/>
							<Property ID="AF:Record" IsActive="True"/>
							<Property ID="AF:Example" IsActive="True"/>
							<Property ID="AF:Mode" IsActive="True"/>
							<Property ID="AF:Label" IsActive="True"/>
							<Property ID="AF:Control" IsActive="True"/>
							<Property ID="AF:Format" IsActive="True"/>
							<Property ID="AF:Notes" IsActive="True"/>
							<Property ID="User Notes" IsActive="True"/>
							<Property ID="Codes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="QualifiedGroup" DisplayType="Qualified Group" IconKey="QualifiedGroup" IsActive="True">
						<Properties>
							<Property ID="ID" IsActive="True"/>
							<Property ID="Name" IsActive="True"/>
							<Property ID="Purpose" DisplayName="Definition" IsActive="True"/>
							<Property ID="Requirement" IsActive="True"/>
							<Property ID="UsrRequirement" DisplayName="User Option" IsActive="True"/>
							<Property ID="Sequence" DisplayName="Position" IsActive="True"/>
							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="CountGroup" DisplayType="Count Group" IconKey="CountGroup" IsActive="True">
						<Properties>
							<Property ID="ID" IsActive="True"/>
							<Property ID="Name" IsActive="True"/>
							<Property ID="Purpose" DisplayName="Definition" IsActive="True"/>
							<Property ID="Requirement" IsActive="True"/>
							<Property ID="UsrRequirement" DisplayName="User Option" IsActive="True"/>
							<Property ID="Sequence" DisplayName="Position" IsActive="True"/>
							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="CounterGroup" DisplayType="Counter Group" IconKey="CounterGroup" IsActive="True">
						<Properties>
							<Property ID="ID" IsActive="True"/>
							<Property ID="Name" IsActive="True"/>
							<Property ID="Purpose" DisplayName="Definition" IsActive="True"/>
							<Property ID="Requirement" IsActive="True"/>
							<Property ID="UsrRequirement" DisplayName="User Option" IsActive="True"/>
							<Property ID="MaxUse" DisplayName="Repeated" IsActive="True"/>
							<Property ID="Sequence" DisplayName="Position" IsActive="True"/>
							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="RepeatSet" DisplayType="Repeat Set" IconKey="RepeatSet" IsActive="True">
						<Properties>
							<Property ID="ID" IsActive="True"/>
							<Property ID="Sequence" DisplayName="Position" IsActive="True"/>
							<Property ID="Name" IsActive="True"/>
							<Property ID="Requirement" IsActive="True"/>
							<Property ID="UsrRequirement" DisplayName="User Option" IsActive="True"/>
							<Property ID="MaxUse" DisplayName="Repeated" IsActive="True"/>
							<Property ID="Purpose" DisplayName="Definition" IsActive="True"/>
							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
				</Nodes>
			</Guideline>
			<Guideline DocType="PositionalFlatFile" DisplayName="Positional Flat File" IsActive="True">
				<Nodes>
					<Node ID="InternalProperties" DisplayType="Internal Properties" IsActive="True"/>
					<Node ID="Message" IsActive="True">
						<Properties>
							<Property ID="ID" IsActive="True"/>
							<Property ID="Name" IsActive="True"/>
							<Property ID="Standard" IsActive="True"/>
							<Property ID="Version" IsActive="True"/>
							<Property ID="Purpose" IsActive="True"/>
							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="GroupRecord" DisplayType="Group Record" IconKey="GroupRecord" IsActive="True">
						<Properties>
							<Property ID="ID" IsActive="True"/>
							<Property ID="Name" IsActive="True"/>
							<Property ID="Requirement" IsActive="True"/>
							<Property ID="UsrRequirement" DisplayName="User Option" IsActive="True"/>
							<Property ID="MinUse" DisplayName="Min Use" IsActive="True"/>
							<Property ID="MaxUse" DisplayName="Max Use" IsActive="True"/>
							<Property ID="Purpose" IsActive="True"/>
							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="Record" IsActive="True">
						<Properties>
							<Property ID="ID" IsActive="True"/>
							<Property ID="Name" IsActive="True"/>
							<Property ID="Requirement" IsActive="True"/>
							<Property ID="UsrRequirement" DisplayName="User Option" IsActive="True"/>
							<Property ID="MinUse" DisplayName="Min Use" IsActive="True"/>
							<Property ID="MaxUse" DisplayName="Max Use" IsActive="True"/>
							<Property ID="Purpose" IsActive="True"/>
							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="Composite" IsActive="True">
						<Properties>
							<Property ID="ID" IsActive="True"/>
							<Property ID="Name" IsActive="True"/>
							<Property ID="Purpose" IsActive="True"/>
							<Property ID="UsrRequirement" DisplayName="User Option" IsActive="True"/>
							<Property ID="Requirement" IsActive="True"/>
							<Property ID="Start" IsActive="True"/>
							<Property ID="End" IsActive="True"/>
							<Property ID="OccursType" DisplayName="Occurs Type" IsActive="True" />
							<Property ID="Occurs" IsActive="True"/>
							<Property ID="OccursFrom" DisplayName="Occurs from" IsActive="True"/>
							<Property ID="OccursTo" DisplayName="Occurs to" IsActive="True"/>
							<Property ID="OccursDependingOn" DisplayName="Occurs depending on" IsActive="True"/>
							<Property ID="Sequence" DisplayName="Position" IsActive="True"/>
							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="Field" IsActive="True">
						<Properties>
							<Property ID="ID" IsActive="True"/>
							<Property ID="Sequence" DisplayName="Position" IsActive="True"/>
							<Property ID="Name" IsActive="True"/>
							<Property ID="Requirement" IsActive="True"/>
							<Property ID="UsrRequirement" DisplayName="User Option" IsActive="True"/>
							<Property ID="Start" IsActive="True"/>
							<Property ID="End" IsActive="True"/>
							<Property ID="DataType" DisplayName="Type" IsActive="True"/>
							<Property ID="Format" IsActive="True"/>
							<Property ID="Size" IsActive="True"/>
							<Property ID="Justification" IsActive="True"/>
							<Property ID="MaxSize" DisplayName="Max Length" IsActive="True"/>
							<Property ID="MinSize" DisplayName="Min Length" IsActive="True"/>
							<Property ID="PaddingCharacter" DisplayName="Padding" IsActive="True"/>
							<Property ID="BlankWhenZero" DisplayName="Blank when zero" IsActive="True"/>
							<Property ID="Associated" IsActive="True"/>
							<Property ID="KeyType" DisplayName="Tag Field" IsActive="True"/>
							<Property ID="KeyValue" DisplayName="Tag Value" IsActive="True"/>
							<Property ID="OccursType" DisplayName="Occurs Type" IsActive="True" />
							<Property ID="Occurs" IsActive="True"/>
							<Property ID="OccursFrom" DisplayName="Occurs from" IsActive="True"/>
							<Property ID="OccursTo" DisplayName="Occurs to" IsActive="True"/>
							<Property ID="OccursDependingOn" DisplayName="Occurs depending on" IsActive="True"/>
							<Property ID="AF:FieldName" IsActive="True"/>
							<Property ID="AF:Record" IsActive="True"/>
							<Property ID="AF:Example" IsActive="True"/>
							<Property ID="AF:Mode" IsActive="True"/>
							<Property ID="AF:Label" IsActive="True"/>
							<Property ID="AF:Control" IsActive="True"/>
							<Property ID="AF:Format" IsActive="True"/>
							<Property ID="AF:Notes" IsActive="True"/>
							<Property ID="Purpose" IsActive="True"/>
							<Property ID="User Notes" IsActive="True"/>
							<Property ID="Codes" IsActive="True"/>
						</Properties>
					</Node>
				</Nodes>
			</Guideline>
			<Guideline DocType="PositionalParserSchema" DisplayName="Positional Parser Schema" IsActive="True">
				<Nodes>
					<Node ID="InternalProperties" DisplayType="Internal Properties" IsActive="True"/>
					<Node ID="DetectInfo" IsActive="True">
						<Properties>
							<Property ID="StartPosition" IsActive="True"/>
							<Property ID="Length" IsActive="True"/>
							<Property ID="Value" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="GroupNode" IsActive="True">
						<Properties>
							<Property ID="Name" IsActive="True"/>
							<Property ID="EndNode" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="InitialFileDetect" IsActive="True">
						<Properties>
							<Property ID="SkipStartPosition" IsActive="True"/>
							<Property ID="SkipLength" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="LeafField" IsActive="True">
						<Properties>
							<Property ID="Name" IsActive="True"/>
							<Property ID="KeyField" IsActive="True"/>
							<Property ID="Link" IsActive="True"/>
							<Property ID="Property" IsActive="True"/>
							<Property ID="KeyValue" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="LeafNode" IsActive="True">
						<Properties>
							<Property ID="Name" IsActive="True"/>
							<Property ID="EndNode" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="PositionalDelimiterInfo" IsActive="True">
						<Properties>
							<Property ID="StartPosition" IsActive="True"/>
							<Property ID="Length" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="PositionalDelimiterSettings" IsActive="True">
						<Properties>
							<Property ID="RecordLength" IsActive="True"/>
							<Property ID="RecordDelimiter" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="StaticProperty" IsActive="True">
						<Properties>
							<Property ID="Name" IsActive="True"/>
							<Property ID="Type" IsActive="True"/>
							<Property ID="Value" IsActive="True"/>
						</Properties>
					</Node>
				</Nodes>
			</Guideline>
			<Guideline DocType="RosettaNet" IsActive="True">
				<Nodes>
					<Node ID="BusinessMessage" DisplayType="Business Message" IconKey="BusinessMessage" IsActive="True">
						<Properties>
							<Property ID="Name" IsActive="True"/>
							<Property ID="Purpose" DisplayName="Definition" IsActive="True"/>
							<Property ID="ClusterID" DisplayName="Cluster ID" IsActive="True"/>
							<Property ID="ClusterName" DisplayName="Cluster Name" IsActive="True"/>
							<Property ID="SegmentID" DisplayName="Segment ID" IsActive="True"/>
							<Property ID="SegmentName" DisplayName="Segment Name" IsActive="True"/>
							<Property ID="PipID" DisplayName="Pip ID" IsActive="True"/>
							<Property ID="PipName" DisplayName="Pip Name" IsActive="True"/>
							<Property ID="PipVersion" DisplayName="Pip Version" IsActive="True"/>
							<Property ID="Namespace" IsActive="True"/>
							<Property ID="SchemaVersion" DisplayName="Schema Version" IsActive="True"/>
							<Property ID="XMLType" DisplayName="XML Type" IsActive="True"/>
							<Property ID="XMLTypeDefinition" DisplayName="XML Type Definition" IsActive="True"/>
							<Property ID="XMLTypeVersion" DisplayName="XML Type Version" IsActive="True"/>
							<Property ID="Sequence" DisplayName="Position" IsActive="True"/>
							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="BusinessProperty" DisplayType="Business Property" IconKey="BusinessProperty" IsActive="True">
						<Properties>
							<Property ID="Name" IsActive="True"/>
							<Property ID="Sequence" DisplayName="Position" IsActive="True"/>
							<Property ID="MinUse" DisplayName="Min Use" IsActive="True"/>
							<Property ID="MaxUse" DisplayName="Max Use" IsActive="True"/>
							<Property ID="hasAssociation" DisplayName="Has Association" IsActive="True"/>
							<Property ID="Purpose" DisplayName="Definition" IsActive="True"/>
							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="Choice" IsActive="True">
						<Properties>
							<Property ID="Purpose" DisplayName="Definition" IsActive="True"/>
							<Property ID="Sequence" DisplayName="Position" IsActive="True"/>
							<Property ID="MinUse" DisplayName="Min Use" IsActive="True"/>
							<Property ID="MaxUse" DisplayName="Max Use" IsActive="True"/>
							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="BusinessDataEntity" DisplayType="Business Data Entity" IconKey="BusinessDataEntity" IsActive="True">
						<Properties>
							<Property ID="Name" IsActive="True"/>
							<Property ID="Sequence" DisplayName="Position" IsActive="True"/>
							<Property ID="MinUse" DisplayName="Min Use" IsActive="True"/>
							<Property ID="MaxUse" DisplayName="Max Use" IsActive="True"/>
							<Property ID="hasAssociation" DisplayName="Has Association" IsActive="True"/>
							<Property ID="Namespace" IsActive="True"/>
							<Property ID="XMLType" DisplayName="XML Type" IsActive="True"/>
							<Property ID="XMLTypeVersion" DisplayName="XML Type Version" IsActive="True"/>
							<Property ID="XMLRef" DisplayName="XML Reference" IsActive="True"/>
							<Property ID="Purpose" DisplayName="Definition" IsActive="True"/>
							<Property ID="XMLTypeDefinition" DisplayName="XML Type Definition" IsActive="True"/>
							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="FundamentalBusinessDataEntity" DisplayType="Fundamental Business Data Entity" IconKey="FundamentalBusinessDataEntity" IsActive="True">
						<Properties>
							<Property ID="Name" IsActive="True"/>
							<Property ID="Sequence" DisplayName="Position" IsActive="True"/>
							<Property ID="DataType" DisplayName="Data Type" IsActive="True"/>
							<Property ID="Representation" IsActive="True"/>
							<Property ID="MinSize" DisplayName="Min Size" IsActive="True"/>
							<Property ID="MaxSize" DisplayName="Max Size" IsActive="True"/>
							<Property ID="MinUse" DisplayName="Min Use" IsActive="True"/>
							<Property ID="MaxUse" DisplayName="Max Use" IsActive="True"/>
							<Property ID="hasAssociation" DisplayName="Has Association" IsActive="True"/>
							<Property ID="Namespace" IsActive="True"/>
							<Property ID="XMLType" DisplayName="XML Type" IsActive="True"/>
							<Property ID="XMLTypeVersion" DisplayName="XML Type Version" IsActive="True"/>
							<Property ID="XMLRef" DisplayName="XML Reference" IsActive="True"/>
							<Property ID="Purpose" DisplayName="Definition" IsActive="True"/>
							<Property ID="XMLTypeDefinition" DisplayName="XML Type Definition" IsActive="True"/>
							<Property ID="AF:FieldName" IsActive="True"/>
							<Property ID="AF:Record" IsActive="True"/>
							<Property ID="AF:Example" IsActive="True"/>
							<Property ID="AF:Mode" IsActive="True"/>
							<Property ID="AF:Label" IsActive="True"/>
							<Property ID="AF:Control" IsActive="True"/>
							<Property ID="AF:Format" IsActive="True"/>
							<Property ID="AF:Notes" IsActive="True"/>
							<Property ID="User Notes" IsActive="True"/>
							<Property ID="Codes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="QuantitativeFundamentalBusinessDataEntity" DisplayType="Quantitative Fundamental Business Data Entity" IconKey="QuantitativeFundamentalBusinessDataEntity" IsActive="True">
						<Properties>
							<Property ID="Name" IsActive="True"/>
							<Property ID="Sequence" DisplayName="Position" IsActive="True"/>
							<Property ID="DataType" DisplayName="Data Type" IsActive="True"/>
							<Property ID="Representation" IsActive="True"/>
							<Property ID="UnitOfMeasure" DisplayName="Unit Of Measure" IsActive="True"/>
							<Property ID="SystemOfUnits" DisplayName="System Of Units" IsActive="True"/>
							<Property ID="Dimension" IsActive="True"/>
							<Property ID="MinSize" DisplayName="Min Size" IsActive="True"/>
							<Property ID="MaxSize" DisplayName="Max Size" IsActive="True"/>
							<Property ID="MinUse" DisplayName="Min Use" IsActive="True"/>
							<Property ID="MaxUse" DisplayName="Max Use" IsActive="True"/>
							<Property ID="hasAssociation" DisplayName="Has Association" IsActive="True"/>
							<Property ID="Namespace" IsActive="True"/>
							<Property ID="XMLType" DisplayName="XML Type" IsActive="True"/>
							<Property ID="XMLTypeVersion" DisplayName="XML Type Version" IsActive="True"/>
							<Property ID="XMLRef" DisplayName="XML Reference" IsActive="True"/>
							<Property ID="Purpose" DisplayName="Definition" IsActive="True"/>
							<Property ID="XMLTypeDefinition" DisplayName="XML Type Definition" IsActive="True"/>
							<Property ID="AF:FieldName" IsActive="True"/>
							<Property ID="AF:Record" IsActive="True"/>
							<Property ID="AF:Example" IsActive="True"/>
							<Property ID="AF:Mode" IsActive="True"/>
							<Property ID="AF:Label" IsActive="True"/>
							<Property ID="AF:Control" IsActive="True"/>
							<Property ID="AF:Format" IsActive="True"/>
							<Property ID="AF:Notes" IsActive="True"/>
							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="CodedFundamentalBusinessDataEntity" DisplayType="Coded Fundamental Business Data Entity" IconKey="CodedFundamentalBusinessDataEntity" IsActive="True">
						<Properties>
							<Property ID="Name" IsActive="True"/>
							<Property ID="Sequence" DisplayName="Position" IsActive="True"/>
							<Property ID="DataType" DisplayName="Data Type" IsActive="True"/>
							<Property ID="Representation" IsActive="True"/>
							<Property ID="Identifier" IsActive="True"/>
							<Property ID="CodeListVersion" DisplayName="CodeList Version" IsActive="True"/>
							<Property ID="Agency" IsActive="True"/>
							<Property ID="MinSize" DisplayName="Min Size" IsActive="True"/>
							<Property ID="MaxSize" DisplayName="Max Size" IsActive="True"/>
							<Property ID="MinUse" DisplayName="Min Use" IsActive="True"/>
							<Property ID="MaxUse" DisplayName="Max Use" IsActive="True"/>
							<Property ID="hasAssociation" DisplayName="Has Association" IsActive="True"/>
							<Property ID="Namespace" IsActive="True"/>
							<Property ID="XMLType" DisplayName="XML Type" IsActive="True"/>
							<Property ID="XMLTypeVersion" DisplayName="XML Type Version" IsActive="True"/>
							<Property ID="XMLRef" DisplayName="XML Reference" IsActive="True"/>
							<Property ID="Purpose" DisplayName="Definition" IsActive="True"/>
							<Property ID="XMLTypeDefinition" DisplayName="XML Type Definition" IsActive="True"/>
							<Property ID="AF:FieldName" IsActive="True"/>
							<Property ID="AF:Record" IsActive="True"/>
							<Property ID="AF:Example" IsActive="True"/>
							<Property ID="AF:Mode" IsActive="True"/>
							<Property ID="AF:Label" IsActive="True"/>
							<Property ID="AF:Control" IsActive="True"/>
							<Property ID="AF:Format" IsActive="True"/>
							<Property ID="AF:Notes" IsActive="True"/>
							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="AttributeFundamentalBusinessDataEntity" DisplayType="Attribute Fundamental Business Data Entity" IconKey="AttributeFundamentalBusinessDataEntity" IsActive="True">
						<Properties>
							<Property ID="Name" IsActive="True"/>
							<Property ID="Sequence" DisplayName="Position" IsActive="True"/>
							<Property ID="DataType" DisplayName="Data Type" IsActive="True"/>
							<Property ID="Representation" IsActive="True"/>
							<Property ID="MinSize" DisplayName="Min Size" IsActive="True"/>
							<Property ID="MaxSize" DisplayName="Max Size" IsActive="True"/>
							<Property ID="MinUse" DisplayName="Min Use" IsActive="True"/>
							<Property ID="MaxUse" DisplayName="Max Use" IsActive="True"/>
							<Property ID="hasAssociation" DisplayName="Has Association" IsActive="True"/>
							<Property ID="Namespace" IsActive="True"/>
							<Property ID="XMLType" DisplayName="XML Type" IsActive="True"/>
							<Property ID="XMLTypeVersion" DisplayName="XML Type Version" IsActive="True"/>
							<Property ID="XMLRef" DisplayName="XML Reference" IsActive="True"/>
							<Property ID="Purpose" DisplayName="Definition" IsActive="True"/>
							<Property ID="XMLTypeDefinition" DisplayName="XML Type Definition" IsActive="True"/>
							<Property ID="AF:FieldName" IsActive="True"/>
							<Property ID="AF:Record" IsActive="True"/>
							<Property ID="AF:Example" IsActive="True"/>
							<Property ID="AF:Mode" IsActive="True"/>
							<Property ID="AF:Label" IsActive="True"/>
							<Property ID="AF:Control" IsActive="True"/>
							<Property ID="AF:Format" IsActive="True"/>
							<Property ID="AF:Notes" IsActive="True"/>
							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="Reference" IsActive="True">
						<Properties>
							<Property ID="Name" IsActive="True"/>
							<Property ID="Sequence" DisplayName="Position" IsActive="True"/>
							<Property ID="MinUse" DisplayName="Min Use" IsActive="True"/>
							<Property ID="MaxUse" DisplayName="Max Use" IsActive="True"/>
							<Property ID="Purpose" DisplayName="Definition" IsActive="True"/>
							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
				</Nodes>
			</Guideline>
			<Guideline DocType="XMLSchema" IsActive="True">
				<Nodes>
					<Node ID="InternalProperties" DisplayType="Internal Properties" IsActive="True"/>
					<Node ID="schema" DisplayType="Schema" IconKey="schema" IsActive="True">
						<Properties>
							<Property ID="version" IsActive="True"/>

							<Property ID="Annotation" IsActive="True"/>

							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="element" DisplayType="Element" IconKey="element" IsActive="True">
						<Properties>
							<Property ID="nillable" DisplayName="Nillable" IsActive="True"/>
							<Property ID="name" DisplayName="Name" IsActive="True"/>
							<Property ID="fixed" DisplayName="Fixed Value" IsActive="True"/>
							<Property ID="default" DisplayName="Default Value" IsActive="True"/>
							<Property ID="type" DisplayName="Type" IsActive="True"/>

							<!-- facets -->
							<Property ID="minOccurs" DisplayName="Min Occurs" IsActive="True"/>
							<Property ID="maxOccurs" DisplayName="Max Occurs" IsActive="True"/>
							<Property ID="Length" IsActive="True"/>
							<Property ID="Min Length" IsActive="True"/>
							<Property ID="Max Length" IsActive="True"/>
							<Property ID="Min Value" IsActive="True"/>
							<Property ID="Max Value" IsActive="True"/>
							<Property ID="Inclusive" IsActive="True"/>
							<Property ID="Pattern" IsActive="True"/>
							<Property ID="Code List" IsActive="True"/>

							<Property ID="Attributes" IsActive="True"/>
							<Property ID="Annotation" IsActive="True"/>

							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="attribute" DisplayType="Attribute" IconKey="attribute" IsActive="True">
						<Properties>
							<Property ID="name" DisplayName="Name" IsActive="True"/>
							<Property ID="use" DisplayName="Usage" IsActive="True"/>
							<Property ID="fixed" DisplayName="Fixed Value" IsActive="True"/>
							<Property ID="default" DisplayName="Default Value" IsActive="True"/>
							<Property ID="type" DisplayName="Type" IsActive="True"/>

							<!-- facets -->
							<Property ID="minOccurs" DisplayName="Min Occurs" IsActive="True"/>
							<Property ID="maxOccurs" DisplayName="Max Occurs" IsActive="True"/>
							<Property ID="Length" IsActive="True"/>
							<Property ID="Min Length" IsActive="True"/>
							<Property ID="Max Length" IsActive="True"/>
							<Property ID="Min Value" IsActive="True"/>
							<Property ID="Max Value" IsActive="True"/>
							<Property ID="Inclusive" IsActive="True"/>
							<Property ID="Pattern" IsActive="True"/>
							<Property ID="Code List" IsActive="True"/>

							<Property ID="Annotation" IsActive="True"/>

							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="any" DisplayType="Any Element" IconKey="any" IsActive="True">
						<Properties>
							<Property ID="minOccurs" DisplayName="Min Occurs" IsActive="True"/>
							<Property ID="maxOccurs" DisplayName="Max Occurs" IsActive="True"/>
							<Property ID="Annotation" IsActive="True"/>
							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="anyAttribute" DisplayType="Any Attribute" IconKey="anyAttribute" IsActive="True">
						<Properties>
							<Property ID="Annotation" IsActive="True"/>
							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
				</Nodes>
			</Guideline>
			<Guideline DocType="JSON" IsActive="True">
				<Nodes>
					<Node ID="InternalProperties" DisplayType="Internal Properties" IsActive="True"/>
					<Node ID="JSONGuideline" DisplayType="JSON Guideline" IsActive="True">
						<Properties>
							<Property ID="title" IsActive="True"/>
							<Property ID="description" IsActive="True"/>

							<Property ID="Type" IsActive="True"/>
							<Property ID="Standard" IsActive="True"/>
							<Property ID="Version" IsActive="True"/>
							<Property ID="DocumentID" IsActive="True"/>

							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="property" IsActive="True">
						<Properties>
							<Property ID="name" IsActive="True"/>
							<Property ID="title" IsActive="True"/>
							<Property ID="description" IsActive="True"/>
							<Property ID="definition" DisplayName="type" IsActive="True"/>
							<Property ID="use" IsActive="True"/>
							<Property ID="nillable" IsActive="True"/>

							<Property ID="additionalProperties" IsActive="True"/>

							<Property ID="minItems" IsActive="True"/>
							<Property ID="maxItems" IsActive="True"/>
							<Property ID="uniqueItems" IsActive="True"/>

							<Property ID="format" IsActive="True"/>
							<Property ID="pattern" IsActive="True"/>
							<Property ID="minLength" IsActive="True"/>
							<Property ID="maxLength" IsActive="True"/>

							<Property ID="fixed" IsActive="True"/>
							<Property ID="multipleOf" IsActive="True"/>
							<Property ID="minimum" IsActive="True"/>
							<Property ID="exclusiveMinimum" IsActive="True"/>
							<Property ID="maximum" IsActive="True"/>
							<Property ID="exclusiveMaximum" IsActive="True"/>

							<Property ID="Codes" IsActive="True" />

							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="object" IsActive="True">
						<Properties>
							<Property ID="title" IsActive="True"/>
							<Property ID="description" IsActive="True"/>

							<Property ID="additionalProperties" IsActive="True"/>

							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="choice" IsActive="True">
						<Properties>
							<Property ID="title" IsActive="True"/>
							<Property ID="description" IsActive="True"/>

							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="array" IsActive="True">
						<Properties>
							<Property ID="title" IsActive="True"/>
							<Property ID="description" IsActive="True"/>

							<Property ID="minItems" IsActive="True"/>
							<Property ID="maxItems" IsActive="True"/>
							<Property ID="uniqueItems" IsActive="True"/>

							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="string" IsActive="True">
						<Properties>
							<Property ID="title" IsActive="True"/>
							<Property ID="description" IsActive="True"/>

							<Property ID="fixed" IsActive="True"/>
							<Property ID="format" IsActive="True"/>
							<Property ID="pattern" IsActive="True"/>
							<Property ID="minLength" IsActive="True"/>
							<Property ID="maxLength" IsActive="True"/>

							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="number" IsActive="True">
						<Properties>
							<Property ID="title" IsActive="True"/>
							<Property ID="description" IsActive="True"/>

							<Property ID="fixed" IsActive="True"/>
							<Property ID="multipleOf" IsActive="True"/>
							<Property ID="minimum" IsActive="True"/>
							<Property ID="exclusiveMinimum" IsActive="True"/>
							<Property ID="maximum" IsActive="True"/>
							<Property ID="exclusiveMaximum" IsActive="True"/>

							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="integer" IsActive="True">
						<Properties>
							<Property ID="title" IsActive="True"/>
							<Property ID="description" IsActive="True"/>

							<Property ID="fixed" IsActive="True"/>
							<Property ID="multipleOf" IsActive="True"/>
							<Property ID="minimum" IsActive="True"/>
							<Property ID="exclusiveMinimum" IsActive="True"/>
							<Property ID="maximum" IsActive="True"/>
							<Property ID="exclusiveMaximum" IsActive="True"/>

							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="boolean" IsActive="True">
						<Properties>
							<Property ID="title" IsActive="True"/>
							<Property ID="description" IsActive="True"/>

							<Property ID="fixed" IsActive="True"/>

							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="null" IsActive="True">
						<Properties>
							<Property ID="title" IsActive="True"/>
							<Property ID="description" IsActive="True"/>

							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="any" IsActive="True">
						<Properties>
							<Property ID="title" IsActive="True"/>
							<Property ID="description" IsActive="True"/>

							<Property ID="User Notes" IsActive="True"/>
						</Properties>
					</Node>
					<Node ID="CodeList" DisplayType="enum" IsActive="True">
						<Properties>
							<Property ID="Codes" IsActive="True" />
						</Properties>
					</Node>
				</Nodes>
			</Guideline>
		</Guidelines>
	</Filter>
</FindReplace>
```

### FindReplace/Options.xml

```xml
<FindReplace Version="1.0" CompatibilityVersion="1.0">
  <FindWhat>
    <Text></Text>
  </FindWhat>
  <ReplaceWith>
    <Text></Text>
  </ReplaceWith>
  <Options>
    <Option Name="MatchCase" Value="True" />
    <Option Name="MatchWord" Value="True" />
    <Option Name="IncludedOnly" Value="True" />
    <Option Name="Direction" Value="Down" />
    <Option Name="Scope" Value="Guidelines" />
    <Option Name="ScopeEnabled" Value="True" />
  </Options>
</FindReplace>
```

### Java/JavaClassesDeclaration.htm

```htm
<script language="VBScript">

Dim g_JavaActionMgr
Dim g_JAMgrAdapter
Dim g_Action
Dim g_Empty
Dim g_RuleView
Dim g_ReadOnlyMode
Dim g_nSupressColumn

Dim g_GridColWidth
g_GridColWidth = Array(1650, 1440, 1750, 1440)

Dim g_bKeyPressed
g_bKeyPressed = False

Const DIALOG_TITLE = "SpecBuilder"
Const Grid_ColWidthPropertyPrefix = "DeclarationColWidth"

Function IsNullOrNothing(val)
	If IsNull(val) Then
		IsNullOrNothing = True
	ElseIf val Is Nothing Then 
		IsNullOrNothing = True
	Else
		IsNullOrNothing = False
	End If		
End Function

Sub EnableInput(oInput, bEnabled)
	oInput.disabled = Not bEnabled
	If bEnabled Then 
		oInput.style.backgroundcolor = ""
	Else
		idParameter.style.backgroundcolor = "#F0F0F0"
	End If
End Sub

Sub Document_OnReadyStateChange()
	if document.readystate = "complete" then
		Initilaize()
		idGrid.Focus()
		window.scroll 0, 0
	end if
End Sub

Sub Initilaize()
	BtnNew.disabled = True
	BtnModify.disabled = True
	BtnRemove.disabled = True

	Set g_JavaActionMgr = Nothing
	Set g_RuleView = Nothing
	Set g_Empty = Nothing
	On Error Resume Next

	Set g_Action = window.external.GetValue("Action")
	g_Action.Update

	Set g_JavaActionMgr = g_Action.Property("JavaActionMgr")
	Set g_RuleView = window.external.GetValue("RuleView")
	If IsNullOrNothing(g_JavaActionMgr) Then
		window.external.messagebox "Internal Error. Please, contact support.", "Error", vbCritical
		g_ReadOnlyMode = True
		Exit Sub
	End If

	g_ReadOnlyMode = False
	g_ReadOnlyMode = window.external.GetValue("ReadOnly") Or g_Action.ReadOnly

	On Error Goto 0
	
	SetupGrid()

	FillGrid

	BtnNew.disabled = g_ReadOnlyMode
End Sub

Function LoadColWidth(nColIndex)
	PropName = Grid_ColWidthPropertyPrefix & nColIndex
	DefValue = g_GridColWidth(nColIndex)
	LoadColWidth = g_JavaActionMgr.GetPersistentProperty(PropName, DefValue)
End Function

Sub SaveColWidth(nColIndex)
	PropName = Grid_ColWidthPropertyPrefix & nColIndex
	PropValue = idGrid.ColWidth(nColIndex)
	g_JavaActionMgr.PutPersistentProperty PropName, PropValue
End Sub 

Function GetParentWindow
	If IsNullOrNothing(g_RuleView) Then
		GetParentWindow = 0
	Else
		GetParentWindow = g_RuleView.Window
	End If
End Function

Sub RefreshView
	If IsNullOrNothing(g_RuleView) Then 
		window.external.NotifyHost "RefreshView", 0
	Else
		g_RuleView.RefreshView
	End If
End Sub

Sub UpdateDeclaration(NewValue)
	If NewValue = True Then
		g_JavaActionMgr.Update(False)
	End if
End Sub

Sub SetupGrid
	flexAlignCenterCenter = 4
	flexDTBoolean = 11

	nColIndex = 0

	idGrid.Rows = 1
	idGrid.Cols = 4
	'All titles set to flexAlignCenterCenter
	idGrid.FixedAlignment(-1) = flexAlignCenterCenter

	idGrid.ColWidth(nColIndex) = LoadColWidth(nColIndex)
	idGrid.Cell(0, 0, nColIndex) = "Java Class Name"

	nColIndex = nColIndex + 1
	idGrid.ColWidth(nColIndex) = LoadColWidth(nColIndex)
	idGrid.Cell(0, 0, nColIndex) = "Variable Name"

	nColIndex = nColIndex + 1
	'Suppression column is check-box
	g_nSupressColumn = nColIndex
	idGrid.ColWidth(nColIndex) = LoadColWidth(nColIndex)
	idGrid.Cell(0, 0, nColIndex) = "Disable Usage"
	idGrid.ColDataType(nColIndex) = flexDTBoolean

	nColIndex = nColIndex + 1
	idGrid.ColWidth(nColIndex) = LoadColWidth(nColIndex)
	idGrid.Cell(0, 0, nColIndex) = "JAR file location"

	'Initilaize tooltips
	Set FGHelper = CreateObject("FlexGridTools.ECFlexGridToolTip")
	Set FG = idGrid
	FGHelper.Initialize FG

End Sub

Sub FillGrid
	Dim JADeclarations
	Dim JA
	Dim I
	Dim JACount

	On Error Resume Next
	Set JADeclarations = g_JavaActionMgr.DeclaredJavaActions(g_Empty)
	If Err Then
		window.external.messagebox Err.Description, "Error", vbCritical
		g_ReadOnlyMode = True				
		Exit Sub
	End If
	On Error Goto 0

	JACount = JADeclarations.Count
	idGrid.Rows = JACount + 1

	For I = 1 To JACount
		Set JA = JADeclarations(I - 1)

		idGrid.TextMatrix(I, 0) = JA.ClassName
		idGrid.TextMatrix(I, 1) = JA.VarName
		idGrid.TextMatrix(I, g_nSupressColumn) = JA.Disabled
		idGrid.TextMatrix(I, g_nSupressColumn + 1) = JA.JARLocation
		idGrid.RowData(I) = JA
	Next
	' Check if last row was removed
	If idGrid.Row < 0 And idGrid.Rows > 1 Then idGrid.Row = idGrid.Rows - 1
	'Show description for first item
	idGrid_SelChange

End Sub

Sub idGrid_SelChange
	ActionDescription.InnerHTML = ""
	'Documentation tell about -1 value if no selection, but really return -2
	If idGrid.Row < 0 Then
		BtnModify.Disabled = True
		BtnRemove.Disabled = True
		Exit Sub
	End If

	BtnModify.Disabled = g_ReadOnlyMode
	BtnRemove.Disabled = g_ReadOnlyMode

	'Select single row only
	idGrid.Row = idGrid.RowSel
	Dim JA
	'On Error Resume Next
	If IsEmpty(idGrid.RowData(idGrid.Row)) Then Exit Sub
	Set JA = idGrid.RowData(idGrid.Row)
	ActionDescription.InnerHTML = Replace(JA.Description, vbCr, "<br/>")
End Sub

Sub idGrid_BeforeRowColChange(ByVal OldRow, ByVal OldCol, ByVal NewRow, ByVal NewCol, ByRef Cancel)
	'Only suppression can be edited
	If g_ReadOnlyMode Then Exit Sub
	If NewCol = g_nSupressColumn Then
		flexEDKbdMouse = 2
		idGrid.Editable = flexEDKbdMouse
	Else
		flexEDNone = 0
		idGrid.Editable = flexEDNone
	End If
End Sub

Sub idGrid_AfterEdit(Row, Col)
	Dim JA
	If Not g_bKeyPressed Then
		Set JA = idGrid.RowData(Row)
		idGrid.TextMatrix(Row, g_nSupressColumn) = JA.Disabled
	ElseIf Col = g_nSupressColumn Then
		Set JA = idGrid.RowData(Row)
		JA.Disabled = idGrid.TextMatrix(Row, g_nSupressColumn)
		UpdateDeclaration(True)
	End If
End Sub

Sub idGrid_KeyDown(KeyCode, Shift)
	g_bKeyPressed = True
End Sub

Sub idGrid_KeyUp(KeyCode, Shift)
	g_bKeyPressed = False
End Sub

Sub idGrid_MouseDown(Button, Shift, X, Y)
	Dim JA
	Dim Row
	Dim Disabled
	If g_ReadOnlyMode Then Exit Sub
	Row = idGrid.MouseRow
	If Row < 1 Then Exit Sub
	' User can click any button on mouse
	'If Button <> 1 Then Exit Sub
	If Shift <> 0 Then Exit Sub
	If idGrid.MouseCol = g_nSupressColumn Then
		Set JA = idGrid.RowData(Row)
		Disabled = Not idGrid.TextMatrix(Row, g_nSupressColumn)
		idGrid.TextMatrix(Row, g_nSupressColumn) = Disabled
		JA.Disabled = Disabled
		UpdateDeclaration(True)
	End If
End Sub

Sub idGrid_AfterUserResize(Row, Col)
	If -1 <> Col Then 
		For I = 0 To idGrid.Cols - 1
			SaveColWidth I
		Next
	End If
End Sub

Sub AddJADeclaration
	On Error Resume Next
	Success = g_JavaActionMgr.AddJavaActionDlg(g_Empty, GetParentWindow(), False)
	If Err Then
		window.external.messagebox Err.Description, "Error", vbCritical
		On Error Goto 0
		Exit Sub
	End If
	On Error Goto 0
	If Success Then
		UpdateDeclaration(True)
		FillGrid
		RefreshView
	End If
End Sub

Sub ModifyJADeclaration
	'Return if no selection
	If idGrid.Row < 0 Then Exit Sub
	'Return if no JA value
	If IsEmpty(idGrid.RowData(idGrid.Row)) Then Exit Sub
	Set JA = idGrid.RowData(idGrid.Row)
	'If Err Then Exit Sub
	JA.ModifyDlg GetParentWindow()
	ActionDescription.InnerHTML = Replace(JA.Description, vbCr, "<br/>")
	UpdateDeclaration(True)
End Sub

Sub RemoveJADeclaration
	'Return if no selection
	If idGrid.Row < 0 Then Exit Sub
	'Return if no JA value
	If IsEmpty(idGrid.RowData(idGrid.Row)) Then Exit Sub
	Set JA = idGrid.RowData(idGrid.Row)
	strErrorMsg = "You have chosen to delete java class declaration for: " & JA.ClassName & vbCrLf & vbCrLf & _
				  "This will also make invalid all functions where this java class methods are used." & vbCrLf & vbCrLf & _
				  "Are you sure you want to continue?"

	If vbYes = window.external.messagebox(strErrorMsg, "Confirmation", vbQuestion + vbYesNo + vbDefaultButton2) Then
		JA.Remove
		UpdateDeclaration(True)
		FillGrid
		RefreshView
		idGrid.Focus()
	End If
End Sub

Function ExternalCmdCalls()

	Dim Command
	Dim ParamObj

	Set ParamObj = window.external.MethodParams
	Command = ParamObj.Method
	ParamObj.ReturnValue = 1

	If (Command = "OnApply") Then
		g_Action.SetParamValue "ec_Declaration", g_JavaActionMgr.DeclarationValue(g_Empty, False)
		ParamObj.ReturnValue = 1
	ElseIf (Command = "RefreshActions") Then
		FillGrid
	End If

End Function

</script>

<html>
	<HEAD>
		<TITLE></TITLE>
	</HEAD>
<style>
	html,body {	overflow-y:auto;}
	td {font: 8pt verdana;}
	#idGrid {font: 8pt verdana;}
</style>

	<BODY topmargin="0" leftmargin="0" ondrop="CheckForChange" BGCOLOR="WHITE">
		<TABLE border="0" width="100%" cellspacing="0" cellpadding="10">
			<TR>
				<TD colspan="2" width="100%" BGCOLOR="#c0c0c0"><BIG>Java Classes Declaration</BIG></TD>
			</TR>
			<TR>
				<TD width="80%" BGCOLOR="WHITE">
					<OBJECT CLASSID="clsid:5220cb21-c88d-11cf-b347-00aa00a28331">
						<PARAM NAME="LPKPath" VALUE="../../../vsFlex8n.lpk">
					</OBJECT>				
					<OBJECT id="idGrid"	tabIndex="10" height="212" width="100%" classid="clsid:74233db3-f72f-44ea-94dc-258a624037e6">
						<PARAM NAME="BackColorBkg" VALUE="16777215">
						<PARAM NAME="AllowSelection" VALUE="-1">
						<PARAM NAME="AllowBigSelection" VALUE="-1">
						<PARAM NAME="AllowUserResizing" VALUE="1">
						<PARAM NAME="SelectionMode" VALUE="1">
						<PARAM NAME="Rows" VALUE="1">
						<PARAM NAME="Cols" VALUE="4">
						<PARAM NAME="FixedRows" VALUE="1">
						<PARAM NAME="FixedCols" VALUE="0">
						<PARAM NAME="ScrollBars" VALUE="3">
					</OBJECT>
				</TD>
				<TD width="20%" BGCOLOR="WHITE" align="center" valign="top">
					<INPUT TYPE="button" VALUE="New..." NAME="BtnNew" onClick="AddJADeclaration" style="width:100px"><BR>
					<BR>
					<INPUT TYPE="button" VALUE="Modify..." NAME="BtnModify" onClick="ModifyJADeclaration" style="width:100px"><BR>
					<BR>
					<INPUT TYPE="button" VALUE="Remove..." NAME="BtnRemove" onClick="RemoveJADeclaration" style="width:100px"><BR>
					<BR>
				</TD>
			</TR>
		</TABLE>
		<TABLE border="0" width="100%" cellspacing="3" cellpadding="0">
			<TR>
				<TD width="80px"><FONT COLOR="#0033CC">&nbsp;Description</FONT></TD>
				<TD><HR SIZE="1"></TD>
			</TR>
		</TABLE>
		<TABLE border="0" width="100%" cellspacing="3" cellpadding="0">
			<TR>
				<TD width="10px">&nbsp</TD>
				<TD>
					<BR>
					<DIV id="ActionDescription">
						Sample decription
					</DIV>
				</TD>
			</TR>
		</TABLE>
	</BODY>
</html>
```

### Java/JavaHandlerCommon.vbs

```vbs
'Option Explicit

Dim g_JavaActionMgr
Dim g_JADeclarations
Dim g_JAMethods
Dim g_Action
Dim g_Empty
Dim g_InitFinished
Dim g_ReadOnlyMode
Dim g_NewActionMode
Dim g_DeclAddingMode

Dim g_bDotNet

Dim g_strSrcClassName
Dim g_strSrcVarName
Dim g_bFGTooltipEnabled
g_bFGTooltipEnabled = False

Const DIALOG_TITLE = "Rules"
Const g_strLastClassProperty = "LastNodeHandlerClass"
Const g_strLastVarProperty = "LastNodeHandlerVar"

Const sigNoParameter = 0
Const sigStringLong = 1
Const sigStringLongString = 2
Const sigProperty = 3
Const flexcpForeColor = 7
const clrInfoRow = &h808080

Function Max(Value1, Value2)
	If Value1 > Value2 Then Max = Value1 Else Max = Value2
End Function

Sub UpdateParameterControlInReadOnlyMode()

	EnableParameter false
	EnableProperties false
		
	if Len(idParameter.value) > 0 then
		idSingleParameter.style.display = ""
	else
		idPropertyParameter.style.display = "none"
		if idGrid.Rows > 2 then
			idPropertyParameter.style.display = ""
		else
			idPropertyParameter.style.display = "none"
		end if		
	end if
End Sub

Sub UpdateParameterControl(SignatureType)
	Select Case SignatureType
		    Case 0 ' sigNoParameter and Dot Net
		        If g_bDotNet Then
		            EnableParameter Not g_ReadOnlyMode
		            idSingleParameter.style.display = ""
		        Else
		            idSingleParameter.style.display = "none"
		        End If
		        idPropertyParameter.style.display = "none"
		Case 2 'sigStringLongString
			EnableParameter Not g_ReadOnlyMode
			idSingleParameter.style.display = ""
			idPropertyParameter.style.display = "none"
		Case 3, 5 'sigProperty, signatureContextProperties
			EnableProperties Not g_ReadOnlyMode
			idSingleParameter.style.display = "none"
			idPropertyParameter.style.display = ""
		Case Else
			idSingleParameter.style.display = "none"
			idPropertyParameter.style.display = "none"
	End Select
End Sub

Sub EnableParameter(bEnabled)
	With idParameter
   		.disabled = Not bEnabled
	   	If bEnabled Then 
   			.style.backgroundcolor = ""
		Else
    		.style.backgroundcolor = "#F0F0F0"
		End If
	End With
End Sub

Sub EnableProperties(bEnabled)
   	If bEnabled Then 
		flexEDKbdMouse = 2
   		idGrid.Editable = flexEDKbdMouse
	Else
		flexEDNone = 0
		idGrid.Editable = flexEDNone
	End If
End Sub

Sub EnableEdit(bEnabled)
	If g_ReadOnlyMode Then bEnabled = False
   	idJavaName.disabled = Not bEnabled
   	idJavaMethod.disabled = Not bEnabled
   	If bEnabled Then
		Dim oMethod
	    Set oMethod = GetSelectedMethod()
		If  oMethod Is Nothing Then
   			' hide parameters edit box and property grid
   			UpdateParameterControl sigNoParameter
		Else
			UpdateParameterControl oMethod.SignatureType
		End If
   	Else
	   	EnableParameter False
   		EnableProperties False
	End If
End Sub


Sub LoadPageProperties()
	'Disable all controls until initilize finish
	EnableEdit False

	flexAlignLeftCenter	= 1
	flexAlignCenterCenter = 4
	flexDTBoolean = 11

	nColIndex = 0

	idGrid.Rows = 1
	idGrid.Cols = 2
	idGrid.ColAlignment(-1) = flexAlignLeftCenter
	'All titles set to flexAlignCenterCenter
	idGrid.FixedAlignment(-1) = flexAlignCenterCenter

	'idGrid.ColWidth(nColIndex) = LoadColWidth(nColIndex)
	idGrid.ColWidth(nColIndex) = 3500
	idGrid.Cell(0, 0, nColIndex) = "Property Name"
	nColIndex = nColIndex + 1
	'FlexGrid1.ColWidth(nColIndex) = LoadColWidth(nColIndex)
	idGrid.ColWidth(nColIndex) = 3500
	idGrid.Cell(0, 0, nColIndex) = "Property Value"

	Set g_JAMethods = Nothing

	Set g_Action = window.external.GetValue("Action")
	Set g_JavaActionMgr = Nothing
	Set g_Empty = Nothing
	g_DeclAddingMode = False

	On Error Resume Next

	Set g_JavaActionMgr = g_Action.Property("JavaActionMgr")
	Set g_RuleView = window.external.GetValue("RuleView")
	If g_JavaActionMgr Is Nothing Then
		g_ReadOnlyMode = True
		Exit Sub
	End If
	
	On Error Goto 0
	
	If Not g_bDotNet And Not g_JavaActionMgr.IsJavaInstalled Then
		g_ReadOnlyMode = True
	End If

	g_strSrcClassName = g_Action.GetParamValue("ec_Class")
	g_strSrcVarName	  = g_Action.GetParamValue("ec_Variable")	

	If g_strSrcClassName = "" Then 
		g_NewActionMode = True
	Else 
		g_NewActionMode = False
	End If

	idParameter.value = g_Action.GetParamValue("ec_Config")

	On Error Resume Next
	strPropertiesString = g_Action.GetParamValue("ec_Properties")
	On Error Goto 0
	g_arrProperty = Split(strPropertiesString, ":")
	For I = LBound(g_arrProperty) To UBound(g_arrProperty) Step 2
		nRowIndex = idGrid.Rows
		idGrid.Rows = nRowIndex + 1
		idGrid.TextMatrix(nRowIndex, 0) = g_arrProperty(I)
		If I <> UBound(g_arrProperty) Then
			idGrid.TextMatrix(nRowIndex, 1) = g_arrProperty(I + 1)
		End If
	Next
	AddNewPropertyString
	If g_bDotNet Then
		PageTitle.innerHTML = ".NET Function"
	Else
		PageTitle.innerHTML = "Java Function"
	End If

	g_InitFinished = False
	If Not g_ReadOnlyMode Then
		FillJAName "", ""
	ElseIf Not g_NewActionMode Then
		Set oOption = document.createElement("OPTION")
		oOption.value = -1
		If Len(g_strSrcVarName) > 0 Then
			oOption.text = g_strSrcVarName & " - " & g_strSrcClassName
		Else
			oOption.text = g_strSrcClassName
		End If
		idJavaName.add(oOption)

		Set oOption = document.createElement("OPTION")
		oOption.value = -1
		strMethodName = g_Action.GetParamValue("ec_Method")
		oOption.text = strMethodName
		idJavaMethod.add(oOption)
		UpdateParameterControlInReadOnlyMode
	End If
	g_InitFinished = True

	EnableEdit True
End Sub

Function GetSelectedJA()
	Dim oOption

	Set GetSelectedJA = Nothing
	'If g_ReadOnlyMode Then Exit Function
	If 0 = idJavaName.options.length Then Exit Function
	If idJavaName.selectedIndex < 0 Then Exit Function

	Set oOption = idJavaName.options(idJavaName.selectedIndex)
	Set GetSelectedJA = g_JADeclarations(CInt(oOption.value))
End Function

Function IsJATheSame(oJA, ClassName, VarName)
	IsJATheSame = False
	If oJA Is Nothing Then Exit Function
	If oJA.ClassName = ClassName And oJA.VarName = VarName Then 
		IsJATheSame = True 
	End If
End Function

Function GetSelectedMethod()
	Set GetSelectedMethod = Nothing
	If idJavaMethod.selectedIndex < 0 Then Exit Function
	Dim oOption

	Set oOption = idJavaMethod.options(idJavaMethod.selectedIndex)
	If 0 > oOption.value Then Exit Function
    Set GetSelectedMethod = g_JAMethods(CInt(oOption.value))
End Function

Function GetSelectedDeclaration()
	Set GetSelectedDeclaration = Nothing
	If idJavaName.selectedIndex < 0 Then Exit Function
	Dim oOption
	
	Set oOption = idJavaName.options(idJavaName.selectedIndex)
	If 0 > oOption.value Then Exit Function
	Set GetSelectedDeclaration = g_JADeclarations(CInt(oOption.value))
End Function

Sub FillJAName(ClassName, VarName)
	Dim oJA
	Dim I
	Dim JACount
	Dim oOption
	Dim selectedIndex
	Dim NothingSelected
	'Index of item matched to parameter ClassName, VarName
	selectedIndex = -1
	'Index of item matched to parameter g_strSrcClassName, s_strSrcVarName
	RepSelectedIndex = -1

	If g_ReadOnlyMode Then Exit Sub

	For I = idJavaName.options.length To 1 Step - 1
		idJavaName.options.remove 0
	Next

	Set g_JADeclarations = Nothing
	
	If g_bDotNet Then
		Set g_JADeclarations = g_JavaActionMgr.DeclaredNetActions(g_Empty)
	Else
		Set g_JADeclarations = g_JavaActionMgr.DeclaredJavaActions(g_Empty)
	End If

	LastJAIdx = g_JADeclarations.Count - 1

	For I = 0 To LastJAIdx
		Set oJA = g_JADeclarations(I)
		Set oOption = document.createElement("OPTION")
		oOption.value = I

		If Len(oJA.VarName) > 0 Then
			oOption.text = oJA.VarName & " - " & oJA.ClassName
		Else
			oOption.text = oJA.ClassName
		End If

		If IsJATheSame(oJA, ClassName, VarName) Then selectedIndex = I
		If IsJATheSame(oJA, g_strSrcClassName, g_strSrcVarName) Then RepSelectedIndex = I

		idJavaName.add(oOption)
	Next

	If g_DeclAddingMode Then
		selectedIndex = LastJAIdx
		g_DeclAddingMode = False
	End If

	NothingSelected = False
	If selectedIndex = -1 Then
		If RepSelectedIndex = -1 Then
			NothingSelected = True
		Else
			selectedIndex = RepSelectedIndex
		End If
	End If

	If NothingSelected = True Then
		idJavaName.selectedIndex = -1
	Else
		idJavaName.selectedIndex = selectedIndex
		idJavaName_OnChange
	End If
End Sub

Sub FillJAMethods()
	Dim oJA
	Dim oMethod
	Dim I
	Dim Count
	Dim oOption
	Dim selectedIndex


	SetDirty(g_InitFinished)

	For I = idJavaMethod.options.length To 1 Step - 1
		idJavaMethod.options.remove 0
	Next

	Set oJA = GetSelectedJA
	If oJA Is Nothing Then Exit Sub

	Set g_JAMethods = Nothing

	On Error Resume Next
	Set g_JAMethods = oJA.Methods
	If Err Then
		If Not g_InitFinished And Not g_NewActionMode Then
			strMethodName = g_Action.GetParamValue("ec_Method")

			Set oOption = document.createElement("OPTION")
			oOption.value = -1

			If g_strSrcVarName = "" Then
				oOption.text = "static " & strMethodName
			Else
				oOption.text = strMethodName
			End If

			idJavaMethod.add(oOption)
			strErrorMessage = Err.Description & vbCrLf & "Node handler modification is locked."
			window.external.messagebox strErrorMessage, "Error", vbCritical
			g_ReadOnlyMode = True
		End If
		On Error Goto 0
		'Ignore classes without mappable methods
		Exit Sub
	End If
	On Error Goto 0

	Count = g_JAMethods.Count - 1
	selectedIndex = -1

	CurSignature = g_Action.GetParamValue("ec_Method")
	For I = 0 To Count
		Set oMethod = g_JAMethods(I)
		Set oOption = document.createElement("OPTION")
		oOption.value = I

		If oMethod.IsStatic Then
			oOption.text = "static " & oMethod.Signature
		Else
			oOption.text = oMethod.Signature
		End If

		If g_bDotNet Then
			sig = oMethod.Signature
			pos = InStr(sig, CurSignature)
			If pos = 1 Then
				leng = Len(CurSignature)
				bracket = Mid(sig, leng + 1, 1)
				If bracket = "(" Then
					selectedIndex = idJavaMethod.options.length
				End If
			End If
	    ElseIf oMethod.Signature = CurSignature Then
		   selectedIndex = idJavaMethod.options.length
		End If

		idJavaMethod.add(oOption)
	Next

	If IsJATheSame(oJA, g_strSrcClassName, g_strSrcVarName) Then
		idJavaMethod.selectedIndex = selectedIndex
	Else
		idJavaMethod.selectedIndex = -1
	End If

	idJavaMethod_OnChange
End Sub

Sub OnJavaMethodChange()
	If g_ReadOnlyMode Then Exit Sub
	Dim oMethod
    Set oMethod = GetSelectedMethod()
	If oMethod Is Nothing Then
		UpdateParameterControl sigNoParameter
		Exit Sub
	End If

	SetDirty(g_InitFinished)
	UpdateParameterControl oMethod.SignatureType
End Sub

Sub JAWorkspace_OnWorkspaceChanged
	RefreshJAList
End Sub

Sub RefreshJAList
	If g_ReadOnlyMode Then Exit Sub

	Dim oJADeclaration
	Dim oMethod

	Dim ClassName
	Dim VarName
	Dim Signature

	ClassName = ""
	VarName = ""
	Signature = ""

    Set oMethod = GetSelectedMethod()
	If Not oMethod Is Nothing Then 
		Signature = oMethod.Signature
		Set oMethod = Nothing
	End If

	Set oJADeclaration = GetSelectedJA()
	If Not oJADeclaration Is Nothing Then
		VarName = oJADeclaration.VarName
		ClassName = oJADeclaration.ClassName
		Set oJADeclaration = Nothing
	End If
	FillJAName ClassName, VarName

	Set oJADeclaration = GetSelectedJA()
	If IsJATheSame(oJADeclaration, ClassName, VarName) And Signature <> "" Then
		For I = idJavaMethod.options.length - 1 To 0 Step - 1
			Set oMethod = g_JAMethods(CInt(idJavaMethod.options(I).value))
			If Not oMethod Is Nothing And oMethod.Signature = Signature Then
				idJavaMethod.selectedIndex = I
				Exit For
			End If
		Next
	End If

End Sub

Sub ExternalCmdCalls()
	Dim oOption
	Dim oJADeclaration
	Dim oMethod

	Dim Command
	Dim ParamObj

	Set ParamObj = window.external.MethodParams
	ParamObj.ReturnValue = 1

	Command = ParamObj.Method
	If (Command = "OnApply") Then

		If g_ReadOnlyMode Then
			Exit Sub
		End If

		ConfirmRet = Confirm
		If ConfirmRet = 0 Then
			If g_NewActionMode Then 
				ParamObj.ReturnValue = -1
			Else
				FillJAName "", ""
				ParamObj.ReturnValue = -1
			End If
			Exit Sub
		End If
		
		Set oJADeclaration = GetSelectedDeclaration
		Set oMethod = GetSelectedMethod

		On Error Resume Next
		If g_strSrcVarName = "" Then
			'Declaration updates before handler
			g_JavaActionMgr.AddDeclaration g_Empty, g_strSrcClassName, "", g_bDotNet
			g_JavaActionMgr.Update g_bDotNet
		End If
		g_Action.SetParamValue "ec_Properties", GetPropertiesString()
		On Error Goto 0

		If oJADeclaration Is Nothing Then
			g_strSrcClassName = ""
			g_strSrcVarName	  = ""
		Else
			g_strSrcClassName = oJADeclaration.ClassName
			g_strSrcVarName	  = oJADeclaration.VarName
		End If

		g_Action.SetParamValue "ec_Class", g_strSrcClassName
		g_Action.SetParamValue "ec_Variable", g_strSrcVarName

		if oMethod Is Nothing Then
			g_Action.SetParamValue "ec_Method", ""
		Else
			If g_bDotNet Then
				g_Action.SetParamValue "ec_Method", oMethod.Name
			Else
				g_Action.SetParamValue "ec_Method", oMethod.Signature
			End If

		End If	

		g_Action.SetParamValue "ec_Config", idParameter.value

		g_NewActionMode = False

		ParamObj.ReturnValue = ConfirmRet
	ElseIf (Command = "GetMethod") Then
		Set oMethod = GetSelectedMethod
		ParamObj.ReturnValue = oMethod
	ElseIf (Command = "RefreshActions") Then
		RefreshJAList
	ElseIf (Command = "DisableEditing") Then
		EnableEdit False
	ElseIf (Command = "EnableEditing") Then
		EnableEdit True
	End If

End Sub

Sub AddNewPropertyString
	nRowIndex = idGrid.Rows
	idGrid.Rows = nRowIndex + 1
	idGrid.TextMatrix(nRowIndex, 0) = "Click here to add a new property."
	idGrid.Cell(flexcpForeColor, nRowIndex, 0) = clrInfoRow
End Sub

Sub idGrid_StartEdit(Row, Col, Cancel)
	If Row = idGrid.Rows - 1 Then
		' Setup default color
		idGrid.Cell(flexcpForeColor, Row, 0) = 0
		idGrid.TextMatrix(Row, 0) = ""
		AddNewPropertyString
	End If
	SetDirty(True)
End Sub

Sub idGrid_AfterEdit(Row, Col)
	If idGrid.TextMatrix(Row, 0) = "" And idGrid.TextMatrix(Row, 1) = "" Then
		idGrid.RemoveItem Row
	End If
	SetDirty(True)
End Sub

Sub idGrid_MouseDown(Button, Shift, X, Y)
	If g_ReadOnlyMode Then Exit Sub
	idGrid.EditCell
End Sub

Sub idGrid_OnKeyDown(Evnt)
	If idGrid.EditWindow = 0 And Evnt.KeyCode = 46 Then
		' User press delete
		If idGrid.Row > 0 And idGrid.Row < idGrid.Rows - 1 Then
			Evnt.returnValue = False
			idGrid.RemoveItem idGrid.Row
			SetDirty(True)
		End If
	End If
End Sub

Sub idGrid_OnMouseMove()
	If Not g_bFGTooltipEnabled Then
		'Initilaize tooltips for flex grid when grid already show
		Set FGHelper = CreateObject("FlexGridTools.ECFlexGridToolTip")
		Set FG = idGrid
		FGHelper.Initialize FG
		g_bFGTooltipEnabled = True
	End If
End Sub

Function GetPropertiesString()
	Dim strRes
	nRows = idGrid.Rows - 2
	If nRows >= 1 Then
		strRes = idGrid.TextMatrix(1, 0) & ":" & idGrid.TextMatrix(1, 1)
		For I = 2 To nRows
			strRes = strRes & ":" & idGrid.TextMatrix(I, 0) & ":" & idGrid.TextMatrix(I, 1)
		Next
	End If
	GetPropertiesString = strRes
End Function

Sub idParameter_OnChange
	SetDirty(True)
End Sub

' IE 7.0 beta doesn't fire OnChange event if user pressed button
Sub idParameter_OnKeyDown
	SetDirty(True)
End Sub

Sub idParameter_OnCut
	SetDirty(True)
End Sub

Sub idParameter_OnPaste
	SetDirty(True)
End Sub
```

### Java/minus.gif

_Binary or non-text file; content skipped._

### Java/NetClassesDeclaration.htm

```htm
<script language="VBScript">

Dim g_JavaActionMgr
Dim g_JAMgrAdapter
Dim g_Action
Dim g_Empty
Dim g_RuleView
Dim g_ReadOnlyMode
Dim g_nSupressColumn

Dim g_GridColWidth
g_GridColWidth = Array(1650, 1440, 1750, 1440)

Dim g_bKeyPressed
g_bKeyPressed = False

Const DIALOG_TITLE = "SpecBuilder"
Const Grid_ColWidthPropertyPrefix = "DeclarationColWidth"

Function IsNullOrNothing(val)
	If IsNull(val) Then
		IsNullOrNothing = True
	ElseIf val Is Nothing Then 
		IsNullOrNothing = True
	Else
		IsNullOrNothing = False
	End If		
End Function

Sub EnableInput(oInput, bEnabled)
	oInput.disabled = Not bEnabled
	If bEnabled Then 
		oInput.style.backgroundcolor = ""
	Else
		idParameter.style.backgroundcolor = "#F0F0F0"
	End If
End Sub

Sub Document_OnReadyStateChange()
	if document.readystate = "complete" then
		Initilaize()
		idGrid.Focus()
		window.scroll 0, 0
	end if
End Sub

Sub Initilaize()
	BtnNew.disabled = True
	BtnModify.disabled = True
	BtnRemove.disabled = True

	Set g_JavaActionMgr = Nothing
	Set g_RuleView = Nothing
	Set g_Empty = Nothing
	On Error Resume Next

	Set g_Action = window.external.GetValue("Action")
	g_Action.Update

	Set g_JavaActionMgr = g_Action.Property("JavaActionMgr")
	Set g_RuleView = window.external.GetValue("RuleView")
	If IsNullOrNothing(g_JavaActionMgr) Then
		window.external.messagebox "Internal Error. Please, contact support.", "Error", vbCritical
		g_ReadOnlyMode = True
		Exit Sub
	End If

	g_ReadOnlyMode = False
	g_ReadOnlyMode = window.external.GetValue("ReadOnly") Or g_Action.ReadOnly

	On Error Goto 0
	
	SetupGrid()

	FillGrid

	BtnNew.disabled = g_ReadOnlyMode
End Sub

Function LoadColWidth(nColIndex)
	PropName = Grid_ColWidthPropertyPrefix & nColIndex
	DefValue = g_GridColWidth(nColIndex)
	LoadColWidth = g_JavaActionMgr.GetPersistentProperty(PropName, DefValue)
End Function

Sub SaveColWidth(nColIndex)
	PropName = Grid_ColWidthPropertyPrefix & nColIndex
	PropValue = idGrid.ColWidth(nColIndex)
	g_JavaActionMgr.PutPersistentProperty PropName, PropValue
End Sub 

Function GetParentWindow
	If IsNullOrNothing(g_RuleView) Then
		GetParentWindow = 0
	Else
		GetParentWindow = g_RuleView.Window
	End If
End Function

Sub RefreshView
	If IsNullOrNothing(g_RuleView) Then 
		window.external.NotifyHost "RefreshView", 0
	Else
		g_RuleView.RefreshView
	End If
End Sub

Sub UpdateDeclaration(NewValue)
	If NewValue = True Then
		g_JavaActionMgr.Update(True)
	End if
End Sub

Sub SetupGrid
	flexAlignCenterCenter = 4
	flexDTBoolean = 11

	nColIndex = 0

	idGrid.Rows = 1
	idGrid.Cols = 4
	'All titles set to flexAlignCenterCenter
	idGrid.FixedAlignment(-1) = flexAlignCenterCenter

	idGrid.ColWidth(nColIndex) = LoadColWidth(nColIndex)
	idGrid.Cell(0, 0, nColIndex) = ".NET Class Name"

	nColIndex = nColIndex + 1
	idGrid.ColWidth(nColIndex) = LoadColWidth(nColIndex)
	idGrid.Cell(0, 0, nColIndex) = "Variable Name"

	nColIndex = nColIndex + 1
	'Suppression column is check-box
	g_nSupressColumn = nColIndex
	idGrid.ColWidth(nColIndex) = LoadColWidth(nColIndex)
	idGrid.Cell(0, 0, nColIndex) = "Disable Usage"
	idGrid.ColDataType(nColIndex) = flexDTBoolean

	nColIndex = nColIndex + 1
	idGrid.ColWidth(nColIndex) = LoadColWidth(nColIndex)
	idGrid.Cell(0, 0, nColIndex) = "DLL file location"

	'Initilaize tooltips
	Set FGHelper = CreateObject("FlexGridTools.ECFlexGridToolTip")
	Set FG = idGrid
	FGHelper.Initialize FG

End Sub

Sub FillGrid
	Dim JADeclarations
	Dim JA
	Dim I
	Dim JACount

	On Error Resume Next
	Set JADeclarations = g_JavaActionMgr.DeclaredNetActions(g_Empty)
	If Err Then
		window.external.messagebox Err.Description, "Error", vbCritical
		g_ReadOnlyMode = True				
		Exit Sub
	End If
	On Error Goto 0

	JACount = JADeclarations.Count
	idGrid.Rows = JACount + 1

	On Error Resume Next
	For I = 1 To JACount
		Set JA = JADeclarations(I - 1)

		idGrid.TextMatrix(I, 0) = JA.ClassName
		idGrid.TextMatrix(I, 1) = JA.VarName
		idGrid.TextMatrix(I, g_nSupressColumn) = JA.Disabled
		idGrid.TextMatrix(I, g_nSupressColumn + 1) = JA.JARLocation
		idGrid.RowData(I) = JA
	Next
	On Error Goto 0
	' Check if last row was removed
	If idGrid.Row < 0 And idGrid.Rows > 1 Then idGrid.Row = idGrid.Rows - 1
	'Show description for first item
	idGrid_SelChange

End Sub

Sub idGrid_SelChange
	ActionDescription.InnerHTML = ""
	'Documentation tell about -1 value if no selection, but really return -2
	If idGrid.Row < 0 Then
		BtnModify.Disabled = True
		BtnRemove.Disabled = True
		Exit Sub
	End If

	BtnModify.Disabled = g_ReadOnlyMode
	BtnRemove.Disabled = g_ReadOnlyMode

	'Select single row only
	idGrid.Row = idGrid.RowSel
	Dim JA
	'On Error Resume Next
	If IsEmpty(idGrid.RowData(idGrid.Row)) Then Exit Sub
	Set JA = idGrid.RowData(idGrid.Row)
	ActionDescription.InnerHTML = Replace(JA.Description, vbCr, "<br/>")
End Sub

Sub idGrid_BeforeRowColChange(ByVal OldRow, ByVal OldCol, ByVal NewRow, ByVal NewCol, ByRef Cancel)
	'Only suppression can be edited
	If g_ReadOnlyMode Then Exit Sub
	If NewCol = g_nSupressColumn Then
		flexEDKbdMouse = 2
		idGrid.Editable = flexEDKbdMouse
	Else
		flexEDNone = 0
		idGrid.Editable = flexEDNone
	End If
End Sub

Sub idGrid_AfterEdit(Row, Col)
	Dim JA
	If Not g_bKeyPressed Then
		Set JA = idGrid.RowData(Row)
		idGrid.TextMatrix(Row, g_nSupressColumn) = JA.Disabled
	ElseIf Col = g_nSupressColumn Then
		Set JA = idGrid.RowData(Row)
		JA.Disabled = idGrid.TextMatrix(Row, g_nSupressColumn)
		UpdateDeclaration(True)
	End If
End Sub

Sub idGrid_KeyDown(KeyCode, Shift)
	g_bKeyPressed = True
End Sub

Sub idGrid_KeyUp(KeyCode, Shift)
	g_bKeyPressed = False
End Sub

Sub idGrid_MouseDown(Button, Shift, X, Y)
	Dim JA
	Dim Row
	Dim Disabled
	If g_ReadOnlyMode Then Exit Sub
	Row = idGrid.MouseRow
	If Row < 1 Then Exit Sub
	' User can click any button on mouse
	'If Button <> 1 Then Exit Sub
	If Shift <> 0 Then Exit Sub
	If idGrid.MouseCol = g_nSupressColumn Then
		Set JA = idGrid.RowData(Row)
		Disabled = Not idGrid.TextMatrix(Row, g_nSupressColumn)
		idGrid.TextMatrix(Row, g_nSupressColumn) = Disabled
		JA.Disabled = Disabled
		UpdateDeclaration(True)
	End If
End Sub

Sub idGrid_AfterUserResize(Row, Col)
	If -1 <> Col Then 
		For I = 0 To idGrid.Cols - 1
			SaveColWidth I
		Next
	End If
End Sub

Sub AddJADeclaration
	On Error Resume Next
	Success = g_JavaActionMgr.AddJavaActionDlg(g_Empty, GetParentWindow(), True)
	If Err Then
		window.external.messagebox Err.Description, "Error", vbCritical
		On Error Goto 0
		Exit Sub
	End If
	On Error Goto 0
	If Success Then
		UpdateDeclaration(True)
		FillGrid
		RefreshView
	End If
End Sub

Sub ModifyJADeclaration
	'Return if no selection
	If idGrid.Row < 0 Then Exit Sub
	'Return if no JA value
	If IsEmpty(idGrid.RowData(idGrid.Row)) Then Exit Sub
	Set JA = idGrid.RowData(idGrid.Row)
	'If Err Then Exit Sub
	JA.ModifyDlg GetParentWindow()
	ActionDescription.InnerHTML = Replace(JA.Description, vbCr, "<br/>")
	UpdateDeclaration(True)
End Sub

Sub RemoveJADeclaration
	'Return if no selection
	If idGrid.Row < 0 Then Exit Sub
	'Return if no JA value
	If IsEmpty(idGrid.RowData(idGrid.Row)) Then Exit Sub
	Set JA = idGrid.RowData(idGrid.Row)
	strErrorMsg = "You have chosen to delete .NET class declaration for: " & JA.ClassName & vbCrLf & vbCrLf & _
				  "This will also make invalid all functions where this .NET class methods are used." & vbCrLf & vbCrLf & _
  				  "Are you sure you want to continue?"

	If vbYes = window.external.messagebox(strErrorMsg, "Confirmation", vbQuestion + vbYesNo + vbDefaultButton2) Then
		JA.Remove
		UpdateDeclaration(True)
		FillGrid
		RefreshView
		idGrid.Focus()
	End If
End Sub

Function ExternalCmdCalls()

	Dim Command
	Dim ParamObj

	Set ParamObj = window.external.MethodParams
	Command = ParamObj.Method
	ParamObj.ReturnValue = 1

	If (Command = "OnApply") Then
		g_Action.SetParamValue "ec_Declaration", g_JavaActionMgr.DeclarationValue(g_Empty, True)
		ParamObj.ReturnValue = 1
	ElseIf (Command = "RefreshActions") Then
		FillGrid
	End If

End Function

</script>

<html>
	<HEAD>
		<TITLE></TITLE>
	</HEAD>
<style>
	html,body {	overflow-y:auto;}
	td {font: 8pt verdana;}
	#idGrid {font: 8pt verdana;}
</style>

	<BODY topmargin="0" leftmargin="0" ondrop="CheckForChange" BGCOLOR="WHITE">
		<TABLE border="0" width="100%" cellspacing="0" cellpadding="10">
			<TR>
				<TD colspan="2" width="100%" BGCOLOR="#c0c0c0"><BIG>.NET Classes Declaration</BIG></TD>
			</TR>
			<TR>
				<TD width="80%" BGCOLOR="WHITE">
					<OBJECT CLASSID="clsid:5220cb21-c88d-11cf-b347-00aa00a28331">
						<PARAM NAME="LPKPath" VALUE="../../../vsFlex8n.lpk">
					</OBJECT>				
					<OBJECT id="idGrid"	tabIndex="10" height="212" width="100%" classid="clsid:74233db3-f72f-44ea-94dc-258a624037e6">
						<PARAM NAME="BackColorBkg" VALUE="16777215">
						<PARAM NAME="AllowSelection" VALUE="-1">
						<PARAM NAME="AllowBigSelection" VALUE="-1">
						<PARAM NAME="AllowUserResizing" VALUE="1">
						<PARAM NAME="SelectionMode" VALUE="1">
						<PARAM NAME="Rows" VALUE="1">
						<PARAM NAME="Cols" VALUE="4">
						<PARAM NAME="FixedRows" VALUE="1">
						<PARAM NAME="FixedCols" VALUE="0">
						<PARAM NAME="ScrollBars" VALUE="3">
					</OBJECT>
				</TD>
				<TD width="20%" BGCOLOR="WHITE" align="center" valign="top">
					<INPUT TYPE="button" VALUE="New..." NAME="BtnNew" onClick="AddJADeclaration" style="width:100px"><BR>
					<BR>
					<INPUT TYPE="button" VALUE="Modify..." NAME="BtnModify" onClick="ModifyJADeclaration" style="width:100px"><BR>
					<BR>
					<INPUT TYPE="button" VALUE="Remove..." NAME="BtnRemove" onClick="RemoveJADeclaration" style="width:100px"><BR>
					<BR>
				</TD>
			</TR>
		</TABLE>
		<TABLE border="0" width="100%" cellspacing="3" cellpadding="0">
			<TR>
				<TD width="80px"><FONT COLOR="#0033CC">&nbsp;Description</FONT></TD>
				<TD><HR SIZE="1"></TD>
			</TR>
		</TABLE>
		<TABLE border="0" width="100%" cellspacing="3" cellpadding="0">
			<TR>
				<TD width="10px">&nbsp</TD>
				<TD>
					<BR>
					<DIV id="ActionDescription">
						Sample decription
					</DIV>
				</TD>
			</TR>
		</TABLE>
	</BODY>
</html>
```

### Java/OnUserNodeJava.htm

```htm
<script language="VBScript" src="JavaHandlerCommon.vbs"></script>
<script type="text/javascript" src="OnUserNodeJava.js"></script>
<script language="VBScript">
'Option Explicit

Sub InitializeDocument()
	g_bDotNet = False
	BtnNew.disabled = True
	g_ReadOnlyMode = window.external.GetValue("ReadOnly")
	g_MethodChangedForDoc = True
	Set g_RuleView = window.external.GetValue("RuleView")
	' Source view should be hidden after completion of loading
	' Becuse CMax control is created by demand
	HideInfoSection

	LoadPageProperties()
	BtnNew.disabled = g_ReadOnlyMode
	CodeMaxEditor.ReadOnly = True
	' Declaration expand button is shown with border like it has focus
	' Remove misleaded border explicitly
	DeclarationImg.className = "ExpandButton"
	If Not g_ReadOnlyMode Then
		ExpandDeclaration()
		idJavaName.Focus()
		window.scroll 0, 0
	End If

End Sub

Sub idJavaName_OnChange
	Dim DocLocation
	Dim SourceLocation

	FillJAMethods

	Set oJA = GetSelectedJA()
	If oJA Is Nothing Then 
		CodeMaxEditor.Text = ""
		HideInfoSection
		Exit Sub
	End If

	DocLocation = oJA.DocLocation
	SourceLocation = oJA.SourceLocation

	If SourceLocation = "" And DocLocation = "" Then
		HideInfoSection
	Else
		ShowInfoSection
		If SourceLocation <> "" And DocLocation <> "" Then
			FakeInfoTab.style.display = "none"
			SourceTab.style.display = ""
			DocumentationTab.style.display = ""
		Else
			' At least on tab will be hidden
			FakeInfoTab.style.display = ""
		End If

		If SourceLocation <> "" Then
			SwitchToSource
			CodeMaxEditor.OpenFile SourceLocation
			ShowSelectedMethod
		Else
			CodeMaxEditor.Text = ""
			SourceTab.style.display = "none"
			SwitchToDocumentation
		End If

		If DocLocation <> "" Then
			document.all.IFrameDoc.Src = DocLocation
	   	Else
			DocumentationTab.style.display = "none"
		End If
	End If

End Sub

Sub idJavaMethod_OnChange
	OnJavaMethodChange
	ShowSelectedMethod
End Sub

Sub ShowSelectedMethod
	Dim oMethod
    Set oMethod = GetSelectedMethod()
	If oMethod Is Nothing Then Exit Sub
	If SourceTab.style.display <> "none" Then
		CodeMaxEditor.ShowMethod oMethod.Declaration.ClassName, oMethod.Signature, False
	End If

	If Documentation.style.display = "none" Then
		g_MethodChangedForDoc = True
	Else
		DocLocation = oMethod.DocLocation
		document.all.IFrameDoc.Src = DocLocation
	End If
End Sub

Sub AddJADeclaration
	Dim Success
	On Error Resume Next
	Success = g_JavaActionMgr.AddJavaActionDlg(g_Empty, g_RuleView.Window, False)
	If Err Then
		window.external.messagebox Err.Description, "Error", vbCritical
		On Error Goto 0
		Exit Sub
	End If
	On Error Goto 0
	If Success Then
		g_JavaActionMgr.Update False
		g_DeclAddingMode = True
		RefreshJAList
		g_RuleView.RefreshView
	End If
End Sub

Function Confirm()
	Confirm = 1
End Function

Function ExpandOnFocus
	window.event.srcElement.className = "ExpandButtonFocus"
	ExpandOnFocus = True
End Function

Function ExpandOnBlur
	window.event.srcElement.className = "ExpandButton"
	ExpandOnBlur = True
End Function

Function ExpandCollapse(sectionName)
	Dim SectionStyle

	Set SectionStyle = document.all.item(sectionName).style

	If SectionStyle.display <> "none" Then
		SectionStyle.display = "none"
		window.event.srcElement.src = "plus.gif"
	Else
		SectionStyle.display = ""
		window.event.srcElement.src = "minus.gif"
	End If
End Function

Sub ExpandDeclaration
	Dim SectionStyle
	Set SectionStyle = Declaration.style

	If SectionStyle.display = "none" Then
		SectionStyle.display = ""
		DeclarationImg.src = "minus.gif"
	End If
End Sub

Sub SwitchToSource
	DocumentationTab.className = "Tab"
	SourceTab.className = "TabCurrent"

	InfoImg.src = "minus.gif"
	Info.style.display = ""
	Documentation.style.display = "none"
	Source.style.display = ""
End Sub

Sub SwitchToDocumentation
	Dim oMethod
	Dim oAction
	SourceTab.className = "Tab"
	DocumentationTab.className = "TabCurrent"

	InfoImg.src = "minus.gif"
	Info.style.display = ""
	Source.style.display = "none"
	Documentation.style.display = ""

	If g_MethodChangedForDoc Then
    	Set oMethod = GetSelectedMethod()
		If oMethod Is Nothing Then
			Set oAction = GetSelectedJA()
			DocLocation = oAction.DocLocation
		Else
			DocLocation = oMethod.DocLocation
		End If
		document.all.IFrameDoc.Src = DocLocation
		g_MethodChangedForDoc = False
	End If
End Sub

Sub HideInfoSection
 	InfoHead.style.display = "none"
 	Info.style.display = "none"
 	InfoBottom.style.display = "none"
End Sub

Sub ShowInfoSection
 	InfoHead.style.display = ""
 	Info.style.display = ""
 	InfoBottom.style.display = ""
End Sub

Sub Document_OnKeyDown
	EnterKeyCode = 13
	If window.event.keycode = EnterKeyCode Then
		Set SrcEl = window.event.srcElement
		If StrComp(SrcEl.tagName, "img", vbTextCompare) = 0 Then SrcEl.click
		If SrcEl.id = "SourceTab" Or SrcEl.id = "DocumentationTab" Then SrcEl.click
	End If
End Sub

Function SetDirty(NewValue)
	If g_ReadOnly Then Exit Function
	If NewValue = True Then
		g_RuleView.Dirty = 1
	End If
End Function

</script>

<html>
	<head>
		<title></title>
	</head>

<style>
	html,body {	overflow-y:auto;}
	body 	{background-color: white; color: black;}
	td		{font: 8pt verdana;}
	#PageTitle	{background-color: #c0c0c0; font: 12pt verdana; padding: 10px;}
	.HelpText	{color: #0033cc;}
	.ExpandButton {border: white 2px solid; cursor: hand}
	.ExpandButtonFocus {border: black 2px solid; cursor: hand}
	.TabHead
	{
		background-color: white;
		border-bottom: black 1px solid;
		padding: 5px;
	}
	.TabCurrent
	{
		border-top: black 1px solid;
		border-left: black 1px solid;
		border-right: black 1px solid;
		padding: 5px;
	}
	.Tab
	{
		border-top: silver 1px solid;
		border-left: silver 1px solid;
		border-right: silver 1px solid;
		border-bottom: black 1px solid;
		padding: 5px;
		cursor: hand;
	}
	.TabBody
	{
		border-left: black 1px solid;
		border-right: black 1px solid;
	}
	.TabBottom
	{
		border-left: black 1px solid;
		border-right: black 1px solid;
		border-bottom: black 1px solid;
		padding: 0px;
	}
</style>
</head>
<body topmargin="0" leftmargin="0" onLoad="" bgcolor="white">
	<table border="0" width="100%" cellspacing="0" cellpadding="0" style="height: 100%">
		<tr>
			<td colspan="4" id="PageTitle">Java</td>
		</tr>
		<tr>
			<td colspan="4"><img height="3px"></td>
		</tr>
		<tr>
			<td width="1%" class="TabHead">
				<img id="DeclarationImg"  src="minus.gif" alt="Expand/Collapse" tabindex="10" class="ExpandButton" 
				     onclick="ExpandCollapse('Declaration')" 
				     onfocus="Call ExpandOnFocus" 
				     onblur="Call ExpandOnBlur">&nbsp;</td>
			<td width="10%" class="TabCurrent">&nbsp;Declaration&nbsp;</td>
			<td width="100%" colspan="2" class="TabHead">&nbsp;</td>
		</tr>
		<tr id="Declaration">
			<td colspan="4" class="TabBody">
				<table border="0" width="100%" cellspacing="0" cellpadding="5px">
					<tr>
						<td width="20%" align="left">Class:&nbsp;</td>
						<td width="80%" align="left">
							<select tabindex="10" style="width:100%" name="idJavaName">
							</select>
						</td>
						<td width="5%" align="left">
							<input tabindex="10" type="button" value="&nbsp;Add...&nbsp;" name="BtnNew" onClick="AddJADeclaration">
						</td>
					</tr>
					<tr>
						<td align="left">Method:&nbsp;</td>
						<td align="left">
							<select tabindex="10" style="width:100%" name="idJavaMethod">
							</select>
						</td>
						<td>&nbsp;</td>
					</tr>
					<tr id="idSingleParameter" style='display:none'>
						<td colspan="3">
							<table border="0" width="100%" cellspacing="0" cellpadding="5px">
								<tr>
									<td colspan="2" class='HelpText'>
										Specify additional text string for the selected method:
									</td>
								</tr>
								<tr>
									<td id="idParameterLabel">Parameter:</td>
									<td width="100%" ><input tabindex="10" name="idParameter" type="text" style="width:100%"></td>
								</tr>
							</table>
						</td>
					</tr>
					<tr id="idPropertyParameter" style='display:none'>
						<td colspan="3">
							<table border="0" width="100%" cellspacing="0" cellpadding="5px">
								<tr>
									<td colspan="3" width="100%" bgcolor="white">
										<object classid="clsid:5220cb21-c88d-11cf-b347-00aa00a28331">
											<param name="LPKPath" value="../../../vsFlex8n.lpk">
										</object>				
										<object id="idGrid" style="font-size: 8pt; font-family: Verdana; background-color: white"
											tabIndex="10" height="80" width="100%" classid="clsid:74233db3-f72f-44ea-94dc-258a624037e6" VIEWASTEXT>
											<param name="BackColorBkg" value="16777215">
											<param name="AllowSelection" value="-1">
											<param name="AllowBigSelection" value="-1">
											<param name="AllowUserResizing" value="1">
											<param name="SelectionMode" value="0">
											<param name="Rows" value="4">
											<param name="Cols" value="2">
											<param name="FixedRows" value="1">
											<param name="FixedCols" value="0">
											<param name="ScrollBars" value="3">
										</object>
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
			</td>
		</tr>
		<tr>
			<td colspan="4" class="TabBottom"><img height="3px"></td>
		</tr>
		<tr>
			<td colspan="4"><img height="5px"></td>
		</tr>
		<tr id="InfoHead">
			<td width="1%" class="TabHead">
				<img id="InfoImg"  src="minus.gif" alt="Expand/Collapse" tabindex="10" class="ExpandButton" 
				     onclick="ExpandCollapse('Info')" 
				     onfocus="Call ExpandOnFocus" 
				     onblur="Call ExpandOnBlur">&nbsp;</td>
			<td id="SourceTab" width="10%" tabindex="10" class="TabCurrent" onclick="SwitchToSource">&nbsp;Source&nbsp;</td>
			<td id="DocumentationTab" width="10%" tabindex="10" class="Tab" onclick="SwitchToDocumentation">&nbsp;Javadoc&nbsp;</td>
			<td id="FakeInfoTab" width="10%" class="TabHead" style="display:none">&nbsp;</td>
			<td width="100%" class="TabHead">&nbsp;</td>
		</tr>
		<tr id="Info" height="100%">
			<td colspan="4" class="TabBody">
				<table border="0" width="100%" height="100%" cellspacing="0" cellpadding="5px">
					<tr id="Source" height="100%">
						<td width="100%">
							<object id="CodeMaxEditor" tabIndex="10" height="100%" width="100%" border="0"
								classid="clsid:925E9825-63BC-42C3-BD49-38279E7B8116" VIEWASTEXT>
								<param name="ReadOnly" value=-1/>
							</object>
						</td>
					</tr>
					<tr  id="Documentation" height="100%" style="display:none">
						<td width="100%">
							<iframe tabindex="10" width="100%" height="100%" frameborder="0" scrolling="yes" src="" id="IFrameDoc"></iframe>
							</td>
						</tr>
					</tr>
				</table>
			</td>
		</tr>
		<tr id="InfoBottom">
			<td colspan="4" class="TabBottom"><img height="3px"></td>
		</tr>
		<tr height="100%">
			<td colspan="4"><img height="1px"></td>
		</tr>
	</table>
	<!--object id="JAWorkspace" classid="CLSID:D5F4D736-EF27-455A-8E04-C590F2A53521" VIEWASTEXT -->
</body>
</html>
```

### Java/OnUserNodeJava.js

```js
// global variables
var g_RuleView;
var g_MethodChangedForDoc;

// general
document.attachEvent("onreadystatechange", OnReadyStateChange);

// entry point when the document is loaded
function OnReadyStateChange()
{
	if (document.readyState == "complete")
	{
		InitializeDocument();
	}
}
```

### Java/OnUserNodeNet.htm

```htm
<script language="VBScript" src="JavaHandlerCommon.vbs"></script>
<script type="text/javascript" src="OnUserNodeJava.js"></script>
<script language="VBScript">
'Option Explicit

Sub InitializeDocument()
	g_bDotNet = True
	BtnNew.disabled = True
	g_ReadOnlyMode = window.external.GetValue("ReadOnly")
	g_MethodChangedForDoc = True
	Set g_RuleView = window.external.GetValue("RuleView")
	' Source view should be hidden after completion of loading
	' Becuse CMax control is created by demand
	HideInfoSection

	LoadPageProperties()
	BtnNew.disabled = g_ReadOnlyMode
	CodeMaxEditor.ReadOnly = True
	' Declaration expand button is shown with border like it has focus
	' Remove misleaded border explicitly
	DeclarationImg.className = "ExpandButton"
	If Not g_ReadOnlyMode Then
		ExpandDeclaration()
		idJavaName.Focus()
		window.scroll 0, 0
	End If

End Sub

Sub idJavaName_OnChange
	Dim DocLocation
	Dim SourceLocation

	FillJAMethods

	Set oJA = GetSelectedJA()
	If oJA Is Nothing Then 
		CodeMaxEditor.Text = ""
		HideInfoSection
		Exit Sub
	End If

    On Error Resume Next
	DocLocation = oJA.DocLocation
	SourceLocation = oJA.SourceLocation
	On Error Goto 0

	If SourceLocation = "" And DocLocation = "" Then
		HideInfoSection
	Else
		ShowInfoSection
		If SourceLocation <> "" And DocLocation <> "" Then
			FakeInfoTab.style.display = "none"
			SourceTab.style.display = ""
			DocumentationTab.style.display = ""
		Else
			' At least on tab will be hidden
			FakeInfoTab.style.display = ""
		End If

		If SourceLocation <> "" Then
			SwitchToSource
			CodeMaxEditor.OpenFile SourceLocation
			ShowSelectedMethod
		Else
			CodeMaxEditor.Text = ""
			SourceTab.style.display = "none"
			SwitchToDocumentation
		End If

		If DocLocation <> "" Then
			document.all.IFrameDoc.Src = DocLocation
	   	Else
			DocumentationTab.style.display = "none"
		End If
	End If

End Sub

Sub idJavaMethod_OnChange
	OnJavaMethodChange
	ShowSelectedMethod
End Sub

Sub ShowSelectedMethod
	Dim oMethod
    Set oMethod = GetSelectedMethod()
	If oMethod Is Nothing Then Exit Sub
	If SourceTab.style.display <> "none" Then
		CodeMaxEditor.ShowMethod oMethod.Declaration.ClassName, oMethod.Signature, True
	End If

	If Documentation.style.display = "none" Then
		g_MethodChangedForDoc = True
	Else
		DocLocation = oMethod.DocLocation
		document.all.IFrameDoc.Src = DocLocation
	End If
End Sub

Sub AddJADeclaration
	Dim Success
	On Error Resume Next
	Success = g_JavaActionMgr.AddJavaActionDlg(g_Empty, g_RuleView.Window, True)
	If Err Then
		window.external.messagebox Err.Description, "Error", vbCritical
		On Error Goto 0
		Exit Sub
	End If
	On Error Goto 0
	If Success Then
		g_JavaActionMgr.Update True
		g_DeclAddingMode = True
		RefreshJAList
		g_RuleView.RefreshView
	End If
End Sub

Function Confirm()
	Confirm = 1
End Function

Function ExpandOnFocus
	window.event.srcElement.className = "ExpandButtonFocus"
	ExpandOnFocus = True
End Function

Function ExpandOnBlur
	window.event.srcElement.className = "ExpandButton"
	ExpandOnBlur = True
End Function

Function ExpandCollapse(sectionName)
	Dim SectionStyle

	Set SectionStyle = document.all.item(sectionName).style

	If SectionStyle.display <> "none" Then
		SectionStyle.display = "none"
		window.event.srcElement.src = "plus.gif"
	Else
		SectionStyle.display = ""
		window.event.srcElement.src = "minus.gif"
	End If
End Function

Sub ExpandDeclaration
	Dim SectionStyle
	Set SectionStyle = Declaration.style

	If SectionStyle.display = "none" Then
		SectionStyle.display = ""
		DeclarationImg.src = "minus.gif"
	End If
End Sub

Sub SwitchToSource
	DocumentationTab.className = "Tab"
	SourceTab.className = "TabCurrent"

	InfoImg.src = "minus.gif"
	Info.style.display = ""
	Documentation.style.display = "none"
	Source.style.display = ""
End Sub

Sub SwitchToDocumentation
	Dim oMethod
	Dim oAction
	SourceTab.className = "Tab"
	DocumentationTab.className = "TabCurrent"

	InfoImg.src = "minus.gif"
	Info.style.display = ""
	Source.style.display = "none"
	Documentation.style.display = ""

	If g_MethodChangedForDoc Then
    	Set oMethod = GetSelectedMethod()
		If oMethod Is Nothing Then
			Set oAction = GetSelectedJA()
			DocLocation = oAction.DocLocation
		Else
			DocLocation = oMethod.DocLocation
		End If
		document.all.IFrameDoc.Src = DocLocation
		g_MethodChangedForDoc = False
	End If
End Sub

Sub HideInfoSection
 	InfoHead.style.display = "none"
 	Info.style.display = "none"
 	InfoBottom.style.display = "none"
End Sub

Sub ShowInfoSection
 	InfoHead.style.display = ""
 	Info.style.display = ""
 	InfoBottom.style.display = ""
End Sub

Sub Document_OnKeyDown
	EnterKeyCode = 13
	If window.event.keycode = EnterKeyCode Then
		Set SrcEl = window.event.srcElement
		If StrComp(SrcEl.tagName, "img", vbTextCompare) = 0 Then SrcEl.click
		If SrcEl.id = "SourceTab" Or SrcEl.id = "DocumentationTab" Then SrcEl.click
	End If
End Sub

Function SetDirty(NewValue)
	If g_ReadOnly Then Exit Function
	If NewValue = True Then
		g_RuleView.Dirty = 1
	End If
End Function

</script>

<html>
	<head>
		<title></title>
	</head>

<style>
	html,body {	overflow-y:auto;}
	body 	{background-color: white; color: black;}
	td		{font: 8pt verdana;}
	#PageTitle	{background-color: #c0c0c0; font: 12pt verdana; padding: 10px;}
	.HelpText	{color: #0033cc;}
	.ExpandButton {border: white 2px solid; cursor: hand}
	.ExpandButtonFocus {border: black 2px solid; cursor: hand}
	.TabHead
	{
		background-color: white;
		border-bottom: black 1px solid;
		padding: 5px;
	}
	.TabCurrent
	{
		border-top: black 1px solid;
		border-left: black 1px solid;
		border-right: black 1px solid;
		padding: 5px;
	}
	.Tab
	{
		border-top: silver 1px solid;
		border-left: silver 1px solid;
		border-right: silver 1px solid;
		border-bottom: black 1px solid;
		padding: 5px;
		cursor: hand;
	}
	.TabBody
	{
		border-left: black 1px solid;
		border-right: black 1px solid;
	}
	.TabBottom
	{
		border-left: black 1px solid;
		border-right: black 1px solid;
		border-bottom: black 1px solid;
		padding: 0px;
	}
</style>
</head>
<body topmargin="0" leftmargin="0" onLoad="" bgcolor="white">
	<table border="0" width="100%" cellspacing="0" cellpadding="0" style="height: 100%">
		<tr>
			<td colspan="4" id="PageTitle">.NET</td>
		</tr>
		<tr>
			<td colspan="4"><img height="3px"></td>
		</tr>
		<tr>
			<td width="1%" class="TabHead">
				<img id="DeclarationImg"  src="minus.gif" alt="Expand/Collapse" tabindex="10" class="ExpandButton" 
				     onclick="ExpandCollapse('Declaration')" 
				     onfocus="Call ExpandOnFocus" 
				     onblur="Call ExpandOnBlur">&nbsp;</td>
			<td width="10%" class="TabCurrent">&nbsp;Declaration&nbsp;</td>
			<td width="100%" colspan="2" class="TabHead">&nbsp;</td>
		</tr>
		<tr id="Declaration">
			<td colspan="4" class="TabBody">
				<table border="0" width="100%" cellspacing="0" cellpadding="5px">
					<tr>
						<td width="20%" align="left">Class:&nbsp;</td>
						<td width="80%" align="left">
							<select tabindex="10" style="width:100%" name="idJavaName">
							</select>
						</td>
						<td width="5%" align="left">
							<input tabindex="10" type="button" value="&nbsp;Add...&nbsp;" name="BtnNew" onClick="AddJADeclaration">
						</td>
					</tr>
					<tr>
						<td align="left">Method:&nbsp;</td>
						<td align="left">
							<select tabindex="10" style="width:100%" name="idJavaMethod">
							</select>
						</td>
						<td>&nbsp;</td>
					</tr>
					<tr id="idSingleParameter" style='display:none'>
						<td colspan="3">
							<table border="0" width="100%" cellspacing="0" cellpadding="5px">
								<tr>
									<td colspan="2" class='HelpText'>
										Specify additional text string for the selected method:
									</td>
								</tr>
								<tr>
									<td id="idParameterLabel">Parameter:</td>
									<td width="100%" ><input tabindex="10" name="idParameter" type="text" style="width:100%"></td>
								</tr>
							</table>
						</td>
					</tr>
					<tr id="idPropertyParameter" style='display:none'>
						<td colspan="3">
							<table border="0" width="100%" cellspacing="0" cellpadding="5px">
								<tr>
									<td colspan="3" width="100%" bgcolor="white">
										<object classid="clsid:5220cb21-c88d-11cf-b347-00aa00a28331">
											<param name="LPKPath" value="../../../vsFlex8n.lpk">
										</object>				
										<object id="idGrid" style="font-size: 8pt; font-family: Verdana; background-color: white"
											tabIndex="10" height="80" width="100%" classid="clsid:74233db3-f72f-44ea-94dc-258a624037e6" VIEWASTEXT>
											<param name="BackColorBkg" value="16777215">
											<param name="AllowSelection" value="-1">
											<param name="AllowBigSelection" value="-1">
											<param name="AllowUserResizing" value="1">
											<param name="SelectionMode" value="0">
											<param name="Rows" value="4">
											<param name="Cols" value="2">
											<param name="FixedRows" value="1">
											<param name="FixedCols" value="0">
											<param name="ScrollBars" value="3">
										</object>
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
			</td>
		</tr>
		<tr>
			<td colspan="4" class="TabBottom"><img height="3px"></td>
		</tr>
		<tr>
			<td colspan="4"><img height="5px"></td>
		</tr>
		<tr id="InfoHead">
			<td width="1%" class="TabHead">
				<img id="InfoImg"  src="minus.gif" alt="Expand/Collapse" tabindex="10" class="ExpandButton" 
				     onclick="ExpandCollapse('Info')" 
				     onfocus="Call ExpandOnFocus" 
				     onblur="Call ExpandOnBlur">&nbsp;</td>
			<td id="SourceTab" width="10%" tabindex="10" class="TabCurrent" onclick="SwitchToSource">&nbsp;Source&nbsp;</td>
			<td id="DocumentationTab" width="10%" tabindex="10" class="Tab" nowrap onclick="SwitchToDocumentation">&nbsp;.NET Documentation&nbsp;</td>
			<td id="FakeInfoTab" width="10%" class="TabHead" style="display:none">&nbsp;</td>
			<td width="100%" class="TabHead">&nbsp;</td>
		</tr>
		<tr id="Info" height="100%">
			<td colspan="4" class="TabBody">
				<table border="0" width="100%" height="100%" cellspacing="0" cellpadding="5px">
					<tr id="Source" height="100%">
						<td width="100%">
							<object id="CodeMaxEditor" tabIndex="10" height="100%" width="100%" border="0"
								classid="clsid:925E9825-63BC-42C3-BD49-38279E7B8116" VIEWASTEXT>
								<param name="ReadOnly" value=-1/>
							</object>
						</td>
					</tr>
					<tr  id="Documentation" height="100%" style="display:none">
						<td width="100%">
							<iframe tabindex="10" width="100%" height="100%" frameborder="0" scrolling="yes" src="" id="IFrameDoc"></iframe>
							</td>
						</tr>
					</tr>
				</table>
			</td>
		</tr>
		<tr id="InfoBottom">
			<td colspan="4" class="TabBottom"><img height="3px"></td>
		</tr>
		<tr height="100%">
			<td colspan="4"><img height="1px"></td>
		</tr>
	</table>
	<!--object id="JAWorkspace" classid="CLSID:D5F4D736-EF27-455A-8E04-C590F2A53521" VIEWASTEXT -->
</body>
</html>
```

### Java/plus.gif

_Binary or non-text file; content skipped._

### scripts/export-folder-structure-to-markdown.js

```js
#!/usr/bin/env node
const fs = require('fs');
const path = require('path');

function isLikelyBinary(buffer) {
  if (!buffer || buffer.length === 0) return false;

  const sample = buffer.subarray(0, 4096);
  for (let i = 0; i < sample.length; i += 1) {
    const byte = sample[i];
    if (byte === 0) return true;
    if (byte < 9 || (byte > 13 && byte < 32)) {
      if (byte !== 9 && byte !== 10 && byte !== 13 && byte !== 12) {
        return true;
      }
    }
  }

  return false;
}

function shouldIgnore(relativePath) {
  const normalized = relativePath.replace(/\\/g, '/');
  return (
    normalized === '.git' ||
    normalized.startsWith('.git/') ||
    normalized === 'node_modules' ||
    normalized.startsWith('node_modules/') ||
    normalized.includes('/node_modules/')
  );
}

function walkDirectory(currentPath, rootPath, items) {
  const dirEntries = fs.readdirSync(currentPath, { withFileTypes: true });
  dirEntries.sort((a, b) => a.name.localeCompare(b.name));

  for (const entry of dirEntries) {
    const fullPath = path.join(currentPath, entry.name);
    const relativePath = path.relative(rootPath, fullPath).replace(/\\/g, '/');

    if (shouldIgnore(relativePath)) continue;

    if (entry.isDirectory()) {
      items.push({ type: 'directory', path: relativePath });
      walkDirectory(fullPath, rootPath, items);
    } else if (entry.isFile()) {
      items.push({ type: 'file', path: relativePath });
    }
  }
}

function buildTree(items) {
  const root = { children: new Map(), isDirectory: true };

  for (const item of items) {
    const parts = item.path.split('/');
    let node = root;

    for (let i = 0; i < parts.length; i += 1) {
      const part = parts[i];
      const isLast = i === parts.length - 1;

      if (!node.children.has(part)) {
        node.children.set(part, {
          name: part,
          isDirectory: !isLast || item.type === 'directory',
          children: new Map(),
        });
      }

      node = node.children.get(part);
    }
  }

  return root;
}

function renderTree(node, prefix = '') {
  const lines = [];
  const childNames = Array.from(node.children.keys()).sort((a, b) => a.localeCompare(b));

  for (let i = 0; i < childNames.length; i += 1) {
    const childName = childNames[i];
    const child = node.children.get(childName);
    const connector = i === childNames.length - 1 ? '└── ' : '├── ';
    const nextPrefix = i === childNames.length - 1 ? `${prefix}    ` : `${prefix}│   `;
    const displayName = child.isDirectory ? `${childName}/` : childName;

    lines.push(`${prefix}${connector}${displayName}`);
    if (child.children.size > 0) {
      lines.push(...renderTree(child, nextPrefix));
    }
  }

  return lines;
}

function readTextFile(filePath) {
  const buffer = fs.readFileSync(filePath);
  if (isLikelyBinary(buffer)) {
    return null;
  }

  return buffer.toString('utf8');
}

function buildMarkdown(rootPath, outputPath) {
  const items = [];
  walkDirectory(rootPath, rootPath, items);
  const treeRoot = buildTree(items);
  const treeLines = renderTree(treeRoot);

  const sections = [];
  sections.push('# Project Structure');
  sections.push('');
  sections.push('Generated from: ' + rootPath);
  sections.push('');
  sections.push('## Folder tree');
  sections.push('');
  sections.push('```text');
  sections.push(rootPath.split(path.sep).pop() + '/');
  sections.push(...treeLines);
  sections.push('```');
  sections.push('');
  sections.push('## File contents');
  sections.push('');

  for (const item of items.filter((entry) => entry.type === 'file')) {
    const fullPath = path.join(rootPath, item.path);
    const content = readTextFile(fullPath);
    const safeName = item.path.replace(/\\/g, '/');

    sections.push(`### ${safeName}`);
    sections.push('');

    if (content === null) {
      sections.push('_Binary or non-text file; content skipped._');
    } else {
      const language = path.extname(fullPath).slice(1) || 'text';
      sections.push('```' + language);
      sections.push(content.trimEnd());
      sections.push('```');
    }

    sections.push('');
  }

  return sections.join('\n');
}

function main() {
  const rootArg = process.argv[2] ? path.resolve(process.argv[2]) : path.resolve(__dirname, '..');
  const outputArg = process.argv[3] ? path.resolve(process.argv[3]) : path.join(rootArg, 'workspace-structure.md');

  if (!fs.existsSync(rootArg)) {
    console.error(`Root path does not exist: ${rootArg}`);
    process.exit(1);
  }

  const markdown = buildMarkdown(rootArg, outputArg);
  fs.mkdirSync(path.dirname(outputArg), { recursive: true });
  fs.writeFileSync(outputArg, markdown, 'utf8');

  console.log(`Markdown export complete: ${outputArg}`);
}

main();
```

### Templates/1/Copy.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<MapTemplateDescriptor>
    <FunctionTemplates Category="Copy">
        <FunctionTemplate ID="SimpleCopy">
            <Properties>
				<Property Name="Description">Use this function to simply copy one source field to a target field. This function requires one input value and returns one result.</Property>
            </Properties>
            <FunctionPoints Direction="Input">
                <FunctionPoint ID="A" Name="Value"/>
            </FunctionPoints>
            <FunctionPoints Direction="Output">
                <FunctionPoint ID="X" Name="Result"/>
            </FunctionPoints>
        </FunctionTemplate>
        <FunctionTemplate ID="ConditionalCopy">
            <Properties>
				<Property Name="Description">Use this function to perform condition based copy of one or more source fields to a different target field.</Property>
            </Properties>
            <FunctionPoints Direction="Input">
                <FunctionPoint ID="A" Name="Value" MaxCardinality="n"/>
            </FunctionPoints>
            <FunctionPoints Direction="Output">
                <FunctionPoint ID="X" Name="Result" MaxCardinality="n"/>
            </FunctionPoints>
        </FunctionTemplate>
        <FunctionTemplate ID="ConversionalCopy">
            <Properties>
				<Property Name="Description">Use this function to copy any source field to a target field with a conversion being performed during the copy operation. This function requires one input value and returns one result value.</Property>
            </Properties>
            <FunctionPoints Direction="Input">
                <FunctionPoint ID="A" Name="Value"/>
            </FunctionPoints>
            <FunctionPoints Direction="Output">
                <FunctionPoint ID="X" Name="Result"/>
            </FunctionPoints>
        </FunctionTemplate>
    </FunctionTemplates>
</MapTemplateDescriptor>
```

### Templates/1/Date.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<MapTemplateDescriptor>
    <FunctionTemplates Category="Date">
        <FunctionTemplate ID="DateTimeAddDays">
            <Properties>
				<Property Name="Description">Use this function to add specified number of days to a given date and to change date format if needed. This function requires one input value and returns one result.</Property>
            </Properties>
            <FunctionPoints Direction="Input">
                <FunctionPoint ID="A" Name="Value"/>
            </FunctionPoints>
            <FunctionPoints Direction="Output">
                <FunctionPoint ID="X" Name="Result"/>
            </FunctionPoints>
        </FunctionTemplate>
        <FunctionTemplate ID="DateTimeSubtractDays">
            <Properties>
				<Property Name="Description">Use this function to subtract specified number of days from a given date and to change date format if needed. This function requires one input value and returns one result.</Property>
            </Properties>
            <FunctionPoints Direction="Input">
                <FunctionPoint ID="A" Name="Value"/>
            </FunctionPoints>
            <FunctionPoints Direction="Output">
                <FunctionPoint ID="X" Name="Result"/>
            </FunctionPoints>
        </FunctionTemplate>
        <FunctionTemplate ID="SystemDateTime">
            <Properties>
				<Property Name="Description">Use this function to return the system date/time. This function only requires one input parameter to indicate the format to return the date/time.</Property>
            </Properties>
            <FunctionPoints Direction="Output">
                <FunctionPoint ID="X" Name="Result"/>
            </FunctionPoints>
        </FunctionTemplate>
        <FunctionTemplate ID="ConvertDateTime">
            <Properties>
				<Property Name="Description">Use this function to change incoming date format. This function requires one input value and returns one result value.</Property>
            </Properties>
            <FunctionPoints Direction="Input">
                <FunctionPoint ID="A" Name="Value"/>
            </FunctionPoints>
            <FunctionPoints Direction="Output">
                <FunctionPoint ID="X" Name="Result"/>
            </FunctionPoints>
        </FunctionTemplate>
    </FunctionTemplates>
</MapTemplateDescriptor>
```

### Templates/1/General.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<MapTemplateDescriptor>
	<FunctionTemplates Category="Core">
		<FunctionTemplate ID="CreateConstant">
			<Properties>
				<Property Name="Description">Use this function to create a constant to use in other functions or in the mapping process.</Property>
			</Properties>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="A" Name="Value"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="SetVariable">
			<Properties>
				<Property Name="Description">Use this function to store the value of the source field to a variable. This function requires two input values: a value to store and a variable name.</Property>
			</Properties>
            <FunctionPoints Direction="Input">
                <FunctionPoint ID="A" Name="Value"/>
                <FunctionPoint ID="B" Name="Variable"/>
            </FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="GetVariable">
			<Properties>
				<Property Name="Description">Use this function to retrieve the value of a stored variable. This function requires one input value and returns one result.</Property>
			</Properties>
            <FunctionPoints Direction="Input">
                <FunctionPoint ID="A" Name="Variable"/>
            </FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="Result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="IfThen">
			<Properties>
				<Property Name="Description">Use this function to specify a conditional action based on a specified expression. This function requires two input parameters: a value and a condition and returns two results.</Property>
			</Properties>
            <FunctionPoints Direction="Input">
                <FunctionPoint ID="A" Name="Value"/>
                <FunctionPoint ID="B" Name="Condition"/>
            </FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X1" Name="Then"/>
				<FunctionPoint ID="X2" Name="Else"/>
			</FunctionPoints>
		</FunctionTemplate>
	</FunctionTemplates>
	<FunctionTemplates Category="FreeForm">
		<FunctionTemplate ID="FreeForm">
			<Properties>
				<Property Name="Description">Use this function to describe any mapping for which there is no suitable existing function. This function can have any number of input and result values.</Property>
			</Properties>
            <FunctionPoints Direction="Input">
                <FunctionPoint ID="A" Name="Value" MinCardinality="1" MaxCardinality="n"/>
            </FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="Result" MinCardinality="0" MaxCardinality="n"/>
			</FunctionPoints>
		</FunctionTemplate>
	</FunctionTemplates>
</MapTemplateDescriptor>
```

### Templates/1/Math.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<MapTemplateDescriptor>
    <FunctionTemplates Category="Math">
        <FunctionTemplate ID="Add">
            <Properties>
				<Property Name="Description">Use this function to add numeric values. This function requires two input values minimum and returns one result value.</Property>
            </Properties>
            <FunctionPoints Direction="Input">
                <FunctionPoint ID="A" Name="Value" MinCardinality="2" MaxCardinality="n"/>
            </FunctionPoints>
            <FunctionPoints Direction="Output">
                <FunctionPoint ID="X" Name="Result"/>
            </FunctionPoints>
        </FunctionTemplate>
		<FunctionTemplate ID="Subtract">
            <Properties>
				<Property Name="Description">Use this function to subtract two numeric values. This function requires two input values and returns one result value.</Property>
            </Properties>
            <FunctionPoints Direction="Input">
                <FunctionPoint ID="A" Name="Minuend"/>
                <FunctionPoint ID="B" Name="Subtrahend"/>
            </FunctionPoints>
            <FunctionPoints Direction="Output">
                <FunctionPoint ID="X" Name="Difference"/>
            </FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Multiply">
            <Properties>
				<Property Name="Description">Use this function to multiply two numeric values. This function requires two input values minimum and returns one result value.</Property>
			</Properties>
            <FunctionPoints Direction="Input">
                <FunctionPoint ID="A" Name="Value" MinCardinality="2" MaxCardinality="n"/>
            </FunctionPoints>
            <FunctionPoints Direction="Output">
                <FunctionPoint ID="X" Name="Result"/>
            </FunctionPoints>
		</FunctionTemplate>		
		<FunctionTemplate ID="Division">
            <Properties>
				<Property Name="Description">Use this function to divide two numeric values. This function requires two input values and returns one result value.</Property>
            </Properties>
            <FunctionPoints Direction="Input">
                <FunctionPoint ID="A" Name="Dividend"/>
                <FunctionPoint ID="B" Name="Divisor"/>
            </FunctionPoints>
            <FunctionPoints Direction="Output">
                <FunctionPoint ID="X" Name="Result"/>
            </FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Modulus">
            <Properties>
				<Property Name="Description">Use this function to divide two numeric values and get the remainder. This function requires two input values and returns one result value.</Property>
            </Properties>
            <FunctionPoints Direction="Input">
                <FunctionPoint ID="A" Name="Dividend"/>
                <FunctionPoint ID="B" Name="Divisor"/>
            </FunctionPoints>
            <FunctionPoints Direction="Output">
                <FunctionPoint ID="X" Name="Remainder"/>
            </FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Round">
            <Properties>
				<Property Name="Description">Use this function to round a numeric value to a certain number of decimals. This function requires one value to perform the operation and returns one result value.</Property>
            </Properties>
            <FunctionPoints Direction="Input">
                <FunctionPoint ID="A" Name="Value"/>
            </FunctionPoints>
            <FunctionPoints Direction="Output">
                <FunctionPoint ID="X" Name="Result"/>
            </FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Absolute">
            <Properties>
				<Property Name="Description">Use this function to return the absolute value of a numeric value. This function requires one input value and returns one result value.</Property>
            </Properties>
            <FunctionPoints Direction="Input">
                <FunctionPoint ID="A" Name="Value"/>
            </FunctionPoints>
            <FunctionPoints Direction="Output">
                <FunctionPoint ID="X" Name="Result"/>
            </FunctionPoints>
		</FunctionTemplate>
    </FunctionTemplates>
</MapTemplateDescriptor>
```

### Templates/1/String.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<MapTemplateDescriptor>
    <FunctionTemplates Category="String">
        <FunctionTemplate ID="Concatenate">
            <Properties>
				<Property Name="Description">Use this function to concatenate series of string values. This function requires two input values minimum. It returns one result value.</Property>
            </Properties>
            <FunctionPoints Direction="Input">
                <FunctionPoint ID="A" Name="Value" MinCardinality="2" MaxCardinality="n"/>
            </FunctionPoints>
            <FunctionPoints Direction="Output">
                <FunctionPoint ID="X" Name="Result"/>
            </FunctionPoints>
        </FunctionTemplate>
        <FunctionTemplate ID="Substring">
            <Properties>
				<Property Name="Description">Use this function to extract a part of a string value. This function returns one result value.</Property>
            </Properties>
            <FunctionPoints Direction="Input">
                <FunctionPoint ID="A" Name="Value"/>
            </FunctionPoints>
            <FunctionPoints Direction="Output">
                <FunctionPoint ID="X" Name="Result"/>
            </FunctionPoints>
        </FunctionTemplate>
        <FunctionTemplate ID="Size">
            <Properties>
				<Property Name="Description">Use this function to return the length of a string. This function requires one input value and returns one result value.</Property>
            </Properties>
            <FunctionPoints Direction="Input">
                <FunctionPoint ID="A" Name="Value"/>
            </FunctionPoints>
            <FunctionPoints Direction="Output">
                <FunctionPoint ID="X" Name="Result"/>
            </FunctionPoints>
        </FunctionTemplate>
        <FunctionTemplate ID="LeftTrim">
            <Properties>
				<Property Name="Description">Use this function to return a specified number of characters from a text item, starting with the leftmost character. This function requires two input values: string value and the number of characters to return.</Property>
            </Properties>
            <FunctionPoints Direction="Input">
                <FunctionPoint ID="A" Name="Value"/>
                <FunctionPoint ID="B" Name="Size"/>
            </FunctionPoints>
            <FunctionPoints Direction="Output">
                <FunctionPoint ID="X" Name="Result"/>
            </FunctionPoints>
        </FunctionTemplate>
        <FunctionTemplate ID="RightTrim">
            <Properties>
				<Property Name="Description">Use this function to return a specified number of characters from a text item, starting with the rightmost character. This function requires two input values: string value and the number of characters to return.</Property>
            </Properties>
            <FunctionPoints Direction="Input">
                <FunctionPoint ID="A" Name="Value"/>
                <FunctionPoint ID="B" Name="Size"/>
            </FunctionPoints>
            <FunctionPoints Direction="Output">
                <FunctionPoint ID="X" Name="Result"/>
            </FunctionPoints>
        </FunctionTemplate>
        <FunctionTemplate ID="Uppercase">
            <Properties>
				<Property Name="Description">Use this function to convert text to uppercase. This function requires one input value and returns one result value.</Property>
            </Properties>
            <FunctionPoints Direction="Input">
                <FunctionPoint ID="A" Name="Value"/>
            </FunctionPoints>
            <FunctionPoints Direction="Output">
                <FunctionPoint ID="X" Name="Result"/>
            </FunctionPoints>
        </FunctionTemplate>
        <FunctionTemplate ID="Lowercase">
            <Properties>
				<Property Name="Description">Use this function to convert text to lowercase. This function requires one input value and returns one result value.</Property>
            </Properties>
            <FunctionPoints Direction="Input">
                <FunctionPoint ID="A" Name="Value"/>
            </FunctionPoints>
            <FunctionPoints Direction="Output">
                <FunctionPoint ID="X" Name="Result"/>
            </FunctionPoints>
        </FunctionTemplate>
    </FunctionTemplates>
</MapTemplateDescriptor>
```

### Templates/2/Copy.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<MapTemplateDescriptor>
	<FunctionTemplates Category="Copy">
		<FunctionTemplate ID="SimpleCopy" Name="Simple Copy">
			<Properties>
				<Property Name="Description">Use this function to simply copy one source field to a target field. This function requires one input value and returns one result. This function can be activated.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation"/>
				<FunctionPoint ID="A" Name="value"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="ConditionalCopy" Name="Conditional Copy">
			<Properties>
				<Property Name="Description">Use this function to perform a condition-based copy of one or more source fields to a different target field. The condition can be a value of a qualifier field or any other parameter. This function can have any number of input and result values. This function can be activated.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation"/>
				<FunctionPoint ID="A" Name="value" MaxCardinality="n"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result" MaxCardinality="n"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="ConversionalCopy" Name="Conversional Copy">
			<Properties>
				<Property Name="Description">Use this function to copy any source field to a target field with a conversion being performed during the copy operation. This function requires one input value and returns one result value.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="value"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
	</FunctionTemplates>
</MapTemplateDescriptor>
```

### Templates/2/Date.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<MapTemplateDescriptor>
	<FunctionTemplates Category="Date/Time">
		<FunctionTemplate ID="SystemDateTime" Name="System Date/Time">
			<Properties>
				<Property Name="Description">Use this function to return the system date/time. This function only requires one input parameter to indicate the format to return the date/time. This function can be activated.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="ConvertDateTime" Name="Convert Date/Time">
			<Properties>
				<Property Name="Description">Use this function to change incoming date format. This function requires one input value and returns one result value.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="value"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
	</FunctionTemplates>
</MapTemplateDescriptor>
```

### Templates/2/General.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<MapTemplateDescriptor>
	<FunctionTemplates Category="Core">
		<FunctionTemplate ID="CreateVariable" Name="Create Variable">
			<Properties>
				<Property Name="Description">Use this function to store the value of the input to a variable. This function requires an input value to store and a variable name. This function can be activated.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation"/>
				<FunctionPoint ID="A" Name="initial value"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="ChangeVariable" Name="Change Variable">
			<Properties>
				<Property Name="Description">Use this function to change the value of the referenced existing variable. This function requires an input value to store and a variable name. This function can be activated.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation"/>
				<FunctionPoint ID="A" Name="value"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Increment">
			<Properties>
				<Property Name="Description">Use this function to increment a value of the referenced existing variable. This function does not have any inputs or outputs and can be activated only.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Decrement">
			<Properties>
				<Property Name="Description">Use this function to decrement a value of the referenced existing variable. This function does not have any inputs or outputs and can be activated only.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Clone">
			<Properties>
				<Property Name="Description">Use this function to provide explicit multiplexing abilities with a controlled order of execution for output connections. It can have a single source connection and provides a direct copy of the source to all output connections. Output connections will be executed in the order they are provided in the function. This function can be activated.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation"/>
				<FunctionPoint ID="A" Name="value"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result" MaxCardinality="n"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="SetValue" Name="Set Value">
			<Properties>
				<Property Name="Description">Use this function to set a variable value or a constant to the target. This function can be activated.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation"/>
				<FunctionPoint ID="A" Name="value"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
	</FunctionTemplates>
	<FunctionTemplates Category="Documentation">
		<FunctionTemplate ID="FreeForm" Name="Free Form">
			<Properties>
				<Property Name="Description">Use this function to describe any mapping for which there is no suitable existing function. This function can have any number of input and result values.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="value" MinCardinality="1" MaxCardinality="n"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result" MinCardinality="0" MaxCardinality="n"/>
			</FunctionPoints>
		</FunctionTemplate>
	</FunctionTemplates>
</MapTemplateDescriptor>
```

### Templates/2/Math.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<MapTemplateDescriptor>
	<FunctionTemplates Category="Math">
		<FunctionTemplate ID="Absolute">
			<Properties>
				<Property Name="Description">Use this function to return the absolute value of a numeric value. This function requires one input value and returns one result value.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="number"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Add">
			<Properties>
				<Property Name="Description">Use this function to add numeric values. This function requires one or more input values and returns one result value.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="number" MaxCardinality="n"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Subtract">
			<Properties>
				<Property Name="Description">Use this function to subtract numeric values. This function requires one or more input values and returns one result value.</Property>
			</Properties>
            <FunctionPoints Direction="Input">
                <FunctionPoint ID="A" Name="number"/>
                <FunctionPoint ID="B" Name="value" MaxCardinality="n"/>
            </FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="difference"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Multiply">
			<Properties>
				<Property Name="Description">Use this function to multiply numeric values. This function requires one or more input values and returns one result value.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="number" MaxCardinality="n"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Divide">
			<Properties>
				<Property Name="Description">Use this function to divide two numeric values. This function requires two input values and returns one result value.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="number"/>
				<FunctionPoint ID="B" Name="divisor"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Modulus">
			<Properties>
				<Property Name="Description">Use this function to divide two numeric values and get the remainder. This function requires two input values and returns one result value.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="number"/>
				<FunctionPoint ID="B" Name="divisor"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="remainder"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Round">
			<Properties>
				<Property Name="Description">Use this function to round a numeric value to a certain number of decimals. This function requires one value to perform the operation, one value specifies the number of decimals and returns one result value.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="number"/>
				<FunctionPoint ID="B" Name="decimal"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
	</FunctionTemplates>
</MapTemplateDescriptor>
```

### Templates/2/Programming.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<MapTemplateDescriptor>
	<FunctionTemplates Category="Programming">
		<FunctionTemplate ID="JScript">
			<Properties>
				<Property Name="Description">Use this function to execute custom JScript code. It can have any number of input and result values, which can be used in code. This function can be activated.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation"/>
				<FunctionPoint ID="A" Name="value" MaxCardinality="n"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result" MaxCardinality="n"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Java">
			<Properties>
				<Property Name="Description">Use this function to execute custom Java code. It can have any number of input and result values, which can be used in code. This function can be activated.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation"/>
				<FunctionPoint ID="A" Name="value" MaxCardinality="n"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result" MaxCardinality="n"/>
			</FunctionPoints>
		</FunctionTemplate>
	</FunctionTemplates>
</MapTemplateDescriptor>
```

### Templates/2/String.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<MapTemplateDescriptor>
	<FunctionTemplates Category="String">
		<FunctionTemplate ID="Concatenate">
			<Properties>
				<Property Name="Description">Use this function to concatenate series of string values. This function can have one or more input values and returns one result value.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="value" MaxCardinality="n"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Lowercase" Name="Lower Case">
			<Properties>
				<Property Name="Description">Use this function to convert text to lower case. This function requires one input value and returns one result value.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="value"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Uppercase" Name="Upper Case">
			<Properties>
				<Property Name="Description">Use this function to convert text to upper case. This function requires one input value and returns one result value.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="value"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Substring">
			<Properties>
				<Property Name="Description">Use this function to extract a part of a string value. This function requires one input value and returns one result value.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="value"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Size">
			<Properties>
				<Property Name="Description">Use this function to return the length of a string. This function requires one input value and returns one result value.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="value"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="NumericConversion" Name="Numeric Conversion">
			<Properties>
				<Property Name="Description">Use this function to convert the text value to the specified numeric format. This function requires one input value and returns one result value.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="value"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Trim">
			<Properties>
				<Property Name="Description">Use this function to trim the selected Padding Characters by the method specified by the Trim Type.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="value"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
	</FunctionTemplates>
</MapTemplateDescriptor>
```

### Templates/3/Copy.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<MapTemplateDescriptor>
	<FunctionTemplates Category="Copy">
		<FunctionTemplate ID="SimpleCopy" Name="Simple Copy">
			<Properties>
				<Property Name="Description">Use this function to simply copy one source field to a target field. This function requires one input value and returns one result. This function can be activated.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation" MinCardinality="0"/>
				<FunctionPoint ID="A" Name="value"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="ConditionalCopy" Name="Conditional Copy">
			<Properties>
				<Property Name="Description">Use this function to perform a condition-based copy of one or more source fields to a different target field. The condition can be a value of a qualifier field or any other parameter. This function can have any number of input and result values. This function can be activated.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation" MinCardinality="0"/>
				<FunctionPoint ID="A" Name="value" MaxCardinality="n"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result" MaxCardinality="n"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="ConversionalCopy" Name="Conversional Copy">
			<Properties>
				<Property Name="Description">Use this function to copy any source field to a target field with a conversion being performed during the copy operation. This function requires one input value and returns one result value.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="value"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Crosswalk">
			<Properties>
				<Property Name="Description">Use this function to perform a sophisticated conversion of a group of input values according to external Crosswalk map. This function may accept as many inputs as the number of source columns is in selected Crosswalk map. Function will return a result of lookup in the form of Data Set.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation"      MinCardinality="0"/>
				<FunctionPoint ID="VAL" Name="value"           MinCardinality="0" MaxCardinality="n"/>
				<FunctionPoint ID="DAT" Name="date"            MinCardinality="0"/>
				<FunctionPoint ID="CRT" Name="criterion"       MinCardinality="0" MaxCardinality="n"/>
				<FunctionPoint ID="TPK" Name="trading partner" MinCardinality="0"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="RES" Name="result"          MinCardinality="0" MaxCardinality="n"/>
				<FunctionPoint ID="CPL" Name="completion"/>
			</FunctionPoints>
		</FunctionTemplate>
	</FunctionTemplates>
</MapTemplateDescriptor>
```

### Templates/3/Date.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<MapTemplateDescriptor>
	<FunctionTemplates Category="Date/Time">
		<FunctionTemplate ID="SystemDateTime" Name="System Date/Time">
			<Properties>
				<Property Name="Description">Use this function to return the system date/time. This function only requires one input parameter to indicate the format to return the date/time. This function can be activated.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation" MinCardinality="0"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="ConvertDateTime" Name="Convert Date/Time">
			<Properties>
				<Property Name="Description">Use this function to change incoming date format. This function requires one input value and returns one result value.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="value"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
	</FunctionTemplates>
</MapTemplateDescriptor>
```

### Templates/3/General.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<MapTemplateDescriptor>
	<FunctionTemplates Category="Core">
		<FunctionTemplate ID="CreateVariable" Name="Create Variable">
			<Properties>
				<Property Name="Description">Use this function to store the value of the input to a variable. This function requires an input value to store and a variable name. This function can be activated.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation" MinCardinality="0"/>
				<FunctionPoint ID="A" Name="initial value"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="ChangeVariable" Name="Change Variable">
			<Properties>
				<Property Name="Description">Use this function to change the value of the referenced existing variable. This function requires an input value to store and a variable name. This function can be activated.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation" MinCardinality="0"/>
				<FunctionPoint ID="A" Name="value"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Increment">
			<Properties>
				<Property Name="Description">Use this function to increment a value of the referenced existing variable. This function does not have any inputs or outputs and can be activated only.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Decrement">
			<Properties>
				<Property Name="Description">Use this function to decrement a value of the referenced existing variable. This function does not have any inputs or outputs and can be activated only.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Clone">
			<Properties>
				<Property Name="Description">Use this function to provide explicit multiplexing abilities with a controlled order of execution for output connections. It can have a single source connection and provides a direct copy of the source to all output connections. Output connections will be executed in the order they are provided in the function. This function can be activated.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation" MinCardinality="0"/>
				<FunctionPoint ID="A" Name="value"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result" MaxCardinality="n"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="SetValue" Name="Set Value">
			<Properties>
				<Property Name="Description">Use this function to set a variable value or a constant to the target. This function can be activated.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation" MinCardinality="0"/>
				<FunctionPoint ID="A" Name="value"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="ActivateDataView" Name="Activate Data View">
			<Properties>
				<Property Name="Description">Use this function to specify when to start retrieving the information from Data View, storing the data in buffers. One or more data views can be created. This function does not have any inputs or outputs and can be activated only.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Error" Name="Error">
			<Properties>
				<Property Name="Description">Use this function to report an error during map execution. This function can have one or more inputs and no results. Function can be activated.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation" MinCardinality="0"/>
				<FunctionPoint ID="A" Name="value" MaxCardinality="n"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Exception" Name="Exception">
			<Properties>
				<Property Name="Description">Use this function to throw the User Exception with the specified message. This function can have one or more inputs and no results. Function can be activated.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation" MinCardinality="0"/>
				<FunctionPoint ID="A" Name="value" MaxCardinality="n"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="LookAhead" Name="Lookahead">
			<Properties>
				<Property Name="Description">Use this function to determine the data value that is coming ahead and apply this information to the current business task. Function must be activated.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="ClearBuffer" Name="Clear Buffer">
			<Properties>
				<Property Name="Description">Use this function to clear the buffer with the specified name. Function must be activated.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation"/>
			</FunctionPoints>
		</FunctionTemplate>
	</FunctionTemplates>
	<FunctionTemplates Category="Documentation">
		<FunctionTemplate ID="FreeForm" Name="Free Form">
			<Properties>
				<Property Name="Description">Use this function to describe any mapping for which there is no suitable existing function. This function can have any number of input and result values.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="value" MinCardinality="1" MaxCardinality="n"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result" MinCardinality="1" MaxCardinality="n"/>
			</FunctionPoints>
		</FunctionTemplate>
	</FunctionTemplates>
</MapTemplateDescriptor>
```

### Templates/3/Math.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<MapTemplateDescriptor>
	<FunctionTemplates Category="Math">
		<FunctionTemplate ID="Absolute">
			<Properties>
				<Property Name="Description">Use this function to return the absolute value of a numeric value. This function requires one input value and returns one result value.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="number"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Add">
			<Properties>
				<Property Name="Description">Use this function to add numeric values. This function requires one or more input values and returns one result value.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="number" MaxCardinality="n"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Subtract">
			<Properties>
				<Property Name="Description">Use this function to subtract numeric values. This function requires one or more input values and returns one result value.</Property>
			</Properties>
            <FunctionPoints Direction="Input">
                <FunctionPoint ID="A" Name="number"/>
                <FunctionPoint ID="B" Name="value" MaxCardinality="n"/>
            </FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="difference"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Multiply">
			<Properties>
				<Property Name="Description">Use this function to multiply numeric values. This function requires one or more input values and returns one result value.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="number" MaxCardinality="n"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Divide">
			<Properties>
				<Property Name="Description">Use this function to divide two numeric values. This function requires two input values and returns one result value.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="number"/>
				<FunctionPoint ID="B" Name="divisor"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Modulus">
			<Properties>
				<Property Name="Description">Use this function to divide two numeric values and get the remainder. This function requires two input values and returns one result value.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="number"/>
				<FunctionPoint ID="B" Name="divisor"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="remainder"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Round">
			<Properties>
				<Property Name="Description">Use this function to round a numeric value to a certain number of decimals. This function requires one value to perform the operation, one value specifies the number of decimals and returns one result value.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="number"/>
				<FunctionPoint ID="B" Name="decimal"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
	</FunctionTemplates>
</MapTemplateDescriptor>
```

### Templates/3/Programming.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<MapTemplateDescriptor>
	<FunctionTemplates Category="Programming">
		<FunctionTemplate ID="JScript">
			<Properties>
				<Property Name="Description">Use this function to execute custom JScript code. It can have any number of input and result values, which can be used in code. This function can be activated.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation" MinCardinality="0"/>
				<FunctionPoint ID="A" Name="value" MaxCardinality="n"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result" MaxCardinality="n"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Java">
			<Properties>
				<Property Name="Description">Use this function to execute custom Java code. It can have any number of input and result values, which can be used in code. This function can be activated.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation" MinCardinality="0"/>
				<FunctionPoint ID="A" Name="value" MaxCardinality="n"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result" MaxCardinality="n"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="NET" Name=".NET">
			<Properties>
				<Property Name="Description">Use this function to execute custom .NET code. It can have any number of input and result values, which can be used in code. This function can be activated.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation" MinCardinality="0"/>
				<FunctionPoint ID="A" Name="value" MaxCardinality="n"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result" MaxCardinality="n"/>
			</FunctionPoints>
		</FunctionTemplate>
	</FunctionTemplates>
</MapTemplateDescriptor>
```

### Templates/3/String.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<MapTemplateDescriptor>
	<FunctionTemplates Category="String">
		<FunctionTemplate ID="Concatenate">
			<Properties>
				<Property Name="Description">Use this function to concatenate series of string values. This function can have one or more input values and returns one result value.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="value" MaxCardinality="n"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Append">
			<Properties>
				<Property Name="Description">Use this function to append data using separators. This function can be activated.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation" MinCardinality="0"/>
				<FunctionPoint ID="A" Name="value"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Split">
			<Properties>
				<Property Name="Description">Use this function to split data using delimiters.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="value"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Lowercase" Name="Lower Case">
			<Properties>
				<Property Name="Description">Use this function to convert text to lower case. This function requires one input value and returns one result value.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="value"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Uppercase" Name="Upper Case">
			<Properties>
				<Property Name="Description">Use this function to convert text to upper case. This function requires one input value and returns one result value.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="value"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Substring">
			<Properties>
				<Property Name="Description">Use this function to extract a part of a string value. This function requires one input value and returns one result value.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="value"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Size">
			<Properties>
				<Property Name="Description">Use this function to return the length of a string. This function requires one input value and returns one result value.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="value"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="NumericConversion" Name="Numeric Conversion">
			<Properties>
				<Property Name="Description">Use this function to convert the text value to the specified numeric format. This function requires one input value and returns one result value.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="value"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Trim">
			<Properties>
				<Property Name="Description">Use this function to trim the selected Padding Characters by the method specified by the Trim Type.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="value"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
	</FunctionTemplates>
</MapTemplateDescriptor>
```

### Templates/4/Copy.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<MapTemplateDescriptor>
	<FunctionTemplates Category="Copy">
		<FunctionTemplate ID="SimpleCopy" Name="Simple Copy">
			<Properties>
				<Property Name="Description">Use this function to simply copy one source field to a target field. This function requires one input value and returns one result. This function can be activated.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation" MinCardinality="0"/>
				<FunctionPoint ID="A" Name="value"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="ConditionalCopy" Name="Conditional Copy">
			<Properties>
				<Property Name="Description">Use this function to perform a condition-based copy of one or more source fields to a different target field. The condition can be a value of a qualifier field or any other parameter. This function can have any number of input and result values. This function can be activated.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation" MinCardinality="0"/>
				<FunctionPoint ID="A" Name="value" MaxCardinality="n"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result" MaxCardinality="n"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="ConversionalCopy" Name="Conversional Copy">
			<Properties>
				<Property Name="Description">Use this function to copy any source field to a target field with a conversion being performed during the copy operation. This function requires one input value and returns one result value.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="value"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Crosswalk">
			<Properties>
				<Property Name="Description">Use this function to perform a sophisticated conversion of a group of input values according to external Crosswalk map. This function may accept as many inputs as the number of source columns is in selected Crosswalk map. Function will return a result of lookup in the form of Data Set.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation"      MinCardinality="0"/>
				<FunctionPoint ID="VAL" Name="value"           MinCardinality="0" MaxCardinality="n"/>
				<FunctionPoint ID="DAT" Name="date"            MinCardinality="0"/>
				<FunctionPoint ID="CRT" Name="criterion"       MinCardinality="0" MaxCardinality="n"/>
				<FunctionPoint ID="TPK" Name="trading partner" MinCardinality="0"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="RES" Name="result"          MinCardinality="0" MaxCardinality="n"/>
				<FunctionPoint ID="CPL" Name="completion"/>
			</FunctionPoints>
		</FunctionTemplate>
	</FunctionTemplates>
</MapTemplateDescriptor>
```

### Templates/4/Date.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<MapTemplateDescriptor>
	<FunctionTemplates Category="Date/Time">
		<FunctionTemplate ID="SystemDateTime" Name="System Date/Time">
			<Properties>
				<Property Name="Description">Use this function to return the system date/time. This function only requires one input parameter to indicate the format to return the date/time. This function can be activated.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation" MinCardinality="0"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="ConvertDateTime" Name="Convert Date/Time">
			<Properties>
				<Property Name="Description">Use this function to change incoming date format. This function requires one input value and returns one result value.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="value"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
	</FunctionTemplates>
</MapTemplateDescriptor>
```

### Templates/4/General.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<MapTemplateDescriptor>
	<FunctionTemplates Category="Core">
		<FunctionTemplate ID="ChangeVariable" Name="Change Variable">
			<Properties>
				<Property Name="Description">Use this function to change the value of the referenced existing variable. This function requires an input value to store and a variable name. This function can be activated.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation" MinCardinality="0"/>
				<FunctionPoint ID="A" Name="value"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Increment">
			<Properties>
				<Property Name="Description">Use this function to increment a value of the referenced existing variable. This function does not have any inputs or outputs and can be activated only.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Decrement">
			<Properties>
				<Property Name="Description">Use this function to decrement a value of the referenced existing variable. This function does not have any inputs or outputs and can be activated only.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Clone">
			<Properties>
				<Property Name="Description">Use this function to provide explicit multiplexing abilities with a controlled order of execution for output connections. It can have a single source connection and provides a direct copy of the source to all output connections. Output connections will be executed in the order they are provided in the function. This function can be activated.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation" MinCardinality="0"/>
				<FunctionPoint ID="A" Name="value"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result" MaxCardinality="n"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="SetValue" Name="Set Value">
			<Properties>
				<Property Name="Description">Use this function to set a variable value or a constant to the target. This function can be activated.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation" MinCardinality="0"/>
				<FunctionPoint ID="A" Name="value"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="ActivateDataView" Name="Activate Data View">
			<Properties>
				<Property Name="Description">Use this function to specify when to start retrieving the information from Data View, storing the data in buffers. One or more data views can be created. This function does not have any inputs or outputs and can be activated only.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Error" Name="Error">
			<Properties>
				<Property Name="Description">Use this function to report an error during map execution. This function can have one or more inputs and no results. Function can be activated.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation" MinCardinality="0"/>
				<FunctionPoint ID="A" Name="value" MaxCardinality="n"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Exception" Name="Exception">
			<Properties>
				<Property Name="Description">Use this function to throw the User Exception with the specified message. This function can have one or more inputs and no results. Function can be activated.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation" MinCardinality="0"/>
				<FunctionPoint ID="A" Name="value" MaxCardinality="n"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="LookAhead" Name="Lookahead">
			<Properties>
				<Property Name="Description">Use this function to determine the data value that is coming ahead and apply this information to the current business task. Function must be activated.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="ClearBuffer" Name="Clear Buffer">
			<Properties>
				<Property Name="Description">Use this function to clear the buffer with the specified name. Function must be activated.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation"/>
			</FunctionPoints>
		</FunctionTemplate>
	</FunctionTemplates>
	<FunctionTemplates Category="Documentation">
		<FunctionTemplate ID="FreeForm" Name="Free Form">
			<Properties>
				<Property Name="Description">Use this function to describe any mapping for which there is no suitable existing function. This function can have any number of input and result values.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="value" MinCardinality="1" MaxCardinality="n"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result" MinCardinality="1" MaxCardinality="n"/>
			</FunctionPoints>
		</FunctionTemplate>
	</FunctionTemplates>
</MapTemplateDescriptor>
```

### Templates/4/Math.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<MapTemplateDescriptor>
	<FunctionTemplates Category="Math">
		<FunctionTemplate ID="Absolute">
			<Properties>
				<Property Name="Description">Use this function to return the absolute value of a numeric value. This function requires one input value and returns one result value.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="number"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Add">
			<Properties>
				<Property Name="Description">Use this function to add numeric values. This function requires one or more input values and returns one result value.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="number" MaxCardinality="n"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Subtract">
			<Properties>
				<Property Name="Description">Use this function to subtract numeric values. This function requires one or more input values and returns one result value.</Property>
			</Properties>
            <FunctionPoints Direction="Input">
                <FunctionPoint ID="A" Name="number"/>
                <FunctionPoint ID="B" Name="value" MaxCardinality="n"/>
            </FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="difference"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Multiply">
			<Properties>
				<Property Name="Description">Use this function to multiply numeric values. This function requires one or more input values and returns one result value.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="number" MaxCardinality="n"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Divide">
			<Properties>
				<Property Name="Description">Use this function to divide two numeric values. This function requires two input values and returns one result value.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="number"/>
				<FunctionPoint ID="B" Name="divisor"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Modulus">
			<Properties>
				<Property Name="Description">Use this function to divide two numeric values and get the remainder. This function requires two input values and returns one result value.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="number"/>
				<FunctionPoint ID="B" Name="divisor"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="remainder"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Round">
			<Properties>
				<Property Name="Description">Use this function to round a numeric value to a certain number of decimals. This function requires one value to perform the operation, one value specifies the number of decimals and returns one result value.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="number"/>
				<FunctionPoint ID="B" Name="decimal"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
	</FunctionTemplates>
</MapTemplateDescriptor>
```

### Templates/4/Programming.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<MapTemplateDescriptor>
	<FunctionTemplates Category="Programming">
		<FunctionTemplate ID="JScript" Name="JavaScript">
			<Properties>
				<Property Name="Description">Use this function to execute custom JavaScript code. It can have any number of input and result values, which can be used in code. This function can be activated.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation" MinCardinality="0"/>
				<FunctionPoint ID="A" Name="value" MaxCardinality="n"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result" MaxCardinality="n"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Java">
			<Properties>
				<Property Name="Description">Use this function to execute custom Java code. It can have any number of input and result values, which can be used in code. This function can be activated.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation" MinCardinality="0"/>
				<FunctionPoint ID="A" Name="value" MaxCardinality="n"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result" MaxCardinality="n"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="NET" Name=".NET">
			<Properties>
				<Property Name="Description">Use this function to execute custom .NET code. It can have any number of input and result values, which can be used in code. This function can be activated.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation" MinCardinality="0"/>
				<FunctionPoint ID="A" Name="value" MaxCardinality="n"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result" MaxCardinality="n"/>
			</FunctionPoints>
		</FunctionTemplate>
	</FunctionTemplates>
</MapTemplateDescriptor>
```

### Templates/4/String.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<MapTemplateDescriptor>
	<FunctionTemplates Category="String">
		<FunctionTemplate ID="Concatenate">
			<Properties>
				<Property Name="Description">Use this function to concatenate series of string values. This function can have one or more input values and returns one result value.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="value" MaxCardinality="n"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Append">
			<Properties>
				<Property Name="Description">Use this function to append data using separators. This function can be activated.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="_AP" Name="activation" MinCardinality="0"/>
				<FunctionPoint ID="A" Name="value"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Split">
			<Properties>
				<Property Name="Description">Use this function to split data using delimiters.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="value"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Lowercase" Name="Lower Case">
			<Properties>
				<Property Name="Description">Use this function to convert text to lower case. This function requires one input value and returns one result value.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="value"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Uppercase" Name="Upper Case">
			<Properties>
				<Property Name="Description">Use this function to convert text to upper case. This function requires one input value and returns one result value.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="value"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Substring">
			<Properties>
				<Property Name="Description">Use this function to extract a part of a string value. This function requires one input value and returns one result value.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="value"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Size">
			<Properties>
				<Property Name="Description">Use this function to return the length of a string. This function requires one input value and returns one result value.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="value"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="NumericConversion" Name="Numeric Conversion">
			<Properties>
				<Property Name="Description">Use this function to convert the text value to the specified numeric format. This function requires one input value and returns one result value.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="value"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="NameNormalization" Name="Name Normalization">
			<Properties>
				<Property Name="Description">Use this function to implement Operating Rules\CAQH CORE Rule 258. It normalizes the name in the way described in the rule allowing certain customization defined in the function settings.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="value"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
		<FunctionTemplate ID="Trim">
			<Properties>
				<Property Name="Description">Use this function to trim the selected Padding Characters by the method specified by the Trim Type.</Property>
			</Properties>
			<FunctionPoints Direction="Input">
				<FunctionPoint ID="A" Name="value"/>
			</FunctionPoints>
			<FunctionPoints Direction="Output">
				<FunctionPoint ID="X" Name="result"/>
			</FunctionPoints>
		</FunctionTemplate>
	</FunctionTemplates>
</MapTemplateDescriptor>
```
