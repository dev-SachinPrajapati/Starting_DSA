package SortingInDSA;

import java.util.*;
public class Selection_Sort {
	public void selection_sort(int arr[], int n) {
		for(int i=0;i<=n-2;i++) {
			int mini = i;
			for(int j=i;j<=n-1;j++) {
				if(arr[j]<arr[mini]) {
					mini = j;
				}
			}
			int temp  =arr[mini];
			arr[mini] = arr[i];
			arr[i] = temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Selection_Sort ss = new Selection_Sort();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of Array: ");
		int n = sc.nextInt();
		int arr[]  = new int[n];
		for(int i=0;i<=n-1;i++) {
			System.out.print("Enter the Array for Sorting: ");
			arr[i] = sc.nextInt();	
		}
		
		ss.selection_sort(arr, n);
//		int[] arr  = {13,46,24,52,20,9};
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		
		//TC:- O(Nsq2)
	}

}
