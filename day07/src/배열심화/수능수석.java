package �迭��ȭ;

import java.util.Arrays;
import java.util.Random;

public class ���ɼ��� {

	public static void main(String[] args) {
		Random r = new Random(55);
		int[] jumsu = new int[10000];

		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(401);
		}

		// �ı��� �Լ�
		// Arrays.sort(jumsu); // ������������ ������Ŵ (������ ������ �ǵ帮�Ƿ� �ı��� �Լ�)

		// for (int x : jumsu) {
		// System.out.println(x);
		// }
		// System.out.println("�ְ������� " + jumsu[9999] + "�� �Դϴ�."); // �ټ���� �������� ã��. ������
		// �ı��ϴµ��ٰ� �޸𸮸� �ι�� �Ծ ��ȿ�� ���� �� ����.

		for (int x : jumsu) {
			System.out.println(x);
		}
		// �ٸ� ���. �� ����� �� ��ȣ��.
		int max = jumsu[0];
		// ��ü ������ ���鼭
		// ���� üũ : �ְ� ���� max�� �־�� ������ ū��?
		// ó�� : ���� ũ�ٸ�, �� �ε��������� �ְ��� �ȴٴ� ��������, max = �ش簪 ���� ����.

		for (int i = 0; i < jumsu.length; i++) {
			if (max < jumsu[i]) {
				max = jumsu[i];
			}
		}
		System.out.println("�ְ��� " + max);

		for (int i = 0; i < jumsu.length; i++) {

			if (jumsu[i] == max) {
				System.out.println("��ȣ : " + (i + 1));
			}
		}
		System.out.println("�ο��� ");
	}

}
