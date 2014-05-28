package holding;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import net.mindview.util.TextFile;

public class UniqueWords {

	public static void main(String[] args) {
		caseSensitive();
		caseInsensitive();
	}

	private static void caseSensitive() {
		List text = new TextFile("src/holding/SetOperations.java", "\\W+");
		Set<String> words = new TreeSet<String>(text);
		System.out.println(words);
	}

	private static void caseInsensitive() {
		List text = new TextFile("src/holding/SetOperations.java", "\\W+");
		Set<String> words = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		words.addAll(text);
		System.out.println(words);
	}

}
