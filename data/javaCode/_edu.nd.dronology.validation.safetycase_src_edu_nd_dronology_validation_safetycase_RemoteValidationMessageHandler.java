package edu.nd.dronology.validation.safetycase;

import java.rmi.RemoteException;

import edu.nd.dronology.core.monitoring.IMonitorableMessage;
import edu.nd.dronology.gstation.connector.messages.UAVMonitoringMessage;
import edu.nd.dronology.gstation.connector.messages.UAVStateMessage;
import edu.nd.dronology.monitoring.IRemoteMonitoringMessageHandler;
import edu.nd.dronology.validation.safetycase.monitoring.UAVValidationManager;

public class RemoteValidationMessageHandler implements IRemoteMonitoringMessageHandler {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3611037944339638886L;

	@Override
	public void notifyMonitoringMessage(IMonitorableMessage message) throws RemoteException {
		if (message instanceof UAVStateMessage) {
			UAVValidationManager.getInstance().notifyStatusMessage((UAVStateMessage) message);
		} else if (message instanceof UAVMonitoringMessage) {
			UAVValidationManager.getInstance().notifyMonitoringMessage((UAVMonitoringMessage) message);
		}

	}

}
