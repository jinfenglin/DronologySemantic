package edu.nd.dronology.services.missionplanning.patterns;

import edu.nd.dronology.core.coordinate.LlaCoordinate;
import edu.nd.dronology.services.missionplanning.MissionExecutionException;
import edu.nd.dronology.services.missionplanning.plan.FullMissionPlan;
import edu.nd.dronology.services.missionplanning.plan.UAVMissionPlan;
import edu.nd.dronology.services.missionplanning.sync.SyncConstants;
import edu.nd.dronology.services.missionplanning.tasks.PatternTask;
import edu.nd.dronology.services.missionplanning.tasks.TaskFactory;

/**
 * 
 * Predefined pattern for coordinated take-off that is expanded as part of a {@link PatternTask} in a {@link FullMissionPlan}.<br>
 * 
 * @author Michael Vierhauser 
 *
 */
public class CoordinatedTakeoffPattern extends AbstractFlightPattern implements IFlightPattern {

	CoordinatedTakeoffPattern() {

	}

	@Override
	public void expandFlightPattern(UAVMissionPlan uavMission, LlaCoordinate currentLocation,
			LlaCoordinate targetLocation) throws MissionExecutionException {

		if (uavMission.getCoordinationAltitude() == 0) {
			uavMission.setCoordinationAltitude(synchPointMgr.getNextAltitude());
		}

		LlaCoordinate wp1 = new LlaCoordinate(currentLocation.getLatitude(), currentLocation.getLongitude(),
				uavMission.getCoordinationAltitude());

		LlaCoordinate wp2 = new LlaCoordinate(targetLocation.getLatitude(), targetLocation.getLongitude(),
				uavMission.getCoordinationAltitude());

		LlaCoordinate wp3 = new LlaCoordinate(targetLocation.getLatitude(), targetLocation.getLongitude(),
				targetLocation.getAltitude());

		addTask(TaskFactory.getTask(TaskFactory.TAKEOFF, uavMission.getUavID(), wp1));
		addTask(TaskFactory.getTask(TaskFactory.SYNC, uavMission.getUavID(), SyncConstants.TAKEOFF_ASC_REACHED));

		addTask(TaskFactory.getTask(TaskFactory.WAYPOINT, uavMission.getUavID(), wp2));
		addTask(TaskFactory.getTask(TaskFactory.SYNC, uavMission.getUavID(), SyncConstants.TAKEOFF_LATLON_REACHED));

		addTask(TaskFactory.getTask(TaskFactory.WAYPOINT, uavMission.getUavID(), wp3));
		addTask(TaskFactory.getTask(TaskFactory.SYNC, uavMission.getUavID(), SyncConstants.TAKEOFF_WP_REACHED));

	}

	@Override
	protected void doCreateSyncPoints() {
		addSyncPoint("SP-TakeOff-AscentTargetReached");
		addSyncPoint("SP-TakeOff-LonLatReached");
		addSyncPoint("SP-TakeOff-FirstWayPointReached");

	}

}
