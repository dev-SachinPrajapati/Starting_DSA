
package BinarySearch;

import java.util.*;
//From Discussion
public class Find_Peak_Element_Optimal1 {

	public static int findPeakElement(ArrayList<Integer> arr) {
		int si = 0; // Initialize the start index to 0.
		int ei = arr.size() - 1; // Initialize the end index to the last index of the array.

		while (si < ei) {
			int mid = si + (ei - si) / 2; // Calculate the middle index.

			if (arr.get(mid) > arr.get(mid + 1)) {
				ei = mid; // If the element at mid is greater than the element at mid+1, move the end
							// index to mid.
			} else {
				si = mid + 1; // Otherwise, move the start index to mid + 1.
			}
		}

		return si; // Return the index of the peak element.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 5, 1));
		int ans = findPeakElement(arr);
		System.out.println("The peak is at index: " + ans);

	}

}
