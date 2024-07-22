package RecursionInJava;

import java.util.ArrayList;
import java.util.List;

public class Lec6 {
    public void sequence(int ind, List<Integer> ds,int arr[], int n) {
   
        if (ind == n) {
        	for(int it:ds) {
        		 System.out.print(it + " ");	
        	}
        	if(ds.size() == 0) {
        		System.out.print("{}");
        	}
        	System.out.println();
            return;
        }

        // Take
        sequence(ind + 1, ds,arr,n);
        ds.add(arr[ind]);
        
        //Remove
        sequence(ind+1,ds,arr,n);
        ds.remove(ds.size()- 1);
    }

    public static void main(String[] args) {
        Lec6 l6 = new Lec6();
        int[] arr = {3, 1, 2};
        int n = 3;
        List<Integer> ds = new ArrayList<>();
        l6.sequence(0, ds, arr, n);

    }
}

/*The Lec6 class is defined in the RecursionInJava package.

* The sequence method is a recursive function that takes the following parameters:

* ind: An integer representing the current index in the array.
* ds: A list of integers representing the current subsequence being generated.
* arr: An integer array containing the original array elements.
* n: An integer representing the size of the original array.
Inside the sequence method, the base case is checked. 
If ind is equal to n, it means we have reached the end of the array. 
In this case, the elements of the current subsequence are printed, and if the subsequence is empty, the empty braces {} are printed. 
Then, a new line is printed, and the method returns.

If the base case is not met, the recursion continues. First, the sequence method is called recursively with ind incremented by 1,
which means we exclude the current element from the subsequence (Remove step).

Then, the current element arr[ind] is added to the subsequence by calling ds.add(arr[ind]).

Next, the sequence method is called recursively again with ind incremented by 1,
which means we include the current element in the subsequence (Take step).

After the recursive call, we remove the last element from the subsequence using ds.remove(ds.size()-1) to backtrack and explore other possibilities.

In the main method, an instance of the Lec6 class is created.

An integer array arr is initialized with values {3, 1, 2}, and the size of the array n is set to 3.

An empty list ds is created to store the subsequences.

Finally, the sequence method is called with initial values ind = 0, ds, arr, and n to generate and print all possible subsequences of the array
*/
