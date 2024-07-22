package StriverArrayMedium;

import java.util.*;

public class MajorityEleP3Better {
	public static int majorityEle(int arr[], int n) {
			HashMap<Integer, Integer> mpp = new HashMap<>();
			
			//storing the elements with its occurrence:
			for(int i=0;i<n;i++) {
				/* The purpose of this method is to retrieve the value associated with a given key from the map,
				 *  but with a fallback default value in case the key is not present in the map.*/
				int value= mpp.getOrDefault(arr[i], 0);
				mpp.put(arr[i], value+1);
			}
			
			//searching for the majority element:
			for(Map.Entry<Integer, Integer> it:mpp.entrySet()) {
				if(it.getValue() >n/2) {
					return it.getKey();
				}
			}
			return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[] = {2,2,3,3,1,2,2};
			int n = arr.length;
			int ash = MajorityEleP3Better.majorityEle(arr, n);
			System.out.println("The majority element is: " + ash);
	}

}
