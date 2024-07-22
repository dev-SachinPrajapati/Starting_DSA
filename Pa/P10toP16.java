package Pa;

import java.util.Scanner;

public class P10toP16 {

	//Problem 10
	/*static void pattern1(int n) {
		for(int i=0; i<=2*n-1;i++) {
			int stars = i;
			if(i>n) stars = 2*n-i;
			for(int j=1;j<=stars;j++) {  
							
				System.out.print("*");
			}
			System.out.println();
		}
	}
	 */
	//Problem 11
/*	static void pattern1(int n) {
		int stars = 1;
		for(int i=0; i<n;i++) {
			if(i%2 == 0) stars = 1;
			else stars = 0;
			for(int j=0;j<=i;j++) {  	
				System.out.print(stars);
				stars = 1 - stars;
			}
			System.out.println();
		}
	}  */
	
	//Problem 12
	/*static void pattern1(int n) {
		int space = 2*(n-1);
		for(int i=1; i<=n;i++) {
			//numbers
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			//space
			for(int j=1;j<=space;j++) {
				System.out.print(" ");	
			}
			//numbers
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			
			
			System.out.println();
			space -= 2;
		}
	}
	*/
	//Problem 13
	/*	static void pattern1(int n) {
			int num =1;
			for(int i=1; i<=n;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print(num + " ");
					num = num +1;
				}
				System.out.println();
			}
		}
	*/
	
	//Problem 14
/*	static void pattern1(int n) {
		for(int i=1; i<=n;i++) {
			for(char ch = 'A';ch <= 'A'+i; ch++) {  //It basically A+1, A+2, A+3
				System.out.print(ch+ " ");
			}
			System.out.println();
		}
	}
	*/
	
	//Problem 15
	/*static void pattern1(int n) {
		for(int i=1; i<=n;i++) {
			for(char ch = 'A';ch <= 'A'+(n-i-1); ch++) {  //It basically A+[n-i-1 (i.e  A+ n se sab minus  ) and goes on] 
				System.out.print(ch+ " ");
			}
			System.out.println();
		}
	}
	 */
	//Problem 16
	static void pattern1(int n) {
		for(int i=0; i<n;i++) {
			char ch = (char) ('A' + i);
			for(int j=0;j<=i;j++) {  
				System.out.print(ch+ " ");
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
