package edu.nd.dronology.services.core.remote;

import java.rmi.RemoteException;

import edu.nd.dronology.services.core.util.DronologyServiceException;

/**
 * 
 * @author Michael Vierhauser
 * 
 */
public interface IMissionPlanningRemoteService extends IRemoteableService {

	void executeMissionPlan(String mission) throws RemoteException, Exception;

	void cancelMission() throws RemoteException, DronologyServiceException;

}
