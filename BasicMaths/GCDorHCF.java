package BasicMaths;
import java.lang.*;

public class GCDorHCF {
	public void digit(int n1, int n2) {
		for(int i=Math.min(n1, n2);i>=1;i--) {
			if(n1 % i == 0 && n2 % i ==0) {
				System.out.print(i);
				break;
			}
		}
		System.out.println(" It is GCD");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GCDorHCF cd = new GCDorHCF();
		int n1 = 11;
		int n2 = 13;
		cd.digit(n1,n2);
//		System.out.println("Number of digits in " + n1 +" , "+ n2 + " : " + cd.digit(n1,n2));	
	}

}
