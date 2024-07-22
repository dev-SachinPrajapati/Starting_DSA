package BinaryinAnswer;

public class Smallest_Divisor_Given_a_Threshold {
		
	public static int small_div(int []arr, int limit) {
		int n = arr.length;
		
		 //Find the maximum element:
		int maxi = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			maxi = Math.max(maxi, arr[i]);
		}
		
		
		  //Find the smallest divisor:
		
		for(int d=1;d<=maxi;d++) {
			 //Find the summation result:
			int sum = 0;
			for(int i=0;i<n;i++) {
				sum += Math.ceil((double)(arr[i]) / (double)(d));
			}
			 if (sum <= limit) { return d;}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {1, 2, 3, 4, 5};
	     int limit = 8;
	     int ans = small_div(arr,limit);
	     System.out.println("The minimum divisor is: " + ans);
	}

}
