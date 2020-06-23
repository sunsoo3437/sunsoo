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

public class �޽���A extends JFrame{
	//���������� ����!!
	JTextArea list;
	JTextField input;
	DatagramSocket socket;
	
	public �޽���A() throws Exception{
		socket = new DatagramSocket(5000);
		setTitle("�޽��� A");
		list = new JTextArea(15, 40);
		input = new JTextField();
		add(list, BorderLayout.CENTER);
		add(input, BorderLayout.SOUTH);
		pack();
		list.setEditable(false);
		list.setForeground(Color.blue);
		list.setBackground(Color.cyan);
		input.setForeground(Color.black);
		input.setBackground(Color.white);
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
				list.append("A�� �Է� >> "+ str + "\n");
				
				//���濡 ������ ó��
				DatagramSocket socket;
				try {
					socket = new DatagramSocket();
					byte[] data = str.getBytes();
					InetAddress ip = InetAddress.getByName("127.0.0.1");
					DatagramPacket packet = new DatagramPacket(data, data.length, ip, 6000);
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
			list.append("B�� �Է� >> " + new String(data) + "\n");
			
		}
	}
	
	public static void main(String[] args) {
		try {
			�޽���A m = new �޽���A();
			m.process();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
