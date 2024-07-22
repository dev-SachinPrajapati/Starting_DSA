package StriverArray;

import java.util.*;
public class Array14BetterSol {
	public static int longestSubarraywithK(int arr[], long k) {
		int n = arr.length;
		Map<Long,Integer> presumMap = new HashMap<>();
		long sum = 0;
		int maxLen = 0;
		for(int i=0;i<n;i++) {
			//calculate the prefix sum till index i:
			sum += arr[i];
			// if the sum = k, update the maxLen:
			if(sum == k) {
				maxLen = Math.max(maxLen, i+1);
			}
			 // calculate the sum of remaining part i.e. x-k:
			long rem = sum - k;
			
			//Calculate the length and update maxLen:
			if(presumMap.containsKey(sum)) {
				presumMap.put(sum, i);
			}
		}
		return maxLen;
	}
	//Find Longest sumarray with sum K
	public static void main(String[] args) {
//		int arr[] = {2, 3, 5, 1, 9};
		int arr[] = {1,2,3,1,1,1,1,4,2,3};
		long k = 10;
		int len = Array14BetterSol.longestSubarraywithK(arr,k);
		System.out.println("The length of the longest subarray is: " + len);
		//output is 7 because at index 7 is there equal to k
	}

}
