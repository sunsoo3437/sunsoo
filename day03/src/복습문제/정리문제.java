package ��������;

public class �������� {

	public static void main(String[] args) {
		//����
		int hour = 7;
		
		//�Ǽ�
		double min = 0.49;
		
		//����
		char day = 'ȭ';
		
		//��
		boolean food = true; //false
		
		//. = ���ٿ�����
		System.out.println("���� �ð��� " + hour +"���Դϴ�.");
		System.out.println("���� ���� " + min +"���Դϴ�.");
		System.out.println("���� ������ " + day +"�����Դϴ�.");
		System.out.println("�Ļ翩�δ� " + food +"�Դϴ�.");
		
		//�⺻�� �̿��� ������, Ư���ϰ� �⺻��ó�� ����� ������
		String name = "������";
		
		/////////////////////////
		
		int num1 = 200;
		int num2 = 100;
		System.out.println(num1 == num2);
		
		String n1 = "ȫ�浿";
		String n2 = "�ڱ浿";
		System.out.println(n1.equals(n2));
		
		if (n1.equals(n2)) {
			System.out.println("�������̽ñ���!");
		} else {
			System.out.println("�������� �ƴϽñ���!");
		}
	}

}
