package �迭��ȭ;

public class ���빮�� {

	public static void main(String[] args) {
		// 1�б� ���� ����: 100, 88, 96
		// 2�б� ���� ������ ù �л��� 100������ 99������ ����
		// �� �б��� ������ ����Ʈ �� ��� ��
		
		double[] grade1 = {100, 88, 96};
		double[] grade2 = grade1.clone();
		double sum1 = 0;
		double sum2 = 0;
		
		grade2[0] = 99;
		
		for (int i = 0; i < grade1.length; i++) {
			sum1 = sum1 + grade1[i];
		}
		
		System.out.println("1�б� ���� ���� ��� : " + (sum1 / grade1.length));
		
		for (int i = 0; i < grade2.length; i++) {
			sum2 = sum2 + grade2[i];
		}
		
		System.out.println("2�б� ���� ���� ��� : " + (sum2 / grade2.length));
		
		if (sum1 / grade1.length > sum2 / grade2.length) {
			System.out.println("1�б� ����� �� ����.");
		} else if (sum1 / grade1.length == sum2 / grade2.length){
			System.out.println("�� �б� ����� ������.");
		} else {
			System.out.println("2�б� ����� �� ����.");
		}
		
	}

}
