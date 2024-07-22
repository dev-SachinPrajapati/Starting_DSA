package Pa;

import java.util.Scanner;
import java.lang.Math;

public class P17toP22 {
	//Problem 17
/*	static void pattern1(int n) {
		for(int i=0; i<=n;i++) {
			//space
			for(int j=0;j<=n-i-1;j++) {  
				System.out.print(" ");
			}
			//Alphabets
			char ch = 'A';
			int breakpoint  = (2*i+1)/2;
			for(int j=1;j<=2*i+1;j++) {  
							
				System.out.print(ch);
				if(j<=breakpoint) ch++;
				else ch--;
			}
					//space	
			for(int j=0;j<=n-i-1;j++) {  
				System.out.print(" ");
			}

			System.out.println();
		}
	} 
	*/
	//Problem 18 
/*	static void pattern1(int n) {
		for(int i=0; i<=n;i++) {
			for(char ch= (char) ('Z'-i); ch<= 'Z';ch++) {  
				System.out.print(ch + " ");
			}
			System.out.println();
		}
	} 
*/
	//Problem 19 
	/*
	 * Star   	Space 	 Star
	 *0->5		0		 5
	 *1->4 		2		 4
	 *2->3 		4		 3
	 *3->2		6		 2
	 *4->1		8		 1
	 *
	 *(n-i)		+2		(n-i)
	 *..........
	 * */
	
	/* For Symmetric
	 * 4->1		8		 1
	 * 3->2		6		 2
	 * 2->3 	4		 3  
	 * 1->4 	2		 4
	 * 0->5		0		 5
	 * */
/*	static void pattern1(int n) {
		int iniS = 0;
		for(int i=0; i<=n;i++) {
			//Stars
			for(int j=0;j<=n-i;j++) {
				System.out.print("*");
			}
			//Spaces
			for(int j=0; j<=iniS;j++) {
				System.out.print(" ");
			}
			//Stars
			for(int j=0;j<=n-i;j++) {
				System.out.print("*");
			}
			iniS += 2;
			System.out.println();
		}
	
		//Symmetric ke baad wala part
		iniS = 2*n-2;
		for(int i=0; i<=n;i++) {
			//Stars
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			//Spaces
			for(int j=0; j<=iniS;j++) {
				System.out.print(" ");
			}
			//Stars
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			iniS -= 2;
			System.out.println();
		}
	}   */
	  
	//Problm 20
	/* For 1st Symmetric
	 * Star   	Space 	 Star
	 *0->1		8		 1
	 *1->2 		6		 2
	 *2->3 		4		 3
	 *3->4		2		 4
	 *4->5		0		 5
	 *
	 *
	 *..........
	 * */
	
	/* For Symmetric
	 * 4->4		2		 4
	 * 3->3		4		 3
	 * 2->2 	6		 2  
	 * 1->1 	8		 1
	 * */
/*	static void pattern1(int n) {
		int space = 2*n-2;
		for(int i=1; i<=2*n-1;i++) {
			//Stars
			int star = i;
			if(i>n) star = 2*n-i;
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			//Spaces
			for(int j=1; j<=space;j++) {
				System.out.print(" ");
			}
			//Stars
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i<n) space -=2;
			else space +=2;
		}
	}
	*/
	
	
	//Problem 21 
	/*static void pattern1(int n) {
		for(int i=0; i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || i==n-1 || j==n-1) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}  */
	
	
	//Problem 22
	static void pattern1(int n) {
		for(int i=0; i<2*n-1;i++) {
			for(int j=0;j<2*n-1;j++) {
				int top =i;
				int left = j;
				int right = (2*n-2) -j;
				int bottom = (2*n-2) -i;
				System.out.print(n-Math.min(Math.min(top,bottom), Math.min(left,right)));
			}
			System.out.println();
		}
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number till you want to see Pattern: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        pattern1(n);
        sc.close();

	}

}
