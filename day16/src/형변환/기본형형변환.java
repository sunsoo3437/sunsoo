package ����ȯ;

public class �⺻������ȯ {

	public static void main(String[] args) {
		byte n1 = 100;
		int n2 = n1;
		//ū<-��(�ڵ����� int�� ��ȯ�Ǿ� ��)
		//Ÿ�Ժ�ȯ(�ڵ� ����ȯ, ĳ����)
		byte n3 = (byte)n2;
		//��<-ū(������ byte�� ��ȯ�Ǿ�� �� �� ����)
		//Ÿ�Ժ�ȯ(���� ����ȯ, ĳ����, (�ٲٰ� ���� Ÿ��)�Ұ�ȣ�� �̿�)
		System.out.println(n3);
		
		int n4 =2000;
		byte n5 = (byte)n4;
		//�� �� ���� ���� ���ֿ� ����ĳ�����ϴ� ��쿡�� ������ ���� ���Ƿ� �Ұ�!
		System.out.println(n5);
	}

}
