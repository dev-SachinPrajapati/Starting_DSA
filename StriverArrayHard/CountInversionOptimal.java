package StriverArrayHard;
import java.util.*;
public class CountInversionOptimal {
	   public static int merge(int a[], int low, int mid, int high){
	        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
	        int left = low;
	        int right =mid+1;
	         //Modification 1: cnt variable to count the pairs:
	        int cnt = 0;

	        //storing elements in the temporary array in a sorted manner//
	        while (left <=mid && right<=high)    {
	            if (a[left] <= a[right]) {
	                temp.add(a[left]);
	                left++;
	            }
	            else{
	                  temp.add(a[right]);
	                  cnt += (mid - left+1);  //Modification 2
	                  right++;
	            }

	        }
	 // if elements on the left half are still left //
	    while (left <= mid) {
	            temp.add(a[left]);
	            left++;
	        }
	    
	     //  if elements on the right half are still left 
	      while (right <= high) {
	            temp.add(a[right]);
	            right++;
	        }
	 // transferring all elements from temporary to arr 
	    for(int i =low;i<=high;i++){
	        a[i] = temp.get(i - low);
	        }
	    return cnt;  // Modification 3
	    }
	      public static int mergeSort(int []a, int low, int high) {
	          int cnt = 0;
	          if(low>=high) return cnt;
	          int mid = (low + high)/2;
	          cnt += mergeSort(a, low, mid);
	          cnt += mergeSort(a, mid+1, high);
	          cnt += merge(a, low, mid, high);

	        return cnt;

	      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {5, 4, 3, 2, 1};
		int n = arr.length;
		int ans =  mergeSort(arr, 0, n - 1);
		System.out.println("The number of inversions is: " + ans);
	}

}
