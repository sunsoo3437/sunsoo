package 반복문;

import java.util.Scanner;

public class 바로입력과제 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1 입력하세요 >>");
		int n1 = sc.nextInt();
		System.out.print("숫자2 입력하세요 >>");
		int n2 = sc.nextInt();
		if (n1 > n2) {
			System.out.println("첫번째 수가 두번째 수보다 더 큽니다");
		} else if (n1 < n2) {
			System.out.println("첫번째 수가 두번째 수보다 더 작습니다");
		} else {
			System.out.println("두수가 같습니다.");
		}		
		
	}
		
}
