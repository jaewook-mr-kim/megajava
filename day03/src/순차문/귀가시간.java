package ������;

import java.util.Date;

import javax.swing.JOptionPane;

public class �Ͱ��ð� {

	public static void main(String[] args) {
		// �ð��� �����ִ� Ŭ����
		// Date, Calendar (�� �ִµ� �̰͵��� ���� ���� ����)
		
		Date date = new Date();
		int time = date.getHours();
		// String time = JOptionPane.showInputDialog("What time is it now?"); // �ԷµȰ� string���� �ν���
		
		// int time2 = Integer.parseInt(time); // �Էµ� ���� ������ �⺻������������ �ٲ��ִ� ����
		// System.out.println(date.getSeconds());
		
		if (time >= 22) {
			JOptionPane.showMessageDialog(null, "It is time to go home soon!");
		} else {
			JOptionPane.showMessageDialog(null, "It is not the time to go home quite yet!");
		}
		// JOptionPane.showMessageDialog(null, "Your name is " + name);
	}

}
