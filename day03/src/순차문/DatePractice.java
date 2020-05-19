package 순차문;

import java.util.Date;

public class DatePractice {

	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours();
		int month = date.getMonth() + 1;
		
		if (hour <= 11) {// 11시 전이면
			System.out.println("Good morning! :)");
		} else if (hour <= 16) {// 16시 전이면
			System.out.println("Good afternoon! :)");
		} else if (hour <= 22 ) {// 22시 전이면
			System.out.println("Good evening! :)");
		} else { // 모두 아니면
			System.out.println("Good night! :)");
		}
		
		if (month == 2) {//2월이면
			System.out.println("There are 28 days in this month.");
		} else if (month == 4) {
			System.out.println("There are 30 days in this month.");
		} else if (month == 6) {
			System.out.println("There are 30 days in this month.");
		} else if (month == 9) {
			System.out.println("There are 30 days in this month.");
		} else if (month == 11) {
			System.out.println("There are 30 days in this month.");
		} else {
			System.out.println("There are 31 days in this month.");
		}
	}

}
