package edu.nd.dronology.validation.safetycase.service;

import java.rmi.RemoteException;
import java.util.Collection;

import edu.nd.dronology.services.core.remote.IRemoteableService;
import edu.nd.dronology.services.core.util.DronologyServiceException;
import edu.nd.dronology.validation.safetycase.monitoring.UAVValidationInformation;
import edu.nd.dronology.validation.safetycase.validation.ValidationResult;

/**
 * 
 * @author Michael Vierhauser
 * 
 */
public interface IDroneSafetyRemoteService extends IRemoteableService {

	ValidationResult validateUAVSafetyCase(String uavid, String safetycase)
			throws DronologyServiceException, RemoteException;

	void addValidationListener(IMonitoringValidationListener listener)
			throws DronologyServiceException, RemoteException;

	Collection<UAVValidationInformation> getValidationInfo() throws RemoteException;

	UAVValidationInformation getValidationInfo(String uavId) throws RemoteException, DronologyServiceException;

	void removeValidationListener(IMonitoringValidationListener listener)
			throws DronologyServiceException, RemoteException;

}
