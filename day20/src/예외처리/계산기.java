package 예외처리;

public class 계산기 {
	
	public void div (int n) {
		try {
			System.out.println(n/0);
		} catch (Exception e) {
			System.out.println("에러처리함.");
		}
		// 1. 예외처리가 발생한 장소에서 바로 처리
		// try ~ catch
		// 2. 예외처리할 메소드를 호출한 곳으로 떠넘기는 방법
		
	}
	
	public void div2 (int n) throws Exception {
		System.out.println(n/0);
	}
	
	
	public void mul (int[] n) {
		try {
			System.out.println(n[2]);
		} catch (Exception e) {
			System.out.println("에러가 발생하여 처리함.");
		}
	}
	
	public void div3 (int[] n) throws Exception {
		System.out.println(n[2]);
	}
}
