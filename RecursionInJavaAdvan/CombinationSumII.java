package RecursionInJavaAdvan;

import java.util.*;

public class CombinationSumII {
	public static void findCombination(int index, ArrayList<Integer> arr, int target, ArrayList<ArrayList<Integer>> ans,
			List<Integer> ds) {
		if (target == 0) {
			ans.add(new ArrayList<>(ds));
			return;
		}

		for (int i = index; i < arr.size(); i++) {
			if (i > index && arr.get(i).equals(arr.get(i - 1))) {
				continue;
			}
			if (arr.get(i) > target) {
				break;
			}

			ds.add(arr.get(i));
			findCombination(i + 1, arr, target - arr.get(i), ans, ds);
			ds.remove(ds.size() - 1);
		}
	}

	public static ArrayList<ArrayList<Integer>> combinationSum2(ArrayList<Integer> arr, int n, int target) {
		// Write your code here.
		Collections.sort(arr);
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		ArrayList<Integer> ds = new ArrayList<>();
		findCombination(0, arr, target, ans, ds);
		return ans;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 6, 7 };
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int num : arr) {
			arrayList.add(num);
		}

		int target = 7;
		int n = arr.length;
		CombinationSumII sol = new CombinationSumII();
		List<ArrayList<Integer>> ls = sol.combinationSum2(arrayList,n, target);
		System.out.println("Combinations are: ");
		for (List<Integer> combination : ls) {
			for (int num : combination) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}

}
