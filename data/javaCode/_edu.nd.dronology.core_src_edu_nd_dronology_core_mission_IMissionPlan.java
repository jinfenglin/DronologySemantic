package edu.nd.dronology.core.mission;

import java.io.Serializable;
import java.util.List;


@Deprecated
/** 
 * Obsolete - Replaced by MissionPlanning Implementation
 */
public interface IMissionPlan  extends Serializable{
	
	String getDescription();

	void setDescription(String description);

	void addRouteSet(RouteSet routeSet);

	void setName(String name);

	String getId();

	String getName();

	List<RouteSet> getRouteSets();


	
}
