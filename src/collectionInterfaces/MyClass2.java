package collectionInterfaces;

import java.util.Vector;

public class MyClass2 {

	public static void main(String[] args) {
		Vector v = new Vector(5, 2);
		v.add(5);
		v.add(4);
		v.add(3);
		v.add(2);
		v.add(1);
		v.add(5);
		v.add(5);
		v.add(5);
		v.add(5);
		v.add(5);
		System.out.println(v.capacity());
		System.out.println(v);

	}

}
