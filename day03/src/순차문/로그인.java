package 순차문;

import javax.swing.JOptionPane;

public class 로그인 {

	public static void main(String[] args) {
		String id = "root"; //회원가입했을 때의 id
		String id2 = JOptionPane.showInputDialog("아이디를 입력하세요."); //입력한 id
		String pw = "java123"; //회원가입했을 때의 pw
		String pw2 = JOptionPane.showInputDialog("패스워드를 입력하세요."); //입력한 pw
		
		
		if (id.equals(id2) && pw.equals(pw2)) { // 회원가입했을 때의 id와 입력한 id가 일치할 때,
			System.out.println("Log-in was successful :)");
		} else { // 일치하지 않을 때,
			System.out.println("Log-in was unsuccessful :(");
		}
	
		
	}
// 아이디, 패스워드의 입력을 담당하는 부품에 대해 알아보자!
}
