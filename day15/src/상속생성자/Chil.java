package 상속생성자;

public final class Chil extends Parent {
	//종단 클래스
	@Override
	void tv() {
		System.out.println("무한도전을 보다.");
	}
	
	//상속 안함.
	void together() {
		tv(); // 나는 tv를 보다.
		super.tv();//부모님이 tv를 보다.
	}
	
}
