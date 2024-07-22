package StriverArray;

import StriverArray.ArrayP1.largest_element;

public class ArrayP2Optimal {

	//Optimal Solution for Second largest
	public static int slargest(int arr[], int n) {
		if(n<2) return -1;
		int largest = Integer.MIN_VALUE;
		int second_largest = Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++) {
			
			if(arr[i] > largest) {
				second_largest = largest;
				largest = arr[i];
			}
			else if(arr[i]> second_largest && arr[i] != largest) {
				second_largest =  arr[i];
			}
		}
		
		return second_largest;
	}
	
	//Optimal Solution for Second Smallest
	public static int ssmallest(int arr[], int n) {
		if(n<2) return -1; //here we use to tell them array should not be less than 2 
		int smallest = Integer.MAX_VALUE;
		int second_smallest = Integer.MAX_VALUE;
		
		for(int i=0;i<n;i++) {
			
			if(arr[i] < smallest) {
				second_smallest = smallest;
				smallest = arr[i];
			}
			else if(arr[i] < second_smallest && arr[i] != smallest) {
				second_smallest =  arr[i];
			}
		}
		
		return second_smallest;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,7,7,5};
		int n = arr.length;
	    System.out.println("Second Largest:" +ArrayP2Optimal.slargest(arr,n));
	    System.out.println("Second Smallest:" +ArrayP2Optimal.ssmallest(arr,n));
	}
	/*Time Complexity: O(N), Single-pass solution
	
	Space Complexity: O(1)*/
}
     