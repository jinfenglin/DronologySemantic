package edu.nd.dronology.validation.safetycase.safety;

import java.util.List;

public interface ISafetyCase {

	List<ISACAssumption> getAssumptions();

	ISACAssumption getAssumption(String id);

}
