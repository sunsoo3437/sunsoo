package 순차문;

import javax.swing.JOptionPane;

public class 성인판별 {

	public static void main(String[] args) {
		// 이름을 입력해서, 출력
		String name = JOptionPane.showInputDialog("이름을 입력하세요");//데이터 외부에서 들고오면 모두 String
		String age = JOptionPane.showInputDialog("나이을 입력하세요");
		
		//JOptionPane.showMessageDialog(null, "당신의 이름은 " + name);
		int age2 = Integer.parseInt(age);
		

		// 조건문
		if (age2 >= 18) {
			JOptionPane.showMessageDialog(null,name + "님은 성인이십니다.");
		} else {
			JOptionPane.showMessageDialog(null,name + "님은 미성인이십니다.");
		}
		
		

	}

}
