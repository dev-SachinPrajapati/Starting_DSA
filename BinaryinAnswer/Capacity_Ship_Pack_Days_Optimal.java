package BinaryinAnswer;

/*
 * Related Problem We can solve using Capacity of ship
 * Minimum Ship Capacity: Find the minimum capacity of the ship required to ship all the packages within D days.
 * Feasibility Check: Determine if it's possible to ship all the packages within D days with a given ship capacity.
 * Optimal Shipping Plan: Find a plan that specifies which packages to load on each day to meet the constraints (i.e., ship within D days with the minimum capacity).
 * Binary Search Variation: Solve the problem using a binary search approach to find the minimum ship capacity efficiently.*/

public class Capacity_Ship_Pack_Days_Optimal {

	public static int findDays(int[] weight, int capacity) {
		int days = 1, load = 0;
		int n = weight.length;

		for (int i = 0; i < n; i++) {
			if (load + weight[i] > capacity) {
				days = days + 1;
				load = weight[i];
			} else {
				load += weight[i];
			}
		}
		return days;
	}

	public static int leastWeightCapacitys_O(int[] weights, int d) {
		// Write your code here.
		// Find the maximum and the summation:
		int maxi = Integer.MIN_VALUE, sum = 0;
		for (int i = 0; i < weights.length; i++) {
			sum += weights[i];
			maxi = Math.max(maxi, weights[i]);
		}

		int low = maxi, high = sum;
		while (low <= high) {
			int mid = (low + high) / 2;
			int noOfDays = findDays(weights, mid);
			if (noOfDays <= d) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return low;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] weights = {5, 4, 5, 2, 3, 4, 5, 6};
	        int d = 5;
	        int ans = leastWeightCapacitys_O(weights, d);
	        System.out.println("The minimum capacity should be: " + ans);
	}

}
