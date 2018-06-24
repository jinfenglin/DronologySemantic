Log Cleaner
days hours
DELTE TRESHOLD
Logger LOGGER Logger Provider Logger Log Cleaner
run
Logger Context ctx Logger Context Log Manager Context
System println logger config ctx Configuration Configuration Source Location
Map Appender appenders ctx Root Logger Appenders
Appender app appenders values
app Rolling File Appender
check Path Rolling File Appender app File substring
Rolling File Appender app File Index
Throwable
print Stack Trace
check Path substring
File log Folder File substring
File log Files log Folder list Files
LOGGER info Cleaning log file directory log Folder Absolute Path
File log Files
Modifified System current Time Millis Modified
Modifified DELTE TRESHOLD Filename Utils Extension equals log
delete
LOGGER info Deleting log file older DELTE TRESHOLD days Absolute Path
Throwable
print Stack Trace