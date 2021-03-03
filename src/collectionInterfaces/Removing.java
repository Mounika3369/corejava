package collectionInterfaces;

import java.util.ArrayList;
import java.util.List;

public class Removing {

	public static void main(String[] args) {
		List<String> al3 = new ArrayList<>();
		al3.add("Mounika");
		al3.add("Mounika1");
		al3.add("Mounika2");
		al3.add("Mounika3");
		al3.remove(3);
		al3.remove("Mounika2");
		al3.removeAll(al3);
		System.out.println("All deleted");
		for (String y : al3) {
			System.out.println(y);
		}

	}

}
