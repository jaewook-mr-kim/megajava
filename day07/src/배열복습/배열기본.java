package �迭����;

public class �迭�⺻ {

	public static void main(String[] args) {
		// 1. �迭�� ����� ������ ���� ���� �����͸� �̹� �˰� �ִ� ���
		
		String[] food = {"�����", "«��", "������"};
		// {"����", 100, '��'} �̷������� �ٸ� Ÿ�Գ��� ���� �� ����.
		// Object[] p = {"����", 100, '��'}; ��� ������ ���� ����� ������, ����� ��ȿ�����̿��� ���� �ʴ´�.
		
		food[0] = "������";
		
		for (int i = 0; i < food.length; i++) {
			System.out.println(food[i]);
		}
		
		for (String x : food) {
			System.out.println(x);
		}
		
		// 2. �迭�� ����� ������ ���� ���� �����͸� �𸣰� �ִ� ���
		String[] job = new String[3];
		
		job[0] = "ȸ����";
		job[1] = "�Ҽ���";
		job[2] = "���డ";
		
		for (int i = 0; i < job.length; i++) {
			System.out.println(job[i]);
		}
		
	}

}
