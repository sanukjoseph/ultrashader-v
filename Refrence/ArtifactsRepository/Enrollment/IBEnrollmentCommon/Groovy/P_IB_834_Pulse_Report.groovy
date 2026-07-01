import com.edifecs.etools.xeserver.proxy.ProxyMessage;
import com.edifecs.etools.commons.io.SmartStream;
import groovy.util.slurpersupport.NodeChild;
import java.io.*;

exchange = context.exchange;
exchProperties = exchange.properties;
messages = exchange.messages;
message = messages[0];
msgHeaders = message.headers;

exchProperties.each { k, v -> msgHeaders.put(k, v) }

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
def interchangeErrorID = '';
int recordLevelErrorCountInteger = 0;
String interchangeErrorcounter ;

def dataReportSnipCategory;
def dataReporCoverageSnip;
int memberErrorTotal = 0;
int interchangeErrorcount = 0;

int dataReportError = 0;
int interchangeError = 0;
int memberError = 0;

String recordLevelErrorCountTotal = '';
def interchangeErrorBrief;
def interchangeErrorMsg;

def dataReportErrorBrief;
def dataReportErrorMsg;
def dataReportErrorID;
int transactionErrorcount = 0;
//StringBuilder fileLevelErrors;

StringBuilder transactionErrors;
StringBuilder memberErrors;
StringBuilder healthCoverageErrors;
int healthCoverageErrorCount = 0;

def fileLevelErrors = new StringBuilder()


List snipListFile = new ArrayList();

List rejectedMemberIDList;
List memberFoundLDNS;
List maintenanceTypeCode
int groupErrorcount = 0;

def RecordIdentifier = '';

def EdiFileId = '';
def inputedifilename = '';
def AuditCheck = '';

def InterchangeReceiverID = '';
def InterchangeSenderID = '';
def LineOfBusiness = '';
def recordIdentifiers = '';
def rayIdentifier = '';
def MaintenanceType = '';
def typeOfTransaction = '';
def BGNDate = '';
def ControlNumber = '';
def RecordIdentifiergood = '';
def RecordIdentifierAudit = '';
//RecordIdentifierAudit

//BGNDate
def fileLevelErrorMap = new HashMap<String, String>();

def Interchangecounter = 0;
def Groupcounter = 0;
def Transactioncounter = 0;
int Membercounter = 0;
int Membercounters = 0;
def Healthcoveragecounter = 0;
String transactionErrorcounter=0;

def EntireDocumentErrorTotal = '';
def FileReceiptDateTime = '';
String dataReportErrorcounter =0;
  String groupErrorcounter=0;
   String healthCoverageErrorcounter=0;
   String memberErrorcounter=0;

def countErrors(StringBuilder fileLevelErrors) {
    // Convert the StringBuilder to a String
    String errorString = fileLevelErrors.toString()

    // Check if the string is empty
    if (errorString.isEmpty()) {
        // If empty, there are no errors
        return 0
    } else {
        // Split the string by '~'
        String[] errors = errorString.split("~")
        
        // Count the errors
        return errors.length
    }
}
def errorCount;

root.each { DataReportNode ->

    int dataReportErrorcount = 0;
    fileLevelErrorIDMap = new HashMap<String, String>();
    snipListFile = new ArrayList();
    DataReportNode.Fields.Field.each { DataReportField ->

        String entireDocumentField = DataReportField.@Name;

        if (entireDocumentField == "inputedifilename") {
            inputedifilename = DataReportField.text();
        }
        if (entireDocumentField == "AuditCheck") {
            AuditCheck = DataReportField.text();
        }
        if (entireDocumentField == "EdiFileId") {
            EdiFileId = DataReportField.text();
        }

        if (entireDocumentField == "LineOfBusiness") {
            LineOfBusiness = DataReportField.text();
        }

        if (entireDocumentField == "FileReceiptDateTime") {
            FileReceiptDateTime = DataReportField.text();
        }
		if (entireDocumentField == "RecordIdentifierAudit") {
            RecordIdentifierAudit = DataReportField.text();
        }
		if (entireDocumentField == "Edifileids") {
            Edifileids = DataReportField.text();
        }
		if (entireDocumentField == "recordIdentifier") {
            recordIdentifiers = DataReportField.text();
        }
		
		if (entireDocumentField == "RayIdentifier") {
            rayIdentifier = DataReportField.text();
        }
	}

        for (NodeChild error : DataReportNode.Errors.Error) 
		{
            dataReportErrorBrief = error.Brief.text().toString().replaceAll(',', '');
            dataReportErrorMsg = error.Msg.text().toString().replaceAll(',', '');
            dataReportSnipCategory = error.@Category;
            dataReportErrorID = error.@ID;

            if (dataReportSnipCategory == 'Rejecting') 
			{
                dataReporCoverageSnip = error.@SNIP.text().toString();
                if (dataReporCoverageSnip != null && !snipListFile.contains(dataReporCoverageSnip)) 
				{
                    snipListFile.add(dataReporCoverageSnip);
                }

                dataReportErrorcount = dataReportErrorcount + 1;
                dataReportErrorcounter = Integer.toString(dataReportErrorcount);

                if (!fileLevelErrors.isEmpty()) 
				{
                    String temp = "~" + "${dataReportErrorID}" + ":" + "EntireDocumentError " + "${dataReportErrorcounter}" + " " + "${dataReportErrorBrief}" + "${dataReportErrorMsg}";
                    fileLevelErrors.append(temp);
                } 
				else 
				{
                    String temp = "${dataReportErrorID}" + ":" + "EntireDocumentError " + "${dataReportErrorcounter}" + " " + "${dataReportErrorBrief}" + "${dataReportErrorMsg}";
                    fileLevelErrors.append(temp);
                }

                errorCount = countErrors(fileLevelErrors);
                //println('EntireDocumentErrorcount' + errorCount);
            }
            if (errorCount == 40)
				break;
        }

        DataReportNode.ErrorStatistics.each { errorStatistics ->
            EntireDocumentErrorTotal = errorStatistics.ErrorTotal.text().toString();
        }

    root.GroupNode.each 
		
	{       InterchangeNode ->
            Interchangecounter++;

            InterchangeNode.Fields.Field.each { InterchangeNodeField ->

                String interchangeField = InterchangeNodeField.@Name;

                if (interchangeField == "InterchangeReceiverID") {
                    InterchangeReceiverID = InterchangeNodeField.text().trim();
                }
				if (interchangeField == "InterchangeSenderID") {
                    InterchangeSenderID = InterchangeNodeField.text().trim();
                }
            }
            for (NodeChild error : InterchangeNode.Errors.Error) {
                interchangeErrorBrief = error.Brief.text().toString().replaceAll(',', '');
                interchangeErrorMsg = error.Msg.text().toString().replaceAll(',', '');
                interchangeSnipCategory = error.@Category;
                interchangeErrorID = error.@ID;

                if (interchangeSnipCategory == 'Rejecting') {
                    interchangeCoverageSnip = error.@SNIP.text().toString();
                    if (interchangeCoverageSnip != null && !snipListFile.contains(interchangeCoverageSnip)) {
                        snipListFile.add(interchangeCoverageSnip);
                    }
                    interchangeErrorcount = interchangeErrorcount + 1;
					interchangeErrorcounter = Integer.toString(interchangeErrorcount);

                    //println("interchange Errors" + fileLevelErrors);
                    errorCount = countErrors(fileLevelErrors);

                    //println("interchange error count" + errorCount);

                    if (!fileLevelErrors.isEmpty() && errorCount < 40) {
                        String temp = "~" + "${interchangeErrorID}" + ":" + "InterchangeGroupError " + "${interchangeErrorcounter}" + " " + "${interchangeErrorBrief}" + "${interchangeErrorMsg}";
                        fileLevelErrors.append(temp);
                    } else {
                        String temp = "${interchangeErrorID}" + ":" + "InterchangeGroupError " + "${interchangeErrorcounter}" + " " + "${interchangeErrorBrief}" + "${interchangeErrorMsg}";
                        fileLevelErrors.append(temp);
                    }

                    def keyValueInterchange = "Interchange" + interchangeErrorcounter;
                    fileLevelErrorIDMap.put(keyValueInterchange, interchangeErrorID);

                    //println("INSIDEINTERCHANGEEEEEEEEEEEEEEEEEEEE")
                    //println("interchange Errors" + fileLevelErrors);
                    errorCount = countErrors(fileLevelErrors);
                    if (errorCount == 40)
                        break;
                }
            }

            InterchangeNode.GroupNode.each {GroupNode ->
                Groupcounter++;                
                for (NodeChild error : GroupNode.Errors.Error) 
				{
                    groupErrorBrief = error.Brief.text().toString().replaceAll(',', '');
                    groupErrorMsg = error.Msg.text().toString().replaceAll(',', '');
                    groupSnipCategory = error.@Category;
                    groupErrorID = error.@ID;
                    //println("groupErrorIDbefore" + groupErrorID)

                    if (groupSnipCategory == 'Rejecting') {
                        groupCoverageSnip = error.@SNIP.text().toString();
                        if (groupCoverageSnip != null && !snipListFile.contains(groupCoverageSnip)) {
                            snipListFile.add(groupCoverageSnip);
                        }
                        groupErrorcount = groupErrorcount + 1;
                        groupErrorcounter = Integer.toString(groupErrorcount);

                        //println("GROUPERRORS" + fileLevelErrors);
                        errorCount = countErrors(fileLevelErrors);

                        //println("GROUPERRORCOUNT" + errorCount);

                        if (!fileLevelErrors.isEmpty() && errorCount < 40) 
						{
                            String temp = "~" + "${groupErrorID}" + ":" + "FunctionalGroupError " + "${groupErrorcounter}" + " " + "${groupErrorBrief}" + "${groupErrorMsg}";
                            fileLevelErrors.append(temp);
                        } else {
                            String temp = "${groupErrorID}" + ":" + "FunctionalGroupError " + "${groupErrorcounter}" + " " + "${groupErrorBrief}" + "${groupErrorMsg}";
                            fileLevelErrors.append(temp);
                        }

                        def keyValueGroup = "Group" + groupErrorcounter;
                        fileLevelErrorIDMap.put(keyValueGroup, groupErrorID);

                        errorCount = countErrors(fileLevelErrors);

                        if (errorCount == 40)
                            break;
                    }
                }
				
			
			
                GroupNode.GroupNode.each { TransactionNode ->
                    Transactioncounter++;

                    int transactionErrorcountInteger = 0;
                    

                    def memberID = '';

                    TransactionNode.Fields.Field.each { transactionField ->
                        String transactionFields = transactionField.@Name;

                        
                        if (transactionFields == "TransactionSetControlNumber") {
                            transactionSetControlNumber = transactionField.text().trim();
                        }
                        if (transactionFields == 'SubscriberID') {
                            SubscriberID = transactionField.text().trim();
							//println("SubscriberIDprinting"+SubscriberID);
                        }
                        if (transactionFields == "LineOfBusiness") {
                            LineOfBusiness = transactionField.text().trim();
                        }

                        if (transactionFields == "MaintenanceType") {
                            MaintenanceType = transactionField.text().trim();
                        }
                        if (transactionFields == "MaintenanceType") {
                            typeOfTransaction = transactionField.text().trim();
							//println("typeOfTransaction" + typeOfTransaction);
							if(typeOfTransaction == 021)
							{
								typeOfTransaction = 'A';
							}
							else if(typeOfTransaction == "024")
							{
								typeOfTransaction = 'T';
							}
							else if(typeOfTransaction == "001")
							{
								typeOfTransaction = 'C';
							}
							else
							{
								typeOfTransaction = 'O';
							}
								
							
                        }
						if (transactionFields == "BGNDate") 
						{
                                BGNDate = transactionField.text().trim();
                            
						}
						if (transactionFields == "TransactionControlNumber")
							{
                            ControlNumber = transactionField.text().trim();
                        }
                    }
                    for (NodeChild error : TransactionNode.Errors.Error) {
                        
                        def transactionErrorBrief = error.Brief.text().toString().replaceAll(',', '');
                        def transactionErrorMsg = error.Msg.text().toString().replaceAll(',', '');
                        def transactionSnipCategory = error.@Category;
                        def transactionErrorID = error.@ID;
                        //println("transactionErrorID" + transactionErrorID);

                        if (transactionSnipCategory == 'Rejecting') {
                            def transactionCoverageSnip = error.@SNIP.text().toString();

                            if (transactionCoverageSnip != null && !snipListFile.contains(transactionCoverageSnip)) {
                                snipListFile.add(transactionCoverageSnip);
                            }
                            transactionErrorcount = transactionErrorcount + 1;
							//println("transactionErrorcount"+ transactionErrorcount);
							
                            transactionErrorcountInteger = transactionErrorcountInteger + 1;

                            transactionErrorcounter = Integer.toString(transactionErrorcountInteger);

                            if (!fileLevelErrors.isEmpty() && errorCount < 40) {
                                String temp = "~" + "${transactionErrorID}" + ":" + "TransactionError " + "${transactionErrorcounter}" + " " + "${transactionErrorBrief}" + "${transactionErrorMsg}";
                                fileLevelErrors.append(temp);
                            } else {
                                String temp = "${transactionErrorID}" + ":" + "TransactionError " + "${transactionErrorcounter}" + " " + "${transactionErrorBrief}" + "${transactionErrorMsg}";
                                fileLevelErrors.append(temp);
                            }
                            def keyValueTransaction = "Transaction" + transactionErrorcounter;
                            fileLevelErrorIDMap.put(keyValueTransaction, transactionErrorID);

                            //println("INSIDETRANSACTIONNNNNNNNNNNNNNN")
                            //println("transaction Errors" + fileLevelErrors);
                            errorCount = countErrors(fileLevelErrors);
                            if (errorCount == 40)
                                break;
                        }
                    }
					
		
				
                    TransactionNode.GroupNode.each { MemberNode ->
					def SubscriberNameFirst = '';
					def SubscriberNameMiddle = '';
					def SubscriberNameLast = '';
					def SubscriberBirthDate = '';
					def SubscriberID = '';
					
					def ecRuleValue = MemberNode.@ecRule.text();
					def StatusCode = MemberNode.@StatusCode.text();
					//println("StatusCode"+StatusCode);
					//def ecRuleValue = ecRuleValue.substring(0, 4);
					
					
                        Membercounter++;
						//println("insidemembernodefirst");
                        int memberErrorcount = 0;

                        def memberFileErrors;
                        def memberHealthCoverageErrors;

                       
                        StringBuilder memErrors;

                        MemberNode.Fields.Field.each { memberField ->
						//println("insidemember node");

                            def memberFieldName = memberField.@Name;

                            if (memberFieldName == "SubscriberID") {
                                SubscriberID = memberField.text().trim();
                            }

                            if (memberFieldName == "SubscriberNameFirst") {
                                SubscriberNameFirst = memberField.text().trim().replaceAll(',','');
								//println("SubscriberNameFirst"+SubscriberNameFirst);
                            }

                            if (memberFieldName == "SubscriberNameMiddle") {
                                SubscriberNameMiddle = memberField.text().trim().replaceAll(',','');
                            }
                            if (memberFieldName == "SubscriberNameLast") {
                                SubscriberNameLast = memberField.text().trim().replaceAll(',','');
                            }
                            if (memberFieldName == "SubscriberBirthDate") {
                                SubscriberBirthDate = memberField.text().trim();
                            }
							if (memberFieldName == "RecordIdentifier") {
                                RecordIdentifiergood = memberField.text().trim();
							  }
							if (memberFieldName == "MaintenanceType") {
                            typeOfTransaction = memberField.text().trim();
							
							if(typeOfTransaction == "021")
							{
								typeOfTransaction = 'A';
							}
							else if(typeOfTransaction == "024")
							{
								typeOfTransaction = 'T';
							}
							else if(typeOfTransaction == "001")
							{
								typeOfTransaction = 'C';
							}
							else
							{
								typeOfTransaction = 'O';
							}
								
							
                        }
						if (memberFieldName == 'RecordIdentifier') 
						{
                            RecordIdentifier = memberField.text().trim();
                        }
						

                        }

                        for (NodeChild error : MemberNode.Errors.Error) {
                            memberErrors = new StringBuilder();

                            def memberErrorBrief = error.Brief.text().toString().replaceAll(',', '');
                            def memberErrorMsg = error.Msg.text().toString().replaceAll(',', '');
                            def memberSnipCategory = error.@Category;
                            def memberErrorID = error.@ID;
                            //println("memberErrorID" + memberErrorID);

                            if (memberSnipCategory == 'Rejecting') {
                                def memberCoverageSnip = error.@SNIP.text().toString();
                                if (memberCoverageSnip != null && !snipListFile.contains(memberCoverageSnip)) {
                                    snipListFile.add(memberCoverageSnip);
                                }

                                memberErrorcount = memberErrorcount + 1;
								//println("memberErrorcount"+ memberErrorcount);
                                memberErrorcounter = Integer.toString(memberErrorcount);

                                if (!fileLevelErrors.isEmpty() && errorCount < 40) {
                                    String temp = "~" + "${memberErrorID}" + ":" + "MemberLevelError " + "${memberErrorcounter}" + " " + "${memberErrorBrief}" + "${memberErrorMsg}";
                                    fileLevelErrors.append(temp);
                                } else {
                                    String temp = "${memberErrorID}" + ":" + "MemberLevelError " + "${memberErrorcounter}" + " " + "${memberErrorBrief}" + "${memberErrorMsg}";
                                    fileLevelErrors.append(temp);
                                }

                                errorCount = countErrors(fileLevelErrors);
                                if (errorCount == 40)
                                    break;
                            }
                        }
					
                        MemberNode.GroupNode.each { HealthCoverageNode ->

                            Healthcoveragecounter++;
                            //def healthCoverageErrors;
                            

                            HealthCoverageNode.Fields.Field.each { healthCoverageField ->
                                def healthCoverageFieldName = healthCoverageField.@Name;

                                if (healthCoverageFieldName == "SubscriberID") {
                                    SubscriberID = healthCoverageField.text().trim();
                                }
                            }

                            for (NodeChild error : HealthCoverageNode.Errors.Error) {
                                healthCoverageErrors = new StringBuilder();

                                def healthCoverageErrorBrief = error.Brief.text().toString().replaceAll(',', '');
                                def healthCoverageErrorMsg = error.Msg.text().toString().replaceAll(',', '');
                                def healthCoverageSnipCategory = error.@Category;
                                def healthCoverageErrorID = error.@ID;
                                //println("healthCoverageErrorID" + healthCoverageErrorID);

                                if (healthCoverageSnipCategory == 'Rejecting') {
                                    def healthCoverageCoverageSnip = error.@SNIP.text().toString();
                                    if (healthCoverageCoverageSnip != null && !snipListFile.contains(healthCoverageCoverageSnip)) {
                                        snipListFile.add(healthCoverageCoverageSnip);
                                    }

                                    healthCoverageErrorCount = healthCoverageErrorCount + 1;
									//println("healthCoverageErrorCount"+ healthCoverageErrorCount);
                                     healthCoverageErrorcounter = Integer.toString(healthCoverageErrorCount);

                                    if (!fileLevelErrors.isEmpty() && errorCount < 40) {
                                        String temp = "~" + "${healthCoverageErrorID}" + ":" + "HealthCoverageError " + "${healthCoverageErrorcounter}" + " " + "${healthCoverageErrorBrief}" + "${healthCoverageErrorMsg}";
                                        fileLevelErrors.append(temp);
                                    } else {
                                        String temp = "${healthCoverageErrorID}" + ":" + "HealthCoverageError " + "${healthCoverageErrorcounter}" + " " + "${healthCoverageErrorBrief}" + "${healthCoverageErrorMsg}";
                                        fileLevelErrors.append(temp);
                                    }
                                    errorCount = countErrors(fileLevelErrors);
                                    if (errorCount == 40)
                                        break;
                                }
                            }
                        }//healthcoverage
					
					
					
					 errorBuilder.append("Edifecs");
					 errorBuilder.append("|");
					 errorBuilder.append(inputedifilename);
					 errorBuilder.append("|");
					 errorBuilder.append(AuditCheck);
					 errorBuilder.append("|");
					 errorBuilder.append(InterchangeSenderID);
					 errorBuilder.append("|");
					 errorBuilder.append(Edifileids);
					 errorBuilder.append("|");
					 errorBuilder.append(recordIdentifiers);
					 errorBuilder.append("|");
					 errorBuilder.append(SubscriberID);
					 errorBuilder.append("|");
					 errorBuilder.append(SubscriberNameFirst);
					 								//println("SubscriberNameFirst123"+SubscriberNameFirst);

					 errorBuilder.append("|");
					 errorBuilder.append(SubscriberNameMiddle);
					 errorBuilder.append("|");
					 errorBuilder.append(SubscriberNameLast);
					 errorBuilder.append("|");
					 if(SubscriberBirthDate != ''){
					 errorBuilder.append(SubscriberBirthDate.substring(0,4)+"-"+SubscriberBirthDate.substring(4,6)+"-"+SubscriberBirthDate.substring(6,8));
					 }
					 errorBuilder.append("|");
					 errorBuilder.append(SubscriberID);
					 errorBuilder.append("|");
					 errorBuilder.append(SubscriberNameFirst);
					 errorBuilder.append("|");
					 errorBuilder.append(SubscriberNameMiddle);
					 errorBuilder.append("|");
					 errorBuilder.append(SubscriberNameLast);
					 errorBuilder.append("|");
					 errorBuilder.append("Self");
					 errorBuilder.append("|").append("|").append("|");
					 errorBuilder.append(LineOfBusiness).append('|');
					 errorBuilder.append(typeOfTransaction).append('|');
					 if(StatusCode == 'R')
					 {
						 errorBuilder.append("R").append('|');
					 }
					 else
					 {
						 errorBuilder.append("A").append('|');
					 }
					 
					 errorBuilder.append('|'); 				
					 
					 // def errorLengthCheck(StringBuilder fileLevelErrors) 
					 // {
						// Convert the StringBuilder to a String
					String errorString = fileLevelErrors.toString()
		
					
					String[] errors = errorString.split("~")
    
						
					errors = errors.collect 
					{ error ->
					if (error.length() > 150)
					{
						
					errors= error.substring(0, 142) + "(...)";
					}
					else 
					{
						
					errors = error;
					}
					}
    
						
					 errorString = errors.join('~')
    				
					errorCount = countErrors(fileLevelErrors)
					if(errorCount < 40 && errorCount != 0) 
					{
						
						errorBuilder.append(errorString);
						
					}
					else if(errorCount == 40)
					{
						errorBuilder.append(errorString).append("(...)");
					}
					
					errorBuilder.append("|").append("|");
					
					
				    recordLevelErrorCountInteger=dataReportError+interchangeError+memberError;
										
					recordLevelErrorCountTotal = Integer.toString(recordLevelErrorCountInteger);
					
					errorCount = countErrors(fileLevelErrors)
					errorBuilder.append(errorCount).append('|');
					//EntireDocumentErrorTotal
				
					if(snipListFile.contains("1"))
					errorBuilder.append("N").append('|');
					
					else errorBuilder.append("Y").append('|');
					
					if(snipListFile.contains("2"))
					errorBuilder.append("N").append('|');
					else
					errorBuilder.append("Y").append('|');
					if(snipListFile.contains("3"))
						errorBuilder.append("N").append('|');
					else errorBuilder.append("Y").append('|');
					if(snipListFile.contains("4"))
						errorBuilder.append("N").append('|');
					else errorBuilder.append("Y").append('|');
					if(snipListFile.contains("5"))
						errorBuilder.append("N").append('|');
					else errorBuilder.append("Y").append('|');
					if(snipListFile.contains("6"))
						errorBuilder.append("N").append('|');
					else errorBuilder.append("Y").append('|');
					if(snipListFile.contains("7"))
						errorBuilder.append("N").append('|');
					else {
					errorBuilder.append("Y").append('|');}
					errorBuilder.append('|');
					errorBuilder.append('|');
					errorBuilder.append(rayIdentifier);
					errorBuilder.append('|');
					errorBuilder.append(recordIdentifiers);
					errorBuilder.append('|');
					if(BGNDate != ''&& BGNDate ==~ /\d{8}/){
					 errorBuilder.append(BGNDate.substring(0,4)+"-"+BGNDate.substring(4,6)+"-"+BGNDate.substring(6,8));
					 }
					errorBuilder.append('|');
					errorBuilder.append(FileReceiptDateTime);
					errorBuilder.append("\r\n"); 
					//fileLevelErrors.clear();
					fileLevelErrors.setLength(0)
					
					}
					}//member
			    }//transaction
	}
				
				
				
			
}		
					

             newMessageBody = errorBuilder.toString();
				
			ProxyMessage newMessage = context.createNewMessage(newMessageBody, message.getHeaders())
			context.createExchangeResponse(msgHeaders, newMessage);
			
			if((Interchangecounter>0 && Groupcounter ==0) ||(Interchangecounter>0 && Groupcounter>0 && Transactioncounter == 0))
			{
			   		 errorBuilder.append("Edifecs");
					 errorBuilder.append("|");
					 errorBuilder.append(inputedifilename);
					 errorBuilder.append("|");
					 errorBuilder.append(AuditCheck);
					 errorBuilder.append("|");
					 errorBuilder.append(InterchangeReceiverID);
					 errorBuilder.append("|");
					 errorBuilder.append(EdiFileId);
					 errorBuilder.append("|").append("|").append("|").append("|").append("|").append("|").append("|").append("|").append("|").append("|").append("|").append("|");
					 errorBuilder.append(LineOfBusiness);
					 errorBuilder.append("|").append("|").append("|");
					 errorBuilder.append("R").append("|");
					 String errorString = fileLevelErrors.toString()

					String[] errors = errorString.split("~")

					errors = errors.collect 
					{ error ->
					if (error.length() > 150)
					{
					errors= error.substring(0, 142) + "(...)";
					}
					else 
					{
					errors = error;
					}
					}

					 errorString = errors.join('~')
							
					if(errorCount <40 && errorCount!=0) 
					{
						
						errorBuilder.append(errorString);
						
					}
					else if(errorCount == 40)
					{
						errorBuilder.append(errorString).append("(...)");
					}
					errorBuilder.append('|'); 
					if(snipListFile.contains("1"))
											errorBuilder.append("N").append('|');
					else errorBuilder.append("Y").append('|');
					if(snipListFile.contains("2"))
					errorBuilder.append("N").append('|');
					else
					errorBuilder.append("Y").append('|');
					if(snipListFile.contains("3"))
						errorBuilder.append("N").append('|');
					else errorBuilder.append("Y").append('|');
					if(snipListFile.contains("4"))
						errorBuilder.append("N").append('|');
					else errorBuilder.append("Y").append('|');
					if(snipListFile.contains("5"))
						errorBuilder.append("N").append('|');
					else errorBuilder.append("Y").append('|');
					if(snipListFile.contains("6"))
						errorBuilder.append("N").append('|');
					else errorBuilder.append("Y").append('|');
					if(snipListFile.contains("7"))
						errorBuilder.append("N").append('|');
					else {
					errorBuilder.append("Y").append('|');}
					errorBuilder.append('|');
					errorBuilder.append('|');
					errorBuilder.append('|');
					
					errorBuilder.append('|');
					
					errorBuilder.append('|');
					errorBuilder.append(FileReceiptDateTime);
					errorBuilder.append("\r\n");  			
					newMessageBody = errorBuilder.toString();
 
				ProxyMessage newMessage1 = context.createNewMessage(newMessageBody, message.getHeaders())
				context.createExchangeResponse(msgHeaders, newMessage1);
		}	

