Establishes handles established connections Dronology multiple GCS br
Creates Read Dispatcher Write Dispatcher threads connection GCS established
Groundstation Connector Drone Command Handler Runnable
Logger LOGGER Logger Provider Logger Groundstation Connector
Executor Service EXECUTOR Executors Fixed Thread Pool
Named Thread Factory Groundstation Threads
socket communication python ground station
Socket socket
Map IUAV Property Update Notifier registered Listeners Concurrent Hash Map
Read Dispatcher read Dispatcher
Write Dispatcher write Dispatcher
groundstationid
Dispatch Queue Manager dispatch Queue Manager
connected
Incomming Groundstation Connection Server server
Groundstation Connector Incomming Groundstation Connection Server server Socket socket
connected
server server
socket socket
send Command Drone Command cmd Drone Exception
LOGGER trace groundstationid Sending Command UAV cmd
dispatch Queue Manager send cmd
Dronology Monitoring Manager Instance publish Message Marshaller create Message cmd
set Status Callback Notifier IUAV Property Update Notifier listener Drone Exception
registered Listeners Key
Drone Exception listener registered
registered Listeners put listener
dispatch Queue Manager create Dispatch Thread listener
tear
read Dispatcher tear
Exception
LOGGER error
write Dispatcher tear
Exception
LOGGER error
dispatch Queue Manager tear
Exception
LOGGER error
Mission Planning Service Instance cancel Mission
Dronology Service Exception
LOGGER error
Handler
groundstationid
register Safety Validator IUAV Safety Validator validator
dispatch Queue Manager register Safety Validator validator
run
LOGGER info Groundstation Connector started
Buffered Reader reader
reader Buffered Reader Input Stream Reader socket Input Stream
line reader read Line
UAV Message msg UAV Message Factory create line
msg Connection Request Message
LOGGER hw Fatal Invalid Connection Request groundstation line
connection Success
Drone Connector Service Instance register Connection Connection Request Message msg
groundstationid msg GCS
setup Connection
connection Success
Ground Station Exception
LOGGER hw Fatal Message
Buffered Writer writer Buffered Writer Output Stream Writer socket Output Stream
Connection Response Command ack Command Connection Response Command groundstationid connection Success
writer write ack Command Json
writer write System line Separator
writer flush
Exception
print Stack Trace
LOGGER hw Fatal Error establishing connection groundstation Message
setup Connection
dispatch Queue Manager Dispatch Queue Manager groundstationid
read Dispatcher Read Dispatcher socket dispatch Queue Manager
write Dispatcher Write Dispatcher socket dispatch Queue Manager Outgoing Command Queue
EXECUTOR submit read Dispatcher
EXECUTOR submit write Dispatcher
Runtime Drone Types Instance register Command Handler
connected
Throwable
LOGGER hw Fatal connect Python Groundstation Message
schedule Reconnect
TODO Auto generated method stub