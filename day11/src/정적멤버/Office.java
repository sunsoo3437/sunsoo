package �������;

public class Office {

	public static void main(String[] args) {
		Worker worker1 = new Worker("�Ӿƹ���","��",24);
		Worker worker2 = new Worker("�ھƹ���","��",25);
		Worker worker3 = new Worker("��ƹ���","��",23);

		System.out.println(worker1);
		System.out.println(worker2);
		System.out.println(worker3);
		System.out.println("��ü ���� ���� " + Worker.count + "��");
		System.out.println("�������� ��� ���̴� " + (Worker.totAge / Worker.count) + "��");
		
		System.out.println("��ü ���� ���� " + Worker.getCount() + "��");
		System.out.println("��� ���̴� " + Worker.getTotAge()/Worker.getCount() + "��");
	}

}
