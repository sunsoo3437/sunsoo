package 다른회사;

import 우리회사.직원;

public class 직원사용 {

	public static void main(String[] args) {
		//자동import ctrl + shift + o(영문)
		직원 e = new 직원();
		//가시성(visibility) 다른패키지에서는 public으로 설정된 것만 보임
		System.out.println(e.name);
//		System.out.println(e.salary);
//		System.out.println(e.address);
		//System.out.println(e.rrn);
	}

}
