package BS_Hard_Problem;

import java.util.ArrayList;
import java.util.List;

public class Median_of_two_SortedArrays_Better {

	public static double Median(int[] a, int[] b) {
		int n1 = a.length;
		int n2 = b.length;

		int n = n1 + n2;

		// required indices:
		int ind2 = n / 2;
		int ind1 = ind2 - 1;
		int count = 0;
		int ind1ele = -1, ind2ele = -1;

		// apply the merge step:
		int i = 0, j = 0;
		while (i < n1 && j < n2) {
			if (a[i] < b[j]) {
				if (count == ind1) {
					ind1ele = a[i];
				}
				if (count == ind2) {
					ind2ele = a[i];
				}
				count++;
				i++;
			} else {
				if (count == ind1) {
					ind1ele = b[j];
				}
				if (count == ind2) {
					ind2ele = b[j];
				}
				count++;
				j++;
			}

		}
		// copy the left-out elements:

		while (i < n1) {
			if (count == ind1) {
				ind1ele = a[i];
			}
			if (count == ind2) {
				ind2ele = a[i];
			}
			count++;
			i++;
		}

		while (j < n2) {
			if (count == ind1) {
				ind1ele = b[j];
			}
			if (count == ind2) {
				ind2ele = b[j];
			}
			count++;
			j++;

		}
		// Find the median:
		if (n % 2 == 1) {
			return (double) ind2ele;
		}

		return (double) ((double) (ind1ele + ind2ele)) / 2.0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 4, 6, 8 };
		int[] b = { 2, 3, 5, 9, 10 };
		System.out.println("The median of two sorted arrays is " + Median(a, b));
	}

}
