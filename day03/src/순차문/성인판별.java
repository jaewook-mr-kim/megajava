package ������;

import javax.swing.JOptionPane;

public class �����Ǻ� {

	public static void main(String[] args) {
		//�̸��� �Է��ؼ�, ���.
		
		String name = JOptionPane.showInputDialog("Input your name.");
		String age = JOptionPane.showInputDialog("Input your age."); // �ԷµȰ� string���� �ν���
		
		int age2 = Integer.parseInt(age); // �Էµ� ���� ������ �⺻������������ �ٲ��ִ� ����
		
		if (age2 >= 19) {
			JOptionPane.showMessageDialog(null, name + " is an adult.");
		} else {
			JOptionPane.showMessageDialog(null, name + " is not an adult.");
		}
		// JOptionPane.showMessageDialog(null, "Your name is " + name);
	}

}
