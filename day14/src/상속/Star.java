package ���;

public class Star extends Thread{
	
	@Override
	public void run() {
		//������ ó���ϰ� ���� �κ��� �ڵ�
		for (int i = 0; i < 100; i++) {
			System.out.println("��");
		}
	}
}
