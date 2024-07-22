package StriverArray;

import java.util.ArrayList;

public class ArrayP10Optimal {
	public static ArrayList<Integer> FindInterOP(int arr1[], int arr2[], int n1, int n2) {
		int i=0, j=0;
		ArrayList<Integer> Inter = new ArrayList<>();
		while(i<n1 && j<n2) {
			if(arr1[i]< arr2[j]) {  //please move because you don't have partner in the n2 array
				i++;
			}
			else if(arr2[j]< arr1[i]) {
				j++;
			}
			else {  // you got partner
				Inter.add(arr1[i]);
				i++;
				j++;
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
		ArrayList<Integer> Uni = ArrayP10Optimal.FindInterOP(arr1,arr2, n1, n2);
		for (int val:Uni) {
            System.out.print(val + " ");
        }
        System.out.println("");
	}
		// TC:  O(n1 + n2)
		// SC:  O(1) minimum
}
