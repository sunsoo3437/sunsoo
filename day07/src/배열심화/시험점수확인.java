package �迭��ȭ;

import java.util.Random;

public class ��������Ȯ�� {

	public static void main(String[] args) {
		int[] ���� = new int[1000];
		Random r = new Random();
		for (int i = 0; i < ����.length; i++) {
			����[i] = r.nextInt(4) + 1; // +1 => �ּҰ�
		}
		for (int i = 0; i < ����.length; i++) {
			System.out.println((i+1)+" : "+����[i]);
		}
		int[] �л� = ����.clone();
		int count = 0;
		int wrong = 0;
		for (int i = 0; i < �л�.length; i++) {
			int index = r.nextInt(1000);
			int jumsu = r.nextInt(4)+1;
			�л�[index] = jumsu;
		}
		//� ������ Ʋ�ȴ��� ���װ� ����/��� �� ���
		//��� Ʋ�ȴ��� ã�ƺ�����.
		//�ϳ��� 1���̶�� �Ѵٸ�, �������� ���
		for (int i = 0; i < �л�.length; i++) {
			if (����[i] == �л�[i]) {
				count++;
			} else {
				wrong++;
				System.out.println((i+1)+"�� ���� ���� : " + ����[i] +" / ��� : " + �л�[i]);
			}
		}
		System.out.println("�л��� ���� = "+ count +"��");
		System.out.println("Ʋ�� ���׼� = "+ wrong +"��");
	}

}
