package BinarySearch;

import java.util.ArrayList;

public class FindFirstandLastOccuranceOptimal {
	public static int lowerBound(int[] arr, int n, int x) {
		// Write your code here
		int low = 0, high = n - 1;
		int ans = n;
		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] >= x) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;
	}

	public static int upperBound(int[] arr, int n, int x) {
		// Write your code here.
		int low = 0, high = n - 1;
		int ans = n;
		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] > x) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;
	}

	public static ArrayList<Integer> answer(int arr[],int n, int key) {
			int lb = lowerBound(arr,n,key);
			if(lb == n || arr[lb] != key) {// This state that if lb goes to last index or key(x) not found 
				
				ArrayList<Integer> result = new ArrayList<>();
				result.add(-1);
				result.add(-1);
				return result;
			}
			int up = upperBound(arr,n,key);
			 ArrayList<Integer> result = new ArrayList<>();  //This for if uper condition fails then  I get my first and Last Occurance
			 result.add(lb);
		     result.add(up - 1);
		     return result;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int key = 13;
		int[] arr = { 3, 4, 13, 13, 13, 20, 40 };
		ArrayList<Integer> result = answer(arr, n, key);
        System.out.println(result);

	}

}
