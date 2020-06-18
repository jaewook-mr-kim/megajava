package 우리회사;

public class 직원 {
	public String name = "홍길동"; //+name 제일 범위가 넓음, 같은패키지 + 다른패키지
	protected int salary = 100; //#salary 같은 패키지 + 다른패키지 (상속관계에 있는)
	String address = "서울"; //default 같으느 패키지 내에서 접근 가능
	private int rrn = 801010; //-rrn 제일 범위가 좁음, 해당 클래스에서만 접근 가능
	
	
	@Override
	public String toString() {
		return "직원 [name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn + "]";
	}
	
	
}
