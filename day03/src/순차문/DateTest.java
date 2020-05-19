package 순차문;

import java.util.Date;

import javax.swing.JOptionPane;

public class DateTest {

	public static void main(String[] args) {
		Date date = new Date();
		//년 월 일 요일 시 분 초 
		int year = date.getYear() + 1900;
		int month = date.getMonth() + 1 ;
		int daily = date.getDate();
		int day = date.getDay();
		//JOptionPane.showMessageDialog(null, year + "년 " + month + "월 " + daily + "일");
		System.out.println(day);
		if (day == 0 || day == 6) {//일요일 or 토요일
			System.out.println("즐거운 주말");
		} else if (day == 1) {//월
			System.out.println("월요병 도지는 출근날");
		} else if (day == 2 || day == 4) {//화 or 목
			System.out.println("자바 기초 수업일");
		} else {
			
		}
		
		
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();
		//JOptionPane.showMessageDialog(null, hour + "시 " + min + "분 " + sec + "초");
		
	}

}
