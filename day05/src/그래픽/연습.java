package 그래픽;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 연습 {
	public static void main(String[] args) {
		// 전체 틀
		JFrame f = new JFrame();
		f.setSize(500, 500);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		// 버튼
		JButton spring = new JButton("봄");
		JButton summer = new JButton("여름");
		
		f.add(spring);
		f.add(summer);
		
		spring.setBackground(Color.yellow);
		summer.setBackground(Color.red);
		
		spring.setForeground(Color.blue);
		summer.setForeground(Color.green);
		
		Font font = new Font("궁서", Font.BOLD, 30);
		spring.setFont(font);
		summer.setFont(font);
				
		spring.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "선선해요~");
			}
		});
		
		summer.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "아주 더워요~");
			}
		});
		
		f.setVisible(true);
	
	}

}
