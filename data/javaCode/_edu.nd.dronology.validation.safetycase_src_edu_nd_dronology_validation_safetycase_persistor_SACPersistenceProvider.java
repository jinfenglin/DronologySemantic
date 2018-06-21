package edu.nd.dronology.validation.safetycase.persistor;

import edu.nd.dronology.services.core.persistence.AbstractItemPersistenceProvider;
import edu.nd.dronology.validation.safetycase.safety.internal.InfrastructureSafetyCase;

/**
 * 
 * @author Michael Vierhauser
 * 
 */
public class SACPersistenceProvider extends AbstractItemPersistenceProvider<InfrastructureSafetyCase> {

	public SACPersistenceProvider() {
		super();
	}

	@Override
	protected void initPersistor() {
		PERSISTOR = new ISacXstreamPersistor();

	}

	@Override
	protected void initPersistor(String type) {
		initPersistor();
	}

	public static SACPersistenceProvider getInstance() {
		return new SACPersistenceProvider();
	}

}
