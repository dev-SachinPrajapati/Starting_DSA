package StriverArrayMedium;

import java.util.*;
public class LeaderinArrayOptimal {
		public static ArrayList<Integer> superiorElements(int arr[]){
			int n = arr.length;
			ArrayList<Integer> ans = new ArrayList<>();
			int maxi = arr[n-1];
			ans.add(arr[n-1]);
			
			for(int i = n-2;i>=0;i--) {
				if(arr[i]>maxi) {
					ans.add(arr[i]);
					maxi = arr[i];
				}
			}
			return ans;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int arr[] = {10, 22, 12, 3, 0, 6};
				 ArrayList<Integer> ans= superiorElements(arr);
				 	Collections.sort(ans,Collections.reverseOrder());
				 	for (int i = 0; i < ans.size(); i++) {
				 	    System.out.print(ans.get(i)+" ");
				 	  }
	}

}
