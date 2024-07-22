package BinarySearchIn2D;

import java.util.*;
public class Search_in_2D_Matrix_1_Optimal {

	static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        // Write your code here.
        int n = mat.size();
        int m = mat.get(0).size();
        int low = 0, high = n*m-1;

        while (low<=high) {
            int mid = (low + high) / 2;
            int row = mid / m, col = mid % m;

            if(mat.get(row).get(col) == target) return true;
            else if(mat.get(row).get(col) < target) low = mid + 1;
            else high = mid - 1; 
        }
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
		matrix.add(new ArrayList<>(Arrays.asList(3,4,6,8)));
		matrix.add(new ArrayList<>(Arrays.asList(10,12,13,15)));
		matrix.add(new ArrayList<>(Arrays.asList(17,18,19,20)));
		
		int target = 15;
		System.out.println("The Element is: " + searchMatrix(matrix,target));
	}

}
