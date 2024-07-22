package StriverArrayHard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSumBetter {

	public static List<List<Integer>> triplets(int arr[], int n){
		Set<List<Integer>> st = new HashSet<>(); 
		
		for(int i=0;i<n;i++) {
			Set<Integer> hashset = new HashSet<>(); //This is because when i moves to next element the set has to be empty
			
			for(int j= i+1;j<n;j++) {
				int third = -(arr[i]+arr[j]);
				
				if(hashset.contains(third)) {
					List<Integer> temp = Arrays.asList(arr[i],arr[j], third); //here we make triplets
					temp.sort(null);
					st.add(temp);
				}
				hashset.add(arr[j]);
			}
		}
		
		List<List<Integer>> ans = new ArrayList<>(st);
		return ans;
	}
	public static void main(String[] args) {
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
