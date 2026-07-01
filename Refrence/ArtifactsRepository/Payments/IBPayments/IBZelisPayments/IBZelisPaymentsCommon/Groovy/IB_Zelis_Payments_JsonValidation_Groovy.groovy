import groovy.json.JsonSlurper
import com.edifecs.etools.xeserver.proxy.ProxyMessage

void execute() {

    def exchange = context.exchange
    def message = exchange.messages[0]

    String input = message.getBodyAsString()

    boolean isValidJson = true

    try {
        new JsonSlurper().parseText(input)
    } catch (Exception e) {
        // Invalid JSON
        isValidJson = false
        exchange.properties.put("FileSize", 0)
    }

    // Always pass message as-is
    def headers = ["Content-Type": "application/json"]
    ProxyMessage outMsg = context.createNewMessage(input, headers)
    context.createExchangeResponse(headers, outMsg)
}

execute()
