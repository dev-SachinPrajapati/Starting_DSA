package StriverArrayHard;

import java.util.*;
public class ReversePairOptimal {

    public static void merge(int []arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;   // starting index of left half of arr
        int right = mid + 1;  // starting index of right half of arr

        //storing elements in the temporary array in a sorted manner
        while (left <= mid && right <= high) {
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements on the left half are still left /
        while (left<=mid) {
             temp.add(arr[left]);
             left++;
        }

         //  if elements on the right half are still left //
        while (right <= high) {
             temp.add(arr[right]);
             right++;
        }

         // transfering all elements from temporary to arr 
        for(int i=low;i<=high;i++){
            arr[i] = temp.get(i - low);
        }
}
        public static int countpair(int []arr, int low,int mid, int high) {
           
            int right = mid + 1;
            int count = 0;
            for(int i=low;i<=mid;i++) {
                while (right <= high && arr[i] > 2*arr[right]) {
                    right++;
                }
                count += (right - (mid + 1));
                
            }
            return count;
        }


        public static int mergeSort(int arr[], int low, int high){
              int count = 0;
              if(low >= high) return count;
               int mid = (low + high) / 2 ;
               count += mergeSort(arr,low,mid);  // left half
               count += mergeSort(arr,mid+1, high); // right half
               count += countpair(arr, low, mid, high); //Modification
                merge(arr, low, mid, high);   // merging sorted halves

                return count;
        }
public static int team(int []skill, int n){
   return mergeSort(skill, 0, n - 1);

}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {40,25,19,9,6,2};
		int n = arr.length;
		
		int ans = team(arr,n);
		System.out.println("The Number of pair which is twice of element: " + ans);
	}

}
