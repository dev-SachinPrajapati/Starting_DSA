package BinarySearch;

import java.util.ArrayList;

public class FindFirstandLastBinarySearch {

	public static int firstOccurance(int []nums, int n, int target) {
        int low = 0, high = n-1;
        int first  = -1;
        while(low<=high){
            int mid = (low + high) /2;

            if(nums[mid] == target) {
            	first = mid;
            	high = mid-1;
            }

            else if(nums[mid] < target) {
            	low = mid+1;
            }
            
            else high = mid-1;
        }
        return first;
    }
	
	public static int lastOcuurance(int []nums, int n, int target) {

        int low = 0, high = n-1;
        int last = -1;
        while(low<=high){
            int mid = (low + high) /2;

            if(nums[mid] == target) {
            	last = mid;
            	low = mid+1;
            }

            else if(nums[mid] < target) {
            	low = mid+1;
            }
            
            else high = mid-1;
        }
        return last;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     int nums[] = {2,8,8,8,8,8,11,13};
		 int n = nums.length;
		 int k = 11;
		 int firstOccur = firstOccurance(nums,n,k);
		 int lastOccur = lastOcuurance(nums,n,k);
		 System.out.println("First Occurrence: " + firstOccur);
	     System.out.println("Last Occurrence: " + lastOccur);
	}

}
