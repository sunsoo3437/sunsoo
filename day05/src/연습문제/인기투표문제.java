package ��������;

import java.util.Scanner;

public class �α���ǥ���� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance = 10000;
		while (true) {
			System.out.println("------------------------");
			System.out.println("1.����|2.���|3.�ܰ�|4.����");
			System.out.println("------------------------");
			System.out.print("���� >>");
			int select = sc.nextInt();
			if (select == 1) {//����
				System.out.print("�Աݾ� >> ");
				int money = sc.nextInt();
				balance = balance + money;
				System.out.println("�ܰ� > " + balance + "��");
			} else if (select == 2) {//���
				System.out.print("��ݾ� >> ");
				int money = sc.nextInt();
				balance = balance - money;
				System.out.println("�ܰ� >> " + balance + "��");
			} else if (select == 3) {//�ܰ�
				System.out.println("�ܰ� >> " + balance + "��");
			} else if (select == 4) {//����
				System.out.println("�ý����� �����մϴ�.");
				System.exit(0);//���α׷�����!
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			} 
		}

	}

}
