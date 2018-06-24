map component Active Flights UI
AF Map Component Custom Component
serial Version UID
Map leaflet Map
Array List Marker markers Array List
Collection IUAV Proxy drones
Collection Flight Plan Info current Flights
Drone Setup Remote Service service
Flight Manager Remote Service flight Manager Service
Base Service Provider provider UI Provider
follow
follow Zoom
Vertical Layout content Vertical Layout
Absolute Layout follow Layout Absolute Layout
AF Follow Bar follow Bar
Absolute Layout layout Absolute Layout
Popup View popup
Popup View drone Popup
AF Info Panel panel
Map Drawing Util drawingutil
AF Map Component AF Info Panel panel
panel panel
set Width
add Style map component
add Style af map component
leaflet Map Leafletmap Factory generate Map
drawingutil Map Drawing Util leaflet Map
service Drone Setup Remote Service provider Remote Manager Service Drone Setup Remote Service
flight Manager Service Flight Manager Remote Service provider Remote Manager
Service Flight Manager Remote Service
current Flights flight Route Service Flight Details Current Flights
Remote Exception Dronology Service Exception
print Stack Trace
UI set Connected
List temp Array List
drawingutil add Drone Markers temp
drawingutil add Active Flight Routes temp
set Average Center
screen Height UI Current Page Browser Window Height
layout Height Math rint screen Height
layout set Height Integer layout Height px
layout add Component leaflet Map
popup create Point Popup View
drone Popup create Drone Popup View
layout add Components popup drone Popup
content add Component layout
set Composition Root content
set Center center Lat center Lon
leaflet Map set Center center Lat center Lon
set Zoom Level zoom Level
leaflet Map set Zoom Level zoom Level
Center Lat
leaflet Map Center Lat
Center Lon
leaflet Map Center Lon
Zoom Level
leaflet Map Zoom Level
Map Map Instance
leaflet Map
function sets center zoom map include drones flight routes finds average latitude longitude finds point farthest
center bases zoom level point
set Average Center
content Component Index layout coming follow mode
content remove Components
leaflet Map remove Style af leaflet map edit mode
content add Component layout
Configuration configuration Configuration Instance
service Drone Setup Remote Service provider Remote Manager Service Drone Setup Remote Service
drones service Active UA
avg Lat
avg Lon
num Points
IUAV Proxy drones finding average latitude longitude drones flight routes
avg Lat Latitude
avg Lon Longitude
num Points
current Flights flight Manager Service Current Flights
Flight Plan Info current Flights
List Waypoint coordinates Waypoints
Waypoint coord coordinates
avg Lat coord Coordinate Latitude
avg Lon coord Coordinate Longitude
num Points
avg Lat num Points
avg Lon num Points
farthest Lat
farthest Lon finding farthest point center
IUAV Proxy drones
Math abs Latitude avg Lat farthest Lat
farthest Lat Math abs Latitude avg Lat
Math abs Longitude avg Lon farthest Lon
farthest Lon Math abs Longitude avg Lon
Flight Plan Info current Flights
List Waypoint coordinates Waypoints
Waypoint coord coordinates
Math abs coord Coordinate Latitude avg Lat farthest Lat
farthest Lat Math abs coord Coordinate Latitude avg Lat
Math abs coord Coordinate Longitude avg Lon farthest Lon
farthest Lon Math abs coord Coordinate Longitude avg Lon
Point point Point avg Lat avg Lon
zoom
farthest Lat farthest Lon
zoom
sets zoom based calculation degrees map zoom level
zoom Math floor Math log Math max farthest Lat farthest Lon Math log
leaflet Map set Center point zoom
Remote Exception Dronology Service Exception
UI set Connected
print Stack Trace
drones size
Point point Point configuration Map Center Lat configuration Map Center Lon
zoom configuration Map Zoom
leaflet Map set Center point zoom
follow variable map drones
Follow
follow
set Follow follow
follow follow
follow Zoom determines map zoom drones follow mode initially user clicks button follow drones map
Follow Zoom
follow Zoom
set Follow Zoom follow Zoom
follow Zoom follow Zoom
function sets center map average drones constantly change drone flies
names
list drone names map
follow Drones List names
names size
follow
content Component Index layout follow mode
content remove Components
leaflet Map remove Style af leaflet map edit mode
content add Component layout
follow
content Component Index layout follow mode
content remove Components
leaflet Map remove Style af leaflet map edit mode
content add Component layout
service Drone Setup Remote Service provider Remote Manager Service Drone Setup Remote Service
drones service Active UA
avg Lat finds average latitude longitude
avg Lon
num Points
IUAV Proxy drones
names
equals
avg Lat Latitude
avg Lon Longitude
num Points
avg Lat num Points
avg Lon num Points
farthest Lat finds farthest point center
farthest Lon
IUAV Proxy drones
names
equals
Math abs Latitude avg Lat farthest Lat
farthest Lat Math abs Latitude avg Lat
Math abs Longitude avg Lon farthest Lon
farthest Lon Math abs Longitude avg Lon
Point point Point avg Lat avg Lon
follow Zoom time button click set zoom level fit drones
zoom
farthest Lat farthest Lon
zoom
zoom Math floor Math log Math max farthest Lat farthest Lon Math log
leaflet Map set Center point zoom
follow Zoom
leaflet Map set Center point
content Component Index layout change map layout display follow bar
leaflet Map add Style af leaflet map edit mode
follow Bar AF Follow Bar names
follow Layout add Style af mapabsolute layout
follow Bar add Style bring front
screen Height UI Current Page Browser Window Height
layout Height Math rint screen Height
follow Layout set Height Integer layout Height px
follow Layout add Component layout
follow Layout add Component follow Bar
content remove Components
content add Component follow Layout
follow Bar update UAV List names
Remote Exception Dronology Service Exception
UI set Connected
print Stack Trace
listener displays AF Info Box popup drone hovered
Drone Mouse Listener Leaflet Mouse Listener
Mouse Leaflet Mouse Event event
drones service Active UA
Remote Exception
print Stack Trace
drone Popup set Visible
drone Popup set Popup Visible
Marker leaflet Marker Marker event Source
Vertical Layout popup Content Vertical Layout drone Popup Content Popup Component
popup Content remove Components
IUAV Proxy drones change popup content display AF Info Box
equals leaflet Marker
UAV Status Wrapper status UAV Status Wrapper
AF Info Box box AF Info Box status
box create Contents
box set Box Visible
Vertical Layout boxes panel Boxes
num UA panel Num UAVS
num UA
AF Info Box panel Box AF Info Box boxes Component
panel Box equals box updated information AF Info Panel
box set Checked panel Box Checked
box set Hover Place panel Box Hover Place
box update status
box Route Button add Click Listener click
drone Popup set Popup Visible
box Home Button add Click Listener click
drone Popup set Popup Visible
box Hover add Change Listener click
num UA
AF Info Box panel Box AF Info Box boxes Component
panel Box equals box
panel Box set Hover Place box Hover Place
box Check Box add Change Listener click checkbox clicked popup change AF Info Panel
box Check Box
num UA
AF Info Box panel Box AF Info Box boxes Component
panel Box equals box
panel Box set Checked
num UA
AF Info Box panel Box AF Info Box boxes Component
panel Box equals box
panel Box set Checked
popup Content add Component box
find location screen display popup Takes absolute position mouse converts relative position mouse map map dimensions
map position layout
map Width UI Current Page Browser Window Width
map Height UI Current Page Browser Window Height
Degree Difference leaflet Map Center Lon leaflet Marker Point Lon
Degree Difference leaflet Map Center Lat leaflet Marker Point Lat
degree Zoom Math pow leaflet Map Zoom Level
degree Pixel degree Zoom map Width
Pixel Difference Degree Difference degree Pixel
Pixel Difference Degree Difference degree Pixel
Pixel Difference Pixel Difference
pixels Left Border map Width Pixel Difference
pixels Top Border map Height Pixel Difference
mouse Mouse Info Pointer Info Location
mouse Mouse Info Pointer Info Location
map Top Left mouse pixels Left Border
map Top Left mouse pixels Top Border
adjusted Location mouse map Top Left
adjusted Location mouse map Top Left
layout add Component drone Popup top adjusted Location px left
adjusted Location px
drone Popup set Visible
drone Popup set Popup Visible
returns waypoint popup
Popup View create Point Popup View
Vertical Layout popup Content Vertical Layout
popup Content remove Components
Label latitude Label Label
latitude Label set latitude
Label longitude Label Label
longitude Label set longitude
Label altitude Label Label
altitude Label set altitude
Label transit Speed Label Label
transit Speed Label set transit Speed
popup Content add Component latitude Label
popup Content add Component longitude Label
popup Content add Component altitude Label
popup Content add Component transit Speed Label
Popup View popup Popup View popup Content
popup add Style bring front
popup set Visible
popup set Popup Visible
popup
returns drone popup
Popup View create Drone Popup View
Vertical Layout popup Content Vertical Layout
popup Content remove Components
popup Content add Component Label Drone Information
Popup View popup Popup View popup Content
popup add Style bring front
popup set Visible
popup set Popup Visible
popup
listener displays popup information waypoint Virtually listener flight routes UI
Waypoint Mouse Listener Leaflet Mouse Listener
Mouse Leaflet Mouse Event event
popup set Visible
popup set Popup Visible
Marker leaflet Marker Marker event Source
Vertical Layout popup Content Vertical Layout popup Content Popup Component
Component popup Content iterates popup content updates waypoint information
Component
current Flights flight Manager Service Current Flights
Flight Plan Info current Flights
List Waypoint coordinates Waypoints
Waypoint coord coordinates
coord Coordinate Latitude leaflet Marker Point Lat
coord Coordinate Longitude leaflet Marker Point Lon
equals latitude
Label Label
set Latitude coord Coordinate Latitude
equals longitude
Label Label
set Longitude coord Coordinate Longitude
equals altitude
Label Label
set Altitude coord Coordinate Altitude
equals transit Speed
Label Label
set Transit Speed coord Approachingspeed
Remote Exception
Notification show Reconnecting
service Drone Setup Remote Service provider Remote Manager Service Drone Setup Remote Service
flight Manager Service Flight Manager Remote Service provider Remote Manager
Service Flight Manager Remote Service
Remote Exception Dronology Service Exception
UI set Connected
Notification show Reconnecting
Notification show Reconnecting
find location screen display popup Takes absolute position mouse converts relative position mouse map map dimensions
map position layout
map Width UI Current Page Browser Window Width
map Height UI Current Page Browser Window Height
Degree Difference leaflet Map Center Lon leaflet Marker Point Lon
Degree Difference leaflet Map Center Lat leaflet Marker Point Lat
degree Zoom Math pow leaflet Map Zoom Level
degree Pixel degree Zoom map Width
Pixel Difference Degree Difference degree Pixel
Pixel Difference Degree Difference degree Pixel
Pixel Difference Pixel Difference
Pixel Difference Pixel Difference
pixels Left Border map Width Pixel Difference
pixels Top Border map Height Pixel Difference
mouse Mouse Info Pointer Info Location
mouse Mouse Info Pointer Info Location
map Top Left mouse pixels Left Border
map Top Left mouse pixels Top Border
adjusted Location mouse map Top Left
adjusted Location mouse map Top Left
layout add Component popup top adjusted Location px left
adjusted Location px
popup set Visible
popup set Popup Visible
Leaflet Mouse Listener Waypoint Listener
Waypoint Mouse Listener
Leaflet Mouse Listener Drone Listener
Drone Mouse Listener
refresh focused List checked Names
drawingutil update Drone Markers focused checked Names
drawingutil update Active Flight Routes focused checked Names