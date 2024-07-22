package BinarySearch;


//Also See the Coding Ninjas Studion Problem
public class FindFirstandLastOccurenceBrute {
	
	public static int[] solve(int arr[], int key, int n) {
			int first = -1, last = -1;
			for(int i=0;i<=n-1;i++) {
				if(arr[i] == key) {
					if(first == -1) first = i;
					last = i;
				}
			}
			return new int[] {first, last};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n = 7;
			int key = 13;
			int []arr = {3,4,13,13,13,20,40};
			
			int []result = solve(arr, key, n);
			if (result[0] != -1) {                                        /*This is the beginning of the if statement. It checks whether the first occurrence of the key is not equal to -1. The initial value of first was set to -1, so if it remains -1, that means the key was not found in the array.*/
	            System.out.println("First occurrence: " + result[0]);     /* If the condition inside the if statement is true, it means that the key was found in the array. In this case, the code prints the index of the first occurrence of the key.*/
	            System.out.println("Last occurrence: " + result[1]);      /* This line prints the index of the last occurrence of the key. Since we're inside the same if block, it means the key was found, and both the first and last occurrences will be printed.*/
	        } else {
	            System.out.println("Key not found in the array.");
	        }
	
	}

}
