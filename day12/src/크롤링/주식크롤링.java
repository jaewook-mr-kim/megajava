package ũ�Ѹ�;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class �ֽ�ũ�Ѹ� {

	public static void main(String[] args) {
		JFrame f = new JFrame("���� �ֽ� ũ�Ѹ�");
		FlowLayout flow = new FlowLayout();
		
		JButton b1 = new JButton("��Ʈ����");
		JButton b2 = new JButton("�Ｚ����");
		JButton b3 = new JButton("�����ǰ");
		JButton b4 = new JButton("�ҷ�����");
		
		JLabel l = new JLabel("CODE: ");
		JTextField input = new JTextField(7);
		JTextArea result = new JTextArea(5,10);
		
		Font font = new Font("�ü�", Font.BOLD, 50);
		Font font2 = new Font("�ü�", Font.BOLD, 30);
		f.setSize(390, 800);
		f.setLayout(flow);
		
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		l.setFont(font);
		input.setFont(font);
		result.setFont(font2);
		
		b1.setBackground(Color.orange);
		b2.setBackground(Color.orange);
		b3.setBackground(Color.orange);
		b4.setBackground(Color.white);
		
		l.setForeground(Color.red);
		input.setBackground(Color.green);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(l);
		f.add(input);
		f.add(b4);
		f.add(result);
		
		f.getContentPane().setBackground(Color.yellow);
		result.setEnabled(false); // ���Ƿ� ������ ��ġ�� �ϴ� ��
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String data = "068270";
				���̹�����ũ�Ѹ�5 ���̹� = new ���̹�����ũ�Ѹ�5();
				String[] values = ���̹�.naver(data);
				result.setText("���簡: " + values[0] + "\n" + "������: " + values[1] + "\n" + "�ְ�: " + values[2] + "\n");
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String data = "005930";
				���̹�����ũ�Ѹ�5 ���̹� = new ���̹�����ũ�Ѹ�5();
				String[] values = ���̹�.naver(data);
				result.setText("���簡: " + values[0] + "\n" + "������: " + values[1] + "\n" + "�ְ�: " + values[2] + "\n");
			}
		});
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String data = "004310";
				���̹�����ũ�Ѹ�5 ���̹� = new ���̹�����ũ�Ѹ�5();
				String[] values = ���̹�.naver(data);
				result.setText("���簡: " + values[0] + "\n" + "������: " + values[1] + "\n" + "�ְ�: " + values[2] + "\n");
			}
		});
		
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String data = input.getText();
				���̹�����ũ�Ѹ�5 ���̹� = new ���̹�����ũ�Ѹ�5();
				String[] values = ���̹�.naver(data);
				result.setText("���簡: " + values[0] + "\n" + "������: " + values[1] + "\n" + "�ְ�: " + values[2] + "\n");
				// result.append => �⺻ �ؽ�Ʈ���� ���ϱ�
				
				
			}
		});
		
		f.setVisible(true);
		

		
	}

}
