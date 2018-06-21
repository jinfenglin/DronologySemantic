package edu.nd.dronology.validation.safetycase.service.internal;

import java.util.Collection;

import edu.nd.dronology.services.core.api.IServiceInstance;
import edu.nd.dronology.services.core.util.DronologyServiceException;
import edu.nd.dronology.validation.safetycase.monitoring.UAVValidationInformation;
import edu.nd.dronology.validation.safetycase.service.IMonitoringValidationListener;
import edu.nd.dronology.validation.safetycase.validation.ValidationEntry;
import edu.nd.dronology.validation.safetycase.validation.ValidationResult;

public interface IDroneSafetyServiceInstance extends IServiceInstance {

	ValidationResult validateUAVSafetyCase(String uavid, String safetycase) throws DronologyServiceException;

	void addValidationListener(IMonitoringValidationListener listener);

	void removeValidationListener(IMonitoringValidationListener listener);

	Collection<UAVValidationInformation> getValidationInfo();

	UAVValidationInformation getValidationInfo(String uavid) throws DronologyServiceException;

	void notifyValidationListeners(String uavid, ValidationEntry validationResult);

}
