package �츮ȸ��;

public class ���� {
	//+ public / "" default /# protected /- private
	public String name = "ȫ�浿";//���� ��Ű�� + �ٸ� ��Ű�� ���ٰ���
	protected int salary = 100;//���� ��Ű�� + �ٸ� ��Ű��(��Ӱ��迡 ��������) ���ٰ���
	String address = "����";// default - ���� ��Ű���������� ���ٰ���
	private int rrn = 920312;// �ش� Ŭ���������� ���� ����
	//������ �迭
	@Override
	public String toString() {
		return "���� [name=" + name + ", adress=" + address + ", salary=" + salary + ", rrn=" + rrn + "]";
	}	
}
