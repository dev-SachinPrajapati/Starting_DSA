package BinaryinAnswer;

public class Finding_sqrt_buildin_func {

	public static int find_sqrt_buildin(int n) {
		int ans = (int) Math.sqrt(n);
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20;
		int ans = find_sqrt_buildin(n);
		System.out.println("The square root of n is: " + ans);
	}
}