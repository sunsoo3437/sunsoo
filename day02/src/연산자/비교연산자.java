package 연산자;

public class 비교연산자 {

	public static void main(String[] args) {
		int num1 = 200;
		int num2 = 100;
		
		//비교연산자 = 결과는 무조건 논리형(boolean, true or false)!!!!!!
		System.out.println(num1 == num2); // 동일 여부(같은지)
		System.out.println(num1 != num2); // 동일 여부(다른지)
		System.out.println(num1 > num2); // 크기 여부 (초과)
		System.out.println(num1 >= num2); // 크기 여부 (이상)
		
		int money = 10000;
		if (money >= 15000) {//true
			System.out.println("감사합니다.");
		} else {//false
			System.out.println("조금만 더 주세요 ㅠㅠ");
		}
		
	}

}
