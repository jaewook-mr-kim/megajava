package 연산자;

public class 비교연산자 {

	public static void main(String[] args) {
		int num1 = 200;
		int num2 = 100;
		System.out.println(num1 == num2); // 값이 같은지 물어보는 것 true or false 형태로 표현됨
		System.out.println(num1 != num2); // 값이 다른지 물어보는 것
		System.out.println(num1 > num2);
		System.out.println(num1 >= num2);
		
		// 비교 연산자는 보통 제어문과 함께 쓴다
		// 비교 연산자의 결과는 논리형이다
		
		int money = 10000;
		if (money >= 15000) {
			System.out.println("Thank you!");
		} else {
			System.out.println("That's not enough...");
		}
	}

}
