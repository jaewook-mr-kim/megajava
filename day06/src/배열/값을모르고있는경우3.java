package 배열;

import java.util.Scanner;

public class 값을모르고있는경우3 {
	public static void main(String[] args) {
		//키보드로 콘솔에서 입력 받을 수 있는 부품 필요.
		Scanner sc = new Scanner(System.in);
		int[] data = new int[5];
		
		for (int i = 0; i < data.length; i++) { // shift + alt + z : surround with ~
			System.out.print("숫자 입력 : ");
			data[i] = sc.nextInt();
		}
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		
		int sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum = sum + data[i];
		}
		System.out.println(sum); //비파괴형
		System.out.println((double)sum / data.length); // 인트 인트 계산의 결과는 항상 인트. 따라서 정확한 값을 못구함. 하나라도 더블이면 결과도 더블.
														// 강제로 더블로 바꿔주는 문법 -> cpu가 계산할때만 잠깐 바꾸는 것. 원본 비파괴형
		
	}
}