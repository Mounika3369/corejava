package collectionInterfaces;

import java.util.ArrayList;
import java.util.List;

public class Adding {
	public static void main(String[] args) {
		List<String> al1 = new ArrayList<>();
		al1.add("Mounika");
		al1.add("Mamatha");
		al1.add("Sharmila");
		al1.add("Lakshmi");

		List<String> al2 = new ArrayList<>();
		al2.add("Ramesh");
		al2.add("Mahesh");
		al2.add("Suresh");
		al2.addAll(al1);
		al2.addAll(1, al1);

		for (String s : al1) {
			System.out.println(s);
		}
		System.out.println();
		for (String x : al2) {
			System.out.println(x);
		}
	}

}
