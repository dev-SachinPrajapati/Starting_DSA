package BinarySearch;


//Optimal Solution
public class MinRotatedSortedArraySol2 {

	 public static int findMini(int []arr) {
	        // Write your code here.
	        int n = arr.length;
	        int low = 0, high = n-1;
	        int ans = Integer.MAX_VALUE;

	        while(low<=high){
	            int mid = (low + high)/2;

//	            if(arr[low]<= arr[high]){
//	                ans = Math.min(ans, arr[low]);
//	                break;
//	            }
	        
	            if(arr[low]<= arr[mid]){ 
	                ans = Math.min(ans, arr[low]);
	                low = mid+1;
	            }
	            else{
	                ans = Math.min(ans, arr[mid]);
	                high= mid-1;
	            }
	        }
	    return ans;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {7,8,1,2,3,4,5,6};
		int ans = findMini(arr);
		System.out.println("The minimum element is: " + ans);

	}

}
