package 생성자;

public class Bbs사용 {

	public static void main(String[] args) {
		Bbs text1 = new Bbs(1,"java","fun java","park");
		Bbs text2 = new Bbs(2,"jsp","fun jsp","hong");
		Bbs text3 = new Bbs(3,"spring","fun spring","kim");
		
		text1.column();
		System.out.println(text1);
		System.out.println(text2);
		System.out.println(text3);
	}

}
