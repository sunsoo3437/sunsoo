package �迭��ȭ;

import java.util.Scanner;

public class ���忹�� {

	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		int[] seat = new int[10];
		int count = 0;
		//�迭�� �ڵ� �ʱ�ȭ, int => 0���� �ʱ�ȭ
		//���Ű� �Ǵ� �ڸ��� 1�� ����
		
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
			System.out.print("������ �¼���ȣ �Է�(���� = -1)>>");
			int number = name.nextInt();
			if (number == -1) {
				System.out.println("�ý����� �����մϴ�.");
				System.out.println("���� ���� " + count +"�ڸ��Դϴ�.");
				System.out.println("�ݾ��� " +(count*10000) + "���Դϴ�.");
				System.out.println("�������ּ���.");
				break;
			}
			if (seat[number-1] == 0) {
				seat[number-1] = 1;
				System.out.println("���� �Ϸ�");
				count++;
			} else if (seat[number-1] == 1) {
				System.out.println("�̹� ���ŵ� �ڸ��Դϴ�.");
			} 
		}
	}

}
