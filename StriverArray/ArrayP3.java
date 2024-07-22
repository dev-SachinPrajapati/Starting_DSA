package StriverArray;

public class ArrayP3 {
	public static boolean isSorted(int arr[], int n) {
		for(int i=1;i<n;i++) {
			if(arr[i] < arr[i-1]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = {1,4,8,5,5,3,7};
		int arr[] = {1,2,2,3,4,4};
		int n = arr.length;
	 System.out.println(ArrayP3.isSorted(arr,n));
	}
	/*TC: O(N) AND SC:- O(1)*/
}
