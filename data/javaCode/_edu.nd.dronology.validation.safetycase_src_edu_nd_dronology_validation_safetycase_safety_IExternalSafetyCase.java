package edu.nd.dronology.validation.safetycase.safety;

import java.util.List;

import edu.nd.dronology.validation.safetycase.safety.internal.Assumption;

public interface IExternalSafetyCase extends ISafetyCase {

	void addAssumption(Assumption ass);

	List<ISACAssumption> getStaticEvaluateableAssumptions();

	List<ISACAssumption> getPluggableAssumptions();

	String getUAVId();

	List<String> getStaticParameters();

	List<String> getMonitorableParameters();

}
