package RecursionInJava;

public class Lec5 {
	public int recur(int n) {
		int last, slast;
		if(n<=1) {
			return n;
		}
		last = recur(n-1);
		slast = recur(n-2);
		return last + slast;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Lec5 l5 = new Lec5();
			int n = 21;
		 System.out.println(l5.recur(n));
	}

}
