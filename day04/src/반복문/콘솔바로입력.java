package �ݺ���;

import java.util.Scanner;

public class �ֹܼٷ��Է� {

	public static void main(String[] args) {
		// ��ĳ�� Scanner (�Է¿�, file, Ű����, ��Ʈ��ũ, etc)
		// String --> int ��ɾ ������ ����
		Scanner sc = new Scanner(System.in); // �ý����� ���� �⺻ ��ǲ: Ű����
		System.out.print("����� ���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		System.out.println("����� ���̴� " + age + "�� �Դϴ�.");
		System.out.println("���⿡ ����� " + (age + 1) + "���� �˴ϴ�.");
	}

}
