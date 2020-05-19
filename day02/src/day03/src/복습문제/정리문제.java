package 복습문제;

public class 정리문제 {

	public static void main(String[] args) {
		//정수
		int hour = 7;
		
		//실수
		double min = 0.49;
		
		//문자
		char day = '화';
		
		//논리
		boolean food = true; //false
		
		//. = 접근연산자
		System.out.println("지금 시각은 " + hour +"시입니다.");
		System.out.println("지금 분은 " + min +"분입니다.");
		System.out.println("지금 요일은 " + day +"요일입니다.");
		System.out.println("식사여부는 " + food +"입니다.");
		
		//기본형 이외의 데이터, 특별하게 기본형처럼 만들어 놓은것
		String name = "강선수";
		
		/////////////////////////
		
		int num1 = 200;
		int num2 = 100;
		System.out.println(num1 == num2);
		
		String n1 = "홍길동";
		String n2 = "박길동";
		System.out.println(n1.equals(n2));
		
		if (n1.equals(n2)) {
			System.out.println("동일인이시군요!");
		} else {
			System.out.println("동일인이 아니시군요!");
		}
	}

}
