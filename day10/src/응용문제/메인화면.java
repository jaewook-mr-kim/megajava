package ���빮��;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ����ȭ�� {
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("���� ����ȭ��");
		
		// JFrame f2 = new JFrame("���� ����ȭ��"); => �����ε� �Ǿ��ִ°� Ȯ��
		
		f.setSize(500, 500);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton b1 = new JButton("+");
		JButton b2 = new JButton("-");
		
		f.add(b1);
		f.add(b2);
		
		Font font = new Font("�ü�", Font.BOLD, 50);
		
		b1.setFont(font);
		b2.setFont(font);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// ���ϱ� ��� ó��
				���� cal = new ����();
				int result = cal.add(300, 100);
				JOptionPane.showMessageDialog(f, result);
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// ���� ��� ó��
				���� cal = new ����();
				int result = cal.subtract(300, 100);
				JOptionPane.showMessageDialog(f, result);
			}
		});
		f.setVisible(true);

	}
}
