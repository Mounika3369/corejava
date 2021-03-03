package collectionInterfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyClass {
	public static void main(String[] args) {

		List<String> al = new ArrayList<>();
		al.add("Mounika");
		al.add("Mamatha");
		al.add("Sharmila");
		al.add("Lakshmi");

		System.out.println(al);
		System.out.println(" 1: Using ForEach loop");
		for (String s : al) {
			System.out.println(s);
		}
		System.out.println("2: Using for loop");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("3: Using ListIterator");
		ListIterator<String> x = al.listIterator();
		System.out.println("Forward direction");
		while (x.hasNext()) {
			System.out.println(x.next());
		}
		System.out.println("Reverse method");
		while (x.hasPrevious()) {
			System.out.println(x.previous());
		}
		System.out.println("4: Using IteratorInterface");
		Iterator<String> y = al.iterator();
		while (y.hasNext()) {
			System.out.println(y.next());
		}
		System.out.println("5: Using forEach using lambda");
		al.forEach(a -> {
			System.out.println(a);
		});
		System.out.println("6: Using forEachRemaining");
		Iterator<String> z = al.iterator();
		z.forEachRemaining(b -> {
			System.out.println(b);
		});

	}

}
