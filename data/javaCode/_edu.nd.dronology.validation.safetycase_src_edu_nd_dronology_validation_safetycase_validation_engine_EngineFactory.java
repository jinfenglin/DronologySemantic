package edu.nd.dronology.validation.safetycase.validation.engine;

import edu.nd.dronology.validation.safetycase.validation.engine.internal.NashornEvaluationEngine;

public class EngineFactory {

	public static IEvaluationEngine getEngine() {

		return new NashornEvaluationEngine();

	}

}
