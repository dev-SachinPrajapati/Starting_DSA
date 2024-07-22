package RecursionInJava;

public class Lec5P1 {

	public static int[] generateFibonacciNumbers(int n) {
		if (n <= 0) {
			return new int[0];
		}

		int[] fibonacci = new int[n];
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		for (int i = 2; i < n; i++) {
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		}
		return fibonacci;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10; // Change this to the desired number of Fibonacci numbers
		int[] result = generateFibonacciNumbers(n);

		// Print the result
		for (int num : result) {
			System.out.print(num + " ");
		}
	}

}
