package StriverHashing;

import java.util.*;
public class NumberHashing {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =  new Scanner(System.in);
		 int n=0;
		 System.out.print("Enter the Size of Array: ");
		 n = sc.nextInt();
		 int[] arr = new int[n];
		 for(int i=0;i<n;i++) {
			 System.out.print("Enter the Array: ");
			 arr[i] = sc.nextInt();
		 }
		 
		 //precomuting array
		 int [] hash = new int[13];
		 for(int i=0;i<n;i++) {
			 hash[arr[i]] +=1;
		 }
		 
		 int q;
		 System.out.print("Enter the Number of Array you want to check: ");
		 q = sc.nextInt();
		 
		 System.out.println("Enter the Array of Number: ");
		 while(q-- !=0) {
			 int number;
			 number =  sc.nextInt();
			// fetching:
			 System.out.println(hash[number]);
		 }
		 
		 sc.close();
		 
		 
		 
		 
	}

}
