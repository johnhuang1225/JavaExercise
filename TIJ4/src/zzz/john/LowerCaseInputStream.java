package zzz.john;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

	protected LowerCaseInputStream(InputStream in) {
		super(in);
	}

	@Override
	public int read() throws IOException {
		int c = super.read();
		if (c == -1)
			return c;
		else
			return Character.toLowerCase((char) c);
	}

	@Override
	public int read(byte[] b, int offset, int len) throws IOException {
		int result = super.read(b, offset, len);
		for (int i = offset; i < offset + result; i++) {
			b[i] = (byte) Character.toLowerCase((char) b[i]);
		}
		return result;
	}

}
