package 배열심화;

import java.util.Arrays;
import java.util.Random;

public class 수능1등을찾아라 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] jumsu = new int[10000];
		for (int x = 0; x < jumsu.length; x++) {
			jumsu[x] = r.nextInt(401);
		}
		
//		Arrays.sort(jumsu);//파괴형 함수
//		for (int i : jumsu) {
//			System.out.println(i);
//		}
//		System.out.println("최고 점수는" + jumsu[9999]);
		int max = jumsu[0];
		//전체 점수 돌면서
		//조건체크 : 최고 변수 max에 넣어둔 값보다 큰가?
		//처리 : 만약 크다면, 그 인덱스까지의 최고값이 된다는 이야기이므로, max에 해당값 넣어야함
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i]>max) {
				max = jumsu[i];
			}
		}
		System.out.println("최고점수 = "+ max +"점");	
		int count = 0;
		for (int j = 0; j < jumsu.length; j++) {
			if (max == jumsu[j]) {
				System.out.println((j+1)+"번");
				count++;
			}
		}
		System.out.println("최고점수 인원은 " + count + "명");
	}
}
