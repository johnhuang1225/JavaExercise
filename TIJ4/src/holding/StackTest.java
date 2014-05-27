package holding;

import net.mindview.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		for (String s : "My dog has fleas".split(" ")) {
			stack.push(s);
		}
		System.out.println(stack);
		while (!stack.empty()) {
			System.out.println(stack.pop());
		}

	}

}