package ũ�Ѹ�;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class W3Schoolũ�Ѹ� {
	public static void main(String[] args) {
		// ����ó���� �� �ϴ°�?
		// - ������ �߻��Ͽ� ���α׷��� �ߴ��� �� ���� �ڵ忡��, �ߴ����� �ʰ� �ڵ��� ������ ����ϱ� ���ؼ�.
		// �ݵ�� ����ó���� ���־�� �ϴ� ���
		// - �ܺ��ڿ��� �����Ͽ� ����ϴ� ���
		// 1)��Ʈ��ũ 2)���� 3)DB 4)CPU
		
		// �ڵ��� ����, �ؾ��� ó���� ���� �ʾƼ� ����� ������ ������ ���� (������ ����)
		// ������ ���� ��, ������ �� ���ϴ� ������ ������� �ʴ� ��� (��Ÿ�� ����, ���� ����)
		
		Document doc = null; // ��������, �����ʱ�ȭ ���������
		try {
			doc = Jsoup.connect("https://www.w3schools.com/").get();
		} catch (IOException e) {
			// e.printStackTrace();
			System.out.println("ũ�Ѹ� �ϴ� �� �����߻�. �����ʿ�.");
		}
		
		System.out.println(doc);
		Elements list = doc.select("h1");
		System.out.println(list.size() + "�� ����.");
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
		System.out.println(list3.size() + "�� ����.");
		System.out.println(list3.get(24).text());
	}	
	
}
