package 배열;

import java.util.Scanner;

public class 배열정리문제 {

	public static void main(String[] args) {
		// 1.
		int[] num1 = {10, 20, 30, 40, 50};
		System.out.println("1. " + (num1[0] + num1[1]));
		System.out.println("=====================");
		// 2.
		Scanner name = new Scanner(System.in);
		String[] program = new String[3];
		for (int i = 0; i < program.length; i++) {
			System.out.print("프로그램 입력 >>");
			program[i] = name.next();
		}
		System.out.println("2. **" + program[0]+"보다는 "+program[1]+"**");
		System.out.println("=====================");
		//3.
		int[] num2 = {11,22,33,44};
		for (int i = 0; i < num2.length; i++) {
			if (num2[i] == 33) {
				System.out.println("3. "+ num2[i]+"는 "+i+"번째 위치에 있다.");
			}
		}
		System.out.println("=====================");
		//4.
		int[] num3 = new int[5];
		for (int i = 0; i < num3.length; i++) {
			System.out.print("값 입력>>");
			num3[i] = name.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < num3.length; i++) {
			sum = sum +num3[i];
			//System.out.print(num3[i] + " ");
		}
		System.out.println("4. "+sum);
		for (int i : num3) {
			System.out.print(i + " ");
		}

	}

}
