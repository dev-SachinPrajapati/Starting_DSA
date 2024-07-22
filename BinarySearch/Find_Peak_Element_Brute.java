package BinarySearch;

import java.util.*;
public class Find_Peak_Element_Brute {
	
	public static int findPeakElement(ArrayList<Integer> arr, int n) {
		for(int i=0;i<n;i++) {
			if((i==0|| arr.get(i-1) < arr.get(i)) && (i == n-1 || arr.get(i) > arr.get(i+1) )){
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,5,1));
			int n = arr.size();
			int ans = findPeakElement(arr,n);
			System.out.println("The Peak of Element is: " + ans);
	}

}


//Output will 7 because we are return index