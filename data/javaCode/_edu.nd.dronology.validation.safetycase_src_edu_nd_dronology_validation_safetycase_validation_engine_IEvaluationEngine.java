package edu.nd.dronology.validation.safetycase.validation.engine;

public interface IEvaluationEngine {

	Object createFunction(String functionString) throws EvaluationEngineException;

	Object evaluateFunction(String callString)throws EvaluationEngineException; 

}
