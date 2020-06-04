package 클래스;

public class 컴퓨터구매 {
	public static void main(String[] args) {
		int mp = 200000;
		int cp = 300000;
		int count = 3;
		
		컴퓨터 컴퓨터 = new 컴퓨터();
		int cost = 컴퓨터.compute(mp, cp);
		
		System.out.println("컴퓨터 한 대당 가격은 " + cost + "원입니다.");
		
		int tc = 컴퓨터.total(count, cost);
		
		System.out.println("컴퓨터 3대의 총 구매비용은 " + tc + "원입니다.");
		
}
}