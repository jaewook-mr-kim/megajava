package 클래스;

public class 강아지 {
// 강아지 => class
// - 색, 이름 => 멤버변수 (클래스를 만들때 사용되는 변수들), 선언은 변수의 생존 범위 (전역변수, global)
	String color;
	String name;
	
// - 짖다, 꼬리를 흔들다 => 멤버메소드 (함수)
	public void bark() {
		System.out.println("강아지가 짖다.");
	}
	
	public void shake() {
		System.out.println("꼬리를 흔들다.");
	}
}
