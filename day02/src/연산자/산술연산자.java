package 연산자;

public class 산술연산자 {

	public static void main(String[] args) {
		int num1 = 200;
		int num2 = 100;
		//산술연산자(사칙연산  + 나머지연산)
		System.out.println("더한값은 " + (num1 + num2));
		System.out.println("뺀값은 " + (num1 - num2)); // "뺀값은 " + num1 - num2 오류이유 = 뺀값은 뒤에 +는 결합의 의미로 해석되면서 먼저 처리됨  
		System.out.println("곱한값은 " + (num1 * num2));
		System.out.println("나눈값은 " + (num1 / num2));
		System.out.println("나머지는 " + (num1 % num2)); // % = 나머지
	}

}
