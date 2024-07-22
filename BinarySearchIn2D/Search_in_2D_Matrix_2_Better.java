package BinarySearchIn2D;

import java.util.*;

public class Search_in_2D_Matrix_2_Better {

	public static boolean binarySearch(ArrayList<Integer> matrix, int target) {
		int n = matrix.size(); // size of the array
		int low = 0;
		int high = n - 1;
		while (low <= high) {
			int mid = (low + high) / 2;

			if (matrix.get(mid) == target) {
				return true;
			} else if (matrix.get(mid) < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}

		}
		return false;
	}

	public static boolean searchElement(ArrayList<ArrayList<Integer>> matrix, int target) {

		int n = matrix.size();
		int m = matrix.get(0).size();

		for (int i = 0; i < n; i++) {
			boolean ind = binarySearch(matrix.get(i), target);
			if (ind == true)
				return true;
		}

		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
		matrix.add(new ArrayList<>(Arrays.asList(1, 4, 7, 11, 15)));
		matrix.add(new ArrayList<>(Arrays.asList(2, 5, 8, 12, 19)));
		matrix.add(new ArrayList<>(Arrays.asList(3, 6, 9, 16, 22)));
		matrix.add(new ArrayList<>(Arrays.asList(10, 13, 14, 17, 24)));
		matrix.add(new ArrayList<>(Arrays.asList(18, 21, 23, 26, 30)));

		int target = 200;

		System.out.println("The matrix is: " + searchElement(matrix, target));

	}

}
