import com.edifecs.etools.xeserver.proxy.ProxyMessage;
import com.edifecs.etools.commons.io.SmartStream;
import groovy.util.slurpersupport.NodeChild;
import java.io.*;

exchange = context.exchange;
exchProperties = exchange.properties;
messages = exchange.messages;
message = messages[0];
msgHeaders = message.headers;

exchProperties.each{ k, v -> msgHeaders.put(k, v) }

messageBodyInputStream = message.getBodyAsSmartStream().getInputStream();

def root = new XmlSlurper().parse(messageBodyInputStream);

StringBuilder errorBuilder = new StringBuilder();
def transactionSetControlNumber;

def groupSnipCategory;
def groupCoverageSnip;
def groupErrorID;
def groupErrorBrief;
def groupErrorMsg;

def interchangeSnipCategory;
def interchangeCoverageSnip;
def interchangeErrorID='';

def dataReportSnipCategory;
def dataReporCoverageSnip;

def interchangeErrorBrief;
def interchangeErrorMsg;

def dataReportErrorBrief;
def dataReportErrorMsg;
def dataReportErrorID;

StringBuilder fileLevelErrors;
StringBuilder transactionErrors;
StringBuilder providerErrors;
StringBuilder claimErrors;

List snipList;
List snipListFile;

List rejectedMemberIDList;
List memberFoundLDNS;
List maintenanceTypeCode


def TraceNumber = '';
//def EDIFileName = '';
def ediFileId = '';
//def InputFileName = '';
def TotalPaymentAmount = '';
def PatientLastName ='';
def PatientMiddleName ='';
def PatientFirstName ='';
def PatientControlNumber='';
def ClaimHCCId = '';
//def TimeStamp = '';
def CheckDate='';
def SendDate='';
println("EDIFileName = " + EDIFileName);
println("InputFileName = " + InputFileName);
println("TimeStamp = " + TimeStamp);
//println("PatientLastName = " + PatientLastName)
//println("PatientMiddleName = " + PatientMiddleName);
//println("PatientFirstName = " + PatientFirstName);
root.each { DataReportNode ->

	int dataReportErrorcount= 0;
	def EntireDocumentErrorTotal='';
	fileLevelErrorIDMap = new HashMap<String, String>();
	snipListFile = new ArrayList();
	DataReportNode.Fields.Field.each { DataReportField ->
                         
						 
							fileLevelErrors = new StringBuilder();
						 
							String entireDocumentField = DataReportField.@Name;
                          
                           if (entireDocumentField == "InputFileName") {
                                    InputFileName = DataReportField.text();
                                    						
									}
						   if (entireDocumentField == "EDIFileName") {
                                    EDIFileName = DataReportField.text();
                                   						
                           }
						   if (entireDocumentField == "ediFileId") {
                                    ediFileId = DataReportField.text();
                                 							
                           }
						   if (entireDocumentField == "TimeStamp") {
                                    TimeStamp = DataReportField.text();
                                 							
                           }
						    if (entireDocumentField == "CheckDate") {
                                    CheckDate = DataReportField.text();
                                 							
                           }
						   if (entireDocumentField == "SendDate") {
                                    SendDate = DataReportField.text();
                                 						
                           }
						   }
						
						for(NodeChild error: DataReportNode.Errors.Error)
						{
					//DataReportNode.Errors.Error.each { error ->
                         
						dataReportErrorBrief = error.Brief.text().toString();
						dataReportErrorMsg = error.Msg.text().toString();
						dataReportSnipCategory = error.@Category;
						dataReportErrorID = error.@ID;
						
					if(dataReportSnipCategory == 'Rejecting')
					{
						dataReporCoverageSnip = error.@SNIP.text().toString();
						if(!snipListFile.contains(dataReporCoverageSnip))
							{
								snipListFile.add(dataReporCoverageSnip);
							}
						
						dataReportErrorcount = dataReportErrorcount + 1;
                  
						String dataReportErrorcounter = Integer.toString(dataReportErrorcount);
              
						fileLevelErrors.append("EntireDocumentError"+"${dataReportErrorcounter}"+" " + "${dataReportErrorBrief}" + "${dataReportErrorMsg}");
						def keyValueED = "EntireDocument"+dataReportErrorcounter;
						fileLevelErrorIDMap.put(keyValueED,dataReportErrorID);
						break;
						}
					}
					DataReportNode.ErrorStatistics.each { errorStatistics ->	
					EntireDocumentErrorTotal = errorStatistics.ErrorTotal.text().toString();
					
						
						}
					root.GroupNode.each { InterchangeNode ->
						int interchangeErrorcount =0;
 
						
					for(NodeChild error: InterchangeNode.Errors.Error)
						{
					//InterchangeNode.Errors.Error.each { error ->
                         
                    interchangeErrorBrief = error.Brief.text().toString();
                    interchangeErrorMsg = error.Msg.text().toString();
					interchangeSnipCategory = error.@Category;
					interchangeErrorID = error.@ID;
					
					if(interchangeSnipCategory == 'Rejecting')
					{
						interchangeCoverageSnip = error.@SNIP.text().toString();
						if(!snipListFile.contains(interchangeCoverageSnip))
							{
								snipListFile.add(interchangeCoverageSnip);
							}
                    interchangeErrorcount = interchangeErrorcount + 1;
                  
                    String interchangeErrorcounter = Integer.toString(interchangeErrorcount);
              
                    fileLevelErrors.append("InterchangeGroupError " + "${interchangeErrorcounter}" + " " + "${interchangeErrorMsg}");
					
					def keyValueInterchange = "Interchange"+interchangeErrorcounter;
					fileLevelErrorIDMap.put(keyValueInterchange,interchangeErrorID);
					break;
					}
				}
			     
		InterchangeNode.GroupNode.each { GroupNode ->
			
			int groupErrorcount= 0;
			for(NodeChild error: GroupNode.Errors.Error)
						{
			//GroupNode.Errors.Error.each { error ->
                         
                    groupErrorBrief = error.Brief.text().toString();
                    groupErrorMsg = error.Msg.text().toString();
					groupSnipCategory = error.@Category;
					groupErrorID = error.@ID;
									
					if(groupSnipCategory == 'Rejecting')
					{
						groupCoverageSnip = error.@SNIP.text().toString();
						if(!snipListFile.contains(groupCoverageSnip))
							{
								snipListFile.add(groupCoverageSnip);
							}
                    groupErrorcount = groupErrorcount + 1;
                  
                    String groupErrorcounter = Integer.toString(groupErrorcount);
              
                    fileLevelErrors.append("FunctionalGroupError " + "${groupErrorcounter}" + " " + "${groupErrorMsg}");
					def keyValueGroup = "Group"+groupErrorcounter;
					fileLevelErrorIDMap.put(keyValueGroup,groupErrorID);
					break;
					}
			}
		
			if(fileLevelErrors.size() > 0)
				{
					//println("inside if loop"+fileLevelErrors.toString());
					errorBuilder.append("Edifecs");
					 errorBuilder.append(",");
					 errorBuilder.append("Provider");
					 errorBuilder.append(",");
					 errorBuilder.append(EDIFileName);
					 errorBuilder.append(",");
					 errorBuilder.append(InputFileName);
					 errorBuilder.append(",");
					 errorBuilder.append("Daily");
					 errorBuilder.append(",");
					 errorBuilder.append(TraceNumber);
					 errorBuilder.append(",");
					 errorBuilder.append(CheckDate);
					 errorBuilder.append(",");
					 errorBuilder.append(TotalPaymentAmount);
					 errorBuilder.append(",");
					 errorBuilder.append(ClaimHCCId);
					 errorBuilder.append(",");
					 errorBuilder.append(PatientControlNumber);
					 errorBuilder.append(",");
					 errorBuilder.append("${PatientLastName}" + " " + "${PatientFirstName}" +" " + "${PatientMiddleName}");
					 errorBuilder.append(",");
					 errorBuilder.append("PNC");
					 errorBuilder.append(",");
					 if((fileLevelErrorIDMap.size()>0)  || (fileLevelErrors.toString() != ''))
					 {
						errorBuilder.append("R").append(',');	
					 }
					 else
					 {
						 errorBuilder.append("A").append(',');	
					 }
					
			
			  for (Map.Entry<String,String> entry : fileLevelErrorIDMap.entrySet()) {
					
						//String stateIDMap = entry.getKey();
						String fileLevelErrorIDFromMap = entry.getValue();
					
						//if(memberID == rejectedMemberIDList[i]){
					if(fileLevelErrorIDMap.size() == 1) errorBuilder.append(fileLevelErrorIDFromMap);
					else errorBuilder.append(";").append(fileLevelErrorIDFromMap);
						//}
					}
						errorBuilder.append(",");								 				 
						errorBuilder.append(fileLevelErrors.toString())
						errorBuilder.append(",");
					//errorBuilder.append(EntireDocumentErrorTotal).append(',');
				
					 errorBuilder.append();
					 errorBuilder.append(",");
					 errorBuilder.append(",");
					 errorBuilder.append(",");
					 errorBuilder.append(",");
					 errorBuilder.append(",");
					 if((fileLevelErrors == "") && (transactionErrors == "")){
                         errorBuilder.append(SendDate);
                     }
                     else if ((fileLevelErrors != "") && (dataReportSnipCategory == 'Rejecting')){
                     errorBuilder.append(SendDate);
					 }
					 else errorBuilder.append(SendDate);
					  errorBuilder.append(",");
			         errorBuilder.append(TimeStamp);
					 
					 errorBuilder.append("\r\n");  			
					
					 newMessageBody = errorBuilder.toString();

				ProxyMessage newMessage = context.createNewMessage(newMessageBody, message.getHeaders())
				context.createExchangeResponse(msgHeaders, newMessage);
				}
		
			else{
				//println("else loop inside");
				GroupNode.GroupNode.each { TransactionNode ->
            	
					transactionErrors = new StringBuilder();
					snipList = new ArrayList();
					transactionErrorIDMap = new HashMap<String, String>();
					
					TransactionNode.Fields.Field.each { TransactionField ->                      
                                String var = TransactionField.@Name;
                                 
                                if (var == "TraceNumber") {
                                    TraceNumber = TransactionField.text();                     
                                } 	
								if (var == "TotalPaymentAmount") {
                                    TotalPaymentAmount = TransactionField.text();                     
                                } 
                                 								
								
						}
					int transactionErrorcount = 0;
					//int recordLevelErrorCount = 0;
						def transactionSnipCategory ='';
						def transactionSnip ='';
						def transactionErrorID='';
						def transactionErrorBrief='';
						def transactionErrorMsg='';
						
						
						
					for(NodeChild error: TransactionNode.Errors.Error)
						{				
					//TransactionNode.Errors.Error.each { error ->                  
                    transactionErrorBrief = error.Brief.text().toString();
                    transactionErrorMsg = error.Msg.text().toString();
					transactionErrorID = error.@ID;
					transactionSnipCategory = error.@Category;
					
					
					if(transactionSnipCategory == 'Rejecting')
					{
							transactionSnip = error.@SNIP.text().toString();
						
							if(!snipList.contains(transactionSnip))
							{
									snipList.add(transactionSnip);
							}
						
                    transactionErrorcount = transactionErrorcount + 1;
                  
                    String transactionErrorcounter = Integer.toString(transactionErrorcount);
              
                    transactionErrors.append("TransactionSetError " + "${transactionErrorcounter}" + " " + "${transactionErrorMsg}");
					transactionErrorIDMap.put(transactionErrorcounter,transactionErrorID);
					break;
					}
				}
				
				    TransactionNode.GroupNode.each { providerNode ->
					providerErrors = new StringBuilder();
					claimErrors = new StringBuilder();
					
					providerErrorIDMap = new HashMap<String, String>();
					providerErrorsMap = new HashMap<String, String>();
					claimErrorsMap = new HashMap<String, String>();
					
					claimErrorIDMap = new HashMap<String, String>();					                  
					
                            
				
						int providerErrorcount = 0;
						int providerErrorTotal = 0;
						String recordLevelErrorCountTotal = '';
						def providerSnipCategory ='';
						def providerSnip ='';
						def providerErrorID='';
						def providerErrorBrief='';
						def providerErrorMsg='';

				
					for(NodeChild error: providerNode.Errors.Error)
						{
            
               
                         
                        providerErrorBrief = error.Brief.text().toString();
                        providerErrorMsg = error.Msg.text().toString();
						providerErrorID = error.@ID;
						providerSnipCategory = error.@Category;
						
						if(providerSnipCategory == 'Rejecting')
						{
							providerSnip = error.@SNIP.text().toString();
						
							if(!snipList.contains(providerSnip))
							{
									snipList.add(providerSnip);
							}
						
						providerNode.ErrorStatistics.each { errorStatistics ->	
							providerErrorTotal = errorStatistics.ErrorTotal.toInteger()
						
						}
						
                        providerErrorcount = providerErrorcount + 1;
                  
                        String providerErrorcounter = Integer.toString(providerErrorcount);
              
                        providerErrors.append("ProviderError " + "${providerErrorcounter}" + " " + "${providerErrorMsg}");
						providerErrorsMap.put(TraceNumber, providerErrors);
						providerErrorIDMap.put(TraceNumber,providerErrorID);
					
					break;
						
            
						}
						
					}
						
						                           
                        providerNode.GroupNode.each { claimNode ->
						
						claimErrors = new StringBuilder();
            
             
                                int claimErrorcount = 0;
								def claimSnipCategory ='';
								def claimSnip ='';
								def claimErrorBrief='';
								def claimErrorMsg='';
								def claimErrorID='';
								
								claimNode.Fields.Field.each { claimField ->                      
                                String var = claimField.@Name;
                                 
                                if (var == "ClaimHCCId") {
                                    ClaimHCCId = claimField.text();                     
                                } 	
								if (var == "PatientControlNumber") {
                                    PatientControlNumber = claimField.text();                     
                                } 
								
								if (var == "PatientLastName") {
                                    PatientLastName = claimField.text();                     
                                } 
								if (var == "PatientFirstName") {
                                    PatientFirstName = claimField.text();                     
                                } 
								if (var == "PatientMiddleName") {
                                    PatientMiddleName = claimField.text();                     
                                } 
								
								
						}
            
								for(NodeChild error: claimNode.Errors.Error)
								{
				
                                //claimNode.Errors.Error.each { error ->
                         
                                claimErrorBrief = error.Brief.text().toString();
                                claimErrorMsg = error.Msg.text().toString();
								claimErrorID = error.@ID;
								claimSnipCategory = error.@Category;
						
								if(claimSnipCategory == 'Rejecting')
								{
									claimSnip = error.@SNIP.text().toString();
									if(!snipList.contains(claimSnip))
										{
											snipList.add(claimSnip);
										}						
                                claimErrorcount = claimErrorcount + 1;
                  
                                String claimErrorcounter = Integer.toString(claimErrorcount);
              
                                claimErrors.append("claimError " + "${claimErrorcounter}" + " " + "${claimErrorMsg}");
								claimErrorsMap.put(TraceNumber, claimErrors);
								claimErrorIDMap.put(TraceNumber,claimErrorID);
								break;
								}
								
							}
								
                        }			
					 errorBuilder.append("Edifecs");
					 errorBuilder.append(",");
					 errorBuilder.append("Provider");
					 errorBuilder.append(",");
					errorBuilder.append(EDIFileName);
					 errorBuilder.append(",");
					errorBuilder.append(InputFileName);
					 errorBuilder.append(",");
					 errorBuilder.append("Daily");
					 errorBuilder.append(",");
				     errorBuilder.append(TraceNumber);
					 errorBuilder.append(",");
					 errorBuilder.append(CheckDate);
					 errorBuilder.append(",");
					 errorBuilder.append(TotalPaymentAmount);
					 errorBuilder.append(",");
					 errorBuilder.append(ClaimHCCId);
					 errorBuilder.append(",");
					 errorBuilder.append(PatientControlNumber);
					 errorBuilder.append(",");
					errorBuilder.append("${PatientLastName}" + " " + "${PatientFirstName}" +" " + "${PatientMiddleName}");
					 errorBuilder.append(",");
					 errorBuilder.append("PNC");
					 errorBuilder.append(",");
					 
					 
					 if((providerErrorsMap.size()>0) || (claimErrorsMap.size()>0) || (transactionErrors.toString() != ''))
					 {
						errorBuilder.append("R").append(',');	
					 }
					 else
					 {
						 errorBuilder.append("A").append(',');	
					 }
					 if(transactionErrorIDMap.size() >= 1) {
						 
					 
					 for (Map.Entry<String,String> entry : transactionErrorIDMap.entrySet()) {
					
						//String stateIDMap = entry.getKey();
						String transactionErrorIDFromMap = entry.getValue();
					
						//if(memberID == rejectedMemberIDList[i]){
					if(transactionErrorIDMap.size() == 1) errorBuilder.append(transactionErrorIDFromMap);
					else errorBuilder.append(";").append(transactionErrorIDFromMap);
						//}
					}
					 }
					else if(providerErrorIDMap.size() >= 1) {
					 for (Map.Entry<String,String> entry : providerErrorIDMap.entrySet()) {
					
						//String stateIDMap = entry.getKey();
						String providerErrorIDFromMap = entry.getValue();
					
						//if(memberID == rejectedMemberIDList[i]){
					if(providerErrorIDMap.size() == 1) errorBuilder.append(providerErrorIDFromMap);
					else errorBuilder.append(";")+append(providerErrorIDFromMap);
						//}
					}
					 }
					else if(claimErrorIDMap.size() >= 1) {
					for (Map.Entry<String,String> entry : claimErrorIDMap.entrySet()) {
					
						
						String claimErrorIDFromMap = entry.getValue();
							//errorBuilder.append(claimErrorIDFromMap);
							if(claimErrorIDMap.size() == 1) errorBuilder.append(claimErrorIDFromMap);
					else errorBuilder.append(";")+append(claimErrorIDFromMap);
					
					}
					}
						errorBuilder.append(",");
						//(providerErrorsMap.size()>0) || (claimErrorsMap.size()>0) || 
				if(transactionErrors.toString() != '')
				{	
						errorBuilder.append(transactionErrors.toString());
					}
					else if((providerErrorsMap.size()>0))	
					{	
						for (Map.Entry<String,String> entry : providerErrorsMap.entrySet()) {
					
						
						String providerErrorsFromMap = entry.getValue();
										
							errorBuilder.append(providerErrorsFromMap);
					
						}
					}
					else if(claimErrorsMap.size()>0)
					{
					for (Map.Entry<String,String> entry : claimErrorsMap.entrySet()) {

						String claimErrorsFromMap = entry.getValue();
						errorBuilder.append(claimErrorsFromMap);
					
						} 
					}
					errorBuilder.append(",")
					int recordLevelErrorCountInteger=0;
					recordLevelErrorCountInteger=transactionErrorcount+providerErrorTotal;
					
					recordLevelErrorCountTotal = Integer.toString(recordLevelErrorCountInteger);
					
					
					//errorBuilder.append(recordLevelErrorCountTotal).append(',');
					 errorBuilder.append(",");
					 errorBuilder.append(",");
					 errorBuilder.append(",");
					 errorBuilder.append(",");
			         errorBuilder.append(",");
					 if((fileLevelErrors == "") && (transactionErrors !="") && (transactionSnipCategory == 'Rejecting')){
	                 errorBuilder.append(SendDate);
                     }
					 else errorBuilder.append(SendDate);
					 errorBuilder.append(",");
				    errorBuilder.append(TimeStamp);

					
					
					
					errorBuilder.append("\r\n");  			
					}
				}
				newMessageBody = errorBuilder.toString();

					ProxyMessage newMessage = context.createNewMessage(newMessageBody, message.getHeaders())
					context.createExchangeResponse(msgHeaders, newMessage);
			}
				
					 
		
	
	}
	}
}