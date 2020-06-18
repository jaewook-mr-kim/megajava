package 상속;

public class BadBank extends Bank {

	
	
	 public BadBank() {
		super(); //기본값
		//부모클래스 객체부터 먼저 생성되어야 한다.
		//super() 기본생성자는 안써줘도 무조건
		//부모클래스의 기본생성자가 호출!
		//명시적으로 서주어야하는 경우에는
		//다른 처리보다 먼저 기본생성자가 호출되도록 해야한다.
		
	}
		@Override
		public void interest() {
			System.out.println("10%의 이자를 받다.");
		}
}
