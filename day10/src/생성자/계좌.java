package ������;

public class ���� {
	String �̸�;
	String ����;
	int money;
	
	//�⺻������(source -> superclass), �����!
	//�Ķ���� �ִ� �����ڰ� �ϳ��� ���� ��� 
	//���������� �ڵ� ����!
	// public : ����������
	// ���������� : public > protected > default(X) > private
	// defalut : ���� ��Ű���������� �����Ͽ� ��� ����
	public ����() {
	}

	public ����(String �̸�, String ����) {
		this.�̸� = �̸�;
		this.���� = ����;
	}

	public ����(String �̸�, String ����, int money) {
		this.�̸� = �̸�;
		this.���� = ����;
		this.money = money;
	}
	
	
}
