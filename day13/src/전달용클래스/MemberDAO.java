package ���޿�Ŭ����;

public class MemberDAO { // DAO : data access object (dbó�� ���� Ŭ����)
	// db�� �ִ� ó���� ����
	public void insert(MemberDTO bag) {
		System.out.println("db�� ������.");
		System.out.println("����� id: " + bag.getId());
		System.out.println("����� pw: " + bag.getPw());
		System.out.println("����� name: " + bag.getName());
		System.out.println("����� tel: " + bag.getTel());
		System.out.println("db�� ������.");
	}

}
