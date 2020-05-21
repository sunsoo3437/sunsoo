package 반복문;

import java.util.Random;

import javax.swing.JOptionPane;

public class 수업중간과제 {
	public static void main(String[] args) {
		Random r = new Random();
		int count = 0;//alt + shift + z = 선택영역 whlie 넣을수 있음
		while (true) {
			String input = JOptionPane.showInputDialog("x를 입력시, 종료됩니다.");
			if (input.equals("x")) {
				System.out.println("종료합니다.");
				System.out.println("시도횟수는 " + count + "회 반복");
				break;
			}
			count++;
			int dataa = r.nextInt(100);
			int datab = r.nextInt(100);
			System.out.println(dataa);
			System.out.println(datab);
			if (dataa > datab) {
				System.out.println("두 수중 앞에 있는 숫자가 더 커요");
			} else if (dataa < datab){
				System.out.println("두 수중 앞에 있는 숫자가 더 작아요");
			} else {
				System.out.println("두 수가 같습니다.");
			}
			
		}
	}
}
