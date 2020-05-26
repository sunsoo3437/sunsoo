package 배열;

public class 값을아는경우 {
	int win = 0;//전역변수(global)
	
	public static void main(String[] args) {
		//램에 변수가 생기는 시기 : 해당 줄이 실행되는 시기에(선언!)
		//선언의 위치가 생존의 범위!!!
		//함수내의 지역에서만 생존할 수 있는 변수 : 지역변수
		//지역 = local
		String[] names = {"강석용", "어타숙", "강선수"};
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		System.out.println("");
		
		for (String x : names) {//for (데이터유형 변수명 : 배열명) = foreach
			System.out.print(x + " ");
		}
		System.out.println("");
		
		char[] gender = {'남','여','남'};
		for (int i = 0; i < gender.length; i++) {
			System.out.print(gender[i] + " ");
		}
		System.out.println("");
		for (char x : gender) {//for (데이터유형 변수명 : 배열명)
			System.out.print(x + " ");
		}
		System.out.println("");
		
		int[] ages = {60, 54, 29};
		for (int i = 0; i < ages.length; i++) {
			System.out.print(ages[i] + " ");
		}
		System.out.println("");
		for (int x : ages) {//for (데이터유형 변수명 : 배열명)
			System.out.print(x + " ");
		}
		System.out.println("");
		
		double[] height = {170.2, 157.8, 174};
		for (int i = 0; i < height.length; i++) {
			System.out.print(height[i] + " ");
		}
		System.out.println("");
		for (double x : height) {//for (데이터유형 변수명 : 배열명)
			System.out.print(x + " ");
		}
	}

}
