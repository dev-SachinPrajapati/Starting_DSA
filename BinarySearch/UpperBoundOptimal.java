package BinarySearch;

public class UpperBoundOptimal {

	public static int upperBound(int []arr, int x, int n){
        // Write your code here.
        int low = 0, high = n-1;
        int ans = n;
        while(low<=high){
            int mid = (low + high) / 2;

            if(arr[mid] > x){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int arr[] = {3, 5, 8, 15, 19};
		int n = 5, x = 9;
		int ind = upperBound(arr, n, x);
		System.out.println("The lower bound is the index: " + ind);
	}

}
