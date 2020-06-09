package 복습;

public class MyRoom {

	public static void main(String[] args) {
		Tv myTv = new Tv(7, 9, true);
		Tv yourTv = new Tv(9, 12, true);
		
		System.out.println(myTv);
		System.out.println(yourTv);
		
		for (int i = 0; i < 100; i++) {
			Tv tv = new Tv(1, 1, true);
		}
		System.out.println(myTv.channel);
		System.out.println(yourTv.channel);
		System.out.println("객체 생성 개수는 " + myTv.count);
		System.out.println("객체 생성 개수는 " + yourTv.count); // 스태틱 변수는 공유된다는 것을 알 수 있음. 다만 이렇게 쓰면 헷갈림
		System.out.println("객체 생성 개수는 " + Tv.count); //그래서 이렇게 씀
	}

}
