package ����;

public class Account {
	String no; // ���¹�ȣ
	String name; // ������
	double money; // �ʱ��Աݾ�
	
	// ��ü ������ �ڵ�ȣ��Ǵ� �޼ҵ�: ������ �޼ҵ�
	// �Է°��� ���� �޼ҵ尡 ȣ��ȴ�.
	// �Ķ���� �ִ� �����ڸ� ���������� ��ü ������ �ݵ�� �ʿ��� �׸���� ������ �� �ִ�.
	public Account(String no, String name, double money) {
		this.no = no;
		this.name = name;
		this.money = money;
	}

	public String toString() {
		return "Account [no=" + no + ", name=" + name + ", money=" + money + "]";
	}
	
	
}
