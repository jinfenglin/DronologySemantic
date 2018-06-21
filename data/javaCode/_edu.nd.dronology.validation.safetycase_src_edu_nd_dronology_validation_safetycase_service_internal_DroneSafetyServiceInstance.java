package edu.nd.dronology.validation.safetycase.service.internal;

import java.rmi.RemoteException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import edu.nd.dronology.core.util.FormatUtil;
import edu.nd.dronology.services.core.base.AbstractServiceInstance;
import edu.nd.dronology.services.core.util.DronologyServiceException;
import edu.nd.dronology.validation.safetycase.monitoring.UAVValidationInformation;
import edu.nd.dronology.validation.safetycase.monitoring.ValidationResultManager;
import edu.nd.dronology.validation.safetycase.safety.internal.UAVSaeftyCase;
import edu.nd.dronology.validation.safetycase.service.DroneSafetyService;
import edu.nd.dronology.validation.safetycase.service.IMonitoringValidationListener;
import edu.nd.dronology.validation.safetycase.trust.TrustManager;
import edu.nd.dronology.validation.safetycase.validation.SafetyCaseValidator;
import edu.nd.dronology.validation.safetycase.validation.ValidationEntry;
import edu.nd.dronology.validation.safetycase.validation.ValidationResult;
import net.mv.logging.ILogger;
import net.mv.logging.LoggerProvider;

public class DroneSafetyServiceInstance extends AbstractServiceInstance implements IDroneSafetyServiceInstance {

	private static final ILogger LOGGER = LoggerProvider.getLogger(DroneSafetyServiceInstance.class);

	static final transient Gson GSON = new GsonBuilder().enableComplexMapKeySerialization().serializeNulls()
			.setDateFormat(DateFormat.LONG).setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_DASHES)
			.setVersion(1.0).serializeSpecialFloatingPointValues().create();

	private List<IMonitoringValidationListener> listeners = Collections.synchronizedList(new ArrayList<>());

	public DroneSafetyServiceInstance() {
		super("DRONESAFETY");
	}

	@Override
	protected Class<?> getServiceClass() {
		return DroneSafetyService.class;
	}

	@Override
	protected int getOrder() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	protected String getPropertyPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void doStartService() throws Exception {

	}

	@Override
	protected void doStopService() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public ValidationResult validateUAVSafetyCase(String uavid, String safetycase) throws DronologyServiceException {

		UAVSaeftyCase safetyCase = GSON.fromJson(safetycase, UAVSaeftyCase.class);
		return new SafetyCaseValidator(safetyCase).validate();

	}

	@Override
	public void addValidationListener(IMonitoringValidationListener listener) {
		listeners.add(listener);

	}

	@Override
	public void removeValidationListener(IMonitoringValidationListener listener) {
		listeners.remove(listener);

	}

	@Override
	public Collection<UAVValidationInformation> getValidationInfo() {
		return ValidationResultManager.getInstance().getValidationInfos();
	}

	@Override
	public UAVValidationInformation getValidationInfo(String uavid) throws DronologyServiceException {
		return ValidationResultManager.getInstance().getValidationInfos(uavid);
	}

	@Override
	public void notifyValidationListeners(String uavid, ValidationEntry validationResult) {
		// TODO: move to toString of ValidationEntry..
		StringBuilder sb = new StringBuilder();
		sb.append(FormatUtil.formatTimestamp(validationResult.geTimestamp()));
		sb.append(" - ");
		sb.append(uavid + "-" + validationResult.getAssumptionid());
		sb.append(" : " + validationResult.getResult().toString());

		for (IMonitoringValidationListener l : listeners) {
			try {
				l.constraintEvaluated(uavid, validationResult.getAssumptionid(), validationResult.getWeight(), sb.toString(),
						validationResult.getResult());
			} catch (RemoteException e) {
				LOGGER.error(e);
				listeners.remove(l);
			}
		}

	}

}
