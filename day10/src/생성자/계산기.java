package 생성자;

import java.util.Date;

public class 계산기 {
	public int add (int x, int y) {
		return x + y;
	}
	public double add (int x, double y) {
		return x + y;
	}
	public double add (double x, double y) {
		return x + y;
	}
	public String add (int x, String y) {
		return x + y;
	}
	public String add (String x, String y) {
		return x + y;
	}

	public int[] add() {
		int[] num = {1,2,3};
		return num;
	}
	
	public Date add(int x) {
		Date date = new Date();
		return date;
	}
	
//	public 물 가져와( ) {
//		return "생수"; // 생수 => 물 리턴값의 타입을 써줘야 함
//	}
}
