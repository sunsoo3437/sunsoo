package 형변환;

public class 한국타이어 extends Tire {
	String company = "한국";
	
	@Override
	public void 타이어를끼다() {
		System.out.println(company + "타이어를 끼다.");
	}
}
