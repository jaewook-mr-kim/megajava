package ����;

public class Worker {
	String name;
	String gender;
	int age;
	
	static int count;
	static int totalAge;
	
	public Worker(String name, String gender, int age) {
		count++;
		totalAge += age;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Worker [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	// �ν��Ͻ� ������ �������� ���� �� ���
	// ��ü ���� ��, �Ϲ� �޼ҵ�� ȣ���Ͽ� ����� �� �ִ�.
	// wk1.getName(); ��, wk1 �̶�� �ּҰ� �ʿ�
	public String getName() { //�ڵ� �ϼ� ��� ������. getN + space bar + ENTER
		return name;
	}
	
	// ����ƽ ������ �������� ���� �� ���
	// ��ü ������ �����ϰ� Ŭ���� �̸����� �ٷ� �����Ͽ� ����� �� �ִ�.
	// Ŭ�����̸�.����ƽ����, Ŭ�����̸�.����ƽ�޼ҵ�
	// Worker.getTotalAge
	public static int getTotalAge() {
		return totalAge;
	}
	
	
	
}
