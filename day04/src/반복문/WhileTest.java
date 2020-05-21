package 반복문;

import javax.swing.JOptionPane;

public class WhileTest { //형식 (들여쓰기 등) 자동으로 맞추기: ctrl + shift + f

	public static void main(String[] args) {
		// int count = 0; // 시작값! 
		// while (count < 5) { // 0, 1, 2, 3, 4 5번 반복
		// System.out.println("Let's make a loop!");
		// count = count + 1; // count++ 1씩 증가! 증감 연산자
		int count = 10;
		while (count < 16) {
			System.out.println(count + ". Let's make a loop!");
			count = count + 1;
		}
		
		System.out.println("--------------------------------------------");
		
		for (int i = 10; i <= 15; i++) {
			System.out.println(i);
		}
		
		System.out.println("--------------------------------------------");
		
		while (true) {
			String terminator = "x";
			// cpu는 저장위치에 직접적으로 접근이 불가능 하다
			// cpu가 처리할 모든 데이터, 프로그램은 RAM을 통해 가져와야 한다
			// 자주 쓰는 부품들은 이미 RAM에 넣어 놓은 상태이다
			// 이러한 부품들은 첫 글자를 대문자로 써서 불러올 수 있다
			String hour = JOptionPane.showInputDialog("What time is it? (Press x to terminate)");
			// x를 눌렀는지 확인해야함
			// x를 눌렀으면, 반복문을 끝내는 처리!
			if (hour.equals(terminator)) {
				System.out.println("System Terminated.");
				break; // 자신을 포함하고 있는 반복문을 끝내준다
			}
			System.out.println(hour + "시 입니다."); // String이 하나라도 있으면 +는 결합 연산자의 역할
			}
			
		}
	
	

}
