box side panel UAV information
AF Info Box Custom Component
serial Version UID
visible
Checked
hover Place
check Clicked
Check Box check Check Box
Label status Info Label
Label status Info Label
Label status Info Label
Label health Label
Label location Info Label
Label location Info Label
Label location Info Label
Label location Info Label
hover
Button Home Button
Button takeoff Button
Resource takeoff Icon Image Provider Taekoff Resource
Resource rtl Icon Image Provider RTL Resource
Resource assign Route Icon Image Provider Assign Route Resource
Resource resend Icon Image Provider Resend Command Resource
Resource Icon Image Provider Status Resource
Resource user controlled Image Provider Status Usercontrolled Resource
Button assign Route Button
Button resend Command Button
Vertical Layout main Content Vertical Layout
Horizontal Layout top Content Horizontal Layout
Vertical Layout middle Content Vertical Layout
Horizontal Layout bottom Content Horizontal Layout
UAV Status Wrapper uav Status
AF Info Box Checked UAV Status Wrapper uav Status hover Place
uav Status uav Status
Checked Checked
hover Place hover Place
create Contents
add Style Style Constants INFO BOX
add Style Style Constants AF INFO BOX
top Content add Style Style Constants AF BOX INFO TOP CONTENT
middle Content add Style Style Constants AF BOX INFO DETAIL CONTENT
bottom Content add Style Style Constants AF BOX INFO BOTTOM CONTENT
create Top Component
middle Content add Components location Info location Info
create Bottom Component
main Content add Components top Content middle Content bottom Content
main Content set Size Undefined
main Content set Spacing
middle Content set Visible visible
bottom Content set Visible visible
set Composition Root main Content
Home set Height px
assign Route set Height px
takeoff set Height px
resend Command set Height px
takeoff set Width px
Home set Width px
assign Route set Width px
resend Command set Width px
takeoff set Description target altitude
resend Command set Description Resend previous command
Home set Description Cancel routes home imediatelly
assign Route set Description Assign flight route
takeoff set Style Valo Theme BUTTON ICON
takeoff set Icon takeoff Icon
Home set Icon rtl Icon
assign Route set Icon assign Route Icon
resend Command set Icon resend Icon
add Listener
update uav Status
create Bottom Component
Grid Layout bottom Buttons Grid Layout
bottom Buttons set Width px
bottom Buttons set Height px
Vertical Layout bottom Vertical Layout
hover set hover Place
Label caption Label Hover Place
bottom add Components caption hover
bottom Buttons add Components takeoff Home assign Route resend Command
bottom Content add Components bottom bottom Buttons
create Top Component
Vertical Layout status Content Vertical Layout
check set Checked
Image drone Image Image Provider UAV Image
status Info add Style info box
status Info add Style Valo Theme LABEL BOLD
status Content add Components status Info status Info status Info
status Content set Spacing
health set Caption Html
health set Icon Icon
top Content add Components check drone Image status Content health
top Content set Spacing
top Content set Component Alignment check Alignment TOP LEFT
top Content set Component Alignment drone Image Alignment TOP LEFT
top Content set Component Alignment status Content Alignment TOP LEFT
top Content set Component Alignment health Alignment TOP
add Listener
Home add Click Listener
Dronology Action Executor Home uav Status
takeoff add Click Listener
assign Route add Click Listener assign Event opens assign routes UI
Dronology Action Executor assign Route UAV uav Status
resend Command add Click Listener assign Event opens assign routes UI
Dronology Action Executor resend Command uav Status
hover add Change Listener
set Hover Place hover
listener assists box focused checked
top Content add Layout Click Listener
Component child Child Component
child child Check Box
check Clicked
check Clicked
top Content add Layout Click Listener
Component child Child Component
child child Canonical equals vaadin ui Check Box
set Box Visible visible
uav Status Status equals GROUND
Notification show uav Status air
Takeoff Altitude Window takeoff Altitude Window Takeoff Altitude Window uav Status
UI Current add Window takeoff Altitude Window
constructor
AF Info Box
UAV Status green
set Checked Checked
Checked Checked
check set Checked
Checked
Checked check
Checked
Check Box Check Box
check
set Hover Place hover Place
hover Place hover Place
hover set hover Place
hover Place
status Hovering
status Info set Status
status
status Info set Status
Hover Place
hover Place
Hover
hover
Expands collapses box
visible
set Box Visible visible
visible
visible
middle Content set Visible visible
bottom Content set Visible visible
visible
middle Content set Visible visible
bottom Content set Visible visible
Box Visible
visible
Button Home Button
Home
Button Route Button
assign Route
Check Click
check Clicked
set Check Click check Clicked
check Clicked check Clicked
update UAV Status Wrapper uav Status
uav Status uav Status
status Info set uav Status
status Info set Status uav Status Status
status Info set Battery Life uav Status Battery Life
loc format Lat Alt uav Status Latitude
uav Status Longitude uav Status Altitude
location Info set loc
location Info set Longitude uav Status Longitude
location Info set Altitude uav Status Altitude meters
location Info set Ground Speed uav Status Speed
health set Caption span style color uav Status Health Color
important
Vaadin Icons CIRCLE Html span
uav Status Health Color equals green
health set Description Functionable
uav Status Health Color equals yellow
health set Description Attention
uav Status Health Color equals red
health set Description Attention
uav Status Status equals Flight Mode USER CONTROLLED
health set Icon user controlled
set Enabled
set Box Visible
health set Icon Icon
set Enabled
uav Status
Status
uav Status Status
Health Color
uav Status Health Color