package BS_Hard_Problem;

import java.util.*;

public class Aggresive_Cows_Brute {

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

	public static int aggressiveCows(int stalls[], int k) {
		int n = stalls.length;
		Arrays.sort(stalls);

		int limit = stalls[n - 1] - stalls[0];
		for (int i = 1; i <= limit; i++) {
			if (canWePlace(stalls, i, k) == false) {
				return (i - 1);
			}
		}
		return limit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] stalls = { 0, 3, 4, 7, 10, 9 };
		int k = 4;
		int ans = aggressiveCows(stalls, k);
		System.out.println("The maximum possible minimum distance is: " + ans);

	}

}
