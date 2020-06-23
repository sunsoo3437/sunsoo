package 상속생성자;

public class 마우스사용 {

	public static void main(String[] args) {
		게임마우스 mouse = new 게임마우스("검정", "로지텍", 100000, 1.5);
		System.out.println(mouse);
	}

}
