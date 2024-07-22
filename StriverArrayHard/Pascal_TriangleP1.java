package StriverArrayHard;

//GIven Row and Column find the element at that place 
public class Pascal_TriangleP1 {

	public static long NcR(int n, int r) {
		long result = 1;
		for(int i=0;i<r;i++) {
			result = result*(n-i);
			
			result = result/(i+1);
		}
		return result;
	}
	
	public static int pascalTriangle(int r, int c) {
		int element = (int) NcR(r-1,c-1);
		return element;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 6;
		int r = 6;
		int element = pascalTriangle(r, c);
        System.out.println("The element at position (r,c) is: " + element);
	}

}
