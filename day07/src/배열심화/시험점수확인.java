package �迭��ȭ;

import java.util.Random;

public class ��������Ȯ�� {

	public static void main(String[] args) {
		int grade = 0;
		
		int[] answer = new int[1000];
		Random r = new Random(42);
		for (int i = 0; i < answer.length; i++) {
			answer[i] = r.nextInt(4) + 1; // 0~3 + 1 => 1~4
		}
		for (int i = 0; i < answer.length; i++) {
			System.out.println((i + 1) + " : " + answer[i]);
		}
		// ����� ����
		
		int[] student = answer.clone();
		for (int i = 0; i < 300; i++) {
			int index = r.nextInt(300);
			int guess = r.nextInt(4) + 1;
			student[index] = guess;
		}
		// �� ���� Ʋ�ȴ��� ã�ƺ���
		// � ������ Ʋ�ȴ��� ���װ� ����/��� �����
		// �ϳ��� 1���̶�� �Ѵٸ�, �������� ����Ʈ!
		
		for (int i = 0; i < answer.length; i++) {
			if (answer[i] == student[i]) {
				grade++;
			}
		}
		
		for (int i = 0; i < student.length; i++) {
			System.out.println((i + 1) + " : " + answer[i] + ", " + student[i]);
		}
		
		System.out.println("���� ���� : " + grade);
		System.out.println("Ʋ�� ���� : " + (1000 - grade));
	}

}
