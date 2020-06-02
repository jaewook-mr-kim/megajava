package 배열복습;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 참조형배열 {

	public static void main(String[] args) {
		// 데이터 타입이 참조형인 경우
		JButton[] buttons = new JButton[500];
		// 참조형 배열의 기본값으로는 null 이 들어감. 버튼이 들어갈 공간을 만들어놓은 것일 뿐, 버튼 자체가 만들어진 것은 아님.
		for (int i = 0; i < buttons.length; i++) {
			JButton b = new JButton(i + "번");
			buttons[i] = b;
			buttons[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println(e.getSource()); // 어떤 버튼을 눌렀는지 알려줌.
				}
			});
		}
		// 배열을 쓰는 이유는 이렇게 100개의 버튼을 반복문으로 한번에 생성 가능하기 때문. 추후 코드를 수정할 때도 훨씬 간편해짐.
		JFrame f = new JFrame();
		f.setSize(1000, 1000);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		for (int i = 0; i < buttons.length; i++) {
			f.add(buttons[i]);
		}
		
		
		f.setVisible(true);
	}	

}
