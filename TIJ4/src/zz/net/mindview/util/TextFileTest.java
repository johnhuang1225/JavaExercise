package zz.net.mindview.util;

import java.util.Arrays;
import java.util.List;

import net.mindview.util.TextFile;

public class TextFileTest {

	public static void main(String[] args) {
		String result = TextFile.read("resource/collectionstest.py");
		
//		String[] content = result.split("\\W+");
//		for (String string : content) {
//			System.out.println(string);
//		}
		
		List<String> list = Arrays.asList(result.split("\\W+"));
		for (String string : list) {
			System.out.println(string);
		}
	}

}
