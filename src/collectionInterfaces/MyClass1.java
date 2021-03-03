package collectionInterfaces;

import java.util.ArrayList;
import java.util.List;

public class MyClass1 {

	public static void main(String[] args) {
		List<String> al6 = new ArrayList<>();
		al6.add("Mounika");
		al6.add("Mamatha");
		al6.add("Sharmila");
		al6.add("Lakshmi");
		al6.add("Mounika");
		al6.set(1, "mounika reddy");

		System.out.println(al6.get(2));
		System.out.println(al6.indexOf("Lakshmi"));
		System.out.println(al6.lastIndexOf("Mounika"));
		System.out.println(al6.indexOf("Mounika"));
		for (String s : al6) {
			System.out.println(s);
		}

	}

}
