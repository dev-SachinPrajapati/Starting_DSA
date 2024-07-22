package StriverArrayHard;

public class RepeatingandMissingOptimal2XOR {
	public static int[] repeatandmissingOptimal(int arr[]) {
		int n = arr.length;
		int xr = 0;
		//Index all Element
		for(int i=0;i<n;i++) {
			xr = xr ^ arr[i]; //XOR all Element and arr till n
			xr = xr ^ (i+1); //XOR from 1 and increase it will value eg pahle 1 hoga then 2 then 3
		}
		
		 //Step 2: Find the differentiating bit number:
		int number = (xr & ~(xr -1));   //Here it will shift from 0 to xr because we know that we all generating 1 0 0 again and again 
		
		 //Step 3: Group the numbers:
		 int zero = 0;
	     int one = 0;
		
	     //For Entire Array
	     for(int i=0;i<n;i++) {
	    	//part of 1 group: After shifting it will check at xr position there should not be zero
	    	 if((arr[i] & number) != 0) {
	    		 one = one ^ arr[i];
	    	 }	
	    	 
	    	 //It will not store value it get XOR and get cancelled
	    	//part of 0 group:
	    	 else {
	    		 zero = zero ^ arr[i];
	    	 }
	     }
	     
	     //For number 1 to n = arr.length; 
	     for(int i=1;i<=n;i++) {
		    	//part of 1 group:
		    	 if((i & number) != 0) {
		    		 one = one ^ i;  //Here don't store and cut if future instead of cut it when you collect
		    	 }
		    	 
		    	//part of 0 group:
		    	 else {
		    		 zero = zero ^ i;
		    	 }
		     }
	     
	  // Last step: Identify the numbers:
	     int count = 0;
	     for(int i=0;i<n;i++) {
	    	 if(arr[i] == zero) count++;
	     }
	     
	     if(count == 2) return new int[] {zero, one};
	     
	     return new int[] {one, zero};
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,3,6,2,1,1};
		int []ans = repeatandmissingOptimal(arr);
		System.out.println("The repeating and missing numbers are: {" + ans[0] + ", " + ans[1] + "} ");
		
	}

}
