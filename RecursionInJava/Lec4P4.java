package RecursionInJava;

public class Lec4P4 {
	public static boolean isPalindrome(String str) {
		// Write your code here.
		if (str.equals("")) {
			return true;
		}
		if (str.charAt(0) == str.charAt(str.length() - 1)) {
			if (str.length() == 1) {
				return true;
			}

			return (isPalindrome(str.substring(1, str.length() - 1)));
		}
		return false;
	}

	public static void main(String[] args) {
		String str = "ABCDCBA";
		boolean ans = isPalindrome(str);

		if (ans == true) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

}
