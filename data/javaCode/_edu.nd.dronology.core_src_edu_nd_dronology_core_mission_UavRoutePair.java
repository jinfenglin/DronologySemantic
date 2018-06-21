package edu.nd.dronology.core.mission;

import java.io.Serializable;

public class UavRoutePair implements Serializable {

	/**
	 * Wrapper class for holding a route to UAV assignment 
	 * 
	 * @author Jane Cleland-Huang
	 */
	private static final long serialVersionUID = 2852859691271746076L;
	String uavid;
	String routeid;

	public UavRoutePair(String uavid, String routeid) {
		this.uavid = uavid;
		this.routeid = routeid;
	}

	public String getRouteid() {
		return routeid;
	}

	public void setRouteid(String routeid) {
		this.routeid = routeid;
	}

	public String getUavid() {
		return uavid;
	}

	public void setUavid(String uavid) {
		this.uavid = uavid;
	}

}