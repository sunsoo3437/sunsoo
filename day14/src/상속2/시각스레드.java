package ���2;

import java.util.Date;

public class �ð������� extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			//���� ���� ��¥�� �ð�
			Date date = new Date();
			System.out.println("���� : " + date);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
