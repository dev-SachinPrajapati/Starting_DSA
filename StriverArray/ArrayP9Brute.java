package StriverArray;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


/*
 * HashMap:

HashMap is an implementation of a hash table, which provides constant-time (O(1)) average-case performance for basic operations like insertion, deletion, and retrieval.
It does not guarantee any specific order of its elements. The ordering of elements is based on the hash codes of the keys, and it might seem arbitrary.
If you iterate through the elements of a HashMap, you might observe a seemingly random order of elements.
LinkedHashMap:

LinkedHashMap is an extension of HashMap that maintains the order of elements based on their insertion order. It combines the hash table functionality with a doubly-linked list to preserve the order of insertion.
It still provides relatively fast access times for basic operations, but the iteration order will be the same as the insertion order.
This can be useful when you need to iterate through the elements in the order they were added.
In summary, if you want a data structure that provides quick access times but does not guarantee any specific order, you would use a HashMap. If you need to maintain the order of insertion and still have efficient access times, you would use a LinkedHashMap.
*/
public class ArrayP9Brute {
	public static ArrayList<Integer> union(int arr1[], int arr2[], int n1, int n2) {
		HashSet<Integer> intSet = new HashSet<>();
		ArrayList<Integer> unions = new ArrayList<>();
		for(int i=0;i<n1;i++) {
			intSet.add(arr1[i]);  //O(n1logn)
		}
		for(int i=0;i<n2;i++) {
			intSet.add(arr2[i]); //O(n2logn)
		}

		int i=0;
		for(int it: intSet) {	//O(n1+n2)
			unions.add(it);
		}
		return unions;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int arr2[] = {2, 3, 4, 4, 5, 11, 12};
		int n1 = 10;
		int n2 = 7;
		ArrayList<Integer> Uni = ArrayP9Brute.union(arr1,arr2, n1, n2);
		for (int val:Uni) {
            System.out.print(val + " ");
        }
        System.out.println("");
	}
	//TC:- O(n1logn) + O(n2logn) + O(n1+n2)
	//SC:- O(n1+n2) + O(n1+n2)  make sure that we return the output not  solve the problem

}
