package ���2;

public class BankUse {

	public static void main(String[] args) {
		BadBank bad = new BadBank();
		GoodBank good = new GoodBank();
		NormalBank normal = new NormalBank();
		
		bad.interest();
		good.interest();
		normal.interest();
		
	}

}
