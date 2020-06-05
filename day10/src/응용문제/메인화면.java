package 응용문제;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 메인화면 {
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 메인화면");
		
		// JFrame f2 = new JFrame("나의 메인화면"); => 오버로딩 되어있는것 확인
		
		f.setSize(500, 500);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton b1 = new JButton("+");
		JButton b2 = new JButton("-");
		
		f.add(b1);
		f.add(b2);
		
		Font font = new Font("궁서", Font.BOLD, 50);
		
		b1.setFont(font);
		b2.setFont(font);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 더하기 기능 처리
				계산기 cal = new 계산기();
				int result = cal.add(300, 100);
				JOptionPane.showMessageDialog(f, result);
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 빼기 기능 처리
				계산기 cal = new 계산기();
				int result = cal.subtract(300, 100);
				JOptionPane.showMessageDialog(f, result);
			}
		});
		f.setVisible(true);

	}
}
