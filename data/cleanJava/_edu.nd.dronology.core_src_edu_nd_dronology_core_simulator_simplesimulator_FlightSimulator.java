Computes current position virtual drone moves flight Serves lightweight SITL drone
Flight Simulator
Logger LOGGER Logger Provider Logger Flight Simulator
Lla Coordinate current Position
Lla Coordinate target Position
previous Distance
reached
Virtual Drone drone
Creates flight simulator object single virtual drone
drone
Flight Simulator Virtual Drone drone
drone drone
Sets current flight path current position targeted position
current Pos
Coordinates current position
target Pos
Coordinates target position
set Flight Path Lla Coordinate current Pos Lla Coordinate target Pos
current Position reached
current Position current Pos
reached
target Position target Pos
previous Distance Remaining Distance
Computes distance current position target position
distance remaining degree points
Remaining Distance
Math sqrt Math pow compute Longitude Delta Math pow compute Latitude Delta
Computes delta drones current latitude target latitude
compute Latitude Delta
current Position Latitude target Position Latitude
Computes delta drones current longitude target longitude
compute Longitude Delta
current Position Longitude target Position Longitude
Computes angle drone flying respect vertical
compute Angle
height compute Latitude Delta opposite
width compute Longitude Delta
hypotenuse Remaining Distance
sin Theta height hypotenuse
angle Math asin sin Theta Math PI
Na angle angle
Computes position drone step Checks destination reached
step
Distance degree points move iteration
Moving
move step
determine relative quadrant target relation current position origin axes
theta compute Angle
height Increment Math abs Math sin theta step
width Increment Math abs Math cos theta step
scale Factor
width Increment scale Factor
height Increment scale Factor
Longit
Latid
Latitude delta
current Position Latitude target Position Latitude
current Position set Latitude current Position Latitude height Increment Drone south Target
Latid current Position Latitude height Increment
current Position set Latitude current Position Latitude height Increment Drone North target
Latid current Position Latitude height Increment
Longitude delta
current Position Longitude target Position Longitude
current Position set Longitude current Position Longitude width Increment Drone left west target
Longit current Position Longitude width Increment
current Position set Longitude current Position Longitude width Increment Drone east target
Longit current Position Longitude width Increment
distance Moved Math sqrt Math pow height Increment Math pow width Increment
Latid Latid
Longit Longit
current Position Lla Coordinate Latid Longit current Position Altitude
LOGGER trace Remaining Dinstance Distance Util distance current Position target Position
previous Distance Remaining Distance Remaining Distance
drone set Coordinates current Position
Distance Util distance current Position target Position
previous Distance Remaining Distance
LOGGER info drone Drone Waypoint reached
reached
previous Distance Remaining Distance
Exception
LOGGER error
Checks drone reached target destination
distance Moved Time Step
Checks location respect target position
target position reached
Destination Reached distance Moved Time Step
lat Distance Math abs current Position Latitude target Position Latitude
lon Distance Math abs current Position Longitude target Position Longitude
lon Distance distance Moved Time Step lat Distance distance Moved Time Step