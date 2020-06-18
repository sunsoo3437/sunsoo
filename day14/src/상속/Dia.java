package 상속;

public class Dia extends Thread{
	
	@Override
	public void run() {
		//스레드 처리하고 싶은 부부늘 코딩
		for (int i = 0; i < 100; i++) {
			System.out.println("◆");
		}
	}
}
