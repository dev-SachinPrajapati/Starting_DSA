package BinaryinAnswer;
import java.util.*;
public class Koko_Eating_Banana {
	
	public static int findMax(int []v) {
		int maxi = Integer.MIN_VALUE;
		int n = v.length;
		//find the maximum
		
		for(int i=0;i<n;i++) {
			maxi = Math.max(maxi,v[i]);
		}
		return maxi;
	}

	
	public static int calculateTotalHours(int v[], int hourly) {
		int totalHour = 0;
		int n = v.length;
		
		for(int i=0;i<n;i++) {
			totalHour += Math.ceil((double)v[i]/ (double) hourly);
		}
		
		return totalHour;
	}
	
	public static int minimumRateToEatBananas (int []v, int h) {
		int maxi = findMax(v);
		
		for(int i=1;i<maxi;i++) {
			int requiredTime = calculateTotalHours(v,i);
			if(requiredTime <= h) {
				return i;
			}
		}
		return maxi;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] v = {3,4,7,11,15};
	        int h = 8;
	        int ans = minimumRateToEatBananas(v, h);
	        System.out.println("Koko should eat at least " + ans + " bananas/hr.");

	}

}
