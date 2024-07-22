package BinaryinAnswer;

public class Mini_day_to_make_M_Bouquet_Bru {

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

	public static int roseGarden(int[] arr, int k, int m) {
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

		for (int i = mini; i <= maxi; i++) {
			if (possible(arr, i, m, k)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 7, 7, 7, 7, 13, 11, 12, 7 };
		int m = 2;
		int k = 3;

		int ans = roseGarden(arr, k, m);
		if (ans == -1) {
			System.out.println("We cannot make m bouquets.");
		} else {
			System.out.println("We can make bouquets on day " + ans);

		}
	}

}
