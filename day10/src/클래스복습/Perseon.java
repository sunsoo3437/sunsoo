package 클래스복습;

public class Perseon {

	public static void main(String[] args) {
		Car car = new Car("금관모양", 150);
		// 객체 생성시 클래스이름과 동일한 메소드는 자동호출
		// 객체 생성시 반드시 해주어야하는 초기설정을 하기 위해
//		car.wheel = "금관모양";
//		car.speed = 150;
		System.out.println("현재속도 : " + car.nowSpeed());
		car.speedUp(50);
		System.out.println("up 후 현재속도 : " +car.nowSpeed());
		car.speedDown();
		System.out.println(car);
	}

}
