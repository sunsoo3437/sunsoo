package �ݺ���;

import java.util.Scanner;

public class �ֹܼٷ��Է� {

	public static void main(String[] args) {
		//Scanner ��ĳ��(�Է¿�  - file, Ű����, ��Ʈ��ũ ���)
		//String --> int ��ɾ ������ ����.
		Scanner sc = new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ��� >>");
		int age = sc.nextInt();//
		System.out.println("����� ���̴� " + age);
		System.out.println("����� ���� ���̴� " + (age +1));
	}
	
}
