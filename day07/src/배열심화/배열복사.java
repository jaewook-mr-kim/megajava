package 배열심화;

public class 배열복사 {

	public static void main(String[] args) {
		// int x = 100;
		// int y = x; // 기본형의 복사
		// x : 100 y : 100
		// x = 200; // x : 200 y : 100
		// y는 그대로임.
		
		int[] x = {100, 200, 300};
		int[] y = x; // 참조형의 복사
		for (int i = 0; i < y.length; i++) {
			System.out.println("x : " + x[i] + ", " + "y : " + y[i]);
		}
		
		x[0] = 999;
		
		for (int i = 0; i < y.length; i++) {
			System.out.println("x : " + x[i] + ", " + "y : " + y[i]);
		} // y도 x랑 같이 바뀜.
		
		System.out.println("얕은 복사x주소: " + x);
		System.out.println("얕은 복사y주소: " + y);
		// 동일한 주소
		
		System.out.println("-----------------------");
		
		int[] a = {100, 200, 300};
		int[] b = a.clone();
		System.out.println("깊은 복사a주소: " + a);
		System.out.println("깊은 복사b주소: " + b);
		
		// 주소 다름
		
		a[0] = 999;
		
		for (int i = 0; i < b.length; i++) {
			System.out.println("a : " + a[i] + ", " + "b : " + b[i]);
		} // b가 a따라서 안바뀜
	}

}
