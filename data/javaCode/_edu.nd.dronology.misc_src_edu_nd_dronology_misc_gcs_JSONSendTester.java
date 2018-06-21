package edu.nd.dronology.misc.gcs;

import java.text.DateFormat;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import edu.nd.dronology.core.coordinate.LlaCoordinate;
import edu.nd.dronology.gstation.connector.messages.UAVHandshakeMessage;
import edu.nd.dronology.gstation.connector.messages.UAVMonitoringMessage;
import edu.nd.dronology.gstation.connector.messages.UAVStateMessage;

public class JSONSendTester {

	public static void main(String[] args) {
		try {
			final Gson GSON = new GsonBuilder().enableComplexMapKeySerialization().serializeNulls()
					.setDateFormat(DateFormat.LONG).setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_DASHES)
					.setVersion(1.0).serializeSpecialFloatingPointValues().create();

			UAVMonitoringMessage mm = new UAVMonitoringMessage("Drone1", "FAKE", "Drone1");

			mm.setType(UAVMonitoringMessage.MESSAGE_TYPE);
			mm.setUavid("DRONE1");
			mm.addPropery("NR_SATELITES", 5);
			mm.addPropery("GPS_BIAS", 3.125);
			mm.addPropery("CURRENT_SPEED", 5.25);

			String toSend = GSON.toJson(mm);

			UAVStateMessage sm = new UAVStateMessage("Drone1", "FAKE","Drone1");

			// sm.setType(UAVStateMessage.MESSAGE_TYPE);
			// sm.setUavid("DRONE1");
			// sm.setArmable(true);
			// sm.setArmed(true);
			// sm.setAttitude(new LlaCoordinate(1, 2, 3));
			// sm.setGroundspeed(25.3);
			// sm.setLocation(new LlaCoordinate(3, 4, 5));
			// sm.setMode(edu.nd.dronology.gstation.python.connector.messages.UAVStateMessage.DroneMode.CIRCLE);
			// sm.setStatus(DroneStatus.ACTIVE);
			// sm.setVelocity(new LlaCoordinate(5, 6, 7));
			// sm.setBatterystatus(new BatteryStatus());

			toSend = GSON.toJson(sm);

			UAVHandshakeMessage hm = new UAVHandshakeMessage("FAKE", "Drone1");
			hm.setType(UAVHandshakeMessage.MESSAGE_TYPE);
			hm.setHome(new LlaCoordinate(3, 5, 8));
			hm.addPropery("xxx", "abc");
			hm.addPropery("yyy", "more parameters...");
			toSend = GSON.toJson(hm);

			System.out.println(toSend);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
