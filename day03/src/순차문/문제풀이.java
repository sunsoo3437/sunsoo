package 순차문;
import java.util.Date;

public class 문제풀이 {

	public static void main(String[] args) {
		// 1) Date 이용 시간 구함, 지금 인사 출력
		// 11시전 굿모닝, 16시 전 굿애프터눈, 22시전 굿 이브닝 아니면 굿나잇
		Date date = new Date();
		int hour = date.getHours();
		if (hour < 11) {
			System.out.println("굿모닝");
		} else if (hour < 16) {
			System.out.println("굿애프터눈");
		} else if (hour < 22) {
			System.out.println("굿이브닝");
		} else {
			System.out.println("굿나잇");
		}
		// 2) Date 이용 달 구하기 
		// 2월을 28일까지  4,6,9,11월은 30일까지 나머지는 31일까지
		int mon = date.getMonth()+1;
		if (mon == 2) {
			System.out.println(mon + "월은 28일까지");
		} else if(mon == 4 || mon == 6 || mon == 9 || mon == 11) {
			System.out.println(mon + "월은 30일까지");
		} else {
			System.out.println(mon + "월은 31일까지");
		}
	}

}
