package ���������;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class �ڵ������ְ���2 extends JFrame{
	
	public �ڵ������ְ���2() {
		setTitle("�ڵ������ְ���");
		setSize(1500, 370);
		//������ ������ ��ü ���� start
		MyThread car1 = new MyThread("�ڵ���1", 10, 0);
		MyThread car2 = new MyThread("�ڵ���2", 10, 50);
		MyThread car3 = new MyThread("�ڵ���3", 10, 100);
		MyThread car4 = new MyThread("�ڵ���4", 10, 150);
		MyThread car5 = new MyThread("�ڵ���5", 10, 200);
		MyThread car6 = new MyThread("�ڵ���6", 10, 250);
		car1.start();
		car2.start();
		car3.start();
		car4.start();
		car5.start();
		car6.start();
		setLayout(null);
		getContentPane().setBackground(Color.yellow);
		setVisible(true);
	}
	
	public class MyThread extends Thread{
		int x, y;
//		ImageIcon icon;
		JLabel label;
		
		public MyThread(String file, int x, int y) {
			this.x = x;
			this.y = y;
//			icon = new ImageIcon(file);
			label = new JLabel(file);
			label.setBounds(x, y, 100, 100);
			add(label);
		}
		
		@Override
		public void run() {
			for (int i = 0; i < 300; i++) {
				//0~0.99999
				x += 10 * Math.random();
//				System.out.println("����� x�� ��ǥ");
				label.setBounds(x, y, 100, 100);
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		new �ڵ������ְ���2();//�͸�Ŭ����
	}

}
