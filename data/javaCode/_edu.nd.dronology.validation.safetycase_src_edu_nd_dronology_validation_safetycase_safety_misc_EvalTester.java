package edu.nd.dronology.validation.safetycase.safety.misc;

import edu.nd.dronology.validation.safetycase.validation.SafetyCaseValidator;

public class EvalTester {

	
	public static void main(String[] args) {
		new SafetyCaseValidator(SafetyCaseGeneration.getUAVSafetyCase()).validate();
	}
	
}
