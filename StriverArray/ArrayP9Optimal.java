package StriverArray;

import java.util.ArrayList;

public class ArrayP9Optimal {

	//2 Pointer Array
	static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n1, int n2){
		int i=0, j=0;
		ArrayList<Integer> Union  = new ArrayList<>();
		while(i<n1 && j<n2) {
			if(arr1[i] <= arr2[j]) { // Case 1 and 2
				//It state last element of array is not equal to current array, So take it back
				if(Union.size() == 0 || Union.get(Union.size()-1) != arr1[i]) {
					Union.add(arr1[i]);
					 // but you have to increment because you take element or it means it is equal to inside union array
				}
				i++;
			}
			else {  // means other element is array is smaller
				if(Union.size() == 0 || Union.get(Union.size()-1) != arr2[j]) {
					Union.add(arr2[j]);
					 // but you have to increment because you take element or it means it is equal to inside union array
				}
				j++;
			}
		}
		
		// IF any element left in arr1
		while(i<n1) {
			if(Union.get(Union.size()-1) != arr1[i]) {
				Union.add(arr1[i]);
				 // but you have to increment because you take element or it means it is equal to inside union array
			}
			i++;
		}
		// If any elements left in arr2
		while(j<n2) {
			
			if( Union.get(Union.size()-1) != arr2[j]) {
				Union.add(arr2[j]);
				 // but you have to increment because you take element or it means it is equal to inside union array
			}
			j++;
		}
		
		
		
		return Union;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int arr2[] = {2, 3, 4, 4, 5, 11, 12};
		int n1 = 10;
		int n2 = 7;
		ArrayList<Integer> Uni = ArrayP9Optimal.FindUnion(arr1,arr2, n1, n2);
		for (int val:Uni) {
            System.out.print(val + " ");
        }
        System.out.println("");
        
        // TC:- O(n1 + n2)
        //SC:- O(n1 + n2) make sure that we return the output not  solve the problem
	}

}
