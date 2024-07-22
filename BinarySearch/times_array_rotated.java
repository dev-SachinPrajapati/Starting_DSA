package BinarySearch;

//Find out how many times array has been rotated (unique)
public class times_array_rotated {

	// Brute Force
	/*
	 * public static int findKRotation(int[] arr) { int n = arr.length; //size of
	 * array. int ans = Integer.MAX_VALUE, index = -1; for (int i = 0; i < n; i++) {
	 * if (arr[i] < ans) { ans = arr[i]; index = i; } } return index; }
	 */

	public static int findKRotation(int[] arr) {
		// Write your code here.
		int n = arr.length;
		int low = 0, high = n - 1;
		int ans = Integer.MAX_VALUE;
		int index = -1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[low] <= arr[high]) {
				if (arr[low] < ans) {
					index = low;
					ans = arr[low];
				}

				break;
			}

			if (arr[low] <= arr[mid]) {
				if (arr[low] < ans) {
					index = low;
					ans = arr[low];
				}
				low = mid + 1;
			} else {
				if (arr[mid] < ans) {
					index = mid;
					ans = arr[mid];
				}
				high = mid - 1;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 7, 8, 9, 1, 2, 4, 5, 6 };
		int ans = findKRotation(arr);
		System.out.println("The array is rotated " + ans + " times.");

	}

}
