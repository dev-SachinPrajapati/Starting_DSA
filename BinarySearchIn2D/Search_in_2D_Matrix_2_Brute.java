package BinarySearchIn2D;

public class Search_in_2D_Matrix_2_Brute {

	public static boolean searchElement(int [][]matrix, int target) {
		int n = matrix.length;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(matrix[i][j] == target) {
					return true;
				}
			}
		}
		return false; 
	}
	
	/* TO Get element at that index*/
//	public static int searchElement(int [][]matrix, int target) {
//		int n = matrix.length;
//		
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				if(matrix[i][j] == target) {
//					return matrix[i][j];
//				}
//			}
//		}
//		return matrix[-1][-1];
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][] = {{1, 4, 7, 11, 15},{2, 5, 8, 12, 19},{3, 6, 9, 16, 22},{10, 13, 14, 17, 24},{18, 21, 23, 26, 30}};
		int target = 14;
		System.out.println("The Matrix: " + searchElement(matrix,target));

	}

}
