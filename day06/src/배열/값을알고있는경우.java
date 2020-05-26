package 배열;
	// int win = 0; // 전역변수 (global variable)
public class 값을알고있는경우 {
// 램에 변수가 생기는 시기: 선언
// 선언의 위치가 생존의 범위
// 함수 내의 지역에만 생존할 수 있는 변수: 지역변수 (local variable)
	public static void main(String[] args) {
		String[] names = {"홍길동", "홍길순", "홍길정"};
		char[] gender = {'남', '여', '남'};
		int[] age = {30, 20, 25};
		double[] height = {187.3, 160.5, 155};
		
		for (int i = 0; i < height.length; i++) {
			System.out.print(names[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < height.length; i++) {
			System.out.print(gender[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < height.length; i++) {
			System.out.print(age[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < height.length; i++) {
			System.out.print(height[i] + " ");
		}
		System.out.println();
		
		for (String x : names) { //for each문  (임시변수 : 배열)
			System.out.print(x + " ");
		}
		System.out.println();
		
		for (char y : gender) {
			System.out.print(y + " ");
		}
		System.out.println();
		
		for (int z : age) {
			System.out.print(z + " ");
		}
		System.out.println();
		
		for (double d : height) {
			System.out.print(d + " ");
		}
	}

}
