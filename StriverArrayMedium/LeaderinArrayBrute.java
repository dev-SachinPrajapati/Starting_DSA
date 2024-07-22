package StriverArrayMedium;

import java.util.ArrayList;
import java.util.Collections;

public class LeaderinArrayBrute {

	public static ArrayList<Integer> superiorElements(int arr[]){
		int n = arr.length;
		ArrayList<Integer> ans = new ArrayList<>();
		for(int i=0;i<n;i++) {
			boolean leader = true;
			
			for(int j=i+1;j<n;j++) {
				if(arr[j]>arr[i]) {
					leader = false;
					break;
				}
			}
			if (leader)
			    ans.add(arr[i]);
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
