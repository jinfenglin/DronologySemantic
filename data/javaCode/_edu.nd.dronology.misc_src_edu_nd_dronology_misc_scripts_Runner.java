package edu.nd.dronology.misc.scripts;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import edu.nd.dronology.core.vehicle.IUAVProxy;
import edu.nd.dronology.services.core.info.FlightRouteInfo;
import edu.nd.dronology.services.core.remote.IDroneSetupRemoteService;
import edu.nd.dronology.services.core.remote.IFlightManagerRemoteService;
import edu.nd.dronology.services.core.remote.IFlightRouteplanningRemoteService;
import edu.nd.dronology.services.core.remote.IRemoteManager;
import edu.nd.dronology.services.core.util.DronologyServiceException;

public class Runner {

	private static final String ADDRESS_SCHEME = "rmi://%s:%s/Remote";

	public static void main(String[] args) {
		try {

			IRemoteManager manager = (IRemoteManager) Naming.lookup(String.format(ADDRESS_SCHEME, "localhost", 9898));

			IDroneSetupRemoteService service = (IDroneSetupRemoteService) manager.getService(IDroneSetupRemoteService.class);

			IFlightManagerRemoteService managerService = (IFlightManagerRemoteService) manager
					.getService(IFlightManagerRemoteService.class);

			IFlightRouteplanningRemoteService planningService = (IFlightRouteplanningRemoteService) manager
					.getService(IFlightRouteplanningRemoteService.class);

			List<FlightRouteInfo> allRoutes = new ArrayList<>(planningService.getItems());
			// int NUM_DRONES = 0;
			// for (int i = 0; i < NUM_DRONES; i++) {
			// double coordofset = (double) i / 10000;
			// LlaCoordinate coord = new LlaCoordinate((41.519400 + coordofset), -86.239927, 0);
			// DroneInitializationInfo dr = new DroneInitializationInfo("Sim-Drone" + i, DroneMode.MODE_VIRTUAL,
			// "IRIS+", coord);
			//
			// service.initializeDrones(dr);
			// }

			// for (DroneStatus dr : service.getDrones().values()) {
			// FlightRouteInfo inf = getRandomRoute(allRoutes);
			//
			// managerService.planFlight(dr.getID(), "randplan", inf.getWaypoints());
			//
			// }
			FlightRouteInfo inf = allRoutes.remove(0);
			for (IUAVProxy dr : service.getActiveUAVs()) {

				managerService.planFlight(dr.getID(), "randplan", inf.getWaypoints());

			}

		} catch (RemoteException | DronologyServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	static Random rand = new Random();

	private static FlightRouteInfo getRandomRoute(List<FlightRouteInfo> allRoutes) {
		int routeSize = allRoutes.size();

		int randomNumber = rand.nextInt(routeSize);

		return allRoutes.get(randomNumber);

	}

}
