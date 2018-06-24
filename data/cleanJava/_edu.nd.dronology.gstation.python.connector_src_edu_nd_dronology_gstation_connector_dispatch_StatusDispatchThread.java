Status Dispatch Thread Status Dispatch Thread UAV Message Callable
Logger LOGGER Logger Provider Logger Status Dispatch Thread
IUAV Property Update Notifier listener
Status Dispatch Thread Blocking Queue UAV Message queue IUAV Property Update Notifier listener
queue
listener listener
notify Listener Exception
Object call
cont
UAV Message state queue
state UAV State Message
UAV State Message sm UAV State Message state
listener update Coordinates sm Location
listener update Velocity sm Groundspeed
listener update Battery Level sm Batterystatus Battery Level
state UAV Mode Change Message
UAV Mode Change Message mcm UAV Mode Change Message state
listener update Mode mcm Mode
mode LOITER remove drone mission plan
TODO determine place
TODO potentially create mode names
mcm Mode equals Flight Mode USER CONTROLLED
Mission Planning Service Instance remove UAV mcm Uavid
notify flight plan pool remove active plans
LOGGER error Unhandled message type detected state
Interrupted Exception
LOGGER warn Status Dispatch Thread terminated
Exception
LOGGER error
LOGGER info Dispatcher shutdown