package �׷���;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class �׷��Ƚ����� extends JFrame {
	JLabel l1, l2, l3; // ��������, �����ڷ� ȣ��Ǳ⶧���� static �ʿ����
	
	public �׷��Ƚ�����() { // ������ static X �� ������ ȿ������
		setTitle("������ ���α׷���");
		l1 = new JLabel("1");
		l2 = new JLabel(" ");
		l3 = new JLabel("3");
		
		FlowLayout flow = new FlowLayout();
		
		setLayout(flow);
		add(l1);
		add(l2);
		add(l3);
		
		Font font = new Font("�ü�", Font.BOLD, 50);
		
		l1.setFont(font);
		l3.setFont(font);
		
		setSize(1000, 300);
		ī���� counter = new ī����();
		counter.start();
		
		�ð� time = new �ð�();
		time.start();
		
		getContentPane().setBackground(Color.green);
		
		�迭 array = new �迭();
		array.start();
		
		setVisible(true);
	} 
	//inner class (���� Ŭ����)
	public class ī���� extends Thread {
		@Override
		public void run() {
			for (int i = 500; i >= 0; i--) {
				l1.setText("ī����: " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} // 1000�и������� = 1��
			}
		}
		}

	public class �ð� extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 500; i++) {
				Date date = new Date();
				l3.setText("����: " + date);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		}

	public class �迭 extends Thread {
		String[] s = {"1.png", "2.png", "3.png", "4.png", "5.png"};
		@Override
		public void run() {
			for (int i = 0; i < s.length; i++) {
				ImageIcon icon = new ImageIcon(s[i]);
				l2.setIcon(icon);
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		�׷��Ƚ����� name = new �׷��Ƚ�����(); //������ �ڵ�ȣ��
	}

}
