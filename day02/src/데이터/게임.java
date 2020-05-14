package 데이터;

public class 게임 {

	public static void main(String[] args) {
		//선언의 위치가 생존의 범위
		int x = 300;
		int move = 50;
		x = x - move;
		System.out.println("움직인 x자리값 " + x);
		x = x - move;
		System.out.println("움직인 x자리값 " + x);
		
		byte age = 100;
		short book =1000;
		int no = 20000000;
		long money = 222222222222222L;
		
		double height = 180.22222222;
		float weight = 55.5555F;
	}

}
