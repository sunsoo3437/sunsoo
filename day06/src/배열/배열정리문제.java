package �迭;

import java.util.Scanner;

public class �迭�������� {

	public static void main(String[] args) {
		// 1.
		int[] num1 = {10, 20, 30, 40, 50};
		System.out.println("1. " + (num1[0] + num1[1]));
		System.out.println("=====================");
		// 2.
		Scanner name = new Scanner(System.in);
		String[] program = new String[3];
		for (int i = 0; i < program.length; i++) {
			System.out.print("���α׷� �Է� >>");
			program[i] = name.next();
		}
		System.out.println("2. **" + program[0]+"���ٴ� "+program[1]+"**");
		System.out.println("=====================");
		//3.
		int[] num2 = {11,22,33,44};
		for (int i = 0; i < num2.length; i++) {
			if (num2[i] == 33) {
				System.out.println("3. "+ num2[i]+"�� "+i+"��° ��ġ�� �ִ�.");
			}
		}
		System.out.println("=====================");
		//4.
		int[] num3 = new int[5];
		for (int i = 0; i < num3.length; i++) {
			System.out.print("�� �Է�>>");
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
