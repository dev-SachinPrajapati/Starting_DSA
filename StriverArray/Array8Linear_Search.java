package StriverArray;

public class Array8Linear_Search {
		public static int linser(int arr[], int n, int findme) {
			for(int i=0;i<n;i++) {
				if(arr[i] == findme) {
					return i;
				}
			}
			return -1;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,0,2,3,2,0,0,4,5,1};
		int n = 10;
		int s = 4;
		int ans  = Array8Linear_Search.linser(arr, n,s);
		for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
	}

}
