package test;

public class ConstructorExm {
	int x;
	int y;

	void display() {
		System.out.println(x + y);
	}
	// Default constructor

	ConstructorExm() {
		x = 40;
		y = 20;
	}

	// Parameterized constructor
	ConstructorExm(int p, int q) {
		x = p;
		y = q;
	}

	public static void main(String[] args) {
		ConstructorExm obj = new ConstructorExm();
		obj.display();
		ConstructorExm obj1 = new ConstructorExm(120, 100);
		obj1.display();
	}

}
