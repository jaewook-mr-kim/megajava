package Ŭ����;

public class �������Ž� {

	public static void main(String[] args) {
		Tv tv1 = new Tv(100, false);
		// tv1.ch = 100;
		// tv1.onOff = false;
		tv1.on();
		System.out.println(tv1);
		
		Tv tv2 = new Tv(200, true);
		// tv2.ch = 200;
		// tv2.onOff = true;
		tv2.off();
		
		��ȭ�� ��ȭ��1 = new ��ȭ��();
		��ȭ�� ��ȭ��2 = new ��ȭ��();
		
		��ȭ��1.������ = "LG";
		��ȭ��2.������ = "Samsung";
		��ȭ��1.��Ż� = "KT";
		��ȭ��2.��Ż� = "SKT";
		��ȭ��1.��ȣ = "0311231234";
		��ȭ��2.��ȣ = "027897890";
		
		��ȭ��1.ring();
		��ȭ��2.ring();
	}

}
