package BinaryinAnswer;

public class Finding_sqrt_Brute {

	public static int findsqrt(int n) {
		int ans = 0;

		for (long i = 0; i < n; i++) {
			long val = i * i;
			if (val <= (long) n) {
				ans = (int) i;
			} else {
				break;
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 60;

		int ans = findsqrt(n);

		System.out.println("The square root of n is : " + ans);
	}

}
