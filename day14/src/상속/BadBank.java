package ���;

public class BadBank extends Bank {

	
	
	 public BadBank() {
		super(); //�⺻��
		//�θ�Ŭ���� ��ü���� ���� �����Ǿ�� �Ѵ�.
		//super() �⺻�����ڴ� �Ƚ��൵ ������
		//�θ�Ŭ������ �⺻�����ڰ� ȣ��!
		//��������� ���־���ϴ� ��쿡��
		//�ٸ� ó������ ���� �⺻�����ڰ� ȣ��ǵ��� �ؾ��Ѵ�.
		
	}
		@Override
		public void interest() {
			System.out.println("10%�� ���ڸ� �޴�.");
		}
}
