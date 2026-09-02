package tw.brad.tutor;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Brad48 {

	public static void main(String[] args) {
		String mesg = "Hello, World";
		byte[] data = mesg.getBytes();
		try (DatagramSocket socket = new DatagramSocket();){
			DatagramPacket packet = new DatagramPacket(
					data, data.length, InetAddress.getByName("10.0.100.192"), 8888);
			socket.send(packet);
			System.out.println("Send OK");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
