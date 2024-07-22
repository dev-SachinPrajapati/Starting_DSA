package BinarySearch;

public class Kth_missing_Brute {
		public static int KthMissingPlace(int vec[], int n, int k) {
			for(int i=0;i<n;i++) {
				if(vec[i] <= k) {
					k++;
				}
				else break;
			}
			return k;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vec[] = {4, 7, 9, 10};
		int n = 4, k = 4;
		int ans = KthMissingPlace(vec,n,k);
		System.out.println(	"The missing number is: " +ans);
	}

}
