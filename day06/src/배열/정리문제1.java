package �迭;

import java.util.Scanner;

public class ��������1 { //���� ī�� �����̵�, �迭 ���� ���� 1 ~ 4

	public static void main(String[] args) {
		int[] num = {10, 20, 30, 40, 50};
		System.out.println(num[0] + num[1]);
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		String[] subject = new String[3];
		
		for (int i = 0; i < subject.length; i++) {
			System.out.print("���� �Է� : ");
			subject[i] = sc.next();
		}
		System.out.print("**" + subject[0] + "���ٴ� " + subject[1] + "**");
		System.out.println();
		
		int[] num1 = {11, 22, 33, 44};
		
		for (int i = 0; i < num1.length; i++) {
			if (num[i] == 33) {
				System.out.println(i);
			}
		}
		
		int[] num2 = new int[5];
		
		for (int i = 0; i < num2.length; i++) {
			System.out.print("���� �Է� : ");
			num2[i] = sc.nextInt();
		}
		
		for (int i = 0; i < num2.length; i++) {
			System.out.print(num[i] + " ");
		}
		
		
	}

}
