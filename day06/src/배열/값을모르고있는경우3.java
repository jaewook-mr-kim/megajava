package �迭;

import java.util.Scanner;

public class �����𸣰��ִ°��3 {
	public static void main(String[] args) {
		//Ű����� �ֿܼ��� �Է� ���� �� �ִ� ��ǰ �ʿ�.
		Scanner sc = new Scanner(System.in);
		int[] data = new int[5];
		
		for (int i = 0; i < data.length; i++) { // shift + alt + z : surround with ~
			System.out.print("���� �Է� : ");
			data[i] = sc.nextInt();
		}
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		
		int sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum = sum + data[i];
		}
		System.out.println(sum); //���ı���
		System.out.println((double)sum / data.length); // ��Ʈ ��Ʈ ����� ����� �׻� ��Ʈ. ���� ��Ȯ�� ���� ������. �ϳ��� �����̸� ����� ����.
														// ������ ����� �ٲ��ִ� ���� -> cpu�� ����Ҷ��� ��� �ٲٴ� ��. ���� ���ı���
		
	}
}