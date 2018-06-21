package edu.nd.dronology.core.mission;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * Contains a List of {@link UavRoutePair} holding route->UAV mappings.
 * 
 * @author Jane Cleland-Huang
 *
 */
public class RouteSet implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1006883164987214757L;
	private List<UavRoutePair> uav2routeMapping = new ArrayList<>();
	private int executionDelay;

	public int getExecutionDelay() {
		return executionDelay;
	}

	public void addPan(String uavid, String routeid) {
		uav2routeMapping.add(new UavRoutePair(uavid, routeid));
	}

	public void setExecutionDelay(int executionDelay) {
		this.executionDelay = executionDelay;
	}

	public List<UavRoutePair> getUav2routeMappings() {
		return Collections.unmodifiableList(uav2routeMapping);
	}

}