package ���ǹ�;

public class �α��� {

	public static void main(String[] args) {
		String id = "root"; //ȸ���������� ���� id
		String id2 = "admin"; //�Է��� id
		String pw = "java123"; //ȸ���������� ���� pw
		String pw2 = "JAVA123"; //�Է��� pw
		String id3 = "root";
		String pw3 = "java123";
		
		if (id.equals(id2) && pw.equals(pw2)) { // ȸ���������� ���� id�� �Է��� id�� ��ġ�� ��,
			System.out.println("Log-in was successful :)");
		} else { // ��ġ���� ���� ��,
			System.out.println("Log-in was unsuccessful :(");
		}
		
		if (id.equals(id3) && pw.equals(pw3)) { 
			System.out.println("Log-in was successful :)");
		} else {
			System.out.println("Log-in was unsuccessful :(");
		}
		
	}
// ���̵�, �н������� �Է��� ����ϴ� ��ǰ�� ���� �˾ƺ���!
}
