package edu.nd.dronology.services.instances.missionplanning;

import edu.nd.dronology.services.core.base.AbstractServiceInstance;
import edu.nd.dronology.services.core.util.DronologyServiceException;
import edu.nd.dronology.services.core.util.ServiceIds;
import edu.nd.dronology.services.facades.FlightManagerServiceRemoteFacade;
import edu.nd.dronology.services.missionplanning.MissionExecutionException;
import edu.nd.dronology.services.missionplanning.plan.MissionController;
import edu.nd.dronology.services.missionplanning.sync.SynchronizationManager;
import net.mv.logging.ILogger;
import net.mv.logging.LoggerProvider;

public class MissionPlanningServiceInstance extends AbstractServiceInstance implements IMissionPlanningServiceInstance {

	private static final ILogger LOGGER = LoggerProvider.getLogger(MissionPlanningServiceInstance.class);

	public MissionPlanningServiceInstance() {
		super(ServiceIds.SERVICE_MISSIONPLANNING, "Mission Planning");
	}

	@Override
	protected Class<?> getServiceClass() {
		return MissionPlanningService.class;
	}

	@Override
	protected int getOrder() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	protected String getPropertyPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void doStartService() throws Exception {

	}

	@Override
	protected void doStopService() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void executeMissionPlan(String mission) throws DronologyServiceException {
		try {
			MissionController.getInstance().executeMission(mission);
		} catch (MissionExecutionException e) {
			LOGGER.error(e);
			new DronologyServiceException(e.getMessage());
		}

	}

	@Override
	public void cancelMission() throws DronologyServiceException {
		try {
			MissionController.getInstance().cancelMission();
		} catch (MissionExecutionException e) {
			LOGGER.error(e);
			new DronologyServiceException(e.getMessage());
		} 

	}

	@Override
	public void removeUAV(String uavid) throws DronologyServiceException {
		SynchronizationManager.getInstance().removeUAV(uavid);

	}

}
