package edu.nd.dronology.services.facades;

import java.rmi.RemoteException;

import edu.nd.dronology.core.vehicle.IUAVProxy;
import edu.nd.dronology.services.core.remote.IMissionPlanningRemoteService;
import edu.nd.dronology.services.core.util.DronologyServiceException;
import edu.nd.dronology.services.instances.flightmanager.FlightManagerService;
import edu.nd.dronology.services.instances.missionplanning.MissionPlanningService;
import edu.nd.dronology.services.remote.AbstractRemoteFacade;
import net.mv.logging.ILogger;
import net.mv.logging.LoggerProvider;
/**
 * 
 * Remote facade for handling UAVs.<br>
 * Initial implementation of mission planning capabilities. <br>
 * Allows retrieving sending a mission plan as JSON Concept to Dronology.
 * 
 * 
 * @author Michael Vierhauser
 *
 */
public class MissionPlanningServiceRemoteFacade extends AbstractRemoteFacade implements IMissionPlanningRemoteService {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4580658378477037955L;
	private static final ILogger LOGGER = LoggerProvider.getLogger(MissionPlanningServiceRemoteFacade.class);
	private static volatile MissionPlanningServiceRemoteFacade INSTANCE;

	protected MissionPlanningServiceRemoteFacade() throws RemoteException {
		super(FlightManagerService.getInstance());
	}

	public static IMissionPlanningRemoteService getInstance() throws RemoteException {
		if (INSTANCE == null) {
			try {
				synchronized (MissionPlanningServiceRemoteFacade.class) {
					if (INSTANCE == null) {
						INSTANCE = new MissionPlanningServiceRemoteFacade();
					}
				}

			} catch (RemoteException e) {
				LOGGER.error(e);
			}
		}
		return INSTANCE;
	}

	@Override
	public void executeMissionPlan(String mission) throws RemoteException, DronologyServiceException {
		MissionPlanningService.getInstance().executeMissionPlan(mission);

	}
	
	@Override
	public void cancelMission() throws RemoteException, DronologyServiceException {
		MissionPlanningService.getInstance().cancelMission();

	}

}