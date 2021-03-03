package test1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Employee {

	int empid;
	String empname;
	int sub1, sub2, sub3;

	void getEmpData(int id, String name) {
		empid = id;
		empname = name;
	}

	void getEmpMarks(int eng, int mat, int soc) {

		sub1 = eng;
		sub2 = mat;
		sub3 = soc;
	}

	void totalMarks() {

		System.out.println(empid);
		System.out.println(empname);
		System.out.println("Total marks are:" + (sub1 + sub2 + sub3));

	}

	public static void main(String[] args) {
//		Employee obj = new Employee();
//		obj.getEmpData(101, "john");
//		obj.getEmpMarks(80, 90, 60);
//		obj.totalMarks();

		FirefoxDriver driver = new FirefoxDriver();

	}

}
