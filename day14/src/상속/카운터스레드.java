package ���;

public class ī���ͽ����� extends Thread {
@Override
public void run() {
	for (int i = 500; i >= 0; i--) {
		System.out.println("ī����: " + i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} // 1000�и������� = 1��
	}
}
}
