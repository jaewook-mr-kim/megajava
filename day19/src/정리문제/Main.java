package 정리문제;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. create
		System.out.print("id입력 : ");
		String id = sc.next();
		System.out.print("pw입력 : ");
		String pw = sc.next();
		// db처리 (dao)
		DAOInterface dao = new DAOInterface() {

			@Override
			public void create(String id, String pw) {
				System.out.println("아이디 : " + id + ", 패스워드 : " + pw + "로 가입이 완료되었습니다.");
			}

			@Override
			public void read(String id) {
				System.out.println(id + "의 비밀번호는 " + pw + "입니다.");
			}

			@Override
			public void update(String id, String pw) {
				System.out.println(id + "의 비밀번호가 " + pw + "로 변경되었습니다.");
			}

			@Override
			public void delete(String id) {
				System.out.println(id + "계정이 삭제되었습니다.");
			}
			
		
	};
	dao.create(id,  pw);

}
}
