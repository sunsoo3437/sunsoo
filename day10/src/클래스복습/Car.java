package Ŭ��������;

public class Car {
	// Ư¡(�ϳ��� ��ǰ���� �ϳ��� ��ɸ� �ִ°� ����. - ������)
	// ���� => �������, ��������(�ڵ� �ʱ�ȭ)
	String wheel; //�������, null
	int speed; //�ӵ�, 0
	
	// ��ü ������ �ڵ� ȣ��Ǵ� �޼ҵ带 ���� ����, ������ �޼ҵ�
	// ������ �޼ҵ�� ��ȯ�� ǥ������ �ʴ´�. ��� �� void.
	// ������ �޼ҵ�� Ŭ���� �̸��� �����ϰ� ������ �Ѵ�. 
	// �Ķ���� �ִ� ������
	public Car(String wheel, int speed) {
		super();
		this.wheel = wheel;
		this.speed = speed;
	}
	
	//���� => ����޼ҵ�(�Լ�), �Է°�, ��ȯ������, �Ű�����
	//�Ű����� = �Ķ����(parameter)!!
	public void speedUp(int speed) {//speedUp(50)
		this.speed = this.speed + speed;//this = Ŭ������ �� => �������� ã��
		//void ��ȯ ���� / speedUp()���� ()���� �Է°�
		System.out.println(this.speed + "�� �ӵ��� UP!");
	}
	public int nowSpeed() {
		return speed;
	}
	public void speedDown() {
		System.out.println("�ӵ��� DOWN!");
	}
	//car ��½� �ּ� ��� ���� ������� ����
	@Override // �������̵�(�������̵�) ����� ������
	public String toString() {
		return "�ڵ��� [����=" + wheel + ", �ӵ�=" + speed + "]";
	}
	
	
	
}
