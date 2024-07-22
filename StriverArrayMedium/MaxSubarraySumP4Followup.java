package StriverArrayMedium;

public class MaxSubarraySumP4Followup {
	//This is Follow up question of the Max SubArray Sum
	//Here we have to print the Max SubArray Sum
	
	public static long maxSub(int arr[], int n) {
		long maxi  = Long.MIN_VALUE;
		int sum = 0;
		int start = 0;
		int ansstart = -1, ansend = -1;
		for(int i=1;i<n;i++) {
			if(sum==0) start = i;  //Because when I new Subarray start it will always start 0
			sum += arr[i];
			if(sum>maxi) {
				maxi = sum;
				ansstart =  start;   //Because of when ansstart it will start from start
				ansend = i;         // it depend on where is i 
			}
			 // If sum < 0: discard the sum calculated
			if(sum< 0) {
				sum = 0;
			}
		}
		
		 //printing the subarray:
		System.out.print("[");
		for(int i =ansstart;i<=ansend;i++) {
				System.out.print(arr[i] + " ");
		}
		System.out.print("] ");

		return maxi;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		int n = arr.length;
        long ans = maxSub(arr,n);
        System.out.println("The maximum subarray sum is: " + ans);

	}

}
