package 클래스;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 영화앨범 {
	static int now = 2; // 5개중 가운데 (0~4) 시작위치

	public static void main(String[] args) {
		String[] list = {"002.png", "003.png","004.png","005.png","006.png"};
		String[] list2 = {"    언더워터      ", "프리즌 이스케이프", "  위대한 쇼맨  ", " 카페 벨에포크 ", " 미스비헤이비어 "};
		
		JFrame f = new JFrame();
		JLabel top = new JLabel();
		JButton left = new JButton("<<<<<");
		JButton right = new JButton(">>>>>");
		FlowLayout flow = new FlowLayout();
		JLabel title = new JLabel();
		title.setText(list2[now]);
		
		f.setSize(280, 430);
		f.setLayout(flow);
		f.add(top);
		f.add(title);
		f.add(left);
		f.add(right);
		
		ImageIcon icon = new ImageIcon(list[now]);
		top.setIcon(icon);
		
		left.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (now > 0) { // 1~4까지만 1씩 줄일 수 있게!
					now--;
				} else {
					now = 4;
				}
				
				ImageIcon icon = new ImageIcon(list[now]);
				title.setText(list2[now]);
				top.setIcon(icon);
			}
		});
		
		right.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (now < 4) {
					now++;	
				} else {
					now = 0;
				}
				ImageIcon icon = new ImageIcon(list[now]);
				title.setText(list2[now]);
				top.setIcon(icon);
			}
		});
		
		Font font = new Font("궁서", Font.BOLD, 10);
		Font font1 = new Font("궁서", Font.BOLD, 30);
		left.setFont(font);
		right.setFont(font);
		left.setBackground(Color.yellow);
		right.setBackground(Color.yellow);
		left.setForeground(Color.red);
		right.setForeground(Color.blue);
		title.setFont(font1);
		
		f.setVisible(true);
	}

}
