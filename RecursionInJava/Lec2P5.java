package RecursionInJava;

import java.util.Scanner;

public class Lec2P5 {
	public void func(int i,int n) {
		if(i>n) {
			return ;
		}
		func(i+1,n);   //BackTracking
		System.out.println(i);  //Problem 5
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		
		Lec2P5 l2 = new Lec2P5();
		l2.func(1,n);

	}

}
