package 생성자;

public class 은행에가자 {

	public static void main(String[] args) {
		// 생성자 오버로딩
		// 입력값 없는 생성자는 기본 생성자!
		// 파라미터 있는 생성자가 하나도 없으면, 자동생성! (묵시적)
		// 계좌 account0 = new 계좌();
		// 파라미터 있는 생성자가 있는 경우는 기본 생성자가 만들어지지 않음.
		// 따라서, 이 경우에는 클래스에 별도로 추가해주어야 기본 생성자 사용 가능. (명시적)
		계좌 account0 = new 계좌();
		account0.이름 = "홍길식";
		account0.종류 = "연금";
		account0.money = 30000;
		
		계좌 account1 = new 계좌("홍길동", "적금", 10000);
		계좌 account2 = new 계좌("홍길순", "예금");
		account2.money = 20000;
		
	}

}
