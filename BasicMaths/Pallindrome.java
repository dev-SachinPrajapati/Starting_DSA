package BasicMaths;

public class Pallindrome {
	public int digit(int n) {
		int count = 0, revNum=0, dup = n;
		while(n>0){
			int last_digit = n%10;
			revNum = (revNum*10) + last_digit;
			n = n/10;
			count = count +1;
		}
		if(revNum == dup) {
			System.out.println("True");
			return revNum;
		}
		else {
			System.out.println("False");
			return revNum;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pallindrome cd = new Pallindrome();
		int n = 123321;
		System.out.println("Number of digits in " +n + " " + cd.digit(n));	

	}

}
