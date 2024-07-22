package RecursionInJavaAdvan;

public class M_Coloring_problem {
	public static boolean isSafe(int node, int[][] mat, int[] color, int n, int col){
        for (int it : mat[node]) {
            // it check if ajacent node is same return false
            if(color[it] == col){
                return false;
            }
        }
        // if adjacent node is not have same color then return true
            return true;
    }

     public static boolean solve(int node, int [][]mat, int[] color, int n, int m){
       // if we color all node return true
        if (node == n) {
            return true;
        }

        // now start coloring
        for (int i = 1; i <= m; i++) {
            // isSafe it is check for adjancent node
            if(isSafe(node, mat, color, n,i)){  
                //if isSafe is possible color the node on that index
                color[node] = i;
                //again return solve function
                if(solve(node + 1,mat, color,n,m) == true){
                    return true;
                } 
                // backtracking:- remove when it returns
                color[node] = 0;
            }
        }
        return false;
    }
    public static String graphColoring(int [][]mat, int m) {
        // Write your code here
        int n = mat.length;
        int[] color = new int[n];
        // if(solve(0,mat, color,n,m)){
            if(solve(0,mat, color,n,m) == true){
            return "YES";
        }
        return "NO";
        }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int N = 4, M = 3;
//
//		int[][] G = new int[N][N];
//
//		G[0][1] = 1;
//		G[0][3] = 1;
//		G[0][2] = 1;
//		G[1][0] = 1;
//		G[1][2] = 1;
//		G[2][1] = 1;
//		G[2][3] = 1;
//		G[2][0] = 1;
//		G[3][2] = 1;
//		G[3][0] = 1;
//
//		int[] color = new int[N];
//		boolean ans = graphColoring(G, color, 0, M);
//
//		if (ans)
//		    System.out.println("1");
//		else
//		    System.out.println("0");


	}

}
