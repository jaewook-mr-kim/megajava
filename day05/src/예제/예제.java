package ����;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) { // ���� �����
		boolean run = true;
		double balance = 0;
		Scanner sc = new Scanner(System.in);
		int choice;
		double deposit;
		double withdrawal;
		
		while (run) {
			System.out.println("-------------------------------------------------------");
			System.out.println("1. Deposit | 2. Withdrawal | 3. Balance | 4. Terminate ");
			System.out.println("-------------------------------------------------------");
			System.out.print("Select Option : "); // �⺻ �޴�
			choice = sc.nextInt();
			
			if (choice == 1) { // ����
				System.out.print("Deposit money to your account balance : ");
				deposit = sc.nextDouble();
				balance = balance + deposit;
			} else if (choice == 2) { // ���
				System.out.print("Withdraw money from your account balance : ");
				withdrawal = sc.nextDouble();
				balance = balance - withdrawal;
			} else if (choice == 3) { // �ܰ�Ȯ��
				System.out.printf("Your account balance is %.2f GBP %n", balance); // ����Ʈ ����ƽ, ����Ʈ ������ ����. �ڼ��Ѱ� �ڹ� printf ���۸�
			} else { // �ý��� ����
				System.out.println("Thank you for using Barclays. :)");
				System.out.println("System Terminated.");
				System.exit(0);
			}
		}
	}
}
