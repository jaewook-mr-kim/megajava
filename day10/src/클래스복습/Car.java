package 클래스복습;

public class Car {
	// 특징 (응집도에 신경 써서)
		// 성질 => 멤버 변수, 전역변수 (자동 초기화)
		String wheel; // 바퀴 모양
		int speed; // 속도
		
		public Car (String wheel, int speed) {  // 생성자 메소드는 반환을 표기하지 않는다. 모두다 void. 단, 클래스 이름과 동일하게 만들어야 한다.
			this.wheel = wheel;
			this.speed = speed;
		}
		
		
		// 동작 => 멤버 메소드 (함수), 입력값, 반환값 유무, 매개변수
		// 매개변수 = 파라미터 (parameter)
		public void speedUp(int speed) { //ex) speedUp(50)
			this.speed = this.speed + speed; // 전역변수라는 걸 알려주기 위해 this.를 붙임. 
			System.out.println("속도를 UP!");
		}
		
		public int nowSpeed() {
			return speed;
		}
		
		public void speedDown()	{
			System.out.println("속도를 DOWN!");
		}


		@Override
		public String toString() {
			return "Car [wheel=" + wheel + ", speed=" + speed + "]";
		}
		
		// public String toString() {
		// 	return speed + ", " + wheel;
		// }
		// source, generate toString 기능을 이용하면 더 간편하게 이용할 수 있음.

}
