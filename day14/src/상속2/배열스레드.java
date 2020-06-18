package 상속2;

public class 배열스레드 extends Thread {
	String[] s = {"농구","축구","배구","야구","풋볼"};
	@Override
	public void run() {
		for (int i = 0; i < s.length; i++) {
			System.out.println("종목이름 : " + s[i]);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
