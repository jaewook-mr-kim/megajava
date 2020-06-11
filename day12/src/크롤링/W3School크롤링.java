package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class W3School크롤링 {
	public static void main(String[] args) {
		// 예외처리를 왜 하는가?
		// - 에러가 발생하여 프로그램을 중단할 것 같은 코드에서, 중단하지 않고 코드의 진행을 계속하기 위해서.
		// 반드시 예외처리를 해주어야 하는 경우
		// - 외부자원을 연결하여 사용하는 경우
		// 1)네트워크 2)파일 3)DB 4)CPU
		
		// 코드의 오류, 해야할 처리를 하지 않아서 생기는 오류를 컴파일 오류 (컴파일 에러)
		// 컴파일 성공 후, 실행할 때 원하는 결과대로 실행되지 않는 경우 (런타임 에러, 실행 에러)
		
		Document doc = null; // 지역변수, 수동초기화 시켜줘야함
		try {
			doc = Jsoup.connect("https://www.w3schools.com/").get();
		} catch (IOException e) {
			// e.printStackTrace();
			System.out.println("크롤링 하는 중 에러발생. 수정필요.");
		}
		
		System.out.println(doc);
		Elements list = doc.select("h1");
		System.out.println(list.size() + "개 있음.");
		for (Element element : list) {
			System.out.println(element.text());
		}
		for (int i = 0; i < list.size(); i++) {
			if (i == 2 | i ==5) {
				continue;
			}
			System.out.println(list.get(i).text());
		}
		
		Elements list2 = doc.select("h2");
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i).text());
		}
		
		Elements list3 = doc.select("h3");
		System.out.println(list3.size() + "개 있음.");
		System.out.println(list3.get(24).text());
	}	
	
}
