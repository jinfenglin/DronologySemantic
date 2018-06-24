Associates drone state object drone br
Normal behavior GROUND AWAITING TAKEOFF CLEARANCE TAKING FLYING AIR LANDING br
Unavailable transitions result exception thrown
Drone Flight State Manager
Logger LOGGER Logger Provider Logger Drone Flight State Manager
Flight Mode
GROUND AWAITING TAKEOFF CLEARANCE TAKING FLYING AIR LANDING USER CONTROLLED
Flight Mode Transition
GROUND PLAN ASSIGNED TAKEOFF GRANTED TARGET ALTITUED REACHED PLAN COMPLETE ALTITUED REACHED LANDING GRANTED MANUAL TAKEOFER
State Machine Flight Mode Flight Mode Transition uav State Machine
uavid
List Managed Drone State Change Listener listeners Array List
Constructor States Flight Mode Safety Mode set initial state
uav
UAV state manager assigned
Drone Flight State Manager Managed Drone uav
uavid uav Drone
build State Machine
build State Machine
uav State Machine State Machine Flight Mode GROUND
uav State Machine configure Flight Mode GROUND permit Flight Mode Transition PLAN ASSIGNED
Flight Mode AWAITING TAKEOFF CLEARANCE
uav State Machine configure Flight Mode AWAITING TAKEOFF CLEARANCE permit Flight Mode Transition TAKEOFF GRANTED
Flight Mode TAKING
uav State Machine configure Flight Mode TAKING permit Flight Mode Transition TARGET ALTITUED REACHED
Flight Mode FLYING
uav State Machine configure Flight Mode FLYING permit Flight Mode Transition PLAN COMPLETE Flight Mode AIR
uav State Machine configure Flight Mode AIR permit Flight Mode Transition PLAN ASSIGNED Flight Mode FLYING
uav State Machine configure Flight Mode AIR permit Flight Mode Transition LANDING GRANTED Flight Mode LANDING
uav State Machine configure Flight Mode LANDING permit Flight Mode Transition ALTITUED REACHED
Flight Mode GROUND
uav State Machine configure Flight Mode GROUND permit Flight Mode Transition MANUAL TAKEOFER
Flight Mode USER CONTROLLED
uav State Machine configure Flight Mode AWAITING TAKEOFF CLEARANCE permit Flight Mode Transition MANUAL TAKEOFER
Flight Mode USER CONTROLLED
uav State Machine configure Flight Mode TAKING permit Flight Mode Transition MANUAL TAKEOFER
Flight Mode USER CONTROLLED
uav State Machine configure Flight Mode FLYING permit Flight Mode Transition MANUAL TAKEOFER
Flight Mode USER CONTROLLED
uav State Machine configure Flight Mode AIR permit Flight Mode Transition MANUAL TAKEOFER
Flight Mode USER CONTROLLED
uav State Machine configure Flight Mode LANDING permit Flight Mode Transition MANUAL TAKEOFER
Flight Mode USER CONTROLLED
Set Flight Mode Ground
Flight Zone Exception
mode change follow allowed state transition
set Mode Ground Flight Zone Exception
Flight Mode State uav State Machine State
uav State Machine Fire Flight Mode Transition ALTITUED REACHED
uav State Machine fire Flight Mode Transition ALTITUED REACHED
notify State Change State uav State Machine State
LOGGER error transition uav State Machine State trigger
Flight Mode Transition ALTITUED REACHED
Flight Zone Exception
transition Flight Mode GROUND directly uav State Machine State
Set Flight Mode User Controlled
set Mode User Controlled Flight Zone Exception
Flight Mode State uav State Machine State
uav State Machine Fire Flight Mode Transition MANUAL TAKEOFER
uav State Machine fire Flight Mode Transition MANUAL TAKEOFER
notify State Change State uav State Machine State
LOGGER error transition uav State Machine State trigger
Flight Mode Transition MANUAL TAKEOFER
Flight Zone Exception
transition Flight Mode GROUND directly uav State Machine State
Set Flight mode awaiting Takeoff Clearance
Flight Zone Exception
mode change follow allowed state transition
set Mode Awaiting Clearance Flight Zone Exception
Flight Mode State uav State Machine State
uav State Machine Fire Flight Mode Transition PLAN ASSIGNED
uav State Machine fire Flight Mode Transition PLAN ASSIGNED
notify State Change State uav State Machine State
LOGGER error transition uav State Machine State trigger
Flight Mode Transition PLAN ASSIGNED
Flight Zone Exception transition Flight Mode AWAITING TAKEOFF CLEARANCE
directly uav State Machine State
Set flight mode Taking
Flight Zone Exception
mode change follow allowed state transition
set Mode Taking Flight Zone Exception
Flight Mode State uav State Machine State
uav State Machine Fire Flight Mode Transition TAKEOFF GRANTED
uav State Machine fire Flight Mode Transition TAKEOFF GRANTED
notify State Change State uav State Machine State
LOGGER error transition uav State Machine State trigger
Flight Mode Transition TAKEOFF GRANTED
Flight Zone Exception
transition Flight Mode TAKING directly uav State Machine State
Set flight mode Flying
Flight Zone Exception
mode change follow allowed state transition
set Mode Flying Flight Zone Exception
Flight Mode State uav State Machine State
uav State Machine Fire Flight Mode Transition TARGET ALTITUED REACHED
uav State Machine fire Flight Mode Transition TARGET ALTITUED REACHED
notify State Change State uav State Machine State
uav State Machine Fire Flight Mode Transition PLAN ASSIGNED
uav State Machine fire Flight Mode Transition PLAN ASSIGNED
notify State Change State uav State Machine State
LOGGER error transition uav State Machine State trigger
Flight Mode Transition TARGET ALTITUED REACHED
Flight Zone Exception
transition Flight Mode FLYING directly uav State Machine State
Set flight mode Landing
Flight Zone Exception
mode change follow allowed state transition
set Mode Landing Flight Zone Exception
Flight Mode State uav State Machine State
uav State Machine Fire Flight Mode Transition LANDING GRANTED
uav State Machine fire Flight Mode Transition LANDING GRANTED
notify State Change State uav State Machine State
LOGGER error transition uav State Machine State trigger
Flight Mode Transition LANDING GRANTED
Flight Zone Exception
transition Flight Mode LANDING directly uav State Machine State
drone ground
Ground
uav State Machine State Flight Mode GROUND
drone Awaiting Clearance mode
Awaiting Takeoff Clearance
uav State Machine State Flight Mode AWAITING TAKEOFF CLEARANCE
drone taking
Taking
uav State Machine State Flight Mode TAKING
drone flying
Flying
uav State Machine State Flight Mode FLYING
drone landing
Landing
uav State Machine State Flight Mode LANDING
current status
Status
uav State Machine State
current Flight Mode
notify State Change Flight Mode State Flight Mode State
LOGGER info Drone uavid set uav State Machine State
Dronology Monitoring Manager Instance publish Message Marshaller create uavid State State
Managed Drone State Change Listener listener listeners
listener notify State Change
Air
uav State Machine State Flight Mode AIR
set Mode Air Flight Zone Exception
Flight Mode State uav State Machine State
uav State Machine Fire Flight Mode Transition PLAN COMPLETE
uav State Machine fire Flight Mode Transition PLAN COMPLETE
notify State Change State uav State Machine State
LOGGER error transition uav State Machine State trigger
Flight Mode Transition PLAN COMPLETE
Flight Zone Exception
transition Flight Mode AIR directly uav State Machine State
add State Change Listener Managed Drone State Change Listener listener
listeners add listener