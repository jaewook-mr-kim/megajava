package �迭��ȭ;

public class �迭���� {

	public static void main(String[] args) {
		// int x = 100;
		// int y = x; // �⺻���� ����
		// x : 100 y : 100
		// x = 200; // x : 200 y : 100
		// y�� �״����.
		
		int[] x = {100, 200, 300};
		int[] y = x; // �������� ����
		for (int i = 0; i < y.length; i++) {
			System.out.println("x : " + x[i] + ", " + "y : " + y[i]);
		}
		
		x[0] = 999;
		
		for (int i = 0; i < y.length; i++) {
			System.out.println("x : " + x[i] + ", " + "y : " + y[i]);
		} // y�� x�� ���� �ٲ�.
		
		System.out.println("���� ����x�ּ�: " + x);
		System.out.println("���� ����y�ּ�: " + y);
		// ������ �ּ�
		
		System.out.println("-----------------------");
		
		int[] a = {100, 200, 300};
		int[] b = a.clone();
		System.out.println("���� ����a�ּ�: " + a);
		System.out.println("���� ����b�ּ�: " + b);
		
		// �ּ� �ٸ�
		
		a[0] = 999;
		
		for (int i = 0; i < b.length; i++) {
			System.out.println("a : " + a[i] + ", " + "b : " + b[i]);
		} // b�� a���� �ȹٲ�
	}

}
