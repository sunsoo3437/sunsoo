package �ݺ���;

import java.util.Scanner;

public class �ٷ��Է°��� {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����1 �Է��ϼ��� >>");
		int n1 = sc.nextInt();
		System.out.print("����2 �Է��ϼ��� >>");
		int n2 = sc.nextInt();
		if (n1 > n2) {
			System.out.println("ù��° ���� �ι�° ������ �� Ů�ϴ�");
		} else if (n1 < n2) {
			System.out.println("ù��° ���� �ι�° ������ �� �۽��ϴ�");
		} else {
			System.out.println("�μ��� �����ϴ�.");
		}		
		
	}
		
}
