package �迭��ȭ;

import java.util.Arrays;
import java.util.Random;

public class ����1����ã�ƶ� {

	public static void main(String[] args) {
		Random r = new Random();
		int[] jumsu = new int[10000];
		for (int x = 0; x < jumsu.length; x++) {
			jumsu[x] = r.nextInt(401);
		}
		
//		Arrays.sort(jumsu);//�ı��� �Լ�
//		for (int i : jumsu) {
//			System.out.println(i);
//		}
//		System.out.println("�ְ� ������" + jumsu[9999]);
		int max = jumsu[0];
		//��ü ���� ���鼭
		//����üũ : �ְ� ���� max�� �־�� ������ ū��?
		//ó�� : ���� ũ�ٸ�, �� �ε��������� �ְ��� �ȴٴ� �̾߱��̹Ƿ�, max�� �ش簪 �־����
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i]>max) {
				max = jumsu[i];
			}
		}
		System.out.println("�ְ����� = "+ max +"��");	
		int count = 0;
		for (int j = 0; j < jumsu.length; j++) {
			if (max == jumsu[j]) {
				System.out.println((j+1)+"��");
				count++;
			}
		}
		System.out.println("�ְ����� �ο��� " + count + "��");
	}
}
