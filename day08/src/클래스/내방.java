package Ŭ����;

public class ���� {

	public static void main(String[] args) {
		������ ��1 = new ������();
		������ ��2 = new ������();
		��1.color = "Ȳ��";
		��1.name = "�޸�";
		��1.bark(); //�Լ� ���! �޼ҵ� ��, ȣ��
		��1.shake();
		System.out.println("�̸��� " + ��1.name);
		System.out.println("���� " + ��1.color);
		
		��2.color = "���";
		��2.name = "�鱸";
		��2.bark();
		��2.shake();
		System.out.println("�̸��� " + ��2.name);
		System.out.println("���� " + ��2.color);
		
		�ڵ��� �� = new �ڵ���();
		��.company = "����";
		��.model = "x";
		��.color = "������";
		��.number = "01012341234";
		��.ring();
	} 

}
