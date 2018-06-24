MAV UAV Connector Drone Command Handler
Logger LOGGER Logger Provider Logger MAV UAV Connector
Executor Service services Executor Executors Fixed Thread Pool
Named Thread Factory Groundstation Threads
socket communication python ground station
Socket python Socket
Map Concept IUAV Property Update Notifier registered Listeners Concurrent Hash Map
Read Dispatcher read Dispatcher
Write Dispatcher write Dispatcher
Concept groundstationid
Dispatch Queue Manager dispatch Queue Manager
Concept host
port
connected
MAV UAV Connector Concept groundstationid Concept host port
groundstationid groundstationid
dispatch Queue Manager Dispatch Queue Manager groundstationid
host host
port port
connected
connect
connect
Inet Address host Addr Inet Address host
Concept host Str host Addr
LOGGER info Connecting Python base host Str port
python Socket Socket
python Socket connect Inet Socket Address host Addr port
python Socket set Timeout
LOGGER hw Info Connected python Socket Inet Address python Socket Port
read Dispatcher Read Dispatcher python Socket dispatch Queue Manager
write Dispatcher Write Dispatcher python Socket dispatch Queue Manager Outgoing Command Queue
services Executor submit read Dispatcher
services Executor submit write Dispatcher
connected
Unknown Host Exception
LOGGER hw Fatal connect Python Groundstation
schedule Reconnect
Throwable
LOGGER hw Fatal connect Python Groundstation Message
schedule Reconnect
schedule Reconnect
TODO implement
send Command Drone Command cmd Drone Exception
LOGGER hw Info groundstationid Sending Command UAV cmd
dispatch Queue Manager send cmd
set Status Callback Notifier Concept IUAV Property Update Notifier listener Drone Exception
registered Listeners Key
Drone Exception listener registered
registered Listeners put listener
dispatch Queue Manager create Dispatch Thread listener
tear
python Socket close
read Dispatcher tear Donw
write Dispatcher tear
dispatch Queue Manager tear
IO Exception
LOGGER hw Fatal
Concept Handler
groundstationid
register Monitoring Message Handler Monitoring Message Handler monitoringhandler
dispatch Queue Manager register Monitoring Message Handler monitoringhandler
register Safety Validator IUAV Safety Validator validator
dispatch Queue Manager register Safety Validator validator