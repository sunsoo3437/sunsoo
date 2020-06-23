package 네트워크;

import java.net.InetAddress;

public class IpTest {

	public static void main(String[] args) throws Exception {
		//127.0.0.1
		InetAddress ip = InetAddress.getByName("127.0.0.1");
		System.out.println(ip);
	}

}
