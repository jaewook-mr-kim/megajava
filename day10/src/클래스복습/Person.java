package 클래스복습;

public class Person {

	public static void main(String[] args) {
		Car car = new Car("금관모양", 150); //개체 생성시 클래스 이름과 동일한 메소드는 자동호출됨. 생성자.
		// car.wheel = "금관모양";
		// car.speed = 150;
		System.out.println("현재속도: " + car.nowSpeed());
		car.speedUp(50);
		System.out.println("up후 현재속도: " + car.nowSpeed());
		car.speedDown();
		System.out.println(car);
	}

}
