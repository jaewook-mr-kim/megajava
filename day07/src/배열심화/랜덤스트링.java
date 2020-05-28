package 배열심화;

import java.util.Random;

public class 랜덤스트링 {

	public static void main(String[] args) {
		String[] food = {"감자", "고구마", "양파", "당근", "대파"};
		Random r = new Random();
		int choice = r.nextInt(5);
		System.out.println("내가 아무거나 선택한 것은 " + food[choice]); // 인덱스는 랜덤처리 가능하기 때문에 스트링의 랜덤처리는 배열을 쓴다.
	}

}
