package StriverArrayHard;

public class RepeatingandMissingOptimal1 {
	//Optimal 1 (Using Maths)
	public static int[] repeatandmissingOptimal(int arr[]) {
			
	    long n = arr.length; // size of the array
	    
	    // Find Sn and S2n:
		long SN = (n*(n+1))/2;
		long S2N = (n*(n+1)*(2*n+1))/6;
		
		// Calculate S and S2:
		long S = 0;
		long S2 = 0;
		
		for(int i=0;i<n;i++) {
			S += arr[i];
			S2 += (long)arr[i] * (long)arr[i];
		}
		 //S-Sn = X-Y:
		long val1 = S - SN;
		
		// S2-S2n = X^2-Y^2:
		long val2 = S2 - S2N;
		
		//Find X+Y = (X^2-Y^2)/(X-Y):
		val2 = val2 / val1;
		

        //Find X and Y: X = ((X+Y)+(X-Y))/2 and Y = X-(X-Y),
        // Here, X-Y = val1 and X+Y = val2:
		
		long x = (val1 + val2)/2;
		long y = x - val1;
		
		int []ans = {(int)x , (int)y};
		
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,3,6,2,1,1};
		int []ans = repeatandmissingOptimal(arr);
		System.out.println("The repeating and missing numbers are: {" + ans[0] + ", " + ans[1] + "} ");
		
	}

}
