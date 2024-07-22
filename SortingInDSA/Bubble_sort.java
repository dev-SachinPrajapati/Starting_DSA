package SortingInDSA;

import java.util.Scanner;

public class Bubble_sort {
	public void bubble_sort(int arr[], int n) {
		for(int i = n-1;i>=1;i--) {
			/*didswap is here because in case if swap doesn't happened then it will break on if(didswap ==0) */
			int didswap = 0;
			for(int j=0;j<=i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					didswap = 1;  //if swap happens
				}
			}
			/*if swap doesn't happens it will break*/
			if(didswap == 0) {
				break;
			}
			System.out.println("Runs \n");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bubble_sort ss = new Bubble_sort();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of Array: ");
		int n = sc.nextInt();
		int arr[]  = new int[n];
		for(int i=0;i<=n-1;i++) {
			System.out.print("Enter the Array for Sorting: ");
			arr[i] = sc.nextInt();	
		}
		
		ss.bubble_sort(arr, n);
//		int[] arr  = {13,46,24,52,20,9};
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	// TC:- O(Nsq2) without didswap 
	// TC:- O(N)   with didswap

}
