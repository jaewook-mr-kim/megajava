package 클래스;

public class Tv {
	//멤버변수, 전역변수 (자동 초기화)
	int ch; // 변수는 선언된 위치가 사용할 수 있는 영역
	boolean onOff; // ch = 0, onOff = false 로 자동 초기화
	
	// 객체가 생성될 때 마다 자동으로 사용! (자동 호출)
	// 생성자 메소드
	public Tv(int x, boolean y) { //default가 void이다.
		ch = x;
		onOff = y;
	}
	
	//멤버메소드
	public void on() {
		System.out.println("Tv를 켜다.");
	}
	
	public void off()	{
		System.out.println("Tv를 끄다.");
	}
	
	public String toString( ) { //재정의 (override, 오버라이딩)
		return "채널은 " + ch + ", 전원은 " + onOff;
	}
}
