package »ý¼ºÀÚ;

public class Bbs {
	int no;
	String title;
	String content;
	String writer;
	
	public void column() {
		System.out.println("no	" + "title	" + "content	"+ "writer	");
	}
	
	public Bbs(int no, String title, String content, String writer) {
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	@Override
	public String toString() {
		return no + "	" + title + "	" + content +"	" + writer ;
	}
	
}
