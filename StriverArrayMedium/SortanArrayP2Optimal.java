package StriverArrayMedium;

import java.util.*;
public class SortanArrayP2Optimal {
	public static void sortArray(ArrayList<Integer> arr, int n) {
		int low = 0, mid = 0, high = n-1;
		while(mid<=high) {
			if(arr.get(mid) == 0) {
				int temp = arr.get(low);
				arr.set(low, arr.get(mid));
				arr.set(mid, temp);
				low++;
				mid++;
			}
			else if( arr.get(mid) == 1) {
				mid++;
			}
			else {
				//arr[mid] == 2
				int temp = arr.get(mid);
				arr.set(mid, arr.get(high));
				arr.set(high, temp);
				high--;
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[]{0,1,1,0,1,2,1,2,0,0,0}));
		int n  =  10;
		SortanArrayP2Optimal.sortArray(arr, n);
	
		for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
		
	}

}
