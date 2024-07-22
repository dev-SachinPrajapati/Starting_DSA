package BasicMaths;

public class ReverseaNumber {
	/* 7789
	 *  revNum = (revNum*10) + last_digits
	 * (0*10)+9 = 9
	 * (9*10)+8 = 8
	 * (98*10)+7 = 7
	 * (987*10)+7 = 7
	 * */
	
	//Method 1
	public int digit(int n) {
		int count = 0, revNum=0;
		while(n>0){
			int last_digit = n%10;
			revNum = (revNum*10) + last_digit;
			n = n/10;
			count = count +1;
		}
		return revNum;
	}
	public static void main(String[] args) {
		
		ReverseaNumber cd = new ReverseaNumber();
		int n = 12345;
		System.out.println("Number of digits in " +n + " " + cd.digit(n));	
	}

}
