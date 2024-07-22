package RecursionInJava;

public class Lec4P2 {
	public boolean fun(String s) {
		return isPalindromeHelper(s,0,s.length()-1);
	}
	private boolean isPalindromeHelper(String s,int start, int end) {
		if(start >= end) {
			return true;
		}
		if(s.charAt(start) != s.charAt(end)) {
			return false;
		}
		 return isPalindromeHelper(s, start + 1, end - 1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lec4P2 lp2 = new Lec4P2();
		String s = "11211";
		boolean fun = lp2.fun(s);
		System.out.println("Is Palindrome: " + fun);
	}

}
