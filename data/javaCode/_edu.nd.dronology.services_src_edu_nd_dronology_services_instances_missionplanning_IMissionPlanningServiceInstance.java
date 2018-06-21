package edu.nd.dronology.services.instances.missionplanning;

import edu.nd.dronology.services.core.api.IServiceInstance;
import edu.nd.dronology.services.core.util.DronologyServiceException;

public interface IMissionPlanningServiceInstance extends IServiceInstance {

	void executeMissionPlan(String mission) throws DronologyServiceException;

	void cancelMission() throws DronologyServiceException;

	void removeUAV(String uavid) throws DronologyServiceException;

}
