Central management UAV related actions br
includes landing checks assignment flight plans UA
Flight Zone Manager Plan Status Change Listener
Logger LOGGER Logger Provider Logger Flight Zone Manager
Plan Pool Manager plan Pool Manager
Drone Fleet Manager drone Fleet
Atomic Integer active UAVS Atomic Integer
List Flight Plan awaiting Flights Collections List Array List
List Flight Plan awaiting Landing Flights Collections List Array List
Timer timer Timer
Constructs Flight Zone Manager
Interrupted Exception
Flight Zone Manager Interrupted Exception
drone Fleet Drone Fleet Manager Instance
plan Pool Manager Plan Pool Manager Instance
plan Pool Manager add Plan Status Change Listener
timer schedule Fixed Rate Status Check Task Dronology Constants FREQUENCY STATUS CHECKS
timer schedule Fixed Rate Collision Avoidance Check Task Dronology Constants FREQUENCY COLLISION CHECKS
Managed Drone Assign UAV Drone Exception Flight Zone Exception
Flight Plan Plan plan Pool Manager Pending Plan
Managed Drone drone
Plan Designated Drone
drone drone Fleet Drone
drone
plan Pool Manager assign Plan Plan drone Drone
drone drone Fleet Drone Plan Designated Drone
TODO find free uav plans
drone plan Pool Manager Current Plan drone Drone
plan Pool Manager activate Plan Plan drone Drone
drone Flight Mode State Ground
awaiting Flights add Plan
Flight Director flight Directives Solo Director drone
flight Directives set Points Plan Points
drone assign Flight flight Directives
moved launch
Plan set Status Flying drone
drone Flight Mode State Air
drone Flight Mode State set Mode Flying
drone Flight Mode State set Mode Awaiting Clearance
drone
Status Check Task Timer Task
run
check Landed Flights
check Completed Plans
Drone Exception
LOGGER error
active UAVS Dronology Constants MAX AIR
check Pending Flying
plan Pool Manager Pending Flights
Assign UAV
check Pending Flying Takeoff
Drone Exception
LOGGER error
Awaiting active UAVS Dronology Constants MAX AIR
LOGGER info Awaiting Takeoff Awaiting Flights Flight
check Readiness
Flight Zone Exception
LOGGER error Failed Check takeoff readiness
Awaiting Landing
check Landing Readiness
Throwable
LOGGER error
Checks pending flight takeoff takeoff occurs order pending list
drone Fleet
Flight Zone Exception
check Readiness Flight Zone Exception
Technical debt
Checks waiting drone time called
awaiting Flights Empty
Flight Plan awaiting Flight Plan awaiting Flights
Managed Drone drone awaiting Flight Plan Assigned Drone
drone permission Takeoff
drone set Target Altitude awaiting Flight Plan Takeoff Altitude
drone set Target Altitude Dronology Constants ALTITUDE
drone
active UAVS increment
awaiting Flights remove awaiting Flight Plan
check Pending Flying
Flight Plan pending Plan plan Pool Manager Pending Plans
check Scheduling pending Plan
Drone Exception Flight Zone Exception
LOGGER error
check Pending Flying Takeoff
Flight Plan pending Plan plan Pool Manager Pending Plans
check Scheduling Takeoff pending Plan
Drone Exception Flight Zone Exception
LOGGER error
check Scheduling Flight Plan pending Plan Drone Exception Flight Zone Exception
Managed Drone drone
pending Plan Designated Drone
drone drone Fleet Drone
drone
plan Pool Manager assign Plan pending Plan drone Drone
drone drone Fleet Drone pending Plan Designated Drone
drone drone Flight Mode State Air
plan Pool Manager Current Plan drone Drone
drone
drone Fleet Drone Pool drone
plan Pool Manager activate Plan pending Plan drone Drone
Flight Director flight Directives Solo Director drone
flight Directives set Points pending Plan Points
drone assign Flight flight Directives
moved launch
pending Plan set Status Flying drone
drone Flight Mode State Air
drone Flight Mode State set Mode Flying
check Scheduling Takeoff Flight Plan pending Plan Drone Exception Flight Zone Exception
Managed Drone drone
pending Plan Designated Drone
drone drone Fleet Drone
drone
plan Pool Manager assign Plan pending Plan drone Drone
drone drone Fleet Drone pending Plan Designated Drone
drone plan Pool Manager Current Plan drone Drone
plan Pool Manager activate Plan pending Plan drone Drone
Flight Director flight Directives Solo Director drone
flight Directives set Points pending Plan Points
drone assign Flight flight Directives
moved launch
pending Plan set Status Flying drone
drone Flight Mode State Air
drone Flight Mode State set Mode Flying
drone Flight Mode State Ground
awaiting Flights add pending Plan
drone Flight Mode State set Mode Awaiting Clearance
check Landing Readiness
awaiting Landing Flights Empty awaiting Landing Flights Completed
Flight Plan awaiting Flight Plan awaiting Landing Flights
Managed Drone drone drone Fleet Registered Drone awaiting Flight Plan Designated Drone
LOGGER info Drone drone Drone ready land
drone land
land alt
active UAVS decrement
awaiting Landing Flights remove
Flight Zone Exception Drone Exception
TODO Auto generated block
print Stack Trace
Awaiting Landing
awaiting Landing Flights size
List Flight Plan Awaiting Flights
Collections unmodifiable List awaiting Flights
check Completed Plans Drone Exception
plan Pool Manager check Form Completed Plans
Awaiting
awaiting Flights Empty
plan Flight uavid plan List Waypoint waypoints Drone Exception
Flight Plan plan Flight Plan Factory create uavid plan waypoints
Plan Pool Manager Instance add Plan plan
plan Flight plan List Waypoint waypoints Drone Exception
Flight Plan plan Flight Plan Factory create plan waypoints
Plan Pool Manager Instance add Plan plan
notify Plan Change Flight Plan changed Plan
changed Plan Completed
Managed Drone drone changed Plan Assigned Drone
drone
drone Fleet Drone Pool drone
Home uavid Drone Exception
LOGGER info uavid returning home
Managed Drone drone drone Fleet Registered Drone uavid
Lla Coordinate base Coordinate drone Base Coordinates
current Altitude drone Coordinates Altitude
Lla Coordinate home Coordinate Lla Coordinate base Coordinate Latitude base Coordinate Longitude
current Altitude
Lla Coordinate home Coordinate Altitude Lla Coordinate base Coordinate Latitude
base Coordinate Longitude Dronology Constants HOME ALTITUDE
Waypoint wps Waypoint home Coordinate
Waypoint wps Waypoint home Coordinate Altitude
List Waypoint wps List Array List
wps List add wps
wps List add wps
Flight Plan home Plane Flight Plan Factory create uavid Home wps List
plan Pool Manager Plan home Plane uavid
drone Flight Mode State Flying
drone Flight Mode State set Mode Air
Flight Director flight Directives Solo Director drone
flight Directives set Points home Plane Points
drone assign Flight flight Directives
awaiting Landing Flights add home Plane
drone Flight Mode State set Mode Flying
drone Home
home Plane set Status Flying drone
Flight Zone Exception
LOGGER error
cancel Pending Flights uavid Drone Exception
Plan Pool Manager Instance cancel Pending Plans uavid
pause Flight uavid Drone Exception
Managed Drone drone drone Fleet Registered Drone uavid
drone Flight Safety Mode State Safety Mode Halted
LOGGER info uavid Pause current flight
drone halt Place
resume Flight uavid Drone Exception Flight Zone Exception
LOGGER info uavid Resume current flight
Managed Drone drone drone Fleet Registered Drone uavid
drone resume Flight
takeoff uavid altitude Drone Exception Flight Zone Exception
LOGGER info uavid Takeoff
Managed Drone drone drone Fleet Registered Drone uavid
Plan Pool Manager Instance add Plan Simple Takeoff Flight Plan drone altitude
emergency Stop uavid Drone Exception
Managed Drone drone drone Fleet Registered Drone uavid
drone emergency Stop