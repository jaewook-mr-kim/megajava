package 클래스;

public class 나의집거실 {

	public static void main(String[] args) {
		Tv tv1 = new Tv(100, false);
		// tv1.ch = 100;
		// tv1.onOff = false;
		tv1.on();
		System.out.println(tv1);
		
		Tv tv2 = new Tv(200, true);
		// tv2.ch = 200;
		// tv2.onOff = true;
		tv2.off();
		
		전화기 전화기1 = new 전화기();
		전화기 전화기2 = new 전화기();
		
		전화기1.제조사 = "LG";
		전화기2.제조사 = "Samsung";
		전화기1.통신사 = "KT";
		전화기2.통신사 = "SKT";
		전화기1.번호 = "0311231234";
		전화기2.번호 = "027897890";
		
		전화기1.ring();
		전화기2.ring();
	}

}
