package �׷���;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class �׷��Ƚ����� extends JFrame{
	JLabel l1, l2, l3; //��������
	
	public �׷��Ƚ�����() { //static x
		setTitle("������ ���α׷���");
		l1 = new JLabel("1");
		l2 = new JLabel();
		l3 = new JLabel("3");
		
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		add(l1);
		add(l2);
		add(l3);
		
		Font font = new Font("����",Font.BOLD	,50);
		l1.setFont(font);
		l3.setFont(font);
		
		setSize(1000, 400);
		
		ī���� counter = new ī����();
		�ð� time = new �ð�();
		�迭 array = new �迭();
		counter.start();
		time.start();
		array.start();
		
		getContentPane().setBackground(Color.green);

		ImageIcon icon = new ImageIcon("3.png");
		l2.setIcon(icon);
		
		setVisible(true);
	}
	
	public class ī���� extends Thread {
		@Override
		public void run() {
			for (int i = 500; i >= 0; i--) {
				l1.setText("ī���� : " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public class �ð� extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 500; i++) {
				//���� ���� ��¥�� �ð�
				Date date = new Date();
				l3.setText("���� : " + date);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public class �迭 extends Thread {
		String[] s = {"1.png","2.png","3.png","4.png","5.png"};
		@Override
		public void run() {
			for (int i = 0; i < s.length; i++) {
				ImageIcon icon = new ImageIcon(s[i]);
				l2.setIcon(icon);
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		�׷��Ƚ����� name = new �׷��Ƚ�����();

	}

}
