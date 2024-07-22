package BasicMaths;
import java.lang.Math;
public class CountDigit {
	//Method 1
	//TC:- O(log10(N))
	//SC:- O(1)
	/*public int digit(int n) {
		int count = 0;
		while(n>0){
			int last_digit = n%10;
			count = count +1;
			n = n/10;
		}
		return count;
		//System.out.println(count);
	}
	*/
	//Method 2
	//Convert the integer into a string.
	//	Find the length of the string  
	//TC:- O(1) SC:-0(1)
/*	public int digit(int n) {
		String n2 = Integer.toString(n);
		return n2.length();
		//System.out.println(count);
	}
	*/
	
	//Method 3
	//TC:- O(1) SC:-0(1)
	public int digit(int n) {
		int digits = (int) Math.floor(Math.log10(n)+1);
		return digits;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountDigit cd = new CountDigit();
		int n = 12345;
		System.out.println("Number of digits in " +n + " " + cd.digit(n));		
	}

}
