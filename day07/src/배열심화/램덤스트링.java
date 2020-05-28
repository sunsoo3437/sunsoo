package 배열심화;

import java.util.Random;

public class 램덤스트링 {

	public static void main(String[] args) {
		String[] food = {"치킨","피자","햄버거","짜장면","볶음밥"};
		Random r = new Random();
		int choice = r.nextInt(5);
		System.out.println("내가 아무거나 선택한 건 " + food[choice]);
	}

}
