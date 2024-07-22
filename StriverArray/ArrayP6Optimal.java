package StriverArray;

public class ArrayP6Optimal {
	public static void reverse(int arr[], int start, int end) {
		while(start<=end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	public static void Rotatetoright(int arr[], int n, int k) {
		reverse(arr, 0,n-k-1);  //reverse till d
		reverse(arr, n-k,n-1); // reverse after d
		reverse(arr, 0,n-1);  // reverse whole array
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int arr[] = {1,2,3,4,5,6,7};
		int k = 2;
		ArrayP6Optimal.Rotatetoright(arr, n, k);
		System.out.println("After Rotating the elements to right ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
			}
	}

}
