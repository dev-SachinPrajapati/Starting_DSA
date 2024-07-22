package Pa;
import java.util.Scanner;
public class P3toP9 {
	/*static void pattern1(int n){
		for(int i=0; i<=n;i++) {
			for(int j=0;j<=i;j++) {
				//System.out.print(i+j + " ");
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	*/
	
	//Pattern 4
 /*	static void pattern1(int n) {
		for(int i=0; i<=n;i++) {
			for(int j=0;j<=i;j++) {
				//System.out.print(i+j + " ");
				System.out.print(i + " ");
			}
			System.out.println();
		}
	} */
	
	//Problem 5 6 same 
/*	static void pattern1(int n) {
		for(int i=0; i<=n;i++) {
			for(int j=0;j<=n-i+1;j++) {  //number-row +1 
				System.out.print("* ");
			}
			System.out.println();
		}
	}   */
	
	//Problem 7
/*	static void pattern1(int n) {
		for(int i=0; i<=n;i++) {
			//space
			for(int j=0;j<=n-i-1;j++) {  
				System.out.print(" ");
			}
			//star
			for(int j=1;j<=2*i+1;j++) {  
							
				System.out.print("*");
			}
					//space	
			for(int j=0;j<=n-i-1;j++) {  
				System.out.print(" ");
			}

			System.out.println();
		}
	}  */
	
	//Problem 8  
	/*static void pattern2(int n) {
		for(int i=0; i<=n;i++) {
			//space
			for(int j=0;j<=i;j++) {  
				System.out.print(" ");
			}
			//star
			for(int j=1;j<=2*n - (2*i+1);j++) {  
							
				System.out.print("*");
			}
					//space	
			for(int j=0;j<=i;j++) {  
				System.out.print(" ");
			}

			System.out.println();
		}
	} */
	
	//Problem 8 by own pattern
	/*static void pattern1(int n) {
		for(int i=0; i<=n;i++) {
			//space
			for(int j=0;j<=n+i+1;j++) {  
				System.out.print(" ");
			}
			//star
			for(int j=1;j<=2*i-1;j++) {  
							
				System.out.print("*");
			}
					//space	
			for(int j=0;j<=n+i+1;j++) {  
				System.out.print(" ");
			}

			System.out.println();
		}
	}
	*/
	
	//Problem 8
	/*	static void pattern2(int n) {
			for(int i=0; i<=n;i++) {
				//space
				for(int j=0;j<=i;j++) {  
					System.out.print(" ");
				}
				//star
				for(int j=1;j<=2*i+1;j++) {  
								
					System.out.print("*");
				}
						//space	
				for(int j=0;j<=i;j++) {  
					System.out.print(" ");
				}

				System.out.println();
			}
		} 
	*/
				
				
		//Problem 9 is a combination of 7 and 8
	
//Problem 10
	static void pattern1(int n) {
		for(int i=0; i<=n;i++) {
			//space
			for(int j=0;j<=i;j++) {  
				System.out.print(" ");
			}
			//star
			for(int j=1;j<=(2*i-1)+(2*n - (2*i+1));j++) {  
							
				System.out.print("*");
			}
					//space	
			for(int j=0;j<=i;j++) {  
				System.out.print(" ");
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
        //pattern2(n); for problem 9 only
        sc.close();

	}

}
