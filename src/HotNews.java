import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


public class HotNews {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
		Document document = Jsoup.connect("http://toutiao.com/news_hot/").get();
		Elements elements = document.select("a.link title");
		System.out.println(elements.size());
//		System.out.println(document.body());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
