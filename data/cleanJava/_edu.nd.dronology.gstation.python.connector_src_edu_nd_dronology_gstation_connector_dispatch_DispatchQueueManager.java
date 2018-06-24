Dispatch Queue Manager handles incoming outgoing queues br
Incoming queues UAV State received UAV dispatched Physical Drone br
outgoing queue Drone Command UAV
Dispatch Queue Manager
Logger LOGGER Logger Provider Logger Dispatch Queue Manager
NUM THREADS
Executor Service SERVICE EXECUTOR Executors Fixed Thread Pool NUM THREADS
Named Thread Factory Dispatch Threads
MONITORING
Map Blocking Queue UAV Message queue Map Concurrent Hash Map
List Future dispatch Threads Array List
Blocking Queue Drone Command outgoing Command Queue Linked Blocking Deque
Blocking Queue UAV Message monitoring Queue Linked Blocking Deque
groundstationid
Groundstationid
groundstationid
IUAV Safety Validator validator
Dispatch Queue Manager groundstationid
groundstationid groundstationid
MONITORING
create Monitoring Dispatch Thread monitoring Queue
post Drone Status Update UAV Message status
queue Map
success
queue Map Key
success queue Map offer status
LOGGER hw Info uav registered discarding message
success
LOGGER hw Fatal Buffer overflow
status UAV State Message
forward Validator UAV State Message status
Throwable
LOGGER error
forward Validator UAV State Message status
Dronology Constants MONITORING
success
success monitoring Queue offer status
success
LOGGER warn Monitoring Queue Full
Throwable
LOGGER error
register Drone uavid UAV Handshake Message message
LOGGER hw Info drone registered uavid message
Drone Initialization Info info Drone Initialization Info Pysical Drone Generator generate uavid groundstationid
Drone Mode MODE PHYSICAL uavid message Home
Drone Setup Service Instance initialize Drones info
Dronology Service Exception
LOGGER error
create Dispatch Thread IUAV Property Update Notifier listener
Blocking Queue UAV Message queue
queue Map
queue Map Key
queue queue Map
queue Linked Blocking Queue Dronology Constants NR MESSAGES QUEUE
queue Map put queue
Status Dispatch Thread thread Status Dispatch Thread queue listener
LOGGER hw Info Dispatch Thread UAV created
Future Object ftr SERVICE EXECUTOR submit thread
dispatch Threads add ftr
Throwable
LOGGER error
create Monitoring Dispatch Thread Blocking Queue UAV Message queue
Monitoring Dispatch Thread thread Monitoring Dispatch Thread queue
LOGGER hw Info Monitoring Dispatch Thread created
Future ftr SERVICE EXECUTOR submit thread
dispatch Threads add ftr
tear
LOGGER hw Info Ground Control Station groundstationid terminated
Drone Connector Service Instance unregister Connection groundstationid
Exception
LOGGER error groundstation connection groundstationid registered
Future ft dispatch Threads
ft cancel
SERVICE EXECUTOR shutdown
Blocking Queue Drone Command Outgoing Command Queue
outgoing Command Queue
send Drone Command cmd
outgoing Command Queue offer cmd
LOGGER trace Command added queue
LOGGER hw Fatal Outgoing Command queue limit reached command dropped
post Monitoring Message UAV Monitoring Message message
Dronology Constants MONITORING
uavid message Uavid
queue Map
queue Map Key uavid
LOGGER hw Info uav uavid registered discarding message
LOGGER info Message message Simple received groundstationid
success
success monitoring Queue offer message
success
LOGGER warn Monitoring Queue Full
post Handshake Message uavid UAV Handshake Message message
Dronology Constants SAFETY CHECKS
validator
message Safety
LOGGER error safety information provided
success validator validate uavid message Safety
success
register Drone uavid message
LOGGER error Safety checks failed uav uavid registered
LOGGER error validator provided
register Drone uavid message
register Safety Validator IUAV Safety Validator validator
validator validator