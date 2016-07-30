import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupChannel {
	private static final String html = "http://toutiao.com/";

	/**
	 * 抓取频道和频道地址
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Document document;
		try {
			document = Jsoup.connect(html).get();
			// System.out.println(document.body());
			Elements docitem = document.select("ul.channel-box");

			System.out.println(docitem);
			Elements link = docitem.select("a");
			for (Element element : link) {
				String title = element.text();
				System.out.println(title);
				String absHref = element.attr("abs:href");
				System.out.println(absHref);

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	

}
