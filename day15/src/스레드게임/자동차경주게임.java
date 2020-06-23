package 스레드게임;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 자동차경주게임 extends JFrame{
	
	public 자동차경주게임() {
		setTitle("자동차경주게임");
		setSize(600, 370);
		//세개의 스레드 객체 만들어서 start
		MyThread car1 = new MyThread("car1.gif", 10, 0);
		MyThread car2 = new MyThread("car2.gif", 10, 50);
		MyThread car3 = new MyThread("car3.gif", 10, 100);
		MyThread car4 = new MyThread("car1.gif", 10, 150);
		MyThread car5 = new MyThread("car2.gif", 10, 200);
		MyThread car6 = new MyThread("car3.gif", 10, 250);
		car1.start();
		car2.start();
		car3.start();
		car4.start();
		car5.start();
		car6.start();
		setLayout(null);
		setVisible(true);
	}
	
	public class MyThread extends Thread{
		int x, y;
		ImageIcon icon;
		JLabel label;
		
		public MyThread(String file, int x, int y) {
			this.x = x;
			this.y = y;
			icon = new ImageIcon(file);
			label = new JLabel(icon);
			label.setBounds(x, y, 100, 100);
			add(label);
		}
		
		@Override
		public void run() {
			for (int i = 0; i < 400; i++) {
				//0~0.99999
				x += 10 * Math.random();
//				System.out.println("변경된 x축 좌표");
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
		new 자동차경주게임();//익명클래스
	}

}
