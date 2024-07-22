package BinaryinAnswer;

public class Smallest_Divisor_Given_Threshold_optimal {

	public static int sumbyD(int arr[], int div) {
		int n = arr.length;
		int sum = 0;
		// Find the summation of division values:
		for (int i = 0; i < n; i++) {
			sum += Math.ceil((double) (arr[i]) / (double) (div));
		}
		return sum;
	}

	public static int smallestDivisor(int arr[], int limit) {
		// Write your coder here
		int n = arr.length;
		if (n > limit)
			return -1;

		// Find the maximum element:
		int maxi = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			maxi = Math.max(maxi, arr[i]);
		}
		int low = 1, high = maxi;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (sumbyD(arr, mid) <= limit) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return low;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5 };
		int threshold = 8;
		int ans = smallestDivisor(arr, threshold);
		System.out.println("The minimum divisor is: " + ans);

	}

}
