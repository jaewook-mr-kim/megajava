package ����;

public class �������� {

	public static void main(String[] args) {
		// ����
		int hour = 7;
		
		// �Ǽ�
		double min = 0.49;
		
		// ����
		char day = 'ȭ';
		
		// ��
		boolean lecture = true;
		
		System.out.println("���� �ð��� " + hour);
		System.out.println("���� ���� " + min);
		System.out.println("������ " + day + "����");
		System.out.println("���ǰ� �ֽ��ϱ�?: " + lecture); // system.out.print ���� " . " �� ���� �����ڶ�� �θ���
		
		// �⺻�� �̿��� ������, Ư���ϰ� �⺻��ó�� ����� ���� ��.
		String name = "ȫ�浿";
		
		//**********************************************************************************************
		
		int num1 = 200;
		int num2 = 100;
		
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 <= num2);
		
		String n1 = "ȫ�浿";
		String n2 = "�ڱ浿";
		
		System.out.println(n1.equals(n2)); // �⺻�� �����Ͱ� �ƴϱ� ������ �񱳸� ���ؼ� ��ǰ ���
	
		if (n1.equals(n2)) { //true
			System.out.println("�������̽ñ���!");
		} else { //false
			System.out.println("�������� �ƴϽñ���!");

		}
	}

}
