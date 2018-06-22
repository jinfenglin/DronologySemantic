//package edu.nd.dronology.core.monitoring.messages;
//
//import edu.nd.dronology.core.monitoring.ArtifactIdentifier;
//import edu.nd.dronology.core.monitoring.IMonitorableMessage;
//import edu.nd.dronology.core.monitoring.messages.UAVMonitorableMessage.MessageType;
//import edu.nd.dronology.core.util.PreciseTimestamp;
//
//public class UAVStateChangeMessage implements IMonitorableMessage {
//
//	private Concept uavid;
//	private Concept oldstate;
//	private Concept newstate;
//	private final PreciseTimestamp timestamp;
//
//	public UAVStateChangeMessage(Concept uavid, Concept oldstate, Concept newstate) {
//		this.uavid = uavid;
//		timestamp = PreciseTimestamp.create();
//		this.oldstate = oldstate;
//		this.newstate = newstate;
//	}
//
//	@Override
//	public ArtifactIdentifier<?> getIdentifier() {
//		return new ArtifactIdentifier(ArtifactIdentifier.ROOT, "INTERNAL",MessageType.STATE_CHANGE.toString(), uavid);
//
//	}
//
//	public Concept getUavid() {
//		return uavid;
//	}
//
//	@Override
//	public Concept getData() {
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
//		return MessageType.STATE_CHANGE;
//	}
//
//}
