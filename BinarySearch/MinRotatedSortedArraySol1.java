package BinarySearch;

//BRUTE FORCE (LINEAR SEARCH)
public class MinRotatedSortedArraySol1 {

	public static int findMinimum(int[] arr) {
		// Write your code here.
		int n = arr.length;
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			ans = Math.min(ans, arr[i]);
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 7, 8, 1, 2, 3, 4, 5, 6 };
		int ans = findMinimum(arr);
		System.out.println("The minimum element is: " + ans);
	}

}
