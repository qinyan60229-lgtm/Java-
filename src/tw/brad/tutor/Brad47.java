package tw.brad.tutor;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Brad47 {

	public static void main(String[] args) {
		try {				//幫我查 localhost 對應的 IP 是多少
			InetAddress ip = InetAddress.getByName("localhost");  //網路上的主機/IP 位址
			System.out.println(ip.getHostName() + " : " + ip.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
