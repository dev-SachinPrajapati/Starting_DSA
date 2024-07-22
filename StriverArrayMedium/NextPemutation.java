package StriverArrayMedium;

import java.util.*;
public class NextPemutation {
	public static List<Integer> nextGreaterPermutation(List<Integer> arr){
		int n = arr.size();
		
		// Step 1: Find the break point:
		int ind = -1;
		for(int i = n-2;i>=0;i--) {
			if(arr.get(i) <arr.get(i+1)) {
				ind = i;
				break;
			}
		}
        // If break point does not exist:
        if (ind == -1) {
            // reverse the whole array:
            Collections.reverse(arr);
            return arr;
        }
     // Step 2: Find the next greater element
        //         and swap it with arr[ind]:
        
        for(int i=n-1;i>ind;i--) {
        	if(arr.get(i)> arr.get(ind)) {
        		int temp = arr.get(i);  //For list we use get and set
        		arr.set(i,arr.get(ind));
        		arr.set(ind, temp);
        		break;
        	}
        }
        List<Integer> sublist = arr.subList(ind + 1, n);
        Collections.reverse(sublist);

        return arr;
        
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = Arrays.asList(new Integer[] {2, 1, 5, 4, 3, 0, 0});
		List<Integer> ans = nextGreaterPermutation(arr);
		 System.out.print("The next permutation is: [");
	        for (int i = 0; i < ans.size(); i++) {
	            System.out.print(ans.get(i) + " ");
	        }
	        System.out.println("]");
	}

}
