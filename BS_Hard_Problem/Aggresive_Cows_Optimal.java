package BS_Hard_Problem;

public class Aggresive_Cows_Optimal {
	public static boolean canWePlace(int stalls[], int dist, int cows) {
		int countCows = 1, LastCows = stalls[0];
		int n = stalls.length;
		for (int i = 1; i < n; i++) {
			if (stalls[i] - LastCows >= dist) {
				countCows++;
				LastCows = stalls[i];
			}
		}
		if (countCows >= cows) {
			return true;
		}
		return false;
	}

	public static int aggressiveCows(int stalls[], int cows) {
		int n = stalls.length;
		int low = 0, high = stalls[n - 1] - stalls[0];

		while (low <= high) {
			int mid = (low + high) / 2;
			if (canWePlace(stalls, mid, cows) == true) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return high;
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int[] stalls = { 0, 3, 4, 7, 10, 9 };
		int k = 4;
		int ans = aggressiveCows(stalls, k);
		System.out.println("The maximum possible minimum distance is: " + ans);

	}

}
