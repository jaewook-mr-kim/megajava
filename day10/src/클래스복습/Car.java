package Ŭ��������;

public class Car {
	// Ư¡ (�������� �Ű� �Ἥ)
		// ���� => ��� ����, �������� (�ڵ� �ʱ�ȭ)
		String wheel; // ���� ���
		int speed; // �ӵ�
		
		public Car (String wheel, int speed) {  // ������ �޼ҵ�� ��ȯ�� ǥ������ �ʴ´�. ��δ� void. ��, Ŭ���� �̸��� �����ϰ� ������ �Ѵ�.
			this.wheel = wheel;
			this.speed = speed;
		}
		
		
		// ���� => ��� �޼ҵ� (�Լ�), �Է°�, ��ȯ�� ����, �Ű�����
		// �Ű����� = �Ķ���� (parameter)
		public void speedUp(int speed) { //ex) speedUp(50)
			this.speed = this.speed + speed; // ����������� �� �˷��ֱ� ���� this.�� ����. 
			System.out.println("�ӵ��� UP!");
		}
		
		public int nowSpeed() {
			return speed;
		}
		
		public void speedDown()	{
			System.out.println("�ӵ��� DOWN!");
		}


		@Override
		public String toString() {
			return "Car [wheel=" + wheel + ", speed=" + speed + "]";
		}
		
		// public String toString() {
		// 	return speed + ", " + wheel;
		// }
		// source, generate toString ����� �̿��ϸ� �� �����ϰ� �̿��� �� ����.

}
