package StriverArrayMedium;

import java.util.HashMap;
public class TWOSUMP1Better {
	public static String twosum(int arr[], int n, int target) {
		HashMap<Integer,Integer> sum = new HashMap<>();
		for(int i=0;i<n;i++) {
			int num = arr[i];
			int moreNeeded = target -num;
			if(sum.containsKey(moreNeeded)) {
				return "Yes";
			}
			sum.put(arr[i], i);
		}
	return "NO";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,6,5,8,11};
		int n = arr.length;
		int tar = 15;  //No	
//		int tar = 14; //Yes
		
		String ans = TWOSUMP1Better.twosum(arr, n,tar);
		System.out.println("This is the Answer for variant 1:" + ans);
	}

}
