package �ݺ���;

import java.util.Random;

import javax.swing.JOptionPane;

public class ���ڸ��߱� {

	public static void main(String[] args) {
		//���� �������� ������ִ� ��ǰ�� �Ẹ��
		int count = 1;
		Random r = new Random();
		int target = r.nextInt(100); // int�� ������ -21�� ~ 21��. (100) �� ������ 0~99������ ������.
		
		while (true) { // �巡�׷� ���� ��, source -> surround with
			String data = JOptionPane.showInputDialog("�����Է�");
			int guess = Integer.parseInt(data); // "88" -> String�� int�� ��ȯ
			if (target == guess) {
				System.out.println("�����Դϴ�.");
				System.out.println(count + "�� ���� ���߼̽��ϴ�.");
				System.out.println("�ý����� �����մϴ�.");
				break;
			} else {
				System.out.println("������ �ƴմϴ�.");
				System.out.println("���� " + count + "��° �õ��Դϴ�.");
				count = count + 1;
				//�Է��� ���� ���亸�� ū�� ������ ��Ʈ�� �ֱ�
				if (guess > target) { // ������ �� ���� ��
					System.out.println("������ " + guess + "���� �� �۽��ϴ�.");
				} else {
					System.out.println("������ " + guess + "���� �� Ů�ϴ�.");
				}
				System.out.println("------------------------------------");
			} 
		}
	}
}
