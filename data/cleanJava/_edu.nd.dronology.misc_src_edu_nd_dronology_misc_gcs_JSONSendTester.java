JSON Send Tester
main args
Gson GSON Gson Builder enable Complex Map Key Serialization serialize Nulls
set Date Format Date Format set Field Naming Policy Field Naming Policy LOWER DASHES
set Version serialize Special Floating Point Values create
UAV Monitoring Message mm UAV Monitoring Message Drone FAKE Drone
mm set Type UAV Monitoring Message MESSAGE TYPE
mm set Uavid DRONE
mm add Propery NR SATELITES
mm add Propery GPS BIAS
mm add Propery CURRENT SPEED
Send GSON Json mm
UAV State Message sm UAV State Message Drone FAKE Drone
sm set Type UAV State Message MESSAGE TYPE
sm set Uavid DRONE
sm set Armable
sm set Armed
sm set Attitude Lla Coordinate
sm set Groundspeed
sm set Location Lla Coordinate
sm set Mode dronology gstation python connector messages UAV State Message Drone Mode CIRCLE
sm set Status Drone Status ACTIVE
sm set Velocity Lla Coordinate
sm set Batterystatus Battery Status
Send GSON Json sm
UAV Handshake Message hm UAV Handshake Message FAKE Drone
hm set Type UAV Handshake Message MESSAGE TYPE
hm set Home Lla Coordinate
hm add Propery xxx abc
hm add Propery yyy parameters
Send GSON Json hm
System println Send
Exception
TODO Auto generated block
print Stack Trace