package �ݺ���;

import java.util.Random;

import javax.swing.JOptionPane;

public class ���ڰ��� {

	public static void main(String[] args) {
		Random r = new Random();
		int count = 1;
		
		while (true) {

			String starter = JOptionPane.showInputDialog("���ӽ���: 1 / ��������: 2");
			int startorquit = Integer.parseInt(starter);
			if (startorquit == 2) {
				System.out.println("--------------------------------------");
				System.out.println("���α׷��� " + (count - 1) + "�� �ݺ��ϼ̽��ϴ�.");
				System.out.println("���α׷��� �����մϴ�. :)");
				break;
			}
			
			int num1 = r.nextInt(100);
			int num2 = r.nextInt(100);
			
			if (num1 > num2) {
				System.out.println(num1 + "   >   " + num2);
				System.out.println("�տ� �ִ� ���ڰ� �� Ŀ��!");

			} else if (num1 < num2) {
				System.out.println(num1 + "   <   " + num2);
				System.out.println("�ڿ� �ִ� ���ڰ� �� Ŀ��!");

			} else {
				System.out.println(num1 + "   =   " + num2);
				System.out.println("�� ���ڴ� ���ƿ�!");
			}
			count = count + 1;
		}
	}
}
