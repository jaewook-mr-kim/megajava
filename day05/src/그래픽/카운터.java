package �׷���;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ī���� {
	static int count = 0;

	public static void main(String[] args) {
		// ��ü Ʋ ��ǰ ����
		JFrame f = new JFrame(); // () ������
		f.setSize(300, 310);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		// ��ư 2�� ��ǰ ����
		JButton minus = new JButton("���̳ʽ�");
		JButton plus = new JButton("�� �� ��");
		
		// �� ��ǰ ���� => �۾� ���� �� ���
		JLabel number = new JLabel("0");
		
		f.add(minus);
		f.add(number);
		f.add(plus);
		
		minus.setBackground(Color.red);
		plus.setBackground(Color.green);
		
		Font font = new Font("�ü�", Font.BOLD, 100);
		Font font2 = new Font("�ü�", Font.BOLD, 50);
		number.setFont(font);
		minus.setFont(font2);
		plus.setFont(font2);
		
		minus.addActionListener(new ActionListener() { //�׼��� ó�����ִ� ��
			
			@Override
			public void actionPerformed(ActionEvent e) { //�׼��� ������� �ִ� ��
				System.out.println("���̳ʽ� ��ư ����.");
				count--;
				System.out.println("ī��Ʈ : " + count);
				number.setText(count + " "); // ��Ʈ������ ������ֱ� ���� ������ ���̴� ��
			}
		});
		plus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("�÷��� ��ư ����.");
				count++;
				System.out.println("ī��Ʈ : " + count);
				number.setText(count + " "); // ��Ʈ������ ������ֱ� ���� ������ ���̴� ��
			}
		});
		
		f.setVisible(true); // ���� �������� ���̰� �ϱ�. ���� �������� �;���
	}

}
