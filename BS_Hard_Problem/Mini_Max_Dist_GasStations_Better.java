package BS_Hard_Problem;

import java.util.*;

public class Mini_Max_Dist_GasStations_Better {

	public static class Pair {
		double first;
		int second;

		Pair(double first, int second) {
			this.first = first;
			this.second = second;
		}
	}

	public static double minimiseMaxDistance(int arr[], int k) {
		int n = arr.length; // size of array.
		int[] howMany = new int[n - 1];
		PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Double.compare(b.first, a.first));

		// insert the first n-1 elements into pq
		// with respective distance values:
		for (int i = 0; i < n - 1; i++) {
			pq.add(new Pair(arr[i + 1] - arr[i], i));
		}

		// Pick and place k gas stations:
		for (int gasStations = 1; gasStations <= k; gasStations++) {
			// Find the maximum section
			// and insert the gas station:

			Pair tp = pq.poll();
			int secInd = tp.second;

			// insert the current gas station:
			howMany[secInd]++;
		
			
			double inidiff  = arr[secInd + 1] - arr[secInd];
			double newSectionLen = inidiff / (double) (howMany[secInd] + 1);
			pq.add(new Pair(newSectionLen, secInd));
		}
		
		return pq.peek().first;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5 };
		int k = 4;
		double ans = minimiseMaxDistance(arr, k);
		System.out.println("The answer is: " + ans);

	}

}
