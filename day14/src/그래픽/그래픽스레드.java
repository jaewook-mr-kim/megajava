package 그래픽;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 그래픽스레드 extends JFrame {
	JLabel l1, l2, l3; // 전역변수, 생성자로 호출되기때문에 static 필요없음
	
	public 그래픽스레드() { // 생성자 static X 기 때문에 효율적임
		setTitle("스레드 프로그래밍");
		l1 = new JLabel("1");
		l2 = new JLabel(" ");
		l3 = new JLabel("3");
		
		FlowLayout flow = new FlowLayout();
		
		setLayout(flow);
		add(l1);
		add(l2);
		add(l3);
		
		Font font = new Font("궁서", Font.BOLD, 50);
		
		l1.setFont(font);
		l3.setFont(font);
		
		setSize(1000, 300);
		카운터 counter = new 카운터();
		counter.start();
		
		시각 time = new 시각();
		time.start();
		
		getContentPane().setBackground(Color.green);
		
		배열 array = new 배열();
		array.start();
		
		setVisible(true);
	} 
	//inner class (내부 클래스)
	public class 카운터 extends Thread {
		@Override
		public void run() {
			for (int i = 500; i >= 0; i--) {
				l1.setText("카운터: " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} // 1000밀리세컨드 = 1초
			}
		}
		}

	public class 시각 extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 500; i++) {
				Date date = new Date();
				l3.setText("현재: " + date);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		}

	public class 배열 extends Thread {
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
		그래픽스레드 name = new 그래픽스레드(); //생성자 자동호출
	}

}
