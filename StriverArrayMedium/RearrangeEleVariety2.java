package StriverArrayMedium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RearrangeEleVariety2 {
	public static ArrayList<Integer> rearrangebysign(ArrayList<Integer> arr, int n) {
		Collections.sort(arr); //Optional
		
		ArrayList<Integer> pos = new ArrayList<>();
		ArrayList<Integer> neg = new ArrayList<>();

		for (int i=0;i<n;i++) {
			// Segregate the array into positives and negatives.
			if(arr.get(i) >= 0) {
				pos.add(arr.get(i));
			}
			else {
				neg.add(arr.get(i));
			}
		}
		// If positives are lesser than the negatives.
		if(pos.size() < neg.size()) {
			
			for(int i=0;i<pos.size();i++) {
				arr.set(2*i, pos.get(i));
				arr.set(2*i+1, neg.get(i));
			}
			
			  // Fill the remaining negatives at the end of the array.
			int index = pos.size()*2;
			for(int i = pos.size();i<neg.size();i++) {
				arr.set(index,neg.get(i));
				index++;
			}
		}
		else {
			for(int i=0;i<neg.size();i++) {
				arr.set(2*i, pos.get(i));
				arr.set(2*i+1, neg.get(i));
			}
			 
			int index = neg.size()*2;
			for(int i = neg.size();i<pos.size();i++) {
				arr.set(index,pos.get(i));	
				index++;
			}
		}
		
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, -4, -5, 3, 4));
		int n = 6;
		ArrayList<Integer> ans = rearrangebysign(arr,n);
		for(int i=0;i<n;i++) {
			System.out.print(ans.get(i)+" ");
		}

	}

}
