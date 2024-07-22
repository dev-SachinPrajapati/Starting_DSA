package BinarySearch;

public class Kth_missing_Optimal {
	public static int missingK(int[] vec, int n, int k) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int missing = vec[mid] - (mid + 1);
            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return k + high + 1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vec[] = {1,2,3,4,6,9,10};
		int n = vec.length, k = 5;
		int ans = missingK(vec,n,k);
		System.out.println(	"The missing number is: " +ans);
	}

}
