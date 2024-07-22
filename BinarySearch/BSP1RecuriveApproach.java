package BinarySearch;

public class BSP1RecuriveApproach {

	public static int binarySearch(int nums[], int low,  int high, int target){
        // int n = nums.length;
        // int low = 0, high = n-1;
        int mid = (low + high) /2;
        if (low > high) return -1;
        if(nums[mid] == target) return mid;
        else if(nums[mid] < target) return binarySearch(nums,mid+1, high,target);
        return binarySearch(nums,low, mid-1, target);
    }
	public static int searchs(int []nums, int target) {
        int n = nums.length;
        return binarySearch(nums, 0, n-1, target);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3, 4, 6, 7, 9, 12, 16, 17};
		int target = 6;
		int ind  = searchs(nums, target);
		if(ind == -1) {
			System.out.println("The target is not present.");
		}
		else {
			System.out.println("The target is at index: " + ind);
		}
	}

}
