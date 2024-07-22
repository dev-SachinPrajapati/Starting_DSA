package SortingInDSA;
import java.util.Scanner;
public class Recursive_Bubble_Sort {
		public void rebs(int arr[], int n) {
			if(n == 1) return;
			for(int j=0;j<=n-2;j++) {
				if(arr[j]>arr[j+1]) { //Here was error array out of bound because I was used - instead of +
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			
			rebs(arr,n-1);  //Here same
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursive_Bubble_Sort rc =  new Recursive_Bubble_Sort();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of Array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {  //Here error was to show array out of bound beacuse i use i<=n instead of i<n
			System.out.print("Enter the Array for Sorting: ");
			arr[i] = sc.nextInt();	
		}
		rc.rebs(arr, n);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
	
		}
		System.out.println();
	}

}
