package ����;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList list = new ArrayList();
		while (true) {
			System.out.println("------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("------------------------------------------");
			System.out.print("����: ");
			int choice = sc.nextInt();
			if (choice == 5) {
				System.out.println("�̿����ּż� �����մϴ�.");
				System.out.println("���α׷� ����");
				System.exit(0);
			} else if (choice == 1) { // ���� ��ü ���� ��, list�� �߰�ó��
				System.out.println("----------------");
				System.out.println("    �� �� �� ��        ");
				System.out.println("----------------");
				System.out.print("���¹�ȣ: ");
				String no = sc.next();
				System.out.print("������: ");
				String name = sc.next();
				System.out.print("�ʱ��Աݾ�: ");
				double money = sc.nextDouble();
				
				Account a = new Account(no, name, money);
				list.add(a);
			} else if (choice == 2) {
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
			} else if (choice == 3) {
				System.out.println("----------------");
				System.out.println("      �� ��            ");
				System.out.println("----------------");
				System.out.print("���¹�ȣ: ");
				String no = sc.next();
				// int index = Integer.parseInt(no);
				// Account a = (Account)list.get(index-1);
				int index = 0; // list���� ������ġ
				for (int i = 0; i < list.size(); i++) {
					Account a = (Account)list.get(i);
					if(a.no.equals(no)) {
						index = i;
					}
				}
				Account a = (Account)list.get(index);
				System.out.print("���ݾ�: ");
				int input = sc.nextInt();
				a.money = a.money + input;
				System.out.println("����ó�� �Ϸ�.");
			} else if (choice == 4){
				System.out.println("----------------");
				System.out.println("      �� ��           ");
				System.out.println("----------------");
				System.out.print("���¹�ȣ: ");
				String no = sc.next();
				// int index = Integer.parseInt(no);
				// Account a = (Account)list.get(index-1);
				int index = 0; // list���� ������ġ
				for (int i = 0; i < list.size(); i++) {
					Account a = (Account)list.get(i);
					if(a.no.equals(no)) {
						index = i;
					}
				}
				Account a = (Account)list.get(index);
				System.out.print("��ݾ�: ");
				int output = sc.nextInt();
				a.money = a.money - output;
				System.out.println("���ó�� �Ϸ�.");
			} else {
				System.out.println("�߸��� �Է��Դϴ�.");
				System.out.println("�ٽ� �������ּ���.");
			}
		} // while end
	} // main
} // class
