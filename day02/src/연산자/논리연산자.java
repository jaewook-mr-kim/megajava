package ������;

public class �������� {

	public static void main(String[] args) {
		// ������ �Ǵ��� �Ϸ��� �� ��, ������ 2�� �̻��� ���
		// ������ 2�� �� �����ؾ��ϴ���: and���� (&&)
		// ������ 2�� �� �ϳ��� �����ص�: or���� (||)
		
		// �α��� ó��
		int id = 1111; // ���Խ� id
		int pw = 2222;
		
		int id2 = 1000; // �Է��� id
		int pw2 = 2222;
		
		// ��, ������ ���̵�, �н������ ���ڿ��� �̷���� �־� �⺻ �����Ͱ� �ƴϱ� ������ �� �����ڸ� �� ���� ����.
		// ����, Ŭ������ ���� ���� �� ����.
		if (id == id2 && pw == pw2) {
			System.out.println("Log-in was successful :)");
		} else {
			System.out.println("Log-in was unsuccessful :(");
		}
	}

}
