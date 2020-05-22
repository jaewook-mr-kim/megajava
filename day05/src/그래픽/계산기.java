package 그래픽; // 자바에서는 계산 하는 두 수 중 하나라도 더블이 있으면 결과값은 더블로 도출된다.

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 계산기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(2000, 500);
		
		JLabel img = new JLabel(); // 이미지를 넣을 틀
		f.add(img);
		
		ImageIcon icon = new ImageIcon("cal.jpg"); // 틀에 이미지 삽입
		img.setIcon(icon);

		JLabel n1 = new JLabel("숫자 1: ");
		JLabel n2 = new JLabel("숫자 2: ");

		JTextField t1 = new JTextField(5);
		JTextField t2 = new JTextField(5);

		JButton plus = new JButton("＋");
		JButton minus = new JButton("－");
		JButton star = new JButton("×");
		JButton division = new JButton("÷");

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("맑은 고딕", Font.BOLD, 50);
		Font font2 = new Font("맑은 고딕", Font.BOLD, 40);

		n1.setFont(font);
		n2.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		plus.setFont(font2);
		minus.setFont(font2);
		star.setFont(font2);
		division.setFont(font2);

		t1.setBackground(Color.yellow);
		t2.setBackground(Color.blue);
		t1.setForeground(Color.red);
		t2.setForeground(Color.green);

		f.add(n1);
		f.add(t1);
		f.add(n2);
		f.add(t2);
		f.add(plus);
		f.add(minus);
		f.add(star);
		f.add(division);

		plus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 내가 입력한 두 수를 가지고 와야 함
				String num1 = t1.getText();
				String num2 = t2.getText();

				double num11 = Double.parseDouble(num1);
				double num22 = Double.parseDouble(num2);

				// 더해서 출력해보기
				JOptionPane.showMessageDialog(f, num11 + num22);
			}
		});

		minus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 내가 입력한 두 수를 가지고 와야 함
				String num1 = t1.getText();
				String num2 = t2.getText();

				double num11 = Double.parseDouble(num1);
				double num22 = Double.parseDouble(num2);

				// 빼기
				JOptionPane.showMessageDialog(f, num11 - num22);
			}
		});

		star.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 내가 입력한 두 수를 가지고 와야 함
				String num1 = t1.getText();
				String num2 = t2.getText();

				double num11 = Double.parseDouble(num1);
				double num22 = Double.parseDouble(num2);

				// 곱하기
				JOptionPane.showMessageDialog(f, num11 * num22);
			}
		});
		
		division.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 내가 입력한 두 수를 가지고 와야 함
				String num1 = t1.getText();
				String num2 = t2.getText();

				double num11 = Double.parseDouble(num1);
				double num22 = Double.parseDouble(num2);

				// 나누기
				JOptionPane.showMessageDialog(f, num11 / num22);
			}
		});
		
		f.setVisible(true);

	}

}
