package BinarySearchIn2D;

public class Median_Row_Wise_Sorted_Matrix_Optimal {
	public static int upperBound(int[] arr, int x) {
		// Write your code here.
		int n = arr.length;
		int low = 0, high = n - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] <= x) {
				low = mid + 1;

			} else {
				high = mid - 1;
			}
		}
		return low;
	}

	public static int countSmallEquals(int arr[][], int num) {
		int count = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			count += upperBound(arr[i], num);
		}
		return count;
	}

	public static int findMedian(int matrix[][], int m, int n) {
		// Write your code here
		int low = Integer.MAX_VALUE;
		int high = Integer.MIN_VALUE;

		for (int i = 0; i < m; i++) {
			low = Math.min(low, matrix[i][0]);
			high = Math.max(high, matrix[i][n - 1]);
		}

		int req = (n * m) / 2;

		while (low <= high) {
			int mid = (low + high) / 2;
			int smallerValue = countSmallEquals(matrix, mid);
			if (smallerValue <= req) {
				low = mid + 1;
			} else {
				high = mid - 1;

			}
		}
		return low;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Example 2D matrix (adjust as needed)
		int[][] matrix = { { 1, 5, 7, 9, 11 }, { 2, 3, 4, 5, 10 }, { 9, 10, 12, 14, 16 } };
//		int[][] matrix = { { 1, 3, 8 }, { 2, 3, 4 }, { 1, 2, 5 } };

		int m = matrix.length; // Number of rows
		int n = matrix[0].length; // Number of columns

		int median = findMedian(matrix, m, n);

		System.out.println("Median of the matrix is: " + median);

	}

}
