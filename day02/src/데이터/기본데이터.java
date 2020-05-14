package 데이터;

public class 기본데이터 {

	public static void main(String[] args) {
		int x = 300; // 데이터 타입 int: -21억 ~ 21억 의 정수
		int y = 600; // 변수 선언, RAM이 변수를 저장하는 공간을 마련함
		double move = 22.5; // 데이터 타입 double: 실수
							// 한 글자 이상은 기본 데이터가 아님
							// 기본 데이터가 아닌 것은 다 부품을 사용
		System.out.println("우주선의 좌표는 ("+ x + "," + y + ") 입니다.");
		
		int z; // 변수 선언 때 값을 지정하지 않아도 됨
		int a, b, c; // 여러 개의 변수를 동시에 선언할 수 있음 , 쓰레기값이 들어있는 상태
		// System.out.println(a); // 에러 발생, 쓰레기값은 연산이 불가능하며 처리 대상이 아님
	}

}
