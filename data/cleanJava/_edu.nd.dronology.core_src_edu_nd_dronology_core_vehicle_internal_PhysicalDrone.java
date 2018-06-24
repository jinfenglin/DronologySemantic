Representation physical UAV interacts real hardware SITL simulated UAV
Physical Drone Drone Drone IUAV Property Update Notifier
Logger LOGGER Logger Provider Logger Physical Drone
Drone Command Handler base Station
drone
Lla Coordinate current Target
Drone Command Command
Physical Drone drn Drone Command Handler base Station
drn
base Station base Station
current Target Lla Coordinate
drone drn
base Station set Status Callback Notifier drone
drone Status set Groundstation base Station Handler
Exception
LOGGER error
Latitude
Coordinates Latitude
Longitude
Coordinates Longitude
Altitude
Coordinates Altitude
Random Random
fly Lla Coordinate target Coordinates speed
target Coordinates current Target
TODO add time limit refreshing information didn
properly
current Target target Coordinates
LOGGER mission Info drone Flying waypoint target Coordinates
send Command Command drone target Coordinates
speed speed
send Command Set Ground Speed Command drone speed
Drone Exception
LOGGER error
Lla Coordinate Coordinates
drone Status Coordinates
land Flight Zone Exception
send Command Land Command drone Land Command MODE LAND
Drone Exception
Flight Zone Exception
altitude Flight Zone Exception
send Command Takeoff Command drone altitude
Drone Exception
Flight Zone Exception
Battery Status
drone Status Battery Level
move
update data server
TODO necessarily place update
base Station Incoming Data
Destination Reached
TODO Auto generated method stub
set Voltage Check Point
TODO Auto generated method stub
Destination Reached
distancetotarget Math abs current Position distance current Target
LOGGER trace drone Distance target distancetotarget
distancetotarget Dronology Constants THRESHOLD WAYPOINT DISTANCE
update Coordinates Lla Coordinate location
LOGGER info Coordinates updated
set Coordinates location Latitude location Longitude location Altitude
update Drone State status
LOGGER info status
set Ground Speed speed
send Command Set Ground Speed Command drone speed
Drone Exception
LOGGER error
set Velocity
send Command Set Velocity Command drone
Drone Exception
LOGGER error
update Battery Level battery Level
update Battery Level battery Level
update Velocity velocity
set Velocity velocity
send Command Drone Command command Drone Exception
base Station
Command command
base Station send Command command
update Mode mode
mode equals Flight Mode USER CONTROLLED
set User Controlled
resend Command Drone Exception
LOGGER hw Info Resending previous command drone
base Station
Command
LOGGER hw Fatal command recorded uav drone
Drone Exception previous command found
LOGGER info Resending command Command
send Command Command