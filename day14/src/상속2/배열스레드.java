package ���2;

public class �迭������ extends Thread {
	String[] s = {"��","�౸","�豸","�߱�","ǲ��"};
	@Override
	public void run() {
		for (int i = 0; i < s.length; i++) {
			System.out.println("�����̸� : " + s[i]);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
