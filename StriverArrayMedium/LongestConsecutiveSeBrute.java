package StriverArrayMedium;

import java.util.Arrays;

//Longest Consecutive Sequence
public class LongestConsecutiveSeBrute {
	public static int lingconsq(int arr[]) {
		int n = arr.length;
		if(n == 0) return 0;
		Arrays.sort(arr);
		
		int lastsmaller = Integer.MIN_VALUE;
		int longest = 1;
		int count = 0;
		
		
		for(int i=0;i<n;i++) {
			if(arr[i]-1 == lastsmaller) {
				count +=1;
				lastsmaller = arr[i];
			}
			else if(lastsmaller != arr[i]) {
				count = 1;
				lastsmaller = arr[i];
			}
			longest = Math.max(longest, count);
		}
		return longest;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a = {100, 200, 1, 2, 3, 4};
        int ans = lingconsq(a);
        System.out.println("The longest consecutive sequence is " + ans);
	}

}
