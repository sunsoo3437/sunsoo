package ��Ʈ��ũ;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient2 {

	public static void main(String[] args) throws Exception {
		for (int i = 1; i <= 100; i++) {
			Socket socket = new Socket("localhost", 9100);
			System.out.println("Ŭ���̾�Ʈ" + i + " : ������ ���� ����...!!!");
			
		}
	}

}
