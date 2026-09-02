package tw.brad.tutor;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Brad47 {

	public static void main(String[] args) {
		try {
			InetAddress ip = InetAddress.getByName("localhost");
			System.out.println(ip.getHostName() + " : " + ip.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
