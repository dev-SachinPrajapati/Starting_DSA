package StriverArrayMedium;


public class TWOSUMP1Brute {
		public static String twosum(int arr[], int n, int target) {
			for(int i=0;i<n;i++) {
				for(int j=i+1;j<n;j++) {	
				if(arr[i] + arr[j] == target) {
					return "Yes";
					}
				}
			}
		return "NO";
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,6,5,8,11};
		int n = arr.length;
		int tar = 15;  //No
//		int tar = 14; //Yes
		
		String ans = TWOSUMP1Brute.twosum(arr, n,tar);
		System.out.println("This is the Answer for variant 1:" + ans);

	}

}
