package ��ӻ�����;


// base import : import java.lang.*;
public class �ϹݰԽ��� extends Object{
	int no;
	String title;
	String content;
	String writer;
	
	public �ϹݰԽ���() {
		
	}
	
	public �ϹݰԽ���(int no, String title, String content, String writer) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "�ϹݰԽ��� [no=" + no + ", title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}

}
