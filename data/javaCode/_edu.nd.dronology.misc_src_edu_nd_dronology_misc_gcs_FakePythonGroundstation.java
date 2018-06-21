package edu.nd.dronology.misc.gcs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.DateFormat;
import java.util.Random;

import org.apache.commons.io.FileUtils;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import edu.nd.dronology.core.coordinate.LlaCoordinate;
import edu.nd.dronology.gstation.connector.messages.UAVHandshakeMessage;
import edu.nd.dronology.gstation.connector.messages.UAVMonitoringMessage;

public class FakePythonGroundstation {

	private static Socket socket;

	final static Gson GSON = new GsonBuilder().enableComplexMapKeySerialization().serializeNulls()
			.setDateFormat(DateFormat.LONG).setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_DASHES)
			.setVersion(1.0).serializeSpecialFloatingPointValues().create();

	private static String STATUS_MESSAGE;

	public static void main(String[] args) {
		try {
			int port = 1234;
			ServerSocket serverSocket = new ServerSocket(port);
			// Server is running always. This is done using this while(true) loop

			File mfile = new File("sac" + File.separator + "message.txt");
			System.out.println(mfile.getAbsolutePath());
			STATUS_MESSAGE = FileUtils.readFileToString(mfile);

			socket = serverSocket.accept();
			System.out.println("Client has connected!");
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);

			LlaCoordinate cord1 = new LlaCoordinate(41.519200, -86.239127, 0);
			LlaCoordinate cord2 = new LlaCoordinate(41.519400, -86.239527, 0);
			LlaCoordinate cord3 = new LlaCoordinate(41.519600, -86.239927, 0);

			UAVHandshakeMessage handshake = new UAVHandshakeMessage("FAKE", "Drone1");
			handshake.setHome(cord1);
			handshake.setType(UAVHandshakeMessage.MESSAGE_TYPE);
			File file = new File("sac" + File.separator + "sacjson.txt");
			System.out.println(file.getAbsolutePath());
			String sac = FileUtils.readFileToString(file);
			handshake.addPropery("safetycase", sac);

			UAVHandshakeMessage handshake2 = new UAVHandshakeMessage("FAKE",  "Drone2");
			handshake2.setHome(cord2);
			handshake2.setType(UAVHandshakeMessage.MESSAGE_TYPE);
			handshake2.addPropery("safetycase", sac);

			UAVHandshakeMessage handshake3 = new UAVHandshakeMessage("FAKE",  "Drone3");
			handshake3.setHome(cord3);
			handshake3.setType(UAVHandshakeMessage.MESSAGE_TYPE);
			handshake3.addPropery("safetycase", sac);

			String handshakeString = GSON.toJson(handshake);
			String handshakeString2 = GSON.toJson(handshake2);
			String handshakeString3 = GSON.toJson(handshake3);
			Thread.sleep(3000);
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write(handshakeString);
			bw.write("\n");
			System.out.println("Message sent to the client is " + handshakeString);
			bw.flush();

			Thread.sleep(1000);
			bw.write(handshakeString2);
			bw.write("\n");
			System.out.println("Message sent to the client is " + handshakeString2);
			bw.flush();

			Thread.sleep(1000);
			bw.write(handshakeString3);
			bw.write("\n");
			System.out.println("Message sent to the client is " + handshakeString3);
			bw.flush();

			// br.readLine();
			// bw.write("\n");
			// bw.flush();

			Thread.sleep(500);
			int run = 0;
			while (true) {
				String toSend;
				if (run % 5 == 0) {
					toSend = sendMonitoringMessage();
				} else {
					// toSend = sendStatusMessage();
					toSend = sendMonitoringMessage();
				}

				// if flying mission mlevel > 20%
				// if retunr home blvel > 10;

				// Reading the message from the client

				// String number = br.readLine();
				// System.out.println("Message received from client is " + number);

				// Multiplying the number by 2 and forming the return message
				// String returnMessage;
				// try {
				// int numberInIntFormat = Integer.parseInt(number);
				// int returnValue = numberInIntFormat * 2;
				// returnMessage = String.valueOf(returnValue) + "\n";
				// } catch (NumberFormatException e) {
				// // Input was not a number. Sending proper message back to client.
				// returnMessage = "Please send a proper number\n";
				// }

				// Sending the response back to the client.
				// OutputStream os = socket.getOutputStream();
				// OutputStreamWriter osw = new OutputStreamWriter(os);
				// BufferedWriter bw = new BufferedWriter(osw);
				bw.write(toSend);
				bw.write("\n");
				System.out.println("Message sent to the client is " + toSend);
				bw.flush();
				run++;
				Thread.sleep(1000);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static String sendStatusMessage() {

		return STATUS_MESSAGE;
	}

	private static String sendMonitoringMessage() {
		UAVMonitoringMessage mm = new UAVMonitoringMessage("Drone1","FAKE",  "Drone1");
		Random rand = new Random();
		mm.setType(UAVMonitoringMessage.MESSAGE_TYPE);
		// mm.setuavid("DRONE1");

		mm.addPropery("longitude", "23");
		mm.addPropery("velocity", "80");
		mm.addPropery("altitude", "50");
		mm.addPropery("battery_remaining_percentage", rand.nextInt(10) + 1);
		mm.addPropery("gps_bias", "1");
		// mm.addPropery("max_velocity", "60");
		String toSend = GSON.toJson(mm);
		return toSend;
	}

}