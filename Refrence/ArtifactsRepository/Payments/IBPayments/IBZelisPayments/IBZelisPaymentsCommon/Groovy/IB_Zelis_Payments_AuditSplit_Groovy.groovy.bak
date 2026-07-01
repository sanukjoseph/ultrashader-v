import com.edifecs.etools.xeserver.proxy.ProxyMessage
import groovy.json.JsonSlurper
import groovy.json.JsonOutput
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID

void execute() {

    def exchange = context.exchange
    def message = exchange.messages[0]

    // -------------------------
    // Read SmartStream input
    // -------------------------
    def inputJsonStr = new String(
            message.getBodyAsSmartStream().getInputStream().readAllBytes(),
            "UTF-8"
    ).trim()

    def jsonSlurper = new JsonSlurper()
    Map parsedJson = jsonSlurper.parseText(inputJsonStr)

    def inputDetails = parsedJson.inputDetails ?: [:]
    List transactions = parsedJson.transaction ?: []

    // -------------------------
    // OUTPUT EACH RECORD SEPARATELY
    // -------------------------
    transactions.each { record ->

        Map dataBlock = record.data
        Map idBlock = record.identifiers

        // -------------------------
        // SET EXCHANGE PROPERTIES
        // -------------------------
        exchange.properties.put("IB_Payments_Ray_Identifier", idBlock.rayIdentifier ?: "")
        exchange.properties.put("IB_Payments_Record_Identifier", idBlock.recordIdentifier ?: "")

        // -------------------------
        // Prepare single-record output JSON
        // -------------------------
        Map outputJson = [
                "inputDetails": inputDetails,
                "transaction" : [
                        [
                                "data"       : dataBlock,
                                "identifiers": idBlock
                        ]
                ]
        ]

        String finalJson = JsonOutput.prettyPrint(JsonOutput.toJson(outputJson))
        def headers = ["Content-Type": "application/json"]

        ProxyMessage outMsg = context.createNewMessage(finalJson, headers)
        context.createExchangeResponse(headers, outMsg)
    }
}

execute()
