package StriverArrayHard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementOptimal {
	public static List<Integer> majorele1(int arr[]){
			int n = arr.length;
			int count1 = 0, count2 = 0;
			int elem1 = Integer.MIN_VALUE;
			int elem2 = Integer.MIN_VALUE;
			for(int i=0;i<n;i++) {
								// check that elem2 not equal to arr[i]
				if(count1 == 0 && elem2 != arr[i]) {
					count1 = 1;
					elem1 = arr[i]; //imagine that the element we want in majority is arr[i]
				}
				else if(count2 == 0 && elem2 != arr[i]) {
					 	count2 = 1;
		                elem2 = arr[i];
				}
				else if(arr[i] == elem1) count1++;
				else if(arr[i] == elem2) count2++;
					
				else {
					 count1--;
		             count2--;
				}
				
			}
			  //List of Answer  
	        List<Integer> ls = new ArrayList<>();
	        count1 = 0; count2 = 0;
	        for(int i=0;i<n;i++) {
	        	if(arr[i] == elem1) count1++;
	        	if(arr[i] == elem2) count2++;
	        }
	        
	        //to return element what we have get from above code
	        int mini = (int)(n/3) + 1;
	        if(count1>= mini) ls.add(elem1);
	        if(count2>= mini) ls.add(elem2);
		return ls;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,1,1,2,2,2,2,2,3,3,3};
		List<Integer> ans = majorele1(arr);
		System.out.print("The Majority Element are: ");
		for(int i=0;i<ans.size();i++) {
			System.out.print(ans.get(i) + " ");
		}
		System.out.println();
	}

}
