package 클래스;

public class 강아지 {
	// 강아지 => 클래스
	// - 색, 이름 
    // => 멤버변수, 선언의 위치가 변수의 생존범위(전역변수, global)
	String color;
	String name;
	
	// - 짖다, 꼬리를 흔달다 
	// => 멤버메소드(함수) → 확인할 것이 많다
	public void bark() {
		System.out.println("강아지가 짖다.");
	}
	public void shake() {
		System.out.println("꼬리를 흔들다.");
	}
}
