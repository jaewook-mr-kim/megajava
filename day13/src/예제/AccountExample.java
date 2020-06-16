package 예제;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList list = new ArrayList();
		while (true) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택: ");
			int choice = sc.nextInt();
			if (choice == 5) {
				System.out.println("이용해주셔서 감사합니다.");
				System.out.println("프로그램 종료");
				System.exit(0);
			} else if (choice == 1) { // 계좌 객체 생성 후, list에 추가처리
				System.out.println("----------------");
				System.out.println("    계 좌 생 성        ");
				System.out.println("----------------");
				System.out.print("계좌번호: ");
				String no = sc.next();
				System.out.print("계좌주: ");
				String name = sc.next();
				System.out.print("초기입금액: ");
				double money = sc.nextDouble();
				
				Account a = new Account(no, name, money);
				list.add(a);
			} else if (choice == 2) {
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
			} else if (choice == 3) {
				System.out.println("----------------");
				System.out.println("      예 금            ");
				System.out.println("----------------");
				System.out.print("계좌번호: ");
				String no = sc.next();
				// int index = Integer.parseInt(no);
				// Account a = (Account)list.get(index-1);
				int index = 0; // list내의 계좌위치
				for (int i = 0; i < list.size(); i++) {
					Account a = (Account)list.get(i);
					if(a.no.equals(no)) {
						index = i;
					}
				}
				Account a = (Account)list.get(index);
				System.out.print("예금액: ");
				int input = sc.nextInt();
				a.money = a.money + input;
				System.out.println("예금처리 완료.");
			} else if (choice == 4){
				System.out.println("----------------");
				System.out.println("      출 금           ");
				System.out.println("----------------");
				System.out.print("계좌번호: ");
				String no = sc.next();
				// int index = Integer.parseInt(no);
				// Account a = (Account)list.get(index-1);
				int index = 0; // list내의 계좌위치
				for (int i = 0; i < list.size(); i++) {
					Account a = (Account)list.get(i);
					if(a.no.equals(no)) {
						index = i;
					}
				}
				Account a = (Account)list.get(index);
				System.out.print("출금액: ");
				int output = sc.nextInt();
				a.money = a.money - output;
				System.out.println("출금처리 완료.");
			} else {
				System.out.println("잘못된 입력입니다.");
				System.out.println("다시 선택해주세요.");
			}
		} // while end
	} // main
} // class
