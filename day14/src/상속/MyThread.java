package 상속;

public class MyThread {

	public static void main(String[] args) {
		Star star = new Star();
		Dia dia = new Dia();
		// star.run();
		// dia.run();
		star.start();
		dia.start();
		// 동시에 실행하라고 cpu에 알려주어야 한다.
	}

}
