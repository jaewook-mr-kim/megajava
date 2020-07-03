package test2;

public class 테슬라공장 {

	public static void main(String[] args) {
		// 추상클래스는 변수의 타입으로 쓸 수 있다.
		// 업캐스팅해서 쓸 수 있다.
		// 인터페이스도 변수의 타입으로 쓸 수 있다.
		테슬라 truck = new 테슬라트럭();
		테슬라 bus = new 테슬라버스();
		
		truck.run();
		truck.싣다();
		
		bus.run();
		bus.싣다();
		
	}
}
