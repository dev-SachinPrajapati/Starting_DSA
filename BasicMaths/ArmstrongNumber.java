package BasicMaths;

public class ArmstrongNumber {
	public int digit(int n) {
		int count = 0, sum=0,  dup = n;
		while(n>0){
			int last_digit = n%10;
			sum = sum + (last_digit*last_digit*last_digit);
			n = n/10;
			count = count +1;
		}
		if(sum == dup) {
			System.out.println("It is Armstrong ");
			return dup;
		}
		else {
			System.out.println("It is not a  Armstrong ");
			return dup;
		}
	}
	public static void main(String[] args) {
		ArmstrongNumber cd = new ArmstrongNumber();
		int n = 153;
		System.out.println("Number of digits in " +n + " : " + cd.digit(n));	
	}

}
