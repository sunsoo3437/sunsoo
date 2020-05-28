package 배열심화;

import java.util.Random;

public class 응용문제점수2 {

	public static void main(String[] args) {
		int[] a = new int[300];
		Random r = new Random(87);//씨앗값, seed값
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
				System.out.println((i+1)+ "번  " + a[i] + " / " + b[i]);
				count++;
			}
			sum1 = sum1 + a[i];
			sum2 = sum2 + b[i];
		}
		
		double avg1 = (double)sum1/a.length;
		double avg2 = (double)sum2/b.length;
		System.out.println("1학기 총점은 " +sum1 +"점입니다.");
		System.out.println("1학기 평균점수는 " +avg1 +"점입니다.");
		System.out.println("2학기 총점은 " +sum2 +"점입니다.");
		System.out.println("2학기 평균점수는 " +avg2 +"점입니다.");
		
		if (avg1 > avg2) {
			System.out.println("1학기 평균이 더 높다.");
		} else if (avg1 == avg2){
			System.out.println("두학기 평균이 동일하다.");
		} else if (avg1 < avg2){
			System.out.println("2학기 평균이 더 높다.");
		}
		System.out.println("점수 다른 인원 " + count +"명");

	}

}
