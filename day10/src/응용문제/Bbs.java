package 응용문제;

public class Bbs {
	int no;
	String title;
	String content;
	String writer;
	
	public Bbs(int x, String a, String b, String c) {
		this.no = x;
		this.title = a;
		this.content = b;
		this.writer = c;
	}
	
	
	@Override
	public String toString() {
		return "Bbs [no=" + no + ", title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}

}
