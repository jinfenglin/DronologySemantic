State Message Type Adapter Json Deserializer Map
Logger LOGGER Logger Provider Logger State Message Type Adapter
Map deserialize Json Element element Type map Type Json Deserialization Context arg
Json Parse Exception
Map Object data Map Hash Map
Json Object map Object element Json Object
Lla Coordinate location deserialize LLA Coordinate map Object UAV State Message LOCATION
data Map put UAV State Message LOCATION location
Lla Coordinate attitude deserialize LLA Coordinate map Object UAV State Message ATTITUDE
data Map put UAV State Message ATTITUDE attitude
Lla Coordinate velocity deserialize LLA Coordinate map Object UAV State Message VELOCITY
data Map put UAV State Message VELOCITY velocity
status map Object UAV State Message STATUS
mode map Object UAV State Message MODE
data Map put UAV State Message STATUS Drone Status status
data Map put UAV State Message MODE Drone Mode mode
armed map Object UAV State Message ARMED
data Map put UAV State Message ARMED armed
armable map Object UAV State Message ARMABLE
data Map put UAV State Message ARMABLE armable
groundspeed map Object UAV State Message GROUNDSPEED
data Map put UAV State Message GROUNDSPEED groundspeed
Battery Status battery Status deserialize Battery Status map Object UAV State Message BATTERYSTATUS
data Map put UAV State Message BATTERYSTATUS battery Status
TODO Auto generated method stub
data Map
Battery Status deserialize Battery Status Json Object map Object itemname
Json Element location Elem map Object itemname
Json Object loc Object location Elem Json Object
bcurrent
loc Object current
Json Primitive level loc Object Json Primitive current
bcurrent level
Cast Exception
LOGGER error Current
Exception
LOGGER error
blevel
loc Object level
Json Primitive level loc Object Json Primitive level
blevel level
Cast Exception
LOGGER error Level
Exception
LOGGER error
bvoltage
loc Object voltage
Json Primitive volt loc Object Json Primitive voltage
bvoltage volt
Cast Exception
LOGGER error Voltage
Exception
LOGGER error
Battery Status bcurrent bvoltage blevel
Lla Coordinate deserialize LLA Coordinate Json Object map Object itemname
Json Element location Elem map Object itemname
Json Object loc Object location Elem Json Object
Json Primitive latitude loc Object Json Primitive
Json Primitive longitude loc Object Json Primitive
Json Primitive altitude loc Object Json Primitive
Lla Coordinate latitude longitude altitude