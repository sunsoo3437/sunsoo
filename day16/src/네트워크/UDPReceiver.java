package 네트워크;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceiver {

	public static void main(String[] args) throws Exception {
		DatagramSocket socket = new DatagramSocket(7000);
		System.out.println("받는 쪽 소켓 시작.......");
		System.out.println("받을 준비 끝..... 기다리는 중....");
		
		byte[] data = new byte[256];
		DatagramPacket packet = new DatagramPacket(data, data.length);
		socket.receive(packet);
		System.out.println(new String(data));
		socket.close();
	}

}
