package StriverArrayMedium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RearrangeEleOptimal {
	public static ArrayList<Integer> rearrangeElement(ArrayList<Integer> arr, int n) {
       
		// Define array for storing the ans separately.
		ArrayList <Integer> ans = new ArrayList<>(Collections.nCopies(n, 0));
		
		
		// positive elements start from 0 and negative from 1.
		int posIndex  = 0, negIndex = 1; 
		for(int i=0;i<n;i++) {
			
			// Fill negative elements in odd indices and inc by 2.
			if(arr.get(i) <0) {
				ans.set(negIndex,arr.get(i));
				negIndex +=2;
			}
			
			// Fill positive elements in even indices and inc by 2.
			else {
				ans.set(posIndex, arr.get(i));
				posIndex += 2;
				
			}
		}
		
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, -4, -5));
		int n = arr.size();
		ArrayList<Integer> ans = rearrangeElement(arr,n);
		for(int i=0;i<n;i++) {
			System.out.print(ans.get(i)+" ");
		}
	}

}
