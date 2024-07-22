package BS_Hard_Problem;

import java.util.*;

public class Kth_element_sorted_Array_Optimal {
	public static int kthElement(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n1, int n2, int k) {
		// Write your coder here
		// if(n2 > n1){
		// return kthElement(arr1,arr2, n1, n2,k);
		// }

		int low = Math.max(0, k - n2), high = Math.min(k, n1); // Because I am looking for greater

		while (low <= high) {
			int mid1 = (low + high) >> 1;
			int mid2 = k - mid1;

			// calculate l1, l2, r1 and r2;
			int l1 = (mid1 == 0) ? Integer.MIN_VALUE : arr1.get(mid1 - 1);
			int l2 = (mid2 == 0) ? Integer.MIN_VALUE : arr2.get(mid2 - 1);

			// If index is not exist then here n1 is greater then pick mid1 for a
			int r1 = (mid1 == n1) ? Integer.MAX_VALUE : arr1.get(mid1);

			// if index for mid2 is not exist then pick mid2 for b
			int r2 = (mid2 == n2) ? Integer.MAX_VALUE : arr2.get(mid2);

			if (l1 <= r2 && l2 <= r1) {
				return Math.max(l1, l2);
			} else if (l1 > r2) {
				high = mid1 - 1;
			} else {
				low = mid1 + 1;
			}
		}
		return 0; // dummy statement
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(2,3,6,7,9));
			ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1,4,8,10));
			int n1 = arr1.size();
			int n2 = arr2.size();
			int k = 5;
			System.out.println("The element at the kth position in the final sorted array is: " + kthElement(arr1,arr2,n1,n2,k));
	}

}
