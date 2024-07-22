package RecursionInJava;

public class Lec4 {
	
	public void fun(int i, int arr[], int n) {
		if(i>=n) {
			return;
		}
		else {
			int temp = arr[i];
			arr[i] = arr[n];
			arr[n] = temp;
		}
		
		fun(i+1, arr , n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5};
		Lec4 l4 = new Lec4();
		l4.fun(0,arr, arr.length-1);
		for(int num:arr) {
			System.out.print(num + " ");
		}
	}

}
