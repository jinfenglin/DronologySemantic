package edu.nd.dronology.monitoring.reminds;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import edu.nd.dronology.core.monitoring.IMonitorableMessage;
import edu.nd.dronology.core.monitoring.messages.UAVMonitorableMessage;
import edu.nd.dronology.gstation.connector.messages.UAVMonitoringMessage;
import edu.nd.dronology.gstation.connector.messages.UAVStateMessage;
import edu.nd.dronology.monitoring.IRemoteMonitoringMessageHandler;

public class RemoteMessageHandler extends UnicastRemoteObject implements IRemoteMonitoringMessageHandler {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7596407358222986141L;

	public RemoteMessageHandler() throws RemoteException {
		super();
	}

	static {
		new Thread(new KeepAlliveRunnable()).start();
	}

	@Override
	public void notifyMonitoringMessage(IMonitorableMessage message) throws RemoteException {

	//	System.out.println("MESSAGE RECEIVED:" + message.toString());

		if (message instanceof UAVStateMessage) {
			RemindsConnector.notify((UAVStateMessage) message);
			// System.out.println("MM");
		} else if (message instanceof UAVMonitoringMessage) {
			RemindsConnector.notify((UAVMonitoringMessage) message);
			// System.out.println("SM");

			// } else if (message instanceof UAVStateChangeMessage) {
			// RemindsConnector.notify((UAVStateChangeMessage) message);
			// // System.out.println("SM");
			//
			// } else if (message instanceof UAVPlanChangeMessage) {
			// RemindsConnector.notify((UAVPlanChangeMessage) message);
			// // System.out.println("SM");

		} else if (message instanceof UAVMonitorableMessage) {
			RemindsConnector.notify((UAVMonitorableMessage) message);
			// System.out.println("SM");
		}

		else {
			System.out.println(message.getClass());
		}
	}

	// @Override
	// public void notifyMonitoringMessage(UAVMonitoringMessage message) {
	// RemindsConnector.notify(message);
	// System.out.println("MMESSAGE!!!");
	// }
	//
	// @Override
	// public void notifyStatusMessage(UAVStateMessage message) {
	// try {
	// RemindsConnector.notify(message);
	// }catch(Throwable t) {
	// t.printStackTrace();
	// }
	// System.out.println("MESSAGE!!!");
	// }

	public static class KeepAlliveRunnable implements Runnable {

		@Override
		public void run() {
			while (true) {
				try {
					Thread.sleep(30000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

	}

}
