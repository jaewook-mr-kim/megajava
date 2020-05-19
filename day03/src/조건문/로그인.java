package 조건문;

public class 로그인 {

	public static void main(String[] args) {
		String id = "root"; //회원가입했을 때의 id
		String id2 = "admin"; //입력한 id
		String pw = "java123"; //회원가입했을 때의 pw
		String pw2 = "JAVA123"; //입력한 pw
		String id3 = "root";
		String pw3 = "java123";
		
		if (id.equals(id2) && pw.equals(pw2)) { // 회원가입했을 때의 id와 입력한 id가 일치할 때,
			System.out.println("Log-in was successful :)");
		} else { // 일치하지 않을 때,
			System.out.println("Log-in was unsuccessful :(");
		}
		
		if (id.equals(id3) && pw.equals(pw3)) { 
			System.out.println("Log-in was successful :)");
		} else {
			System.out.println("Log-in was unsuccessful :(");
		}
		
	}
// 아이디, 패스워드의 입력을 담당하는 부품에 대해 알아보자!
}
