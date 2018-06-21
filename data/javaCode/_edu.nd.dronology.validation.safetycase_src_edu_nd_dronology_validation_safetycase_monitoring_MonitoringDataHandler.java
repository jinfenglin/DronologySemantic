package edu.nd.dronology.validation.safetycase.monitoring;

import java.io.File;
import java.util.UUID;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

import org.json.JSONException;
import org.json.JSONObject;
import org.mapdb.BTreeMap;
import org.mapdb.DB;
import org.mapdb.DB.BTreeMapMaker;
import org.mapdb.DBMaker;

import edu.nd.dronology.gstation.connector.messages.AbstractUAVMessage;
import edu.nd.dronology.gstation.connector.messages.UAVMonitoringMessage;
import edu.nd.dronology.gstation.connector.messages.UAVStateMessage;
import edu.nd.dronology.validation.safetycase.validation.MonitoringValidator;
import net.mv.logging.ILogger;
import net.mv.logging.LoggerProvider;

public class MonitoringDataHandler implements Runnable {

	private static final ILogger LOGGER = LoggerProvider.getLogger(MonitoringDataHandler.class);
	private BlockingQueue<AbstractUAVMessage> queue;
	private AtomicBoolean cont = new AtomicBoolean(true);

	public MonitoringDataHandler(final BlockingQueue<AbstractUAVMessage> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {

		while (cont.get()) {

			try {
				AbstractUAVMessage message = queue.take();
				// LOGGER.info("MONITORING MESSAGE RECEIVED"+ monitoringMesasge.toString());
				MonitoringValidator validator = UAVValidationManager.getInstance().getValidator(message.getUavid());
				if (validator != null) {
					if (message instanceof UAVMonitoringMessage) {
						validator.validate((UAVMonitoringMessage) message);
					} else {
						// TODO: merge from icse branch
						// validator.process((UAVStateMessage) message);
					}
				} else {
					// LOGGER.error("No validator found for "+ monitoringMesasge.getUavid());
				}

			} catch (Exception e) {
				LOGGER.error(e);
			}

		}
	}
}
