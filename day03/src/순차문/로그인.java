package ������;

import javax.swing.JOptionPane;

public class �α��� {

	public static void main(String[] args) {
		String id = "root"; //ȸ���������� ���� id
		String id2 = JOptionPane.showInputDialog("���̵� �Է��ϼ���."); //�Է��� id
		String pw = "java123"; //ȸ���������� ���� pw
		String pw2 = JOptionPane.showInputDialog("�н����带 �Է��ϼ���."); //�Է��� pw
		
		
		if (id.equals(id2) && pw.equals(pw2)) { // ȸ���������� ���� id�� �Է��� id�� ��ġ�� ��,
			System.out.println("Log-in was successful :)");
		} else { // ��ġ���� ���� ��,
			System.out.println("Log-in was unsuccessful :(");
		}
	
		
	}
// ���̵�, �н������� �Է��� ����ϴ� ��ǰ�� ���� �˾ƺ���!
}
