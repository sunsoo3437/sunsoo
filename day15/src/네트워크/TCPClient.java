package ��Ʈ��ũ;

import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) throws Exception{
		Socket socket = new Socket("localhost", 9100);
		System.out.println("Ŭ���̾�Ʈ 1: ������ ���� ����...!!!");
	}

}
