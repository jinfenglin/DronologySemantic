defines bar overlaid map signals route
edit mode
FR Edit Mode Controller Custom Component
serial Version UID
FR Map Component map Component
Horizontal Layout total Layout Horizontal Layout
Button cancel Button Button Cancel
Button save Button Button Save
Label text Label Label Editing Route
Label small Text Label Left click add waypoint Drag waypoints move
List UI Point stored Points Array List
stored
stored Description
FR Edit Mode Controller FR Map Component map Component
map Component map Component
set Style fr edit bar
text Label set Style large text
small Text set Style small text
cancel Button set Height px
save Button set Height px
total Layout add Components text Label small Text cancel Button save Button
set Composition Root total Layout
Click listeners cancel saves buttons edit bar function
defined FR Map Component
cancel Button add Click Listener
cancel Click
save Button add Click Listener
save Click
Called cancel button clicked Disables editing reverts
back contents stored Points
cancel Click
Reverts clearing map Points adding stored Points
map Component Map Utilities remove Pins
stored Points size
UI Point point stored Points
map Component Map Utilities add Pin point
map Component Meta Info set Route stored
map Component Meta Info set Route Description stored Description
map Component update Lines Grid
exit Edit Mode
Called save button edit bar clicked exits edit mode
sends points dronology stored points display correct
waypoints map
save Click
List UI Point Waypoints map Component Map Utilities Ordered Points
Flight Route Persistence Provider route Persistor Flight Route Persistence Provider Instance
Array Input Stream Stream
Flight Route froute
Flight Routeplanning Remote Service service
Base Service Provider provider UI Provider
map Component Main Layout Controls Info Panel Highlighted FR Info Box
Sends information dronology saved
service Flight Routeplanning Remote Service provider Remote Manager
Service Flight Routeplanning Remote Service
information service request Server
Stream Array Input Stream information
froute route Persistor load Item Stream
froute set map Component Meta Info Route
froute set Description map Component Meta Info Route Description
Array List Waypoint Coords Array List froute Waypoints
Waypoint cord Coords
froute remove Waypoint cord
waypoints type Waypoint converting Point
adding back froute
UI Point Waypoints
alt
lon
lat
approach
lon parse Longitude
Number Format Exception
print Stack Trace
lat parse Latitude
Number Format Exception
print Stack Trace
alt parse Altitude
Number Format Exception
print Stack Trace
approach parse Transit Speed
Number Format Exception
print Stack Trace
Waypoint Send Waypoint Lla Coordinate lat lon alt
Send set Approachingspeed approach
froute add Waypoint Send
Array Output Stream outs Array Output Stream
route Persistor save Item froute outs
bytes outs Array
service transmit Server froute bytes
Dronology Service Exception Remote Exception
print Stack Trace
UI set Connected
Persistence Exception
print Stack Trace
List Waypoint Waypoints Save froute Waypoints
Route Save froute
map Component Main Layout Waiting Window show Window Saving route
Test route updated dronology
Collection Flight Route Info routes map Component Main Layout Controls Info Panel
Routes Dronology
Flight Route Info route Dronology
Flight Route Info route routes
route equals
route Dronology route
route Dronology route Dronology Waypoints size Waypoints Save size
Route Save equals route Dronology
waypoint sizes updated
Waypoints Save size
waypoint info updated
Waypoints Save equals route Dronology Waypoints
updated
close Event
exit Edit Mode
map Component Main Layout Controls Info Panel refresh Routes
map Component Main Layout
Route map Component Main Layout Controls Info Panel Route Info Box
Enables editing adds edit bar calls enable Route Editing function
Map Marker Utilities
enter Edit Mode
stored Points map Component Map Utilities Ordered Points
stored map Component Meta Info Route
stored Description map Component Meta Info Route Description
map Component Map Utilities set Editable
map Component Table Display make Editable
set Visible
map Component Map add Style fr leaflet map edit mode
map Component Table Display Grid add Style fr table component edit mode
Disables editing removes edit bar component styles
exit Edit Mode
stored Points clear
stored
stored Description
map Component Map Utilities set Editable
map Component Table Display make Uneditable
set Visible
map Component Map remove Style fr leaflet map edit mode
map Component Table Display Grid remove Style fr table component edit mode