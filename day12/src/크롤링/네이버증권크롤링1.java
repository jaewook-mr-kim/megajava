package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링1 {

	public static void main(String[] args) {
		// String[] codes = {"068270", "005930", "004310"};
		
		Document doc = null;
		try {
			doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=068270").get();
		} catch (IOException e) {
			// e.printStackTrace();
			System.out.println("크롤링 하는 중 에러발생. 수정필요.");
		}
		
		// System.out.println(doc);
		
		Elements list = doc.select(".code");
		// System.out.println(list.size());
		String code = list.get(0).text();
		System.out.println("코드: " + code);
		
		Elements list2 = doc.select(".wrap_company   a"); // .wrap_company > a 앞에꺼 바로밑에 a가 있을때. 그냥 띄어쓰면 밑에 어딘가에 있을때.
		// System.out.println(list2.size());
		// for (int i = 0; i < list2.size(); i++) {
		// 	System.out.println(list2.get(i).text());
		// }
		String name = list2.get(0).text();
		System.out.println("회사명: " + name);
		System.out.println("--------------------------------");
	}

}
