// Importing the ProxyMessage class from the com.edifecs.etools.xeserver.proxy package
import com.edifecs.etools.xeserver.proxy.ProxyMessage
// Importing the SmartStream class from the com.edifecs.etools.commons.io package
import com.edifecs.etools.commons.io.SmartStream
// Importing all classes from the java.io package
import java.io.*
import java.math.BigDecimal


exchange = context.exchange
exchProperties = exchange.properties
fileNameProperty = exchange.properties	
messages = exchange.messages
message = messages[0]
msgHeaders = message.headers

String OFN = fileNameProperty.get("835_X12FileName")
String Filename;
print OFN
if(OFN.contains('F11'))
{
	Filename = OFN.replace('_F11_','_');
}

fileNameProperty.put("Filename",Filename)
exchProperties.each { k, v -> msgHeaders.put(k, v) }
messageBodyInputStream = message.getBodyAsSmartStream().getInputStream()
def root = new XmlSlurper().parse(messageBodyInputStream) // Reads the message body as an XML stream and parses it using XmlSlurper.

def groupDetailsMap = [:] // Declare a map to store unique groupID, its counter, groupName, and sum of ClaimPaymentAmount
def uniqueGroupIDs = new HashSet<String>() // Store unique group IDs
def uniqueTransactionGroupIDs = new HashSet<String>()
def ListOfGroupIds = [:] // Map to set key as group ID and set BPR checks as value
def UniqueClaimIDmap = [:]
def Total = 0 // Store sum of clp04 amount
def uniquecounter = 0
def uniquedifftransac = 0
def totalPayment
def ProviderAdjustmentL6 = 0 // Store Sum of PLB04 amounts for multiple checks in the payment run
def ProviderAdjustmentWO = 0
def ProviderAdjustmentOB = 0
def ProviderAdjustmente3 = 0
def ProviderAdjustmentFB = 0
def claimID;
def size;
def totalclaimcount=0;
def counter = 0 // Unique id for each entry in map

def formatCurrency(def value) 
{
    if (value <= 0) 
	{
        return String.format('%.2f', value.abs()) 
    } 
	else 
	{
        return "-\$" + String.format('%.2f', value)
    }
}


root.each { DataReportNode ->
    ProviderAdjustmentL6 = DataReportNode.Fields.Field.find { it.@Name.text() == 'ProviderAdjustmentL6' }?.text()?.trim()
    ProviderAdjustmentWO = DataReportNode.Fields.Field.find { it.@Name.text() == 'ProviderAdjustmentWO' }?.text()?.trim()
	ProviderAdjustmentOB = DataReportNode.Fields.Field.find { it.@Name.text() == 'ProviderAdjustmentOB' }?.text()?.trim()
	ProviderAdjustmentE3 = DataReportNode.Fields.Field.find { it.@Name.text() == 'ProviderAdjustmentE3' }?.text()?.trim()
	ProviderAdjustmentFB = DataReportNode.Fields.Field.find { it.@Name.text() == 'ProviderAdjustmentFB' }?.text()?.trim()
	
    root.GroupNode.each { interchangeNode ->
	def transactionIdMain = 0;
     def transactionId = 0;
        interchangeNode.GroupNode.each { groupNode ->
            groupNode.GroupNode.each { transactionNode ->
                transactionId++;
				 uniqueTransactionGroupIDs.clear() // reset the set for each transaction
                transactionNode.GroupNode.each { providerNode ->
                    providerNode.GroupNode.each { claimNode ->
                        if (claimNode.@Name == 'Claim') {
                            def groupID = claimNode.Fields.Field.find { it.@Name.text() == 'groupID' }?.text()?.trim()
                            def groupName = claimNode.Fields.Field.find { it.@Name.text() == 'GroupName' }?.text()?.trim()
                             claimID = claimNode.Fields.Field.find { it.@Name.text() == 'claimID' }?.text()?.trim()
                            def claimPaymentAmount = claimNode.Fields.Field.find { it.@Name.text() == 'ClaimPaymentAmount' }?.text()?.toDouble() ?: 0.0
                            if (groupID == "") 
							{
                                groupID = "GroupID Not Available"
                                groupName = "Legal Entity Not Available"
								// groupIDforcount = "GroupID Not Available"
                            }
							if(!UniqueClaimIDmap.containsKey(groupID)){
                                UniqueClaimIDmap.put(groupID, [])
                            }
                            UniqueClaimIDmap[groupID] << claimID

                            if (groupID && !uniqueGroupIDs.contains(groupID) && !uniqueTransactionGroupIDs.contains(groupID)) 
							{
                                uniqueGroupIDs.add(groupID)
                                counter++
                                ListOfGroupIds[groupID] = 1
                                uniqueTransactionGroupIDs.add(groupID) // Mark the groupID as encountered in this transaction
                                uniquecounter++
                            } else 
							{
                                if (transactionId != transactionIdMain) 
								{
                                    // Increment ListOfGroupIds[groupID] only if it is not incremented in this transaction
                                    if (!uniqueTransactionGroupIDs.contains(groupID)) 
									{
                                        ListOfGroupIds[groupID] += 1
                                        uniqueTransactionGroupIDs.add(groupID) // Mark the groupID as incremented in this transaction
                                        uniquedifftransac++
                                    }
                                }
                            }
							//println("inside"+ListOfGroupIds[groupID])
                            totalPayment = uniquecounter + uniquedifftransac
                            details = groupDetailsMap.get(groupID) ?: [counter: counter, groupName: groupName, sumAmount: 0.0, totalClaims: 0, claimID: claimID ]
                            details.sumAmount += new BigDecimal(claimPaymentAmount.toString()).setScale(2, BigDecimal.ROUND_HALF_UP)

                            groupDetailsMap.put(groupID, details)
                            Total += claimPaymentAmount // Total paid of all entities
                        }
                    }
                }
            }
			transactionIdMain++;
        }
		
    }
}
// println("Outside"+ListOfGroupIds[groupID])
// groupDetailsMap with the size of unique claim IDs for each group ID
UniqueClaimIDmap.each { groupID, claimIDs ->

    def details = groupDetailsMap.get(groupID)
    if (details) {
        details.claimID = claimIDs.unique().size() // Update claimID with the size of unique claim IDs
		 totalclaimcount += details.claimID
		
        groupDetailsMap.put(groupID, details)
    }
}


def ControlReportBuilder = new StringBuilder() // StringBuilder to store each record value
ControlReportBuilder.append("S/No")
ControlReportBuilder.append(",")
ControlReportBuilder.append("ECHO Group ID")
ControlReportBuilder.append(",")
ControlReportBuilder.append("Legal Entity")
ControlReportBuilder.append(",")
ControlReportBuilder.append("Total Payments")
ControlReportBuilder.append(",")
ControlReportBuilder.append("Total Claims")
ControlReportBuilder.append(",")
ControlReportBuilder.append("Total Amount")
ControlReportBuilder.append("\r\n")
groupDetailsMap.each { groupID, details ->
    ControlReportBuilder.append("${details.counter},${groupID},${details.groupName},${ListOfGroupIds[groupID]},${details.claimID},\$${details.sumAmount}\n")
}

def totalPaid = ("${Total}")
def totalPaidmod = totalPaid.toDouble()
def Totalclaimcount = ("${totalclaimcount}")
def TotalPayable = new BigDecimal(totalPaidmod.toString()).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue() // Round the total value
def formattedTotalPayable = String.format("%.2f", TotalPayable)
ControlReportBuilder.append(",").append(",").append("Total Payable").append("\t").append(",").append(",").append(",").append("\$${formattedTotalPayable}\n")

// Interest Amount
if (ProviderAdjustmentL6 == "") 
{
    ProviderAdjustmentL6 = 0
}
 unsignedProviderAdjustmentL6 = new BigDecimal(ProviderAdjustmentL6.toString()).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue()
ControlReportBuilder.append(",").append(",").append("Interest Amount").append(",").append(",").append(",").append(formatCurrency(unsignedProviderAdjustmentL6)).append("\n")

def providerAdjusL6 = ("${ProviderAdjustmentL6}")
def providerAdjustmentL6mod = 0
if (providerAdjusL6 != "") 
{
    providerAdjustmentL6mod = providerAdjusL6.toDouble() // Covert to number
}

// ManualPayable
if (ProviderAdjustmentOB == "") 
{
    ProviderAdjustmentOB = 0
}
def unsignedProviderAdjustmentOB = new BigDecimal(ProviderAdjustmentOB.toString()).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue()
ControlReportBuilder.append(",").append(",").append("Manual Payable").append("\t").append(",").append(",").append(",").append(formatCurrency(unsignedProviderAdjustmentOB)).append("\n")
def providerAdjusOB = ("${ProviderAdjustmentOB}")

def providerAdjustmentOBmod = 0
if (providerAdjusOB != "") 
{
    providerAdjustmentOBmod = providerAdjusOB.toDouble() // Covert to number
}

// WithholdAmount
if (ProviderAdjustmentE3 == "") 
{
    ProviderAdjustmentE3 = 0
}
def unsignedProviderAdjustmentE3 = new BigDecimal(ProviderAdjustmentE3.toString()).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue()
ControlReportBuilder.append(",").append(",").append("Withhold Amount").append("\t").append(",").append(",").append(",").append(formatCurrency(unsignedProviderAdjustmentE3)).append("\n")
def providerAdjusE3 = ("${ProviderAdjustmentE3}")

def providerAdjustmentE3mod = 0
if (providerAdjusE3 != "") 
{
    providerAdjustmentE3mod = providerAdjusE3.toDouble() // Covert to number
}

// ProviderRecoupments
if (ProviderAdjustmentWO == "") 
{
    ProviderAdjustmentWO = 0
}
def unsignedProviderAdjustmentWO = new BigDecimal(ProviderAdjustmentWO.toString()).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue()
ControlReportBuilder.append(",").append(",").append("Provider Recoupments").append(",").append(",").append(",").append(formatCurrency(unsignedProviderAdjustmentWO)).append("\n")
def providerAdjusWO = ("${ProviderAdjustmentWO}")
def providerAdjustmentWOmod = 0
if (providerAdjusWO != "") {
    providerAdjustmentWOmod = providerAdjusWO.toDouble() // Covert to number
}

// forwardBalance
if (ProviderAdjustmentFB == "") 
{
    ProviderAdjustmentFB = 0
}
def unsignedProviderAdjustmentFB = new BigDecimal(ProviderAdjustmentFB.toString()).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue()
ControlReportBuilder.append(",").append(",").append("Forward Balance").append(",").append(",").append(",").append(formatCurrency(unsignedProviderAdjustmentFB)).append("\n")
def providerAdjusFB = ("${ProviderAdjustmentFB}")
def providerAdjustmentFBmod = 0
if (providerAdjusFB != "")
{
    providerAdjustmentFBmod = providerAdjusFB.toDouble() // Covert to number
}

// Total Amount
def Totals = 0
Totals = ((totalPaidmod) +(-1*((unsignedProviderAdjustmentL6) + (unsignedProviderAdjustmentOB)  + (unsignedProviderAdjustmentFB) + (unsignedProviderAdjustmentWO)+(unsignedProviderAdjustmentE3)))) // Report total
def Totalsnew = new BigDecimal(Totals.toString()).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue() // Round the total value 
//Totalsnew = Double.parseFloat(Totalsnew);
def formattedTotalsnew = String.format("%.2f", Totalsnew)
ControlReportBuilder.append(",").append(",").append("Total Amount").append(",").append("${totalPayment}").append(",").append("${Totalclaimcount}").append(",").append("\$${formattedTotalsnew}\n")
// Convert the contents of ControlReportBuilder to a string
def newMessageBody = ControlReportBuilder.toString();

ProxyMessage newMessage = context.createNewMessage(newMessageBody, message.getHeaders());

context.createExchangeResponse(msgHeaders, newMessage);
