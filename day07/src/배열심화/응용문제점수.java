package �迭��ȭ;

public class ���빮������ {

	public static void main(String[] args) {
		int[] a = {100, 88, 96};
		int[] b = a.clone();
		b[0] = 99;
		int sum1 = 0;
		int sum2 = 0;
		
		for (int i = 0; i < b.length; i++) {
			System.out.println("1�б� " + (i+1) + "�� �л� ������ " +a[i]+"���Դϴ�.");
			System.out.println("2�б� " + (i+1) + "�� �л� ������ " +b[i]+"���Դϴ�.");
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

	}

}
