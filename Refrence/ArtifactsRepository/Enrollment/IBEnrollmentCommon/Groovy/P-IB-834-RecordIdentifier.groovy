import org.apache.commons.lang.StringUtils
exchange = context.exchange
properties = exchange.properties
messages = exchange.messages
message = messages.first()
messageBodyAsString = message.bodyAsString
def RecordIdentifier = properties.get('RecordIdentifier')
def RecordIdentifierAudit = properties.get('RecordIdentifier')
def auditEventNumber = properties.get('auditEventNumber')
def recordIdentifiers = [] 
def recordIdentifierAudit = [] // List to store RecordIdentifiers
def stValues = []
String line = ""
def stValue = ""
int INSCount = 0

// Process based on auditEventNumber
if (auditEventNumber == "1") {
    def reader = new BufferedReader(new StringReader(messageBodyAsString))
    while ((line = reader.readLine()) != null) {
        if (line.startsWith("ST*834*")) {
            // Move the initialization here to avoid resetting stValues
            stValues = line.split("\\*", -1)
            INSCount = 0
        }
        if (line.startsWith("INS*Y*") || line.startsWith("INS*N*")) {
            INSCount++
            if (INSCount == 1) {
                recordIdentifiers << RecordIdentifier + (stValues[2] != null ? stValues[2] : "")
            } else {
                recordIdentifiers << RecordIdentifier + (stValues[2] != null ? stValues[2] + (INSCount - 1) + "-" : "")
            }
        }
    }
} else if (auditEventNumber == "2") {
    String inputMessage = messageBodyAsString
    String findStr = "INS*"
    int memberCount = StringUtils.countMatches(inputMessage, findStr)
    for (int i = 0; i < memberCount; i++) {
        INSCount++
        if (INSCount == 1) {
            recordIdentifierAudit << RecordIdentifierAudit
        } else {
            recordIdentifierAudit << RecordIdentifierAudit + (INSCount - 1) + "-"
        }
    }
} else if (auditEventNumber == "3") {
    def recordIdentifierXmlSplit = RecordIdentifier != null ? RecordIdentifier.split(",") : []
    int recordIdentifierXmlSplitlen = recordIdentifierXmlSplit.length
    for (int i = 0; i < recordIdentifierXmlSplitlen; i++) {
        if (recordIdentifierXmlSplit[i] != null) {
            recordIdentifiers << recordIdentifierXmlSplit[i]
        }
    }
}

// Create a single exchange response outside the loops
properties.put("RecordIdentifiers", recordIdentifiers.join(',')) 
properties.put("RecordIdentifierAudits", recordIdentifierAudit.join(',')) // Join the list into a comma-separated string
context.createExchangeResponse(properties, new ByteArrayInputStream(messageBodyAsString.bytes))
