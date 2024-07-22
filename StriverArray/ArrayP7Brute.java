package StriverArray;

import java.util.ArrayList;

public class ArrayP7Brute {

	public static int[] moveend(int arr[], int n) {
		ArrayList<Integer> temp = new ArrayList<>();
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				temp.add(arr[i]);
			}
		}
		// number of non-zero elements.
        int nz = temp.size();
		for(int i=0; i<nz;i++) {
			arr[i] = temp.get(i);
		}
		
		for(int i=nz;i<n;i++) {
			arr[i] = 0;
		}
		return arr;
	}
	//Moves Zero at the end
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,0,2,3,2,0,0,4,5,1};
		int n =10;
		int [] ans = moveend(arr,n);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}}
	


