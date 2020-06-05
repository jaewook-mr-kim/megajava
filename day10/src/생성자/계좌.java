package 생성자;

public class 계좌 {
	String 이름;
	String 종류;
	int money;
	
	//public : 접근 제어자
	// 접근 제어자 : public, protected, default(x), private
	// default : 같은 패키지 내에서만 접근하여 사용 가능 (앞에 아무것도 안쓰는 것)
	public 계좌() {
	}

	public 계좌(String 이름, String 종류) {
		this.이름 = 이름;
		this.종류 = 종류;
	}



	public 계좌(String 이름, String 종류, int money) {
		this.이름 = 이름;
		this.종류 = 종류;
		this.money = money;
	}
	
	
}
