package Ŭ����;

public class ��ǻ�ͱ��� {
	public static void main(String[] args) {
		int mp = 200000;
		int cp = 300000;
		int count = 3;
		
		��ǻ�� ��ǻ�� = new ��ǻ��();
		int cost = ��ǻ��.compute(mp, cp);
		
		System.out.println("��ǻ�� �� ��� ������ " + cost + "���Դϴ�.");
		
		int tc = ��ǻ��.total(count, cost);
		
		System.out.println("��ǻ�� 3���� �� ���ź���� " + tc + "���Դϴ�.");
		
}
}