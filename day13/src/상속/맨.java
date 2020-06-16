package 상속;

public class 맨 extends 사람 {
	// 변수2개 메소드1개를 이미 가지고 있다.
	int power;
	
	public void run() {
		eat();
		System.out.println(name + "이(가) 빨리 달리다.");
	}
}
