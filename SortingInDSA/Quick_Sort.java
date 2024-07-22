package SortingInDSA;
import java.util.ArrayList;
import java.util.*;
public class Quick_Sort {
	/*This functions is used to the put the smaller element before pivot and greater element after pivot*/
	 public static int partition(List<Integer> arr, int low, int high){
	        int pivot = arr.get(low); //For pivot element  
	        int i = low;  //It will trace and find the how many places are there to store the element which is smaller than the pivot
	        int j = high;

	        while(i<j){
	            while(arr.get(i)<=pivot && i<=high-1){ //IF we get smaller element than we do i++
	                i++;
	            }
	            while(arr.get(j) > pivot && j>=low+1){
	                j--;
	            }
	            if(i<j){
	            	//Swap
	               int temp = arr.get(i);
	               arr.set(i, arr.get(j));
	               arr.set(j, temp);
	            }
	        }
	        //it is used to put the pivot at right where we have one empty place(index)
	        int temp = arr.get(low);
            arr.set(low, arr.get(j));
            arr.set(j, temp);
	        return j;
	    }
	 public static void quickSort(List<Integer> arr, int low,int high ){
	        if(low<high){
	            int pIndex = partition(arr, low, high);  //Here we got the correct position of element
	            quickSort(arr, low, pIndex-1);// This for the element which is smaller than pivot
	            quickSort(arr,pIndex+1, high); // This for the element which is greater than pivot 
	        }
	    }
	 
	 public static List<Integer> quickSort(List<Integer> arr){
		 quickSort(arr,0,arr.size()-1);
		 return arr;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = new ArrayList<>();
		arr = Arrays.asList(new Integer[] {4, 6, 2, 5, 7, 9, 1, 3});
		int n = arr.size();  //Leng
		
		System.out.println("Before Sorting Array: ");
		for(int i=0;i<n;i++) {
			System.out.print(arr.get(i) +" ");
		}
	    System.out.println();
		 arr = Quick_Sort.quickSort(arr); //use for to call the array
		 System.out.println("After sorting array: ");
		 for(int i=0;i<n;i++) {
				System.out.print(arr.get(i) +" ");
			}
		 System.out.println();
	}

}
