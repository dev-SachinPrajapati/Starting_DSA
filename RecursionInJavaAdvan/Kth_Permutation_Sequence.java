package RecursionInJavaAdvan;

import java.util.*;

// Problem Link
//https://www.codingninjas.com/studio/problems/k-th-permutation-sequence_1112626?leftPanelTab=1
public class Kth_Permutation_Sequence {
	 //Here we have n and k
    public static String kthPermutation(int n, int k) {
        // Write your code here.
        //now we have to find factorial because we have that the n! will no of Permutation
        int fact = 1;

        java.util.List<Integer> number = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            fact = fact * i;
            number.add(i);
        }
        // also add n because when we try with all element
        number.add(n);

        // now we have to return the answer in string
        String ans = "";

        //this is because we started indexing with 0 
         k = k - 1;
        while (true) {

            // our formula to find
            //eg  if k = 4 means  k = 4/2 = 2 to get next index number
            ans = ans + number.get( k / fact); 

            //now the index is used just remove here 4 
            number.remove(k / fact);
            
            //this is when at the end there is no element left 
            if(number.size() == 0){
                break;
            }

            // to get next value of
            k = k % fact;

            //this is beacuse when we eg. first get 24 then next i got 6 then 2 then 1
            // just factoril of 4!, 3!, 2!, 1!; 
            fact = fact / number.size();
        }
        return ans;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 3, k = 3;
	        String ans = kthPermutation(n, k);
	        System.out.println("The Kth permutation sequence is " + ans);
	}

}
