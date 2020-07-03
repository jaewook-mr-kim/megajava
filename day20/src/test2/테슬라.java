package test2;

public abstract class 테슬라 implements Car {
	// 테슬라 Class: 설계도에 꼭 있어야 하는 기능을 구현한 class
	// Car interface: 꼭 있어야 하는 기능을 정의
	// 추상클래스는 인터페이스와는 달리 일반 변수 사용 가능
	// 추상메소드, 일반메소드, 일반변수
	//추상메소드 (강제성)
	
	public abstract void 싣다();
	
	@Override
	public void run() {
		System.out.println("전기로 달리다.");
		// 예외처리를 하고 싶은 경우,
		// try ~ catch, throws 중 하나
		// 메소드를 재정의하는 경우, throws 사용 불가
		
		try {
			System.out.println(300/0);
		} catch (Exception e) {
			System.out.println("에러가 발생하여 처리함.");
	}
	}
}
