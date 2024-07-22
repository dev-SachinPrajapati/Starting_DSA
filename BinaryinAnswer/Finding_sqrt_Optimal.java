package BinaryinAnswer;

public class Finding_sqrt_Optimal {

	public static int sqrtN(long N) {
		/*
		 * Write your code here
		 */
		long low = 1, high = N;
		// use long ans = 0;
		while (low <= high) {
			long mid = (low + high) / 2;
			long val = mid * mid;

			if (val <= N)
				low = mid + 1; // ans = mid before low = mid + 1;
			else
				high = mid - 1;
		}
		return (int) high;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long n = 28;
		int ans = sqrtN(n);
		System.out.println("The square root of n is: " + ans);

	}

}
