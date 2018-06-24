KML Exporter
UAVID IRIS
test kml
datapath kmlexport
root Template
point Template
main args
KML Exporter create KML File log log
create KML File logfile
root Template File Util read File template track txt
point Template File Util read File template trackpoint txt
System println point Template
List UAV State Message messages read Messages logfile
kml create KML Body messages
write File kml
List UAV State Message read Messages logfile
List UAV State Message message List Array List
List lines Files read Lines Paths logfile
lines message List add parse Line
message List
IO Exception
TODO Auto generated block
print Stack Trace
message List
UAV State Message parse Line
start index
msg Text substring start
UAV State Message msg
msg UAV State Message UAV Message Factory create msg Text
msg
Exception
TODO Auto generated block
print Stack Trace
write File kml
File testexists File datapath kml
Writer fwriter
testexists exists
fwriter File Writer datapath kml
fwriter write kml
fwriter flush
fwriter close
IO Exception
TODO Auto generated block
print Stack Trace
schleifenvariable
filecontent
Array List newoutput Array List
Buffered Reader Buffered Reader File Reader testexists
filecontent read Line
newoutput add filecontent
File Found Exception
TODO Auto generated block
print Stack Trace
IO Exception
TODO Auto generated block
print Stack Trace
newoutput add kmlelement
rewrite
newoutput
rewrite
fwriter File Writer datapath kml
fwriter write rewrite
fwriter flush
fwriter close
IO Exception
TODO Auto generated block
print Stack Trace
create KML Body List UAV State Message messages
tq File root Template
Builder cord Builder Builder
UAV State Message messages
res create KML Element
res
cord Builder append res
tq File tq File replace points cord Builder
Builder sb Builder
content str
sb append str
sb append
tq File
create KML Element UAV State Message
Date Format df Simple Date Format yyyy MM dd HH mm ss
df set Time Zone Time Zone Time Zone Zulu
Format Util format Timestamp Timestamp yyyy MM dd HH mm ss
Uavid equals UAVID
tp point Template
tp tp replace lat Location Latitude
tp tp replace lon Location Longitude
tp tp replace alt Location Altitude
tp tp replace time
tp