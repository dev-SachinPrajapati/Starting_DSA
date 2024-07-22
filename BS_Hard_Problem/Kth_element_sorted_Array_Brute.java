package BS_Hard_Problem;

import java.util.ArrayList;
import java.util.Arrays;

public class Kth_element_sorted_Array_Brute {
	public static int kthElement(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n1, int n2, int k) {

		int p1 = 0, p2 = 0, counter = 0, answer = 0;
		while (p1 < n2 && p2 < n1) {
			if (counter == k)
				break;
			else if (arr1.get(p1) < arr2.get(p2)) {
				answer = arr1.get(p1);
				++p1;
			} else {
				answer = arr2.get(p2);
				++p2;
			}
			++counter;
		}

		if (counter != k) {
			if (p1 != n2 - 1) {
				answer = arr1.get(k - counter);

			} else {
				answer = arr2.get(k - counter);
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(2, 3, 6, 7, 9));
		ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1, 4, 8, 10));
		int n1 = arr1.size();
		int n2 = arr2.size();
		int k = 5;
		System.out.println(
				"The element at the kth position in the final sorted array is: " + kthElement(arr1, arr2, n1, n2, k));

	}

}
