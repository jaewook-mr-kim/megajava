package ���;

public class MyThread {

	public static void main(String[] args) {
		Star star = new Star();
		Dia dia = new Dia();
		// star.run();
		// dia.run();
		star.start();
		dia.start();
		// ���ÿ� �����϶�� cpu�� �˷��־�� �Ѵ�.
	}

}
