package �׷���;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ���� {
	public static void main(String[] args) {
		// ��ü Ʋ
		JFrame f = new JFrame();
		f.setSize(500, 500);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		// ��ư
		JButton spring = new JButton("��");
		JButton summer = new JButton("����");
		
		f.add(spring);
		f.add(summer);
		
		spring.setBackground(Color.yellow);
		summer.setBackground(Color.red);
		
		spring.setForeground(Color.blue);
		summer.setForeground(Color.green);
		
		Font font = new Font("�ü�", Font.BOLD, 30);
		spring.setFont(font);
		summer.setFont(font);
				
		spring.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "�����ؿ�~");
			}
		});
		
		summer.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "���� ������~");
			}
		});
		
		f.setVisible(true);
	
	}

}
