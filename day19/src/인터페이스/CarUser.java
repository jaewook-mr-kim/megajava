package �������̽�;

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
		
		//�������̽��� ��ĳ���� �� �� �ִ�.
		Car car3 = new BananaCar();
		car3.speedUp();
		
		//�������̽� ��ü�� ��ü�� ������ �� ����.
		// Car car = new Car();
	}

}
