package RecursionInJava;


import java.util.List;
import java.util.ArrayList;

public class Lec7P3 {
	 public int sequence(int ind, int s, int sum, int arr[], int n) {
	        if (ind == n) {
	        	if(s == sum) {	
	        		return 1;
	        	}
	        	else return 0;
	        }
	 
	        // Take
	        s +=arr[ind];
	      int l = sequence(ind + 1,s,sum,arr,n);
	       
	        //Remove
	        s-=arr[ind];
	       int r =  sequence(ind+1,s,sum,arr,n);
		return l+ r; 
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lec7P3 l7 = new Lec7P3();
        int[] arr = {1, 2, 1};
        int n = 3;
        int sum = 2;
        System.out.println(l7.sequence(0, 0,sum, arr, n));

	}

}

//OUTPUT: 2