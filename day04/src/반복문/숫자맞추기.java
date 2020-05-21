package 반복문;

import java.util.Random;

import javax.swing.JOptionPane;

public class 숫자맞추기 {

	public static void main(String[] args) {
		//아무값이나 만들어주는 부품을 써보자!
		Random r = new Random();
		int target = r.nextInt(100);
		int count = 0;
		while(true) {
			String data = JOptionPane.showInputDialog("숫자입력");
			int guess = Integer.parseInt(data); // string의 숫자를 int로
			count++;
			if (target == guess) {
				System.out.println("정답입니다.");
				System.out.println("당신의 시도 횟수는 " + count + "회");
				System.out.println("시스템을 종료합니다.");
				break;
			} else {
				System.out.println("정답이 아닙니다.");
				//입력값이 정답보다 큰지 작은지 힌트를 주세요!
				if (target < guess) {
					System.out.println("정답이 입력값보다 더 작습니다");
				} else {
					System.out.println("정답이 입력값보다 더 큽니다");
				}
			}
		}
	}

}
