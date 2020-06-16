package 게시판글입력;

import 전달용클래스.MemberDTO;

public class DAO {
	public void insert(DTO bag) {
		System.out.println("db에 접속함.");
		System.out.println("저장된 no: " + bag.getNo());
		System.out.println("저장된 title: " + bag.getTitle());
		System.out.println("저장된 content: " + bag.getContent());
		System.out.println("저장된 writer: " + bag.getWriter());
		System.out.println("db에 저장함.");
}
}