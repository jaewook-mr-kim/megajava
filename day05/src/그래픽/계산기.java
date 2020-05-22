package �׷���; // �ڹٿ����� ��� �ϴ� �� �� �� �ϳ��� ������ ������ ������� ����� ����ȴ�.

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

public class ���� {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(2000, 500);
		
		JLabel img = new JLabel(); // �̹����� ���� Ʋ
		f.add(img);
		
		ImageIcon icon = new ImageIcon("cal.jpg"); // Ʋ�� �̹��� ����
		img.setIcon(icon);

		JLabel n1 = new JLabel("���� 1: ");
		JLabel n2 = new JLabel("���� 2: ");

		JTextField t1 = new JTextField(5);
		JTextField t2 = new JTextField(5);

		JButton plus = new JButton("��");
		JButton minus = new JButton("��");
		JButton star = new JButton("��");
		JButton division = new JButton("��");

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("���� ���", Font.BOLD, 50);
		Font font2 = new Font("���� ���", Font.BOLD, 40);

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
				// ���� �Է��� �� ���� ������ �;� ��
				String num1 = t1.getText();
				String num2 = t2.getText();

				double num11 = Double.parseDouble(num1);
				double num22 = Double.parseDouble(num2);

				// ���ؼ� ����غ���
				JOptionPane.showMessageDialog(f, num11 + num22);
			}
		});

		minus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// ���� �Է��� �� ���� ������ �;� ��
				String num1 = t1.getText();
				String num2 = t2.getText();

				double num11 = Double.parseDouble(num1);
				double num22 = Double.parseDouble(num2);

				// ����
				JOptionPane.showMessageDialog(f, num11 - num22);
			}
		});

		star.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// ���� �Է��� �� ���� ������ �;� ��
				String num1 = t1.getText();
				String num2 = t2.getText();

				double num11 = Double.parseDouble(num1);
				double num22 = Double.parseDouble(num2);

				// ���ϱ�
				JOptionPane.showMessageDialog(f, num11 * num22);
			}
		});
		
		division.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// ���� �Է��� �� ���� ������ �;� ��
				String num1 = t1.getText();
				String num2 = t2.getText();

				double num11 = Double.parseDouble(num1);
				double num22 = Double.parseDouble(num2);

				// ������
				JOptionPane.showMessageDialog(f, num11 / num22);
			}
		});
		
		f.setVisible(true);

	}

}
