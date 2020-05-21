package 반복문;

import java.util.Scanner;

public class 콘솔바로입력과목 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System. in);
		System.out.print("좋아하는 과목을 입력하세요 : ");
		String data = sc.next(); //한 단어, nextLine(); 한줄
		
		switch (data) {
		case "java":
			System.out.println("JSP로 점프");
			break;
		case "python":
			System.out.println("장고로 점프");
			break;
		default:
			System.out.println("무조건 열심히!");
			break;
		} // 스위치 케이스는 자체 브레이크가 없기 때문이 일일히 달아줘야 함.
		
		
		
	}

}
