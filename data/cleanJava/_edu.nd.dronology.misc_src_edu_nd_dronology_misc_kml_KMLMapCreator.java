KML Creator
UAVID IRIS
result
datapath kmlexport
main
args
KML Creator create KML File log log
create KML File
logfile
messages read Messages logfile
kml create KML Body messages
write File kml
read Messages
logfile
message
lines Files read Lines Paths
logfile
lines message add parse Line
message
IO Exception
TODO Auto generated
block
print Stack Trace
message
UAV State Message parse Line
start index
msg Text substring start
UAV State Message msg
msg UAV State Message UAV Message Factory create msg Text
msg
Exception
TODO Auto generated
block
print Stack Trace
write File
kml
File testexists
File datapath
kml
Writer fwriter
testexists exists
fwriter
File Writer datapath
kml
fwriter write kml
fwriter flush
fwriter close
IO Exception
TODO Auto generated
block
print Stack Trace
schleifenvariable
filecontent
newoutput
Buffered Reader
Buffered Reader
File Reader testexists
filecontent
read Line
newoutput add filecontent
File Found Exception
TODO Auto generated
block
print Stack Trace
IO Exception
TODO Auto generated
block
print Stack Trace
newoutput add kmlelement
rewrite
newoutput
rewrite
fwriter
File Writer datapath
kml
fwriter write rewrite
fwriter flush
fwriter close
IO Exception
TODO Auto generated
block
print Stack Trace
kmlstart
Concept kmlelement WP num
lon lat alt
time
kmlelement WP num desc
absolute coords
create KML Body
messages
kmlend
content
content add kmlstart
Builder cord Builder
Builder
UAV State Message messages
res create KML Element
res
cord Builder append res
km Element kmlelement replace coords cord Builder
km Element km Element replace desc UAVID
content add km Element
content add kmlend
Builder sb
Builder
content str
sb append str
sb append
sb
create KML Element UAV State Message
Uavid equals UAVID
Builder sb
Builder
sb append Location Longitude
sb append
sb append Location Latitude
sb append
sb append Location Altitude
sb append
sb