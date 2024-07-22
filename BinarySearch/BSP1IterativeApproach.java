package BinarySearch;

public class BSP1IterativeApproach {
	public static int search(int []nums, int target) {
        // Write your code here.
        int n = nums.length;
        int low = 0, high = n-1;
        while(low<=high){
            int mid = (low + high) /2;

            if(nums[mid] == target) return mid;

            else if(nums[mid] > target) return high = mid-1 ;
            
            else low = mid+1;
        }
        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3, 4, 6, 7, 9, 12, 16, 17};
		int target = 6;
		int ind  = search(nums, target);
		if(ind == -1) {
			System.out.println("The target is not present.");
		}
		else {
			System.out.println("The target is at index: " + ind);
		}
	} 

}
