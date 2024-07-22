package StriverArray;
import java.util.Arrays;
public class ArrayP2Brute {
	public static void getElement(int[]arr, int n) {
		if(n == 0 || n == 1) {
			System.out.println(-1);
			System.out.println(" ");
			System.out.println(-1);
			System.out.print("\n");
		}
		
		Arrays.sort(arr);
		int small = arr[1];
		int large = arr[n-2];
		System.out.println("Second smallest is: "+small);
		System.out.println("Second largest is: "+large);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 4, 6, 7, 5};
		int n = arr.length;
		ArrayP2Brute.getElement(arr, n);
	/*Time Complexity: O(NlogN), For sorting the array

	Space Complexity: O(1)*/

	}

}
