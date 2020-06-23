package 형변환;

public class 좋은코드 {

	public static void main(String[] args) {
		//클래스를 사용할 때는 결합도를 낮추는 코드를 해야한다.
		Tire tire1 = new 한국타이어();
		Tire tire2 = new 금호타이어();
		//클래스의 다형성, 상속관계만 가능
		//업캐스팅(자동형변환)
		tire1.타이어를끼다();
		tire2.타이어를끼다();
	}

}
