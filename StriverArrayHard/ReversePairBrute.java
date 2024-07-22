package StriverArrayHard;


public class ReversePairBrute {
	public static int reversePair(int arr[], int n) {
		int count = 0;
		for(int i=0;i<n;i++) {
			for(int j = i+1;j<n;j++) {
				if(arr[i] > 2*arr[j]) {
					count++;
				}
			}
		}
		return count;
	}
	public static int team(int skill[], int n) {
		return reversePair(skill,n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int arr[] = {40,25,19,9,6,2};
				int n = arr.length;
				
				int ans = team(arr,n);
				System.out.println("The Number of pair which is twice of element: " + ans);
	}

}
