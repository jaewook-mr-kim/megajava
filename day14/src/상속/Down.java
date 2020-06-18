package »ó¼Ó;

public class Down extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(1000 - i);
		}
	}
}
