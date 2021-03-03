package collectionInterfaces;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		List<String> al5 = new ArrayList<>();
		al5.add("Mounika");
		al5.add("Mamatha");
		al5.add("Sharmila");
		al5.add("Lakshmi");
		al5.add("lakshmi");
		al5.sort(String.CASE_INSENSITIVE_ORDER);
		al5.sort(Comparator.naturalOrder());
		for (String s : al5) {
			System.out.println(s);
		}

	}

}
