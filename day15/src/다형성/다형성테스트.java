package 다형성;

import 상속생성자.문의게시판;
import 상속생성자.일반게시판;

public class 다형성테스트 {

	public static void main(String[] args) {
		일반게시판 q = new 문의게시판(1, "자바", "펀자바", "홍길동", "굿");
		//다형성 -> 앞에 부모가 오면 뒤에 상속받은 아무 자녀가 와도 상관없음
	}

}
