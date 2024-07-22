package StriverArrayHard;
import java.util.*;
public class Pascal_TriangleP3 {
	public static int funNcR(int n, int r) {
		long ans = 1;
		for(int i=0;i<r;i++) {
			ans = ans*(n-i);
			ans = ans/(i+1);
		}
	return (int) ans;
}
	//List<List<Integer>>: This is the return type of the function, meaning it returns a 2D list of integers (Pascal's Triangle).
public static List<List<Integer>> pascaltriangle(int n) {
	List<List<Integer>> answ = new ArrayList<>();
	  // Store the entire Pascal's triangle:
	for(int row = 1;row<=n;row++) {
		List<Integer> templist = new ArrayList<>();
		for(int col = 1;col<=row;col++){  // temporary list
			templist.add(funNcR(row - 1, col - 1));
		}
		answ.add(templist);
		
	}
	return answ	;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		List<List<Integer>> answe = pascaltriangle(n);
		for(List<Integer>it:answe) {
		for(int ele:it) {
			System.out.print(ele + " ");
			}
		System.out.println();
		}
	}

}
