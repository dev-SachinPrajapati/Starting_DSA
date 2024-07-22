package StriverArray;

import java.util.ArrayList;

public class ArrayP10Brute {
		public static ArrayList<Integer> FindInter(int arr1[], int arr2[], int n1, int n2) {
			ArrayList<Integer> Inter = new ArrayList<>();
			int vis[] = new int[n2];  // Java Index bound error and initilize error
			for(int i=0;i<n1;i++) {
				for(int j=0;j<n2;j++) {
					if(arr1[i] == arr2[j] && vis[j] == 0) {
						Inter.add(arr1[i]);
						vis[j] = 1;
						break;
					}
			
					if(arr2[j] > arr1[i]) break;
				}
				
			}
			
			return Inter;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int arr2[] = {2, 3, 4, 4, 5, 11, 12};
		int n1 = 10;
		int n2 = 7;
		ArrayList<Integer> Uni = ArrayP10Brute.FindInter(arr1,arr2, n1, n2);
		for (int val:Uni) {
            System.out.print(val + " ");
        }
        System.out.println("");
        
	}

	// TC:  O(n1 * n2)
	// SC:  O(n2) minimum
}
