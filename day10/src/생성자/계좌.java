package 생성자;

public class 계좌 {
	String 이름;
	String 종류;
	int money;
	
	//기본생성자(source -> superclass), 명시적!
	//파라미터 있는 생성자가 하나도 없는 경우 
	//묵시적으로 자동 생성!
	// public : 접근제어자
	// 접근제어자 : public > protected > default(X) > private
	// defalut : 같은 패키지내에서만 접근하여 사용 가능
	public 계좌() {
	}

	public 계좌(String 이름, String 종류) {
		this.이름 = 이름;
		this.종류 = 종류;
	}

	public 계좌(String 이름, String 종류, int money) {
		this.이름 = 이름;
		this.종류 = 종류;
		this.money = money;
	}
	
	
}
