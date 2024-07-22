package StriverArray;

public class ArrayP1 {

	 public static class largest_element{
		 public static int lar_ele(int arr[],int n) {
			 int largest = arr[0];
			 for(int i=0;i<n;i++) {
				 if(arr[i] > largest) {
					 largest = arr[i];
				 }
			 }
			 return largest;
		 }
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,5,4,7,8,9};
		int n = arr.length;
	    System.out.println(largest_element.lar_ele(arr,n));
		
	}

}
