package SortingInDSA;

import java.util.Scanner;

public class Recursive_Insertion_Sort {
	public void recis(int arr[],int i, int n) {
		// Base Case: i == n
		if(i==n) return;
		int j = i;
		while(j>0 && arr[j-1] > arr[j]) {
			int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
		}
		recis(arr, i+1,n);
	}

	public static void main(String[] args) {
				Recursive_Insertion_Sort rc =  new Recursive_Insertion_Sort();
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter the Size of Array: ");
				int n = sc.nextInt();
				int arr[] = new int[n];
				for(int i=0;i<n;i++) {  
					System.out.print("Enter the Array for Sorting: ");
					arr[i] = sc.nextInt();	
				}
				rc.recis(arr,0, n);
				for(int i=0;i<n;i++) {
					System.out.print(arr[i] + " ");
			
				}
				System.out.println();

	}

}
