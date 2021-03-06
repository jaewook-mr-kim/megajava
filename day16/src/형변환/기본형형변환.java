package 형변환;

public class 기본형형변환 {

	public static void main(String[] args) {
		byte n1 = 100; //-128~127
		int n2 = n1; // 4바이트 <- 1바이트
		// 큰 <- 작 (자동으로 int로 변환되어 들어감)
		// 타입변환 (자동 형변환, 캐스팅)
		// byte n3 = n2; 안들어감... 1바이트 <- 4바이트
		// 작 <- 큰 (강제로 byte로 변환되어야 들어갈 수 있음)
		// 타입변환 (강제 형변환, 캐스팅, () 소괄호를 이용)
		byte n3 = (byte)n2;
		
		int n4 = 2000;
		byte n5 = (byte)n4; // 문법적으로는 틀린게 없으나, 들어갈 수 없는 값의 범주에 강제 캐스팅 하는 경우는 엉뚱한 갑이 들어감.
		
	}

}
