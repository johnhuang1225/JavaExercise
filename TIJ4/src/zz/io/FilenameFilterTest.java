package zz.io;

import java.io.File;
import java.io.FilenameFilter;

public class FilenameFilterTest {

	public static void main(String[] args) {
		// filenameFilter();
		multiFilenameFilter();
	}

	private static void multiFilenameFilter() {
		MyMultiFilenameFilter filter = new MyMultiFilenameFilter();
		File dir = new File("D:\\Java");
		String[] files = dir.list(filter);
		for (String string : files) {
			System.out.println(string);
		}
	}

	private static void filenameFilter() {
		MyFilenameFilter filter = new MyFilenameFilter(".txt");
		File dir = new File("D:\\Java");
		String[] files = dir.list(filter);
		for (String string : files) {
			System.out.println(string);
		}
	}

}

class MyMultiFilenameFilter implements FilenameFilter {

	private static String[] acceptString = { ".java", ".txt", ".doc" };

	@Override
	public boolean accept(File dir, String name) {
		for (int i = 0; i < acceptString.length; i++) {
			if (name.endsWith(acceptString[i]))
				return true;
		}
		return false;
	}

}

class MyFilenameFilter implements FilenameFilter {

	private String pattern;

	public MyFilenameFilter(String pattern) {
		this.pattern = pattern;
	}

	@Override
	public boolean accept(File dir, String name) {
		if (name.endsWith(pattern))
			return true;
		return false;
	}

}
