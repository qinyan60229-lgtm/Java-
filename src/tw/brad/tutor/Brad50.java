package tw.brad.tutor;

import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Brad50 {
	// 建立 Socket → TCP 進行三方交握 → 成功建立連線 → 繼續往下執行
	public static void main(String[] args) {
		String mesg = "1234567\n7654321\nabcdefg";
		try (Socket socket = new Socket(InetAddress.getByName("10.0.100.160"),80);){
				OutputStream out = socket.getOutputStream();
//			System.out.println("OK");
			
			out.write(mesg.getBytes());
			out.flush();
			System.out.println("TCP Send success");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
