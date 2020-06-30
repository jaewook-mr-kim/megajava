package bbs;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BbsUI extends JFrame {

	public BbsUI()	{
		setTitle("�Խ���");
		setSize(500, 670);
		
		JLabel l1 = new JLabel("���� �Խ���");
		JLabel l2 = new JLabel("�Խñ� ��   ȣ");
		JLabel l3 = new JLabel("�Խñ� ��   ��");
		JLabel l4 = new JLabel("�Խñ� ��   ��");
		JLabel l5 = new JLabel("�Խñ� �ۼ���");
		
		Font f1 = new Font("�ü�", Font.BOLD, 65);
		Font f2 = new Font("�ü�", Font.BOLD, 30);
		
		FlowLayout flow = new FlowLayout();
		
		l1.setFont(f1);
		l2.setFont(f2);
		l3.setFont(f2);
		l4.setFont(f2);
		l5.setFont(f2);
		setLayout(flow);
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);
		
		t1.setFont(f2);
		t2.setFont(f2);
		t3.setFont(f2);
		t4.setFont(f2);
		
		JButton b = new JButton("�Խù� �ۼ� �Ϸ�");
		JButton b1 = new JButton("�ش� �Խù� ����");
		b.setFont(f2);
		b1.setFont(f2);
		
		add(l1);
		add(l2);
		add(t1);
		add(l3);
		add(t2);
		add(l4);
		add(t3);
		add(l5);
		add(t4);
		add(b);
		add(b1);
		
		getContentPane().setBackground(Color.green);
		b.setBackground(Color.yellow);
		b1.setBackground(Color.red);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// �Է��� �� ������ �ͼ�
				String id = t1.getText();
				String title = t2.getText();
				String content = t3.getText();
				String writer = t4.getText();
				// dao�� ó���ϵ��� ����
				BbsDAO dao = new BbsDAO();
				dao.create(id, title, content, writer);
			}
		});
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				BbsDAO dao = new BbsDAO();
				dao.delete(id);
			}
		});
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
	 new BbsUI();
	}

}
