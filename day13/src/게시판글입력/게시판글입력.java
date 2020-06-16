package 게시판글입력;

import java.util.Scanner;

public class 게시판글입력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("제목: ");
		String title = sc.next();
		System.out.print("내용: ");
		String content = sc.next();
		System.out.print("글쓴이: ");
		String writer = sc.next();
		
		DAO dao = new DAO();
		DTO bag = new DTO();
		bag.setTitle(title);
		bag.setContent(content);
		bag.setWriter(writer);
		dao.insert(bag);
		
	}

}
