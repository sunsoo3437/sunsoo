package 생성자;

public class 은행에가자 {

	public static void main(String[] args) {
		// 생성자 오버로딩
		// 입력값 없는 생성자는 기본 생성자!
		// 파라미터 있는 생성자가 하나도 없으면, 자동생성!
//		계좌 acoount0 = new 계좌();
		// 파라미터 있는 생성자가 있는 경우,
		// 파라미터 있는 생성자로 객체가 생성될 것으로 판단
		// => 기본생성자가 생성되지 않음
		계좌 account0 = new 계좌();
		account0.이름 = "홍길적";
		account0.종류 = "예금";
		account0.money = 30000;
		계좌 account1 = new 계좌("홍길동", "적금", 10000);
		계좌 account2 = new 계좌("홍길순", "예금");
		account2.money = 20000;
	}

}
