package 순차문;

import java.util.Date;

import javax.swing.JOptionPane;

public class 집에갈시간 {

	public static void main(String[] args) {
		//시간을 구해주는 클래스
		//Date, Calendar
		Date date = new Date();
		int time = date.getHours();
		
		System.out.println("현재 시간은 "+date.getHours()+":"+date.getMinutes()+":"+date.getSeconds());
		// 조건문
		if (time >= 22) {
			JOptionPane.showMessageDialog(null,"집에 갈 시간이 얼마 안남았군요.");
		} else {
			JOptionPane.showMessageDialog(null,"집에 갈 시간이 많이 남았군요.");
		}
	}
}
