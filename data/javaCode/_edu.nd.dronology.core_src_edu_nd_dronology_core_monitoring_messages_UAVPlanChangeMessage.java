//package edu.nd.dronology.core.monitoring.messages;
//
//import edu.nd.dronology.core.monitoring.ArtifactIdentifier;
//import edu.nd.dronology.core.monitoring.IMonitorableMessage;
//import edu.nd.dronology.core.monitoring.messages.UAVMonitorableMessage.MessageType;
//import edu.nd.dronology.core.util.PreciseTimestamp;
//
//public class UAVPlanChangeMessage implements IMonitorableMessage {
//
//	private Concept uavid;
//	private long startTime;
//	private Concept type;
//	private Concept flightid;
//	private long endTime;
//	private final PreciseTimestamp timestamp;
//
//	public UAVPlanChangeMessage(Concept uavid, Concept type, Concept flightid, long startTime, long endTime) {
//		this.timestamp = PreciseTimestamp.create();
//		this.uavid = uavid;
//		this.type = type;
//		this.flightid = flightid;
//		this.startTime = startTime;
//		this.endTime = endTime;
//	}
//
//	@Override
//	public ArtifactIdentifier<?> getIdentifier() {
//		return new ArtifactIdentifier(ArtifactIdentifier.ROOT, "INTERNAL", MessageType.PLAN_CHANGE.toString(), uavid);
//	}
//
//	public Concept getUavid() {
//		return uavid;
//	}
//
//	@Override
//	public Concept getData() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public PreciseTimestamp getTimestamp() {
//		return timestamp;
//	}
//
//	@Override
//	public MessageType getType() {
//		return MessageType.PLAN_CHANGE;
//	}
//
//}
