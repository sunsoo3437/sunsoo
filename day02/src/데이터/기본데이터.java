package 데이터;

public class 기본데이터 {

	public static void main(String[] args) {
		int x = 300; // 300을 x에 집어 넣었다. / int 범위  -21억 ~ 21억
		int y = 600; // 정수
		
		double move = 22.5; // 실수
		//한글자 이상은 기본데이터가 아닙니다.
		//기본데이터가 아닌것은 다 부품을 사용.
		
		//+ = 결합연산자(기호)
		System.out.println("우주선의 x축값은 " + x);
		System.out.println("우주선의 y축값은 " + y);
		
		x = 250;
		
		int z; // z 선언 but 값은 없음 → 쓰레기값
		int x2, y2, z2; //같은 이름은 만들수 없다.
		//System.out.println(x2); 
		// 쓰레기값은 연산도 안되고 출력도 안된다. 처리대상이 아니다.
	}

}
