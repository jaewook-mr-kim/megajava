package �迭��ȭ;

import java.util.Scanner;

public class ���忹�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] seat = new int[10];
		// �迭�� �ڵ� �ʱ�ȭ, int=>0���� �ʱ�ȭ
		// ���Ű� �Ǵ� �ڸ��� 1�� ����
		int count = 0;
		
		while (true) {
			System.out.println("---------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + 1 + " "); // 0������ ���� 1������ �߰� �ϱ� ���ؼ�
			}
			System.out.println();
			System.out.println("---------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + " ");
			}
			System.out.println();
			System.out.println("---------------------");
			System.out.print("������ ��ȣ �Է� (����: -1) >> ");
			int number = sc.nextInt();
			if (number == - 1) {
				System.out.println("���Ÿ� �����մϴ�!");
				System.out.println("������ �¼��� �� : " + count);
				break;
			}
			
			if (seat[number - 1] == 0) {
				seat[number - 1] = 1;
				System.out.println("���ſϷ�!");
				count++;
			} else {
				System.out.println("�̹� ���ŵ� �¼��Դϴ�. �ٸ� �¼��� �������ּ���.");
			}
	
		}
		
		System.out.println("---------------------");
		System.out.println("������ �����մϴ�.");
		
		
	}

}
