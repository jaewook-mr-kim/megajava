package 반복문;

public class WhilePractice {
	public static void main(String[] args) {
		// String star = "☆";
		// int count = 0;
		// while (count < 10) {
			// System.out.println(count + ". " + star);
			// count = count + 1;
			// }
		for (int i = 0; i < 3; i++) { //3줄로 만들자
			for (int j = 0; j < 7; j++) { // 1줄에 7개씩!
				System.out.print("★" + " ");
			}
			System.out.println();
		} // 이중 for문
		
	}
}
