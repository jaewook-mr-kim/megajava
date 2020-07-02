package 인터페이스;

public interface 테슬라우주선 extends 우주선, 비행기 {
	
	// 일반 변수는 쓸 수 없다.
	public final String NAME = "테슬라"; // 상수만 올 수 있음!
	// 메소드 2개를 이미 가지고 시작함.
	// 인터페이스도 상속 가능.
	// 인터페이스는 다중 상속 가능.
	// public abstract는 생략 가능
	public abstract void jump(); // 완벽하지 않은 메소드 정의 (abstract)는 디폴트 값이기 때문에 안적어줘도 됨. 인페이스 안의 메소드는 전부 추상 메소드.
	// 완벽하지 않음 == abstract (추상적)
	// 완벽하지 않은 메소드 == 추상 메소드
	// 인터페이스는 추상메소드만 들어갈 수 있다.
	
}
