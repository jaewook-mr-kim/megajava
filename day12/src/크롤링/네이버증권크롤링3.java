package ũ�Ѹ�;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ���̹�����ũ�Ѹ�3 {

	public static void main(String[] args) {
		String[] codes = {"068270", "005930", "004310"};
		
		
		
		// System.out.println(doc);
		
		for (int i = 0; i < codes.length; i++) {
			Document doc = null;
			try {
				doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=" + codes[i]).get();
			} catch (IOException e) {
				// e.printStackTrace();
				System.out.println("ũ�Ѹ� �ϴ� �� �����߻�. �����ʿ�.");
			}
			Elements list = doc.select(".code");
			// System.out.println(list.size());
			String code = list.get(0).text();
			System.out.println("�ڵ�: " + code);
			Elements list2 = doc.select(".wrap_company   a"); // .wrap_company > a �տ��� �ٷιؿ� a�� ������. �׳� ���� �ؿ� ��򰡿� ������.
			// System.out.println(list2.size());
			// for (int i = 0; i < list2.size(); i++) {
			// 	System.out.println(list2.get(i).text());
			// }
			String name = list2.get(0).text();
			System.out.println("ȸ���: " + name);
			
			Elements list3 = doc.select("span.blind"); //ũ�Ѹ��� �������� Ŭ�� �̸��� ���� �ٲٴ� ������ ����. ����
			String now = list3.get(12).text();
			System.out.println("���簡: " + now);
			System.out.println("--------------------------------");
			
		}
		}
		
	}


