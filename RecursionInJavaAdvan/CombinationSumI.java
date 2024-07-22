package RecursionInJavaAdvan;

import java.util.*;

public class CombinationSumI {
	public static void findCombinations(int index, int arr[], int target, List<List<Integer>> ans, List<Integer> ds) {
		if (index == arr.length) {
			if (target == 0) {
				ans.add(new ArrayList<>(ds));
			}
			return;
		}
		// pick conditions
		if (arr[index] <= target) {
			ds.add(arr[index]);
			findCombinations(index, arr, target - arr[index], ans, ds);
			ds.remove(ds.size() - 1);
		}
		// and not pick
		findCombinations(index + 1, arr, target, ans, ds);
	}

	public static List<List<Integer>> combSum(int[] ARR, int B) {
		// Write your code here.
		List<List<Integer>> ans = new ArrayList<>();
		Arrays.sort(ARR);
		findCombinations(0, ARR, B, ans, new ArrayList<>());
		return new ArrayList<>(ans);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 3, 6, 7 };
		int target = 7;
		CombinationSumI sol = new CombinationSumI();
		List<List<Integer>> ls = sol.combSum(arr, target);
		System.out.println("Combinations are: ");
		for (int i = 0; i < ls.size(); i++) {
			for (int j = 0; j < ls.get(i).size(); j++) {
				System.out.print(ls.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}

}
