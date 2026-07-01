import com.edifecs.etools.xeserver.proxy.ProxyMessage
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
 
// Assuming exchange, context, and message headers are already initialized
exchange = context.exchange
messages = exchange.messages
message = messages[0]
msgHeaders = message.headers
 
// Get the current date and time in the desired format yyyyMMddHHmm
def dateFormat = new SimpleDateFormat("yyyyMMddHHmm")
def currentDate = new Date()
def formattedCurrentDate = dateFormat.format(currentDate)
 
// Get the current time as a Calendar instance
def calendar = Calendar.getInstance()
calendar.setTime(currentDate)
 
// Subtract 1, 2, and 3 minutes
calendar.add(Calendar.MINUTE, -1)
def oneMinuteBefore = dateFormat.format(calendar.time)
 
calendar.add(Calendar.MINUTE, -1)  // Subtract another minute
def twoMinutesBefore = dateFormat.format(calendar.time)
 
calendar.add(Calendar.MINUTE, -1)  // Subtract another minute
def threeMinutesBefore = dateFormat.format(calendar.time)
 
// Create the msgHeaders with the calculated properties
def msgHeaders = [:]
msgHeaders['currentDateTime'] = formattedCurrentDate
msgHeaders['oneMinuteBefore'] = oneMinuteBefore
msgHeaders['twoMinutesBefore'] = twoMinutesBefore
msgHeaders['threeMinutesBefore'] = threeMinutesBefore
 
// If you don't have an actual message body, you can still send an empty message
def newMessageBody = ""  // No message body content in this case
 
// Create a new message (you can create an empty message if needed)
ProxyMessage newMessage = context.createNewMessage(newMessageBody, msgHeaders)
 
// Send the response with the new message and headers
context.createExchangeResponse(msgHeaders, newMessage)