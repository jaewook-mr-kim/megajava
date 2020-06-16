package 예제;

public class Account {
	String no; // 계좌번호
	String name; // 계좌주
	double money; // 초기입금액
	
	// 객체 생성시 자동호출되는 메소드: 생성자 메소드
	// 입력값에 따라 메소드가 호출된다.
	// 파라메터 있는 생성자를 만들어놓으면 객체 생성시 반드시 필요한 항목들을 지정할 수 있다.
	public Account(String no, String name, double money) {
		this.no = no;
		this.name = name;
		this.money = money;
	}

	public String toString() {
		return "Account [no=" + no + ", name=" + name + ", money=" + money + "]";
	}
	
	
}
