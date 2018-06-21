package edu.nd.dronology.ui.vaadin.flightroutes.windows;

import java.rmi.RemoteException;

import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

import edu.nd.dronology.services.core.info.FlightRouteInfo;
import edu.nd.dronology.services.core.remote.IFlightManagerRemoteService;
import edu.nd.dronology.services.core.util.DronologyServiceException;
import edu.nd.dronology.ui.vaadin.connector.BaseServiceProvider;
import edu.nd.dronology.ui.vaadin.start.MyUI;

public class TakeoffAltitudeWindow extends Window {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8964991297806538682L;
	private static final String DEFAULT_ALTITUDE = "1";
	TextField txtAltitude;
	private String uavid;

	public TakeoffAltitudeWindow(String uavid) {
		this.uavid = uavid;
		setCaption("Specify Takeoff Altitude");
		setModal(true);
		VerticalLayout totalLayout = new VerticalLayout();

		Label lblAltitude = new Label("Altitude (m)");
		txtAltitude = new TextField();
		txtAltitude.setValue(DEFAULT_ALTITUDE);
		HorizontalLayout buttonLayout = new HorizontalLayout();
		Button cancelButton = new Button("Cancel");
		Button drawButton = new Button("Takeoff");
		buttonLayout.addComponents(cancelButton, drawButton);
		totalLayout.addComponents(lblAltitude, txtAltitude, buttonLayout);
		this.addStyleName("fr_add_route_layout");
		buttonLayout.addStyleName("confirm_button_area");
		drawButton.addStyleName("btn-okay");

		cancelButton.addClickListener(e -> {
			UI.getCurrent().removeWindow(this);
		});

		drawButton.addClickListener(e -> {
			performTakeoff();
			UI.getCurrent().removeWindow(this);
		});

		txtAltitude.addValueChangeListener(e -> {
			if (!isValidInput(e.getValue())) {
				txtAltitude.setValue(DEFAULT_ALTITUDE);
			}
		});

		this.setContent(totalLayout);
		this.addStyleName("confirm_window");
		this.setPosition(200, 80);
		this.setResizable(false);
		this.setClosable(false);

	}

	private boolean isValidInput(String value) {
		try {
			Double.parseDouble(value);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}

	}

	private void performTakeoff() {
		IFlightManagerRemoteService service;
		BaseServiceProvider provider = MyUI.getProvider();
		try {
			service = (IFlightManagerRemoteService) provider.getRemoteManager().getService(IFlightManagerRemoteService.class);
			service.takeoff(uavid, Double.parseDouble(txtAltitude.getValue()));

		} catch (RemoteException | DronologyServiceException e) {
			MyUI.setConnected(false);
			e.printStackTrace();
		}

	}

}
