package ��������;

import java.util.Scanner;

public class �������� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iu = 0;
		int you = 0;
		int bts = 0;
		System.out.println("--------------------------");
		System.out.println("1.������|2.���缮|3.��ź|4.����");
		System.out.println("--------------------------");
		while (true) {
			System.out.print("����� ������ >>");
			int select = sc.nextInt();
			if (select == 1) {//������
				iu = iu + 1;// = iu++; // ����������
			} else if (select == 2) {//���缮
				you = you + 1;
			} else if (select == 3) {//��ź
				bts = bts + 1;
			} else if (select == 4) {//����
				System.out.println("�ý����� �����մϴ�.");
				//�������
				System.out.println("-------------------");
				System.out.println("������ : " + iu + "ǥ");
				System.out.println("���缮 : " + you + "ǥ");
				System.out.println("��ź : " + bts + "ǥ");
				System.exit(0);//���α׷�����!
			} else {
				System.out.println("1~4������ ���� �������ּ���.");
			}
			if (iu+you+bts == 5) {
				System.out.println("-------------------");
				System.out.println("������ : " + iu + "ǥ");
				System.out.println("���缮 : " + you + "ǥ");
				System.out.println("��ź : " + bts + "ǥ");
				System.out.println("�ý����� �����մϴ�.");
				break;				
			}
		}

	}

}
