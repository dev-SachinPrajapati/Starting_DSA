package BinarySearch;

import java.util.*;

//Strivers
public class Find_Peak_Element_Optimal2 {

	public static int findPeakElement(ArrayList<Integer> arr) {
		int n = arr.size(); // Size of array

		// Edge cases:
		if (n == 1)
			return 0;
		if (arr.get(0) > arr.get(1))
			return 0;
		if (arr.get(n - 1) > arr.get(n - 2))
			return n - 1;

		int low = 1, high = n - 2;
		while (low <= high) {
			int mid = (low + high) / 2;

			// If arr[mid] is the peak:
			if (arr.get(mid - 1) < arr.get(mid) && arr.get(mid) > arr.get(mid + 1))
				return mid;

			// If we are in the left:
			if (arr.get(mid) > arr.get(mid - 1))
				low = mid + 1;

			// If we are in the right:
			// Or, arr[mid] is a common point:

			else if (arr.get(mid) > arr.get(mid + 1))
				high = mid - 1;
			else
				high = mid - 1;
		}
		// Dummy return statement
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 5, 1));
		int ans = findPeakElement(arr);
		System.out.println("The peak is at index: " + ans);

	}

}
