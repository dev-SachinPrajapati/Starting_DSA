package StriverArrayHard;

public class CountInversionBrute {
	
	public static int numberOfInversion(int []arr, int n) {
		int count = 0;
		for(int i=0;i<n;i++) {
			for(int j = i+1;j<n;j++) {
				if(arr[i]>arr[j]) count++;
			}
		}
				
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {5, 4, 3, 2, 1};
		int n = arr.length;
		int ans = numberOfInversion(arr,n);
		System.out.println("The number of inversions is: " + ans);
	}

}
