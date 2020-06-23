package 네트워크;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPSender {

	public static void main(String[] args) throws Exception {
		//네트워크 연결 전송하기 위해서는 class 필요(전화기 역할을 하는 Socket)
		DatagramSocket socket = new DatagramSocket();
		String str = "I am a java programmer!";
		//데이터 + 주소(ip + port)를 가지고 packet!
		byte[] data = str.getBytes();
		InetAddress ip = InetAddress.getByName("127.0.0.1");
		DatagramPacket packet = new DatagramPacket(data, data.length, ip, 7000);
		socket.send(packet);
		socket.close();
	}

}
