package BinarySearch;

public class CountOccurance {

	public static int firstOccurance(int[] nums, int n, int x) {
		int low = 0, high = n - 1;
		int first = -1;
		while (low <= high) {
			int mid = (low + high) / 2;

			if (nums[mid] == x) {
				first = mid;
				high = mid - 1;
			}

			else if (nums[mid] < x) {
				low = mid + 1;
			}

			else
				high = mid - 1;
		}
		return first;
	}

	public static int lastOcuurance(int[] nums, int n, int x) {

		int low = 0, high = n - 1;
		int last = -1;
		while (low <= high) {
			int mid = (low + high) / 2;

			if (nums[mid] == x) {
				last = mid;
				low = mid + 1;
			}

			else if (nums[mid] < x) {
				low = mid + 1;
			}

			else
				high = mid - 1;
		}
		return last;
	}

	public static int[] fistandlastoccurance(int arr[], int n, int k) {
		int first = firstOccurance(arr, n, k);
		if (first == -1)
			return new int[] { -1, -1 };
		int last = lastOcuurance(arr, n, k);
		return new int[] { first, last };
	}

	public static int count(int arr[], int n, int x) {
		// Your code goes here
		int[] ans = fistandlastoccurance(arr, n, x);
		if (ans[0] == -1)
			return 0;
		return (ans[1] - ans[0] + 1);  //Just subtract the last occurance and first occurance and do + 1

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr =  {2, 4, 6, 8, 8, 8, 8, 11, 13};
        int n = 8, x = 8;
        int ans = count(arr, n, x);
        System.out.println("The number of occurrences is: " + ans);

	}

}
