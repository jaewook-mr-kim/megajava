package �迭��ȭ;

import java.util.Random;

public class ���빮��2 {

	public static void main(String[] args) {
		
		int[] grade1 = new int[300];
		Random r = new Random(5); //���Ѱ�, seed��
		for (int i = 0; i < grade1.length; i++) {
			grade1[i] = r.nextInt(101); // 0~100
		}
		
		int[] grade2 = grade1.clone();
		
		grade2[0] = 33;
		grade2[100] = 44;
		grade2[200] = 55;
		grade2[299] =  88;
				
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
