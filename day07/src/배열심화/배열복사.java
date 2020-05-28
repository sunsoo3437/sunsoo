package 배열심화;

public class 배열복사 {

	public static void main(String[] args) {
//		int x = 100;
//		int y = x;//기본형의 복사
//		System.out.println("x : " + x);
//		System.out.println("y : " + y);
//		
//		x = 200;
//		System.out.println("x : " + x);
//		System.out.println("y : " + y);
		int[] a = {100, 200, 300};
		int[] b = a;//참조형의 복사 => 주소를 복사(얇은 복사)
		for (int i = 0; i < b.length; i++) {
			System.out.println("a: " + a[i] + ", " + "b: " + b[i] );
		}
		System.out.println("--------------");
		a[0] = 999;
		for (int i = 0; i < b.length; i++) {
			System.out.println("a: " + a[i] + ", " + "b: " + b[i] );
		}
		System.out.println("얕은복사 a 주소  = " + a);
		System.out.println("얕은복사 b 주소  = " + b);
		System.out.println("---------------------");
		
		int[] c = {100, 200, 300};
		int[] d = c.clone();//깊은 복사
		System.out.println("깊은복사 c 주소  = " + c);
		System.out.println("깊은복사 d 주소  = " + d);
		
		c[0] = 999;
		for (int i = 0; i < c.length; i++) {
			System.out.println("c: " + c[i] + ", " + "d: " + d[i] );
		}
		
		
	}

}
