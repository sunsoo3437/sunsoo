package 우리회사;

public class 직원 {
	//+ public / "" default /# protected /- private
	public String name = "홍길동";//같은 패키지 + 다른 패키지 접근가능
	protected int salary = 100;//같은 패키지 + 다른 패키지(상속관계에 있을때만) 접근가능
	String address = "서울";// default - 같은 패키지내에서만 접근가능
	private int rrn = 920312;// 해당 클래스에서만 접근 가능
	//순서상 배열
	@Override
	public String toString() {
		return "직원 [name=" + name + ", adress=" + address + ", salary=" + salary + ", rrn=" + rrn + "]";
	}	
}
