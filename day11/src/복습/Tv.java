package ����;

public class Tv {
	int channel;//�������, ��������,�ڵ��ʱ�ȭ
	int volumne;//�޼ҵ念��
	boolean onOff;
	static int count;//static -> ��������(��ü ������� Ŭ���� �� �ϳ�)-> ������ų ����, ��ü���� �����Ͽ� �� �� ����
	
	//������ �����ε�, �Է°��� �ٸ��� �ϸ� �޼ҵ� �̸��� ���ϰ� ��
	public Tv(int channel, int volumne, boolean onOff) {
		count++; //��������
//		System.out.println("��ü ���� ������ " + count);
		this.channel = channel;
		this.volumne = volumne;
		this.onOff = onOff;
	}

	@Override
	public String toString() {
		return "Tv [channel=" + channel + ", volumne=" + volumne + ", onOff=" + onOff + "]";
	}
		
	
}
