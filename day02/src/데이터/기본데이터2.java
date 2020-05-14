package 데이터;

public class 기본데이터2 {

	public static void main(String[] args) {
		// Alt = 생성시 단축키
		int age = 100;
		double height = 185.2;
		boolean food = true; // false /boolean - 양자택일(true false)
		char gender = '남'; // 문자
		
		//
		String name = "홍길동"; // 스트링, 문자열  → 기본데이터가 아님 
		// 원래는 String name = new String("홍길동")
		System.out.println("내 이름은 " + name);
		System.out.println("내 나이는 " + age + "세");
		System.out.println("내 키는 " + height + "cm");
		System.out.println("저녁여부 " + food );
		System.out.println("내 성별은 " + gender + "자");
		
		//ctrl + alt + ↓ = 한줄 복사
		//alt + 화살표 = 한줄 이동
	}

}
