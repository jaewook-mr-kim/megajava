package 반복문;

import java.util.Random;

import javax.swing.JOptionPane;

public class 숫자게임 {

	public static void main(String[] args) {
		Random r = new Random();
		int count = 1;
		
		while (true) {

			String starter = JOptionPane.showInputDialog("게임시작: 1 / 게임종료: 2");
			int startorquit = Integer.parseInt(starter);
			if (startorquit == 2) {
				System.out.println("--------------------------------------");
				System.out.println("프로그램을 " + (count - 1) + "번 반복하셨습니다.");
				System.out.println("프로그램을 종료합니다. :)");
				break;
			}
			
			int num1 = r.nextInt(100);
			int num2 = r.nextInt(100);
			
			if (num1 > num2) {
				System.out.println(num1 + "   >   " + num2);
				System.out.println("앞에 있는 숫자가 더 커요!");

			} else if (num1 < num2) {
				System.out.println(num1 + "   <   " + num2);
				System.out.println("뒤에 있는 숫자가 더 커요!");

			} else {
				System.out.println(num1 + "   =   " + num2);
				System.out.println("두 숫자는 같아요!");
			}
			count = count + 1;
		}
	}
}
