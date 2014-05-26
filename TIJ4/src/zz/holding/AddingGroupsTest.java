package zz.holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddingGroupsTest {

	public static void main(String[] args) {
//		method1();
		
		method2();
		
	}

	private static void method2() {
		List list = Arrays.asList(1, 2, 3, 4, 5);
		list.add(6);
		System.out.println(list);
	}

	private static void method1() {
		Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(
				1, 2, 3, 4, 5));
		Integer[] moreInts = { 6, 7, 8, 9, 10 };
		collection.addAll(Arrays.asList(moreInts));
		// Runs significantly faster, but you can't
		// construct a Collection this way:
		Collections.addAll(collection, 11, 12, 13, 14, 15);
		Collections.addAll(collection, moreInts);
		System.out.println(collection);
		List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
		list.set(1, 99);
		System.out.println(list);
	}

}
