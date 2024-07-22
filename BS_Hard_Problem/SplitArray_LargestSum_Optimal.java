package BS_Hard_Problem;

public class SplitArray_LargestSum_Optimal {
	public static int countPartitions(int[] arr, int maxSum) {
		int n = arr.length;
		int partition = 1;
		long subarraySum = 0;
		for (int i = 0; i < n; i++) {
			if (subarraySum + arr[i] <= maxSum) {
				// insert element to current subarray
				subarraySum += arr[i];
			} else {
				// insert element to next subarray
				partition++;
				subarraySum = arr[i];
			}
		}
		return partition;
	}

	public static int largestSubarraySumMinimized(int[] a, int k) {
		// Write Your Code Here
		int low = a[0];
		int high = 0;

		for (int i = 0; i < a.length; i++) {
			low = Math.max(low, a[i]);
			high += a[i];
		}

		while (low <= high) {
			int mid = (low + high) / 2;

			if (countPartitions(a, mid) > k) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return low;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 10, 20, 30, 40 };
		int k = 2;
		int ans = largestSubarraySumMinimized(a, k);
		System.out.println("The answer is: " + ans);

	}

}
