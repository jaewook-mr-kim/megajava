package 배열심화;

public class 응용문제 {

	public static void main(String[] args) {
		// 1학기 수학 점수: 100, 88, 96
		// 2학기 수학 점수는 첫 학생만 100점에서 99점으로 변경
		// 두 학기의 점수를 프린트 및 평균 비교
		
		double[] grade1 = {100, 88, 96};
		double[] grade2 = grade1.clone();
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
