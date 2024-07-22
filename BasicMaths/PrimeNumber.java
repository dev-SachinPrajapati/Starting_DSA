package BasicMaths;

public class PrimeNumber {

	public int digit(int n) {
		int count = 0;
		for(int i=1;i*i<=n;i++) {
			if(n%i==0) {
				count++;
				if((n/i)!=2) {
					count++;
				}
			}
		}
		if(count==2) {
			System.out.println("It is a Prime Number"); 
		}
		else {
			System.out.println("It is not a Prime Number");
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber cd = new PrimeNumber();
		int n = 9;
		System.out.println("Number of digits in " + n + " : " + cd.digit(n));	

	}

}
