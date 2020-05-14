package 데이터;

public class 기본데이터2 {

	public static void main(String[] args) {
		int age = 100;
		double height = 185.2;
		boolean did_i_have_food = true; // true or false
		char gender = 'm'; // '' 한 글자 일 때, char 데이터 타입
	
		String name = "Bruce Wayne"; // "" 여러 글자일 때, String (부품이기 때문에 대문자), 스트링 / 문자열 
		
		System.out.println("My Profile");
		System.out.println("Name                          : " + name);
		System.out.println("Gender                        : " + gender);
		System.out.println("Age                           : " + age);
		System.out.println("Height                        : " + height);
		System.out.println("Did I have food this evening? : " + did_i_have_food);
		// ctrl + alt + arrow down (한줄 복사)	
		// alt + arrow key (한줄 이동)
	}

}
