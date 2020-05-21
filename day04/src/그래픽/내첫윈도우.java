package 그래픽;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 내첫윈도우 {

	public static void main(String[] args) {
		// 창 큰거 한번 띄워보자
		// 버튼 만들어서 창에서 넣어보자
		JFrame f = new JFrame();
		f.setSize(500, 600); // 창을 만들고 크기까지 설정, 하지만 안보이는게 기본값이다
		
		JButton b = new JButton(); // 버튼 만들기
		b.setText("Press me :P"); // 버튼 문구 설정
		b.setBackground(Color.green); // 배경 색
		b.setForeground(Color.red); // 글자 색
		f.add(b); // 버튼을 프레임 위에 올리기
		
		JButton b2 = new JButton(); // 버튼 만들기
		b2.setText("Me too :P"); // 버튼 문구 설정
		b2.setBackground(Color.yellow); // 배경 색
		b2.setForeground(Color.black); // 글자 색
		f.add(b2); // 버튼을 프레임 위에 올리기
		
		FlowLayout flow = new FlowLayout(); // 버튼 두개가 겹치지 않도록
		f.setLayout(flow);
		
		f.setVisible(true); // 보이게 설정, 프레임이 계속 보이고 떠있음, 프레임에 관한 코드는 이 코드 위에 써야한다. 그렇지 않으면 반영이 안됨.
		
		
	}

}
