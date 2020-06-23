package 형변환;

public class 금호타이어 extends Tire {
	String company = "금호";
	
	@Override
	public void 타이어를끼다() {
		System.out.println(company + "타이어를 끼다.");
	}
}
