package test;

public class Student2 {
	int sid;
	String sname;
	char grade;

	void display() {
		System.out.println(sid + " " + sname + " " + grade);
	}

	void getValues(int id, String name, char grd) {
		id = sid;
		name = sname;
		grd = grade;
	}

	public static void main(String[] args) {
		Student1 std = new Student1();
		std.getValues(105, "mouni", 'A');
		std.display();

	}

}
