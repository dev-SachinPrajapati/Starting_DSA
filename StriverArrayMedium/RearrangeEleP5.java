package StriverArrayMedium;

import java.util.ArrayList;

public class RearrangeEleP5 {

	public static int[] rearrangeElement(int arr[], int n) {
		ArrayList<Integer> positive = new ArrayList<>();
		ArrayList<Integer> negative = new ArrayList<>();
		for(int i=0;i<n;i++) {
			if(arr[i]>0) positive.add(arr[i]);
			else negative.add(arr[i]);
			
		}
		// Positives on even indices, negatives on odd.
		
		for(int i=0;i<n/2;i++) {
			arr[2*i] = positive.get(i);
			arr[2*i+1] = negative.get(i);
		}
		
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,1,-2,-5,2,-4};
		int n = arr.length;
		int ans[] = rearrangeElement(arr,n);
		for(int i=0;i<n;i++) {
			System.out.print(ans[i]+" ");
		}
	}

}
