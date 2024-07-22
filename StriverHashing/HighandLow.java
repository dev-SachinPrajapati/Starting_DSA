package StriverHashing;

import java.util.*;

public class HighandLow {

	public static void countfreq(int arr[], int n) {
		boolean visited[] = new boolean[n];
		int maxfr = 0, minfr = 0;
		int maxel = 0, minele = 0;
		
		for(int i=0;i<n;i++) {
			// Skip this element if already processed
			if(visited[i] == true) {
				continue;
			}
			// Count frequency
			int count = 1;
			for(int j=i+1;j<n;j++) {
				if(arr[i] == arr[j]) {
					visited[j] = true;
					count++;
				}
			}
			
			if(count>maxfr) {
				maxel =  arr[i];
				maxfr = count;
			}
			
			if(count<minfr) {
				minele =  arr[i];
				minfr = count;
			}
			
			 
		}
		 System.out.println("The highest frequency element is: " + maxel);
	       System.out.println("The lowest frequency element is: " + minele);

				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]  = {10,5,10,15,10,5};
		int n = arr.length;
		countfreq(arr,n);
			
	}

}

/* Chatgpt
 * The method countfreq(int arr[], int n) takes an integer array arr and its length n as input.

It initializes two arrays:

visited: A boolean array of size n to keep track of elements that have been processed to avoid recounting their frequency.
maxfr and minfr: Integers to store the maximum and minimum frequencies encountered while iterating through the array.
It also initializes two variables:

maxel and minele: Integers to store the elements with the maximum and minimum frequencies, respectively.
The code then starts iterating through the array using a nested loop. The outer loop runs from index 0 to index n-1.

Inside the outer loop, there is another loop that starts from i+1 (the next index after the current element) and goes up to the end of the array. This inner loop is used to count the frequency of the current element (arr[i]) by comparing it with all the elements ahead.

The frequency of an element is the number of times it appears in the array. For each element, the code checks if it has already been processed (visited[j] == true). If it has been processed, it skips the current iteration to avoid recounting its frequency.

If the element at index i has not been processed yet, the code counts its frequency (count) by comparing it with the elements at subsequent indices (j).

After counting the frequency, the code updates the maxel and maxfr if the current element has a higher frequency than the previously encountered maximum frequency element. Similarly, it updates the minele and minfr if the current element has a lower frequency than the previously encountered minimum frequency element.

Finally, after processing all the elements, the code prints the element with the highest frequency (maxel) and the element with the lowest frequency (minele).

In the main method, an example array arr is created, and the countfreq method is called with the array and its length as arguments.*/
