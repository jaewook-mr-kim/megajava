package �׷���;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ��ù������ {

	public static void main(String[] args) {
		// â ū�� �ѹ� �������
		// ��ư ���� â���� �־��
		JFrame f = new JFrame();
		f.setSize(500, 600); // â�� ����� ũ����� ����, ������ �Ⱥ��̴°� �⺻���̴�
		
		JButton b = new JButton(); // ��ư �����
		b.setText("Press me :P"); // ��ư ���� ����
		b.setBackground(Color.green); // ��� ��
		b.setForeground(Color.red); // ���� ��
		f.add(b); // ��ư�� ������ ���� �ø���
		
		JButton b2 = new JButton(); // ��ư �����
		b2.setText("Me too :P"); // ��ư ���� ����
		b2.setBackground(Color.yellow); // ��� ��
		b2.setForeground(Color.black); // ���� ��
		f.add(b2); // ��ư�� ������ ���� �ø���
		
		FlowLayout flow = new FlowLayout(); // ��ư �ΰ��� ��ġ�� �ʵ���
		f.setLayout(flow);
		
		f.setVisible(true); // ���̰� ����, �������� ��� ���̰� ������, �����ӿ� ���� �ڵ�� �� �ڵ� ���� ����Ѵ�. �׷��� ������ �ݿ��� �ȵ�.
		
		
	}

}
