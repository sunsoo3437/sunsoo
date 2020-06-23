package 네트워크;

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

public class 메신저B extends JFrame{
	//전역변수로 선언!!
	JTextArea list;
	JTextField input;
	DatagramSocket socket;
	
	public 메신저B() throws Exception{
		socket = new DatagramSocket(6000);
		setTitle("메신저 B");
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
		Font font = new Font("고딕", Font.BOLD, 30);
		list.setFont(font);
		input.setFont(font);
		setSize(600, 500);
		input.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//입력한 값을 가지고 온다.
				String str = input.getText();
				
				//리스트에 보여지고 올려주고,
				list.append("B가 입력 >> "+ str + "\n");
				
				//상대방에 보내는 처리
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
				
				// input 초기화
				input.setText("");
			}
		});
				
		setVisible(true);
	}
	
	public void process() throws Exception {
		while (true) {
			//상대방이 보낸 텍스트를 소켓으로 받는 부분
			byte[] data = new byte[256];
			DatagramPacket packet = new DatagramPacket(data, data.length);
			socket.receive(packet);
			list.append("A가 입력 >> " + new String(data) + "\n");
			
		}
	}
	
	public static void main(String[] args) {
		try {
			메신저B m = new 메신저B();
			m.process();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
