package StriverArrayMedium;
import java.util.*;
public class MaxSubarraySumP4Optimal {
	public static long maxSub(int arr[], int n) {
		long maxi  = Long.MIN_VALUE; // maximum sum
		int sum = 0;
		
		for(int i=1;i<n;i++) {
			sum += arr[i];
			if(sum>maxi) {
				maxi = sum;
			}
			 // If sum < 0: discard the sum calculated
			if(sum == 0) {
				sum = 0;
			}
		}
		// To consider the sum of the empty subarray
        // uncomment the following check:

        //if (maxi < 0) maxi = 0;
		return maxi;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-2,-3,4,-1,-2,1,5,3};
		int n = arr.length;
        long ans = maxSub(arr,n);
        System.out.println("The maximum subarray sum is: " + ans);
	}

}
