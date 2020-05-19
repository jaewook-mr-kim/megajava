package 복습;

public class 정리문제 {

	public static void main(String[] args) {
		// 정수
		int hour = 7;
		
		// 실수
		double min = 0.49;
		
		// 문자
		char day = '화';
		
		// 논리
		boolean lecture = true;
		
		System.out.println("지금 시각은 " + hour);
		System.out.println("지금 분은 " + min);
		System.out.println("오늘은 " + day + "요일");
		System.out.println("강의가 있습니까?: " + lecture); // system.out.print 에서 " . " 은 접근 연산자라고 부른다
		
		// 기본형 이외의 데이터, 특별하게 기본형처럼 만들어 놓은 것.
		String name = "홍길동";
		
		//**********************************************************************************************
		
		int num1 = 200;
		int num2 = 100;
		
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 <= num2);
		
		String n1 = "홍길동";
		String n2 = "박길동";
		
		System.out.println(n1.equals(n2)); // 기본형 데이터가 아니기 때문에 비교를 위해선 부품 사용
	
		if (n1.equals(n2)) { //true
			System.out.println("동일인이시군요!");
		} else { //false
			System.out.println("동일인이 아니시군요!");

		}
	}

}
