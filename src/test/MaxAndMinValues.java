package test;

public class MaxAndMinValues {

	public static void main(String[] args) {
		int a[] = { 4, 6, 8, 10 };
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];

			}

		}
		System.out.println("maximum value is:" + max);
		int min = a[0];
		for (int j = 1; j < a.length; j++) {
			if (a[j] < min) {
				min = a[j];

			}
		}
		System.out.println("minimum value is:" + min);
	}

}
