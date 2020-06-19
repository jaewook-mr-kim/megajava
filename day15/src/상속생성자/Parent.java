package 상속생성자;

public class Parent {
	void tv() { //기본접근제어자, 같은 패키지 안에서만 호출 가능
		System.out.println("무한!");
	}
	
	
	// 오버라이드 불가 메소드
	final void play()	{
		System.out.println("도전!");
	}
}
