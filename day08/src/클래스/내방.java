package Ŭ����;

public class ���� {

	public static void main(String[] args) {
		������ ��1 = new ������();
		������ ��2 = new ������();
		��1.color = "Ȳ��";
		��1.name = "�޸�";
		��1.bark();//�Լ����! �θ���(call,�޼ҵ� ��, ȣ��)
		��1.shake();
		System.out.println("��1 �̸��� " + ��1.name);
		System.out.println("��1 ���� " + ��1.color);
		��2.color = "������";
		��2.name = "����";
		��2.bark();
		��2.shake();
		System.out.println("��2 �̸��� " + ��2.name);
		System.out.println("��2 ���� " + ��2.color);
		
		�� ���� = new ��();
		����.age = "29";
		����.name = "������";
		����.playgame();
		����.read();
		
	}

}
