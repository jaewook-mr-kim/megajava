package 배열;

import java.util.Random;

public class 랜덤한값1000개넣기 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] num = new int[1000];
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000); // 0~999
		}
		
		// for (int x : num) {
			// System.out.println(x);
		// }
		for (int i = 0; i < num.length; i++) {
			System.out.println(i + ": " + num[i]);
		}
		
		System.out.println("=====================================================");
		
		for (int i = 0; i < num.length; i++) {
			// 1. 배열의 해당 인덱스에 들어있는 값을 가지고 와서 찾고자 하는 값과 일치하는지 체크
			// 2. 일치한다면, 해당 인덱스를 프린트
			if (num[i] == 492) {
				System.out.println(i);
			}
		}
	}

}
