package BinarySearchIn2D;

public class Find_Peak_Element_in_2D_Op {

	public static int maxElement(int matrix[][], int n, int m, int col) {
		int maxValue = -1;
		int index = -1;

		for (int i = 0; i < n; i++) {
			if (matrix[i][col] > maxValue) {
				maxValue = matrix[i][col];
				index = i;
			}
		}
		return index;
	}

	public static int[] findPeakGrid(int[][] G) {
		// Write your code here.
		int n = G.length;
		int m = G[0].length;
		int low = 0, high = m - 1;

		// Applying Binary Search
		while (low <= high) {
			int mid = (low + high) / 2; // to get column
			int row = maxElement(G, n, m, mid); // for get maximum in row

			// we got 1D array now check left and right part
			// make sure [mid-1][mid][mid+1]

			int left = mid - 1 >= 0 ? G[row][mid - 1] : -1;
			int right = mid + 1 < m ? G[row][mid + 1] : -1;

			if (G[row][mid] > left && G[row][mid] > right) {
				return new int[] { row, mid };

			} else if (G[row][mid] < left) {
				high = mid - 1; // if left is large reduce and eliminate
			} else { // if not got and find it
				low = mid + 1;
			}
		}
		return new int[] { -1, -1 };
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 4, 2, 5, 1, 4, 5 }, { 2, 9, 3, 2, 3, 2 }, { 1, 7, 6, 0, 1, 3 }, { 3, 6, 2, 3, 7, 2 } };
//		
	}
}
