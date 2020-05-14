package 연산자;

public class 논리연산자 {

	public static void main(String[] args) {
		// 논리연산자 사용 여부
		// 논리적인 판단을 하려고 할 때
		// 비교연산자(조건)가 2개 이상인 경우
		// 조건 모두 만족해야할때 : and조건(&&) → 로그인 처리
		// 하나만 만족해도 괜찮은지 : or조건(||) 
		
		int id = 1111;//가입시 id
		int pw = 2222;//가입시 pw
		
		int id2 = 1000;//입력시 id
		int pw2 = 2222;//입력시 pw
		//비교연산자는 기본데이터(정수,실수,문자,논리)만 비교가능!
		//부품(class)는 비교연산자 사용 불가!
		if (id == id2 && pw == pw2) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}

	}

}
