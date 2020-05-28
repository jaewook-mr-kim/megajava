package 배열복습;

public class 배열기본 {

	public static void main(String[] args) {
		// 1. 배열을 만드는 시점에 많은 양의 데이터를 이미 알고 있는 경우
		
		String[] food = {"자장면", "짬뽕", "볶음밥"};
		// {"엄마", 100, '여'} 이런식으로 다른 타입끼리 묶을 수 없다.
		// Object[] p = {"엄마", 100, '여'}; 사실 억지로 쓰는 방법은 있지만, 상당히 비효율적이여서 쓰지 않는다.
		
		food[0] = "갈비탕";
		
		for (int i = 0; i < food.length; i++) {
			System.out.println(food[i]);
		}
		
		for (String x : food) {
			System.out.println(x);
		}
		
		// 2. 배열을 만드는 시점에 많은 양의 데이터를 모르고 있는 경우
		String[] job = new String[3];
		
		job[0] = "회사인";
		job[1] = "소설가";
		job[2] = "여행가";
		
		for (int i = 0; i < job.length; i++) {
			System.out.println(job[i]);
		}
		
	}

}
