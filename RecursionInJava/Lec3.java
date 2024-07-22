package RecursionInJava;

import java.util.Scanner;

public class Lec3 {
	//Functional Recursion for summation of N number
	/*public int sum(int n) {
		if(n == 0) {
			return 0;
		}
		return n +sum(n-1);
	}  */
	//Functional Recursion for Factorial of Number
	public int sum(int n) {
		if(n == 1) {
			return 1;
		}
		return n *sum(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lec3 l3 = new Lec3();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		System.out.println(l3.sum(n));
	}

}
