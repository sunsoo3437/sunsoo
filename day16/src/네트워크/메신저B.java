package ��Ʈ��ũ;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class �޽���B extends JFrame{
	//���������� ����!!
	JTextArea list;
	JTextField input;
	DatagramSocket socket;
	
	public �޽���B() throws Exception{
		socket = new DatagramSocket(6000);
		setTitle("�޽��� B");
		list = new JTextArea(15, 40);
		input = new JTextField();
		add(list, BorderLayout.CENTER);
		add(input, BorderLayout.SOUTH);
		pack();
		list.setEditable(false);
		list.setForeground(Color.red);
		list.setBackground(Color.black);
		input.setForeground(Color.pink);
		input.setBackground(Color.green);
		Font font = new Font("���", Font.BOLD, 30);
		list.setFont(font);
		input.setFont(font);
		setSize(600, 500);
		input.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//�Է��� ���� ������ �´�.
				String str = input.getText();
				
				//����Ʈ�� �������� �÷��ְ�,
				list.append("B�� �Է� >> "+ str + "\n");
				
				//���濡 ������ ó��
				DatagramSocket socket;
				try {
					socket = new DatagramSocket();
					byte[] data = str.getBytes();
					InetAddress ip = InetAddress.getByName("127.0.0.1");
					DatagramPacket packet = new DatagramPacket(data, data.length, ip, 5000);
					socket.send(packet);
					socket.close();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				// input �ʱ�ȭ
				input.setText("");
			}
		});
				
		setVisible(true);
	}
	
	public void process() throws Exception {
		while (true) {
			//������ ���� �ؽ�Ʈ�� �������� �޴� �κ�
			byte[] data = new byte[256];
			DatagramPacket packet = new DatagramPacket(data, data.length);
			socket.receive(packet);
			list.append("A�� �Է� >> " + new String(data) + "\n");
			
		}
	}
	
	public static void main(String[] args) {
		try {
			�޽���B m = new �޽���B();
			m.process();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
