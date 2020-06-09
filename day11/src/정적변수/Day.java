package 정적변수;

public class Day {
	// 인스턴스 변수, 객체 생성될 때마다 새로 만들어지는 것
	String doing;
	int time;
	String location;
	
	// 스태틱 변수
	static int count;
	static int totalTime;
	
	public Day(String doing, int time, String location) {
		count++;
		totalTime += time; // totalTime = totalTime + time;
		this.doing = doing;
		this.time = time;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
	
	
	
	
}
