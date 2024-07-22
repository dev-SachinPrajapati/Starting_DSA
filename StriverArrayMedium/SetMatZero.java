package StriverArrayMedium;
import java.util.*;
public class SetMatZero {
	
	public static void row(ArrayList<ArrayList<Integer>> matrix, int n, int m,int i) {
		// set all non-zero elements as -1 in the row i:
		for(int j = 0;j<n;j++) {
			if(matrix.get(i).get(j) !=0) {
				matrix.get(i).set(j, -1);
			}
		}
	}
	
	public static void col(ArrayList<ArrayList<Integer>> matrix, int n, int m,int j) {
		// set all non-zero elements as -1 in the row i:
		for(int i = 0;i<n;i++) {
			if(matrix.get(i).get(j) !=0) {
				matrix.get(i).set(j, -1);
			}
		}
	}
	public static ArrayList<ArrayList<Integer>> setMatrixZero(ArrayList<ArrayList<Integer>> matrix, int n,int m) {
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(matrix.get(i).get(j) == 0) {
					row(matrix,n,m,i);
					col(matrix,n,m,j);
				}
			}
		}
		// Finally, mark all -1 as 0:
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == -1) {
                    matrix.get(i).set(j, 0);
                }
            }
        }
		
		return matrix;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
		matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
		matrix.add(new ArrayList<>(Arrays.asList(1,0,1)));
		matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
		int n = matrix.size();
		int m = matrix.get(0).size();
		
		ArrayList<ArrayList<Integer>> ans = setMatrixZero(matrix, n, m);
		
		System.out.println("The Final matrix is:");
		for(ArrayList<Integer> row:ans) {
			for(Integer ele:row) {
				System.out.print(ele + " ");
			}
			System.out.println(" ");
		}
	}

}
