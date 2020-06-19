package 스레드게임;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 자동차경주게임2 extends JFrame {
	
	public 자동차경주게임2() {
		setTitle("자동차경주게임");
		setSize(600, 200);
		// 세 개의 스레드 객체 만들어서, start!

		MyThread car1 = new MyThread("자동차1", 100, 0);
		MyThread car2 = new MyThread("자동차2", 100, 50);
		MyThread car3 = new MyThread("자동차3", 100, 100);
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
				x +=10 * Math.random(); //0~0.99999 사이의 값 생성
				System.out.println("변경된 x축 좌표");
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
		new 자동차경주게임2(); // 익명클래스
	}
}
