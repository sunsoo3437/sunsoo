package ������;
import java.util.Date;

public class ����Ǯ�� {

	public static void main(String[] args) {
		// 1) Date �̿� �ð� ����, ���� �λ� ���
		// 11���� �¸��, 16�� �� �¾����ʹ�, 22���� �� �̺�� �ƴϸ� �³���
		Date date = new Date();
		int hour = date.getHours();
		if (hour < 11) {
			System.out.println("�¸��");
		} else if (hour < 16) {
			System.out.println("�¾����ʹ�");
		} else if (hour < 22) {
			System.out.println("���̺��");
		} else {
			System.out.println("�³���");
		}
		// 2) Date �̿� �� ���ϱ� 
		// 2���� 28�ϱ���  4,6,9,11���� 30�ϱ��� �������� 31�ϱ���
		int mon = date.getMonth()+1;
		if (mon == 2) {
			System.out.println(mon + "���� 28�ϱ���");
		} else if(mon == 4 || mon == 6 || mon == 9 || mon == 11) {
			System.out.println(mon + "���� 30�ϱ���");
		} else {
			System.out.println(mon + "���� 31�ϱ���");
		}
	}

}
