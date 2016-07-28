import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupText {
	private static final String html = "http://toutiao.com/";

	/**
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
				String absHref = element.attr("abs:href");
				System.out.println(absHref);
			}

			for (Element element : docitem) {
				String title = element.text();
				System.out.println(title);

			}

			Elements docTitle = document.select("li.item clearfix ");

			System.out.println(docTitle.size());
			Elements linktitle = docTitle.select("a");
			for (Element element : linktitle) {
				String absHref = element.attr("abs:href");
				System.out.println(absHref);
			}

			for (Element element : linktitle) {
				String title = element.text();
				System.out.println(title);

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// »ñÈ¡ÍÆ¼ö

}
