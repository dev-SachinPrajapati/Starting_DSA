package BinarySearch;

//We can also use ArrayList
public class Single_ele_in_array_brute {

	public static int singleElement(int arr[], int n) {
		if(n == 1) return arr[0];
		for(int i=0;i<n;i++) {
			if(i == 0) {
				if(arr[i] != arr[i+1]) return arr[i];
			}
			else if(i == n-1) {
				if(arr[i] != arr[i-1]) return arr[i];
			}
			else { 
				if(arr[i] != arr[i+1] && arr[i] != arr[i-1]) return arr[i];
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,2,2,3,3,4,5,5};
		int n = arr.length;
		int ans = singleElement(arr,n);
		System.out.println("The single element is: " + ans);
		
	}

}
