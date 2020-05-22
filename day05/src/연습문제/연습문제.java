package 연습문제;

import java.util.Scanner;

public class 연습문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iu = 0;
		int you = 0;
		int bts = 0;
		System.out.println("--------------------------");
		System.out.println("1.아이유|2.유재석|3.방탄|4.종료");
		System.out.println("--------------------------");
		while (true) {
			System.out.print("당신의 선택은 >>");
			int select = sc.nextInt();
			if (select == 1) {//아이유
				iu = iu + 1;// = iu++; // 증감연산자
			} else if (select == 2) {//유재석
				you = you + 1;
			} else if (select == 3) {//방탄
				bts = bts + 1;
			} else if (select == 4) {//종료
				System.out.println("시스템을 종료합니다.");
				//최종결과
				System.out.println("-------------------");
				System.out.println("아이유 : " + iu + "표");
				System.out.println("유재석 : " + you + "표");
				System.out.println("방탄 : " + bts + "표");
				System.exit(0);//프로그램종료!
			} else {
				System.out.println("1~4사이의 값을 선택해주세요.");
			}
			if (iu+you+bts == 5) {
				System.out.println("-------------------");
				System.out.println("아이유 : " + iu + "표");
				System.out.println("유재석 : " + you + "표");
				System.out.println("방탄 : " + bts + "표");
				System.out.println("시스템을 종료합니다.");
				break;				
			}
		}

	}

}
