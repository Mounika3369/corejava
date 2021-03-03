package test;

public class Student1 {
	int sid;
	String sname;
	char grade;

	// 2) assign values to the class level variables
	// by using method

	void getValues(int id, String name, char grd) {
		sid = id;
		sname = name;
		grade = grd;

	}

	void display() {
		System.out.println(sid + " " + sname + " " + grade);
	}

	public static void main(String[] args) {
		Student1 std = new Student1();
		std.getValues(103, "mounika reddy", 'A');
		std.display();
	}

}
