package test1;

public class Calculation {
	int x, y, z;

	Calculation(int a, int b, int c) {
		x = a;
		y = b;
		z = c;
	}

	void sum() {
		System.out.println("Sum of 3 numbers is:" + (x + y + z));

	}

	public static void main(String[] args) {
		Calculation obj = new Calculation(10, 20, 30);
		obj.sum();

	}

}
