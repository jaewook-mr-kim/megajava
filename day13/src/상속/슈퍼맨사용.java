package 상속;

public class 슈퍼맨사용 {

	public static void main(String[] args) {
		슈퍼맨 s = new 슈퍼맨();
		s.name = "클라크"; // 사람
		s.age = 200; // 사람
		s.power = 100; // 맨
		s.sky = true; // 슈퍼맨
		
		s.run();
		s.space();
		
		System.out.println(s);
	}

}
