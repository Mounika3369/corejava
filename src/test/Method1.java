package test;

public class Method1 {
	int x = 20;
	int y = 20;

// type1
	void sum() {
		System.out.println(x + y);

	}

	// type2

	int sum1() {
		return (x + y);
	}

	// type4

	int sum2(int a, int b) {
		return (a + b);
	}

	void sum3(int p, int q) {
		System.out.println(p + q);
	}

	public static void main(String[] args) {

		Method1 obj = new Method1();
		// obj.sum();
		// int result = obj.sum1();
		// System.out.println(result);
		int z = obj.sum2(100, 200);
		System.out.println(z);
		System.out.println(obj.sum2(30, 20));

	}

}
