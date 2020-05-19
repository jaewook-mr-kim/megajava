package 순차문;

import javax.swing.JOptionPane;

public class 성인판별 {

	public static void main(String[] args) {
		//이름을 입력해서, 출력.
		
		String name = JOptionPane.showInputDialog("Input your name.");
		String age = JOptionPane.showInputDialog("Input your age."); // 입력된걸 string으로 인식함
		
		int age2 = Integer.parseInt(age); // 입력된 값을 정수의 기본데이터형으로 바꿔주는 과정
		
		if (age2 >= 19) {
			JOptionPane.showMessageDialog(null, name + " is an adult.");
		} else {
			JOptionPane.showMessageDialog(null, name + " is not an adult.");
		}
		// JOptionPane.showMessageDialog(null, "Your name is " + name);
	}

}
