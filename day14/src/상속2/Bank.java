package 상속2;

public class Bank {
	String location;
	//파라미터 있는 생성자가 하나도 없는 경우
	//기본 생성자가 자동으로 생성(묵시적)
	//파리미터 있는 생성자를 만들어 줄때는 기본생성자도 습관적으로 함께 명시적으로 만들어준다.
	
	public void interest() {
		System.out.println("이자를 받다.");
	}
}
