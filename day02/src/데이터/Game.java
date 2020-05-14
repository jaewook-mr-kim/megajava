package 데이터;

public class Game {

	public static void main(String[] args) {
		// 이것이 자바다 p.36 참고, 변수를 선언한 위치에 따라 사용 가능/불가능이 정해진다. 범위 {} 확인
		int x = 300;
		int move = 50;
		x = x - move; // 250
		System.out.println("the value of x after the shift : " + x);
		x = x - move; // 200
		System.out.println("the value of x after the shift : " + x);
	byte age = 100;
	short book = 1000;
	long money = 22222222220L;
	
	double height = 185.2222222;
	float weight = 55.55F; // 이거 float 만으로 충분하다 라고 컴퓨터에게 알려주는 것
	}

}
// 이것이 자바다 p.38 참고
// 기본 데이터 타입 정리

