package dbs;

public class BbsBag {
	String id;
	String title;
	String content;
	String writer;
	
	//getters and setters
	//가방에 넣을때는 set메소드
	//가방에서 꺼내올때는 get메소드 
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
		
}
