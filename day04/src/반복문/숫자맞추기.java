package 반복문;

import java.util.Random;

import javax.swing.JOptionPane;

public class 숫자맞추기 {

	public static void main(String[] args) {
		//값을 랜덤으로 만들어주는 부품을 써보자
		int count = 1;
		Random r = new Random();
		int target = r.nextInt(100); // int의 범위는 -21억 ~ 21억. (100) 을 넣으면 0~99까지만 생성함.
		
		while (true) { // 드래그로 선택 후, source -> surround with
			String data = JOptionPane.showInputDialog("숫자입력");
			int guess = Integer.parseInt(data); // "88" -> String을 int로 변환
			if (target == guess) {
				System.out.println("정답입니다.");
				System.out.println(count + "번 만에 맞추셨습니다.");
				System.out.println("시스템을 종료합니다.");
				break;
			} else {
				System.out.println("정답이 아닙니다.");
				System.out.println("현재 " + count + "번째 시도입니다.");
				count = count + 1;
				//입력한 값이 정답보다 큰지 작은지 힌트를 주기
				if (guess > target) { // 정답이 더 작을 때
					System.out.println("정답은 " + guess + "보다 더 작습니다.");
				} else {
					System.out.println("정답은 " + guess + "보다 더 큽니다.");
				}
				System.out.println("------------------------------------");
			} 
		}
	}
}
