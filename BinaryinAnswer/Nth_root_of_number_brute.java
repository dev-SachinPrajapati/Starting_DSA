package BinaryinAnswer;

public class Nth_root_of_number_brute {

	public static long func(int b, int exp) {
		int ans = 1;
		int base = b;
		while (exp > 0) {
			if (exp % 2 == 1) {
				exp--;
				ans = ans * base;
			} else {
				exp /= 2;
				base = base * base;
			}
		}
		return ans;
	}

	public static int NthRoot(int n, int m) {
		// Use linear search on the answer space:
		for (int i = 1; i <= m; i++) {
			long val = func(i, n);
			if (val == (long) m)
				return i;
			else if (val > (long) m)
				break;
		}

		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3, m = 27;
		int ans = NthRoot(n, m);
		System.out.println("The answer is: " + ans);

	}

}

/*
 * Sure, let's use the provided input values n = 3 and m = 27 to calculate the
 * 3rd root of 27 (i.e., finding a number that, when raised to the 3rd power,
 * equals 27). Here's the code execution for this scenario:
 * 
 * Input: - n = 3 (desired root) - m = 27 (the number for which we want to find
 * the 3rd root)
 * 
 * Now, let's step through the code execution:
 * 
 * 1. Initialize variables: - `n` is 3 (the desired root). - `m` is 27 (the
 * number for which we want to find the 3rd root). - `ans` is initially 1. -
 * `base` is initially equal to `b`, which is 3 in this case.
 * 
 * 2. Inside the loop: - Iteration 1: - `exp` is initially 3. - `exp` is odd
 * (3), so it decrements `exp` by 1 (`exp = 2`) and multiplies `ans` by `base`
 * (`ans = 1 * 3 = 3`). - Iteration 2: - `exp` is now 2. - `exp` is even (2), so
 * it divides `exp` by 2 (`exp = 1`) and squares `base` (`base = 3 * 3 = 9`). -
 * Iteration 3: - `exp` is now 1. - `exp` is odd (1), so it decrements `exp` by
 * 1 (`exp = 0`) and multiplies `ans` by `base` (`ans = 3 * 9 = 27`).
 * 
 * 3. The loop continues until `exp` becomes 0, and the result is calculated
 * efficiently: - `ans` is 27, which is the 3rd root of 27.
 * 
 * 4. The loop ends, and the method returns `ans`, which is 27.
 * 
 * Output: - The output of the program will be "The answer is: 27."
 * 
 * So, according to this code, the 3rd root of 27 is 27 itself, and that's
 * what's printed to the console. The algorithm efficiently handled the
 * calculation using the exponentiation by squaring method.
 */
