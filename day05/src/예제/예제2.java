package ����;

import java.util.Scanner;

public class ����2 {
	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		int choice;
		int choice2;
		int iu = 0;
		int js = 0;
		int bf = 0;
		int chance = 5;
		
		System.out.println("----------------[��ǥ]-------------------");
		System.out.println("1. ������ | 2. ���缮 | 3. ��ź�ҳ�� | 4. ����");
		System.out.println("���� ��ǥ �� : " + chance + "��");
		System.out.println("----------------------------------------");
		
		while (run) {
			
			System.out.print("��ǥ�ϼ���! : ");
			choice = sc.nextInt();
			
			if (choice == 1) {
				iu = iu + 1;
				chance = chance - 1;
			} else if (choice == 2) {
				js = js + 1;
				chance = chance - 1;
			} else if (choice == 3) {
				bf = bf + 1;
				chance = chance - 1;
			} else {
				if (chance > 0) {
					System.out.println("��ǥ ��ȸ�� ���� " + chance + "�� ���ҽ��ϴ�.");
					System.out.println("�׷��� �����Ͻðڽ��ϱ�? (1. �� | 2. �ƴϿ�)");
					System.out.print("���� : ");
					choice2 = sc.nextInt();
					
					if (choice2 == 1) {
						System.out.println("----------------------------------------");
						System.out.println("                [��ǥ ���]                ");
						System.out.println("       1. ������      : " + iu + "ǥ");
						System.out.println("       2. ���缮      : " + js + "ǥ");
						System.out.println("       3. ��ź�ҳ�� : " + bf + "ǥ");
						System.out.println("----------------------------------------");
						System.out.println("��ǥ�� �����մϴ�.");
						System.exit(0);
						} else {
						System.out.println("��ǥ�� ��� �����մϴ�.");
						}
					
				} else {
					System.out.println("----------------------------------------");
					System.out.println("                [��ǥ ���]                ");
					System.out.println("       1. ������      : " + iu + "ǥ");
					System.out.println("       2. ���缮      : " + js + "ǥ");
					System.out.println("       3. ��ź�ҳ�� : " + bf + "ǥ");
					System.out.println("----------------------------------------");
					System.out.println("��ǥ�� �����մϴ�.");
					System.exit(0);
				}
				
			}
		if (chance == 0) {
			System.out.println("��ǥ ��ȸ�� ��� �����Ǿ����ϴ�.");
			System.out.println("----------------------------------------");
			System.out.println("                [��ǥ ���]                ");
			System.out.println("       1. ������      : " + iu + "ǥ");
			System.out.println("       2. ���缮      : " + js + "ǥ");
			System.out.println("       3. ��ź�ҳ�� : " + bf + "ǥ");
			System.out.println("----------------------------------------");
			System.out.println("��ǥ�� �����մϴ�.");
			System.exit(0);
		}
		}
	}
}
