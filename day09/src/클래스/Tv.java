package Ŭ����;

public class Tv {
	//�������, �������� (�ڵ� �ʱ�ȭ)
	int ch; // ������ ����� ��ġ�� ����� �� �ִ� ����
	boolean onOff; // ch = 0, onOff = false �� �ڵ� �ʱ�ȭ
	
	// ��ü�� ������ �� ���� �ڵ����� ���! (�ڵ� ȣ��)
	// ������ �޼ҵ�
	public Tv(int x, boolean y) { //default�� void�̴�.
		ch = x;
		onOff = y;
	}
	
	//����޼ҵ�
	public void on() {
		System.out.println("Tv�� �Ѵ�.");
	}
	
	public void off()	{
		System.out.println("Tv�� ����.");
	}
	
	public String toString( ) { //������ (override, �������̵�)
		return "ä���� " + ch + ", ������ " + onOff;
	}
}
