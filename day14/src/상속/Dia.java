package ���;

public class Dia extends Thread{
	
	@Override
	public void run() {
		//������ ó���ϰ� ���� �κδ� �ڵ�
		for (int i = 0; i < 100; i++) {
			System.out.println("��");
		}
	}
}
