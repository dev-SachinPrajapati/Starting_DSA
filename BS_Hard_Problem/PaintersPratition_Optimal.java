package BS_Hard_Problem;

import java.util.*;

public class PaintersPratition_Optimal {
	public static int countPainter(ArrayList<Integer> boards, int pages) {
		int n = boards.size();
		int painter = 1;
		long boardPainter = 0;

		for (int i = 0; i < n; i++) {
			if (boardPainter + boards.get(i) <= pages) {
				boardPainter += boards.get(i);
			} else {
				painter++;
				boardPainter = boards.get(i);
			}
		}
		return painter;
	}

	public static int findLargestMinDistance(ArrayList<Integer> boards, int k) {
		// Write your code here.
		// Write Your Code Here
		int low = Collections.max(boards);
		int high = boards.stream().mapToInt(Integer::intValue).sum();

		// for (int i = 0; i < a.length; i++) {
		// low = Math.max(low, a.get(i));
		// high += a.get(i);
		// }

		while (low <= high) {
			int mid = (low + high) / 2;

			if (countPainter(boards, mid) > k) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return low;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> boards = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
		int k = 2;
		int ans = findLargestMinDistance(boards, k);
		System.out.println("The answer is: " + ans);

	}

}
