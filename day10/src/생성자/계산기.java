package 생성자;

import java.util.Date;

public class 계산기 {
	public int add(int x, int y) {
		return x + y;
	}
	public double add(int x, double y) {
		return x + y;
	}
	public double add(double x, double y) {
		return x + y;
	}
	public String add(int x, String y) {
		return x + y;
	}
	public String add(String x, String y) {
		return x + y;
	}
	public int[] add() {
		int[] num = {1,2,3};
		return num;
	}
	public Date add(int x) {//객체가 될수도 있다. 참조형(주소)
		Date date = new Date();
		return date;
	}
	
}
