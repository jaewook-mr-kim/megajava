package �ݺ���;

import java.util.Scanner;

public class �ֹܼٷ��Է¼��� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���ڸ� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���ڸ� �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println(num1 + "�� " + num2 + "���� �� Ů�ϴ�.");
		} else if (num1 < num2) {
			System.out.println(num1 + "�� " + num2 + "���� �� �۽��ϴ�.");
		} else {
			System.out.println("�� ���ڴ� �����ϴ�.");
		}
	}
}
