package StriverArray;

public class ArrayP2Better {
	public static void getElement(int arr[], int n) {
		if (n == 0 || n==1)
		{
			System.out.print(-1);
			System.out.print(" ");
			System.out.print(-1);
			System.out.print("\n");
		}
		int small = Integer.MAX_VALUE;
		int second_small = Integer.MAX_VALUE;
		int large = Integer.MIN_VALUE;
		int second_large = Integer.MIN_VALUE;
		
		//For largest
		for(int i=0;i<n;i++) {
			small = Math.min(small, arr[i]);
			large = Math.max(large, arr[i]);
		}
		
		//For Second largest
		for(int i=0;i<n;i++) {
			if(arr[i] < second_small && arr[i] != small) {
				second_small = arr[i];
			}
			if(arr[i] > second_large && arr[i] != large) {
				second_large = arr[i];
			}
		}
		System.out.println("Second Smallest is :" +second_small );
		System.out.println("Second Largest is :" +second_large );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,7,7,5};
		int n =arr.length;
		ArrayP2Better.getElement(arr, n);
	}

	/*Time Complexity: O(N), We do two linear traversals in our array
	  Space Complexity: O(1)*/
}
