package 연습문제;

import java.util.Scanner;

public class 인기투표문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance = 10000;
		while (true) {
			System.out.println("------------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("------------------------");
			System.out.print("선택 >>");
			int select = sc.nextInt();
			if (select == 1) {//예금
				System.out.print("입금액 >> ");
				int money = sc.nextInt();
				balance = balance + money;
				System.out.println("잔고 > " + balance + "원");
			} else if (select == 2) {//출금
				System.out.print("출금액 >> ");
				int money = sc.nextInt();
				balance = balance - money;
				System.out.println("잔고 >> " + balance + "원");
			} else if (select == 3) {//잔고
				System.out.println("잔고 >> " + balance + "원");
			} else if (select == 4) {//종료
				System.out.println("시스템을 종료합니다.");
				System.exit(0);//프로그램종료!
			} else {
				System.out.println("잘못 입력하셨습니다.");
			} 
		}

	}

}
