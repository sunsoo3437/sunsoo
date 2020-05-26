package 배열;

import java.util.Scanner;

public class 값을모르고있는경우3 {

	public static void main(String[] args) {
		//키보드로 콘솔에서 입력받을 수 있는 부품 필요
		Scanner sc = new Scanner(System.in);
		int[] data = new int[5];
		
		for (int i = 0; i < data.length; i++) {
			System.out.print("값 입력 >>");
			data[i] = sc.nextInt();
			
		}
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+ " ");
		}
		
		int sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum = sum + data[i];
		}
		System.out.println(sum); //비파괴형
		System.out.println((double)sum / data.length);
		//(double)sum = 잠시 CPU에서 double로 바뀜(비파괴형) → 한쪽만 해줘야함
		//((double)(sum / data.length)) → 이미 int 계산 후 double로 바뀜
		
	}

}
