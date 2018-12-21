Dispatch Queue Manager handles
incoming
outgoing queues
Incoming queues
UAV State received
UAV
dispatched
Physical Drone
outgoing queue
Drone Command
UAV
Dispatch Queue Manager
Provider Dispatch Queue Manager
NUM THREADS
Executor Service SERVICE EXECUTOR Executors Fixed Thread Pool NUM THREADS
Named Thread Factory Dispatch Threads
MONITORING
queue
Concurrent Hash
dispatch Threads
Blocking Queue outgoing Command Queue
Linked Blocking Deque
Blocking Queue monitoring Queue
Linked Blocking Deque
groundstationid
Groundstationid
groundstationid
IUAV Safety Validator validator
Dispatch Queue Manager
groundstationid
groundstationid groundstationid
MONITORING
create Monitoring Dispatch Thread monitoring Queue
post Drone Status Update
UAV Message status
queue
success
queue Key
success queue
offer status
hw Info
uav
registered discarding message
success
hw Fatal Buffer overflow
status
UAV State Message
forward Validator UAV State Message status
Throwable
error
forward Validator UAV State Message status
Dronology Constants
MONITORING
success
success monitoring Queue offer status
success
warn Monitoring Queue
Full
Throwable
error
register Drone
uavid UAV Handshake Message message
hw Info
drone registered
uavid message
Drone Initialization Info info
Drone Initialization Info Pysical Drone Generator generate uavid groundstationid
Drone Mode MODE PHYSICAL uavid message Home
Drone Setup Service Instance initialize Drones info
Dronology Service Exception
error
create Dispatch Thread
IUAV Property Update Notifier listener
Blocking Queue queue
queue
queue Key
queue queue
queue
Linked Blocking Queue Dronology Constants NR MESSAGES
QUEUE
queue put
queue
Status Dispatch Thread thread
Status Dispatch Thread queue listener
hw Info
Dispatch Thread
UAV
created
Future ftr SERVICE EXECUTOR submit thread
dispatch Threads add ftr
Throwable
error
create Monitoring Dispatch Thread Blocking Queue queue
Monitoring Dispatch Thread thread
Monitoring Dispatch Thread queue
hw Info
Monitoring Dispatch Thread created
Future ftr SERVICE EXECUTOR submit thread
dispatch Threads add ftr
tear
hw Info Ground Control Station groundstationid terminated
Drone Connector Service Instance unregister Connection groundstationid
Exception
error
groundstation connection
groundstationid registered
Future ft dispatch Threads
ft cancel
SERVICE EXECUTOR shutdown
Blocking Queue Outgoing Command Queue
outgoing Command Queue
send Drone Command cmd
outgoing Command Queue offer cmd
trace Command added
queue
hw Fatal Outgoing Command queue limit reached command dropped
post Monitoring Message UAV Monitoring Message message
Dronology Constants
MONITORING
uavid message Uavid
queue
queue Key uavid
hw Info
uav
uavid registered discarding message
info Message message Simple received groundstationid
success
success monitoring Queue offer message
success
warn Monitoring Queue
Full
post Handshake Message
uavid UAV Handshake Message message
Dronology Constants
SAFETY CHECKS
validator
message Safety
error
safety information provided
success validator validate uavid message Safety
success
register Drone uavid message
error Safety checks failed uav uavid
registered
error
validator provided
register Drone uavid message
register Safety Validator IUAV Safety Validator validator
validator validator