package BinarySearchIn2D;

public class Search_in_2D_Matrix_2_Optimal {
	public static boolean searchElement_O(int[][] MATRIX, int target) {
		// Write your code here.
		int n = MATRIX.length;
		int m = MATRIX[0].length;

		int row = 0, col = m - 1;

		while (row < n && col >= 0) {
			if (MATRIX[row][col] == target) {
				return true;
			} else if (MATRIX[row][col] < target) {
				row++;
			} else {
				col--;
			}
		}
		return false;
	}

	/*Also This will work
	 * public static boolean searchElement(int [][]MATRIX, int target) {
        // Write your code here.
        int n = MATRIX.length;
        int m = MATRIX[0].length;

        int row = 0, col = m - 1;

        while (row < n && col >= 0) {
            if(MATRIX[row][col] == target){
                return true;
            }
            else if(MATRIX[row][col] > target){
                col--;
            } 
            else {
                    row++;
            }
        }
    return false;
    }*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][] = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
				{ 18, 21, 23, 26, 30 } };
		int target = 14;
		System.out.println("The Matrix: " + searchElement_O(matrix, target));

	}

}
