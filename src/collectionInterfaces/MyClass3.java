package collectionInterfaces;

import java.util.Stack;

public class MyClass3 {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(25);
		s.push(35);
		s.push(45);
		s.push(55);
		s.pop();

		System.out.println(s.peek());
		System.out.println(s.empty());
		System.out.println(s);
		System.out.println(s.search(25));
	}

}
