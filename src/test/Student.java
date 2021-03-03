package test;

public class Student {
	int sid;
	String sname;
	char grade;

	// we can assign values to the class variables in 3 ways
	// 1) By using object reference variable

	void display() {
		System.out.println(sid + " " + sname + " " + grade);
	}

	public static void main(String[] args) {
		Student std = new Student();
		std.sid = 101;
		std.sname = "mounika";
		std.grade = 'A';
		std.display();
	}

}
