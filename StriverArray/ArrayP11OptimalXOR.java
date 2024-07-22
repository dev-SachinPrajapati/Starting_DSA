package StriverArray;

import java.util.ArrayList;

public class ArrayP11OptimalXOR {
	static int missingnum(int arr1[], int n) {
		int XOR1 = 0;
		int XOR2 = 0;
		for(int i=0;i<n-1;i++) {
			XOR2 = XOR2^arr1[i];
			XOR1 = XOR1^(i+1);
			XOR1 = XOR1^n;
		}
		return XOR1^XOR2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1, 2, 4, 5};
		int n = 4;
		int Uni = ArrayP11OptimalXOR.missingnum(arr1, n);
		System.out.println(Uni);		
	}
	// TC:  O(n)
	// SC:  O(1) minimum
}
