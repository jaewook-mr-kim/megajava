package 예외처리;

public class 예외처리연습 {

	public static void main(String[] args) {
		int[] num = {1, 2};
		
		계산기 cal = new 계산기();
		
		cal.mul(num);
		
		try {
			cal.div3(num);
		} catch (Exception e) {
			System.out.println("에러가 발생하여 처리함.");
		}
	}

}
