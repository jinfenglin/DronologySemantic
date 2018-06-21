package edu.nd.dronology.ui.vaadin.connector;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.vaadin.server.Sizeable.Unit;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

import edu.nd.dronology.core.util.Waypoint;
import edu.nd.dronology.services.core.info.FlightRouteInfo;
import edu.nd.dronology.services.core.remote.IDroneSetupRemoteService;
import edu.nd.dronology.services.core.remote.IFlightManagerRemoteService;
import edu.nd.dronology.ui.vaadin.activeflights.AFAssignRouteComponent;
import edu.nd.dronology.ui.vaadin.activeflights.UAVStatusWrapper;
import edu.nd.dronology.ui.vaadin.start.MyUI;

public class DronologyActionExecutor {

	/**
	 * Assigns a flight route to the drone
	 * 
	 * @param remoteItem
	 */
	public static void activate(FlightRouteInfo remoteItem, UAVStatusWrapper uavStatus) {
		IFlightManagerRemoteService service;
		try {
			BaseServiceProvider provider = MyUI.getProvider();

			service = (IFlightManagerRemoteService) provider.getRemoteManager()
					.getService(IFlightManagerRemoteService.class);
			List<Waypoint> coordds = new ArrayList<>(remoteItem.getWaypoints());
			service.planFlight(uavStatus.getName(), remoteItem.getName(), coordds);
		} catch (Exception e) {
			MyUI.setConnected(false);
			e.printStackTrace();
		}
	}

	public static void returnHome(Window parent, UAVStatusWrapper uavStatus) {
		if (uavStatus.getStatus().equals("ON_GROUND")) {
			Notification.show(uavStatus.getStatus() + " is already home.");
			return;
		}
		Window confirm = new Window("Confirm");
		VerticalLayout subContent = new VerticalLayout();
		HorizontalLayout subButtons = new HorizontalLayout();
		Label label = new Label("Are you sure you want to send " + uavStatus.getName() + " to its home?");
		Button yes = new Button("Yes");
		Button no = new Button("No");

		yes.addClickListener(subEvent -> {
			UI.getCurrent().removeWindow(confirm);
			if (parent != null) {
				UI.getCurrent().removeWindow(parent);
			}
			IFlightManagerRemoteService service;
			try {
				BaseServiceProvider provider = MyUI.getProvider();
				service = (IFlightManagerRemoteService) provider.getRemoteManager()
						.getService(IFlightManagerRemoteService.class);
				service.returnToHome(uavStatus.getName());
			} catch (Exception exc) {
				MyUI.setConnected(false);
				exc.printStackTrace();
			}

		});

		no.addClickListener(subEvent -> {
			UI.getCurrent().removeWindow(confirm);
		});

		subButtons.addComponents(yes, no);
		subContent.addComponents(label, subButtons);
		confirm.setContent(subContent);
		confirm.setModal(true);
		confirm.center();
		UI.getCurrent().addWindow(confirm);
	}

	public static void assignRouteToUAV(UAVStatusWrapper uavStatus) {
		Window window = new Window("Assign New Route");

		AFAssignRouteComponent content = new AFAssignRouteComponent(uavStatus);
		content.createContents();
		content.getCancel().addClickListener(event -> {
			UI.getCurrent().removeWindow(window);
		});

		content.getApply().addClickListener(event -> {
			Collection<FlightRouteInfo> routesToAssign = content.getRoutesToAssign();
			if (routesToAssign.size() < 1) {
				return;
			} 
			Window confirm = new Window("Confirm");
			VerticalLayout subContent = new VerticalLayout();
			HorizontalLayout subButtons = new HorizontalLayout();
			String routeNames = "";
			Label label = new Label();
			for (FlightRouteInfo e : routesToAssign) {
				if (routesToAssign.size() == 0) {
					label.setValue("Are you sure you want unassign all flight routes for " + uavStatus.getName() + "?");
				} else if (routesToAssign.size() == 1) {
					routeNames = e.getName();
					label.setValue("Are you sure you want " + uavStatus.getName() + " to follow the route " + routeNames
							+ "?");
				} else {
					routeNames = routeNames + e.getName() + ", ";
				}
			}
			if (routesToAssign.size() > 1) {
				routeNames = routeNames.substring(0, routeNames.length() - 2);
				label.setValue(
						"Are you sure you want " + uavStatus.getName() + " to follow the routes " + routeNames + "?");
			}

			Button yes = new Button("Yes");
			Button no = new Button("No");
			subButtons.addComponents(yes, no);
			subContent.addComponents(label, subButtons);
			confirm.setContent(subContent);
			confirm.setModal(true);
			confirm.center();
			UI.getCurrent().addWindow(confirm);

			no.addClickListener(subEvent -> {
				UI.getCurrent().removeWindow(confirm);
			});

			yes.addClickListener(subEvent -> { // assign the flight routes to the UAV
				IFlightManagerRemoteService service;
				BaseServiceProvider provider = MyUI.getProvider();
				try {

					service = (IFlightManagerRemoteService) provider.getRemoteManager()
							.getService(IFlightManagerRemoteService.class);

				} catch (Exception e) {
					MyUI.setConnected(false);
					e.printStackTrace();
				}
				try {
					service = (IFlightManagerRemoteService) provider.getRemoteManager()
							.getService(IFlightManagerRemoteService.class);
					service.cancelPendingFlights(uavStatus.getName());
				} catch (Exception e1) {
					MyUI.setConnected(false);
					e1.printStackTrace();
				}

				for (FlightRouteInfo e : routesToAssign) {
					DronologyActionExecutor.activate(e, uavStatus);
				}

				UI.getCurrent().removeWindow(confirm);
				UI.getCurrent().removeWindow(window);
			});
		});

		// TODO fix hover in place
		// content.getHover().addValueChangeListener(e -> {
		// if (content.getHover().getValue()) {
		// this.setHoverInPlace(true);
		// } else {
		// this.setHoverInPlace(false);
		// }
		// });

		content.getReturnToHome().addClickListener(e -> {
			DronologyActionExecutor.returnHome(window, uavStatus);
		});

		window.setContent(content);
		window.setModal(true);
		window.setWidth(1496, Unit.PIXELS);
		UI.getCurrent().addWindow(window);

	}

	public static void resendCommand(UAVStatusWrapper uavStatus) {
		IDroneSetupRemoteService service;
		try {
			BaseServiceProvider provider = MyUI.getProvider();

			service = (IDroneSetupRemoteService) provider.getRemoteManager().getService(IDroneSetupRemoteService.class);
			service.resendCommand(uavStatus.getName());
		} catch (Exception e) {
			MyUI.setConnected(false);
			e.printStackTrace();
		}

	}
}