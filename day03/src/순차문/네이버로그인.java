package 순차문;

import javax.swing.JOptionPane;

public class 네이버로그인 {

	public static void main(String[] args) {
		String id = "root";//가입했을때의 id
		String id2 = JOptionPane.showInputDialog("id를 입력하세요.");
		
		String pw = "1111";
		String pw2 = JOptionPane.showInputDialog("pw를 입력하세요.");
		
		if (id.equals(id2) && pw.equals(pw2)) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}

	}

}
