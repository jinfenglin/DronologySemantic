package edu.nd.dronology.validation.safetycase.monitoring;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import edu.nd.dronology.gstation.connector.messages.AbstractUAVMessage;
import edu.nd.dronology.gstation.connector.messages.UAVMonitoringMessage;
import edu.nd.dronology.gstation.connector.messages.UAVStateMessage;
import edu.nd.dronology.util.NamedThreadFactory;
import edu.nd.dronology.validation.safetycase.validation.MonitoringValidator;
import net.mv.logging.ILogger;
import net.mv.logging.LoggerProvider;

public class UAVValidationManager {

	private static final ILogger LOGGER = LoggerProvider.getLogger(UAVValidationManager.class);

	private static volatile UAVValidationManager INSTANCE;
	private static final BlockingQueue<AbstractUAVMessage> queue = new ArrayBlockingQueue<>(500);

	private static final int NUM_THREADS = 5;

	private static final ExecutorService SERVICE_EXECUTOR = Executors.newFixedThreadPool(NUM_THREADS,
			new NamedThreadFactory("Validator-Threads"));

	private final Map<String, MonitoringValidator> validators = new ConcurrentHashMap<>();

	public UAVValidationManager() {

		SERVICE_EXECUTOR.submit(new MonitoringDataHandler(queue));
		SERVICE_EXECUTOR.submit(new MonitoringFrequencyAdaptor());
	}

	/**
	 * 
	 * @return The singleton instance.
	 */
	public static UAVValidationManager getInstance() {

		if (INSTANCE == null) {
			synchronized (UAVValidationManager.class) {
				if (INSTANCE == null) {
					INSTANCE = new UAVValidationManager();
				}
			}
		}
		return INSTANCE;
	}

	public void notifyMonitoringMessage(UAVMonitoringMessage message) {
		boolean taken = queue.offer(message);
		if (!taken) {
			LOGGER.error("Monitoring queue full!");
		}

	}

	public void registerValidator(MonitoringValidator monitoringValidator) {
		LOGGER.info("Registering new Monitoring Validator '" + monitoringValidator.getUavId() + "'");
		validators.put(monitoringValidator.getUavId(), monitoringValidator);

	}

	public MonitoringValidator getValidator(String uavid) {
		return validators.get(uavid);
	}

	public Collection<MonitoringValidator> getValidators() {
		return Collections.unmodifiableCollection(validators.values());

	}

	public void notifyStatusMessage(UAVStateMessage message) {
		boolean taken = queue.offer(message);
		if (!taken) {
			LOGGER.error("Monitoring queue full!");
		}

	}

}