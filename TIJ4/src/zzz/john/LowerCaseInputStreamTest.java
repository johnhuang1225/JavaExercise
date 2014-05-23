package zzz.john;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStreamTest {

	public static void main(String[] args) throws IOException {
		InputStream fis = new FileInputStream("resource/test.txt");
		InputStream bis = new BufferedInputStream(fis);
		InputStream lis = new LowerCaseInputStream(bis);

		int c;
		while ((c = lis.read()) != -1) {
			System.out.print((char)c);
		}
		lis.close();
	}

}
