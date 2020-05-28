package 배열심화;

import java.util.Random;

public class 응용문제2 {

	public static void main(String[] args) {
		
		int[] grade1 = new int[300];
		Random r = new Random(5); //씨앗값, seed값
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
		
		System.out.println("1학기 수학 점수 평균 : " + (sum1 / grade1.length));
		
		for (int i = 0; i < grade2.length; i++) {
			sum2 = sum2 + grade2[i];
		}
		
		System.out.println("2학기 수학 점수 평균 : " + (sum2 / grade2.length));
		
		if (sum1 / grade1.length > sum2 / grade2.length) {
			System.out.println("1학기 평균이 더 높음.");
		} else if (sum1 / grade1.length == sum2 / grade2.length){
			System.out.println("두 학기 평균이 동일함.");
		} else {
			System.out.println("2학기 평균이 더 높음.");
		}
		
	}

}
