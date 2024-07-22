package BinarySearch;

public class FloorandCeil {
	static int floor(int arr[], int n, int x) {
		int low = 0, high = n - 1;
		int ans = -1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] <= x) {
				ans = arr[mid];
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return ans;
	}

	static int ceil(int arr[], int n, int x) {
		int low = 0, high = n - 1;
		int ans = -1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] >= x) {
				ans = arr[mid];
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;
	}

	public static int[] ceilingInSortedArray(int[] arr, int n, int x) {
		// Write your code here.
		int f = floor(arr, n, x);
		int c = ceil(arr, n, x);
		return new int[] { f, c };
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 4, 4, 7, 8, 10};
        int n = 6, x = 5;
        int[] ans = ceilingInSortedArray(arr, n, x);
        System.out.println("The floor and ceil are: " + ans[0]
                           + " " + ans[1]);

	}

}
