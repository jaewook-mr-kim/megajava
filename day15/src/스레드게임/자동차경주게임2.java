package ���������;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class �ڵ������ְ���2 extends JFrame {
	
	public �ڵ������ְ���2() {
		setTitle("�ڵ������ְ���");
		setSize(600, 200);
		// �� ���� ������ ��ü ����, start!

		MyThread car1 = new MyThread("�ڵ���1", 100, 0);
		MyThread car2 = new MyThread("�ڵ���2", 100, 50);
		MyThread car3 = new MyThread("�ڵ���3", 100, 100);
		car1.start();
		car2.start();
		car3.start();
		setLayout(null);
		getContentPane().setBackground(Color.green);
		setVisible(true);
	}
	
	public class MyThread extends Thread {
		int x, y;
		ImageIcon icon;
		JLabel label;
		public MyThread(String file, int x, int y) {
			this.x = x;
			this.y = y;
			label = new JLabel(file);
			label.setBounds(x, y, 100, 100);
			add(label);
		}
		
		@Override
		public void run() {
			for (int i = 0; i < 200; i++) {
				x +=10 * Math.random(); //0~0.99999 ������ �� ����
				System.out.println("����� x�� ��ǥ");
				label.setBounds(x, y, 100, 100);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new �ڵ������ְ���2(); // �͸�Ŭ����
	}
}
