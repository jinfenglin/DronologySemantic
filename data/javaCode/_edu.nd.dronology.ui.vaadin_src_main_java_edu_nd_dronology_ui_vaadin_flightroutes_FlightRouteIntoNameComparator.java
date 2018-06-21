package edu.nd.dronology.ui.vaadin.flightroutes;

import java.util.Comparator;

import edu.nd.dronology.services.core.info.FlightRouteInfo;

public class FlightRouteIntoNameComparator implements Comparator<FlightRouteInfo> {

	@Override
	public int compare(FlightRouteInfo o1, FlightRouteInfo o2) {
		return o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase());
	}

}
