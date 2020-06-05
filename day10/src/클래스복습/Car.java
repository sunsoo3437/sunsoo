package 클래스복습;

public class Car {
	// 특징(하나의 부품에는 하나의 기능만 넣는게 좋다. - 응집도)
	// 성질 => 멤버변수, 전역변수(자동 초기화)
	String wheel; //바퀴모양, null
	int speed; //속도, 0
	
	// 객체 생성시 자동 호출되는 메소드를 만들 예정, 생성자 메소드
	// 생성자 메소드는 반환을 표기하지 않는다. 모두 다 void.
	// 생성자 메소드는 클래스 이름과 동일하게 만들어야 한다. 
	// 파라미터 있는 생성자
	public Car(String wheel, int speed) {
		super();
		this.wheel = wheel;
		this.speed = speed;
	}
	
	//동작 => 멤버메소드(함수), 입력값, 반환값유무, 매개변수
	//매개변수 = 파라미터(parameter)!!
	public void speedUp(int speed) {//speedUp(50)
		this.speed = this.speed + speed;//this = 클래스를 뜻 => 전역변수 찾음
		//void 반환 없음 / speedUp()에서 ()안이 입력값
		System.out.println(this.speed + "로 속도를 UP!");
	}
	public int nowSpeed() {
		return speed;
	}
	public void speedDown() {
		System.out.println("속도를 DOWN!");
	}
	//car 출력시 주소 대신 변수 출력으로 변경
	@Override // 오버라이드(오버라이딩) 기능을 재정의
	public String toString() {
		return "자동차 [바퀴=" + wheel + ", 속도=" + speed + "]";
	}
	
	
	
}
