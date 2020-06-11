package 크롤링;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링4 {

	public static void main(String[] args) {
		String[] codes = {"068270", "005930", "004310"};
		
		
		
		for (int j = 0; j < codes.length; j++) {
			// System.out.println(doc);
			Document doc = null;
			try {
				doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=" + codes[j]).get();
			} catch (IOException e) {
				// e.printStackTrace();
				System.out.println("크롤링 하는 중 에러발생. 수정필요.");
			}
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
			Elements list3 = doc.select("span.blind"); //크롤링을 막으려고 클라스 이름을 자주 바꾸는 습성이 있음. 주의
			String now = list3.get(12).text();
			System.out.println("현재가: " + now);
			String past = list3.get(15).text();
			System.out.println("어제가: " + past);
			String max = list3.get(16).text();
			System.out.println("최고가: " + max);
			System.out.println("--------------");
			try {
				FileWriter file = new FileWriter(name + ".txt");
				file.write(code + "\n");
				file.write(name + "\n");
				file.write(now + "\n");
				file.write(past + "\n");
				file.write(max + "\n");
				file.close();
			} catch (IOException e) {
				System.out.println("에러발생함.");
			} 
		}
			

		
		}
		
	}


