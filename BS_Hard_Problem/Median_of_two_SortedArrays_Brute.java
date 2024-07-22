package BS_Hard_Problem;

import java.util.*;

public class Median_of_two_SortedArrays_Brute {

	public static double Median(int[] arr1, int[] arr2) {
		int n1 = arr1.length;
		int n2 = arr2.length;

		List<Integer> arr3 = new ArrayList<>();

		int i = 0, j = 0;

		while (i < n1 && j < n2) {
			if (arr1[i] < arr2[j]) {
				arr3.add(arr1[i++]);
			} else {
				arr3.add(arr2[j++]);
			}
		}
		while (i < n1) {
			arr3.add(arr1[i++]);
		}
		while (j < n2) {
			arr3.add(arr2[j++]);
		}
		// Find the median
		int n = n1 + n2;

		if (n % 2 == 1) {
			return (double) arr3.get(n / 2);
		}

		double median = (double) arr3.get(n / 2) + arr3.get((n / 2) - 1);
		return median;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 4, 7, 10, 12 };
		int[] b = { 2, 3, 6, 15 };
		System.out.println("The median of two sorted arrays is " + Median(a, b));
	}

}
