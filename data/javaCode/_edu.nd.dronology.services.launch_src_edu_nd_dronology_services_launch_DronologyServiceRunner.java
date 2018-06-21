package edu.nd.dronology.services.launch;

import edu.nd.dronology.core.fleet.RuntimeDroneTypes;
import edu.nd.dronology.core.monitoring.DronologyMonitoringManager;
import edu.nd.dronology.gstation.connector.service.connector.DroneConnectorService;
import edu.nd.dronology.monitoring.MonitoringDataHandler3;
import edu.nd.dronology.monitoring.service.DroneMonitoringServiceRemoteFacade;
import edu.nd.dronology.monitoring.service.IDroneMonitoringRemoteService;
import edu.nd.dronology.monitoring.simplechecker.checker.SimpleChecker;
import edu.nd.dronology.monitoring.simplechecker.monitor.SimpleMonitor;
import edu.nd.dronology.services.dronesetup.DroneSetupService;
import edu.nd.dronology.services.instances.dronesimulator.DroneSimulatorService;
import edu.nd.dronology.services.instances.flightmanager.FlightManagerService;
import edu.nd.dronology.services.instances.flightroute.FlightRouteplanningService;
import edu.nd.dronology.services.instances.missionplanning.MissionPlanningService;
import edu.nd.dronology.services.remote.RemoteManager;
import edu.nd.dronology.services.remote.RemoteService;
import edu.nd.dronology.services.specification.DroneSpecificationService;
import edu.nd.dronology.services.supervisor.SupervisorService;
import net.mv.logging.ILogger;
import net.mv.logging.LoggerProvider;

public class DronologyServiceRunner {

	private static final ILogger LOGGER = LoggerProvider.getLogger(DronologyServiceRunner.class);
	private static final boolean USE_SAFETY_CASES = true;

	public static void main(String[] args) {

		try {

			RemoteService.getInstance().startService();
			SupervisorService.getInstance().startService();
			FlightRouteplanningService.getInstance().startService();
			FlightManagerService.getInstance().startService();
			DroneSetupService.getInstance().startService();
			DroneSpecificationService.getInstance().startService();
			DroneSimulatorService.getInstance().startService();
			MissionPlanningService.getInstance().startService();
			DroneConnectorService.getInstance().startService();
			RuntimeDroneTypes runtimeMode = RuntimeDroneTypes.getInstance();

			runtimeMode.setPhysicalEnvironment();

			RemoteManager.getInstance().contributeService(IDroneMonitoringRemoteService.class,
					DroneMonitoringServiceRemoteFacade.getInstance());

			// DronologyMonitoringManager.getInstance().registerHandler(new
			// MonitoringDataHandler3());

			// new SimpleMonitor().main(null);
			// SimpleChecker.getInstance().init();

		} catch (Throwable e) {
			e.printStackTrace();
		}

	}

}
