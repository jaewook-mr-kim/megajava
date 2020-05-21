package 반복문;

import java.util.Scanner;

public class 콘솔바로입력 {

	public static void main(String[] args) {
		// 스캐너 Scanner (입력용, file, 키보드, 네트워크, etc)
		// String --> int 명령어를 가지고 있음
		Scanner sc = new Scanner(System.in); // 시스템이 정한 기본 인풋: 키보드
		System.out.print("당신의 나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.println("당신의 나이는 " + age + "세 입니다.");
		System.out.println("내년에 당신은 " + (age + 1) + "세가 됩니다.");
	}

}
