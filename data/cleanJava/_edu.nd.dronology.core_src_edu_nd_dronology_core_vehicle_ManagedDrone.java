Handler
Virtual Drone
Physical Drone
Handles basic functionality
independent
virtual
physical endpoint
information
coordinates state
flight instructions
Managed Drone
Runnable
Provider Managed Drone
Atomic cont
Atomic
Rate Limiter LIMITER Rate Limiter create
Executor Service EXECUTOR SERVICE Executors
Fixed Thread Pool Dronology Constants MAX DRONE THREADS
Named Thread Factory Managed Drone
Drone drone Controls primitive flight commands
drone
Drone Flight State Manager drone State
Drone Safety State Manager drone Safety State
flight director
flight
Flight Director flight Director
drone
assigned
single flight plan
target Altitude
Timer halt Timer
Timer
Halt Timer Task current Halt Timer
Constructs drone
drone
drn
Managed Drone Drone drone
Util check drone
drone drone
drone State
Drone Flight State Manager
drone Safety State
Drone Safety State Manager
drone Drone Status Status drone State Status
flight Director Flight Director Factory Flight Director
Don
drone State add State Change Listener notify State Change
notify State Change
drone Drone Status Status drone State Status
Assigns
flight directive
managed drone
flight Directive
assign Flight Flight Director flight Directive
flight Director flight Directive
Removes
assigned flight
unassign Flight
flight Director
DANGER
FIXING
UNASSIGN FLIGHT
RETURNING
BASE
warn Unassigned DRONE Drone
Home
drone Safety State
Flight Safety Mode State Safety Mode Normal
current Halt Timer
current Halt Timer cancel
current Halt Timer
target Altitude
Sets target altitude
takeoff
Target Altitude
target Altitude
target Altitude target Altitude
Controls takeoff
drone
Flight Zone Exception
Flight Zone Exception
target Altitude
Flight Zone Exception Target Altitude
drone State Mode Taking
drone target Altitude
Delegates flyto behavior
virtual
physical drone
target Coordinates
speed
fly Lla Coordinate target Coordinates
speed
drone fly target Coordinates speed
current coordinates
virtual
physical drone
current coordinates
Lla Coordinate Coordinates
drone Coordinates
start
thread start
info Starting Drone drone Drone
EXECUTOR SERVICE submit
run
cont
Thread current Thread Interrupted
LIMITER acquire
anymore TODO fix
assign point
iteration
loop
flight Director
drone State Flying
Lla Coordinate target Coordinates flight Director fly Point
drone move
mission Info drone Drone Waypoint reached target Coordinates
Dronology Monitoring Manager Instance publish
Message Marshaller create Message Message Type WAYPOINT REACHED drone Drone target Coordinates
flight Director clear Current Point
check End Flight
drone State Taking
Math abs drone Altitude target Altitude flying Drones Drone Fleet Manager Instance Registered Drones
Managed Drone drone flying Drones
equals flying Drones
drone Flight Mode State Flying drone Flight Mode State Air
dron Distance
Coordinates distance drone Coordinates
dron Distance dron Distance
unique drone
Drone
drone Drone
Land
drone Delegate land functions
virtual
physical drone
Flight Zone Exception
land
Flight Zone Exception
drone State Landing drone State Ground
drone State Mode Landing
drone land
drone State Mode Ground
unassign Flight
Temporarily Halt
haltinms
halt Place
haltinms
drone Safety State
current Halt Timer
current Halt Timer cancel
drone Safety State Safety Mode Normal
drone State Mode Flying
current Halt Timer
drone Safety State Safety Mode Halted
drone State Mode Air
current Halt Timer
Halt Timer Task
halt Timer schedule current Halt Timer haltinms
Flight Zone Exception
error
Temporarily Halt
haltinms
Flight Zone Exception
resume Flight
Flight Zone Exception
drone Safety State
current Halt Timer
Flight Zone Exception UAV
halted
current Halt Timer cancel
drone Safety State Safety Mode Normal
drone State Mode Flying
current Halt Timer
current flight mode state
drone State
Drone Flight State Manager Flight Mode State
drone State
current safety mode state
Drone Safety State Manager Flight Safety Mode State
drone Safety State
Lla Coordinate Base Coordinates
drone Base Coordinates
Halt Timer Task
Timer Task
run
drone Safety State
drone Safety State Safety Mode Halted
current Halt Timer
drone Safety State Safety Mode Normal
drone State Mode Flying
current Halt Timer
Flight Zone Exception
error
send Command Drone Command command
Drone Exception
drone send Command command
stop
drone State Ground
warn Removing UAV drone Drone
state drone State Status
info Removing UAV drone Drone
cont
halt Timer cancel
emergency Stop
Drone Exception
warn Emergency stop
UAV drone Drone requested
send Command
Emergency Stop Command drone Drone
resend Command
Drone Exception
drone resend Command