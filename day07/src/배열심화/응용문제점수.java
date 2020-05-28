package 배열심화;

public class 응용문제점수 {

	public static void main(String[] args) {
		int[] a = {100, 88, 96};
		int[] b = a.clone();
		b[0] = 99;
		int sum1 = 0;
		int sum2 = 0;
		
		for (int i = 0; i < b.length; i++) {
			System.out.println("1학기 " + (i+1) + "번 학생 점수는 " +a[i]+"점입니다.");
			System.out.println("2학기 " + (i+1) + "번 학생 점수는 " +b[i]+"점입니다.");
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

	}

}
