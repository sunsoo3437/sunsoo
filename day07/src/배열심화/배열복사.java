package �迭��ȭ;

public class �迭���� {

	public static void main(String[] args) {
//		int x = 100;
//		int y = x;//�⺻���� ����
//		System.out.println("x : " + x);
//		System.out.println("y : " + y);
//		
//		x = 200;
//		System.out.println("x : " + x);
//		System.out.println("y : " + y);
		int[] a = {100, 200, 300};
		int[] b = a;//�������� ���� => �ּҸ� ����(���� ����)
		for (int i = 0; i < b.length; i++) {
			System.out.println("a: " + a[i] + ", " + "b: " + b[i] );
		}
		System.out.println("--------------");
		a[0] = 999;
		for (int i = 0; i < b.length; i++) {
			System.out.println("a: " + a[i] + ", " + "b: " + b[i] );
		}
		System.out.println("�������� a �ּ�  = " + a);
		System.out.println("�������� b �ּ�  = " + b);
		System.out.println("---------------------");
		
		int[] c = {100, 200, 300};
		int[] d = c.clone();//���� ����
		System.out.println("�������� c �ּ�  = " + c);
		System.out.println("�������� d �ּ�  = " + d);
		
		c[0] = 999;
		for (int i = 0; i < c.length; i++) {
			System.out.println("c: " + c[i] + ", " + "d: " + d[i] );
		}
		
		
	}

}
