package 조건문;

public class 네이버로그인 {

	public static void main(String[] args) {
		String id = "root";//가입했을때의 id
		String id2 = "admin";//입력을 담당하는 부분!!
		
		String pw = "1111";
		String pw2 = "1111";
		
		if (id.equals(id2) && pw.equals(pw2)) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}

	}

}
