package ��Ʈ��ũ;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

class TCPServer {

	public static void main(String[] args) throws Exception {
		//���ο� ������ �ʿ�
		//��Ʈ��ũ�� ���� �ܺο����� ������ ����ó��!
		//��Ʈ�� �������� ������, 5�ڸ��� ������ ��Ʈ�� ���� ����
		ServerSocket server = new ServerSocket(9100);
		System.out.println("TCP���� ���� ���۵�..");
		System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ��� ��....");
		
		int count = 0;
		while (true) {
			//������ ���޿� ������ �ʿ�
			Socket socket = server.accept();
			count++;
			System.out.println(count + "���� Ŭ���̾�Ʈ�� ���� ����...!!");
		}
				

	}

}
