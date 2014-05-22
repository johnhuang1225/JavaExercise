package zz.io;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		File dir = new File("D:\\Java");
		File file = new File("D:\\Java\\test.java");
		System.out.println(dir.getCanonicalFile());
		System.out.println(file.getCanonicalFile());
	}

}
