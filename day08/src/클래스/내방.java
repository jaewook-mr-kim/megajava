package 클래스;

public class 내방 {

	public static void main(String[] args) {
		강아지 강1 = new 강아지();
		강아지 강2 = new 강아지();
		강1.color = "황색";
		강1.name = "메리";
		강1.bark(); //함수 사용! 메소드 콜, 호출
		강1.shake();
		System.out.println("이름은 " + 강1.name);
		System.out.println("색은 " + 강1.color);
		
		강2.color = "흰색";
		강2.name = "백구";
		강2.bark();
		강2.shake();
		System.out.println("이름은 " + 강2.name);
		System.out.println("색은 " + 강2.color);
		
		핸드폰 폰 = new 핸드폰();
		폰.company = "애플";
		폰.model = "x";
		폰.color = "검정색";
		폰.number = "01012341234";
		폰.ring();
	} 

}
