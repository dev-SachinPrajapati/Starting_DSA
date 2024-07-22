package BinaryinAnswer;

public class Mini_dat_to_make_M_Bouquet_Optimal {
	public static boolean possible(int arr[], int days, int m, int k) {
		int count = 0, noOfBouquets = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++) {

			if (arr[i] <= days) { // Bloom days if it possible
				count++; // and increase count
			} else { // if there is not bloom in array then count = 0 but before this find no of
						// Bouquets we can make from it
				noOfBouquets += (count / k);
				count = 0;
			}
		}
		noOfBouquets += (count / k); // nos of Bouquets
		return noOfBouquets >= m; // if no of B > m return it
	}

	public static int roseGardens(int[] arr, int k, int m) {
		// Write your code here.
		long val = (long) m * k;
		int n = arr.length;

		if (val > n)
			return -1; // impossible case

		// Find maximum and minimum:
		int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) { // find mini and maxi for 0 to n in array
			mini = Math.min(mini, arr[i]);
			maxi = Math.max(maxi, arr[i]);
		}

		int low = mini, high = maxi;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (possible(arr, mid, m, k)) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return low;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 7, 7, 7, 7, 13, 11, 12, 7 };
		int m = 2;
		int k = 3;

		int ans = roseGardens(arr, k, m);
		if (ans == -1) {
			System.out.println("We cannot make m bouquets.");
		} else {
			System.out.println("We can make bouquets on day " + ans);

		}

	}

}
