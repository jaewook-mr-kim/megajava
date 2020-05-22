package 그래픽;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 카운터 {
	static int count = 0;

	public static void main(String[] args) {
		// 전체 틀 부품 복사
		JFrame f = new JFrame(); // () 생성자
		f.setSize(300, 310);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		// 버튼 2개 부품 복사
		JButton minus = new JButton("마이너스");
		JButton plus = new JButton("플 러 스");
		
		// 라벨 부품 복사 => 글씨 넣을 때 사용
		JLabel number = new JLabel("0");
		
		f.add(minus);
		f.add(number);
		f.add(plus);
		
		minus.setBackground(Color.red);
		plus.setBackground(Color.green);
		
		Font font = new Font("궁서", Font.BOLD, 100);
		Font font2 = new Font("궁서", Font.BOLD, 50);
		number.setFont(font);
		minus.setFont(font2);
		plus.setFont(font2);
		
		minus.addActionListener(new ActionListener() { //액션을 처리해주는 애
			
			@Override
			public void actionPerformed(ActionEvent e) { //액션을 실행시켜 주는 곳
				System.out.println("마이너스 버튼 누름.");
				count--;
				System.out.println("카운트 : " + count);
				number.setText(count + " "); // 스트링으로 만들어주기 위해 공백을 붙이는 것
			}
		});
		plus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("플러스 버튼 누름.");
				count++;
				System.out.println("카운트 : " + count);
				number.setText(count + " "); // 스트링으로 만들어주기 위해 공백을 붙이는 것
			}
		});
		
		f.setVisible(true); // 만든 프레임을 보이게 하기. 가장 마지막에 와야함
	}

}
