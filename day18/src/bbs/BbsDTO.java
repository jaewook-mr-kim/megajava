package bbs;

public class BbsDTO {
	String id;
	String title;
	String content;
	String writer;
	
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
	
	// getters & setters
	// 가방에 넣을 때는 set메소드
	// 가방에서 꺼내올때는 get메소드
	
	// 많은 양의 데이터를 가방에 넣어서 전달하기 위함
	// DTO, 값만 넣었다 뺐다 한다고 해서 Value Object (VO)
	
	
}
