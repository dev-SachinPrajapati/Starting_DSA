package StriverArrayHard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSumOptimal {
	public static  List< List < Integer > > triplets(int arr[], int n){
		 List<List<Integer>> ans = new ArrayList<>();
	        Arrays.sort(arr); 

	        for(int i=0;i<n;i++){
	            //remove duplicates:
	            if(i != 0 && arr[i] == arr[i-1]) continue;
	            //moving 2 pointers:
	            int j = i+1;
	            int k = n-1;
	            while (j<k) {
	                int sum = arr[i] + arr[j] + arr[k];
	                if(sum<0){
	                    j++;
	                }
	                else if(sum>0){
	                    k--;
	                }
	                else{
	                    //Triplets
	                    List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k]);
	                    ans.add(temp);
	                    //j and k cannot be same 
	                    j++;
	                    k--;
	                    //skip the duplicates:
	                    while(j<k && arr[j] == arr[j-1]) j++; //check if previous one is  same move and increase j
	                    while(j<k && arr[k] == arr[k+1]) k--;//check if nest one is  same move and decrease k
	                }
	            }
	        }
	        return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int arr[] = {-1, 0, 1, 2, -1, -4};
		int n = arr.length;
		List<List<Integer>> ans = triplets(arr,n);
		for(List<Integer> it:ans) {
			System.out.print("[");
			for(Integer i:it) {
				System.out.print(i + " ");
			}
			System.out.print("]");
		}
		System.out.println();
	}

}
