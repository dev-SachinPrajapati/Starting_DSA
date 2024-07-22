package BinarySearch;

public class SearchRotatedArray2Optimal {

	/* Brute Force Solution
	 * public static boolean searchInARotatedSortedArrayII(int []arr, int k) {
        int n = arr.length; // size of the array.
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) return true;
        }
        return false;
    }
*/
	
	
	public static boolean searchInARotatedSortedArrayII(int[] arr, int key) {
		// Write your code here.
		int n = arr.length;
		int low = 0, high = n - 1;
		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == key) {
				return true;
			}

			if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
				low = mid + 1;
				high = mid - 1;
				continue;
			}

			// left half
			if (arr[low] <= arr[mid]) {
				if (arr[low] <= key && key <= arr[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			}

			// right half
			else {
				if (arr[mid] <= key && key <= arr[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 7, 8, 1, 2, 3, 3, 3, 4, 5, 6 };
		int k = 3;
		boolean ans = searchInARotatedSortedArrayII(arr, k);
		if (ans == false)
			System.out.println("Target is not present." + ans);
		else
			System.out.println("Target is present in the array." + ans);
	}

}
