package ��Ʈ��ũ;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPSender {

	public static void main(String[] args) throws Exception {
		//��Ʈ��ũ ���� �����ϱ� ���ؼ��� class �ʿ�(��ȭ�� ������ �ϴ� Socket)
		DatagramSocket socket = new DatagramSocket();
		String str = "I am a java programmer!";
		//������ + �ּ�(ip + port)�� ������ packet!
		byte[] data = str.getBytes();
		InetAddress ip = InetAddress.getByName("127.0.0.1");
		DatagramPacket packet = new DatagramPacket(data, data.length, ip, 7000);
		socket.send(packet);
		socket.close();
	}

}
