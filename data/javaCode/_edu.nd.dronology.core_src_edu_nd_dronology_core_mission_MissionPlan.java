package edu.nd.dronology.core.mission;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/**
 * 
 *Obsolte 
 *
 */
@Deprecated
public class MissionPlan implements IMissionPlan {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5704550391713503487L;
	private String name;
	private String id;
	private boolean synchronizedRoutes = false;
	private List<RouteSet> routeSets = new ArrayList<>();

	public MissionPlan() {
		id = UUID.randomUUID().toString();
		name = id;
	}

	@Override
	public void setName(String name) {
		this.name = name;

	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDescription(String description) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addRouteSet(RouteSet routeSet) {
		routeSets.add(routeSet);
	}

	

	

	@Override
	public List<RouteSet> getRouteSets() {
		return Collections.unmodifiableList(routeSets);
	}

}
