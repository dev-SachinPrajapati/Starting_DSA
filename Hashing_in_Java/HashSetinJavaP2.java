package Hashing_in_Java;
import java.util.*;

public class HashSetinJavaP2 {
	public static int union(int arr1[], int arr2[]) {  //O(N)
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0;i<arr1.length;i++) {
			set.add(arr1[i]);
		}
		for(int j=0;j<arr2.length;j++) {
			set.add(arr2[j]);
		}
		
		return set.size();
	}
	
	public static int intersection(int arr1[], int arr2[]) {  //O(N)
		
		HashSet<Integer> set = new HashSet<>();
		int count = 0;
		for(int i=0;i<arr1.length;i++) {
			set.add(arr1[i]);
		}
		for(int j=0;j<arr2.length;j++) {
			if(set.contains(arr2[j])) {
				count++;
				set.remove(arr2[j]);
			}
		}
		
		return count;  //Intersection
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {7,3,9};
		int[] arr2 = {6,3,9,2,9,4};
		System.out.println(union(arr1,arr2));
		/*for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i] + " ");
		}
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i] + " ");
		}  */
		
		System.out.println(intersection (arr1,arr2));
	}

}
