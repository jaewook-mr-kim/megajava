package ��ӻ�����;

public final class Child extends Parent { //final -> ����Ŭ����, ����� �� �̻� ���ϴ� Ŭ����
@Override
	void tv() {
		System.out.println("����ȣ~!");
	}

	void together() {
		tv(); // ���� ���濡�� tv�� ��
		super.tv(); // �θ���� tv�� ��
		// ���� -> �θ�Ŭ����
	}
}
