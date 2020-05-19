package 순차문;

import java.util.Date;

import javax.swing.JOptionPane;

public class 귀가시간 {

	public static void main(String[] args) {
		// 시간을 구해주는 클래스
		// Date, Calendar (더 있는데 이것들이 가장 많이 쓰임)
		
		Date date = new Date();
		int time = date.getHours();
		// String time = JOptionPane.showInputDialog("What time is it now?"); // 입력된걸 string으로 인식함
		
		// int time2 = Integer.parseInt(time); // 입력된 값을 정수의 기본데이터형으로 바꿔주는 과정
		// System.out.println(date.getSeconds());
		
		if (time >= 22) {
			JOptionPane.showMessageDialog(null, "It is time to go home soon!");
		} else {
			JOptionPane.showMessageDialog(null, "It is not the time to go home quite yet!");
		}
		// JOptionPane.showMessageDialog(null, "Your name is " + name);
	}

}
