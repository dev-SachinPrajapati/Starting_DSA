package StriverArray;

public class ArrayP6 {
	public static void Rotatetoright(int arr[], int n, int k) {
		if(n==0) return;
		k = k % n;  //this is beacuse of we want to reduce the value of k less than n
		if(k>n) return;
		int[] temp = new int[k];  //created the temp array
		
		for (int i = n - k, j = 0; i < n; i++, j++) {  //this is because of we want to get store the the initial temp value
		    temp[j] = arr[i];
		}
		
		//This is we are doing for shifting the element
		for(int i=n-k-1;i>=0;i--) {
			arr[i+k]  = arr[i];
		}
		
		//this is for to push back arr from temp array
		for(int i=0;i<k;i++) {
			arr[i]  = temp[i];
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int arr[] = {1,2,3,4,5,6,7};
		int k = 2;
		ArrayP6.Rotatetoright(arr, n, k);
		System.out.println("After Rotating the elements to right ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
			}
	}

}
