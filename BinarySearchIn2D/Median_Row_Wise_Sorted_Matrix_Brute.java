package BinarySearchIn2D;

public class Median_Row_Wise_Sorted_Matrix_Brute {
	public static int findMedian(int matrix[][], int row, int col) {
		int[] median = new int[row * col];
		int index = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				median[index] = matrix[i][j];
				index++;
			}
		}
		return median[(row * col) / 2];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 1, 5, 7, 9, 11 }, { 2, 3, 4, 5, 10 }, { 9, 10, 12, 14, 16 } };
//		int[][] matrix = { { 1, 3, 8 }, { 2, 3, 4 }, { 1, 2, 5 } };

		int m = matrix.length; // Number of rows
		int n = matrix[0].length; // Number of columns

		int median = findMedian(matrix, m, n);

		System.out.println("Median of the matrix is: " + median);

	}

}
