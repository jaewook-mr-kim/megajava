package ũ�Ѹ�;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ���̹�����ũ�Ѹ�5 {

	public String[] naver(String data) {
		
		
		
		// System.out.println(doc);
		
			Document doc = null;
			try {
				doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=" + data).get();
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
			String past = list3.get(15).text();
			System.out.println("������: " + past);
			String max = list3.get(16).text();
			System.out.println("�ְ�: " + max);
			System.out.println("--------------");
			
			String[] values = {now, past, max};
			return values;
		
		}
		
	}


