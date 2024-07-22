package RecursionInJava;

import java.util.List;
import java.util.ArrayList;

public class Lec7P2 {
	 public boolean sequence(int ind, List<Integer> ds,int s, int sum, int arr[], int n) {
		   
	        if (ind == n) {
	        	if(s == sum) {
	        		for(int it:ds) {
	        		 System.out.print(it + " ");	
	        		}
	        		System.out.println();
	        		return true;
	        	}
	        	else return false;
	        }
	 
	        // Take
	     
	        ds.add(arr[ind]);
	        s +=arr[ind];
	       if( sequence(ind + 1, ds,s,sum,arr,n)) {
	    	   return true;
	       }
	        
	        //Remove
	        ds.remove(ds.size()-1);
	        s-=arr[ind];
	        if( sequence(ind+1,ds,s,sum,arr,n)) {
	        	return true;
	        }
	        return false;
	       
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lec7P2 l7 = new Lec7P2();
        int[] arr = {1, 2, 1};
        int n = 3;
        int sum = 2;
        List<Integer> ds = new ArrayList<>();
        l7.sequence(0, ds,0,sum, arr, n);

	}

}
//OUTPUT: 1 1