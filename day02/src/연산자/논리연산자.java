package 연산자;

public class 논리연산자 {

	public static void main(String[] args) {
		// 논리적인 판단을 하려고 할 때, 조건이 2개 이상인 경우
		// 조건이 2개 다 만족해야하는지: and조건 (&&)
		// 조건이 2개 중 하나만 만족해도: or조건 (||)
		
		// 로그인 처리
		int id = 1111; // 가입시 id
		int pw = 2222;
		
		int id2 = 1000; // 입력한 id
		int pw2 = 2222;
		
		// 단, 실제로 아이디, 패스워드는 문자열로 이루어져 있어 기본 데이터가 아니기 때문에 비교 연산자를 쓸 수가 없다.
		// 따라서, 클래스는 값을 비교할 수 없다.
		if (id == id2 && pw == pw2) {
			System.out.println("Log-in was successful :)");
		} else {
			System.out.println("Log-in was unsuccessful :(");
		}
	}

}
