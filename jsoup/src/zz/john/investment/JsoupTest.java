package zz.john.investment;

import java.net.URL;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupTest {
	private static final int MAX_COLUMN = 10;

	public static void main(String[] args) throws Exception {
		URL url = new URL("https://tw.stock.yahoo.com/q/q?s=8114");
		Document doc = Jsoup.parse(url, 3000);
		// ----------
		// method(doc);
		// ----------
		// selectWithAttributeValue(doc);
		// ----------

		Elements centerTables = doc.select("center>table");
		// System.out.println(centerTables.get(1));
		// System.out.println(centerTables.get(1).select("table").get(0));
		// System.out.println();
		// System.out.println("-----------------");
		// System.out.println();
		// System.out.println(centerTables.get(1).select("table").get(1));

		Element wordTable = centerTables.get(1).select("table").get(0);
		Element valueTable = centerTables.get(1).select("table").get(1);

		Elements words = wordTable.select("th");
		Elements values = valueTable.select("td");

		StringBuffer sb = new StringBuffer();
		String text;
		for (int i = 0; i < MAX_COLUMN + 1; i++) {
			if (i == 0) {
				text = words.get(i).text().substring(3);
			} else {
				text = words.get(i).text();
			}
			sb.append(text + "\t");
		}
		sb.append("\n");
		String result;
		for (int i = 0; i < MAX_COLUMN + 1; i++) {
			if (i == 0) {
				result = values.get(i).text().substring(0, 4);
			} else {
				result = values.get(i).text();
			}
			sb.append(result + "\t");
		}
		System.out.println(sb);

	}

	private static void selectWithAttributeValue(Document doc) {
		/*
		 * 
		 */
		Elements titles = doc.select("th[align=center]");
		for (Element element : titles) {
			System.out.println(element.text());
		}

		/*
		 * 0: 1:時間 2:成交 3:買進 4:賣出 5:漲跌 6:張數 7:昨收 8:開盤 9:最高 10:最低
		 */
		Elements values = doc.select("td[bgcolor=#FFFfff]");
		for (Element element : values) {
			System.out.println(element.text());
		}
	}

	private static void method(Document doc) {
		Elements tables = doc.select("center>table");
		Iterator iterator;
		for (Element table : tables) {
			iterator = table.select("tr").iterator();
			while (iterator.hasNext()) {
				System.out.println("data" + ": "
						+ ((Element) iterator.next()).text().trim());
			}
		}

		System.out.println("-----------------");

		Element table = tables.get(1).select("table").get(0);
		iterator = table.select("th").iterator();
		while (iterator.hasNext()) {
			System.out.println("data" + ": "
					+ ((Element) iterator.next()).text().trim());
		}

		System.out.println("-----------------");

		Element table2 = tables.get(1).select("table").get(1);
		iterator = table2.select("td").iterator();
		while (iterator.hasNext()) {
			System.out.println("data" + ": "
					+ ((Element) iterator.next()).text().trim());
		}
	}
}
