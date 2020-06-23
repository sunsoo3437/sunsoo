package 상속생성자;

public class Parent {
	void tv() {
		System.out.println("tv를 보다");
	}
	
	//오버라이드 불가 메소드
	final void play() {
		System.out.println("등산하다.");
	}
}
