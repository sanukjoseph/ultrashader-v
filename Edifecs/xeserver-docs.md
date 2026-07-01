---
title: "Edifecs XEServer — Complete Documentation"
source: "https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/"
generated: "2026-06-29"
total_pages: 65
pages_ok: 65
---

# Edifecs XEServer — Complete Documentation

| | |
|---|---|
| **Source** | [Edifecs XEServer 9.4 Help](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/) |
| **Generated** | Mon, 29 Jun 2026 20:50:22 GMT |
| **Pages** | 65 captured / 0 failed / 65 total |

---

## Table of Contents

- [XEServer Agent](#xeserver-agent)
- [Environment](#environment)
  - [XEServer Environment Overview](#xeserver-environment-overview)
  - [Environment Tab](#environment-tab)
  - [Effective Tab](#effective-tab)
  - [Startup Tab](#startup-tab)
  - [Cloud Account Tab](#cloud-account-tab)
  - [Auto-Discovery Tab](#auto-discovery-tab)
  - [XEServer Environment Loading Order](#xeserver-environment-loading-order)
- [Profiles](#profiles)
  - [XEServer Profiles Overview](#xeserver-profiles-overview)
  - [Create a New Profile](#create-a-new-profile)
  - [Manage XEServer Profiles](#manage-xeserver-profiles)
  - [Use Log Viewer](#use-log-viewer)
  - [Profile Workspace](#profile-workspace)
  - [Create Profile Documentation](#create-profile-documentation)
- [Services](#services)
  - [XEServer Services Overview](#xeserver-services-overview)
  - [Supported Services](#supported-services)
  - [Create a New Service](#create-a-new-service)
  - [Generic Service Settings](#generic-service-settings)
- [Routes](#routes)
  - [XEServer Routes Overview](#xeserver-routes-overview)
  - [EAM Route Editor](#eam-route-editor)
  - [Route Work Flow](#route-work-flow)
  - [Create a New Route](#create-a-new-route)
  - [Route Properties](#route-properties)
  - [Route Dependencies](#route-dependencies)
  - [Route Quality of Service Settings](#route-quality-of-service-settings)
- [Route Components](#route-components)
  - [Route Components Overview](#route-components-overview)
  - [Work with Components](#work-with-components)
  - [Route Connection Types](#route-connection-types)
  - [Component Properties](#component-properties)
  - [Component Output Properties](#component-output-properties)
  - [Component QoS Tab](#component-qos-tab)
  - [Component Events Tab](#component-events-tab)
  - [Component Breakpoints Tab](#component-breakpoints-tab)
- [Log Analyzer](#log-analyzer)
  - [Log Analyzer Overview](#log-analyzer-overview)
  - [Work with Event Log Files](#work-with-event-log-files)
  - [Log Report](#log-report)
    - [Log Report Overview](#log-report-overview)
    - [Create a New Report](#create-a-new-report)
    - [Work with Reports](#work-with-reports)
      - [Work with Reports Overview](#work-with-reports-overview)
      - [Files Tab](#files-tab)
      - [Sessions Tab](#sessions-tab)
      - [Service Report Tab](#service-report-tab)
      - [Route Report Tab](#route-report-tab)
      - [Commands Tab](#commands-tab)
      - [Problem Tasks Tab](#problem-tasks-tab)
      - [Errors Tab](#errors-tab)
      - [Parse Errors Tab](#parse-errors-tab)
  - [Log Extraction](#log-extraction)
    - [Log Extraction Overview](#log-extraction-overview)
    - [Create a New Log Extraction](#create-a-new-log-extraction)
    - [Work with Log Extraction](#work-with-log-extraction)
  - [Command Line Tools for Log Analyzing](#command-line-tools-for-log-analyzing)
    - [Log Analyzer Command Line Tool](#log-analyzer-command-line-tool)
    - [Log Extractor Command Line Tool](#log-extractor-command-line-tool)
  - [Log Analyzer Use Cases](#log-analyzer-use-cases)
- [Tools](#tools)
  - [Encryption Tool](#encryption-tool)
- [SDK Directory](#sdk-directory)

---

## Content

---

<a id="xeserver-agent"></a>

## XEServer Agent

> 📄 Source: [XEServer_Agent.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/XEServer_Agent.htm)

### XEServer Agent


Each XEServer installation includes an XEServer agent - a connectivity module that acts as a supervisor over XEServer profiles. The main tasks of an XEServer agent are the following:

- Monitors the structure and health status of XEServer profiles and reports this data to XESManager in real time.
- Gathers statistics from XEServer profiles and reports to XESManager in an aggregated form.
- Receives control commands from XESManager (START, STOP, and so on) and executes the commands on profiles.


By default, an XEServer agent automatically starts as a separate process as soon as you start any XEServer profile. You can disable automatic agent startup and use the scripts in the directory ${XESRoot}\bin\agent to start and stop the agent.


#### Agent Registration


Before an XEServer agent can communicate with XESManager, the agent must be [registered](https://help.edifecsfedcloud.com/svc/product/xesmanager/9.4/Content/XEServer_Agents_Overview.htm#AgentRegistration) in XESManager. By default, XESManager automatically registers the agent that belongs to the local XEServer installation (${ECRootPath}\XEServer).


Tip If you observe authorization errors when you register an agent (typically, this may happen after XEServer upgrade or re-installation), run the cleanup_security_key.bat(.sh) script to generate new encryption keys. The script is located in ${XESRoot}\bin\agent\.


###### Agent auto-discovery


**Note** When XEServer and XESManager are installed on the same machine, auto-discovery has to be set to *false*. If auto-discovery is required, configure manually the correct host and then enable auto-discovery. Enabling auto-discovery without setting the correct host works in case XEServer and XESManager are installed on different machines.


When you register a new agent, you have to manually provide the agent's host name and port number in the XESManager web interface. However, instead of manual registration, you can make use of the [Agent auto-discovery](https://help.edifecsfedcloud.com/svc/product/xesmanager/9.4/Content/Agent_AutoDiscovery.htm) feature. With this feature, when an agent starts, it automatically submits a registration request to XESManager. You can configure auto-discovery settings in following ways:

- In EAM, on the [Auto-discovery](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Autodiscovery_Tab.htm) tab of the XEServer environment. This is the recommended and the most convenient way.
- By editing the discovery file under ${XESRoot}\platform\etc. This file lists all the supported properties with brief descriptions. Also, the file lists environment variables that you can declare in your OS/XES environment to configure auto-discovery behavior in systems without GUI (Docker).
- By editing startup.ini under ${XESRoot}\platform\etc. You can use the environment properties listed in the discovery file.


Note Auto-discovery settings have the following priority (from highest to lowest): - OS environment - XEServer environment - discovery file / EAM interface


#### Run agent as a Windows service


You can configure an XEServer agent to run as a Windows service. To do this:

1. Go to ${XESRoot}\platform\agent\win-service.
2. Run install_service.bat as administrator.
3. Run start_service.bat to start the service.


#### Enable/Disable XEServer agent


By default, an XEServer agent is enabled and automatically starts when you start any profile. To disable the agent, use the following properties in the startup.ini file located at ${XESRoot}\platform\etc.

- `-Dcom.edifecs.xeserver.controller.agent.start=[false|true]`: If set to `true` (default value), XEServer profiles try to start the agent process if they detect that the agent is offline. If set to `false`, the agent does not start with profiles. In this case, you can manually control the agent life cycle by using the start-agent.bat and stop-agent.bat scripts under ${XESRoot}\bin\agent.
- `-Dcom.edifecs.xeserver.controller.agentclient.start=[false|true]`: If set to `true` (default value), XEServer profiles try to connect to the agent to send and receive runtime metrics. If set to `false`, the agent will not receive runtime metrics from XEServer profiles. In this case, if the agent is still running, XESManager displays the agent as online, but all the profiles as offline.


#### XEServer agent memory consumption


By default, the XEServer agent process starts with the `-Xmx2g` JVM flag which means that it can consume up to 2 GB of RAM. This value is sufficient for most of the business cases, however, if you want to increase this value, you should specify a custom `-Xmx` value in ${XESRoot}\platform\agent\etc\startup.ini.


#### Container mode


If you run XEServer profile configurations in a containerized environment, read [this topic](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/XEServer_in_Containerized_Environments.htm) to learn about the required changes in settings.

---

<a id="environment"></a>

## Environment

> 📄 Source: [Book_Environment.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Book_Environment.htm)

### Environment
[Redirect TO: {XEServer_Environment.htm}](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/XEServer_Environment.htm)

---

<a id="xeserver-environment-overview"></a>

### XEServer Environment Overview

> 📄 Source: [XEServer_Environment.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/XEServer_Environment.htm)

#### XEServer Environment Overview


Using XEServer Environment, you can declare global variables that can be referenced from your routes at run time. Global variables are available for all XEServer profiles. To set a variable which is available only within a specific profile, use the [Profile Environment Tab](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Profile_Environment_Tab.htm).


Note If there is a profile configuration currently opened in EAM and you make an update to XEServer environment, such update is not reflected on the route [Effective Properties tab](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Effective_Tab.htm) until you close the profile configuration and opened it again.

---

<a id="environment-tab"></a>

### Environment Tab

> 📄 Source: [Environment_Tab.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Environment_Tab.htm)

#### Environment Tab


On this tab, you can define global XEServer environment properties available for all profiles.



##### Environment Properties Declaration


XEServer stores all environment properties in groups - Environment properties categories. These are containers used to group logically related properties. To define a new environment property, first you have to create a new Environment properties category and then you can add properties to this category. XEServer stores each properties category as a separate .properties file on the file system.


##### Environment Properties Usage


To reference a property defined on this tab, use the notation ${propertyName}. For example, when you configure an XEServer entity (a service, a route, or a route component), you can reference the environment properties as shown in the image below:



##### Encrypted Properties


You can make your Environment properties categories encrypted. This means that all the properties in such a category are stored in an encrypted form. To create an encrypted category, select the option Encrypted properties file when you create a new Environment properties category as shown in the image:



Note Once your properties are encrypted, you cannot bring your environment properties file (.properties) back to the decrypted form.


When you configure a route component and have to specify a password (or other sensitive data) in the component's settings, a best practice is to store your password as an encrypted environment property and then reference this property in the component configuration (for example, ${myPassword}).


You can also create and change encrypted properties using command-line [Crypto tool](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Encryption_Tool.htm).

---

<a id="effective-tab"></a>

### Effective Tab

> 📄 Source: [Effective_Tab.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Effective_Tab.htm)

#### Effective Tab


On this tab you can view the full list of XEServer and operating system variables in the read-only mode:

---

<a id="startup-tab"></a>

### Startup Tab

> 📄 Source: [Startup_Tab.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Startup_Tab.htm)

#### Startup Tab


On this tab, you can specify JVM parameters (-Xmx, -Xrs, Garbage Collection settings, and so on) to be used when starting XEServer profiles:

---

<a id="cloud-account-tab"></a>

### Cloud Account Tab

> 📄 Source: [Cloud_Account_Tab.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Cloud_Account_Tab.htm)

#### Cloud Account Tab


On this tab, you can enter credentials to enable access to [Smart Trading Cloud services](https://help.edifecsfedcloud.com/SmartTradingCloud/Content/Home.htm) for the features that require authentication at Smart Trading Cloud (for example, [Cloud Archive components](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Cloud_Archive_Components_Overview.htm), [Cloud selector](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/XEngine_Service.htm#Authentication), and so on). Credentials specified on this tab can be used by these components in all profiles.



You can provide credentials of two types:

- User credentials: a username-password pair used to access your Smart Trading Account.
- Application credentials: a special token used for programmatic access to your Smart Trading Account. In this case, you can either feed credentials.stcc file to EAM or enter the token string. For more information on how to get application credentials, see [Application Users](https://help.edifecsfedcloud.com/SmartTradingCloud/Content/Application_Users.htm).


Note When you update ST credentials on this tab, the credentials are also updated on the [Profile Cloud Account Tab](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Profile_Cloud_Account_Tab.htm).


##### Smart Trading Cloud domain


By default, XEServer connects to the Smart Trading Account service hosted on [https://edifecsfedcloud.com](https://edifecsfedcloud.com/). If you want to work with the Smart Trading Cloud services hosted on a different domain (for example, www.cоllablynk.com), uncomment the required domain name in ${ECRootPath}\Common\cloud.properties. After you update the file, EAM restart is required.

---

<a id="auto-discovery-tab"></a>

### Auto-Discovery Tab

> 📄 Source: [Autodiscovery_Tab.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Autodiscovery_Tab.htm)

#### Auto-Discovery Tab


On this tab, you can define auto-discovery settings for an [XEServer agent](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/XEServer_Agent.htm). If the auto-discovery function is enabled for an agent, XESManager can automatically detect the agent when the agent starts.


By default, registering an XEServer agent in XESManager requires a manual setup. For example, if you want to distribute an XEServer configuration among different environments (docker, AWS cloud, desktop, and so on) and want to control all the XEServer instances through XESManager, then you have to register each XEServer agent in the XESManager web interface. The agent auto-discovery feature allows you to automate this step. With auto-discovery, you include the XESManager address into your XEServer configuration. When such a configuration is deployed and the agent starts, it notifies XESManager (using the address stored in the XEServer configuration) about the new agent location . This way, XESManager can automatically detect and register the agents with auto-discovery enabled. For more information, see the XESManager [Agent Auto-Discovery](https://help.edifecsfedcloud.com/svc/product/xesmanager/9.4/Content/Agent_AutoDiscovery.htm) page.


##### Auto-Discovery Settings


The following settings are available on the Auto-Discovery tab:


*Field Description Enable auto-discovery Select to enable the auto-discovery function for your XEServer agent. **Note** When XEServer and XESManager are installed on the same machine, auto-discovery has to be set to false*. If auto-discovery is required, configure manually the correct host and then enable auto-discovery. Enabling auto-discovery without setting the correct host works in case XEServer and XESManager are installed on different machines.








XESManager connection settings


In this section, you specify the location of XESManager host.






 Host


 Enter the name of the host where XESManager is running.




 Port


 Enter the port number to be used for the connection.




 Base URL


 The base RESTful endpoint for sending requests. Use the default value unless you have changed XESManager settings that affect RESTful URL.




 HTTP timeout


 Set the time frame in seconds during which the connection to XESManager must be established.




 Authentication token


 Enter a token to authenticate the auto-discovery requests to XESManager. If the token authentication is enabled on the XESManager side, XEServer agents must provide a valid token to access the XESManager auto-discovery API. This token is generated on the XESManager [Agents](https://help.edifecsfedcloud.com/svc/product/xesmanager/9.4/Content/Agent_AutoDiscovery.htm) page. If the value is empty, the token authentication is disabled.




 Enable SSL


 Select this option if you want your agent to send registration requests over the SSL-secured channel. During the registration phase, XEServer agent acts as a client, and XESManager represents the server side.






Trusted Store


The trusted store contains XESManager certificates to identify XESManager as a trusted party.






 Enable hostname validation


 If selected, XEServer compares XESManager's host name with the host name in the certificate (the certificate sent to XEServer by XESManager). If the names do not match, the SSL connection is not established.




 Path


 Enter the path to a truststore with trusted certificates.




 Password


 Enter the password to the truststore. The default password is "password".






Key store


If the client authentication is enabled on the server (XESManager), this key store kicks in. The key store contains XEServer agent's key pairs (a private key and a certificate with a public key) used by XESManager to validate the XEServer's identity.






 Path


 Enter the path to the keystore file that contains key pair entries.




 Password


 Enter the password to the keystore.




 Key password


 Enter the password to the key pair.






XEServer agent settings






 Heartbeat


 The time interval at which the agent notifies XESManager that the agent is up and running. XEServer shares the heartbeat value with XESManager, so if XESManager does not receive a heartbeat request within the expected interval from the agent, this agent is considered inaccessible.




 Description


 The description of the agent. This description will be visible in XESManager interface.




 XESManager Group


 The agent group. The agent will be displayed under the specified group in XESManager interface.







Agents auto-discovery can also be configured using the file [discovery](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/XEServer_Agent.htm#Discovery) available in the folder ${XESRoot}\platform\etc\discovery or the file [startup.ini](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/XEServer_Agent.htm#StartUpIni) available in the folder ${XESRoot}\platform\etc.

---

<a id="xeserver-environment-loading-order"></a>

### XEServer Environment Loading Order

> 📄 Source: [XEServer_Environment_Loading_Order.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/XEServer_Environment_Loading_Order.htm)

#### XEServer Environment Loading Order


When started, XEServer loads environment properties in the following order:

1. Profile environment
2. Global XEServer environment
3. Profile startup properties (${XESRoot}\profiles\<profileName>\etc\startup.ini)
4. Global XEServer startup properties (${XESRoot}\platform\etc\startup.ini)
5. Operating system environment
6. XEServer route environment


Note EAM ignores system properties defined in the startup.ini files using the "-D" parameter.

---

<a id="profiles"></a>

## Profiles

> 📄 Source: [Book_Profiles.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Book_Profiles.htm)

### Profiles
[Redirect TO: {XEServer_Profiles_Overview}](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/XEServer_Profiles_Overview.htm)

---

<a id="xeserver-profiles-overview"></a>

### XEServer Profiles Overview

> 📄 Source: [XEServer_Profiles_Overview.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/XEServer_Profiles_Overview.htm)

#### XEServer Profiles Overview


An XEServer profile is an isolated processing environment within XEServer which typically performs one or more end-to-end data flow tasks. Splitting and grouping data orchestration tasks among multiple profiles makes your work with EDI more scalable and easy-to-maintain. Once you have configured a profile to perform a certain task, you can easily share it with other users or migrate the profile using in-build XEServer migration capabilities.


You can think of a profile as a sandbox that:

- Runs as a separate process in the operating system
- Can be controlled both locally and remotely
- Has a limited amount of resources allocated to it
- Has a private environment to store profile-private data
- Has an access to the XEServer global environment
- Has its own logger to trace the profile life cycle


XEServer profiles contain routes and services that make up actual data processing flow. One profile may contain one or more routes and services at a time. Each profile has a configurable built-in logging system that logs events that occur inside the profile.


You can control the execution of an XEServer profile in the following ways:

- By using Edifecs Application Manager Admin Console. This is the most common way to manage XEServer profiles through an intuitive user interface.
- By using Edifecs XESManager. Allows to control a profile from any location through the web interface. Also, provides detailed information about XEServer profiles and offers additional features such as alerts, event notifications, real-time and periodical statistics, and so on.
- By using an SSH client. You can connect to a profile using a traditional SSH client.


[Edifecs Library](https://help.edifecsfedcloud.com/Library/Content/Home_Edifecs_Library_Profiles.htm) hosts a repository of preconfigured sample profiles that demonstrates you how to solve common EDI tasks and shows best practices on XEServer usage. Before you create a new profile from scratch, consult [Edifecs Library](https://help.edifecsfedcloud.com/Library/Content/Home_Edifecs_Library_Profiles.htm). The number of sample profiles in the repository continuously increases and probably, the solution you are seeking for is already there.


For more information on how to create and start profiles, see Create and Start Profiles.

---

<a id="create-a-new-profile"></a>

### Create a New Profile

> 📄 Source: [Create_a_New_Profile.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Create_a_New_Profile.htm)

#### Create a New Profile


To create a new profile:

1. Open Edifecs Application Manager (EAM).
2. On the EAM System tab, right-click Profiles and then click New. The following dialog box displayed:*[Image: New Profile]*
3. Select a template you want to use for the new profile. You can select templates from following locations: - Local: Select to use a local template provided with XEServer installation. - Edifecs Library: Select to pull a template from the [Edifecs Library](https://help.edifecsfedcloud.com/Library/Content/Create_and_Start_XEServer_Profiles.htm). Edifecs Library is a directory in your Smart Trading Cloud Repository that contains XEServer profile images ready to be deployed into your XEServer installation. To access Edifecs Library, you should have a Smart Trading Cloud Repository Account .

1. In the Profile Name, enter the name for your profile.
2. Click OK.


##### Set Profile Ports


By default, when you create a new profile, XEServer automatically generates TCP ports (JMX, SSH, HTTP, HTTPS) to be used by the profile.


Note If you choose to generate ports automatically, XEServer makes sure that the generated port does not conflict with other XEServer profiles. However, you must ensure that the generated port does not conflict with other processes in the operating system.


To change the ports for an existing profile, use [Admin Console](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Admin_Console_Overview.htm#In).


To reduce the chance of a conflict, you can explicitly ban specific ports (for example, those ports occupied by other running applications) so that these ports are never used to create a new profile. To do this, you should add the reserved port to the special black list file C:\Edifecs\XEServer\platform\etc\reserved-ports.config. When XEServer generates ports for a new profile, XEServer excludes the ports defined in this file.


As an alternative, you can specify custom port values for your profile. To do this, clear the Generate ports check box and specify corresponding port values. For all the four protocols, you can specify any port number that is within the range 1000 - 65535. If the port you have specified is occupied by another XEServer profile, you receive a warning.

---

<a id="manage-xeserver-profiles"></a>

### Manage XEServer Profiles

> 📄 Source: [Manage_XEServer_Profiles.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Manage_XEServer_Profiles.htm)

#### Manage XEServer Profiles


Using the Admin console, you can create several profiles for XEServer to work simultaneously with different servers. One profile is created for each server. You can create as many profiles as you want, but the number that can be started simultaneously is controlled by your license.


The Admin console also displays an activity chart that graphically shows activity for all started servers and general CPU usage. On the Outline tab, click profiles and the chart is displayed on the Detail tab.


*[Image: Profile chart]*


The Summary CPU loading chart shows activity for all XEngine servers and services and lists the tasks that are being performed. When some services are active and no tasks are started, Summary CPU loading is the only way to see that some actions are being performed.


The CPU usage diagram graphically displays loading of all the available profiles and general CPU loading. There are several options of what can be displayed on the CPU usage diagram.

- CPU usage. Shows general CPU usage by all the profiles in XEServer.
- Load. Shows profiles loading in scope of the XEServer.
- Time range. Sets the timeline range to be displayed.

---

<a id="use-log-viewer"></a>

### Use Log Viewer

> 📄 Source: [Profile_Log_Viewer.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Profile_Log_Viewer.htm)

#### Profile Log Viewer


With Log Viewer, you can view logs generated by an XEServer profile. By default, XEServer stores the profile logs at ${XESRoot}\profiles\<yourProfileName>\log (default XEServer environment property XESLog). However, you can select a custom location to store the profile logs.


To configure the logs location:

1. Declare the property XESLog on the profile [Environment](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Environment_Tab.htm) tab so that the property value points to a new location for storing log files.
2. Save the configuration to override the default logs location.
3. Restart the profile for changes to take effect. Log Viewer automatically picks up log files from the new XESLog location


Note After you add the new property XESLogand save the configuration, reopen Log Viewer User Interface in Edifecs Application Manager to pick up logs from the updated XESLog path.


To view the profile logs:

1. On the EAM System tab, expand XEServer, and then expand the profile you want to work with.
2. Double-click Log Viewer. Logs saved for the current profile are displayed on the Outline tab:*[Image: XEServer.LogViewer]*
3. Select a log you need to view in the Details pane:*[Image: Log Details pane]*


If a log file is too large, Log Viewer splits the file into pages (~5MB each). You can navigate between the pages using the Home, Next, Previous, and End controls on the right. Use the Auto refresh option to refresh the log file contents automatically as the log files are constantly updated with new events.


For more information about the log files, see [Log Files Types](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Log_Files_Types.htm).

---

<a id="profile-workspace"></a>

### Profile Workspace

> 📄 Source: [Profile_Workspace.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Profile_Workspace.htm)

#### Profile Workspace


Each XEServer profile has a workspace directory that serves multiple purposes. By default, the workspace is located in the folder ${XESRoot}\profiles\<YourProfileName>\workspace and can be used for:

- submitting data for processing on the routes of the profile;
- storing the data processing results or an interim state of data;
- storing start-up logs;
- storing temporary files and/or folders required during processing. The folder ${XESRoot}\XEServer\profiles\<YourProfileName>\workspace\temp is created once the profiles start and can contain the various temporary files and/or folders. Click to view possible temporary files and folders. - SmartStream files that correspond to exchange messages with a large amount of content (more than 64 Kb) transmitted between XEServer components and that are currently being processed. - XEngine auxiliary data used in a BDF (big data processing file) mode. - The .jppf folder that contains JMX library files used for communication between XEServer and Edifecs Application Manager. - The cache-<UUID> folder that contains OSGI Felix frameworks bundles used for faster processing. - The jetty folders that contain unpacked WAR files with information on XEServer web applications. You can set a certain cleanup action to clean up files from the temp folder each time XEServer starts.To set a cleanup action for the temp folder: 1. In Edifecs Application Manager, on the System tab, expand XEServer. 2. In Profiles, expand the profile for which you want to clean up temporary files/folders, and then double-click Configuration. 3. On the Cleanup tab, in Cleanup configuration, select ${XESWorkspace}/temp (the path to the folder that you want to clean up), and then click Edit. 4. In the Edit Cleanup Path dialog , in Cleanup action, select one of the following actions: 5. Recursive: removes all the files and folders from the temp folder each time XEServer starts. 6. Non-recursive: removes only the files stored in the temp folder each time XEServer starts. Folders remain untouched. 7. None: does not remove anything from the temp folder each time XEServer starts. 8. Click OK, and then press Ctrl+S to save the changes. ### Change the workspace folder location To change the default location of the workspace folder for all XEServer profiles: 1. In Edifecs Application Manager, on the tab System, expand XEServer. 2. Double-click Admin Console and shut down all the profiles that are currently running. 3. On the System tab, double-click Environment. 4. On the Environment tab, click New to add a new Environment property category. 5. Enter a name for the category (for example, Workspace) and click Finish. 6. Click New again, and, in the displayed dialog, select Environment property. 7. Click Next and then, in Name, enter XESWorkspace, and in Value, enter the path to the folder you want to use. The new location becomes effective once you start your XEServer profiles.To change the default location of the workspace folder for a specific profile: 1. In Edifecs Application Manager, on the tab System, expand XEServer. 2. Double-click Admin Console and shut down the profile you need if it is currently running. 3. On the System tab, expand Profiles, and then expand the profile you need. 4. Double-click Configuration. 5. On the profile Environment tab, click New to add a new Environment property category. 6. Enter a name for the category (for example, Workspace) and click Finish. 7. Click New again, and, in the displayed dialog, select Environment property. 8. Click Next and then, in Name, enter XESWorkspace, and in Value, enter the path to the folder you want to use. The new location becomes effective once you start your XEServer profile. ### Change the temp folder location During data processing, if a file being processed is large in size, the temporary files in the temp folder may occupy significant amount of space on your disk. This may lead to a task failure for a certain profile due to not having enough space available for processing. To avoid this issue, you can change the temp folder location (for example, to use a remote location). To do this, use one of the following options (in order of priority): - Set the [XEngine parameter](https://help.edifecsfedcloud.com/go/xengine/9.4/Content/XEngine_Parameters.htm) XEngine.Settings.TemporaryStorageLocation in the XERegistry file and specify the required location as the value. - Use one of the following environment variables in a profile configuration: XETMP or TEMP or TMP. If none of the above are defined, the default folder location is used (${XESRoot}\XEServer\profiles\<YourProfileName>\workspace\temp).

---

<a id="create-profile-documentation"></a>

### Create Profile Documentation

> 📄 Source: [Create_Profile_Documentation.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Create_Profile_Documentation.htm)

#### Create Profile Documentation


Creating Profile Documentation option gives the customers an opportunity to create a package with the profile documentation by using Edifecs Application Manager. The package contains:

- report in xml format with the list of the services and components used in the profile
- common report with the description of the profile, structure of the routes, and the list of the services used in the profile
- route reports, which consists of the structure of the route and the description of the route components


To create profile documentation:

1. Start Edifecs Application Manager.
2. On the System tab, expand XEServer.
3. Expand the profile that you need.
4. Double-click Configuration.
5. On the Outline tab, right-click the name of the profile, and then click Create Profile Documentation.
6. Provide the path to the folder where you want the package to be stored.
7. Click OK.


All the information about the routes and the route components is taken from the description provided as a note on the Overview tab in the Edifecs Application Manager.


*[Image: Route component properties Note]*


Note If this information is not provided, the corresponding sections of the route report are empty.


The package also contains the screen shots of the routes. They are stored in the resources folder. If you need only the screen shots of the routes without any other information, it is not necessary to create the whole profile documentation package.


To capture the screen shot of the route:

1. Right-click the route, and then click Save Route As Image.


*[Image: Save Route as Image]*

1. Provide the path to the folder where you want the images to be stored.
2. Choose the format in which you want to save the image. The available formats are .png, .jpeg and .bmp.
3. Click Save.

---

<a id="services"></a>

## Services

> 📄 Source: [Book_Services.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Book_Services.htm)

### Services
[Redirect TO: {XEServer_Services_Overview.htm}](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/XEServer_Services_Overview.htm)

---

<a id="xeserver-services-overview"></a>

### XEServer Services Overview

> 📄 Source: [XEServer_Services_Overview.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/XEServer_Services_Overview.htm)

#### XEServer Services Overview


XEServer has a service-oriented design where certain functional capabilities are enclosed in services. An XEServer service is a reusable module that encapsulates certain functionality such as:

- maintaining a connection to a database
- spinning up an embedded web server
- establishing a connection to third-party services
- providing communication with other Edifecs products, and so on.


XEServer comes with a wide range of services, to see the full list, click [here](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Supported_Services.htm).


Typically, a service is linked to one or more [route components](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Route_Components_Overview.htm), exposing its functionality to the linked component(s), so services are mostly used in combination with route components. This is very convenient since you have to provide configuration parameters in one place (on a service level) and have multiple dependent components that refer to the same configuration.


Tip When you add a new route component which requires a service, the corresponding service is automatically created and linked to the new component.


However, some route components are "self-sufficient" and do not need a service to function.

---

<a id="supported-services"></a>

### Supported Services

> 📄 Source: [Supported_Services.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Supported_Services.htm)

#### Supported Services


The following XEServer services are available:


BCounters

- [BCounter Service](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Balance_Counter_Service.htm): Used to work with Balance Counters functionality.


Batcher

- [Batcher Service](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Batcher_Service.htm): Used to work with [Batcher](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Batching_Overview.htm) functionality.


Cloud

- [Amazon S3 Service](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Amazon_S3_Service.htm): Allows to interact with Amazon S3 storage.
- [Amazon SQS Service](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Amazon_S3_Service.htm): Allows to work with Amazon SQS queues.
- [Azure Connection Service](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Azure_Connection_Service.htm): Allows to read and write data to Azure Blob storage and Azure Queue storage.
- [MFT Service](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/MFT_Service.htm): Allows to work with [Edifecs Managed File Transfer Service](https://mft.edifecsfedcloud.com/).


Connectivity


FTP


The following services can be used to interact with FTP servers.

- [FTP Service](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/FTP_Service.htm)
- [FTPS Service](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/FTPS_Service.htm)
- [SFTP Service](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/SFTP_Service.htm)


JMS


The following services can be used to interact with JMS servers:

- [JMS Apache Active MQ Service](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/JMS_Apache_ActiveMQ_Service.htm)
- [JMS Generic Service](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/JMS_Generic_Service.htm)
- [JMS IBM WebSphere MQ (Edifecs ContextFactory) Service](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/JMS_IBM_WebSphere_MQ_(Edifecs_ContextFactory)_Service.htm)
- [JMS Oracle BEA WebLogic Service](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/JMS_Oracle_BEA_WebLogic_Service.htm)

- [DB Connection Service](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/DB_Connection_Service.htm): Provides an interface to interact with databases.
- [Data Storage Service](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Data_Storage_Service.htm) - Used to work with XEServer Data Storage which is internal hardware transactional memory (HTM) caching mechanism used for data storage during run-time operations.
- [JMS IBM WebSphere MQ Service](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/IBM_WebSphere_MQ_Service.htm)
- [H2 Database Service](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/H2_Database_Service.htm) - Allows you to deploy an embedded H2 database or work with already deployed one.
- [Kafka Service](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Kafka_Service.htm) - Allows you to interact with Kafka brokers.
- [Rabbit MQ Service](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/RabbitMQ_Service.htm) - Allows you to work with RabbitMQ queues.
- [Restful Web Service](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Restful_Web_Service.htm) - The service allows to deploy a Restful web service and exchange messages through it.
- [Salesforce Service](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Configure_Salesforce_Service.htm) - The service allows you to connect to Salesforce cloud.
- [Web Service](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Configure_Web_Service.htm) - Allows you to deploy a full-featured web service that can receive requests from external applications, process the request data on a route, and respond with route processing results.
- [Audit Service](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Audit_Service.htm) - The service reports audit events to a single log file where each line represents a separate event, a directory where each audit event is stored as a separate file, [Visualizer Server](https://help.edifecsfedcloud.com/go/xesmanager/9.4/Content/VisualizerServer/VS_Overview.htm) (you can select one or combine multiple destinations).


Groovy

- [Groovy Service](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Groovy_Service.htm): Allows you to execute custom Groovy scripts within a profile.


Monitoring


The following services allow you to monitor the performance of the file system and JMS servers:

- [Monitoring ActiveMQ Service](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Monitoring_ActiveMQ_Service.htm)
- [Monitoring File System Service](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Monitoring_File_System_Service.htm)
- [Monitoring IBMMQ Service](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Monitoring_IBMMQ_Service.htm)
- [Monitoring Weblogic Service](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Monitoring_Weblogic_Service.htm)


Recovery

- [Checkpoint Service](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Checkpoint_Service.htm): Provides a "back-end" for the XEServer [Checkpoint](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Checkpoint.htm) component.


Sequence Manager

- [Sequence Manager Service](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Sequence_Manager_Service.htm): Allows you to track the order of incoming messages and restore this order on output.


Servers

- [ActiveMQ Server Service](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/ActiveMQ_Server_Service.htm): Used to deploy an embedded full-featured ActiveMQ JMS server inside a profile.


Timer

- [Job Scheduler Server](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Job_Scheduler_Server_Service.htm): Used to maintain scheduling logic and send commands to Job Scheduler Client Services.
- [Job Scheduler Client](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Job_Scheduler_Client_Service.htm): Used to listen for commands from Job Scheduler Server Services.
- [Timer Server](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Timer_Server_Service.htm): Timer Server services support Activator and Deactivator route endpoints that connect to a local Timer service server to activate or deactivate schedulers.
- [Timer Client](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Timer_Client_Service.htm): Timer Client services support Activator and Deactivator route endpoints that need to connect to a remote Timer service server to activate or deactivate schedulers.


Tracking and Duplicates


The following services are used together to detect duplicate data that come for processing.

- [Tracking and Duplication Server Service](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Tracking_and_Duplicates_Server_Service.htm): Handles a storage with information about data files that have been already processed and checks incoming data files for duplicates.
- [Tracking and Duplication Client Service](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Configure_Tracking_and_Duplicates_Client_Service.htm): Provides a gateway between an XEServer route and Tracking and Duplication Server Service.


Visualizer Reporter

- [Visualizer Reporter](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Visualizer_Reporter_Service.htm): Provides connectivity to Edifecs Visualizer Server.


XEngine

- [XEngine Service](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/XEngine_Service.htm): A core service that provides XEngine functionality in XEServer profiles. This service is used by all XEngine route components.

- Route Service: Used to create a new XEServer route. Technically, an XEServer route is a modification of XEServer service that provides a way to manage XEServer route components and other XEServer services. However, to keep things simple, in this guide the terms "route" and "service" are not interchangeable and relate to different XEServer entities.

---

<a id="create-a-new-service"></a>

### Create a New Service

> 📄 Source: [Create_a_New_Service.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Create_a_New_Service.htm)

#### Create a New Service


Many of XEServer route components are used in combination with a service. When you add a new route component that depends on an XEServer service, the corresponding service is automatically created and linked to the component. If the newly added component can work with different types of services (for example, FTP components can be used with FTP, FTPS, or SFTP services), you will be prompted to select which exact service to use for the newly added component.


To create a new service:

1. Open Edifecs Application Manager (EAM).
2. On the EAM System tab, expand XEServer and then expand Profiles.
3. Expand a profile you want to work with, and double-click Configuration.
4. On the Outline tab, right-click Service Manager, and then select New Service. The following dialog is displayed:*[Image: Create service]*
5. Select the service you want to create. Tip Use Quick Filter to search the service you need.
6. Click OK. The new service is displayed on the Outline tab.


For information on how to configure XEServer services, click [here](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Book_Configure_XEServer_Services.htm).

---

<a id="generic-service-settings"></a>

### Generic Service Settings

> 📄 Source: [Generic_Service_Settings.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Generic_Service_Settings.htm)

#### Generic Service Settings


The following settings are common for all XEServer services:



| Field | Description |
| --- | --- |
| **Service** | Enter a name for the service. This name is used to display the service in the EAM Outline tab. |
| **Type** | The type of the XEServer service. This cannot be changed. |
| **Status** | Select to enable or disable the service. If enabled you can use a condition (written in Expression language) that evaluates to TRUE/FALSE and defines whether the corresponding route or service must start together with the profile (TRUE) or not (FALSE). The expression can use only system macros. |
| **Path** | The read-only location of the XEServer service within a profile. Tip: Use the EAM Outline tab to arrange services within a profile. You can create new folders and drag-and-drop services into folders. |
| **Auto start** | Select Off if you do not want the service to start automatically on profile startup. If you want the service to start together with the profile, select On with startup level and specify the startup priority index which is a value between 1 and 100. The lower the value, the higher the priority. Services with a higher priority are started first. You cannot use the startup level "0" as it is a reserved value used for system services. |

---

<a id="routes"></a>

## Routes

> 📄 Source: [Book_Routes.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Book_Routes.htm)

### Routes


This section has the following information:

---

<a id="xeserver-routes-overview"></a>

### XEServer Routes Overview

> 📄 Source: [XEServer_Routes_Overview.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/XEServer_Routes_Overview.htm)

#### XEServer Routes Overview


An XEServer route is a workspace that defines a sequence of processing steps through which the data should pass once submitted to the route. A route should represent a single logical phase of the entire data work flow, thus allowing you to split complex EDI processing logic into separate routes. Use EAM [Route Editor](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/EAM_Route_Editor.htm) to work with XEServer routes.


Typically, a route contains the following components:

- Inbound endpoints: One or more Inbound components to pick input data for processing.
- Data processors: A combination of processor components that perform manipulations with the input data.
- Outbound endpoints: One or more route components that export route processing results.
- Route Connections: Connections that tie route components into a sequence.


XEServer provides a variety of components for building routes of any complexity. For more information, see [XEServer Route Components](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Book_Route_Components.htm). XEServer routes can be started and stopped separately from each other. You can choose whether a route should start on the profile startup or should be started manually.

---

<a id="eam-route-editor"></a>

### EAM Route Editor

> 📄 Source: [EAM_Route_Editor.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/EAM_Route_Editor.htm)

#### Route Editor Workspace


When you open a route for configuration, EAM Route Editor is displayed:


*[Image: Create Route]*

1. Canvas: Displays a visualization of the processing flow - route components and connections between them.
2. Palette: Lists available route components by categories.
3. Route Component Properties: Displays the route information and settings. For more information, see [Route Properties](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Route_Properties.htm).


To add a component to a route, select the required component on the Palette, and then click a region on the Canvas where you want to place the component. To connect components, use one of the [connections](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Route_Connection_Types.htm) available on the Palette


Tip All components present on your route are also displayed on the EAM Outline tab.

---

<a id="route-work-flow"></a>

### Route Work Flow

> 📄 Source: [Route_Work_Flow.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Route_Work_Flow.htm)

#### Route Work Flow


This section walks you through route execution steps to introduce XEServer route-specific terms and to illustrate what is happening under the hood of XEServer routes.


Consider the simple route:



This routes picks a file from the file system, compresses the file, and stores the compressed .zip archive on the file system.


Here is how it is achieved (very simplified):


Step 1. A data file is dropped into the directory observed by FS Inbound. The FS Inbound component detects the data file, reads the file contents, and the following occurs:

- A new XEServer [Exchange](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Terms.htm#Exchange) is created. This message exchange consists of one XEServer [Message](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Terms.htm#Message) where the message body holds the binary content of the detected file. Some default [exchange properties](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Terms.htm) and [message properties](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Terms.htm#Message_Properties) are initialized. In this form, the consumed file is ready to be transferred further down the route.
- XEServer creates a new [Task](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Terms.htm#Task). You can think of a task as of a processing session the main purpose of which is to correlate XEServer message exchanges and in some cases - to provide transaction capabilities. A task starts when an original message exchange is created (typically, Inbound components create original message exchanges, in our case this is FS Inbound). As execution moves further down the route, new derived message exchanges spawn (for example, for every component's output on a route, a new message exchange is created). All the derived message exchange originated from the original message exchange belong to the same XEServer task. The task completes once the original message exchange and all derived message exchanges that belong to the same task pass through all interconnected route components.


Step 2. The original message exchange reaches the Zip component. The component compresses the data contained in the message body, creates a new message exchange (that belongs to the same task as the original message exchange does), and directs this message exchange to the component's zip output.


Step 3. The message exchange reaches the FS Outbound component and the component stores compressed data in a .zip archive on the file system. Since the FS Outbound is the last component in the processing sequence, the XEServer task is marked as complete.

---

<a id="create-a-new-route"></a>

### Create a New Route

> 📄 Source: [Create_a_New_Route.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Create_a_New_Route.htm)

#### Create a New Route


To create a new route:

1. On the System tab, expand XEServer and double-click the XEServer profile you want to work with.
2. Double-click Configuration.
3. On the Outline tab, right-click Routes, and then click New Route. A new route is created.*[Image: Create Route]*
4. The Route Viewer(1) appears with a Palette(2) to the right and a Route Component Properties(3) tab at the bottom of the screen.
5. To add components to the route, click an item on the Palette, go to Route Viewer, and then click the place where you want the component to be located.
6. Use the connections on the Palette to bind objects in Route Viewer.

---

<a id="route-properties"></a>

### Route Properties

> 📄 Source: [Route_Properties.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Route_Properties.htm)

#### Route Properties


On this tab, you can define route properties and settings. When you create a new route, the following settings are displayed on the Route Component properties tab:


*[Image: Route component properties tab]*


##### Overview Tab


###### Common


| Field | Description |
| --- | --- |
| **Route name** | Enter a name for the route. The route name must be unique within a profile. |
| **Status** | Enabled: The route starts together with the profile. Using the [Expression Language](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Expression_Language.htm), you can specify a startup condition that allows you to start a route based on a condition. If the startup condition evaluates to `true`, the route starts together with the profile. The startup condition can use only system macros (for example, `${propName}`). This way, you can enable a route by checking for an environment property. See condition examples below. Example '${testStartupProperty}'='foo' String(${testStartupProperty})='foo' Disabled: The route does not start with the profile. |
| **Read only** | Select this option to make the route read-only (system route). Only users who have Edifecs internal license for Edifecs Application Manager can modify system routes. |
| **Number of instances** | Specify the number of route instances that can run in parallel. All the instances run within one JVM process and allow you to process data concurrently.For example, when you set this option to `2`, this means that two identical route processes are started. Increasing the number of route instances can increase the overall data throughput at the cost of a higher RAM consumption.Tip For this field, you can use the XEServer system macros and environment variables (for example, ${NumOfInstances}) to specify the number of route instances. |
| **Maximum # of active tasks/instance** | Specify the maximum number of active XEServer [tasks](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Terms.htm#Task) that each route instance can handle at the same time. Tip For this field, you can use XEServer system macros and environment variables (for example, ${MaxNumActiveTasks}) to specify the maximum number of active tasks in each route instance. |
| **Auto start** | Select Off when you do not want the route to start automatically on the profile startup. If you want the route to start together with the profile, select On with profile startup level and specify the startup priority index which is a value between 1 and 100. The lower this value is, the higher priority the route has. Routes with higher priority are started first. |



###### Route Information Tab


| Field | Description |
| --- | --- |
| **User name** | Displays the name of EAM user who was the last to modify the route. |
| **License owner** | The name of the license owner. |
| **Modified** | The date and time of the last route modification. |
| **Show note** | Use this field to enter a route description and useful notes about the route. Select Show to show the note on the canvas. |



##### Environment Tab


On this tab, you can define route environment properties and view XEServer effective environment properties.


##### Parameters Tab


On this tab, you can define key-value parameters that can be passed to the route from another route through the [Subroute](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Subroute.htm) component. To reference these parameters within the subroute, use the {T_Prp['parameterName']} notation.


##### QoS Tab


On this tab, you can specify a recovery behavior when an error occurs on a route. For more information, see [Route Quality of Service Settings](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Route_Quality_of_Service_Settings.htm).


##### Dependencies tab


On this tab, you can view dependent parent routes and subroutes. For more information, see [Route Dependencies](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Route_Dependencies.htm).


##### Tracer Tab


Route Tracer is a debugging tool that you can use to track the route workflow.


Tip Starting from the 9.0 version, Edifecs Application Manager comes with an in-built full-featured route Debugger which is a convenient and more versatile debugging facility.


You can collect route components data for entire route or for specific components depending on how you develop the route. To turn tracing off, set the Activation mode to Never.


| Field | Description |
| --- | --- |
| **Activation mode** | Select the tracing activation mode: By message: If an incoming XEServer message contains the property XESTrace=true, tracing is activated. Use the **Trace components** section to turn on tracing for specific components or for all route components. Always: Activates tracing for every incoming messages. Never: Deactivates tracing on a route. You can also activate route tracing using [SSH console](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/SSH_Console_Parameters_Overview.htm) or [HTTPS endpoint](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Control_XEServer_Using_HTTP(S)_Endpoints.htm#PUT_tracer). |
| **Base location** | The path to a folder with tracer files. |
| **Filename template** | Select the template for file name generation. To get a list of the available macros, press CTRL+space. Example Default template is {EID}-{M.IDX}.{M.EXT} - where {EID}- exchange id {M.IDX} - message index in scope of exchange (1,2,...) {M.EXT} - message extension |
| **Message trace mode** | Select the mode to enable or disable message-based file tracing, which includes message contents with trace data. Possible values: **No message**: Disables message-based tracing. **Whole message**: Saves the entire message. **Buffer 2KB**: Saves the first 2 KB of the message data. |
| **Trace components** | In this section, you can select the route components to trace. |



##### Breakpoints Tab


On this tab, you can view and set EAM Debugger breakpoints for all components available on the route.

---

<a id="route-dependencies"></a>

### Route Dependencies

> 📄 Source: [Route_Dependencies.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Route_Dependencies.htm)

#### Route Dependencies


A route can have a parent route and a subroute that work as a part of the complex route. For more information, see [Parent Route](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Parent_Route_Inbound.htm) and [Subroute](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Subroute.htm) components.


To view the route dependencies:

- On the Outline tab, select the needed route, and on the Route component properties tab, click Dependencies tab.
- On the Dependencies tab, view the following dependencies:
- On the Parent routes tab, view the list of the routes that refer to the current route, and the names of their Subroute components, by means of which they refer to the current route.
- On the Subroutes tab, view the list of the routes that the current route calls, and the names of Subroute components of the current route.
- To view the diagram, showing the dependencies between existing routes, on the Dependencies tab, click View diagram.


*[Image: Complex route diagram]*

- The routes, that any other route refer to, have an arrow directed to them.
- The route in a red frame is the one you are currently working with.

---

<a id="route-quality-of-service-settings"></a>

### Route Quality of Service Settings

> 📄 Source: [Route_Quality_of_Service_Settings.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Route_Quality_of_Service_Settings.htm)

#### Route Quality of Service Settings


On this tab, you can define error recovery behavior for all the route components that support the QoS mechanism. If a route component fails to process a message exchange within the specified number of retries, the processing fails, and the message exchange leaves the component through the error output. Most of the route components have their own [component-level QoS settings](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Component_QoS_Settings.htm) that override (when enabled) route-level QoS settings.


##### Route QoS Settings


The route QoS tab has the following view:



###### Retry Strategy Tab


On this tab, you define the retry behavior:

- Retry attempts: The maximum number of attempts components should make in order to process the failed data.
- First retry timeout: The delay in milliseconds before the first retry attempt.
- Last retry timeout: The maximum timeout in milliseconds to make the last retry attempt.


Tip You can define retry settings in XEServer environment and reference them using ${envPropertyName} notation.


###### Start Conditions Tab


On this tab, you can select additional actions to perform when a critical error occurs on the route and the processing fails:

- None: No action is performed.
- Restart: Restarts the entire route.
- Restart services: Restarts specific XEServer services.
- Stop services: Stops XEServer services.


###### Stop Conditions Tab


On this tab, you define conditions for the route to stop. A route gets the STOPPED status as soon as one of the conditions is met:

- Number of errors on inbound endpoints
- Number of failed exchanges
- Number of failed tasks


When a route stops due to the conditions above, the route performs the action defined on the Start Conditions tab until the total number of retry attempts reaches the limit.


###### Error Channel Tab


On this tab, you can specify the destination for logging route errors. Select Default error channel to gather route error data in case individual route components do not have error channels defined. Define the destination folder and a naming template to store error log files. Macros are available for these settings by pressing Ctrl+[SPACEBAR].


##### Container mode


If you run XEServer profile configurations in a containerized environment, read [this topic](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/XEServer_in_Containerized_Environments.htm) to learn about the required changes in settings.

---

<a id="route-components"></a>

## Route Components

> 📄 Source: [Book_Route_Components.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Book_Route_Components.htm)

### Route Components


This section has the following information:

---

<a id="route-components-overview"></a>

### Route Components Overview

> 📄 Source: [Route_Components_Overview.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Route_Components_Overview.htm)

#### Route Components Overview


An XEServer route component is the smallest processing unit used to build routes. One route component represents a single data processing action on the route. All route components are divided into following categories:

- [Inbound endpoints](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Book_Inbound_Endpoints.htm): Used as XEServer input. Used to consume data for processing from different sources, such as a file system, database, ftp server, email box, and so on.
- [Outbound endpoints](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Book_Outbound_Endpoints.htm): Used as XEServer output. Used to forward processing results to a target destination, such as a JMS queue, Amazon cloud, ftp server, and so on. Also used for communication with other Edifecs products. FS, FTP and HDFS Outbound components can store message properties in the form of .properties files.
- [Data processors](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Book_Data_Processors.htm): Provide data modification capabilities and provide communication with third-party services and other Edifecs products.
- [XEngine](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Book_XEngine_Components.htm): Provide access to XEngine functionality.
- [Enterprise Integration Patterns](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Book_Enterprise_Integrated_Patterns.htm): Provide recovering, splitting, merging, sorting, reordering capabilities for advanced control of data flow on the route.
- [Timers](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Book_Timers.htm): Provide timer-related functions.
- [Claim Forms](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Book_Claim_Forms.htm): Allow you to convert EDI claim documents into a human-readable hard paper format.
- [XESManager](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Book_XESManager_Components.htm): Allow you to interact with XESManager.


Most of the components are used in combination with XEServer [services](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/XEServer_Services_Overview.htm), however, some route components do not need a service to function.


XEServer and EAM allow you to implement your custom components and use them from the palette. To do this, you should implement the component's UI part using the EAM templates and logic (using the basic XEServer component model, extended with the custom functions). For details on custom component implementation, [contact Edifecs support](https://support.edifecs.com/).


You can also add your own custom help files to be displayed as an online and/or PDF documentation for your custom components. To do this, you should add a corresponding help file to a help subfolder of a corresponding custom component.

- For the online documentation, add a .lnk file that contains a link to an online component description with the following name: help.${FeatureName}_${ComponentName}.lnk, for example, help.route-engine_YourCustomComponentName.lnk.
- For the PDF documentation, add a .pdf file with the following name: help.${FeatureName}_${ComponentName}.pdf, for example, help.route-engine_YourCustomComponentName.pdf.


To view the help documentation, press a certain component Help button or F1.

---

<a id="work-with-components"></a>

### Work with Components

> 📄 Source: [Work_with_Components.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Work_with_Components.htm)

#### Work with Components


To add a component to a route:

- Open a route you want to work with.
- Select the required component from the Palette, and then click a place on the Route Editor canvas where you want to place the component.
- Connect the newly added component with other components on the route using Connections from the Palette.


The component has the following view on the Route Editor canvas:


1. Incoming connection. Connections are used to tie separate route components into a processing sequence.Tip You can have multiple incoming connections attached to one input.For more information, see [Route Connection Types](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Route_Connection_Types.htm).
2. Component input. When a component receives a message exchange on input, it activates and starts working. The majority of components have only one input.
3. Component output. A component may have from one to several outputs each passing certain processing results.A component sends data through its outputs in the order these outputs are defined on the component (from top to bottom). For example, in the image above the REST Client component sends HTTP response data through the data output first, and then sends the original data through the original output.There are two outputs that are common to all components: - original: The XEServer message exchange that was received by the component on input is directed to this output. - error: If an error occurs during the component's work, the component directs the data to this output. Tip For some components (for example, Router, XE Native, and some others) , you can add custom outputs and define filter rules on what kind of data should pass through these outputs.One of the important output functions is an ability to [set XEServer properties](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Components_Output_Properties.htm). When a message exchange passes through an output with an XEServer property defined on it, this property is attached to the message exchange and can be referenced later on the route.
4. Outgoing connections. Used to deliver data to subsequent components.Tip You can have multiple outgoing connections attached to one output.For more information, see [Route Connection Types](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Route_Connection_Types.htm).

---

<a id="route-connection-types"></a>

### Route Connection Types

> 📄 Source: [Route_Connection_Types.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Route_Connection_Types.htm)

#### Route Connection Types


There are two connection types supported on routes. You can use synchronous or asynchronous connections. Different connection types can be set for various parts of the route. This might be useful to balance the processing on the route.

- Sync connection: All the messages are sent successively. Only when the first message processing is complete on the component it was sent to, the second message is sent to this component. In most cases synchronous connection is used. In this case route works the following way: Component A generates result R1. As soon as it is ready, it is reported to the next component B. Component B processes R1 and if no results are generated, returns control message to the component A. Component A generates next result R2, and so on.

- Async connection: All the messages are sent one by one. As soon as the processing starts on the first message, the second message is picked up and sent to the queue. You can set maximum number of messages to be sent to one component. When the number of allowed threads is reached, processor waits for at least one message to be processed and then picks up the next message.


By default, the synchronous connection type is used. There are two ways to set the type of connection.


To set connection type:

- On the Palette, click Sync connection or Async connection.


-or-


In the Route Viewer, click the connector you want to set.

- On the Route component properties tab, choose connection type on the Type drop-down menu.


You can optionally set the number of maximum threads for the asynchronous connections. The default number of threads allowed is 10.


Also the route connection component settings allow you to enable and disable a route connection.



##### Settings Tab


| Field | Description |
| --- | --- |
| Status | Enables or disables the selected connection. |
| Type | Select the type of the connection. Can be synchronous or asynchronous |
| Number of threads | The number of threads to be set for the asynchronous connection type. |

---

<a id="component-properties"></a>

### Component Properties

> 📄 Source: [Component_Properties.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Component_Properties.htm)

#### Component Properties


On this tab, you can define component properties and settings. After you add a component to the route, the following settings are displayed on the Route Component properties tab:



##### Overview Tab


On this tab, you can view basic information about the selected component: the component's name and an optional description. Select Show to display the description on the Route Editor canvas.


The Watched by Task Reporter option indicates whether the selected component is observed by [Task Reporter](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Task_Reporter_Inbound.htm). If selected, the statistics about the component is included into the task report.


##### Settings Tab


This is the main configuration tab that contains component-specific settings. For more information about the settings of a certain component, see the corresponding [component configuration](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Book_Configure_XEServer.htm) section.


##### Outputs Tab


On this tab, you can direct data to the subsequent components on the route after the current component's processing is complete. Depending on the component's processing results, the component submits data to one or more of the component's outputs.


You can also set the XEServer properties for each output. XEServer allows you to pass additional metadata within the XEServer messages. For more information, see [Components Output Properties](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Components_Output_Properties.htm).


##### QoS Tab


You can set Quality of service (QoS) individually for each component that supports this option. For more information, see [Component Quality of Service Settings](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Component_QoS_Settings.htm).


##### Events Tab


On this tab, you can configure the component to send events to Edifecs XProcess Management. For more information, see [Component Events Tab](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Component_Events_Tab.htm).


##### Breakpoints Tab


On this tab, you can set breakpoints for a selected component to debug the route. For more information, see [Component Breakpoints Tab](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Component_Breakpoints_Tab.htm).

---

<a id="component-output-properties"></a>

### Component Output Properties

> 📄 Source: [Components_Output_Properties.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Components_Output_Properties.htm)

#### Component Outputs Properties


Components send data processing results for further processing through one of the available outputs. Components can have one or more default outputs, however for some components (Router, XE Translator, and so on) you can create your own outputs.


To view a component's Outputs tab:

1. Create a new route.
2. Select a component you want to configure.
3. In Route Component Properties, click Outputs. You can view the following settings:


*[Image: Components Output properties]*


| Field | Description |
| --- | --- |
| Component output names | The section displays all the outputs of the selected component. You can add new outputs (for some components), edit the output names (for some components), arrange the order of the outputs by moving them up or down, and delete outputs that are no longer required. |
| Message Exchange Properties | In this pane, you can set XEServer message exchange properties for every output. Whenever an XEServer message passes through an output which has a property set on it, this property is added to the message property list of the current XEServer message. After that, this property can be read by components that follow the current component on the route. Use [XEServer exchange macros](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/XEServer_Route_Macros.htm#Exchange) and [XEServer message macros](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/XEServer_Route_Macros.htm#Message) to dynamically set and extract properties. This way, you can accumulate properties as the data passes through each route component which can be useful if you want to somehow mark and later identify XEServer messages without dealing with message contents. When serialized to the file system, XEServer message properties are stored in the form of name-value pairs in the .properties files. Some components support filtering on the outputs. Data can pass through the outputs of such components only if the Filter condition is met. For example, the filter expression {MD_XE_RPN} = 'XEngine' AND {MD_XE_RT} LIKE 'xdata*' allows only messages that have XEngine result processor set to "Xengine" and the XEngine result type starts with "xdata" to pass. For more information on outputs filtering, see [Expression language](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Expression_Language.htm). |
| Add original properties of the inbound exchange messages | Select this option if you want original properties from all the messages of the inbound message exchange to be copied to the properties of the outbound message exchange. |



To add a new component output:

1. Create a new route.
2. Select a component you want to work with.
3. In the Route Component Properties section, click Outputs.
4. In the Component output names section, click New.
5. Enter a name and the filtering condition for the new output.
6. Click OK.


To set a message property on the output:

1. Create a new route.
2. Select a component you want to work with.
3. In the Route Component Properties section, click Outputs.
4. In the Component output names section, select the output you need.
5. In the Message Exchange Properties section, click New. The New Output Property dialog box is displayed.
6. In the Name field, enter a name for the new property. This name is used as a key in the key-value message property pair.
7. In the Value field, enter a value of the new property. This value is used as a value in the key-value message property pair. You may need to use constant values to solve some basic tasks and for testing. However in most of the cases you may require an access to run-time information to dynamically extract XEServer messages, dates, failure counts, Task IDs, GUIDs, and other component-specific metadata. For this, use [XEServer supported macros](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/XEServer_Route_Macros.htm#Salesforce). The following XEServer output property pair accesses the XEServer message property someProperty using the {Prp[]} macro, extracts its value(for example, "somePropertyValue"), and sets a new XEServer message property: testValue = somePropertyValue: Example Property Name: testValue Property Value: {Prp[someProperty]}
8. Click OK. Now, once an XEServer message passes through the output channel selected in the Step 4, a new message property is attached to it. Note To save XEServer message properties in the file system in the form of the .properties file, the receiving FS Outbound component should have the Data properties option set to overwrite or append. ## View all the Output Properties of a Profile The previous section described how you can view and manage output properties for a separate component on a route. However, you can also view all output properties set within an entire profile.To view all output properties of a profile: 1. On the System tab, expand XEServer, then expand the required profile, and then double-click Configuration. 2. On the Outline tab, select Service Manager. 3. On the profile Service Manager page, select Outputs. All the Message Exchange Properties of the profile are displayed.


In this mode, you can double-click a component/output/property pair to view it in a Route Editor. To edit a property in this mode, select the property pair and click Edit.

---

<a id="component-qos-tab"></a>

### Component QoS Tab

> 📄 Source: [Component_QoS_Settings.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Component_QoS_Settings.htm)

#### Component Quality of Service Settings


On this tab, you can define error recovery behavior for a single component. Settings specified on this tab override [route-level QoS settings](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Route_Quality_of_Service_Settings.htm).


##### Component QoS Settings


The component QoS tab has the following view:


*[Image: QoS tab]*


The following retry strategy options are available:

- None: If a component fails, no action is performed.
- Default: Select to use the default recovery strategy defined on the [route level](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Route_Quality_of_Service_Settings.htm).
- Custom: Select to explicitly define the retry behavior for the component. These settings override the default route-level QoS settings: - Retry attempts: The maximum number of attempts components should make in order to process the failed data. - First retry timeout: The delay in milliseconds before the first retry attempt. - Last retry timeout: The maximum timeout in milliseconds to make the last retry attempt. Tip You can define retry settings in XEServer environment and reference them using ${envPropertyName} notation.

---

<a id="component-events-tab"></a>

### Component Events Tab

> 📄 Source: [Component_Events_Tab.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Component_Events_Tab.htm)

#### Component Events Tab


On this tab, you can configure route components to send events to Edifecs [XProcess Management](https://help.edifecsfedcloud.com/go/xprocessmanagement/Content/Home.htm) (XPM).


You can view the following settings on this tab:


| Field | Description |
| --- | --- |
| Send Events to XProcess Management system | Select this option to enable event reporting. |
| Service name | Route components use the XEServer [XPM Service](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/XProcess_Service.htm) to submit events to an XPM server. In this list, select the XPM Service (or create a new one) to send all the events generated by the current route component. |
| Process | Select an XPM process to which the event should be sent. An XPM process is a representation of a real-life business process that depicts a data processing route with all possible variants of business logic flow. In XProcess Management, processes are represented in the form of BPMN diagrams. |
| Business type | An abstract data type that represents objects and phenomena from the real-life world (for example, an electronic transaction, a text document, a payment to be paid to a party, and so on). Instances of business types (business objects) travel across processes and depict the progress of the monitored business process. Business types can contain any number of fields to describe the entity they represent. You can query XProcess Management by these fields to obtain precise information about the current state of a monitored object. Enter a name of business type associated with the selected Process. One XProcess Management process can have only one business type associated with it. |
| Object ID | An ID used to identify the business object (instance of a business type) which state should be updated. It can be any unique combination. For example, the value from the CLM01 segment of a HIPAA File, or some synthetic value - a concatenation of Claim ID, Date, Subscriber ID, and so on. |
| Producer | The name of the event sender system. This can be useful to filter incoming events on the XPM side. |
| Date/Times | The time and date when the event occurred. The default time zone XProcess Management uses is UTC (Coordinated Universal Time). If you use the format {CDT[yyyy-MM-dd HH:mm:ss]} to express the local time, XProcess Management converts the time and date to the UTC time and date. To indicate another time zone, specify a time zone offset in hours and minutes in the following format {CDT[yyyy-MM-dd HH:mm:ss.SSSZZZZ]}, where 'ZZZZ' = '+hh:mm' or '-hh:mm'. Possible formats: Timestamp - Time in milliseconds. When XEServer sends this value to XProcess Management, the value is stored in the XProcess Management default time format (UTC). Route macros ({Prp[name]}) and system macros (${name}) are available for this field. {CDT[yyyy-MM-dd HH:mm:ss.SSS]} {CDT[yyyy-MM-dd HH:mm:ss.SSSZZZZ]}, where 'Z' is a UTC designator. 'ZZZZ' = '+hh:mm' or '-hh:mm' {CDT[yyyy-MM-dd HH:mm:ss]} {CDT[yyyy-MM-dd HH:mm:ssZZZZ]}, where 'Z' is a UTC designator. 'ZZZZ' = '+hh:mm' or '-hh:mm' {CDT[yyyy-MM-dd'T'HH:mm:ss.SSS]} {CDT[yyyy-MM-dd'T'HH:mm:ss.SSSZZZZ]}, where 'Z' is a UTC designator. 'ZZZZ' = '+hh:mm' or '-hh:mm' {CDT[yyyy-MM-ddTHH:mm:ss]} {CDT[yyyy-MM-dd'T'HH:mm:ssZZZZ]}, where 'Z' is a UTC designator. 'ZZZZ' = '+hh:mm' or '-hh:mm' You can also use the POSIX format to express the local time. |



Some route components (Data processors, XEngine, XEConnect, Enterprise Integration Patterns components) allow you to define when to send events to XProcess Management - before the component starts data processing, or after the component completes data processing. For these components, you can select when the component should send events. All other components send events immediately after they finish data processing.


| Field | Description |
| --- | --- |
| State | The drop-down list contains available states for the selected XProcess Management process. A State is a unique position in a XProcess Management process that reflects the progress of process completion. Select the state that should be sent to the corresponding process. |
| Ignore unresolved property | Select this option if you want to remove a property pair from the event to be sent if the value of this property is an unresolved macro. |



The Properties pane displays a list of business type fields associated with a selected XProcess Management process. You can use these properties to pass additional data to XProcess Management along with the event. In this pane, you can only provide values for existing properties and you cannot create new ones. The set of available properties is pulled in from XProcess Management at run time and includes only the fields of a selected business type. To add a new property, you can add a new business type field on the XProcess Management Business Types tab.


Note If a metadata field has a date and time value, XProcess Management assumes that all of those received date/time metadata fields are in the UTC time zone. You cannot specify a time zone offset for metadata field values. The issue may have been already resolved in XProcess Management, double-check the XProcess Management help documentation.

---

<a id="component-breakpoints-tab"></a>

### Component Breakpoints Tab

> 📄 Source: [Component_Breakpoints_Tab.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Component_Breakpoints_Tab.htm)

#### Component Breakpoints Tab


On this tab, you can set breakpoints of specific types (Before execution or After execution), specify conditions when certain breakpoints should be activated, and set all possible breakpoints on the route at a time. The Breakpoints tab displays a tree-like list of the available breakpoints as shown in the image below:



When you enable a breakpoint, the green marker appears and the corresponding connection is highlighted in the Route Viewer:



On the Breakpoints tab, use to activate and to deactivate all the available breakpoints for the selected component or route.


##### Conditional Breakpoints


You can set breakpoints to be activated only on a predefined condition. For example, you can evaluate an XEServer property and depending on the value, decide whether the breakpoint should fire or not.


To set a condition for a breakpoint:

1. On the component Breakpoints tab, select the breakpoint you want to assign a condition to.
2. Click Edit. The Edit a breakpoint dialog is displayed.
3. Select the Condition option.
4. In the text area, enter the condition using [Expression language](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Expression_Language.htm). In the text area, you can use macros to dynamically refer to XEServer properties and environment variables. Example Int(${E_Prp[messageID]}) > 5 AND Bool(${E_Prp[ProcessingEnabled]})=true This condition triggers a breakpoint only if "messageID" message exchange property value is more than 5 AND the "ProcessingEnabled" message exchange property value is TRUE.
5. Click OK.

---

<a id="log-analyzer"></a>

## Log Analyzer

> 📄 Source: [Book_Log_Analyzer.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Book_Log_Analyzer.htm)

### Log Analyzer


This section has the following information:

---

<a id="log-analyzer-overview"></a>

### Log Analyzer Overview

> 📄 Source: [Log_Analyzer_Overview.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Log_Analyzer_Overview.htm)

#### Log Analyzer Overview


Log Analyzer is a tool that is designed to simplify event log processing when users need to work with the log files that are created on the Debug log level. For more information about the Debug log level, see [Work with Event Log Files](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Work_with_Event_Log_Files.htm).


As the volume of such event logs can be huge, it is difficult to track what is happening during processing. Previously the xes.route.events.log file was only used to log route events. For more information about the route event log, see [Use Log Viewer](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Profile_Log_Viewer.htm). Log Analyzer parses the enhanced log files to make them more comprehensible and provides the users with an opportunity to generate a log report containing the following information:

- Sessions
- Service events
- Profile events
- Command events
- Problem tasks


Log Analyzer parses long reports to pick up the main problems thus helping to understand what happened to the server and extract information about the main problems. The most common use cases when Log Analyzer tool can be used are the following:


###### Route stopped


A particular route has stopped due to some errors in the route. With Log Analyzer users are able to find out the reason, specifically:

- How many errors were on the route.
- Which component(s) caused the error.
- What are these errors.


###### Profile crashed


A crash is detected on the profile; the following information can be reported by using Log Analyzer:

- How many tasks (and what are they) were running at the time of the crash.
- Cause of the crash (preferably if not caused by external reasons).


For more information about the use cases, see [Log Analyzer Use Cases](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Log_Analyzer_Use_Cases.htm).

---

<a id="work-with-event-log-files"></a>

### Work with Event Log Files

> 📄 Source: [Work_with_Event_Log_Files.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Work_with_Event_Log_Files.htm)

#### Work with Event Log Files


The log files that are parsed by Log Analyzer can be created with a different logging level. For more information about log levels, see [Logger Tab](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Logger_Tab.htm). By default, the Information level is used but it disables tracking some of the events. In order to get a more detailed statistics of task events, users must switch the log level to Debug. The following table enumerates the parameters that are included in the log file that is created with Information and Debug levels:


| Parameter | Information Level | Debug Level |
| --- | --- | --- |
| The total number of tasks | - | + |
| The number of rejected tasks | - | + |
| Errors | + | + |
| Warnings | + | + |
| Average task duration | - | + |
| Maximum task duration | - | + |
| Minimum task duration | - | + |
| The number of tasks with duration more than 1000 milliseconds | - | + |
| The number of tasks that are not started | - | + |
| The number of tasks that are not completed | - | + |



As the log report is generated this information is displayed on the Route Reports tab. For more information about the Route Reports tab, see [Work with Reports Overview](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Work_with_Reports_Overview.htm).


If the log level for the event log file is set to Information, the corresponding sections in the resulting report are empty.


*[Image: Log Analyzer Route Report tab]*


To change the log level to Debug:

1. Open Edifecs Application Manager.
2. On the System tab, expand XEServer.
3. Expand Profiles.
4. Expand the profile for which you want to create a report.
5. Double-click Configuration.
6. On the Logger tab, for the Route system type, select Debug:

1. Click Save () or press CTRL+S to save changes.


Do the same for all the profiles that you want to be included into the report.

---

<a id="log-report"></a>

### Log Report

> 📄 Source: [Book_Log_Report.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Book_Log_Report.htm)

#### Log Report


This section has the following information:

---

<a id="log-report-overview"></a>

#### Log Report Overview

> 📄 Source: [Log_Report_Overview.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Log_Report_Overview.htm)

##### Log Report Overview


Log Analyzer is a tool that is designed to parse the event log files in order to create a log report. The log files can be rather large, so this tool helps you to pick up information necessary for your business needs.


A report may include event logs of several profiles. It is also possible to create a report by using the XEServer command line. For more information about how to use the Log Analyzer command line tool, see [Log Analyzer Command Line Tool](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Log_Analyzer_Command_Line_Tool.htm).

---

<a id="create-a-new-report"></a>

#### Create a New Report

> 📄 Source: [Create_New_Report.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Create_New_Report.htm)

##### Create a New Report


Log reports simplify the process of analyzing event logs and can be generated with Edifecs Application Manager or the XEServer command line tool.


To create a new report by using Edifecs Application Manager:

1. Open Edifecs Application Manager.
2. On the System tab, expand XEServer.
3. Double-click Log Analyzer.
4. On the right side of the Log Analyzer tab, click New report.


*[Image: Log Analyzer tab]*

1. Provide the following information:

- Name: Provide a name for the report file. By default, current date and time are used as a name template.
- Task duration limit: Provide the time in milliseconds for the task duration limit. The number of tasks with longer duration can be found on the Route Report tab, in the corresponding section. As problem tasks option enables including the tasks that last for more than 1000 milliseconds into the problem tasks list.
- Tasks with errors: Select this option to include tasks with errors in the problem tasks list.
- Tasks with missing started or completed event: Select this option to include tasks that are not started or completed in the problem tasks list.
- Tasks with warning: Select this option to include tasks with warnings into the problem tasks list. The Ignore warnings option enables ignoring some of the route events.
- Tasks with events that contain text: Select this option to include tasks that contain at least one of the specified strings in the problem tasks list.

1. Select the check box with the name of the profile for which you want to create the report.


*[Image: Create a report dialog box]*


Note In some cases, the users have log files that are not stored at the default location. Adding the external log file option enables importing log files.

1. Click OK.


Note An EAM Notification message confirms that the generation is completed successfully. The message is displayed in the top right-hand corner of the screen.

1. On the Log Analyzer tab, double-click the created report to see the details.


*[Image: LogAnalyzer tab]*

---

<a id="work-with-reports"></a>

#### Work with Reports

> 📄 Source: [Book_Work_with_Reports.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Book_Work_with_Reports.htm)

##### Work with Reports


This section has the following information:

---

<a id="work-with-reports-overview"></a>

##### Work with Reports Overview

> 📄 Source: [Work_with_Reports_Overview.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Work_with_Reports_Overview.htm)

###### Work with Reports Overview


When a report is generated, it is displayed on the LogAnalyzer tab. For more information about how to create a report, see[Create a New Report](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Create_New_Report.htm). The generated reports in XML and HTML format are stored at ${XESRoot}\tools\log-analyzer\log-reports.


*[Image: Log Analyzer Report Overview]*


The Overview section contains general information about the report. The following details are available:


| Field | Description |
| --- | --- |
| Profile names | The names of the profiles for which the report is generated. |
| File count | The number of xes.events.log files used to generate the report. |
| Earliest date | The first time the log was updated with new events. |
| Oldest date | The last time the log was updated with new events. |
| Date/Time | The date and time when the log report is created. |
| Number of sessions | The number of sessions logged. |
| Number of errors | The number of errors that occurred. |
| Number of problem tasks | The number of problem tasks. |



The following tabs are available:

- [Files Tab](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Files_Tab.htm)
- [Sessions Tab](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Sessions_Tab.htm)
- [Service Report Tab](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Service_Report_Tab.htm)
- [Route Report Tab](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Route_Report_Tab.htm)
- [Commands Tab](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Commands_Tab.htm)
- [Problem Tasks Tab](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Problem_Tasks_Tab.htm)
- [Errors Tab](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Errors_Tab.htm)
- [Parse Errors Tab](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Parse_Errors_Tab.htm)

---

<a id="files-tab"></a>

##### Files Tab

> 📄 Source: [Files_Tab.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Files_Tab.htm)

###### Files Tab


The Files tab provides information about the xes.events.log files that were included in the report.


| Field | Description |
| --- | --- |
| Computer Name | The name of the computer that was used to run the session. |
| Profile Name | The name of the profile. |
| File Name | The name of the event log file and the path to it. |
| File Size | The size of the event log file in bytes. |
| Log Start Time | The date and time when the first event was logged. |
| Log End Time | The date and time when the last event was logged. |
| Sessions | The number of sessions. |

---

<a id="sessions-tab"></a>

##### Sessions Tab

> 📄 Source: [Sessions_Tab.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Sessions_Tab.htm)

###### Sessions Tab


The Sessions tab provides information about the profile sessions.


| Field | Description |
| --- | --- |
| Computer Name | The name of the computer that was used to run the session. |
| Profile Name | The name of the profile. |
| PID | Process ID. |
| Start Time | The date and time when the session is started. |
| Start Reason | Information about the source of the command to start the session. This field contains the name of the service, computer, a user who sends the command, and correlation ID. |
| Stop Time | The date and time when the session is stopped. |
| Stop Reason | Information about the source of the command to stop the session. This field contains the name of the service, computer, a user who sends the command, and correlation ID. |
| XES Version | The XEServer version used on the box where the event log files are created. |
| Java Version | Java version used on the box where the event log files are created. |
| OS Version | Operating system used on the box where the event log files are created. |

---

<a id="service-report-tab"></a>

##### Service Report Tab

> 📄 Source: [Service_Report_Tab.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Service_Report_Tab.htm)

###### Service Report Tab


The Service Report tab provides information about the services events.


| Field | Description |
| --- | --- |
| Computer Name | The name of the computer that was used to run the session. |
| Profile Name | The name of the profile. |
| Route Name | The name of the route. |
| Start Reason | Information about the source of the command to start the service. This field contains the name of the service, computer, a user who sends the command, and correlation ID. |
| Start Time | The date and time when the service is started. |
| Stop Reason | Information about the source of the command to stop the service. This field contains the name of the service, computer, a user who sends the command, and correlation ID. |
| Stop Time | The date and time when the service is stopped. |
| Errors | The number of errors. |

---

<a id="route-report-tab"></a>

##### Route Report Tab

> 📄 Source: [Route_Report_Tab.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Route_Report_Tab.htm)

###### Route Report Tab


The Route Report tab provides information about the route events.


| Field | Description |
| --- | --- |
| Computer Name | The name of the computer that was used to run the session. |
| Profile Name | The name of the profile. |
| Route Name | The name of the route. |
| Start Time | The date and time when the route is started. |
| Stop Time | The date and time when the route is stopped. |
| Tasks | The number of tasks performed. |
| Rejected Tasks | The number of rejected tasks. |
| Errors | The number of errors that occurred. |
| Warnings | The number of warnings. |
| Avg Task Duration (ms) | The average task duration time in milliseconds. |
| Min Task Duration (ms) | The minimum task duration time in milliseconds. |
| Max Task Duration (ms) | The maximum task duration time in milliseconds. |
| # of Tasks with Duration > 1000 (ms) | The number of tasks that last more than 1000 milliseconds. This is a default value and you can specify another value. |
| # of Tasks without Task Started Event | The number of tasks that are not started or whose starting event is not logged. |
| # of Tasks without Task Completed Event | The number of tasks that are not completed successfully. |
| Error components | The list of the components where an error occurred. |

---

<a id="commands-tab"></a>

##### Commands Tab

> 📄 Source: [Commands_Tab.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Commands_Tab.htm)

###### Commands Tab


The Commands tab provides information about the command events.


| Field | Description |
| --- | --- |
| Computer Name | The name of the computer that was used to run the session. |
| Profile Name | The name of the profile. |
| Start Time | The date and time when the command is started. |
| Command Name | The name of the command. |
| Target | The path to a route or a service that is the target of the command. If a slash is displayed, this means that the command is executed for all the services and routes of the profile. |
| Source | Information about the source of the command. This field contains the name of the service, computer, a user who sends the command, and correlation ID. |
| Duration | The duration of the command in milliseconds. |
| Commands Correlation ID | The correlation ID of the command. |

---

<a id="problem-tasks-tab"></a>

##### Problem Tasks Tab

> 📄 Source: [Problem_Tasks_Tab.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Problem_Tasks_Tab.htm)

###### Problem Tasks Tab


The Problem Tasks tab provides information about the tasks that caused a problem. For more information how to configure the Problem Tasks section of the report, see [Create a New Report](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Create_New_Report.htm).


Filter: Filters errors by Task ID or Tracer ID.


Highlight: Highlights elements.


| Field | Description |
| --- | --- |
| Computer Name | The name of the computer that was used to run the session. |
| Profile Name | The name of the profile. |
| Task Started | The date and time when the task is started. |
| Task Completed | The date and time when the task is completed. |
| Task ID | The ID of the task. |
| Trace ID | The trace ID of the task. |
| Errors | The number of errors. |
| Exchanges | The number of message exchanges. |
| Task Duration (ms) | The duration of the task in milliseconds. |
| Last Known Task Event | The last task event that was logged. |



###### Exchange Properties


In this section all the message exchange properties are listed.


| Field | Description |
| --- | --- |
| Name | The name of the property. |
| Value | The value of the property. |



The following properties are added to the message exchange when an error occurs:

- ErrorProfileName
- ErrorHostName
- ErrorRoute
- ErrorComponentName
- ErrorComponentType
- ErrorMessage
- ErrorTrace
- ErrorDateTime
- ErrorExchangeID
- ErrorSeqID
- ErrorTaskID

---

<a id="errors-tab"></a>

##### Errors Tab

> 📄 Source: [Errors_Tab.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Errors_Tab.htm)

###### Errors Tab


The Errors tab provides the list of all errors that are logged in the event log file. With this information users can locate and eliminate the problems that occur during processing.


Filter: Filters errors by Task ID or Tracer ID.


Highlight: Highlights elements.


| Field | Description |
| --- | --- |
| Profile Name | The name of the profile where an error occurs. |
| Service Name | The name of the service where an error occurs. |
| Component Name | The name of the component where an error occurs. |
| Task ID | The ID of the task with errors. |
| Trace ID | The trace ID of the task with errors. |
| Exchange ID | The ID of the exchange with errors. |
| Message | The error message. |
| Stack Trace | Information about the location of an error in the log. |

---

<a id="parse-errors-tab"></a>

##### Parse Errors Tab

> 📄 Source: [Parse_Errors_Tab.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Parse_Errors_Tab.htm)

###### Parse Errors Tab


The Parse Errors tab provides information about the errors that occur during the log report generation.


| Field | Description |
| --- | --- |
| Log File | The name of the event log file that fails to be parsed by the Log Analyzer. |
| Line Number | The number of the line where an error occurs. |
| Message | The message describing an error. |

---

<a id="log-extraction"></a>

### Log Extraction

> 📄 Source: [Book_Log_Extraction.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Book_Log_Extraction.htm)

#### Log Extraction


This section has the following information:

---

<a id="log-extraction-overview"></a>

#### Log Extraction Overview

> 📄 Source: [Log_Extraction_Overview.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Log_Extraction_Overview.htm)

##### Log Extraction Overview


Log Analyzer provides users with an opportunity to compile an extract from xes.events.log file. Log Extractor makes the information about the errors easier to analyze and understand since only those events that are logged within a specific time frame or are related to a particular route or task are displayed. This option is helpful in case it is necessary to find out what caused an error during processing to resolve this issue.


It is also possible to create an extract by using the XEServer command line tool. For more information about how to use the Log Extractor command line tool, see [Log Extractor Command Line Tool](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Log_Extractor_Command_Line_Tool.htm).

---

<a id="create-a-new-log-extraction"></a>

#### Create a New Log Extraction

> 📄 Source: [Create_a_New_Log_Extraction.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Create_a_New_Log_Extraction.htm)

##### Create a New Log Extraction


Creating log extraction enables working with a specific part of a log file instead of a full log report.


To create a new log extraction:

1. Open Edifecs Application Manager.
2. On the System tab, expand XEServer.
3. Double-click Log Analyzer.
4. On the Outline tab, click Log extractions.
5. On the right side of the LogAnalyzer tab, click New log extraction.
6. In the File list field, specify the path to the xes.events.log file.
7. Specify one of the following:

- Time interval: The time frame with specified starting and ending points.


-or-

- Last time interval: The time interval in minutes from the last event that was logged.

1. Specify the extraction method:

- Route name list: The names of the routes, whose route event logs are included in the report.
- IDs: The ID of the tasks included in the report.

1. Click OK.
2. On the Outline tab, click the log extract to see the details.


*[Image: Extraction]*


To create a new log extraction for the same log that was used to generate a log report:

1. On the LogAnalyzer tab, double-click the report of which log file you want to use.
2. On the right side of the Files tab, click New log extraction.


*[Image: Log Analyzer]*

1. Specify one of the following:

- Time interval: The time frame with specified starting and ending points.


-or-

- Last time interval: The time interval in minutes from the last event that was logged.

1. Specify the extraction method:

- Route name list: The names of the routes, whose route event logs are included in the report.
- IDs: The ID of the tasks included into the report.


*[Image: Create a log extraction]*


Note If you want to get an extract from a specific log file, delete the paths to the other log files in the File list field.

1. Click OK.


Note An EAM Notification message confirms that the generation is completed successfully. The message is displayed in the top right-hand corner of the screen.

1. On the Outline tab, double-click the log extraction to see the details.


The generated extracts are stored at ${XESRoot}\tools\log-analyzer\log-extracts.

---

<a id="work-with-log-extraction"></a>

#### Work with Log Extraction

> 📄 Source: [Work_with_Log_Extraction.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Work_with_Log_Extraction.htm)

##### Work with Log Extraction


As the log extract is generated, it is stored at ${XESRoot}\tools\log-analyzer\log-extracts. For more information about how to create a new extract, see [Create a New Log Extraction](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Create_a_New_Log_Extraction.htm). You can view the generated log extract by using Edifecs Application Manager.


To open a log extract by using Edifecs Application Manager:

1. Open Edifecs Application Manager.
2. On the System tab, expand XEServer.
3. Double-click Log Analyzer.
4. On the Outline tab, expand Log extractions, and then click the extract you need.
5. The LogAnalyzer tab displays the Overview section and the log extract itself.
6. Expand Overview to see the details:


*[Image: Log Extraction overview]*


The Overview section contains the following information:


| Field | Description |
| --- | --- |
| Report name | The name of the report from which the extract was generated. Go to option is provided to switch to the report from which the extract is generated. |
| File name | The name of the generated extract. |
| File size | The size of the extract. |
| Last modified | The last time the extract was updated. |



###### Log Extraction Tab


The log extract is displayed on the Log Extraction tab.


###### Properties Tab


Properties tab displays the information about the extraction properties.


###### Log Extraction Properties


Log Extraction Properties section displays the list of all properties.


| Field | Description |
| --- | --- |
| Name | The name of the property. |
| Value | The value of the property. |



###### Errors


Errors section displays the list of all properties with errors.


| Field | Description |
| --- | --- |
| Name | The name of the property. |
| Value | The value of the property. |



###### Error Description


This section contains the description of an error.

---

<a id="command-line-tools-for-log-analyzing"></a>

### Command Line Tools for Log Analyzing

> 📄 Source: [Book_Command_Line_Tools_for_Log_Analyzing.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Book_Command_Line_Tools_for_Log_Analyzing.htm)

#### Command Line Tools for Log Analyzing


This section has the following information:

---

<a id="log-analyzer-command-line-tool"></a>

#### Log Analyzer Command Line Tool

> 📄 Source: [Log_Analyzer_Command_Line_Tool.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Log_Analyzer_Command_Line_Tool.htm)

##### Log Analyzer Command Line Tool


Log Analyzer command line tool is another way to create an event log report that is compiled based on the log files.


The LogAnalyzer.bat file that initiates report generation is located at ${XESRoot}/tools/log-analyzer/bin. The resulting report is stored at ${XESRoot}/tools/log-analyzer/log-reports. By default, the report contains the event statistics of all the existing profiles.


Use the following command line parameters to customize the report:


| Parameter | Description | Default Value |
| --- | --- | --- |
| -h | Displays the command line parameters description. |   |
| -log-files <SetOfLogFiles> | Path to the log file. The paths to several profiles should be separated by commas. | ${XESRoot}/profiles |
| -encoding <Encoding> | The encoding of the log file. |   |
| -result-file <FilePath> | The path to the resulting report. | ${XESRoot}/tools/log-analyzer/log-reports |
| -task-duration-limit <Number> | Task duration limit in milliseconds. | 1000 milliseconds |
| -exchange-properties-limit<Number> | The maximum number of message exchange properties to track per task. | 0 |
| -report-format <xml\|html> | The format (XML or HTML) in which the report is stored. | html |
| -report-title <String> | The title of the resulting report. | "Log Report" |
| -problem-tasks-limit <Number> | The maximum number of the detected problem tasks. | -1 (not limited) |
| -errors-limit <Number> | The maximum number of the detected errors. | -1 (not limited) |
| -treat-task-with-warning-as-problem-task <true\|false> | Controls whether to include tasks with warnings in the problem tasks list or not. | False |
| -treat-task-with-error-as-problem-task <true\|false> | Controls whether to include tasks with errors in the problem tasks list or not. | True |
| -treat-not-started-or-not-completed-task-as-problem-task <true\|false> | Controls whether to include tasks that are not started or completed in the problem tasks list or not. | True |
| -treat-task-with-this-text-as-problem-task <string1, string2> | If the task contains at least one of the specified strings, it is included in the problem tasks list. |   |
| -treat-long-lasting-task-as-problem-task <true\|false> | Controls whether to include tasks with duration that exceeds the specified value in the problem tasks list or not. | False |
| -ignore-warning-ids <Event_ID_1; Event_ID_2...> | Specify warning IDs that should be ignored. |   |



You can also use Edifecs Application Manager to generate log reports by using User Interface (UI). For more information about how to generate reports by using Edifecs Application Manager, see [Create a New Report](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Create_New_Report.htm).

---

<a id="log-extractor-command-line-tool"></a>

#### Log Extractor Command Line Tool

> 📄 Source: [Log_Extractor_Command_Line_Tool.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Log_Extractor_Command_Line_Tool.htm)

##### Log Extractor Command Line Tool


Log Extractor is a command line tool used to generate extracts from the event log files.


The LogExtractor.bat file that initiates log extract generation is located at ${XESRoot}/tools/log-analyzer/bin. The resulting extracts in text format with a property file are stored at ${XESRoot}/tools/log-analyzer/log-extracts. By default, Log Extractor generates an xes.event.extr.log file containing all the log events for each existing profile.


Use the following command line parameters to customize the resulting extract:


| Parameter | Description | Default Value |
| --- | --- | --- |
| -h | Displays the command line parameters description. |   |
| -log-files <SetOfLogFiles> | Path to the log file. The paths to several profiles should be separated by commas. | ${XESRoot}/profiles |
| -result-dir <FilePath> | The path to the resulting report in text format. | ${XESRoot}/tools/log-analyzer/log-extracts |
| -start-date "YYYY-MM-dd hh:mm:ss.SSS" | The starting point of the time interval. |   |
| -end-date "YYYY-MM-dd hh:mm:ss.SSS" | The ending point of the time interval. |   |
| -ids <Ids> | The IDs of the task that are included in the log extract. The IDs should be separated by commas. |   |
| -skip-result-properties | Disables saving the properties. |   |
| -encoding <CharsetName> | The name of the character set of the log file and the resulting extract. | Platform Encoding |
| -route-names <SetOfRouteNames> | The names of the routes that are included in the extract. |   |
| -end-minutes <EndMinutes> | The time interval in minutes ending with the last logged event. |   |
| -trace-id-prefix <TraceIdPrefix> | Include all TraceIDs that start with the specified prefix. | TRACE- |

---

<a id="log-analyzer-use-cases"></a>

### Log Analyzer Use Cases

> 📄 Source: [Log_Analyzer_Use_Cases.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Log_Analyzer_Use_Cases.htm)

#### Log Analyzer Use Cases


This scenario demonstrates how Log Analyzer can be used to find out what caused processing failure.


There is an expectation that a certain task, initiated by the inbound file, should produce certain output, but the target folder is empty. With Log Analyzer, users are able to run the analytical report and see what happened.


Upon completion of the scenario, you are able to:

- Locate an error by analyzing the log report
- Resolve the issue that caused the error


Before you go through this scenario, you should do the following:

- Create a new profile. For more information, see [Create a New Profile](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Create_a_New_Profile.htm).
- Create a new route. For more information, see [Create a New Route](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Create_a_New_Route.htm).


To configure the route:

1. On the Palette, in the Inbound Endpoints section, click File System, and in the Route Viewer, click the place where you want to locate the selected component. An FS Inbound component is displayed in the Route Viewer.

1. On the Palette, in the Enterprise Integration Patterns section, click Aggregation, and in the Route Viewer, click the place where you want to locate the selected component. An Aggregation component is displayed in the Route Viewer.

1. Click Aggregation component, and then click the Settings tab.
2. On the Completion tab, make sure that the number of messages coincide with the following ones:


*[Image: Aggregation Completion tab]*

1. On the Aggregation tab, specify the aggregation strategy as Create multimessage exchange.
2. On the Palette, in the XEngine section, click Native Processing, and in the Route Viewer, click the place where you want to locate the selected component.
3. On the Palette, in the Outbound Endpoints section, click File System, and in the Route Viewer, click the place where you want to locate the selected component.
4. Connect the FS Inbound components to the Aggregation component.
5. Connect the Aggregation component aggregated output to the Native Processing component.
6. Connect the Native Processing component xdata, reports, and acks outputs to the FS Outbound component.
7. Click Save () or press CTRL+S to save changes.


*[Image: Log Analyzer Use Case Route]*


To process the test data files:

1. In your File Manager, go to ${XERoot}samples\standards\X12\data.
2. Copy the 101.dat file and rename it as 101_1.dat, so that you have two similar files in native format with different names.
3. Copy two data files to the source folder for the inbound endpoints. By default, it is located at ${XESRoot}\profiles\[ProfileName]\workspace\test-data\inbound.


###### Expected results:


By default, the results are located at ${XESRoot}\profiles\[ProfileName]\workspace\test-data\outbound. But the outbound folder is empty.


To find out on what caused an error do the following:

1. Using Log Analyzer, create a log report. For more information about how to create a log report, see [Create a New Report](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Create_New_Report.htm).

- Open the generated report.
- The Overview section displays the number of errors that occurred during processing.


*[Image: LogAnalyzer Problem Tasks]*

1. On the Route Report tab, the Error Component field contains the name of the component on which an error occurred.


*[Image: LogAnalyzer Error Component]*


As the File System Inbound component is configured properly, the only reason for an error to occur is that further processing fails because of the incoming messages. Due to the fact that the Aggregation component is configured to pick up data files with the same correlation ID, no resulting data is generated from the incoming files because these files do not have correlation ID properties.


To resolve the issue:

1. Navigate to location of the 101.dat and 101_1.dat files.
2. For the data files in native format, create the corresponding property files:

- For the 101.dat file, create an empty text file with the name 101.dat.properties so that you have a file in native format and a property file.
- Open the 101.dat.properties file and type CorrelationID=true.
- Create the property file 101_1.dat.properties for 101_1.dat following the preceding instructions.

1. Copy two data files with their properties to the source folder for the inbound endpoints. By default, it is located at ${XESRoot}\profiles\[ProfileName]\workspace\test-data\inbound.


###### Expected results:


The outbound folder contains a file in XData format, reports, and acknowledgments.

---

<a id="tools"></a>

## Tools

> 📄 Source: [Book_Tools.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Book_Tools.htm)

### Tools


This section has the following information:

---

<a id="encryption-tool"></a>

### Encryption Tool

> 📄 Source: [Encryption_Tool.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Encryption_Tool.htm)

#### Encryption Tool


XEServer comes with a command-line Encryption tool that you can use to create and modify encrypted properties containing sensitive data like passwords, tokens, and so on.


The tool is located at ${XESRoot}\tools\xes-crypto-tool


The Encryption tool is designed as an alternative for creating categories of [encrypted environment properties](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Environment_Tab.htm#EncryptedProperties) in EAM:



When you add new encrypted properties categories, EAM creates files (one for each category) in the Edifecs Encrypted Properties file format (.eproperties) at the following locations:

- If set for [global environment](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Environment_Tab.htm): ${XESRoot}\environment\<PropertiesCategory>.eproperties
- If set for [profile environment](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Profile_Environment_Tab.htm): ${XESRoot}\profiles\<XESProfileName>\config\environment\<PropertiesCategory>.eproperties


##### Tool Usage


To use the tool, run the encrypt.bat script. You can pass the properties to encrypt either in the form of command-line parameters or/and within a Java properties file containing unencrypted properties.


The basic template for a command looks as follows:


encrypt.bat -i <path_to_unencrypted_input_properties_file> -p <property_name>=<property_value> -s '<encryption_scheme>' -o <path_to_encrypted_output_properties_file>


###### Tool CLI parameters


Below are the parameters that the encrypt.bat script accepts:


| Parameter | Description | Is Mandatory |
| --- | --- | --- |
| -i <path_to_unencrypted_input_properties_file> | Path to an input file containing a collection of properties to encrypt. You can specify this parameter more than one time, as well as combine it with `-p` parameter(s) within one command. The file must be of the Java properties file format defined in the Oracle documentation for the [Properties java class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Properties.html#load(java.io.Reader)). | You must specify at least one of these parameters. |
| -p <property_name>=<property_value> | A single property with the value to encrypt. You can specify this parameter more than one time, as well as combine it with `-i` parameter(s) within one command. | |
| -s '<encryption_scheme>' | The following encryption scheme options are supported: `'AES'`: The Advanced Encryption Standard (used by default). `'XE'`: The Data Encryption Standard (PBEWithMD5AndDES). This option is deprecated as considered to be vulnerable and should be used for backward compatibility only. | No. If this parameter is not specified, than the AES scheme is used. |
| -o <path_to_encrypted_output_properties_file> | Path to the output file with the properties encrypted. If the file already exists, the tool changes only those properties in this file that you specify in input parameters (`-i` and `-p`). | Yes |



##### Examples


Below are the common tool usage examples.

 [Copy](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/javascript:void(0);)
 Example 1


```
::This command adds/changes the "MSSQL_PASSWORD" property value within encrypted "MyPasswords" category for the global environment
encrypt.bat -p MSSQL_PASSWORD=12345 -o "${XESRoot}/environment/MyPasswords.eproperties"
```






 

 [Copy](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/javascript:void(0);)
 Example 2


```
:: This command adds/changes the "MSSQL_PASSWORD" property value within encrypted "MyPasswords" category for the "MyProfile" XEServer profile
encrypt.bat -p MSSQL_PASSWORD=12345 -o "${XESRoot}/profiles/MyProfile/config/environment/MyPasswords.eproperties"
```






 

 [Copy](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/javascript:void(0);)
 Example 3


```
:: This command encrypts properties' values contained in the unencrypted "props_to_encrypt.properties" input file and adds/changes these values in the "MyPasswords.eproperties" output file
encrypt.bat -i props_to_encrypt.properties -o "${XESRoot}/environment/MyPasswords.eproperties"
```






 

 [Copy](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/javascript:void(0);)
 Example 4


```
:: This command encrypts unencrypted properties' values contained in the "MyPasswords.eproperties" file keeping all existing encrypted properties in this file unchanged
encrypt.bat -i "${XESRoot}/environment/MyPasswords.eproperties" -o "${XESRoot}/environment/MyPasswords.eproperties"
```

---

<a id="sdk-directory"></a>

## SDK Directory

> 📄 Source: [SDK_Directory.htm](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/SDK_Directory.htm)

### SDK Directory


XEServer SDK directory (${XESRoot}/sdk) contains packages with built-in XEServer features that you can extend or customize. A package includes integration tools, source code, API documentation, and compiled examples of XEServer components and services.


The following packages are available:

 kafka


The directory contains source code, API documentation, and the default implementation of Kafka Serialization/Deserialization API. This API defines how XEServer [Kafka](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Kafka_Service.htm) and [Kafka2](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/Kafka_2_Service.htm) services map XEServer message exchanges to/from Kafka messages. The source code includes all the necessary Java classes and interfaces required to build your own Serializer/Deserializer.

 [Copy](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/Content/javascript:void(0);)


kafka




```
kafka
├───apidocs
│       API documentation
├───src
│   └───com
│       └───edifecs
│           └───etools
│               └───xeserver
│                   └───kafka
│                       ├───serialization
│                       │     XEServer classes and interfaces
│                       │
│                       └───impl
│                           Default (De)Serializer implementation used
│                           by XEServer Kafka services.
├───v0
│   A complete Serialization API JAR intended for the Kafka service.
│   This is a copy of the JAR that is used by the XEServer Kafka service by default.
│
└───v2
    A complete Serialization API JAR intended for the Kafka2 service.
    This is a copy of the JAR that is used by the XEServer Kafka2 service by default.
```






Tip You can modify JARs and source code under the Kafka SDK directory and it will not affect the default Kafka services behavior.


If you want to create your own Kafka message Serializer/Deserializer, you should:

1. Create your custom Java classes that implement `ISerializer`/`IDeserializer` interfaces. The names of your classes must differ from those classes contained in the kafka package, for example com.example.MyKafkaKeySerializer/com.example.MyKafkaValueSerializer, and com.example.MyKafkaKeyDeserializer/com.example.MyKafkaValueDeserializer.
2. Put the resulting xes-kafka-serialization-api-9.4.0-SNAPSHOT.jar to ${XESRoot}\features\kafka\lib\v0(to work with the Kafka service) or to ${XESRoot}\features\kafka\lib\v2 (to work with the Kafka2 service).
3. Declare the following properties on the Consumer tab of the corresponding Kafka service: - key.deserializer = com.example.MyKafkaKeyDeserializer - value.deserializer = com.example.MyKafkaValueDeserializer
4. Declare the following properties on the Producer tab of the corresponding Kafka service: - value.serializer = com.example.MyKafkaKeySerializer - value.deserializer = com.example.MyKafkaValueSerializer
5. Restart the profile with the Kafka / Kafka2 services.

---

*Documentation sourced from the [Edifecs XEServer Help Portal](https://help.edifecsfedcloud.com/svc/product/xeserver/9.4/). All content © Edifecs Inc.*

*Generated: Mon, 29 Jun 2026 20:50:22 GMT — 65 pages.*
