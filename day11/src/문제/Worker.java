package 문제;

public class Worker {
	String name;
	String gender;
	int age;
	
	static int count;
	static int totalAge;
	
	public Worker(String name, String gender, int age) {
		count++;
		totalAge += age;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Worker [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	// 인스턴스 변수를 가져오고 싶을 때 사용
	// 객체 생성 후, 일반 메소드는 호출하여 사용할 수 있다.
	// wk1.getName(); 즉, wk1 이라는 주소가 필요
	public String getName() { //자동 완성 기능 제공함. getN + space bar + ENTER
		return name;
	}
	
	// 스태틱 변수를 가져오고 싶을 때 사용
	// 객체 생성과 무관하게 클래스 이름으로 바로 접근하여 사용할 수 있다.
	// 클래스이름.스태틱변수, 클래스이름.스태틱메소드
	// Worker.getTotalAge
	public static int getTotalAge() {
		return totalAge;
	}
	
	
	
}
