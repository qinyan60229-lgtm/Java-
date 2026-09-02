package tw.brad.tutor;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Brad48 {

	public static void main(String[] args) {
		String mesg = "Hello, World";
		byte[] data = mesg.getBytes();
		try (DatagramSocket socket = new DatagramSocket();){  //負責把包裹送出去的通道
			DatagramPacket packet = new DatagramPacket(  //包裹 / 封包
					data, data.length, InetAddress.getByName("10.0.100.192"), 8888);
			socket.send(packet);  //把封包送出去
			System.out.println("Send OK");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
