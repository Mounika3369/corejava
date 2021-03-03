package test;

public class Student3 {
	int sid;
	String sname;
	char grade;

	// assign values to the class variables
	// by using constructor
	void display() {
		System.out.println(sid + " " + sname + " " + grade);
	}

	Student3(int id, String name, char grd) {
		sid = id;
		sname = name;
		grade = grd;

	}

	public static void main(String[] args) {
		Student3 std = new Student3(106, "mouni", 'A');
		std.display();
	}

}
