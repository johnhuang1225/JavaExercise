package zz.net.mindview.util;

import java.util.List;
import java.util.ArrayList;

import net.mindview.util.PPrint;

public class PPrintTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);			
		}
		String value = PPrint.pformat(list);
		System.out.println(value);
	}

}
