package StriverArrayMedium;

import java.util.*;

public class TWOSUMP1Optimal {
	public static String twosum(int arr[], int n, int target) {
		Arrays.sort(arr);
		int left = 0, right = n-1;
		while(left<right) {
			int sum = arr[left] + arr[right];
			if(sum == target) {
				return "Yes";
			}
			else if(sum <target) {
					left++;
			}
			else {
				right--;
			}
		}
	return "NO";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,6,5,8,11};
		
		int n = arr.length;
//		int tar = 15;  //No	
		int tar = 14; //Yes
		
		String ans = TWOSUMP1Optimal.twosum(arr, n,tar);
		System.out.println("This is the Answer for variant 1:" + ans);

	}

}
