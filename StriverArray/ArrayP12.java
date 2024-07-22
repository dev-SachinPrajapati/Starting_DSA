package StriverArray;

import java.lang.*;
public class ArrayP12 {
		public static int findConsecutiveOnes(int[]arr) {
			int maxi = 0;
			int count= 0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i] == 1) {
					count++;
					maxi =  Math.max(maxi, count);
				}
				else {
					count = 0;
				}
			}
			return maxi;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[] = {1,1,0,1,1,1,0,1,1};
			System.out.println(ArrayP12.findConsecutiveOnes(arr));
	}

}
