package zzz.john;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Test {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		System.out.println(q.peek() == null);
		for (int i = 0; i < 10; i++) {
			q.offer(i);
		}
		System.out.println(q);
		System.out.println(q.peek() == null);

		// Map<String, List<? extends Pet>> p = new HashMap<String, List<?
		// extends Pet>>();
		// List<? extends Pet> list = new ArrayList<? extends Pet>();
		// testForMap();
	}

	private static void testForMap() {
		Map m = new HashMap();
		System.out.println(m.get("aa"));
	}

}

class Book {

}
