import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Society {
	private static final String societyHtml = "http://toutiao.com/";

	/**
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			Document document = Jsoup.connect(societyHtml).timeout(10000).get();
//			System.out.println(document);
			Elements select = document.select("[data-node=listBox]");
			System.out.println(select);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
