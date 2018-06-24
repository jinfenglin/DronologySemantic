side panel AF Info Boxes UAV information
AF Info Panel Custom Component
serial Version UID
Panel panel Panel
Button select Button Button Select
Button visible Button Button Expand
Vertical Layout content Vertical Layout
num UA
select
visible
focused
AF Map View Operations map View AF Map View Operations
Collection IUAV Proxy drones
Drone Setup Remote Service service
Base Service Provider provider UI Provider
AF Mission Operations mission View AF Mission Operations
Logger LOGGER Logger Provider Logger AF Info Panel
AF Info Panel
panel set Caption Integer num UA Active UA
panel set Content content
panel add Style Style Constants AF INFO PANEL
panel add Style Style Constants CONTROL PANEL
Horizontal Layout buttons Horizontal Layout
Vertical Layout side Bar Vertical Layout
AF Emergency Component emergency AF Emergency Component
emergency Home add Click Listener sends UA checked UA homes
List checked Checked
message
send Home
checked size
checked size
num UA
AF Info Box box AF Info Box content Component
box equals checked
box Status equals GROUND
Notification show checked home
send Home
message send checked home
drones
checked size
drones checked
message send drones checked checked size
homes
message send UA homes
Window confirm Window Confirm
confirm add Style confirm window
Vertical Layout Content Vertical Layout
Horizontal Layout Buttons Horizontal Layout
Buttons add Style confirm button area
Label label Label message
Button Button
add Style btn danger
Button Button
add Click Listener Event
UI Current remove Window confirm
Flight Manager Remote Service service
service Flight Manager Remote Service provider Remote Manager
Service Flight Manager Remote Service
checked size
checked size
num UA
AF Info Box box AF Info Box content Component
box equals checked
box Status equals GROUND
service Home checked
num UA
AF Info Box box AF Info Box content Component
box Status equals GROUND
service Home box
Exception exc
exc print Stack Trace
add Click Listener Event
UI Current remove Window confirm
Buttons add Components
Content add Components label Buttons
confirm set Content Content
confirm set Modal
confirm set Resizable
confirm center
send Home
UI Current add Window confirm
content add Layout Click Listener determines box focus
Component test Child Child Component
test Child AF Info Box
AF Info Box child AF Info Box Child Component
child Check Click box clicked checkbox
child add Style info box focus
child set Checked
focused child
num UA
AF Info Box box AF Info Box content Component
box equals child
box remove Style info box focus
box set Checked
box set Check Click
child remove Style info box focus
focused equals child
focused
side Bar add Components panel map View mission View emergency
set Composition Root side Bar
select Button add Style Valo Theme BUTTON
select Button add Style Style Constants SMALL BUTTON
visible Button add Style Valo Theme BUTTON
visible Button add Style Style Constants SMALL BUTTON
buttons add Components select Button visible Button
buttons add Style af uav list controls
select Button add Click Listener
select
select
select Button set Caption Deselect
select
select
select Button set Caption Select
select
visible Button add Click Listener
visible
visible
set Visibility
visible Button set Caption Expand
visible
set Visibility
visible Button set Caption Collapse
content add Component buttons
num UA content Component Count
service Drone Setup Remote Service provider Remote Manager Service Drone Setup Remote Service
Collection IUAV Proxy active Drones service Active UA
drones Array List active Drones
Collections sort drones
IUAV Proxy drones
add Box UAV Status Wrapper
Dronology Service Exception Remote Exception
UI set Connected
LOGGER error
AF Map View Operations Map View
map View
Focused
focused
Adds box panel
Checked
status
battery Life
health Color
lat
lon
alt
speed
hover Place
add Box Checked UAV Status Wrapper uav Status hover Place
AF Info Box box AF Info Box Checked uav Status hover Place
box create Contents
content add Component box
num UA content Component Count
panel set Caption Integer num UA Active UA
add Box
AF Info Box box AF Info Box
content add Component box
num UA content Component Count
panel set Caption Integer num UA Active UA
Removes box panel
drone
returns successful returns failed
remove Box
num UA
AF Info Box box AF Info Box content Component
box equals
content remove Component box
num UA content Component Count
panel set Caption Integer num UA Active UA
select select
num UA
AF Info Box box AF Info Box content Component
box set Checked select
select focused equals box
box remove Style info box focus
box set Check Click
focused
list drones checkbox checked
List Checked
List names Array List
num UA
AF Info Box box AF Info Box content Component
box Checked
names add box
names
drones checked
Checked
checked
num UA
AF Info Box box AF Info Box content Component
box Checked
checked
checked
drones checked
Checked
Checked
num UA
AF Info Box box AF Info Box content Component
box Checked
Checked
Checked
Expands collapses boxes
visible
set Visibility visible
num UA
AF Info Box box AF Info Box content Component
box set Box Visible visible
boxes expanded
Visible
visible
num UA
AF Info Box box AF Info Box content Component
box Box Visible
visible
visible
boxes collapsed
Visible
Visible
num UA
AF Info Box box AF Info Box content Component
box Box Visible
Visible
Visible
set Hover
num UA
AF Info Box box AF Info Box content Component
box set Hover Place
Vertical Layout Boxes
content
Num UAVS
num UA
updated information dronology UAV location information status adds drones panel removes drones deactivated
refresh Drones
update select deselect button
Checked select Button Caption equals Select num UA
select Button set Caption Deselect
select
Checked select Button Caption equals Deselect num UA
select Button set Caption Select
select
update expand collapse button
Visible visible Button Caption equals Expand num UA
visible Button set Caption Collapse
visible
Visible visible Button Caption equals Collapse num UA
visible Button set Caption Expand
visible
Collection IUAV Proxy Drones service Active UA
add drones panel
Drones size drones size
IUAV Proxy Drones
Match
IUAV Proxy drones
equals
Match
Match
add Box UAV Status Wrapper
delete drones panel
Drones size drones size
IUAV Proxy drones
exists
IUAV Proxy current Drones
equals current
exists
exists
num UA
AF Info Box box AF Info Box content Component
equals box
remove Box box
Remote Exception
Notification show Reconnecting
service Drone Setup Remote Service provider Remote Manager Service Drone Setup Remote Service
Remote Exception Dronology Service Exception
UI set Connected
Notification show Reconnecting
Notification show Reconnecting
content remove Components
num UA
update current drones status
drones service Active UA
IUAV Proxy drones
num UA
AF Info Box box AF Info Box content Component
equals box
box update UAV Status Wrapper
Remote Exception
Notification show Reconnecting
service Drone Setup Remote Service provider Remote Manager Service Drone Setup Remote Service
Remote Exception Dronology Service Exception
Notification show Reconnecting
Notification show Reconnecting
content remove Components
num UA
create Contents
TODO Auto generated method stub