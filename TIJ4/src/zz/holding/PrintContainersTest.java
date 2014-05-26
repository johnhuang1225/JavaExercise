package zz.holding;

import holding.PrintContainers;

import java.util.ArrayList;
import java.util.List;

import net.mindview.util.Print;

public class PrintContainersTest extends PrintContainers {

	public static void main(String[] args) {
		List list = (List) PrintContainers.fill(new ArrayList<String>());
		List sub = list.subList(1, 4);
		sub.set(0, "change");
		Print.print(list);
		Print.print(sub);
	}

}
