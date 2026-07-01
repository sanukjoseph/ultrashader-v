import com.edifecs.etools.xeserver.proxy.ProxyMessage;
import java.io.*;
 
 
exchange = context.exchange;
exchProperties = exchange.properties;
messages = exchange.messages;
message = messages[0];
msgHeaders = message.headers;
 
 
messageBodyInputStream = message.bodyAsSmartStream.inputStream;
InputStreamReader isr = new InputStreamReader(messageBodyInputStream);
BufferedReader br = new BufferedReader(isr);
exchProperties.each{ k, v -> msgHeaders.put(k, v) }
 
String line = "";
String[] splitRecords = null;
int countRecord = 0;
int countSubmitRecord = 0;

 
StringBuilder dataBuilder = new StringBuilder();
 
String RecordIdentifier = msgHeaders.get("RecordIdentifier");
String ediFileID = msgHeaders.get("ediFileID");
String EdiFileName = msgHeaders.get("EdiFileName");
String EdiFileType = msgHeaders.get("EdiFileType");
String correlationId = msgHeaders.get("correlationId");
String planCount = msgHeaders.get("planCount");
String XMLFileCreationDate = msgHeaders.get("XMLFileCreationDate");
String TotalEdiTransaction = msgHeaders.get("TotalEdiTransaction");
String TotalMemberCount = msgHeaders.get("TotalMemberCount");
String InterchangeSenderID = msgHeaders.get("InterchangeSenderID");
String InterchangeReceiverID = msgHeaders.get("InterchangeReceiverID");
String recordCount= msgHeaders.get("totalXMLTransactionCount");
String totalXMLTransactionCount = msgHeaders.get("totalXMLTransactionCount");
String inputArchiveFilename  = msgHeaders.get("inputArchiveFilename");
 
 
while((line=br.readLine())!=null) 
{
	// 1. Split By <enrollmentSparseSubmitRequestRecord>
	splitRecords = line.split("<enrollmentSparseSubmitRequestRecord>");	
 
	for (int i =1;i<splitRecords.length;i++)
	{
		if(i==1)
		{
			countSubmitRecord++;
			 splitRecords[i] = splitRecords[i].replace("<ediMemberRecordSequence>1</ediMemberRecordSequence>","<ediMemberRecordSequence>"+countSubmitRecord+"</ediMemberRecordSequence>");
			 dataBuilder.append("<enrollmentSparseSubmitRequestRecord>").append(splitRecords[i]);
		}
		else
		{
			countRecord++;
			countSubmitRecord++;
			splitRecords[i] = splitRecords[i].replace("<recordId>"+RecordIdentifier+"</recordId>","<recordId>"+RecordIdentifier+"</recordId>").replace("<ediMemberRecordSequence>1</ediMemberRecordSequence>","<ediMemberRecordSequence>"+countSubmitRecord+"</ediMemberRecordSequence>");
			//splitRecords[i] = splitRecords[i].replace("<ediMemberRecordSequence>1</ediMemberRecordSequence>","<ediMemberRecordSequence>"+countSubmitRecord+"</ediMemberRecordSequence>");
			dataBuilder.append("<enrollmentSparseSubmitRequestRecord>").append(splitRecords[i]);
		}
 
 
	}
 
   
 
}
 
 
def finalString = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
"<enrollmentSparseIBRequestRoot xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:enroll=\"http://www.ust-global.com/schema/enrollmentsparse\" xmlns:base=\"http://www.healthedge.com/connector/schema/basetypes\" xmlns:stl=\"http://www.codesynthesis.com/xmlns/xsstl\" xmlns:subscription=\"http://www.healthedge.com/connector/schema/subscriptionsparse\" xmlns:subsidy=\"http://www.healthedge.com/connector/schema/subsidy\" xmlns:enrollmenttypes=\"http://www.healthedge.com/connector/schema/enrollmenttypes\" xmlns:payeeBankAccount=\"http://www.healthedge.com/connector/schema/payeebankaccounts\" xmlns:minput=\"http://www.healthedge.com/connector/schema/matchinput\" xmlns:membership=\"http://www.ust-global.com/schema/membershipsparse\" xmlns:membershipsparse=\"http://www.healthedge.com/connector/schema/membershipsparse\" xmlns:hicn=\"http://www.healthedge.com/connector/schema/medicarehicn\" xmlns:cobpolicy=\"http://www.healthedge.com/connector/schema/cobpolicy\" xmlns:membercomplianceprogram=\"http://www.healthedge.com/connector/schema/membercomplianceprogram\" xmlns:memberfactors=\"http://www.healthedge.com/connector/schema/memberfactors\" xmlns:sparseResp=\"http://www.healthedge.com/connector/schema/enrollmentsparseresponse\" xmlns:membercare=\"http://www.healthedge.com/connector/schema/membercarereserve\" xmlns:enrollment=\"http://www.healthedge.com/connector/schema/enrollmentsparse\">" +
"<header>" +
"<ediFilename>"+EdiFileName+"</ediFilename>"+
"<ediFileId>"+ediFileID+"</ediFileId>"+
"<ediFileType>"+EdiFileType+"</ediFileType>"+
"<ediArchiveFileName>"+inputArchiveFilename+"</ediArchiveFileName>"+
"<totalEdiTransaction>"+TotalEdiTransaction+"</totalEdiTransaction>"+
"<totalMemberCount>"+TotalEdiTransaction+"</totalMemberCount>"+
"<totalXMLTransactionCount>"+TotalEdiTransaction+"</totalXMLTransactionCount>"+
"<XMLfileCreationDate>"+XMLFileCreationDate+"</XMLfileCreationDate>"+
"<correlationId>"+correlationId+"</correlationId>"+
"<senderId>"+InterchangeSenderID+"</senderId>"+
"<receiverId>"+InterchangeReceiverID+"</receiverId>"+
"</header>" +
"<enrollmentSparseIBRequest>" +
"<enrollmentSparseSubmitRequestRecordList>" +
"<recordCount>"+countSubmitRecord+"</recordCount>"+
dataBuilder.toString() +
"</enrollmentSparseSubmitRequestRecordList>" +
"</enrollmentSparseIBRequest>" +
"</enrollmentSparseIBRequestRoot>";

 
newMessageBody = finalString.toString();
 
ProxyMessage newMessage = context.createNewMessage(newMessageBody, message.getHeaders())
context.createExchangeResponse(msgHeaders, newMessage);