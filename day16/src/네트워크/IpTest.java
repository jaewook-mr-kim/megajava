package ��Ʈ��ũ;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpTest {
	public static void main(String[] args) throws Exception {
		// 127.0.0.1
		// URL url = new URL("http://www.naver.com");
		InetAddress ip = InetAddress.getByName("127.0.0.1");
		System.out.println(ip);
}
}
