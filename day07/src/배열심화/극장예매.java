package 배열심화;

import java.util.Scanner;

public class 극장예매 {

	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		int[] seat = new int[10];
		int count = 0;
		//배열은 자동 초기화, int => 0으로 초기화
		//예매가 되는 자리는 1로 변경
		
		while (true) {
			System.out.println("---------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print((i + 1) + " ");
			}
			System.out.println();
			System.out.println("---------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + " ");
			}
			System.out.println();
			System.out.print("예매할 좌석번호 입력(종료 = -1)>>");
			int number = name.nextInt();
			if (number == -1) {
				System.out.println("시스템을 종료합니다.");
				System.out.println("예매 수는 " + count +"자리입니다.");
				System.out.println("금액은 " +(count*10000) + "원입니다.");
				System.out.println("결재해주세요.");
				break;
			}
			if (seat[number-1] == 0) {
				seat[number-1] = 1;
				System.out.println("예매 완료");
				count++;
			} else if (seat[number-1] == 1) {
				System.out.println("이미 예매된 자리입니다.");
			} 
		}
	}

}
