package �ݺ���;

import javax.swing.JOptionPane;

public class WhileTest { //���� (�鿩���� ��) �ڵ����� ���߱�: ctrl + shift + f

	public static void main(String[] args) {
		// int count = 0; // ���۰�! 
		// while (count < 5) { // 0, 1, 2, 3, 4 5�� �ݺ�
		// System.out.println("Let's make a loop!");
		// count = count + 1; // count++ 1�� ����! ���� ������
		int count = 10;
		while (count < 16) {
			System.out.println(count + ". Let's make a loop!");
			count = count + 1;
		}
		
		System.out.println("--------------------------------------------");
		
		for (int i = 10; i <= 15; i++) {
			System.out.println(i);
		}
		
		System.out.println("--------------------------------------------");
		
		while (true) {
			String terminator = "x";
			// cpu�� ������ġ�� ���������� ������ �Ұ��� �ϴ�
			// cpu�� ó���� ��� ������, ���α׷��� RAM�� ���� �����;� �Ѵ�
			// ���� ���� ��ǰ���� �̹� RAM�� �־� ���� �����̴�
			// �̷��� ��ǰ���� ù ���ڸ� �빮�ڷ� �Ἥ �ҷ��� �� �ִ�
			String hour = JOptionPane.showInputDialog("What time is it? (Press x to terminate)");
			// x�� �������� Ȯ���ؾ���
			// x�� ��������, �ݺ����� ������ ó��!
			if (hour.equals(terminator)) {
				System.out.println("System Terminated.");
				break; // �ڽ��� �����ϰ� �ִ� �ݺ����� �����ش�
			}
			System.out.println(hour + "�� �Դϴ�."); // String�� �ϳ��� ������ +�� ���� �������� ����
			}
			
		}
	
	

}
