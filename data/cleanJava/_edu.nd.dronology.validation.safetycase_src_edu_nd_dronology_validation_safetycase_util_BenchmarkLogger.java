Benchmark
ACTIVE
init
ACTIVE
Run Counter
Timer timer
Timer
Date date
Date
date Time
Date Adding Ten Mins
Date WARMUP TIME
start System current Time Millis
report Task Report Scheduled
report Monitor Task Report Scheduled
timer schedule
Writer Task Adding Ten Mins BENCHMARK FRAME
Length
Time
FOLDER
reports
FILE
run ST txt
FILE
MONITOR run RT txt
FILE
FREQUENCY run FR txt
FILE
TRUST run
txt
FILE
UAV TRUST run UT txt
SEPARATOR
Simple Date Format df
Simple Date Format dd MM yy HH mm ss
Collections
monitor Collections
trust Collections
trust UAV Collections
frequency Collections
BENCHMARK FRAME
WARMUP TIME
report
uavid
duration
result
ACTIVE
log Time System current Time Millis
Builder Builder
Builder
date df format
Date log Time
Builder append date
Builder append SEPARATOR
Builder append
log Time
Builder append SEPARATOR
Builder append uavid
Builder append SEPARATOR
Builder append result
Builder append SEPARATOR
Builder append
duration
add Builder
Exception
print Stack Trace
report Trust
uavid
assumptionid
rating
duration
ACTIVE
log Time System current Time Millis
Builder Builder
Builder
date df format
Date log Time
Builder append date
Builder append SEPARATOR
Builder append
log Time
Builder append SEPARATOR
Builder append uavid
Builder append SEPARATOR
Builder append rating
Builder append SEPARATOR
Builder append
duration
trust add Builder
Exception
print Stack Trace
report UAV Trust
uavid
reputation
duration
ACTIVE
log Time System current Time Millis
Builder Builder
Builder
date df format
Date log Time
Builder append date
Builder append SEPARATOR
Builder append
log Time
Builder append SEPARATOR
Builder append uavid
Builder append SEPARATOR
Builder append
reputation
Builder append SEPARATOR
Builder append
duration
trust UAV add Builder
Exception
print Stack Trace
report Frequency
uavid
frequency
ACTIVE
log Time System current Time Millis
Builder Builder
Builder
date df format
Date System current Time Millis
Builder append date
Builder append SEPARATOR
Builder append
log Time
Builder append SEPARATOR
Builder append uavid
Builder append SEPARATOR
Builder append
frequency
frequency add Builder
Exception
print Stack Trace
report Monitor
uavid
assumptonid
time
result
ACTIVE
log Time System current Time Millis
Builder Builder
Builder
date df format
Date System current Time Millis
Builder append date
Builder append SEPARATOR
Builder append
log Time
Builder append SEPARATOR
Builder append uavid
Builder append SEPARATOR
Builder append assumptonid
Builder append SEPARATOR
Builder append result
Builder append SEPARATOR
Builder append time
monitor add Builder
Exception
print Stack Trace
run
Run Counter
File
File FOLDER
FILE
replace Integer run
exists
run
File
File FOLDER
FILE
MONITOR replace Integer run
exists
run
Writer Task
Timer Task
run Counter
Time
run
Write
monitor Write
trust Write
frequency Write
trust UAV Write
Write
clear
monitor
monitor Write
monitor
monitor clear
trust
trust Write
trust
trust clear
trust UAV
trust UAV Write
trust UAV
trust UAV clear
frequency
frequency Write
frequency
frequency clear
Write stream collect Collectors joining System Property line separator
System Property line separator
monitor monitor Write stream collect
Collectors joining System Property line separator System Property line separator
trust trust Write stream collect Collectors joining System Property line separator
System Property line separator
frequency frequency Write stream collect
Collectors joining System Property line separator System Property line separator
uav Trust trust UAV Write stream collect
Collectors joining System Property line separator System Property line separator
Files write Paths
FOLDER
FILE
replace Integer run
Bytes Standard Open Option CREATE Standard Open Option APPEND
Files write Paths
FOLDER
FILE
MONITOR replace Integer run
monitor Bytes Standard Open Option CREATE Standard Open Option APPEND
Files write Paths
FOLDER
FILE
TRUST replace Integer run
trust Bytes Standard Open Option CREATE Standard Open Option APPEND
Files write Paths
FOLDER
FILE
FREQUENCY replace Integer run
frequency Bytes Standard Open Option CREATE Standard Open Option APPEND
Files write Paths
FOLDER
FILE
UAV TRUST replace Integer run
uav Trust Bytes Standard Open Option CREATE Standard Open Option APPEND
IO Exception
TODO Auto generated
block
print Stack Trace
print