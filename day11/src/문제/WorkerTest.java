package ����;

public class WorkerTest {

	public static void main(String[] args) {
		Worker wk1 = new Worker("�Ӿƹ���", "��", 24);
		Worker wk2 = new Worker("��ƹ���", "��", 23);
		Worker wk3 = new Worker("�ھƹ���", "��", 25);
		
		System.out.println("��ü ���� ���� " + Worker.count);
		System.out.println("�������� ��� ���̴� " + (Worker.totalAge / Worker.count));
		System.out.println("ù ��° ������ �̸��� " + wk1.getName());
	}

}
