package RecursionInJavaAdvan;

import java.util.ArrayList;
import java.util.List;

public class Rat_in_A_Maze_Meth_1 {
	public static void solve(int i, int j, int a[][], int n, ArrayList<String> ans, String move, int vist[][]){
        if( i == n-1 && j == n-1){
            ans.add(move);
            return;
        }
     // downward
        if(i+1 <n && vist[i + 1][j] == 0 && a[i+1][j] == 1) {
        	vist[i][j] = 1;
        	solve(i+1,j,a,n,ans, move + 'D',vist);
        	vist[i][j] = 0;
        }
        
        // Left
        if(j-1 >=0 && vist[i][j -1] == 0 && a[i][j - 1] == 1) {
        	vist[i][j] = 1;
        	solve(i,j-1,a,n,ans, move + 'L',vist);
        	vist[i][j] = 0;
        }
        
        // Right
        if(j+1 < n && vist[i][j + 1] == 0 && a[i][j + 1] == 1) {
        	vist[i][j] = 1;
        	solve(i,j +1,a,n,ans, move + 'R',vist);
        	vist[i][j] = 0;
        }
        
        // Up
        if(i-1 >= 0 && vist[i - 1][j] == 0 && a[i-1][j] == 1) {
        	vist[i][j] = 1;
        	solve(i-1,j,a,n,ans, move + 'U',vist);
        	vist[i][j] = 0;
        }

}
	 public static List<String> ratMaze(int [][]mat) {
	        // Write your code here.
	        int n = mat.length;
	        int vist[][] = new int[n][n];
	        for(int i=0;i<n;i++){
	            for(int j=0;j<n;j++){
	                vist[i][j] = 0;
	            }
	        }
	        ArrayList <String> ans = new ArrayList<>();
	        if(mat[0][0] == 1){
	            solve(0,0,mat,n,ans,"", vist);
	        }
	            return ans;

	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
	    int[][] a = {{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};

	    Rat_in_A_Maze_Meth_2 obj = new Rat_in_A_Maze_Meth_2();
	    ArrayList < String > res = (ArrayList<String>) obj.ratMaze(a);
	    if (res.size() > 0) {
	      for (int i = 0; i < res.size(); i++)
	        System.out.print(res.get(i) + " ");
	      System.out.println();
	    } else {
	      System.out.println(-1);
	    }

	}

}
