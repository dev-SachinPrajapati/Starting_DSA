package StriverArrayHard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSumOptimal {
	public static List<List<Integer>> fourier(int arr[], int n,int target){
		List<List<Integer>> ans = new ArrayList<>();
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			if(i>0 && arr[i] == arr[i-1]) continue;
			
			for(int j=i+1;j<n;j++) {
				if(j != i+1 && arr[j] == arr[j-1]) continue;
				int k = j+1;
				int l = n-1;
				while(k<l) {
					long sum = arr[i] + arr[j] + arr[k] +arr[l];
					if(sum == target) {
						List<Integer> temp = new ArrayList<>();
						temp.add(arr[i]);
						temp.add(arr[j]);
						temp.add(arr[k]);
						temp.add(arr[l]);
						ans.add(temp);
						k++;
						l--;
						  // skip the duplicates:
						while(k<l && arr[k] == arr[k-1]) k++;
						while(k<l && arr[l] == arr[l+1]) l--;
					}
					else if(sum < target) k++;
					else l--;
				}
			
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
		int n = arr.length;
		int target = 9;
		List<List<Integer>> ans = fourier(arr,n, target);
		System.out.println("The quadruplets Optimal are: ");
		for(List<Integer> it : ans) {
			System.out.print("[");
			for(int ele : it) {
				System.out.print(ele + " ");
			}
			System.out.print("]");
		}
		System.out.println();

	}

}
