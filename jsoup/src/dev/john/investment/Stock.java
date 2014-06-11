package dev.john.investment;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Stock {
	private List<String> stockList = new ArrayList<String>();
	private final String urlPrefix = "https://tw.stock.yahoo.com/q/q?s=";
	private final int MAX_COLUMN = 10;

	public Stock(List<String> stockList) {
		this.stockList = stockList;
	}
	
	public Stock(String[] arr){
		Collections.addAll(stockList, arr);
	}

	public void showStockPrice() {
		try {
			for (int i = 0; i < stockList.size(); i++) {
				URL url = new URL(urlPrefix + stockList.get(i));
				Document doc = Jsoup.parse(url, 3000);
				if (i == 0)
					System.out.println(getTitle(doc));
				String result = getStockValue(doc);
				System.out.println(result);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public String getTitle(Document doc) {
		Elements centerTables = doc.select("center>table");
		Element wordTable = centerTables.get(1).select("table").get(0);
		Elements words = wordTable.select("th");
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
		return sb.toString();
	}

	public String getStockValue(Document doc) {
		Elements centerTables = doc.select("center>table");
		Element valueTable = centerTables.get(1).select("table").get(1);
		Elements values = valueTable.select("td");

		StringBuffer sb = new StringBuffer();
		String result;
		for (int i = 0; i < MAX_COLUMN + 1; i++) {
			if (i == 0) {
				result = values.get(i).text().substring(0, 4);
			} else {
				result = values.get(i).text();
			}
			sb.append(result + "\t");
		}
		return sb.toString();
	}

	public static void main(String[] argv) {
		Stock s = new Stock(getTestStockList());
		s.showStockPrice();

	}

	public static List getTestStockList() {
		List stocks = new ArrayList();
		stocks.add("0050");
		stocks.add("4205");
		stocks.add("8114");
		return stocks;
	}

}
