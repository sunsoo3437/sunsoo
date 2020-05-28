package 배열심화;

import java.util.Random;

public class 시험점수확인 {

	public static void main(String[] args) {
		int[] 정답 = new int[1000];
		Random r = new Random();
		for (int i = 0; i < 정답.length; i++) {
			정답[i] = r.nextInt(4) + 1; // +1 => 최소값
		}
		for (int i = 0; i < 정답.length; i++) {
			System.out.println((i+1)+" : "+정답[i]);
		}
		int[] 학생 = 정답.clone();
		int count = 0;
		int wrong = 0;
		for (int i = 0; i < 학생.length; i++) {
			int index = r.nextInt(1000);
			int jumsu = r.nextInt(4)+1;
			학생[index] = jumsu;
		}
		//어떤 문항이 틀렸는지 문항과 정답/답안 비교 출력
		//몇개나 틀렸는지 찾아보세요.
		//하나당 1점이라고 한다면, 몇점인지 출력
		for (int i = 0; i < 학생.length; i++) {
			if (정답[i] == 학생[i]) {
				count++;
			} else {
				wrong++;
				System.out.println((i+1)+"번 문제 정답 : " + 정답[i] +" / 답안 : " + 학생[i]);
			}
		}
		System.out.println("학생의 점수 = "+ count +"점");
		System.out.println("틀린 문항수 = "+ wrong +"개");
	}

}
