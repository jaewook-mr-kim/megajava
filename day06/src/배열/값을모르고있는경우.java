package �迭;

public class �����𸣰��ִ°�� {

	public static void main(String[] args) {
		int[] num = new int[1000]; // �� ������ int 1000�� ���� []�� �迭�� �ǹ���
		System.out.println(num); // �ּҰ��� ����.
		System.out.println(num[0]); // ��ġ�� (index), 0���� ����
		System.out.println(num[999]); 
		// �迭�� �ʱⰪ�� �� ����ִ�. int -> 0, double -> 0.0
		num[500] = 1;
		num[666] = 1;
		
		boolean[] seat = new boolean[7];
		System.out.println(seat.length); // �б� ���� ����: �迭�� ����
		seat[2] = true;
		seat[3] = true;
		seat[4] = true;
		seat[5] = true;
		System.out.println(seat[0] == seat[2]); // �⺻�� boolean �̱� ������ �� ������ ����, ����Ÿ�� seat�� �Ұ���
		
		for (int i = 0; i < seat.length; i++) {
			System.out.print(seat[i] + " ");
		} // for�� �������� i�� �迭���� index ���� (i => index)

	}

}
