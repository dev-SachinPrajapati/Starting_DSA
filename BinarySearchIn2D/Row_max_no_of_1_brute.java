package BinarySearchIn2D;

import java.util.*;

public class Row_max_no_of_1_brute {

	public static int rowWithMax1s(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
		int count_max = 0;
		int index = -1;

		// traverse the matrix:
		for (int i = 0; i < n; i++) {
			int count_ones = 0;
			for (int j = 0; j < m; j++) {
				count_ones += matrix.get(i).get(j);
			}
			if (count_ones > count_max) {
				count_max = count_ones;
				index = i;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
		matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
		matrix.add(new ArrayList<>(Arrays.asList(0, 0, 1)));
		matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
		matrix.add(new ArrayList<>(Arrays.asList(0, 0, 0)));
		matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
		int n = 4, m = 3;
		System.out.println("The row with the maximum number of 1's is: " + rowWithMax1s(matrix, n, m));

	}

}
