package �迭;
	// int win = 0; // �������� (global variable)
public class �����˰��ִ°�� {
// ���� ������ ����� �ñ�: ����
// ������ ��ġ�� ������ ����
// �Լ� ���� �������� ������ �� �ִ� ����: �������� (local variable)
	public static void main(String[] args) {
		String[] names = {"ȫ�浿", "ȫ���", "ȫ����"};
		char[] gender = {'��', '��', '��'};
		int[] age = {30, 20, 25};
		double[] height = {187.3, 160.5, 155};
		
		for (int i = 0; i < height.length; i++) {
			System.out.print(names[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < height.length; i++) {
			System.out.print(gender[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < height.length; i++) {
			System.out.print(age[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < height.length; i++) {
			System.out.print(height[i] + " ");
		}
		System.out.println();
		
		for (String x : names) { //for each��  (�ӽú��� : �迭)
			System.out.print(x + " ");
		}
		System.out.println();
		
		for (char y : gender) {
			System.out.print(y + " ");
		}
		System.out.println();
		
		for (int z : age) {
			System.out.print(z + " ");
		}
		System.out.println();
		
		for (double d : height) {
			System.out.print(d + " ");
		}
	}

}
