package RecursionInJava;

import java.util.Scanner;

public class Lec3P2 {
//Parameterized Recursion
	public void para(int i,int sum) {
		if(i<1) {
			System.out.println(sum);
			return;
		}
		para(i-1, sum+i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lec3P2 lp2 = new Lec3P2();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		lp2.para(n,0);
//		System.out.println(lp2.para(n,0));
	}

}
