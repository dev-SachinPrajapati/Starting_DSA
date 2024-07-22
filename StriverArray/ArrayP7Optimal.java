package StriverArray;

//Moore's Voting Algo
public class ArrayP7Optimal {
		public static int[] moveelement(int arr[], int n) {
			//place the pointer j:
			int j = -1;
			for(int i=0;i<n;i++) {
				if(arr[i] == 0) {
					j=i;
					break;
				}
			}
			
			//no non-zero elements:
			if(j == -1) return arr;
			
			//Move the pointers i and j
	        //and swap accordingly:
			for(int i = j+1;i<n;i++) {
				if(arr[i] != 0) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j]  = temp;
					j++;
				}
			}
			return arr;
		}
	public static void main(String[] args) {
			int arr[] = {1,0,2,3,2,0,0,4,5,1};
//			int n = arr.length;
			int n = 10;
			int ans[]  = ArrayP7Optimal.moveelement(arr, n);
			for (int i = 0; i < n; i++) {
	            System.out.print(ans[i] + " ");
	        }
	        System.out.println("");
	}

}
