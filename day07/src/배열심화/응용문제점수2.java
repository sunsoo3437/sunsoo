package �迭��ȭ;

import java.util.Random;

public class ���빮������2 {

	public static void main(String[] args) {
		int[] a = new int[300];
		Random r = new Random(87);//���Ѱ�, seed��
		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(101);//0~100
		}
		int[] b = a.clone();
		b[0] = 99;
		b[3] = 50;
		b[7] = 30;
		b[50] = 87;
		b[28] = 29;
		b[187] = 6;
		int sum1 = 0;
		int sum2 = 0;
		int count = 0;
		
		for (int i = 0; i < b.length; i++) {
			if (a[i] != b[i]) {
				System.out.println((i+1)+ "��  " + a[i] + " / " + b[i]);
				count++;
			}
			sum1 = sum1 + a[i];
			sum2 = sum2 + b[i];
		}
		
		double avg1 = (double)sum1/a.length;
		double avg2 = (double)sum2/b.length;
		System.out.println("1�б� ������ " +sum1 +"���Դϴ�.");
		System.out.println("1�б� ��������� " +avg1 +"���Դϴ�.");
		System.out.println("2�б� ������ " +sum2 +"���Դϴ�.");
		System.out.println("2�б� ��������� " +avg2 +"���Դϴ�.");
		
		if (avg1 > avg2) {
			System.out.println("1�б� ����� �� ����.");
		} else if (avg1 == avg2){
			System.out.println("���б� ����� �����ϴ�.");
		} else if (avg1 < avg2){
			System.out.println("2�б� ����� �� ����.");
		}
		System.out.println("���� �ٸ� �ο� " + count +"��");

	}

}
