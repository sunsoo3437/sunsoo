package 배열;

public class 값을모르고있는경우 {

	public static void main(String[] args) {
		int[] num = new int[1000];//[] = 배열 의미함
		System.out.println(num); // 주소값
		System.out.println(num[0]); // 위치값(index), 
		System.out.println(num[999]);
		//배열은 초기값이 다 들어있다. intㅡ> 0 , double ㅡ> 0.0
		num[500] = 1;
		num[666] = 1;
		
		int[] seat = new int[21];
		//읽기 전용 변수 : 배열의 개수
		//배열 생성시 각각의 자리 + 배열의 주소값(자동) + 배열의 갯수(자동) → 데이터 생성
		System.out.println(seat.length);
		System.out.println(seat[2] == seat[0]);
		//System.out.println(seat == seat[0]);
		seat[2] = 1;
		seat[3] = 1;
		seat[4] = 1;
		seat[5] = 1;
		
		//for문 내에서의 i는 배열의 index 역할
		// i => index
		for (int i = 0; i < seat.length; i++) {
			System.out.print(seat[i] + " ");
		}
		//int num2 = 0;
		//System.out.println(num2);
		
	}

}
