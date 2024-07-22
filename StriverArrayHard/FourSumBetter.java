package StriverArrayHard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSumBetter {
	public static List<List<Integer>> fourier(int arr[], int n,int target){
		Set<List<Integer>> st = new HashSet<>();
		for(int i=1;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				Set<Long> hashset = new HashSet<>();
				for(int k = j+1;k<n;k++) {
					long sum =  (arr[i] + arr[j] + arr[k]);
					long fourth = target - sum;
					if(hashset.contains(fourth)) {
						List<Integer> temp = new ArrayList<>();
						temp.add(arr[i]);
						temp.add(arr[j]);
						temp.add(arr[k]);
						temp.add((int) fourth);
						temp.sort(Integer :: compareTo);  // This ensures that the quadruplets are stored in a consistent order, making it easier to compare and eliminate duplicates later.
						st.add(temp);
					}
					// put the kth element into the hashset:
					hashset.add((long) arr[k]);
				}
				
			}
		}
		
		
		List<List<Integer>> ans = new ArrayList<>(st);
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
		int n = arr.length;
		int target = 9;
		List<List<Integer>> ans = fourier(arr,n, target);
		System.out.println("The quadruplets are: ");
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
