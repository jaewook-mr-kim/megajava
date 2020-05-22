package 예제;

import java.util.Scanner;

public class 예제 {

	public static void main(String[] args) { // 통장 만들기
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
			System.out.print("Select Option : "); // 기본 메뉴
			choice = sc.nextInt();
			
			if (choice == 1) { // 예금
				System.out.print("Deposit money to your account balance : ");
				deposit = sc.nextDouble();
				balance = balance + deposit;
			} else if (choice == 2) { // 출금
				System.out.print("Withdraw money from your account balance : ");
				withdrawal = sc.nextDouble();
				balance = balance - withdrawal;
			} else if (choice == 3) { // 잔고확인
				System.out.printf("Your account balance is %.2f GBP %n", balance); // 프린트 포메틱, 프린트 형식을 정함. 자세한건 자바 printf 구글링
			} else { // 시스템 종료
				System.out.println("Thank you for using Barclays. :)");
				System.out.println("System Terminated.");
				System.exit(0);
			}
		}
	}
}
