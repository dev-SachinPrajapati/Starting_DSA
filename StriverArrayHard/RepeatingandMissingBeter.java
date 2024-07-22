package StriverArrayHard;
import java.util.*;
public class RepeatingandMissingBeter {
	public static int[] repeatandmissing(int arr[], int n) {
		int []hash = new int[n+1];

		//update the hash array:
		for(int i=0;i<n;i++) {
			hash[arr[i]]++;
		}
		//Find the repeating and missing number:
		int missing = -1;
		int repeating  = -1;
		for(int i=0;i<n;i++) {
			int count = 0;
			for(int j=0;j<=n-1;j++) {
				if(arr[j] == i) {
					count++;
				}
			}
			if(count == 2) repeating = i;
			else if(count == 0) missing = i;
		
		if(repeating != -1 && missing != -1) break;
		}
		int[] ans = {repeating, missing};
        return ans;
	
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,3,6,2,1,1,0};
		int n = arr.length;
		int []ans = repeatandmissing(arr,n);
		System.out.println("The repeating and missing numbers are: {" + ans[0] + ", " + ans[1] + "} ");
		
	}

}
