package collectionInterfaces;

import java.util.ArrayList;
import java.util.List;

public class SubList {

	public static void main(String[] args) {
		List<String> al6 = new ArrayList<>();
		al6.add("Mounika");
		al6.add("Mamatha");
		al6.add("Sharmila");
		al6.add("Lakshmi");
		System.out.println(al6.subList(1, 4));
	}

}
