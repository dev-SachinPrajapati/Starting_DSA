package RecursionInJavaAdvan;

import java.util.*;
public class Rat_in_A_Maze_Meth_2 {
	public static void solve(int i, int j, int a[][], int n, ArrayList<String> ans, String move, int vist[][], int di[], int dj[]){
        if( i == n-1 && j == n-1){
            ans.add(move);
            return;
        }
        String dir = "DLRU";
        for (int index = 0; index < 4; index++) {
            int nexti = i + di[index];
            int nextj = j + dj[index];
            if(nexti >=0 && nextj >= 0 && nexti < n && nextj < n && vist[nexti][nextj] ==0 && a[nexti][nextj] == 1){
                    vist[i][j] = 1;
                    solve(nexti, nextj,a,n,ans,move + dir.charAt(index),vist, di, dj);
                    vist[i][j] = 0;
            }
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
        int di[] = {+1,0,0,-1};
        int dj[] = {0,-1,1,0};
        ArrayList <String> ans = new ArrayList<>();
        if(mat[0][0] == 1){
            solve(0,0,mat,n,ans,"", vist, di,dj);
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
