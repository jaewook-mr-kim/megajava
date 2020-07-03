package 예외처리;

public class 예외발생1 {
	public static void main(String[] args) {
		int num = 30;
		System.out.println("에러 발생 전... 처리 내용...");
		try { // 에러가 발생할 것 가은 코드
			System.out.println(num/0);
		} catch (Exception e) {
			// 에러가 발생하면 어떻게 처리할지
		}
		System.out.println("에러 발생 후... 처리 내용...");
	}
}
