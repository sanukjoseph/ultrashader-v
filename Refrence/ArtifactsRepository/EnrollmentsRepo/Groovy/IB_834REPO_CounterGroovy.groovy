import com.edifecs.etools.xeserver.proxy.ProxyMessage;
import com.edifecs.etools.commons.io.SmartStream;
import groovy.util.slurpersupport.NodeChild;
import java.io.*;
import groovy.util.XmlSlurper
import org.apache.commons.lang.StringUtils



exchange = context.exchange;
exchProperties = exchange.properties;
messages = exchange.messages;
message = messages[0];
msgHeaders = message.headers;
messageBodyInputStream = message.getBodyAsSmartStream().getInputStream()

//fetch counter property
def counterValue = exchange.properties.get("counter")
// Convert to int
int counter = counterValue ? counterValue.toString().toInteger() : 0

/*if(counter == 0) // this code should only execute once to calculate actual splitGoodCount
{

// Fetch the GoodCount property 
def splitgoodValue = exchange.properties.get('GoodCount')
//println ("GoodCount=" + splitgoodValue)
 
// Make sure it exists and is numeric
if (splitgoodValue != null) {
    def numericValue = splitgoodValue as BigDecimal // convert to BigDecimal
    def result = numericValue/ 3  // divide by 3 to get actual splitGoodCount
 
    // Store result in a new property
     exchange.properties.put("SplitGoodCount", result)
 
}
}*/
// to increment counter
counter++
// Store result in a new property
exchange.properties.put("counter", counter)

context.createExchangeResponse(exchProperties, messageBodyInputStream)

