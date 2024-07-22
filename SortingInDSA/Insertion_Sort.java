package SortingInDSA;

import java.util.Scanner;

public class Insertion_Sort {

	public void insertion_sort(int arr[], int n) {
		for(int i=0;i<=n-1;i++) {
			int j=i;
			/*we didn't use j>=0 because it compare and for 0 it will compare with -1 and show runtime error*/
			while(j>0 && arr[j-1] > arr[j]) {
				int temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
				j--;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insertion_Sort ss = new Insertion_Sort();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of Array: ");
		int n = sc.nextInt();
		int arr[]  = new int[n];
		for(int i=0;i<=n-1;i++) {
			System.out.print("Enter the Array for Sorting: ");
			arr[i] = sc.nextInt();	
		}
		
		ss.insertion_sort(arr, n);
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	}


