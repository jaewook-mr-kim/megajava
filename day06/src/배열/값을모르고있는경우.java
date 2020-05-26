package 배열;

public class 값을모르고있는경우 {

	public static void main(String[] args) {
		int[] num = new int[1000]; // 힙 영역에 int 1000개 생성 []는 배열을 의미함
		System.out.println(num); // 주소값이 찍힘.
		System.out.println(num[0]); // 위치값 (index), 0부터 시작
		System.out.println(num[999]); 
		// 배열은 초기값이 다 들어있다. int -> 0, double -> 0.0
		num[500] = 1;
		num[666] = 1;
		
		boolean[] seat = new boolean[7];
		System.out.println(seat.length); // 읽기 전용 변수: 배열의 갯수
		seat[2] = true;
		seat[3] = true;
		seat[4] = true;
		seat[5] = true;
		System.out.println(seat[0] == seat[2]); // 기본형 boolean 이기 때문에 비교 연산자 가능, 참조타입 seat는 불가능
		
		for (int i = 0; i < seat.length; i++) {
			System.out.print(seat[i] + " ");
		} // for문 내에서의 i는 배열에서 index 역할 (i => index)

	}

}
