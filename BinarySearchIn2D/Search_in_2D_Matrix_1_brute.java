package BinarySearchIn2D;

import java.util.ArrayList;
import java.util.Arrays;

public class Search_in_2D_Matrix_1_brute {
	static boolean searchMatrixBrute(ArrayList<ArrayList<Integer>> mat, int target) {
        // Write your code here.
        int n = mat.size();
        int m = mat.get(0).size();
        for(int i=0;i<n;i++) {
        	for(int j=0;j<m;j++) {
        		if(mat.get(i).get(j) ==  target) return true;
        	}
        }
        return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
		matrix.add(new ArrayList<>(Arrays.asList(3,4,6,8)));
		matrix.add(new ArrayList<>(Arrays.asList(10,12,13,15)));
		matrix.add(new ArrayList<>(Arrays.asList(17,18,19,20)));
		
		int target = 14;
		System.out.println("The Element is: " + searchMatrixBrute(matrix,target));
	}

}
