package 배열심화;

import java.util.Arrays;
import java.util.Random;

public class 수능수석 {

	public static void main(String[] args) {
		Random r = new Random(55);
		int[] jumsu = new int[10000];

		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(401);
		}

		// 파괴형 함수
		// Arrays.sort(jumsu); // 오름차순으로 정리시킴 (원본의 순서를 건드리므로 파괴형 함수)

		// for (int x : jumsu) {
		// System.out.println(x);
		// }
		// System.out.println("최고점수는 " + jumsu[9999] + "점 입니다."); // 줄세우고 마지막껄 찾기. 원본을
		// 파괴하는데다가 메모리를 두배로 먹어서 비효율 적일 수 있음.

		for (int x : jumsu) {
			System.out.println(x);
		}
		// 다른 방법. 이 방법을 더 선호함.
		int max = jumsu[0];
		// 전체 점수를 돌면서
		// 조건 체크 : 최고 변수 max에 넣어둔 값보다 큰가?
		// 처리 : 만약 크다면, 그 인덱스까지의 최고값이 된다는 말임으로, max = 해당값 으로 지정.

		for (int i = 0; i < jumsu.length; i++) {
			if (max < jumsu[i]) {
				max = jumsu[i];
			}
		}
		System.out.println("최고값은 " + max);

		for (int i = 0; i < jumsu.length; i++) {

			if (jumsu[i] == max) {
				System.out.println("번호 : " + (i + 1));
			}
		}
		System.out.println("인원은 ");
	}

}
