package StriverArrayHard;

import java.util.Arrays;

public class MergeSortedArrayOptimal2 {
	 public static void swapIfGreater(long arr1[], long arr2[], int ind1, int ind2){
	        if(arr1[ind1] >arr2[ind2]){
	            long temp = arr1[ind1];
	            arr1[ind1] = arr2[ind2];
	            arr2[ind2] = temp;
	         }
	    }
	public static void merger(long a[], long b[], int n, int m) {
		 // Declare a 3rd array and 2 pointers:
        // Write your code here.
        //The Gap Method

        // len of the imaginary single array:
        int len = n + m;
        int gap = (len /2) + (len % 2);
        while(gap > 0){
             // Place 2 pointers:
            int left = 0;
            int right = left + gap;

            while (right < len) {
            // case 1: left in arr1[]
                //and right in arr2[]:
                if(left < n && right >=n){
                    swapIfGreater(a, b, left, right-n);  //r-n means to give the correspond array
                }

                // case 2: both pointers in arr2[]:
                else if(left >= n){
                    swapIfGreater(b, b, left-n, right-n);
                }
                
                // case 3: both pointers in arr1[]:
                else{
                 swapIfGreater(a, a, left, right);   
                }
                 left++; right++;
        } 

        // break if iteration gap=1 is completed:
        if(gap == 1){ break;}
    
         // Otherwise, calculate new gap:
         gap = (gap /2) + (gap % 2);
        } 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				long []arr1 = {1,4,8,10};
				long []arr2 = {2,3,9};
				int n = 4, m = 3;
				merger(arr1, arr2, n,m);
				System.out.println("The merged arrays are:");
				System.out.print("arr1[] = ");
				for(int i=0;i<n;i++) {
					System.out.print(arr1[i] + " ");
				}
				System.out.print("\narr2[] = ");
				for(int i=0;i<m;i++) {
					System.out.print(arr2[i] + " ");
				}
				
				System.out.println();
				
	}

}
