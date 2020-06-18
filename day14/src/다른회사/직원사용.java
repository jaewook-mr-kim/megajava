package 다른회사;

import 우리회사.직원;

public class 직원사용 {
public static void main(String[] args) {
	// 자동 import => ctrl + shift + o
	직원 e = new 직원();
	// 가시성(visibility) public 으로 설정된 것만 다른 패키지에서도 보임.
	System.out.println(e.name);
	// System.out.println(e.salary);
	// System.out.println(e.address);
	// System.out.println(e.rrn); -> 가시성이 없다. 보이지 않는다.
}
}
