package RecursionInJava;

import java.util.Scanner;

public class Lec2P4 {
	public void func(int i,int n) {
		if(i<1) {
			return;
		}
		func(i-1,n);  //BackTrack     (1-N)  	(Please see the P3 to understand this )(only print ko niche karke func() ko upar likha hai)
		System.out.println(i);  //Problem 3
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		
		Lec2P4 l2 = new Lec2P4();
		l2.func(n,n);
	}

}
