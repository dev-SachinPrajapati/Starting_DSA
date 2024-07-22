package BinaryinAnswer;

public class Koko_Eating_Banana_Optimal {
	public static int findMax(int[] v) {
		int maxi = Integer.MIN_VALUE;
		int n = v.length;
		// find the maximum

		for (int i = 0; i < n; i++) {
			maxi = Math.max(maxi, v[i]);
		}
		return maxi;
	}

	public static int calculateTotalHours(int v[], int hourly) {
		int totalHour = 0;
		int n = v.length;

		for (int i = 0; i < n; i++) {
			totalHour += Math.ceil((double) v[i] / (double) hourly);
		}

		return totalHour;
	}

	public static int minimumRateToEatBananasO(int[] v, int h) {
		// Write Your Code Here
		int low = 1, high = findMax(v);

		while (low <= high) {
			int mid = (low + high) / 2;
			int totalH = calculateTotalHours(v, mid);
			if (totalH <= h) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return low;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int[] v = {4,9,4,3,1,3};
        int h = 66;
        int ans = minimumRateToEatBananasO(v, h);
        System.out.println("Koko should eat at least " + ans + " bananas/hr.");

	}

}
