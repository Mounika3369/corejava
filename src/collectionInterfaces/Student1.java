package collectionInterfaces;

import java.util.ArrayList;
import java.util.List;

public class Student1 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();

		Student s1 = new Student(1, "Mouni", "ATP");
		Student s2 = new Student(2, "suresh", "HYD");
		Student s3 = new Student(3, "ramesh", "DELHI");
		Student s4 = new Student(4, "Mahesh", "KAKINADA");
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		for (Student s : list) {
			System.out.println(s.rollno + " " + s.name + " " + s.address);
		}
	}

}
