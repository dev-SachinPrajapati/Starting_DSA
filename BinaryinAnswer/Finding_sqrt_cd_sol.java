package BinaryinAnswer;

public class Finding_sqrt_cd_sol {

	public static int find_sqrt(long n) {
		// Take 'ans' variable to store the square root of given number 'N'
		int ans = 1;

		// Corner case
		if (n == 0)
			return 0;

		// Run loop while square of 'ans' is less than equal to 'N'
		long div = n / ans;
		while ((long) ans * ans <= div) {
			// Increament 'ans' by 1
			ans++;
		}

		return (int) (ans - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 20;
		int ans = find_sqrt(n);
		System.out.println("The square root of n is: " + ans);

	}

}
