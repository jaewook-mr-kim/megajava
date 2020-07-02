package 인터페이스;

public class CarUser {

	public static void main(String[] args) {
		AppleCar car = new AppleCar();
		car.speedUp();
		car.speedDown();
		car.stop();
		
		BananaCar car2 = new BananaCar();
		car2.speedUp();
		car2.speedDown();
		car2.stop();
		
		//인터페이스는 업캐스팅 할 수 있다.
		Car car3 = new BananaCar();
		car3.speedUp();
		
		//인터페이스 자체는 객체를 생성할 수 없다.
		// Car car = new Car();
	}

}
