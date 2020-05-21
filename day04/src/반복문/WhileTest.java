package 반복문;

import javax.swing.JOptionPane;

public class WhileTest {

	public static void main(String[] args) {
		int count = 10; // 시작값
		while (count <= 15) { //조건식
			System.out.println(count  + " 무한루프를 돌려보자!");
			count = count + 1; // count++(1씩 증가!) 증감연산자	
		}
		
		System.out.println("------------------------------");
		
		for (int i = 10; i <= 15; i++) {
			System.out.println(i);
		}
		
		System.out.println("-------------------");
		
		while (true) {
			// cpu는 저장위치에 직접적으로 접근 불가.
			// cpu는 처리할 모든 데이터, 프로그램을 RAM에 가져다 놓고 써야함.
			// 자주 쓰는 것들은 이미 RAM에 넣어둔 상태
			// =>대문자로 써서 바로 사용 가능
			String hour = JOptionPane.showInputDialog("지금 몇시입니까(종료x)"); //.접근연산자
			//x 눌렀는지 확인해야함.
			//x 눌렀으면, 반복문 끝내는 처리
			if (hour.equals("x")) {
				System.out.println("시스템을 종료합니다.");
				break;//자신을 포함하고 있는 반복문을 끝내준다.
			}
			System.out.println(hour + "시 입니다.");//결합연산자(String 하나라도 있으면)
		}
			
	}

}
