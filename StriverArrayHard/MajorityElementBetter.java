package StriverArrayHard;

import java.util.*;
public class MajorityElementBetter {
		
		public static List<Integer> majorele(int arr[]){
			int n = arr.length;
			List<Integer> ls = new ArrayList<>(); 
			Map<Integer, Integer> mpp = new HashMap<>();
			int mini = (n/3) + 1; //Minimum
				for(int i=0;i<n;i++) {
					int value = mpp.getOrDefault(arr[i], 0);
					mpp.put(arr[i],value+1);
					   //checking if v[i] is
		            // the majority element:
					if(mpp.get(arr[i]) == mini) {
						ls.add(arr[i]);
					}
					if(ls.size() == 2) break;
			}
			
			return ls;
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,1,1,2,3,3,3,3};
		List<Integer> ans = majorele(arr);
		System.out.print("The Majority Element are: ");
		for(int i=0;i<ans.size();i++) {
			System.out.print(ans.get(i) + " ");
		}
		System.out.println();

	}

}
