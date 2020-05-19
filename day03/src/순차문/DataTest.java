package 순차문;

import java.util.Date;

import javax.swing.JOptionPane;

public class DataTest {//카멜(낙타)표기법, 클래스 단어 마다 대문자 사용, 자바에서 주로 사용
						// date_test, 스네이크 표기법, 파이썬 같은 언어에서 주로 사용

	public static void main(String[] args) {
		Date date = new Date(); //연 월 일 요일, 시 분 초
		int year = date.getYear() + 1900; //밀레니엄문제 감안
		int month = date.getMonth() + 1; //음력기준, 부품의 특징
		int date2 = date.getDate();
		int day = date.getDay(); // "2" - 화요일 (일 월 화~ 0 1 2~)
		
		//JOptionPane.showMessageDialog(null, date2 + ", " + month + ", " + year);
		System.out.println(day);
		if (day == 0 || day == 6) { // 토요일이나 일요일이면,
			System.out.println("주말입니다.");
		}else if (day == 1) { // 월요일이면,
			System.out.println("한 주의 시작입니다.");
		}else if (day == 2) { // 화요일이면,
			System.out.println("열심히 살아요.");
		}else {
			System.out.println("아 귀찮다.");
		}
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();
		
		//JOptionPane.showMessageDialog(null, hour + ":" + min + ":" + sec);
	}
}
