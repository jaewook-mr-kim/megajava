package ��������;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. create
		System.out.print("id�Է� : ");
		String id = sc.next();
		System.out.print("pw�Է� : ");
		String pw = sc.next();
		// dbó�� (dao)
		DAOInterface dao = new DAOInterface() {

			@Override
			public void create(String id, String pw) {
				System.out.println("���̵� : " + id + ", �н����� : " + pw + "�� ������ �Ϸ�Ǿ����ϴ�.");
			}

			@Override
			public void read(String id) {
				System.out.println(id + "�� ��й�ȣ�� " + pw + "�Դϴ�.");
			}

			@Override
			public void update(String id, String pw) {
				System.out.println(id + "�� ��й�ȣ�� " + pw + "�� ����Ǿ����ϴ�.");
			}

			@Override
			public void delete(String id) {
				System.out.println(id + "������ �����Ǿ����ϴ�.");
			}
			
		
	};
	dao.create(id,  pw);

}
}
