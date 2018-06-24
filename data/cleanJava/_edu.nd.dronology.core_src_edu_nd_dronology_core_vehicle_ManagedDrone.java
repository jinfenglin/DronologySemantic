Handler Virtual Drone Physical Drone br
Handles basic functionality independent virtual physical endpoint br
information coordinates state flight instructions
Managed Drone Runnable
Logger LOGGER Logger Provider Logger Managed Drone
Atomic cont Atomic
Rate Limiter LIMITER Rate Limiter create
Executor Service EXECUTOR SERVICE Executors
Fixed Thread Pool Dronology Constants MAX DRONE THREADS Named Thread Factory Managed Drone
Drone drone Controls primitive flight commands drone
Drone Flight State Manager drone State
Drone Safety State Manager drone Safety State
flight director flight
Flight Director flight Director drone assigned
single flight plan
target Altitude
Timer halt Timer Timer
Halt Timer Task current Halt Timer
Constructs drone
drone
drn
Managed Drone Drone drone
Util check drone
drone drone
drone State Drone Flight State Manager
drone Safety State Drone Safety State Manager
drone Drone Status set Status drone State Status
flight Director Flight Director Factory Flight Director Don
drone State add State Change Listener notify State Change
notify State Change
drone Drone Status set Status drone State Status
Assigns flight directive managed drone
flight Directive
assign Flight Flight Director flight Directive
flight Director flight Directive
Removes assigned flight
unassign Flight
flight Director DANGER FIXING UNASSIGN FLIGHT
RETURNING BASE
LOGGER warn Unassigned DRONE Drone
Home
drone Safety State
Flight Safety Mode State set Safety Mode Normal
current Halt Timer
current Halt Timer cancel
current Halt Timer
target Altitude
Sets target altitude takeoff
set Target Altitude target Altitude
target Altitude target Altitude
Controls takeoff drone
Flight Zone Exception
Flight Zone Exception
target Altitude
Flight Zone Exception Target Altitude
drone State set Mode Taking
drone target Altitude
Delegates flyto behavior virtual physical drone
target Coordinates
speed
fly Lla Coordinate target Coordinates speed
drone fly target Coordinates speed
current coordinates virtual physical drone
current coordinates
Lla Coordinate Coordinates
drone Coordinates
start
thread start
LOGGER info Starting Drone drone Drone
EXECUTOR SERVICE submit
run
cont Thread current Thread Interrupted
LIMITER acquire
anymore TODO fix assign point
iteration loop
flight Director drone State Flying
Lla Coordinate target Coordinates flight Director fly Point
drone move
LOGGER mission Info drone Drone Waypoint reached target Coordinates
Dronology Monitoring Manager Instance publish
Message Marshaller create Message Message Type WAYPOINT REACHED drone Drone target Coordinates
flight Director clear Current Point
check End Flight
drone State Taking
Math abs drone Altitude target Altitude Dronology Constants THRESHOLD TAKEOFF HEIGHT
LOGGER info Target Altitude reached ready flying
drone State set Mode Flying
Flight Zone Exception
LOGGER error
Throwable
LOGGER error
LOGGER info UAV Thread drone Drone terminated
UAV Proxy Manager Instance remove Drone Drone
Check end flight Land conditions satisfied
check End Flight
flight Director flight Director ready Land
returned
drone State Landing
drone State Ground
drone State Air
land
Flight Zone Exception
LOGGER error Drone land
refactoring improve performance
permission Takeoff
dron Distance
List Managed Drone flying Drones Drone Fleet Manager Instance Registered Drones
Managed Drone drone flying Drones
equals flying Drones
drone Flight Mode State Flying drone Flight Mode State Air
dron Distance Coordinates distance drone Coordinates
dron Distance Dronology Constants SAFETY ZONE
LOGGER error Safety Distance Violation Drone allowed distance dron Distance
safety zone Dronology Constants SAFETY ZONE dron Distance
unique drone
Drone
drone Drone
Land drone Delegate land functions virtual physical drone
Flight Zone Exception
land Flight Zone Exception
drone State Landing drone State Ground
drone State set Mode Landing
drone land
drone State set Mode Ground
unassign Flight
Temporarily Halt
haltinms
halt Place haltinms
drone Safety State
current Halt Timer
current Halt Timer cancel
drone Safety State set Safety Mode Normal
drone State set Mode Flying
current Halt Timer
drone Safety State set Safety Mode Halted
drone State set Mode Air
current Halt Timer Halt Timer Task
halt Timer schedule current Halt Timer haltinms
Flight Zone Exception
LOGGER error
Temporarily Halt
haltinms
Flight Zone Exception
resume Flight Flight Zone Exception
drone Safety State
current Halt Timer
Flight Zone Exception UAV halted
current Halt Timer cancel
drone Safety State set Safety Mode Normal
drone State set Mode Flying
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
Halt Timer Task Timer Task
run
drone Safety State
drone Safety State Safety Mode Halted
current Halt Timer
drone Safety State set Safety Mode Normal
drone State set Mode Flying
current Halt Timer
Flight Zone Exception
LOGGER error
send Command Drone Command command Drone Exception
drone send Command command
stop
drone State Ground
LOGGER warn Removing UAV drone Drone state drone State Status
LOGGER info Removing UAV drone Drone
cont set
halt Timer cancel
emergency Stop Drone Exception
LOGGER warn Emergency stop UAV drone Drone requested
send Command Emergency Stop Command drone Drone
resend Command Drone Exception
drone resend Command