package 배열심화;

import java.util.Random;

public class 시험점수확인 {

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
		// 답안지 생성
		
		int[] student = answer.clone();
		for (int i = 0; i < 300; i++) {
			int index = r.nextInt(300);
			int guess = r.nextInt(4) + 1;
			student[index] = guess;
		}
		// 몇 개나 틀렸는지 찾아보자
		// 어떤 문항이 틀렸는지 문항과 정답/답안 비교출력
		// 하나당 1점이라고 한다면, 몇점인지 프린트!
		
		for (int i = 0; i < answer.length; i++) {
			if (answer[i] == student[i]) {
				grade++;
			}
		}
		
		for (int i = 0; i < student.length; i++) {
			System.out.println((i + 1) + " : " + answer[i] + ", " + student[i]);
		}
		
		System.out.println("맞은 갯수 : " + grade);
		System.out.println("틀린 갯수 : " + (1000 - grade));
	}

}
