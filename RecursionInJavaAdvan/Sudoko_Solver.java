package RecursionInJavaAdvan;

public class Sudoko_Solver {
	   // this isValid check for suduko 3 rule
    public  static boolean isValid(int [][]board, int row, int col, int c){
            for(int i=0;i<9;i++){
                
                //for col:- col remain same but i go for every element 
                if(board[i][col] == c){
                    return false;
                }
                
                //for row:- row remain same but i go for every element 
                if(board[row][i] == c){
                    return false;
                }
                
                //for 3*3 table
                        // row               col
                if(board[3*(row/ 3) + i / 3 ][3 * (col /3) + i % 3] == c){
                    return false;
                }
            }
                return true;
    }

                                      // 9*9 TABLE 
    public static boolean sudokuSolver(int board[][]){

        /* Now we will check first empty space and then second and go on...*/
        for(int i=0;i<9;i++){
            for (int j = 0; j < 9; j++) {
                
                if(board[i][j] == 0){

                    for(int c = 0;c<=9; c++){
                        // arr, row, col, 3*3 table
                        if(isValid(board, i,j,c)){
                            board[i][j] = c;

                            //now if it is true then return true or false for false
                            if(sudokuSolver(board) == true){
                                return true;
                            }
                            else{
                                //this is for when it get try with wrong number
                                board[i][j] = 0;
                            }
                        }
                    }
                    // If i go through all box and never find any empty space (last call)
                    // so no return of true or false
                    return false;
                }
            }
        }
        // here it state that if never get true or false just return true 
        //means I get my suduko filled return true
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] board  = {{0, 0, 4, 0, 5, 0, 0, 0, 0},
		{9, 0, 0, 7, 3, 4, 6, 0, 0},
		{0, 0, 3, 0, 2, 1, 0, 4, 9},
		{0, 3, 5, 0, 9, 0, 4, 8, 0},
		{0, 9, 0, 0, 0, 0, 0, 3, 0},
		{0, 7, 6, 0, 1, 0, 9, 2, 0},
		{3, 1, 0, 9, 7, 0, 2, 0, 0},
		{0, 0, 9, 1, 8, 2, 0, 0, 3},
		{0, 0, 0, 0, 6, 0, 1, 0, 0}};

		sudokuSolver(board);

	    for (int i = 0; i < 9; i++) {
	      for (int j = 0; j < 9; j++)
	        System.out.print(board[i][j] + " ");
	      System.out.println();
	    }

	}

}
