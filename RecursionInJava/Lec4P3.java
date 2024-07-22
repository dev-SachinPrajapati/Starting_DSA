package RecursionInJava;

public class Lec4P3 {

	public static int[] reverseArray(int n, int[] nums) {
		// Iterate through the array and reverse it
		for (int i = 0; i < n / 2; i++) {
			int temp = nums[i];
			nums[i] = nums[n - i - 1];
			nums[n - i - 1] = temp;
		}
		return nums;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3, 4, 5 };
		int n = nums.length;
		
		// Call the reverseArray function
		int[] reversedArray = reverseArray(n, nums);

		// Print the reversed array
		for (int num : reversedArray) {
			System.out.print(num + " ");
		}
	}

}
