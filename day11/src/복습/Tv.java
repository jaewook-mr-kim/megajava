package 복습;

public class Tv {
	int channel; // 멤버변수, 전역변수 (자동 초기화)
	int volume; // 메소드 영역 (원본이 들어가는 영역) -> 객체가 생성될때 힙영역으로 복사
	boolean onOff;
	static int count; // 정적변수 -> 메소드 영역 (스태틱 영역) - 스택 영역에서 이 변수를 접근하여 사용할 수 있다.
	
	// 생성자 오버로딩, 입력값만 다르게 하면 메소드 이름을 동일하게 쓸 수 있다.
	public Tv(int channel, int volume, boolean onOff) {
		count++;

		this.channel = channel;
		this.volume = volume;
		this.onOff = onOff;
	}

	@Override
	public String toString() {
		return "Tv [channel=" + channel + ", volume=" + volume + ", onOff=" + onOff + "]";
	}
	
	
	
	
}
