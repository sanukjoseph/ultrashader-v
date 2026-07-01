import com.edifecs.etools.xeserver.proxy.ProxyMessage;
import com.edifecs.etools.commons.io.SmartStream;
import java.io.*;
import org.apache.commons.lang.StringUtils



exchange = context.exchange;
exchProperties = exchange.properties;
messages = exchange.messages;
message = messages[0];
msgHeaders = message.headers;
messageBodyInputStream = message.getBodyAsSmartStream().getInputStream()

// fetch counter safely
def counterValue = exchange.properties.get("counter")
int counter = (counterValue != null) ? counterValue.toString().toInteger() : 0

// increment
counter++

// store back
exchange.properties.put("counter", counter)

context.createExchangeResponse(exchange.properties, messageBodyInputStream)