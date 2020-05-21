package 반복문;

import java.util.Scanner;

public class 콘솔바로입력숫자 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println(num1 + "이 " + num2 + "보다 더 큽니다.");
		} else if (num1 < num2) {
			System.out.println(num1 + "이 " + num2 + "보다 더 작습니다.");
		} else {
			System.out.println("두 숫자는 같습니다.");
		}
	}
}
