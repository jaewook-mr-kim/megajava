package 네트워크방식;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws IOException {
		//승인용 소켓이 필요
		//네트워크와 같은 외부연결은 무조건 예외처리!
		//포트를 설정하지 않으면, 5자리의 임의의 포트를 만들어서 전송
		ServerSocket server = new ServerSocket(9100);
		System.out.println("TCP 서버 소켓 시작됨...");
		System.out.println("클라이언트의 연결을 기다리는 중...");
		
		int count = 0; //연결된 클라이언트 수
		while (true) {
			//데이터 전달용 소켓이 필요
			Socket socket = server.accept();
			count++;
			System.out.println(count + "개의 클라이언트와 연결 성공...!");
		}
		
	}

}
