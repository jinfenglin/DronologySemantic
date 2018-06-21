package edu.nd.dronology.ui.vaadin.utils;

import java.nio.file.Paths;

import com.vaadin.server.FileResource;
import com.vaadin.server.Resource;
import com.vaadin.server.VaadinService;
import com.vaadin.ui.Image;

/**
 * 
 * The {@link ImageProvider} is used for creating and providing images to
 * various different windows and views.
 * 
 * @author Michael Vierhauser
 *
 * 
 *
 *
 */
public class ImageProvider {

	private static final String BASE_PATH = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();

	private static final FileResource DEFAULT_UAV_IMAGE = new FileResource(
			Paths.get(BASE_PATH, "VAADIN", "img", "drone_icon.png").toFile());

	private static final FileResource FOCUS_UAV_IMAGE = new FileResource(
			Paths.get(BASE_PATH, "VAADIN", "img", "drone_icon_focused.png").toFile());

	private static final FileResource SELECTED_UAV_IMAGE = new FileResource(
			Paths.get(BASE_PATH, "VAADIN", "img", "drone_icon_selected.png").toFile());

	private static final FileResource DOT_ICON = new FileResource(
			Paths.get(BASE_PATH, "VAADIN", "img", "dot.png").toFile());

	// Active Flight View

	private static final FileResource TAKEOFF_IMAGE = new FileResource(
			Paths.get(BASE_PATH, "VAADIN", "img", "takeoff.png").toFile());

	private static final FileResource RTL_IMAGE = new FileResource(
			Paths.get(BASE_PATH, "VAADIN", "img", "rtl.png").toFile());

	private static final FileResource ASSIGN_ROUTE_IMAGE = new FileResource(
			Paths.get(BASE_PATH, "VAADIN", "img", "assign_route.png").toFile());

	private static final FileResource STATUS_OK_IMAGE = new FileResource(
			Paths.get(BASE_PATH, "VAADIN", "img", "status_ok.png").toFile());

	private static final Resource STATUS_USERCONTROLLED_IMAGE = new FileResource(
			Paths.get(BASE_PATH, "VAADIN", "img", "status_user_controlled.png").toFile());

	private static final Resource RESEND_COMMAND_IMAGE = new FileResource(
			Paths.get(BASE_PATH, "VAADIN", "img", "resend_command.png").toFile());

	/**
	 * 
	 * @return The default UAV icon.
	 */
	public static Image getDefaultUAVImage() {
		Image image = new Image();
		image.setSource(DEFAULT_UAV_IMAGE);
		return image;
	}

	/**
	 * 
	 * @return The icon when a UAV is in focus.
	 */
	public static Image getFocusUAVImage() {
		Image image = new Image();
		image.setSource(FOCUS_UAV_IMAGE);
		return image;
	}

	/**
	 * 
	 * @return The icon when a UAV is in selected.
	 */
	public static Image getSelectedUAVImage() {
		Image image = new Image();
		image.setSource(SELECTED_UAV_IMAGE);
		return image;
	}

	/**
	 * 
	 * @return The Waypoint dot.
	 */
	public static Image getDotIcon() {
		Image image = new Image();
		image.setSource(DOT_ICON);
		return image;
	}

	public static Resource getDotIconResource() {
		return DOT_ICON;
	}

	public static Resource getFocusUAVResource() {
		return SELECTED_UAV_IMAGE;
	}

	public static Resource getDefaultUAVResource() {
		return DEFAULT_UAV_IMAGE;
	}

	public static Resource getSelectedUAVResource() {
		return SELECTED_UAV_IMAGE;
	}

	public static Resource getTaekoffResource() {
		return TAKEOFF_IMAGE;
	}

	public static Resource getRTLResource() {
		return RTL_IMAGE;
	}

	public static Resource getAssignRouteResource() {
		return ASSIGN_ROUTE_IMAGE;
	}

	public static Resource getStatusOKResource() {
		return STATUS_OK_IMAGE;
	}

	public static Resource getStatusUsercontrolledResource() {
		return STATUS_USERCONTROLLED_IMAGE;
	}

	public static Resource getResendCommandResource() {
		return RESEND_COMMAND_IMAGE;
	}

}
