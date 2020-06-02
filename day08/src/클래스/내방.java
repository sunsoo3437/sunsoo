package 클래스;

public class 내방 {

	public static void main(String[] args) {
		강아지 강1 = new 강아지();
		강아지 강2 = new 강아지();
		강1.color = "황색";
		강1.name = "메리";
		강1.bark();//함수사용! 부른다(call,메소드 콜, 호출)
		강1.shake();
		System.out.println("강1 이름은 " + 강1.name);
		System.out.println("강1 색은 " + 강1.color);
		강2.color = "검정색";
		강2.name = "하위";
		강2.bark();
		강2.shake();
		System.out.println("강2 이름은 " + 강2.name);
		System.out.println("강2 색은 " + 강2.color);
		
		나 본인 = new 나();
		본인.age = "29";
		본인.name = "강선수";
		본인.playgame();
		본인.read();
		
	}

}
