package 예제;

import java.util.Scanner;

public class 예제2 {
	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		int choice;
		int choice2;
		int iu = 0;
		int js = 0;
		int bf = 0;
		int chance = 5;
		
		System.out.println("----------------[투표]-------------------");
		System.out.println("1. 아이유 | 2. 유재석 | 3. 방탄소년단 | 4. 종료");
		System.out.println("남은 투표 수 : " + chance + "번");
		System.out.println("----------------------------------------");
		
		while (run) {
			
			System.out.print("투표하세요! : ");
			choice = sc.nextInt();
			
			if (choice == 1) {
				iu = iu + 1;
				chance = chance - 1;
			} else if (choice == 2) {
				js = js + 1;
				chance = chance - 1;
			} else if (choice == 3) {
				bf = bf + 1;
				chance = chance - 1;
			} else {
				if (chance > 0) {
					System.out.println("투표 기회가 아직 " + chance + "번 남았습니다.");
					System.out.println("그래도 종료하시겠습니까? (1. 예 | 2. 아니오)");
					System.out.print("선택 : ");
					choice2 = sc.nextInt();
					
					if (choice2 == 1) {
						System.out.println("----------------------------------------");
						System.out.println("                [투표 결과]                ");
						System.out.println("       1. 아이유      : " + iu + "표");
						System.out.println("       2. 유재석      : " + js + "표");
						System.out.println("       3. 방탄소년단 : " + bf + "표");
						System.out.println("----------------------------------------");
						System.out.println("투표를 종료합니다.");
						System.exit(0);
						} else {
						System.out.println("투표를 계속 진행합니다.");
						}
					
				} else {
					System.out.println("----------------------------------------");
					System.out.println("                [투표 결과]                ");
					System.out.println("       1. 아이유      : " + iu + "표");
					System.out.println("       2. 유재석      : " + js + "표");
					System.out.println("       3. 방탄소년단 : " + bf + "표");
					System.out.println("----------------------------------------");
					System.out.println("투표를 종료합니다.");
					System.exit(0);
				}
				
			}
		if (chance == 0) {
			System.out.println("투표 기회가 모두 소진되었습니다.");
			System.out.println("----------------------------------------");
			System.out.println("                [투표 결과]                ");
			System.out.println("       1. 아이유      : " + iu + "표");
			System.out.println("       2. 유재석      : " + js + "표");
			System.out.println("       3. 방탄소년단 : " + bf + "표");
			System.out.println("----------------------------------------");
			System.out.println("투표를 종료합니다.");
			System.exit(0);
		}
		}
	}
}
