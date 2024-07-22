package StriverArray;

public class ArrayP4 {	
	//Remove duplicates from Sorted Array
	//optimal Solution
	public static int remove_dup(int arr[]) {
		int i=0;
		for(int j=1;j<arr.length;j++) {
			if(arr[i] != arr[j]) {
				i++;
				arr[i] = arr[j];
			}
		}
		return i+1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,5,5,4,4,9,9};
		int a = ArrayP4.remove_dup(arr);
		for(int i=0;i<a;i++) {
			System.out.print(arr[i] + " ");	
		}
		
	}
	
	//TC:- O(N) AND SC:- O(1)
}

/*The input array is assumed to be sorted since the code's objective is to remove duplicates from a sorted array.

The function remove_dup takes the sorted array as input and returns the length of the array after removing duplicates.

Two pointers i and j are initialized to 0 and 1, respectively. The pointer i will keep track of the last non-duplicate element in the array, and pointer j will be used to traverse the array.

The loop runs from index 1 (j=1) to the end of the array (j < arr.length).

Inside the loop, the code checks if the element at index i is equal to the element at index j. If they are equal, it means it's a duplicate, and the code continues to the next iteration of the loop.

If the elements at index i and j are not equal, it means the element at index j is not a duplicate. In this case, we increment the i pointer and store the non-duplicate element at the position pointed by i. Essentially, we are replacing the duplicate element with a new unique element.

The loop continues until all elements of the array have been processed.

Finally, the function returns i + 1. Since i represents the index of the last non-duplicate element, i + 1 gives us the length of the array after removing duplicates.

In the main function, a sorted array arr is given as input to the remove_dup function, and the returned value (a) is used to print the array's contents up to index a-1, which represents the non-duplicate elements.*/
