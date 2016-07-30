import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MoreChannel {

	/**
	 * 抓取跟多频道和地址
	 ** 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Document document = Jsoup.connect("http://toutiao.com/")
					.timeout(10000).get();
			Elements elements = document.select("ul.more-channels").select("a");
			// System.out.println(elements);
			for (Element element : elements) {
				System.out.println(element.text());
				System.out.println(element.attr("abs:href"));
			}
			// Elements select = document.select("li");
			// System.out.println("select"+select);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
