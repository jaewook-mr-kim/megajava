package Ŭ����;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class �ϱ��� {

	public static void main(String[] args) throws Exception { //����ó��, ���߿� �ٽ� �˾ƺ� ����.
		// �Է��� �޾ƺ���.
		String date = JOptionPane.showInputDialog("��¥�Է�");
		String title = JOptionPane.showInputDialog("�����Է�");
		String content = JOptionPane.showInputDialog("�����Է�");
		// ��ġ�� �����ؼ� �����غ���.
		// File file = new File("c:/imsi");
		// System.out.println("������ ���翩�� : " + file.exists());
		
		
		// ���Ϸ� �ν� + �� �� �ִ�.
		FileWriter file = new FileWriter(date + ".txt");
		file.write(date + "\n"); // ���� => �������� n (new line)
		file.write(title + "\n");
		file.write(content + "\n");
		file.close(); // �� ������ ���Ϸ� �Ű���.
	}
	// ��ǰ ���ͳݿ��� ã�� : Maven Repository �˻� => ���⿡�� ������ ���� ��������.

}
