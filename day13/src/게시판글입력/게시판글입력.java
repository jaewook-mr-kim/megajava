package �Խ��Ǳ��Է�;

import java.util.Scanner;

public class �Խ��Ǳ��Է� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����: ");
		String title = sc.next();
		System.out.print("����: ");
		String content = sc.next();
		System.out.print("�۾���: ");
		String writer = sc.next();
		
		DAO dao = new DAO();
		DTO bag = new DTO();
		bag.setTitle(title);
		bag.setContent(content);
		bag.setWriter(writer);
		dao.insert(bag);
		
	}

}
