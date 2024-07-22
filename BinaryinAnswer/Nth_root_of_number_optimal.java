package BinaryinAnswer;

public class Nth_root_of_number_optimal {

	public static int func(int mid, int n, int m) {
		long ans = 1;
		for (int i = 1; i <= n; i++) {
			ans = ans * mid;
			if (ans > m)
				return 2;
		}
		if (ans == m)
			return 1;
		return 0;
	}

	public static int NthRoots(int n, int m) {
		// Write your code here.
		// Return 1 if mid == m
		// Return 0 if mid < m
		// Return 2 if mid > m
		int low = 1, high = m;
		while (low <= high) {
			int mid = (low + high) / 2;
			int midN = func(mid, n, m);
			if (midN == 1) {
				return mid;
			} else if (midN == 0) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3, m = 27;
		int ans = NthRoots(n, m);
		System.out.println("The answer is: " + ans);
	}

}
