package StriverArrayHard;

import java.util.*;
public class ThreeSumBrute {

	public static List<List<Integer>> triplet(int arr[], int n){
		Set<List<Integer>> st = new HashSet<>();
		
		for(int i=0;i<n;i++) {
			for(int j= i+1;j<n;j++) {
				for(int k = j+1;k<n;k++) {
					if(arr[i]+arr[j]+arr[k] == 0) {
						//triplets
						List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k]);
						temp.sort(null);
						st.add(temp);
					}
				}
			}
		}
		
		List<List<Integer>> ans = new ArrayList<>(st);
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-1, 0, 1, 2, -1, -4};
		int n = arr.length;
		List<List<Integer>> ans = triplet(arr,n);
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
