package 상속;

public class 슈퍼맨 extends 맨 {
	//변수 3개, 메소드 2개를 이미 가지고 있음.
	
	boolean sky;
	
	public void space() {
		System.out.println(name + "우주를 날다.");
	}

	@Override
	public String toString() {
		return "슈퍼맨 [sky=" + sky + ", power=" + power + ", name=" + name + ", age=" + age + "]";
	}
	
	@Override // annotation
	// 의미없는 확인용도
	// 의미있는 특정한 처리 용도
	public void run() {
		System.out.println("빛의 속도로 달리다."); // 오버라이딩
	}
	
	
}
