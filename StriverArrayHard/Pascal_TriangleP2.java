package StriverArrayHard;

//Given the row number n. Print the n-th row of Pascal’s triangle.
public class Pascal_TriangleP2 {
	public static long funNcR(int n, int r) {
	
			long ans = 1;
			for(int i=0;i<r;i++) {
				ans = ans*(n-i);
				ans = ans/(i+1);
			}
		return ans;
	}
	public static void pascaltriangle(int n) {
		for(int c=1;c<=n;c++) {
			System.out.print(funNcR(n-1,c-1) + " ");
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 5;
		 pascaltriangle(n);
	}

}
