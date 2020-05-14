package 연산자;

public class 산술연산자 {

	public static void main(String[] args) {
		int num1 = 200;
		int num2 = 100;
		
		// System.out.println("Addition : " + num1 + num2); 더한 값이 200100 이 됨
		System.out.println("Addition                  : " + (num1 + num2)); // 오류 해결 방법
		// System.out.println("Subtraction : " + num1 - num2); 오류가 뜸
		System.out.println("Subtraction               : " + (num1 - num2)); // 오류 해결 방법
		System.out.println("Multiplication            : " + num1 * num2);
		System.out.println("Division                  : " + num1 / num2);
		System.out.println("Remainder of the division : " + num1 % num2); // 나머지 연산자
		// ()를 명확하게 넣어주는 것이 좋음
		// 산술 연산자 (사칙연산 + 나머지 연산)
	}

}
