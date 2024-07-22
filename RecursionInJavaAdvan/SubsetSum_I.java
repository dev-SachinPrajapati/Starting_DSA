package RecursionInJavaAdvan;

import java.util.*;

public class SubsetSum_I {
	public static void subsetSumsHelper(int index, int sum, int[] arr, int N, ArrayList<Integer> sumSubset) {

		// index come out of array so stop and
		// whatever subset sum get just store in sum variables
		if (index == N) {
			sumSubset.add(sum);
			return;
		}
		// Pick element
		subsetSumsHelper(index + 1, sum + arr[index], arr, N, sumSubset);

		// Do not pick the element
		subsetSumsHelper(index + 1, sum, arr, N, sumSubset);
	}

	public static ArrayList<Integer> subsetSum(int num[]) {
		ArrayList<Integer> sumSubset = new ArrayList<>();
		int N = num.length;
		subsetSumsHelper(0, 0, num, N, sumSubset);
		Collections.sort(sumSubset); // Use Collections.sort
		return sumSubset;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 1, 2 };
		int n = arr.length;
		ArrayList<Integer> ans = subsetSum(arr);
		Collections.sort(ans);
		System.out.println("The sum of each subset is ");
		for (int i = 0; i < ans.size(); i++)
			System.out.print(ans.get(i) + " ");
	}

}
