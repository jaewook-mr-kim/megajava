package ������;

import java.util.Date;

public class ������ {

	public static void main(String[] args) {
		���� cal = new ����();
		// �޼ҵ� �����ε��� ������ �Է°����� �Ѵ�.
		// Ÿ��, ����, ����
		int result1 = cal.add(100, 200);
		System.out.println(result1);
		
		double result2 = cal.add(100, 200.2);
		System.out.println(result2);
		
		double result3 = cal.add(100.1, 200.2);
		System.out.println(result3);
		
		String result4 = cal.add(100, "��");
		System.out.println(result4);
		
		String result5 = cal.add("�ȳ�", "�ϼ���");
		System.out.println(result5);
		
		int[] result6 = cal.add();
		for (int x : result6) {
			System.out.println(x);
		}
		
		Date result7 = cal.add(100);
		System.out.println(result7.getHours());

	}

}
