package 클래스;

public class 컴퓨터 {
// 컴퓨터 클래스 생성
// 컴퓨터 각 비용을 더하다.
// compute(모니터 가격, 본체 가격)
// 컴퓨터 구입 비용을 계산하다.
// total(컴퓨터대수, 비용)

// 컴퓨터 구매 클래스 생성
// 모니터 가격: 20만원
// 본체 가격: 30만원
// 구입 대수: 3대
// 한 대당 가격과, 컴퓨터 총 구입 비용을 계산해보세요.
	
	public int compute(int x, int y) {
		int cost = x + y;
		return cost; 
	}
	
	public int total(int x, int y) {
		int tc = x * y;
		return tc;
	}
}
