package ������;

import java.util.Date;

import javax.swing.JOptionPane;

public class DataTest {//ī��(��Ÿ)ǥ���, Ŭ���� �ܾ� ���� �빮�� ���, �ڹٿ��� �ַ� ���
						// date_test, ������ũ ǥ���, ���̽� ���� ���� �ַ� ���

	public static void main(String[] args) {
		Date date = new Date(); //�� �� �� ����, �� �� ��
		int year = date.getYear() + 1900; //�з��Ͼ����� ����
		int month = date.getMonth() + 1; //���±���, ��ǰ�� Ư¡
		int date2 = date.getDate();
		int day = date.getDay(); // "2" - ȭ���� (�� �� ȭ~ 0 1 2~)
		
		//JOptionPane.showMessageDialog(null, date2 + ", " + month + ", " + year);
		System.out.println(day);
		if (day == 0 || day == 6) { // ������̳� �Ͽ����̸�,
			System.out.println("�ָ��Դϴ�.");
		}else if (day == 1) { // �������̸�,
			System.out.println("�� ���� �����Դϴ�.");
		}else if (day == 2) { // ȭ�����̸�,
			System.out.println("������ ��ƿ�.");
		}else {
			System.out.println("�� ������.");
		}
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();
		
		//JOptionPane.showMessageDialog(null, hour + ":" + min + ":" + sec);
	}
}
