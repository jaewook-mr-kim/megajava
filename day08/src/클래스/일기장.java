package 클래스;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class 일기장 {

	public static void main(String[] args) throws Exception { //예외처리, 나중에 다시 알아볼 것임.
		// 입력을 받아보자.
		String date = JOptionPane.showInputDialog("날짜입력");
		String title = JOptionPane.showInputDialog("제목입력");
		String content = JOptionPane.showInputDialog("내용입력");
		// 위치를 지정해서 저장해보자.
		// File file = new File("c:/imsi");
		// System.out.println("파일의 존재여부 : " + file.exists());
		
		
		// 파일로 인식 + 쓸 수 있다.
		FileWriter file = new FileWriter(date + ".txt");
		file.write(date + "\n"); // 엔터 => 역슬래시 n (new line)
		file.write(title + "\n");
		file.write(content + "\n");
		file.close(); // 다 썼으니 파일로 옮겨줘.
	}
	// 부품 인터넷에서 찾기 : Maven Repository 검색 => 여기에도 없으면 직접 만들어야함.

}
