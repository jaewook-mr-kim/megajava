package �Խ��Ǳ��Է�;

import ���޿�Ŭ����.MemberDTO;

public class DAO {
	public void insert(DTO bag) {
		System.out.println("db�� ������.");
		System.out.println("����� no: " + bag.getNo());
		System.out.println("����� title: " + bag.getTitle());
		System.out.println("����� content: " + bag.getContent());
		System.out.println("����� writer: " + bag.getWriter());
		System.out.println("db�� ������.");
}
}