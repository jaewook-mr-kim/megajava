package 배열심화;

import java.util.Scanner;

public class 극장예매 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] seat = new int[10];
		// 배열은 자동 초기화, int=>0으로 초기화
		// 예매가 되는 자리는 1로 변경
		int count = 0;
		
		while (true) {
			System.out.println("---------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + 1 + " "); // 0번부터 말고 1번부터 뜨게 하기 위해서
			}
			System.out.println();
			System.out.println("---------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + " ");
			}
			System.out.println();
			System.out.println("---------------------");
			System.out.print("예매할 번호 입력 (종료: -1) >> ");
			int number = sc.nextInt();
			if (number == - 1) {
				System.out.println("예매를 종료합니다!");
				System.out.println("예매한 좌석의 수 : " + count);
				break;
			}
			
			if (seat[number - 1] == 0) {
				seat[number - 1] = 1;
				System.out.println("예매완료!");
				count++;
			} else {
				System.out.println("이미 예매된 좌석입니다. 다른 좌석을 선택해주세요.");
			}
	
		}
		
		System.out.println("---------------------");
		System.out.println("결제를 진행합니다.");
		
		
	}

}
