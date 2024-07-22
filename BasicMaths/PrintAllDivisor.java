package BasicMaths;

public class PrintAllDivisor {

	public int digit(int n) {
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i+" Divisor of All");
			}
//			else {
//				System.out.println(i+" Not Divisor of All");
//			}
		}
		return n;
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintAllDivisor cd = new PrintAllDivisor();
		int n = 36;
		System.out.println("Number of digits in " +n + " : " + cd.digit(n));	

	}

}
